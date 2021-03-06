package com.example.christina.avayadl.RSRPBackendSupport;

import java.util.Map;
import java.util.UUID;

import org.researchsuite.rsrp.Core.RSRPIntermediateResult;

/**
 * Created by jameskizer on 4/19/17.
 */

public class YADLSpotRaw extends RSRPIntermediateResult {
    public static String TYPE = "YADLSpotRaw";

    private Map<String, Object> schemaID;
    private String[] selected;
    private String[] notSelected;
    private String[] excluded;
    private Map<String, String> resultMap;

    public YADLSpotRaw(
            UUID uuid,
            String taskIdentifier,
            UUID taskRunUUID,
            Map<String, Object> schemaID,
            String[] selected,
            String[] notSelected,
            String[] excluded,
            Map<String, String> resultMap
    ) {

        super(TYPE, uuid, taskIdentifier, taskRunUUID);
        this.schemaID = schemaID;
        this.selected = selected;
        this.notSelected = notSelected;
        this.excluded = excluded;
        this.resultMap = resultMap;
    }

    public Map<String, Object> getSchemaID() {
        return schemaID;
    }

    public String[] getSelected() {
        return selected;
    }

    public String[] getNotSelected() {
        return notSelected;
    }

    public String[] getExcluded() {
        return excluded;
    }

    public Map<String, String> getResultMap() {
        return resultMap;
    }
}
