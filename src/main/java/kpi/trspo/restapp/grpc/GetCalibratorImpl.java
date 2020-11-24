package kpi.trspo.restapp.grpc;

import io.grpc.stub.StreamObserver;
import kpi.trspo.restapp.entities.machines.Calibrator;
import kpi.trspo.restapp.*;
import kpi.trspo.restapp.converters.CalibratorConverter;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@GRpcService
@Service
public final class GetCalibratorImpl extends GetCalibratorsServiceGrpc.GetCalibratorsServiceImplBase {
    @Override
    public void getAllCalibrators(GetCalibratorsRequest request, StreamObserver<GetCalibratorsResponse> responseObserver) {
        ResponseEntity<List<Calibrator>> responseEntity = GlobalVariables.restTemplate
                .exchange(EndPoints.CALIBRATING_CALIBRATORS, HttpMethod.GET, GlobalVariables.headersEntity,
                        new ParameterizedTypeReference<List<Calibrator>>(){});

        List<Calibrator> calibrators = responseEntity.getBody();
        List<CalibratorGrpc> calibratorGrpcs = calibrators.stream()
                .map(CalibratorConverter::convert)
                .collect(Collectors.toList());

        GetCalibratorsResponse getCalibratorsResponse = GetCalibratorsResponse.
                newBuilder().
                addAllCalibrators(calibratorGrpcs).
                build();

        responseObserver.onNext(getCalibratorsResponse);
        responseObserver.onCompleted();
    }

}
