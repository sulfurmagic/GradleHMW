package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void shouldRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void shouldRecommend_Zero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldRecommend_Middle() {
        CashbackHackService service = new CashbackHackService();
        int amount = 555;

        int actual = service.remain(amount);
        int expected = 445;
        assertEquals(actual, expected);
    }





}