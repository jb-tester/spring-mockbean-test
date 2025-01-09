package org.example.springmockbeantest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by Irina on 1/9/2025.</p>
 * *
 */
@Component
@Profile("dev")
public class BarComponentDev implements BarService {
    @Value("${my.props.bar:bar_dev}")
    String id;

    public String getId() {
        return id;
    }
}
