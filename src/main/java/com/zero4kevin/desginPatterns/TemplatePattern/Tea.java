package com.zero4kevin.desginPatterns.TemplatePattern;

/**
 * Created by kevin on 7/9/17.
 */
public class Tea extends CaffeineBeverage {
    void addCondiments() {
        System.out.println("Adding Lemon");
    }

    void brew() {
        System.out.println("Steeping the tea");
    }
}
