package kpi.trspo.restapp.controllers.FinalStage;

import kpi.trspo.restapp.EndPoints;
import kpi.trspo.restapp.GlobalVariables;
import kpi.trspo.restapp.dto.final_stage.FinalCheckDTO;
import kpi.trspo.restapp.entities.camera.Camera;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/final_stage")
public final class FinalStageController {

    @PostMapping
    public ResponseEntity<Camera> finalStageMethod(@RequestBody FinalCheckDTO finalCheckDTO) throws Exception {
        HttpEntity<FinalCheckDTO> finalCheck = new HttpEntity<>(finalCheckDTO);
        ResponseEntity<Camera> finalCheckResponseEntity = GlobalVariables.restTemplate
                .postForEntity(EndPoints.FINAL_STAGE, finalCheck, Camera.class);

        return ResponseEntity.ok(finalCheckResponseEntity.getBody());
    }
}
