package kpi.trspo.restapp.controllers.Assembling;

import kpi.trspo.restapp.EndPoints;
import kpi.trspo.restapp.GlobalVariables;
import kpi.trspo.restapp.dto.assembling.AssembleBackDTO;
import kpi.trspo.restapp.dto.assembling.AssembleBodyDTO;
import kpi.trspo.restapp.dto.emplyee.EmployeeDTO;
import kpi.trspo.restapp.entities.camera.CameraBack;
import kpi.trspo.restapp.entities.camera.CameraBody;
import kpi.trspo.restapp.entities.employees.Collector;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/assembling/collectors")
public class CollectorsController {
    @PostMapping
    public ResponseEntity<Collector> create(@RequestBody EmployeeDTO employeeDTO) {
        HttpEntity<EmployeeDTO> collector = new HttpEntity<>(employeeDTO);
        ResponseEntity<Collector> collectorsResponseEntity = GlobalVariables.restTemplate
                .postForEntity(EndPoints.ASSEMBLING_COLLECTORS, collector, Collector.class);

        return ResponseEntity.ok(collectorsResponseEntity.getBody());
    }

    @GetMapping
    public ResponseEntity<List<Collector>> show() {
        ResponseEntity<List<Collector>> responseEntity = GlobalVariables.restTemplate
                .exchange(EndPoints.ASSEMBLING_COLLECTORS, HttpMethod.GET, GlobalVariables.headersEntity,
                        new ParameterizedTypeReference<List<Collector>>(){});

        return ResponseEntity.ok(responseEntity.getBody());
    }
}
