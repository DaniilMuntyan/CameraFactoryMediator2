package kpi.trspo.restapp.entities.machines;

import kpi.trspo.restapp.CalibratorGrpc;
import kpi.trspo.restapp.MyUuid;
import kpi.trspo.restapp.PackerGrpc;
import kpi.trspo.restapp.entities.camera.Camera;
import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public final class Packer {
    private UUID id;
    @NonNull
    private String name;

    public Packer(PackerGrpc packerGrpc) {
        this.id = UUID.fromString(packerGrpc.getPackerId().getValue());
        this.name = packerGrpc.getName();
    }
}
