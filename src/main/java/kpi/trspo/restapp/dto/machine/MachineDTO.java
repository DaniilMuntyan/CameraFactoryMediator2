package kpi.trspo.restapp.dto.machine;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public final class MachineDTO {
    private UUID id;
    @NonNull
    private String name;
}
