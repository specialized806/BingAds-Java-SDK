package com.microsoft.bingads.v13.api.test.entities.brand_item.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.brand_item.BulkBrandItemTest;
import com.microsoft.bingads.v13.bulk.entities.BulkBrandItem;

@RunWith(Parameterized.class)
public class BulkBrandItemWriteToRowValuesBrandUrlTest extends BulkBrandItemTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
    	return Arrays.asList(new Object[][]{
    		{"https://www.bing.com", "https://www.bing.com"},
            {null, null}
    	});
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Brand Url", this.datum, this.propertyValue, new BiConsumer<BulkBrandItem, String>() {
            @Override
            public void accept(BulkBrandItem c, String v) {
                c.setBrandUrl(v);
            }
        });
    }
}
