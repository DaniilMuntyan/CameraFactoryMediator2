package kpi.trspo.restapp.dto.final_stage;

import kpi.trspo.restapp.entities.camera.Camera;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public final class FinalCheckDTO {
    private UUID technicianId;
    private UUID packerId;
    private UUID managerId;
    private Camera camera;
}
