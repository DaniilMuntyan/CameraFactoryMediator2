package kpi.trspo.restapp.grpc;

import io.grpc.stub.StreamObserver;
import kpi.trspo.restapp.*;
import kpi.trspo.restapp.converters.CalibratorConverter;
import kpi.trspo.restapp.converters.ManagerConverter;
import kpi.trspo.restapp.dto.emplyee.EmployeeDTO;
import kpi.trspo.restapp.entities.employees.Manager;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@GRpcService
@Service
public final class CreateManagerImpl extends CreateManagerServiceGrpc.CreateManagerServiceImplBase {
    @Override
    public void createManager(CreateManagerRequest request, StreamObserver<CreateManagerResponse> responseObserver) {
        EmployeeDTO employeeDTO = new EmployeeDTO(request.getName(), request.getSurname(), request.getPhone());
        HttpEntity<EmployeeDTO> manager = new HttpEntity<>(employeeDTO);
        ResponseEntity<Manager> managerResponseEntity = GlobalVariables.restTemplate
                .postForEntity(EndPoints.FINAL_STAGE_MANAGERS, manager, Manager.class);

        ManagerGrpc newManager = ManagerConverter.convert(managerResponseEntity.getBody());
        CreateManagerResponse createManagerResponse = CreateManagerResponse.newBuilder()
                .setManager(newManager)
                .build();

        responseObserver.onNext(createManagerResponse);
        responseObserver.onCompleted();
    }
}
