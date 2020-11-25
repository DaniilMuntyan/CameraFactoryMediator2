package kpi.trspo.restapp.controllers.grpc.create.implementation;

import io.grpc.stub.StreamObserver;
import kpi.trspo.restapp.*;
import kpi.trspo.restapp.converters.PackerConverter;
import kpi.trspo.restapp.dto.machine.MachineDTO;
import kpi.trspo.restapp.entities.machines.Packer;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@GRpcService
@Service
public final class CreatePackerImpl extends CreatePackersServiceGrpc.CreatePackersServiceImplBase {
    @Override
    public void createPackers(CreatePackerRequest request, StreamObserver<CreatePackerResponse> responseObserver) {
        MachineDTO machineDTO = new MachineDTO(request.getName());
        HttpEntity<MachineDTO> packer = new HttpEntity<>(machineDTO);
        ResponseEntity<Packer> packerResponseEntity = GlobalVariables.restTemplate
                .postForEntity(EndPoints.FINAL_STAGE_PACKERS, packer, Packer.class);

        PackerGrpc packerGrpc = PackerConverter.convert(packerResponseEntity.getBody());
        CreatePackerResponse createPackerResponse = CreatePackerResponse.newBuilder()
                .setPacker(packerGrpc)
                .build();

        responseObserver.onNext(createPackerResponse);
        responseObserver.onCompleted();
    }
}
