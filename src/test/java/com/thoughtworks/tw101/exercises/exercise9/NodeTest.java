package com.thoughtworks.tw101.exercises.exercise9;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class NodeTest {


    @Test
    public void namesOnSingleton() throws Exception {
        Node singleton = new Node("Singleton");
        List<String> names = singleton.names();
        List<String> expectedNames = new ArrayList<String>(1);
        expectedNames.add("Singleton");
        assertEquals(expectedNames,names);
    }

    @Test
    public void multipleTree() throws Exception {
        Node first = new Node("Singleton");
        first.add("Third");
        first.add("Second");
        List<String> names = first.names();
        List<String> expectedNames = new ArrayList<String>(3);
        expectedNames.add("Second");
        expectedNames.add("Singleton");
        expectedNames.add("Third");
        assertEquals(expectedNames,names);

    }

}