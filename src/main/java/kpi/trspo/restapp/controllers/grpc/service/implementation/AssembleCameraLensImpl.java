package kpi.trspo.restapp.controllers.grpc.service.implementation;

import io.grpc.stub.StreamObserver;
import kpi.trspo.restapp.*;
import kpi.trspo.restapp.converters.CameraLensConverter;
import kpi.trspo.restapp.dto.assembling.AssembleLensDTO;
import kpi.trspo.restapp.entities.camera.CameraLens;
import kpi.trspo.restapp.entities.camera.LensType;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@GRpcService
@Service
public final class AssembleCameraLensImpl extends AssembleLensServiceGrpc.AssembleLensServiceImplBase {
    @Override
    public void assembleLens(AssembleLensRequest request, StreamObserver<AssembleLensResponse> responseObserver) {
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
