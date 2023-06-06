package com.microsoft.bingads.v13.api.test.entities.campaign.write;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaign;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfSetting;
import com.microsoft.bingads.v13.campaignmanagement.CampaignType;
import com.microsoft.bingads.v13.campaignmanagement.PerformanceMaxSetting;

public class BulkCampaignWriteToRowValuesPerformanceMaxSettingTest extends BulkCampaignTest {
    @Parameterized.Parameter(value = 1)
    public Boolean propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"false", false},
                {"true", true},
                {null, null}
        });
    }

    @Test
    public void testWrite() {
        testWriteProperty("Url Expansion Opt Out", this.datum, this.propertyValue, new BiConsumer<BulkCampaign, Boolean>() {
            @Override
            public void accept(BulkCampaign c, Boolean v) {
                c.getCampaign().setCampaignType(Collections.singletonList(CampaignType.PERFORMANCE_MAX));
                c.getCampaign().setSettings(new ArrayOfSetting());
                PerformanceMaxSetting setting = new PerformanceMaxSetting();
                setting.setFinalUrlExpansionOptOut(v);
                c.getCampaign().getSettings().getSettings().add(setting);
            }
        });
    }
}
