package ru.neyology.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
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

    @org.junit.jupiter.api.Test
    public void remainTestIfAmountLessBoundaryJunit5() {

        int expected = 1;
        int actual = service.remain(999);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void remainTestIfAmountEqualBoundaryJunit5() {

        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void remainTestIfAmountBiggerBoundaryJunit5() {

        int expected = 999;
        int actual = service.remain(1001);

        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void remainTestIfAmountEqualZeroJunit5() {

        int expected = 1000;
        int actual = service.remain(0);

        Assert.assertEquals(expected, actual);
    }
}
