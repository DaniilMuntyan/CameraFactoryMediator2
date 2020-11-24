package kpi.trspo.restapp.grpc;

import io.grpc.stub.StreamObserver;
import kpi.trspo.restapp.*;
import kpi.trspo.restapp.converters.ManagerConverter;
import kpi.trspo.restapp.converters.TechnicianConverter;
import kpi.trspo.restapp.dto.emplyee.EmployeeDTO;
import kpi.trspo.restapp.entities.employees.Manager;
import kpi.trspo.restapp.entities.employees.Technician;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;

public final class CreateTechnicianImpl extends CreateTechnicianServiceGrpc.CreateTechnicianServiceImplBase {
    @Override
    public void createTechnician(CreateTechnicianRequest request, StreamObserver<CreateTechnicianResponse> responseObserver) {
        EmployeeDTO employeeDTO = new EmployeeDTO(request.getName(), request.getSurname(), request.getPhone());
        HttpEntity<EmployeeDTO> technician = new HttpEntity<>(employeeDTO);
        ResponseEntity<kpi.trspo.restapp.entities.employees.Technician> technicianResponseEntity = GlobalVariables.restTemplate
                .postForEntity(EndPoints.FINAL_STAGE_TECHNICIANS, technician, Technician.class);

        TechnicianGrpc technicianGrpc = TechnicianConverter.convert(technicianResponseEntity.getBody());
        CreateTechnicianResponse createTechnicianResponse = CreateTechnicianResponse.newBuilder()
                .setTechnician(technicianGrpc)
                .build();

        responseObserver.onNext(createTechnicianResponse);
        responseObserver.onCompleted();
    }
}