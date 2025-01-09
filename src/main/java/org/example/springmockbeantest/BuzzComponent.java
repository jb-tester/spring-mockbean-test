package org.example.springmockbeantest;

import org.springframework.stereotype.Component;

@Component
public class BuzzComponent {

    private final FooService fooComponent;
    private final BarService barComponent;

    public BuzzComponent(FooService fooComponent, BarService barComponent) {
        this.fooComponent = fooComponent;
        this.barComponent = barComponent;
    }

    public String buzz(){
        String foo = "";
        String bar = "";
        if(!(fooComponent == null || fooComponent.getId() == null)){foo = fooComponent.getId();}
        if(!(barComponent == null || barComponent.getId() == null)){bar = barComponent.getId();}

        return foo + " " + bar;
    }
}
