package com.example.baseapp.ui.login;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoginActivityTest {

    @Test
    public void validateIsEmpty() {
        String a = "";
        assertEquals(a.isEmpty(), true);
    }

    @Test
    public void validateIsEmpty2() {
        String name = "levanlam";
        assertEquals((name.isEmpty() && name.length() >=6), true);
    }
}
