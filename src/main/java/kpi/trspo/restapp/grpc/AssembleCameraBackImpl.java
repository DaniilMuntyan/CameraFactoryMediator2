package kpi.trspo.restapp.grpc;

import io.grpc.stub.StreamObserver;
import kpi.trspo.restapp.*;
import kpi.trspo.restapp.converters.CalibratorConverter;
import kpi.trspo.restapp.converters.CameraBackConverter;
import kpi.trspo.restapp.entities.camera.Dimensions;
import kpi.trspo.restapp.dto.assembling.AssembleBackDTO;
import kpi.trspo.restapp.entities.camera.CameraBack;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@GRpcService
@Service
public final class AssembleCameraBackImpl extends AssembleBackServiceGrpc.AssembleBackServiceImplBase {
    @Override
    public void assembleBack(AssembleBackRequest request, StreamObserver<AssembleBackResponse> responseObserver) {
        Dimensions dimensions = new Dimensions(request.getDimensions());
        AssembleBackDTO assembleBackDTO = new AssembleBackDTO(UUID.fromString(request.getCollectorId().getValue()),
                dimensions, request.getResolution(), request.getColorDepth());
        HttpEntity<AssembleBackDTO> assembleBack = new HttpEntity<>(assembleBackDTO);
        ResponseEntity<CameraBack> assembleBackResponseEntity = GlobalVariables.restTemplate
                .postForEntity(EndPoints.ASSEMBLING_BACK, assembleBack, CameraBack.class);

        CameraBack cameraBack = assembleBackResponseEntity.getBody();
        CameraBackGrpc cameraBackGrpc = CameraBackConverter.convert(cameraBack);
        AssembleBackResponse assembleBackResponse = AssembleBackResponse.newBuilder()
                .setCameraBack(cameraBackGrpc)
                .build();

        responseObserver.onNext(assembleBackResponse);
        responseObserver.onCompleted();
    }
}
