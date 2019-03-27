package com.eval.app.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class ObjectController {

    private ObjectRequestHandler handler = new ObjectRequestHandler();

    /**
     * Get an object by type and ID.
     */
    @GetMapping(value = "/object", produces = "application/json")
    public ResponseEntity getObjectById(
            @RequestParam(value = "type") String type,
            @RequestParam(value = "id") int id) {

        return handler.getObjectById(type, id);
    }


    /**
     * Get all ID's by object type.
     */
    @GetMapping(value = "/ids", produces = "application/json")
    public ResponseEntity getAllIds(
            @RequestParam(value = "type") String type) {
        return handler.getAllIdsByType(type);
    }

}
