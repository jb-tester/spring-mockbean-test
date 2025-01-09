package org.example.springmockbeantest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by Irina on 1/9/2025.</p>
 * *
 */
@Component
public class BooComponent {

    @Value("${my.props.boo}")
    String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

}
