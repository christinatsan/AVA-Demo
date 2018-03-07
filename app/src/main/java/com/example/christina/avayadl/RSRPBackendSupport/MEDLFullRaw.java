package com.example.christina.avayadl.RSRPBackendSupport;

import java.util.Map;
import java.util.UUID;

import org.researchsuite.rsrp.Core.RSRPIntermediateResult;

/**
 * Created by Christina on 2/6/2018.
 */

public class MEDLFullRaw extends RSRPIntermediateResult {

    public static String TYPE = "MEDLFullRaw";

    private Map<String, String> resultMap;
    private Map<String, Object> schemaID;

    public MEDLFullRaw(
            UUID uuid,
            String taskIdentifier,
            UUID taskRunUUID,
            Map<String, Object> schemaID,
            Map<String, String> resultMap) {

        super(TYPE, uuid, taskIdentifier, taskRunUUID);
        this.schemaID = schemaID;
        this.resultMap = resultMap;
    }

    public Map<String, String> getResultMap() {
        return resultMap;
    }

    public Map<String, Object> getSchemaID() {
        return schemaID;
    }
}
