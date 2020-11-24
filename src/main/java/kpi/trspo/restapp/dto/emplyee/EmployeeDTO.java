package kpi.trspo.restapp.dto.emplyee;

import lombok.*;

import java.util.UUID;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public final class EmployeeDTO {
    private UUID id;
    @NonNull
    private String name;
    @NonNull
    private String surname;
    @NonNull
    private String phone;
}
