package cardiologyService;

public  class PatientHealth  {
    private double height;
    private double weight;
    private double bmi;



    public double CalculateBMI(double height , double weight) {
        bmi= weight /(height*2);
        System.out.println("BMI Is " +bmi);
        return bmi;
    }
}
