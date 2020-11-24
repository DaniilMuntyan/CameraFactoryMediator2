package kpi.trspo.restapp.grpc;

import io.grpc.stub.StreamObserver;
import kpi.trspo.restapp.*;
import kpi.trspo.restapp.converters.CameraBackConverter;
import kpi.trspo.restapp.converters.CameraBodyConverter;
import kpi.trspo.restapp.dto.assembling.AssembleBackDTO;
import kpi.trspo.restapp.dto.assembling.AssembleBodyDTO;
import kpi.trspo.restapp.entities.camera.CameraBack;
import kpi.trspo.restapp.entities.camera.CameraBody;
import kpi.trspo.restapp.entities.camera.Dimensions;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

public final class AssembleCameraBodyImpl extends AssembleBodyServiceGrpc.AssembleBodyServiceImplBase {
    @Override
    public void assembleBack(AssembleBodyRequest request, StreamObserver<AssembleBodyResponse> responseObserver) {
        Dimensions dimensions = new Dimensions(request.getDimensions());
        AssembleBodyDTO assembleBodyDTO = new AssembleBodyDTO(UUID.fromString(request.getCollectorId().getValue()),
                dimensions, request.getColor());
        HttpEntity<AssembleBodyDTO> assembleBody = new HttpEntity<>(assembleBodyDTO);
        ResponseEntity<CameraBody> assembleBodyResponseEntity = GlobalVariables.restTemplate
                .postForEntity(EndPoints.ASSEMBLING_BACK, assembleBody, CameraBody.class);

        CameraBody cameraBody = assembleBodyResponseEntity.getBody();
        CameraBodyGrpc cameraBodyGrpc = CameraBodyConverter.convert(cameraBody);
        AssembleBodyResponse assembleBodyResponse = AssembleBodyResponse.newBuilder()
                .setCameraBody(cameraBodyGrpc)
                .build();

        responseObserver.onNext(assembleBodyResponse);
        responseObserver.onCompleted();
    }
}
