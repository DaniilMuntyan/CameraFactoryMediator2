package kpi.trspo.restapp.converters;

import kpi.trspo.restapp.CameraBackGrpc;
import kpi.trspo.restapp.CameraBodyGrpc;
import kpi.trspo.restapp.Dimensions;
import kpi.trspo.restapp.MyUuid;
import kpi.trspo.restapp.entities.camera.CameraBack;
import kpi.trspo.restapp.entities.camera.CameraBody;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public final class CameraBodyConverter {
    public static CameraBody convert(CameraBodyGrpc cameraBodyGrpc) {
        return new CameraBody(cameraBodyGrpc);
    }

    public static CameraBodyGrpc convert(CameraBody cameraBody) {
        MyUuid id = MyUuid.newBuilder().setValue(cameraBody.getId().toString()).build();
        kpi.trspo.restapp.entities.camera.Dimensions dimensions = cameraBody.getDimensions();
        return CameraBodyGrpc
                .newBuilder()
                .setBodyId(id)
                .setDimensions(Dimensions.newBuilder()
                        .setLength(dimensions.getLength())
                        .setDepth(dimensions.getDepth())
                        .setWidth(dimensions.getWidth()))
                .setColor(cameraBody.getColor())
                .build();
    }
}
