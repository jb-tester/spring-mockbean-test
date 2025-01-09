package org.example.springmockbeantest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@SpringBootMockTest(classes = {BarService.class, FooService.class, MyConfigProperties.class, BooComponent.class})
class SpringMockbeanMetaOnClassTest {

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
