package org.example.springmockbeantest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
@ActiveProfiles("test")
class SpringMockbeanOnFieldsTest {

    @MockBean
    private BooComponent boo;

    @MockBean
    FooService foo;
    @MockBean
    BarService bar;
    @MockBean
    private MyConfigProperties appProps;

    @Autowired
    BuzzComponent buzz;

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
