package org.motechproject.care.reporting.utils;

import org.junit.Test;
import org.motechproject.care.reporting.domain.annotations.ExternalPrimaryKey;

import java.lang.reflect.Field;

import static junit.framework.Assert.assertEquals;

public class AnnotationUtilsTest {
    @Test
    public void shouldGetExternalPrimaryKeyValue(){
        assertEquals("value", (String) AnnotationUtils.getExternalPrimaryKeyValue(new TestClass()));
    }

    @Test
    public void shouldGetExternalPrimayKeyField() throws NoSuchFieldException {
        Field expectedField = new TestClass().getClass().getDeclaredField("field");

        assertEquals(expectedField, AnnotationUtils.getExternalPrimaryKeyField(TestClass.class));
    }

    private class TestClass {
        @ExternalPrimaryKey
        private String field = "value";
    }
}
