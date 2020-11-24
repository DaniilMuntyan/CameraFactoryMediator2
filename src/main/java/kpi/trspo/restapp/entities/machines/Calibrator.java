package kpi.trspo.restapp.entities.machines;

import kpi.trspo.restapp.CalibratorGrpc;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
public final class Calibrator {
    private UUID id;
    private String name;

    public Calibrator(CalibratorGrpc calibratorGrpc) {
        this.id = UUID.fromString(calibratorGrpc.getCalibratorId().getValue());
        this.name = calibratorGrpc.getName();
    }
}
