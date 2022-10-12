package io.todak.study.modulefortest.moduletest;

import org.junit.jupiter.api.Assertions;

public class CustomAssertion {

    public static void assertEqualsString(String a, String b) {
        Assertions.assertEquals(a, b);
    }


}
