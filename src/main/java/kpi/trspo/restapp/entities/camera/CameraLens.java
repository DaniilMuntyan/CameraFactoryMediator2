package kpi.trspo.restapp.entities.camera;

import com.fasterxml.jackson.annotation.JsonIgnore;
import kpi.trspo.restapp.CameraLensGrpc;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public final class CameraLens {
    private UUID id;
    @NonNull
    private Integer focalLength;
    @NonNull
    private LensType lensType;

    public CameraLens(CameraLensGrpc cameraLensGrpc) {
        this.id = UUID.fromString(cameraLensGrpc.getLensId().getValue());
        this.focalLength = cameraLensGrpc.getFocalLength();
        this.lensType = LensType.values()[cameraLensGrpc.getLensType().getNumber()];
    }
}
