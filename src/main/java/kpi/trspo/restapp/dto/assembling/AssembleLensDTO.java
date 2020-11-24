package kpi.trspo.restapp.dto.assembling;

import kpi.trspo.restapp.entities.camera.LensType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public final class AssembleLensDTO {
    private UUID collectorId;
    private Integer focalLength;
    private LensType lensType;
}
