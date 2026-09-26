package ru.neyology.service;

import org.junit.Assert;
import org.junit.Test;
import ru.netology.service.CashbackHackService;

public class CashbackServiceTest {

    CashbackHackService service = new  CashbackHackService();

    @Test
    public void remainTestIfAmountLessBoundary() {

        int expected = 1;
        int actual = service.remain(999);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remainTestIfAmountEqualBoundary() {

        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remainTestIfAmountBiggerBoundary() {

        int expected = 999;
        int actual = service.remain(1001);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remainTestIfAmountEqualZero() {

        int expected = 1000;
        int actual = service.remain(0);

        Assert.assertEquals(expected, actual);
    }
}
