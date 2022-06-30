package org.example.lesson7_1.services;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Arrays;

import static java.lang.System.out;

public class StatServices {
    public double sumService(double[] sale) {
        double sum = 0;
        for (double t : sale) {
            sum += t;
        }
        return sum;
    }

    public double meanSum(double[] sale) {
        int count = sale.length;
        double mean = sumService(sale) / count;
        return mean;
    }

    public int highSale(double[] sale) {
        int high = -1;
        int month = 0;
        int i = 1;
        for (double t : sale) {
            if ((int) t > high) {
                high = (int) t;
                month = i;
            }
            i++;
        }
        return month;
    }

    public int lowSale(double[] sale) {
        int low = 1000000000;
        int month = 0;
        int i = 1;
        for (double t : sale) {
            if ((int) t < low) {
                low = (int) t;
                month = i;
            }
            i++;
        }
        return month;
    }

    public int countLowMean(double[] sale) {
        int count = 0;
        double mean = meanSum(sale);
        for (double t : sale) {
            if (t < mean) {
                count++;
            }
        }
        return count;

    }

    public int countHighMean(double[] sale) {
        int count = 0;
        double mean = meanSum(sale);
        for (double t : sale) {
            if (t > mean) {
                count++;
            }
        }
        return count;
    }


}
