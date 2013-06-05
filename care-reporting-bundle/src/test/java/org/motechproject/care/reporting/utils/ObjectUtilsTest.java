package org.motechproject.care.reporting.utils;


import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ObjectUtilsTest {
    @Test
    public void testSet() throws Exception {

        TestData testData = new TestData();
        ObjectUtils.set(testData, "anInt", "21");
        ObjectUtils.set(testData, "aString", "hello");
        ObjectUtils.set(testData, "aBoolean", "yEs"); // Boolean accepts true, yes, y, on, 1 (case insensitive).
        ObjectUtils.set(testData, "aDateFormat1", "05/22/2013");
        ObjectUtils.set(testData, "aDateFormat2", "2012-07-21T12:02:59.923+05:30");
        ObjectUtils.set(testData, "aDateFormat3", "2012-07-15");

        assertEquals(21, testData.getAnInt());
        assertEquals("hello", testData.getaString());
        assertEquals(true, testData.isaBoolean());
        assertEquals((new DateTime(2013, 5, 22, 0, 0, 0)).toDate(), testData.getaDateFormat1());
        assertEquals(new DateTime(2012, 7, 21, 12, 2, 59, 923, DateTimeZone.forOffsetHoursMinutes(5, 30)).toDate(), testData.aDateFormat2);
        assertEquals((new DateTime(2012, 7, 15, 0, 0, 0)).toDate(), testData.getaDateFormat3());
    }

    @Test
    public void testGet() throws Exception {
        TestData testData = new TestData();
        testData.setAnInt(25);
        testData.setaString("world");
        testData.setaBoolean(true);
        java.util.Date aDate = (new DateTime(2013, 5, 22, 0, 0, 0)).toDate();
        testData.setaDateFormat1(aDate);

        assertEquals(25, ObjectUtils.get(testData, "anInt"));
        assertEquals("world", ObjectUtils.get(testData, "aString"));
        assertEquals(aDate, ObjectUtils.get(testData, "aDateFormat1"));
        assertEquals(true, ObjectUtils.get(testData, "aBoolean"));
    }
}
