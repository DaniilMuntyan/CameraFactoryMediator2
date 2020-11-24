package kpi.trspo.restapp.converters;

import kpi.trspo.restapp.CalibratorGrpc;
import kpi.trspo.restapp.MyUuid;
import kpi.trspo.restapp.PackerGrpc;
import kpi.trspo.restapp.entities.machines.Calibrator;
import kpi.trspo.restapp.entities.machines.Packer;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public final class PackerConverter {
    public static Packer convert(PackerGrpc packerGrpc) {
        return new Packer(packerGrpc);
    }

    public static PackerGrpc convert(Packer packer) {
        MyUuid id = MyUuid.newBuilder().setValue(packer.getId().toString()).build();
        return PackerGrpc
                .newBuilder()
                .setPackerId(id)
                .setName(packer.getName())
                .build();
    }
}
