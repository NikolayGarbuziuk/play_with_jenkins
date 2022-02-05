package com.garbuziuk.tests.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTests {

//        System.getProperty("key");
//        System.setProperty("key", "value");

    @Test
    void someTest1() {
        String someValue = System.getProperty("someKey");
        System.out.println(someValue); //null
    }

    @Test
    void someTest2() {
        System.setProperty("someKey", "Red Value");
        String someValue = System.getProperty("someKey");
        System.out.println(someValue);
    }

    @Test
    void someTest3() {
        String someValue = System.getProperty("someKey", "Blue Value");
        System.out.println(someValue);
    }

    @Test
    void someTest4() {
        Boolean someValue = Boolean.parseBoolean(
                System.getProperty("someKey", "Blue Value"));
        System.out.println(someValue);
    }

    @Test
    @Tag("properties")
    void someTest5() {
        String browser = System.getProperty("browser");
        System.out.println(browser);
    }
}
