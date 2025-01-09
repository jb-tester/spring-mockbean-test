# False multiple autowiring in case of @MockBean meta-annotation
https://youtrack.jetbrains.com/issue/IDEA-362850/Could-not-autowire.-There-is-more-than-one-bean

the case is repeatable for me only for the `@ConfigurationProperties` class that is scanned and explicitly enabled,
i.e. if the application class defines both annotations

```java
@SpringBootApplication
@EnableConfigurationProperties(MyConfigProperties.class)
@ConfigurationPropertiesScan
public class SpringMockbeanTestApplication {}

```
In this case the autowiring error is shown in the test that mocks this bean via meta annotation
(org.example.springmockbeantest.SpringMockbeanMetaOnClassTest), but not in other tests.
