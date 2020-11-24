package kpi.trspo.restapp.grpc;

import io.grpc.stub.StreamObserver;
import kpi.trspo.restapp.*;
import kpi.trspo.restapp.converters.CameraBodyConverter;
import kpi.trspo.restapp.converters.CameraLensConverter;
import kpi.trspo.restapp.dto.assembling.AssembleLensDTO;
import kpi.trspo.restapp.entities.camera.CameraBody;
import kpi.trspo.restapp.entities.camera.CameraLens;
import kpi.trspo.restapp.entities.camera.LensType;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

public final class AssembleCameraLensImpl extends AssembleLensServiceGrpc.AssembleLensServiceImplBase {
    @Override
    public void assembleBack(AssembleLensRequest request, StreamObserver<AssembleLensResponse> responseObserver) {
        AssembleLensDTO assembleLensDTO = new AssembleLensDTO(UUID.fromString(request.getCollectorId().getValue()),
                request.getFocalLength(), LensType.valueOf(request.getLensType().name()));
        HttpEntity<AssembleLensDTO> assembleLens = new HttpEntity<>(assembleLensDTO);
        ResponseEntity<CameraLens> assembleLensResponseEntity = GlobalVariables.restTemplate
                .postForEntity(EndPoints.ASSEMBLING_LENS, assembleLens, CameraLens.class);

        CameraLens cameraLens = assembleLensResponseEntity.getBody();
        CameraLensGrpc cameraLensGrpc = CameraLensConverter.convert(cameraLens);
        AssembleLensResponse assembleLensResponse = AssembleLensResponse.newBuilder()
                .setCameraLens(cameraLensGrpc)
                .build();

        responseObserver.onNext(assembleLensResponse);
        responseObserver.onCompleted();
    }
}
