package org.apache.commons.lang3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//
public class StringUtilsTest {

    @Test
    public void testIsEmpty() {
        assertTrue(StringUtils.isEmpty(""));
        assertFalse(StringUtils.isEmpty("abc"));
    }

    @Test
    public void testReverse() {
        assertEquals("cba", StringUtils.reverse("abc"));
        assertNull(StringUtils.reverse(null));
    }

    @Test
    public void testAbbreviateWithNegativeWidth() {
        // 期望抛出 IllegalArgumentException，但实际返回空字符串（缺陷）
        try {
            StringUtils.abbreviate("Hello", -3);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 预期行为（原逻辑）
        }
    }
}