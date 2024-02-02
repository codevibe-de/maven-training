package de.codevibe.maven_training;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SomeServiceTest {

    @Test
    public void foo() {
        // given
        SomeService someService = new SomeService();
        Assertions.assertEquals("baz", someService.foo());
    }
}
