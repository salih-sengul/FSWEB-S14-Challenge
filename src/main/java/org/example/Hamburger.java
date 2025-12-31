package org.example;

import java.util.Objects;

public class Hamburger {
    private String name;

    private int price;
    private String breadRollType;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Hamburger hamburger = (Hamburger) o;
        return price == hamburger.price && Objects.equals(name, hamburger.name) && Objects.equals(breadRollType, hamburger.breadRollType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, breadRollType);
    }


}
