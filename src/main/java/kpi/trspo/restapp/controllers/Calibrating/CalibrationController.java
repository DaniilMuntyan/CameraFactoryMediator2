package kpi.trspo.restapp.controllers.Calibrating;


import kpi.trspo.restapp.EndPoints;
import kpi.trspo.restapp.GlobalVariables;
import kpi.trspo.restapp.dto.assembling.AssembleBackDTO;
import kpi.trspo.restapp.dto.calibrating.CalibrateCameraDTO;
import kpi.trspo.restapp.entities.camera.Camera;
import kpi.trspo.restapp.entities.camera.CameraBack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/calibrating/calibrate")
public final class CalibrationController {
    @PostMapping
    public ResponseEntity<Camera> calibrate(@RequestBody CalibrateCameraDTO calibrateCameraDTO) throws Exception {
        HttpEntity<CalibrateCameraDTO> calibrateCameraDTOHttpEntity = new HttpEntity<>(calibrateCameraDTO);
        ResponseEntity<Camera> assembleBackResponseEntity = GlobalVariables.restTemplate
                .postForEntity(EndPoints.CALIBRATING_CALIBRATE, calibrateCameraDTOHttpEntity, Camera.class);
        return ResponseEntity.ok(assembleBackResponseEntity.getBody());
    }
}
