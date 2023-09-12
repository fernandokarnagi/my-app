package com.mycompany.app;

import java.util.Objects;

public class TestObject {
    private String name;

    private String address;

    public String getName() {
        return name;
    }

    public static void test1() {
        System.out.println("test1");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestObject that = (TestObject) o;
        return Objects.equals(name, that.name) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }
}

