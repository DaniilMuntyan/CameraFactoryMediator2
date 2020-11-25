package kpi.trspo.restapp.controllers.grpc.get.implementation;

import io.grpc.stub.StreamObserver;
import kpi.trspo.restapp.*;
import kpi.trspo.restapp.converters.TechnicianConverter;
import kpi.trspo.restapp.entities.employees.Technician;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@GRpcService
@Service
public final class GetTechnicianImpl extends GetTechniciansServiceGrpc.GetTechniciansServiceImplBase {
    @Override
    public void getTechnicians(GetTechniciansRequest request, StreamObserver<GetTechniciansResponse> responseObserver) {
        ResponseEntity<List<Technician>> responseEntity = GlobalVariables.restTemplate
                .exchange(EndPoints.FINAL_STAGE_TECHNICIANS, HttpMethod.GET, GlobalVariables.headersEntity,
                        new ParameterizedTypeReference<List<Technician>>(){});

        List<Technician> technicians = responseEntity.getBody();
        List<TechnicianGrpc> technicianGrpcs = technicians.stream()
                .map(TechnicianConverter::convert)
                .collect(Collectors.toList());

        GetTechniciansResponse getTechniciansResponse = GetTechniciansResponse.newBuilder()
                .addAllTechnicians(technicianGrpcs)
                .build();

        responseObserver.onNext(getTechniciansResponse);
        responseObserver.onCompleted();
    }
}
