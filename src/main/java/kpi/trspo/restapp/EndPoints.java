package kpi.trspo.restapp;

public final class EndPoints {
    public static final String ASSEMBLING_COLLECTORS = "http://assemble-service:8081/api/service/assembling/collectors";
    public static final String ASSEMBLING_BACK = "http://assemble-service:8081/api/service/assembling/camera_back";
    public static final String ASSEMBLING_BODY = "http://assemble-service:8081/api/service/assembling/camera_body";
    public static final String ASSEMBLING_LENS = "http://assemble-service:8081/api/service/assembling/camera_lens";
    public static final String ASSEMBLING_CAMERA = "http://assemble-service:8081/api/service/assembling/camera";

    public static final String CALIBRATING_CALIBRATORS = "http://calibrate-service:8082/api/calibrating/calibrators";
    public static final String CALIBRATING_CALIBRATE = "http://calibrate-service:8082/api/calibrate";

    public static final String FINAL_STAGE = "http://final-service:8083/api/service/final_stage/check";
    public static final String FINAL_STAGE_TECHNICIANS = "http://final-service:8083/api/service/final_stage/technicians";
    public static final String FINAL_STAGE_MANAGERS = "http://final-service:8083/api/service/final_stage/managers";
    public static final String FINAL_STAGE_PACKERS = "http://final-service:8083/api/service/final_stage/packers";
}
