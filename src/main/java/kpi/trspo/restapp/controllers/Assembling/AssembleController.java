package kpi.trspo.restapp.controllers.Assembling;

import kpi.trspo.restapp.EndPoints;
import kpi.trspo.restapp.GlobalVariables;
import kpi.trspo.restapp.dto.assembling.AssembleBackDTO;
import kpi.trspo.restapp.dto.assembling.AssembleBodyDTO;
import kpi.trspo.restapp.dto.assembling.AssembleCameraDTO;
import kpi.trspo.restapp.dto.assembling.AssembleLensDTO;
import kpi.trspo.restapp.entities.camera.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/assembling/")
public final class AssembleController {

    @PostMapping("camera_back")
    public ResponseEntity<CameraBack> assemble(@RequestBody AssembleBackDTO assembleBackDTO) throws Exception {
        HttpEntity<AssembleBackDTO> assembleBack = new HttpEntity<>(assembleBackDTO);
        ResponseEntity<CameraBack> assembleBackResponseEntity = GlobalVariables.restTemplate
                .postForEntity(EndPoints.ASSEMBLING_BACK, assembleBack, CameraBack.class);

        return ResponseEntity.ok(assembleBackResponseEntity.getBody());
    }

    @GetMapping("camera_back")
    public ResponseEntity<List<CameraBack>> showBack() {
        ResponseEntity<List<CameraBack>> responseEntity = GlobalVariables.restTemplate
                .exchange(EndPoints.ASSEMBLING_BACK, HttpMethod.GET, GlobalVariables.headersEntity,
                        new ParameterizedTypeReference<List<CameraBack>>(){});

        return ResponseEntity.ok(responseEntity.getBody());
    }

    @PostMapping("camera_body")
    public ResponseEntity<CameraBody> assemble(@RequestBody AssembleBodyDTO assembleBodyDTO) throws Exception {
        HttpEntity<AssembleBodyDTO> assembleBody = new HttpEntity<>(assembleBodyDTO);
        ResponseEntity<CameraBody> assembleBodyResponseEntity = GlobalVariables.restTemplate
                .postForEntity(EndPoints.ASSEMBLING_BODY, assembleBody, CameraBody.class);

        return ResponseEntity.ok(assembleBodyResponseEntity.getBody());
    }

    @GetMapping("camera_body")
    public ResponseEntity<List<CameraBody>> showBody() {
        ResponseEntity<List<CameraBody>> responseEntity = GlobalVariables.restTemplate
                .exchange(EndPoints.ASSEMBLING_BODY, HttpMethod.GET, GlobalVariables.headersEntity,
                        new ParameterizedTypeReference<List<CameraBody>>(){});

        return ResponseEntity.ok(responseEntity.getBody());
    }

    @PostMapping("camera_lens")
    public ResponseEntity<CameraLens> assemble(@RequestBody AssembleLensDTO assembleLensDTO) throws Exception {
        HttpEntity<AssembleLensDTO> assembleLens = new HttpEntity<>(assembleLensDTO);
        ResponseEntity<CameraLens> assembleLensResponseEntity = GlobalVariables.restTemplate
                .postForEntity(EndPoints.ASSEMBLING_LENS, assembleLens, CameraLens.class);

        return ResponseEntity.ok(assembleLensResponseEntity.getBody());
    }

    @GetMapping("camera_lens")
    public ResponseEntity<List<CameraLens>> showLens() {
        ResponseEntity<List<CameraLens>> responseEntity = GlobalVariables.restTemplate
                .exchange(EndPoints.ASSEMBLING_LENS, HttpMethod.GET, GlobalVariables.headersEntity,
                        new ParameterizedTypeReference<List<CameraLens>>(){});

        return ResponseEntity.ok(responseEntity.getBody());
    }

    @PostMapping("camera")
    public ResponseEntity<Camera> assemble(@RequestBody AssembleCameraDTO assembleCameraDTO) throws Exception {
        HttpEntity<AssembleCameraDTO> assembleCamera = new HttpEntity<>(assembleCameraDTO);
        ResponseEntity<Camera> assembleCameraResponseEntity = GlobalVariables.restTemplate
                .postForEntity(EndPoints.ASSEMBLING_CAMERA, assembleCamera, Camera.class);

        return ResponseEntity.ok(assembleCameraResponseEntity.getBody());
    }

    @GetMapping("camera")
    public ResponseEntity<List<Camera>> showCamera() {
        ResponseEntity<List<Camera>> responseEntity = GlobalVariables.restTemplate
                .exchange(EndPoints.ASSEMBLING_CAMERA, HttpMethod.GET, GlobalVariables.headersEntity,
                        new ParameterizedTypeReference<List<Camera>>(){});

        return ResponseEntity.ok(responseEntity.getBody());
    }
}
