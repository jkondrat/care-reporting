package org.motechproject.care.reporting.domain.dimension;

import org.joda.time.DateTime;
import org.junit.Test;
import org.motechproject.care.reporting.builder.MotherCaseBuilder;
import org.motechproject.care.reporting.utils.TestUtils;

import java.util.Date;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

public class MotherCaseTest {
    @Test
    public void shouldUpdateUpdatableFields() throws Exception {
        Date jan01 = DateTime.parse("2012-01-01").toDate();
        Date dec01 = DateTime.parse("2012-12-01").toDate();
        MotherCase oldMother = new MotherCaseBuilder().caseId("01").caseName("durga").dateModified(jan01).alive(false).build();
        MotherCase updatedMother = new MotherCaseBuilder().caseId("01").caseName("devi").dateModified(dec01).alive(true).build();

        oldMother.updateToLatest(updatedMother);

        assertEquals("devi", oldMother.getCaseName());
        assertEquals(dec01, oldMother.getDateModified());
        assertTrue(oldMother.getMotherAlive());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenCaseIdMismatch() {
        new MotherCaseBuilder().caseId("01").build().updateToLatest(new MotherCaseBuilder().caseId("02").build());
    }

    @Test
    public void shouldNotUpdateIfDateModifiedOlderThanPresent() throws Exception {
        Date jan01 = DateTime.parse("2012-01-01").toDate();
        Date dec01 = DateTime.parse("2012-12-01").toDate();
        MotherCase oldMother = new MotherCaseBuilder().caseId("01").caseName("durga").dateModified(dec01).alive(false).build();
        MotherCase updatedMother = new MotherCaseBuilder().caseId("01").caseName("devi").dateModified(jan01).alive(true).build();

        oldMother.updateToLatest(updatedMother);

        assertEquals("durga", oldMother.getCaseName());
    }

    @Test
    public void shouldUpdateTheLastModifiedTimeToCurrentTime(){
        MotherCase motherCase = new MotherCaseBuilder().caseId("01").build();

        motherCase.updateToLatest(new MotherCaseBuilder().caseId("01").build());

        TestUtils.assertDateIgnoringSeconds(new Date(), motherCase.getLastModifiedTime());
    }

    @Test
    public void shouldNotUpdateTheCreationTime(){
        MotherCase motherCase = new MotherCaseBuilder().caseId("01").build();

        motherCase.updateToLatest(new MotherCaseBuilder().caseId("01").creationTime(null).build());

        assertNotNull(motherCase.getCreationTime());
    }
}
