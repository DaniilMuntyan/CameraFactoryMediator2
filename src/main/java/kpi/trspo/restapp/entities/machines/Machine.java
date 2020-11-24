package kpi.trspo.restapp.entities.machines;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Machine {
    private UUID id;

    @NonNull
    private String name;
}
