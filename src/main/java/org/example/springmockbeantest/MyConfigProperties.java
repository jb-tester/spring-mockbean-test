package org.example.springmockbeantest;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("my.props")
public class MyConfigProperties {
    String boo;
    String foo;
    String bar;

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }

    public String getBoo() {
        return boo;
    }

    public void setBoo(String boo) {
        this.boo = boo;
    }
}
