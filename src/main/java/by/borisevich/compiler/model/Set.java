package by.borisevich.compiler.model;

import java.util.*;

public class Set {

    List<Element> set = new ArrayList<>();

    public Set(Element[] elements) {
        Collections.addAll(set, elements);
    }

    public Set(List<Element> set) {
        this.set = set;
    }

    public Set() {

    }

    public void add(Element element) {
        if (set.indexOf(element) == -1)
            set.add(element);
    }

    public void remove(Element element) {
        if (set.indexOf(element) != -1)
            set.remove(element);
    }

    public List<Element> getSet() {
        return set;
    }

    public boolean indexOf(Element element) {
        return set.indexOf(element) != -1;
    }

    public void add(Set set) {
        this.set.addAll(set.getSet());
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        for(Element element: getSet())
            buffer.append(element.toString()).append(" ");
        return buffer.toString();
    }

    public int size() {
        return set.size();
    }

    public Element get(int i) {
        return set.get(i);
    }

    public Set union(Set a, Set b) {
        Set out = new Set();
        out.set.addAll(a.set);
        out.set.addAll(b.set);
        return out;
    }

    public static Set intersection(Set a, Set b) {
        Set out = new Set();
        for (Element el : a.set) {
            if (b.set.contains(el)) {
                out.add(el);
            }
        }
        for (Element el : b.set) {
            if (a.set.contains(el)) {
                out.add(el);
            }
        }
        return out;
    }

    public static Set diff(Set a, Set b) {
        Set out = new Set();
        out.set.addAll(a.set);
        for (Element el : b.set) {
            if (a.set.contains(el)) {
                out.remove(el);
            }
        }
        return out;
    }

    private boolean equal(Set a, Set b) {
        for (Element element : a.getSet())
            if (!b.indexOf(element))
                return false;
        return true;
    }

    private boolean nonEqual(Set a, Set b) {
        for (Element element : a.getSet())
            if (b.indexOf(element))
                return false;
        return true;
    }
}