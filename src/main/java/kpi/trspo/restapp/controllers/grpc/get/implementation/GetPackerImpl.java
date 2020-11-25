package kpi.trspo.restapp.controllers.grpc.get.implementation;

import io.grpc.stub.StreamObserver;
import kpi.trspo.restapp.*;
import kpi.trspo.restapp.converters.PackerConverter;
import kpi.trspo.restapp.entities.machines.Packer;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@GRpcService
@Service
public final class GetPackerImpl extends GetPackersServiceGrpc.GetPackersServiceImplBase {
    @Override
    public void getAllPackers(GetAllPackersRequest request, StreamObserver<GetAllPackersResponse> responseObserver) {
        ResponseEntity<List<Packer>> responseEntity = GlobalVariables.restTemplate
                .exchange(EndPoints.FINAL_STAGE_PACKERS, HttpMethod.GET, GlobalVariables.headersEntity,
                        new ParameterizedTypeReference<List<Packer>>(){});

        List<Packer> packers = responseEntity.getBody();
        List<PackerGrpc> packerGrpcs = packers.stream()
                .map(PackerConverter::convert)
                .collect(Collectors.toList());

        GetAllPackersResponse getAllPackersResponse = GetAllPackersResponse.newBuilder()
                .addAllPackers((packerGrpcs))
                .build();

        responseObserver.onNext(getAllPackersResponse);
        responseObserver.onCompleted();
    }
}
