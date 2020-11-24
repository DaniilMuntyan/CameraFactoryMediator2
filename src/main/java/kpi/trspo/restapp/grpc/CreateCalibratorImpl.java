package kpi.trspo.restapp.grpc;

import io.grpc.stub.StreamObserver;
import kpi.trspo.restapp.*;
import kpi.trspo.restapp.converters.CalibratorConverter;
import kpi.trspo.restapp.dto.calibrating.CalibratorDTO;
import kpi.trspo.restapp.entities.machines.Calibrator;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;

public final class CreateCalibratorImpl extends CreateCalibratorsServiceGrpc.CreateCalibratorsServiceImplBase {
    @Override
    public void createCalibrator(CreateCalibratorRequest request, StreamObserver<CreateCalibratorResponse> responseObserver) {
        CalibratorDTO calibratorDTO = new CalibratorDTO(request.getName());
        HttpEntity<CalibratorDTO> calibrator = new HttpEntity<>(calibratorDTO);
        ResponseEntity<Calibrator> calibratorResponseEntity = GlobalVariables.restTemplate
                .postForEntity(EndPoints.CALIBRATING_CALIBRATORS, calibrator, Calibrator.class);

        CalibratorGrpc newCalibrator = CalibratorConverter.convert(calibratorResponseEntity.getBody());
        CreateCalibratorResponse createCalibratorResponse = CreateCalibratorResponse
                .newBuilder()
                .setCalibrator(newCalibrator)
                .build();

        responseObserver.onNext(createCalibratorResponse);
        responseObserver.onCompleted();
    }
}
