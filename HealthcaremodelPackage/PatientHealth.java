package HealthcaremodelPackage;

public abstract class PatientHealth {
    private double height;
    private double weight;
    private double bmi;



    public double CalculateBMI(double height , double weight) {
        bmi= weight /(height*2);
        return bmi;
    }
    public abstract double bloodTest();
}
