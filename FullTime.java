package ir.maktab2;

import java.util.Date;

public class FullTime extends Teacher {
    private double salaryBase;

    public FullTime(Education education, double salaryBase) {
        super(education);
        this.salaryBase = salaryBase;
    }

    public Double calculateBaseSalary() {
        return this.salaryBase - calculateIsurance() - calculateTax();
    }

    private double calculateTax() {
        return this.salaryBase * 0.03;
    }

    private double calculateIsurance() {
        return this.salaryBase * 0.07;
    }
}