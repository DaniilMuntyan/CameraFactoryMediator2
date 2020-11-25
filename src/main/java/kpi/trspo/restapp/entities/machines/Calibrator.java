package kpi.trspo.restapp.entities.machines;

import kpi.trspo.restapp.CalibratorGrpc;
import lombok.*;

import java.util.UUID;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public final class Calibrator {
    private UUID id;
    @NonNull
    private String name;

    public Calibrator(CalibratorGrpc calibratorGrpc) {
        this.id = UUID.fromString(calibratorGrpc.getCalibratorId().getValue());
        this.name = calibratorGrpc.getName();
    }
}
