package com.eval.jooq.test;

import com.eval.app.rest.ObjectRequestHandler;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.ResponseEntity;

import static junit.framework.TestCase.assertEquals;

/**
 * Verify rest handlers are working as intended. Response codes match expectations.
 */
public class RequestHandlerTest {

    private final ObjectRequestHandler handler = new ObjectRequestHandler();

    @Test
    public void badRequestTypeTest() {
        ResponseEntity response = handler.getObjectById("foo", 1);
        assertEquals(400, response.getStatusCode().value());
    }

    @Test
    public void getUserByIdTest() {
        ResponseEntity response = handler.getObjectById("user", 1);
        assertEquals(200, response.getStatusCode().value());
    }

    @Test // ID does not exist.
    public void failGetByIdTest() {
        ResponseEntity response = handler.getObjectById("user", -1);
        assertEquals(204, response.getStatusCode().value());
    }

    @Test
    public void getDateByIdTest() {
        ResponseEntity response = handler.getObjectById("date", 1827);
        assertEquals(200, response.getStatusCode().value());
    }

    @Test
    public void getAllCategoryIds() {
        ResponseEntity response = handler.getAllIdsByType("category");
        assertEquals(200, response.getStatusCode().value());
    }

    @Test
    public void getAllIdsBadRequest() {
        ResponseEntity response = handler.getAllIdsByType("bar");
        assertEquals(400, response.getStatusCode().value());
    }

}
