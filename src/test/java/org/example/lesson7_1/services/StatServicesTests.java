package org.example.lesson7_1.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.Math.abs;
import static java.lang.Math.exp;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class StatServicesTests {
    @Test
    public void souldStatisticsSum() {
        StatServices service = new StatServices();
        double[] sale = {15, 45, 25.7, 64, 17.2, 48, 15.9, 25.5, 65, 32.4, 8.4, 63};
        double expected = 425.1;
        double actual = service.sumService(sale);
        int expect, act;

        if (abs(expected - actual) < 0.00001) {
            expect = (int) expected;
            act = (int) expected;
        }
        else {
            expect=1;
            act=-1;
        }

        Assertions.assertEquals(expect,act);
    }
    @Test
    public void souldStatisticsMean() {
        StatServices service = new StatServices();
        double[] sale = {15, 45, 25.7, 64, 17.2, 48, 15.9, 25.5, 65, 32.4, 8.4, 63};
        double expected = 35.425;
        double actual = service.meanSum(sale);
        int expect, act;

        if (abs(expected - actual) < 0.00001) {
            expect = (int) expected;
            act = (int) expected;
        } else {
            expect = 1;
            act = -1;
        }

        Assertions.assertEquals(expect, act);
    }
    @Test
    public void souldStatisticHighSale(){
        StatServices service = new StatServices();
        double[] sale = {15, 45, 25.7, 64, 17.2, 48, 15.9, 25.5, 65, 32.4, 8.4, 63};
        int expected = 9;
        int actual = service.highSale(sale);

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void souldStatisticsLowSale(){
        StatServices service = new StatServices();
        double[] sale = {15, 45, 25.7, 64, 17.2, 48, 15.9, 25.5, 65, 32.4, 8.4, 63};
        int expected = 11;
        int actual = service.lowSale(sale);

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void souldStatisticsCountLowMean(){
        StatServices services=new StatServices();
        double[] sale = {15, 45, 25.7, 64, 17.2, 48, 15.9, 25.5, 65, 32.4, 8.4, 63};
        int expected = 7;
        int actual = services.countLowMean(sale);

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void souldStatisticsCountHighMean(){
        StatServices services=new StatServices();
        double[] sale = {15, 45, 25.7, 64, 17.2, 48, 15.9, 25.5, 65, 32.4, 8.4, 63};
        int expected = 5;
        int actual = services.countHighMean(sale);

        Assertions.assertEquals(expected,actual);
    }
}
