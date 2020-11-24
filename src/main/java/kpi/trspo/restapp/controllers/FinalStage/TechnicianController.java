package kpi.trspo.restapp.controllers.FinalStage;

import kpi.trspo.restapp.EndPoints;
import kpi.trspo.restapp.GlobalVariables;
import kpi.trspo.restapp.dto.emplyee.EmployeeDTO;
import kpi.trspo.restapp.entities.employees.Manager;
import kpi.trspo.restapp.entities.employees.Technician;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/final_stage/technicians")
public final class TechnicianController {

    @PostMapping
    public ResponseEntity<Technician> create(@RequestBody EmployeeDTO employeeDTO) {
        HttpEntity<EmployeeDTO> technician = new HttpEntity<>(employeeDTO);
        ResponseEntity<Technician> assembleBodyResponseEntity = GlobalVariables.restTemplate
                .postForEntity(EndPoints.FINAL_STAGE_TECHNICIANS, technician, Technician.class);

        return ResponseEntity.ok(assembleBodyResponseEntity.getBody());
    }

    @GetMapping
    public ResponseEntity<List<Technician>> show() {
        ResponseEntity<List<Technician>> responseEntity = GlobalVariables.restTemplate
                .exchange(EndPoints.FINAL_STAGE_TECHNICIANS, HttpMethod.GET, GlobalVariables.headersEntity,
                        new ParameterizedTypeReference<List<Technician>>(){});
        return ResponseEntity.ok(responseEntity.getBody());
    }

}
