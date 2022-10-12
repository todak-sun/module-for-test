package io.todak.study.modulefortest.application.using;

import io.todak.study.modulefortest.moduletest.CustomAssertion;
import org.junit.jupiter.api.Test;

class StringEqualsTest {

    @Test
    void test() {
        CustomAssertion.assertEqualsString("Hello", "Hello");
    }

}
