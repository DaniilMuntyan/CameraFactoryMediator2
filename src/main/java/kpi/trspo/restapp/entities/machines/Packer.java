package kpi.trspo.restapp.entities.machines;

import kpi.trspo.restapp.CalibratorGrpc;
import kpi.trspo.restapp.MyUuid;
import kpi.trspo.restapp.PackerGrpc;
import kpi.trspo.restapp.entities.camera.Camera;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public final class Packer {
    private UUID id;
    private String name;

    public Packer(PackerGrpc packerGrpc) {
        this.id = UUID.fromString(packerGrpc.getPackerId().getValue());
        this.name = packerGrpc.getName();
    }
}
