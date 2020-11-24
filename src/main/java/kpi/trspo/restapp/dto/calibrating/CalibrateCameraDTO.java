package kpi.trspo.restapp.dto.calibrating;

import kpi.trspo.restapp.entities.camera.Camera;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public final class CalibrateCameraDTO {
    private UUID calibratorId;
    private Camera camera;
}
