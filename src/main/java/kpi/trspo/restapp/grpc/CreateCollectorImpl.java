package kpi.trspo.restapp.grpc;

import io.grpc.stub.StreamObserver;
import kpi.trspo.restapp.*;
import kpi.trspo.restapp.converters.CalibratorConverter;
import kpi.trspo.restapp.converters.CollectorConverter;
import kpi.trspo.restapp.dto.calibrating.CalibratorDTO;
import kpi.trspo.restapp.dto.emplyee.EmployeeDTO;
import kpi.trspo.restapp.entities.employees.Collector;
import kpi.trspo.restapp.entities.machines.Calibrator;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@GRpcService
@Service
public final class CreateCollectorImpl extends CreateCollectorsServiceGrpc.CreateCollectorsServiceImplBase {

    @Override
    public void createCollectors(CreateCollectorRequest request, StreamObserver<CreateCollectorResponse> responseObserver) {
        EmployeeDTO employeeDTO = new EmployeeDTO(request.getName(), request.getSurname(), request.getPhone());
        HttpEntity<EmployeeDTO> collector = new HttpEntity<>(employeeDTO);
        ResponseEntity<Collector> collectorsResponseEntity = GlobalVariables.restTemplate
                .postForEntity(EndPoints.ASSEMBLING_COLLECTORS, collector, Collector.class);

        CollectorGrpc collectorGrpc = CollectorConverter.convert(collectorsResponseEntity.getBody());
        CreateCollectorResponse createCollectorResponse = CreateCollectorResponse.newBuilder()
                .setCollector(collectorGrpc)
                .build();

        responseObserver.onNext(createCollectorResponse);
        responseObserver.onCompleted();
    }
}
