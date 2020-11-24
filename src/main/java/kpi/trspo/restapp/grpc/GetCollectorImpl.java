package kpi.trspo.restapp.grpc;

import io.grpc.stub.StreamObserver;
import kpi.trspo.restapp.*;
import kpi.trspo.restapp.converters.CollectorConverter;
import kpi.trspo.restapp.converters.ManagerConverter;
import kpi.trspo.restapp.entities.employees.Collector;
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
public final class GetCollectorImpl extends GetCollectorsServiceGrpc.GetCollectorsServiceImplBase {
    @Override
    public void getAllCollectors(GetAllCollectorsRequest request, StreamObserver<GetAllCollectorsResponse> responseObserver) {
        ResponseEntity<List<Collector>> responseEntity = GlobalVariables.restTemplate
                .exchange(EndPoints.ASSEMBLING_COLLECTORS, HttpMethod.GET, GlobalVariables.headersEntity,
                        new ParameterizedTypeReference<List<Collector>>(){});

        List<Collector> collectors = responseEntity.getBody();
        List<CollectorGrpc> collectorGrpcs = collectors.stream()
                .map(CollectorConverter::convert)
                .collect(Collectors.toList());

        GetAllCollectorsResponse getCollectorsResponse = GetAllCollectorsResponse.newBuilder()
                .addAllCollectors(collectorGrpcs)
                .build();

        responseObserver.onNext(getCollectorsResponse);
        responseObserver.onCompleted();
    }
}
