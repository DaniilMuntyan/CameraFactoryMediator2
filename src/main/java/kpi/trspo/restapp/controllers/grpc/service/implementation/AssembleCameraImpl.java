package kpi.trspo.restapp.controllers.grpc.service.implementation;

import io.grpc.stub.StreamObserver;
import kpi.trspo.restapp.*;
import kpi.trspo.restapp.converters.CameraConverter;
import kpi.trspo.restapp.dto.assembling.AssembleCameraDTO;
import kpi.trspo.restapp.entities.camera.Camera;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@GRpcService
@Service
public final class AssembleCameraImpl extends AssembleCameraServiceGrpc.AssembleCameraServiceImplBase {
    @Override
    public void assembleCamera(AssembleCameraRequest request, StreamObserver<AssembleCameraResponse> responseObserver) {
        AssembleCameraDTO assembleCameraDTO = new AssembleCameraDTO(UUID.fromString(request.getCollectorId().getValue()),
                UUID.fromString(request.getBackId().getValue()), UUID.fromString(request.getBodyId().getValue()),
                UUID.fromString(request.getLensId().getValue()));
        HttpEntity<AssembleCameraDTO> assembleCamera = new HttpEntity<>(assembleCameraDTO);
        ResponseEntity<Camera> assembleCameraResponseEntity = GlobalVariables.restTemplate
                .postForEntity(EndPoints.ASSEMBLING_CAMERA, assembleCamera, Camera.class);

        Camera camera = assembleCameraResponseEntity.getBody();
        CameraGrpc cameraGrpc = CameraConverter.convert(camera);
        AssembleCameraResponse assembleCameraResponse = AssembleCameraResponse.newBuilder()
                .setCamera(cameraGrpc)
                .build();

        responseObserver.onNext(assembleCameraResponse);
        responseObserver.onCompleted();
    }
}
