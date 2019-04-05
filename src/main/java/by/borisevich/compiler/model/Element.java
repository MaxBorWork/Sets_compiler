package by.borisevich.compiler.model;

import java.util.Objects;

//public class Element {
//
//    private final String data;
//
//    public Element(String data) {
//        this.data = data;
//    }
//
//    @Override
//    public String toString() {
//        return data;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == this) {
//            return true;
//        }
//        if (obj instanceof Element) {
//            return ((Element) obj).data.equals(data);
//        }
//        return false;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(data);
//
//    }
//}

public class Element {
    String element;

    public Element(String element) {
        this.element = element;
    }

    public String getElement() {
        return element;
    }

    @Override
    public String toString() {
        return element;
    }
}