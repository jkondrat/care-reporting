package org.motechproject.care.reporting.mapper;


import org.motechproject.care.reporting.enums.FormType;

import java.util.HashMap;
import java.util.Map;

public class NamespaceMapper {

    static Map<String, FormType> formMapper = new HashMap<String, FormType>() {{
        String pregnancyPrefix = "http://bihar.commcarehq.org/pregnancy/";
        String toolsPrefix = "http://bihar.commcarehq.org/tools/";
        put(pregnancyPrefix + "new", FormType.New);
        put(pregnancyPrefix + "registration", FormType.Registration);
        put(pregnancyPrefix + "bp", FormType.Bp);
        put(pregnancyPrefix + "ebf", FormType.Ebf);
        put(pregnancyPrefix + "cf", FormType.Cf);
        put(pregnancyPrefix + "pnc", FormType.Pnc);
        put(pregnancyPrefix + "refer", FormType.Refer);
        put(pregnancyPrefix + "death", FormType.Death);
        put(pregnancyPrefix + "del", FormType.Delivery);
        put(pregnancyPrefix + "close", FormType.Close);
        put(pregnancyPrefix + "migrate_out", FormType.Mo);
        put(pregnancyPrefix + "migrate_in", FormType.Mi);
        put(pregnancyPrefix + "mtp_abort", FormType.Abort);
        put(pregnancyPrefix + "update_vaccinations", FormType.Ui);
        put(pregnancyPrefix + "mother_edit", FormType.MotherEdit);
        put(toolsPrefix + "move_beneficiary", FormType.MoveBeneficiary);
    }};

    public static FormType getFormType(String namespace) {
        return formMapper.get(namespace);
    }
}
