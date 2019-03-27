package com.eval.jooq.test;

import com.eval.app.rest.PromoRequestHandler;
import org.junit.Test;
import org.springframework.http.ResponseEntity;

import static junit.framework.TestCase.assertEquals;

public class PromotionHandlerTests {

    private PromoRequestHandler handler = new PromoRequestHandler();

    @Test
    public void testSimpleRequest() {
        ResponseEntity response = handler.getBasicPromotionHandler("2008-01-24", null, null);
        assertEquals(200, response.getStatusCode().value());
    }

    @Test
    public void testBadDateRequest() {
        ResponseEntity response = handler.getBasicPromotionHandler("2008-0", null, null);
        assertEquals(400, response.getStatusCode().value());
    }

    @Test
    public void testDateAndCategoryRequest() {
        ResponseEntity response = handler.getBasicPromotionHandler("2008-01-24", "8", null);
        assertEquals(200, response.getStatusCode().value());
    }

    @Test
    public void testDateCategoryAndCityRequest() {
        ResponseEntity response = handler.getBasicPromotionHandler("2008-01-24", "8", "Chicago");
        assertEquals(200, response.getStatusCode().value());
    }
}
