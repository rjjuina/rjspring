package com.jjuina.rjspring.ioc;

public class HelloService {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String helleWorld() {
        return "Hello World";
    }
}
