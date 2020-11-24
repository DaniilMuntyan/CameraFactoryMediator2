package kpi.trspo.restapp.controllers.FinalStage;

import kpi.trspo.restapp.EndPoints;
import kpi.trspo.restapp.GlobalVariables;
import kpi.trspo.restapp.dto.emplyee.EmployeeDTO;
import kpi.trspo.restapp.dto.machine.MachineDTO;
import kpi.trspo.restapp.entities.employees.Technician;
import kpi.trspo.restapp.entities.machines.Packer;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/final_stage/packers")
public final class PackerController {

    @PostMapping
    public ResponseEntity<Packer> create(@RequestBody MachineDTO machineDTO) {
        HttpEntity<MachineDTO> packer = new HttpEntity<>(machineDTO);
        ResponseEntity<Packer> assembleBodyResponseEntity = GlobalVariables.restTemplate
                .postForEntity(EndPoints.FINAL_STAGE_PACKERS, packer, Packer.class);

        return ResponseEntity.ok(assembleBodyResponseEntity.getBody());
    }

    @GetMapping
    public ResponseEntity<List<Packer>> show() {
        ResponseEntity<List<Packer>> responseEntity = GlobalVariables.restTemplate
                .exchange(EndPoints.FINAL_STAGE_PACKERS, HttpMethod.GET, GlobalVariables.headersEntity,
                        new ParameterizedTypeReference<List<Packer>>(){});
        return ResponseEntity.ok(responseEntity.getBody());
    }

}
