package com.microsoft.bingads.v13.api.test.entities.negative_keywords.account_negative_keyword_list_association.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.negative_keywords.account_negative_keyword_list_association.BulkAccountNKListAssociationTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAccountNegativeKeywordListAssociation;

@RunWith(Parameterized.class)
public class BulkAccountNKListAssociationReadFromRowValuesSharedEntityIdTest extends BulkAccountNKListAssociationTest {

    @Parameter(value = 1)
    public Long expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", 123L},
            {"9223372036854775807", 9223372036854775807L}
        });
    }

    @Test
    public void testRead() {
        this.<Long>testReadProperty("Id", this.datum, this.expectedResult, new Function<BulkAccountNegativeKeywordListAssociation, Long>() {
            @Override
            public Long apply(BulkAccountNegativeKeywordListAssociation c) {
                return c.getSharedEntityAssociation().getSharedEntityId();
            }
        });
    }
}
