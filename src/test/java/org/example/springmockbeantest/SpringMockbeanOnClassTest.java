package org.example.springmockbeantest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@SpringBootTest
@MockBean(classes = {BarService.class, FooService.class, MyConfigProperties.class, BooComponent.class})
@ActiveProfiles("test")
@TestInstance(PER_CLASS)
class SpringMockbeanOnClassTest {

    @Autowired
    private BooComponent boo;

    @Autowired
    FooService foo;
    @Autowired
    BarService bar;
    @Autowired
    BuzzComponent buzz;

    @Autowired
    private MyConfigProperties appProps;


    @Test
    void testBoo() {
        assertThat(boo.getId()).isNull();
    }

    @Test
    void testFoo() {
        assertThat(foo).isNotNull();
    }

    @Test
    void testBar() {
        assertThat(bar).isNotNull();
    }

    @Test
    void testBuzz() {
        assertThat(buzz.buzz()).isEqualTo(" ");
    }
    @Test
    void testProps() {
        assertThat(appProps).isNotNull();
        assertThat(appProps.getFoo()).isNull();
        assertThat(appProps.getBar()).isNull();
    }
}
