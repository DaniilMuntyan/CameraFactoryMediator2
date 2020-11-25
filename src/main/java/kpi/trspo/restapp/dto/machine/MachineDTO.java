package kpi.trspo.restapp.dto.machine;

import lombok.*;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public final class MachineDTO {
    private UUID id;
    @NonNull
    private String name;
}
