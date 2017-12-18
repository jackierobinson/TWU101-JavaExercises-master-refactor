package com.thoughtworks.tw101.exercises.exercise6;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MonsterTest {

    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setupOutputStream(){
        output.reset();
        System.setOut(new PrintStream(output));

    }
    @Test
    public void orcReportStatusUponInitialization() throws Exception {
        Orc orc = new Orc();
        orc.reportStatus();
        assertEquals("Orc 20", output.toString());
    }

    @Test
    public void orcTakeDamage() throws Exception {
        Orc orc = new Orc();
        orc.takeDamage(7);
        orc.reportStatus();
        assertEquals("Orc 13", output.toString());
    }

    @Test
    public void trollReportStatusUponInitialization() throws Exception {
        Troll troll = new Troll();
        troll.reportStatus();
        assertEquals("Troll 40.0", output.toString());
    }
    @Test
    public void trollTakeDamage() throws Exception {
        Troll troll = new Troll();
        troll.takeDamage(15);
        troll.reportStatus();
        assertEquals("Troll 32.5", output.toString());
    }

    @After
    public void cleanUpOutputStream(){
        System.setOut(null);
    }



}