package cardiologyService;

public class ThyroidTestRecommendation implements Consultation {
    private double t3;
    private int t4;
    private int tsh;

    public ThyroidTestRecommendation(double t3, int t4, int tsh) {
        this.t3 = t3;
        this.t4 = t4;
        this.tsh = tsh;
    }

    public String bloodTest(int amtOfBlood,int hbPercentage) {
        System.out.println("Amount of Blood " +amtOfBlood);
       // int hbPercentage=9;
        if(hbPercentage<=10){
            return "Low hemoglobin Percent.";
        }else if(hbPercentage>=10 && hbPercentage<=14){
            return "Normal Range";
        }else{
            return "Doctor Consultation is Required";
        }

    }
    @Override
    public String recommendTest() {
        if(t3>=2.0 && t4<=115 && tsh==4){
            return "No Abnormalities Found";
        }else if(t3<2.0 && t4>115 && tsh>4){
            return "HypoThyroidism Is Detected";
        }else{
            return "HyperThyroid Is Detected";
        }

    }
}
