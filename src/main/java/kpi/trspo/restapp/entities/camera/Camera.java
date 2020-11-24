package kpi.trspo.restapp.entities.camera;

import kpi.trspo.restapp.CameraGrpc;
import kpi.trspo.restapp.converters.CameraBackConverter;
import kpi.trspo.restapp.converters.CameraBodyConverter;
import kpi.trspo.restapp.converters.CameraLensConverter;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public final class Camera {
    private UUID camera_id;
    private String innerInfo;
    private Boolean isPacked = false;
    private Boolean isFirmware = false;
    private Boolean isWipedClean = false;
    private Boolean isRejected = false;

    @NonNull
    private CameraBack cameraBack;
    @NonNull
    private CameraBody cameraBody;
    @NonNull
    private CameraLens cameraLens;

    public Camera(CameraGrpc cameraGrpc) {
        this.camera_id = UUID.fromString(cameraGrpc.getCameraId().getValue());
        this.innerInfo = cameraGrpc.getInnerInfo();
        this.isPacked = cameraGrpc.getIsPacked();
        this.isFirmware = cameraGrpc.getIsFirmware();
        this.isWipedClean = cameraGrpc.getIsWipedClean();
        this.isRejected = cameraGrpc.getIsRejected();
        this.cameraBack = CameraBackConverter.convert(cameraGrpc.getCameraBack());
        this.cameraBody = CameraBodyConverter.convert(cameraGrpc.getCameraBody());
        this.cameraLens = CameraLensConverter.convert(cameraGrpc.getCameraLens());
    }
}
