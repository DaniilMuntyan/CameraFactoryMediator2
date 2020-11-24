package kpi.trspo.restapp.entities.camera;

import com.fasterxml.jackson.annotation.JsonIgnore;
import kpi.trspo.restapp.CameraBodyGrpc;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public final class CameraBody {
    private UUID id;
    @NonNull
    private Dimensions dimensions;
    @NonNull
    private String color;

    public CameraBody(CameraBodyGrpc cameraBodyGrpc) {
        this.id = UUID.fromString(cameraBodyGrpc.getBodyId().getValue());
        this.dimensions = new Dimensions(cameraBodyGrpc.getDimensions());
        this.color = cameraBodyGrpc.getColor();
    }
}
