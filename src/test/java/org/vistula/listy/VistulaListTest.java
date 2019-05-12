package org.vistula.listy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class VistulaListTest {

    @Test
    public void listTestAdd() {
        List<String> names = new ArrayList<>();
        names.add("Alek");
        assert names.size() == 1;
    }

    @Test
    public void listTestGet() {
        List<String> names = new ArrayList<>();
        names.add("Alek");
        assert names.get(0).equals("Alek");
    }

    @Test
    public void listTestRemove() {
        List<String> names = new ArrayList<>();
        names.add("Alek");
        assert names.contains("Alek");
        names.remove(0);
        assert !names.contains("Alek");
        assert names.size()==0;
    }

    @Test
    public void listTestContains() {
        List<String> names = new ArrayList<>();
        names.add("Alek");
        assert names.contains("Alek");
    }

    @Test
    public void listTestSize() {
        VistulaList obiekt = new VistulaList();
        assert obiekt.getNames().size()==0;
    }

    @Test
    public void listTestSet() {
        VistulaList obiekt = new VistulaList();
        List<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("B");
        assert  obiekt.getNames().size()==0;
        obiekt.setNames(myList);
        assert obiekt.getNames().get(1).equals("B");
        assert obiekt.getNames().contains("B");

    }

}
