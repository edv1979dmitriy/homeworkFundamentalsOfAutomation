package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    CashbackHackService service = new  CashbackHackService();

    @Test
    public void remainTestIfAmountLessBoundary() {

        int expected = 1;
        int actual = service.remain(999);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void remainTestIfAmountEqualBoundary() {

        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void remainTestIfAmountBiggerBoundary() {

        int expected = 999;
        int actual = service.remain(1001);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void remainTestIfAmountEqualZero() {

        int expected = 1000;
        int actual = service.remain(0);

        Assert.assertEquals(actual, expected);
    }
}
