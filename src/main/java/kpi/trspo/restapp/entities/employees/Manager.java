package kpi.trspo.restapp.entities.employees;

import kpi.trspo.restapp.ManagerGrpc;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
public final class Manager {

    private UUID id;

    private String name;

    private String surname;

    private String phone;

    public Manager(ManagerGrpc managerGrpc) {
        this.id = UUID.fromString(managerGrpc.getId().getValue());
        this.name = managerGrpc.getName();
        this.surname = managerGrpc.getSurname();
        this.phone = managerGrpc.getPhone();
    }
}
