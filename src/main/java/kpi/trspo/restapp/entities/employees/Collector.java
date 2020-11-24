package kpi.trspo.restapp.entities.employees;

import kpi.trspo.restapp.CollectorGrpc;
import kpi.trspo.restapp.entities.camera.*;
import lombok.*;

import java.util.UUID;


@Data
@NoArgsConstructor
@AllArgsConstructor
public final class Collector {
    private UUID id;

    private String name;

    private String surname;

    private String phone;

    public Collector(CollectorGrpc collectorGrpc) {
        this.id = UUID.fromString(collectorGrpc.getCollectorId().getValue());
        this.name = collectorGrpc.getName();
        this.surname = collectorGrpc.getSurname();
        this.phone = collectorGrpc.getPhone();
    }

}
