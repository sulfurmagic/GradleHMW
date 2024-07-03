package ru.netology.service;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void shouldRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        org.junit.Assert.assertEquals (actual, expected);

    }

    @org.junit.Test
    public void shouldRecommend_Zero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;
        org.junit.Assert.assertEquals (actual, expected);
    }

    @org.junit.Test
    public void shouldRecommend_Middle() {
        CashbackHackService service = new CashbackHackService();
        int amount = 555;

        int actual = service.remain(amount);
        int expected = 445;
        org.junit.Assert.assertEquals (actual, expected);
    }

    @org.junit.Test
    public void shouldRecommend_MoreMin() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;
        org.junit.Assert.assertEquals (actual, expected);
    }





}