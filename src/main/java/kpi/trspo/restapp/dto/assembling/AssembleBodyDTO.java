package kpi.trspo.restapp.dto.assembling;

import kpi.trspo.restapp.entities.camera.Dimensions;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public final class AssembleBodyDTO {
    private UUID collectorId;
    private Dimensions dimensions;
    private String color;
}
