package kpi.trspo.restapp.controllers.rest.calibrating;

import kpi.trspo.restapp.entities.machines.Calibrator;
import kpi.trspo.restapp.EndPoints;
import kpi.trspo.restapp.GlobalVariables;
import kpi.trspo.restapp.dto.calibrating.CalibratorDTO;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/calibrating/calibrators")
public final class CalibratorController {

    @PostMapping
    public ResponseEntity<Calibrator> create(@RequestBody CalibratorDTO calibratorDTO) {
        HttpEntity<CalibratorDTO> calibrator = new HttpEntity<>(calibratorDTO);
        ResponseEntity<Calibrator> assembleBodyResponseEntity = GlobalVariables.restTemplate
                .postForEntity(EndPoints.CALIBRATING_CALIBRATORS, calibrator, Calibrator.class);
        return ResponseEntity.ok(assembleBodyResponseEntity.getBody());
    }

    @GetMapping
    public ResponseEntity<List<Calibrator>> show() {
        ResponseEntity<List<Calibrator>> responseEntity = GlobalVariables.restTemplate
                .exchange(EndPoints.CALIBRATING_CALIBRATORS, HttpMethod.GET, GlobalVariables.headersEntity,
                        new ParameterizedTypeReference<List<Calibrator>>(){});
        return ResponseEntity.ok(responseEntity.getBody());
    }

}
