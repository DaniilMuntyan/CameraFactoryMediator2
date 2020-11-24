package kpi.trspo.restapp.grpc;

import io.grpc.stub.StreamObserver;
import kpi.trspo.restapp.*;
import kpi.trspo.restapp.converters.CameraConverter;
import kpi.trspo.restapp.dto.final_stage.FinalCheckDTO;
import kpi.trspo.restapp.entities.camera.Camera;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

public final class FinalStageImpl extends FinalStageServiceGrpc.FinalStageServiceImplBase {
    @Override
    public void finalStage(FinalStageRequest request, StreamObserver<FinalStageResponse> responseObserver) {
        FinalCheckDTO finalCheckDTO = new FinalCheckDTO(UUID.fromString(request.getTechnicianId().getValue()),
                UUID.fromString(request.getPackerId().getValue()), UUID.fromString(request.getManagerId().getValue()),
                CameraConverter.convert(request.getCamera()));
        HttpEntity<FinalCheckDTO> finalCheck = new HttpEntity<>(finalCheckDTO);
        ResponseEntity<Camera> finalCheckResponseEntity = GlobalVariables.restTemplate
                .postForEntity(EndPoints.FINAL_STAGE, finalCheck, Camera.class);

        Camera camera = finalCheckResponseEntity.getBody();
        CameraGrpc cameraGrpc = CameraConverter.convert(camera);
        FinalStageResponse finalStageResponse = FinalStageResponse.newBuilder()
                .setCamera(cameraGrpc)
                .build();

        responseObserver.onNext(finalStageResponse);
        responseObserver.onCompleted();
    }
}
