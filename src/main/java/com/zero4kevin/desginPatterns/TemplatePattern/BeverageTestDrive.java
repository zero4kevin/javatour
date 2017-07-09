package com.zero4kevin.desginPatterns.TemplatePattern;

/**
 * Created by kevin on 7/9/17.
 */
public class BeverageTestDrive {
    public static void main(String[] args){
        CoffeeWithHook coffee=new CoffeeWithHook();
        Tea tea=new Tea();
        tea.prepare();
        coffee.prepare();
    }
}
