package de.auinger.training.maven_basics;

import org.apache.commons.lang3.StringUtils;

public class App {

    public static void main(String[] args) {
        String horizontalLine = StringUtils.leftPad("", 80, "-");

        System.out.println(horizontalLine);
        System.out.println("Hello World!");
        System.out.println(horizontalLine);

        System.out.println(new SomeService().foo());
    }

}
