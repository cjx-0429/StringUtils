package org.apache.commons.lang3;

public class ManualTest {
    public static void main(String[] args) {
        testIsEmpty();
        testReverse();
        testAbbreviate();
    }

    private static void testIsEmpty() {
        System.out.println("Test isEmpty:");
        boolean result1 = StringUtils.isEmpty("");
        boolean result2 = StringUtils.isEmpty("abc");
        System.out.println("Test 1: " + (result1 ? "Pass" : "Fail"));
        System.out.println("Test 2: " + (!result2 ? "Pass" : "Fail"));
    }

    private static void testReverse() {
        System.out.println("Test reverse:");
        String result1 = StringUtils.reverse("abc");
        String result2 = StringUtils.reverse(null);
        System.out.println("Test 1: " + ("cba".equals(result1) ? "Pass" : "Fail"));
        System.out.println("Test 2: " + (result2 == null ? "Pass" : "Fail"));
    }

    private static void testAbbreviate() {
        System.out.println("Test abbreviate:");
        String result1 = StringUtils.abbreviate("Hello World", 5); // 正常情况
        String result2 = StringUtils.abbreviate("Test", -3);       // 触发缺陷
        System.out.println("Test 1: " + ("Hello...".equals(result1) ? "Pass" : "Fail"));
        System.out.println("Test 2: " + ("".equals(result2) ? "Pass（缺陷生效）" : "Fail（未触发缺陷）"));
    }
}
