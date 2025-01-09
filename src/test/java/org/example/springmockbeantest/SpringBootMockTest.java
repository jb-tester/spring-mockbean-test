package org.example.springmockbeantest;

import org.junit.jupiter.api.TestInstance;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.core.annotation.AliasFor;
import org.springframework.test.context.ActiveProfiles;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@SpringBootTest
@TestInstance(PER_CLASS)
@ActiveProfiles("test")
@MockBean
public @interface SpringBootMockTest {
    @AliasFor(annotation = MockBean.class, attribute = "classes")
    Class<?>[] classes() ;
}
