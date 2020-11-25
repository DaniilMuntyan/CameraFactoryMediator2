package kpi.trspo.restapp.controllers.grpc.service.implementation;

import io.grpc.stub.StreamObserver;
import kpi.trspo.restapp.*;
import kpi.trspo.restapp.converters.CameraConverter;
import kpi.trspo.restapp.dto.calibrating.CalibrateCameraDTO;
import kpi.trspo.restapp.entities.camera.Camera;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@GRpcService
@Service
public final class CalibrateCameraImpl extends CalibrateCameraServiceGrpc.CalibrateCameraServiceImplBase {
    @Override
    public void calibrate(CalibrateCameraRequest request, StreamObserver<CalibrateCameraResponse> responseObserver) {
        CalibrateCameraDTO calibrateCameraDTO = new
                CalibrateCameraDTO(UUID.fromString(request.getCalibratorId().getValue()),
                CameraConverter.convert(request.getCamera()));
        HttpEntity<CalibrateCameraDTO> calibrateCameraDTOHttpEntity = new HttpEntity<>(calibrateCameraDTO);
        ResponseEntity<Camera> calibrateResponseEntity = GlobalVariables.restTemplate
                .postForEntity(EndPoints.CALIBRATING_CALIBRATE, calibrateCameraDTOHttpEntity, Camera.class);

        Camera camera = calibrateResponseEntity.getBody();
        CameraGrpc cameraGrpc = CameraConverter.convert(camera);
        CalibrateCameraResponse calibrateCameraResponse = CalibrateCameraResponse.newBuilder()
                .setCamera(cameraGrpc)
                .build();

        responseObserver.onNext(calibrateCameraResponse);
        responseObserver.onCompleted();
    }
}
