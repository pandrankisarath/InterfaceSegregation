package cardiologyService;

public class GeneralTestRecommendation implements Consultation {
    private int pulse;
    private int bp;

    public GeneralTestRecommendation(int pulse, int bp) {
        this.pulse = pulse;
        this.bp = bp;
    }

    public int bloodTest(int amtOfBlood) {
        int quantityOfBlood=amtOfBlood;
        return quantityOfBlood;

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
