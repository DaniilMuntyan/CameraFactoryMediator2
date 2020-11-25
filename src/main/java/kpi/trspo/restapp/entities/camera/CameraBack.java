package kpi.trspo.restapp.entities.camera;

import com.fasterxml.jackson.annotation.JsonIgnore;
import kpi.trspo.restapp.CameraBackGrpc;
import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public final class CameraBack {
    private UUID id;
    private Boolean matrixCheck = false;
    @NonNull
    private Dimensions dimensions;
    @NonNull
    private Integer resolution;
    @NonNull
    private Integer colorDepth;

    public CameraBack(CameraBackGrpc cameraBackGrpc) {
        this.id = UUID.fromString(cameraBackGrpc.getBackId().getValue());
        this.matrixCheck = cameraBackGrpc.getMatrixCheck();
        this.dimensions = new Dimensions(cameraBackGrpc.getDimensions());
        this.colorDepth = cameraBackGrpc.getColorDepth();
        this.resolution = cameraBackGrpc.getResolution();
    }
}
