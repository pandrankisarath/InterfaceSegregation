package cardiologyService;

public class GeneralTestRecommendation implements Consultation {
    private int pulse;
    private int bp;

    public GeneralTestRecommendation(int pulse, int bp) {
        this.pulse = pulse;
        this.bp = bp;
    }

    public String bloodTest(int amtOfBlood) {
        System.out.println("Amount Of Blood " +amtOfBlood);
        int hbPercentage=9;
        if(hbPercentage<10){
            return "Low heamoglobin Percent.";
        }else if(hbPercentage>=10 && hbPercentage<14){
            return "Normal Range";
        }else{
            return "Doctor Consultation is Required";
        }

    }


    @Override
    public String recommendTest() {
        if (pulse > 70 && bp == 120) {
            return "Normal Condition,Test is not Recommended";
        } else {
            return "Further Test is Required";
        }
    }
}
