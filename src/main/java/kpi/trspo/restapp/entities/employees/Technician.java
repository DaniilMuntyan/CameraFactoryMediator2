package kpi.trspo.restapp.entities.employees;

import kpi.trspo.restapp.TechnicianGrpc;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Random;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public final class Technician{
    private UUID id;

    private String name;

    private String surname;

    private String phone;

    public Technician(TechnicianGrpc technicianGrpc) {
        this.id = UUID.fromString(technicianGrpc.getId().getValue());
        this.name = technicianGrpc.getName();
        this.surname = technicianGrpc.getSurname();
        this.phone = technicianGrpc.getPhone();
    }
}
