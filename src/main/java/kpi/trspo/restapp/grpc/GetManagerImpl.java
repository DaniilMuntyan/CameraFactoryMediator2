package kpi.trspo.restapp.grpc;

import io.grpc.stub.StreamObserver;
import kpi.trspo.restapp.*;
import kpi.trspo.restapp.converters.CalibratorConverter;
import kpi.trspo.restapp.converters.ManagerConverter;
import kpi.trspo.restapp.entities.employees.Manager;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@GRpcService
@Service
public final class GetManagerImpl extends GetManagersServiceGrpc.GetManagersServiceImplBase {
    @Override
    public void getManagers(GetManagersRequest request, StreamObserver<GetManagersResponse> responseObserver) {
        ResponseEntity<List<Manager>> responseEntity = GlobalVariables.restTemplate
                .exchange(EndPoints.FINAL_STAGE_MANAGERS, HttpMethod.GET, GlobalVariables.headersEntity,
                        new ParameterizedTypeReference<List<Manager>>(){});

        List<Manager> managers = responseEntity.getBody();
        List<ManagerGrpc> managerGrpcs = managers.stream()
                .map(ManagerConverter::convert)
                .collect(Collectors.toList());

        GetManagersResponse getManagersResponse = GetManagersResponse.newBuilder()
                .addAllManagers(managerGrpcs)
                .build();

        responseObserver.onNext(getManagersResponse);
        responseObserver.onCompleted();
    }
}
