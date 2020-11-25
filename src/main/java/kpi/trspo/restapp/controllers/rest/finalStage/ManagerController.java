package kpi.trspo.restapp.controllers.rest.finalStage;

import kpi.trspo.restapp.EndPoints;
import kpi.trspo.restapp.GlobalVariables;
import kpi.trspo.restapp.dto.emplyee.EmployeeDTO;
import kpi.trspo.restapp.entities.employees.Manager;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/final_stage/managers")
public final class ManagerController {

    @PostMapping
    public ResponseEntity<Manager> create(@RequestBody EmployeeDTO employeeDTO) {
        HttpEntity<EmployeeDTO> manager = new HttpEntity<>(employeeDTO);
        ResponseEntity<Manager> assembleBodyResponseEntity = GlobalVariables.restTemplate
                .postForEntity(EndPoints.FINAL_STAGE_MANAGERS, manager, Manager.class);

        return ResponseEntity.ok(assembleBodyResponseEntity.getBody());
    }

    @GetMapping
    public ResponseEntity<List<Manager>> show() {
        ResponseEntity<List<Manager>> responseEntity = GlobalVariables.restTemplate
                .exchange(EndPoints.FINAL_STAGE_MANAGERS, HttpMethod.GET, GlobalVariables.headersEntity,
                        new ParameterizedTypeReference<List<Manager>>(){});
        return ResponseEntity.ok(responseEntity.getBody());
    }

}
