package kpi.trspo.restapp.dto.assembling;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public final class AssembleCameraDTO {
    private UUID collectorId;
    private UUID cameraBackId;
    private UUID cameraBodyId;
    private UUID cameraLensId;
}
