package kpi.trspo.restapp.converters;

import io.grpc.stub.StreamObserver;
import kpi.trspo.restapp.*;
import kpi.trspo.restapp.entities.camera.Camera;
import kpi.trspo.restapp.entities.camera.CameraBack;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public final class CameraConverter {
    public static Camera convert(CameraGrpc cameraGrpc) {
        return new Camera(cameraGrpc);
    }

    public static CameraGrpc convert(Camera camera) {
        MyUuid id = MyUuid.newBuilder().setValue(camera.getCamera_id().toString()).build();
        CameraBackGrpc cameraBackGrpc = CameraBackConverter.convert(camera.getCameraBack());
        CameraBodyGrpc cameraBodyGrpc = CameraBodyConverter.convert(camera.getCameraBody());
        CameraLensGrpc cameraLensGrpc = CameraLensConverter.convert(camera.getCameraLens());

        return CameraGrpc
                .newBuilder()
                .setCameraId(id)
                .setInnerInfo((camera.getInnerInfo() != null) ? camera.getInnerInfo() : "")
                .setIsPacked((camera.getIsPacked() != null) ? camera.getIsPacked(): false)
                .setIsFirmware((camera.getIsFirmware() != null) ? camera.getIsFirmware(): false)
                .setIsRejected((camera.getIsRejected() != null) ? camera.getIsRejected(): false)
                .setIsWipedClean((camera.getIsWipedClean() != null) ? camera.getIsWipedClean(): false)
                .setCameraBack(cameraBackGrpc)
                .setCameraBody(cameraBodyGrpc)
                .setCameraLens(cameraLensGrpc)
                .build();
    }
}
