package kpi.trspo.restapp.grpc;

import io.grpc.stub.StreamObserver;
import kpi.trspo.restapp.*;
import kpi.trspo.restapp.converters.CameraBackConverter;
import kpi.trspo.restapp.converters.CameraConverter;
import kpi.trspo.restapp.dto.calibrating.CalibrateCameraDTO;
import kpi.trspo.restapp.entities.camera.Camera;
import kpi.trspo.restapp.entities.camera.CameraBack;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

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
