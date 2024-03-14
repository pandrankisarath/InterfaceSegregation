package cardiologyService;

public class HeartTestRecommendation implements Consultation {
    private int hbm;
    private int ECG;

    public HeartTestRecommendation(int hbm, int ECG) {
        this.hbm = hbm;
        this.ECG = ECG;
    }

    public String bloodTest(int amtOfBlood) {
        System.out.println("Amount of Blood " +amtOfBlood);
        int hbPercentage=9;
        if(hbPercentage<=10){
            return "Low heamoglobin Percent.";
        }else if(hbPercentage>=10 && hbPercentage<=14){
            return "Normal Range";
        }else{
            return "Doctor Consultation is Required";
        }
    }

    @Override
    public String recommendTest() {
        if(ECG>60 && ECG<=100 ){
            return "Normal Functioning Of Heart ";
        }else if(ECG>100 && ECG<=130){
            return "Some Abnormalities are Detected";
        }else if(ECG>130){
            return "High Abnormal ECG";
        }else{
            return "Over pumps the Blood flow";
        }
    }

    String glucoseTest(double bloodSugarLevel){
        if(bloodSugarLevel<=140){
            return "Normal Blood Sugar Level";
        }else if(bloodSugarLevel>140 && bloodSugarLevel<=199){
            return "Diagnosed with PreDiabetes";
        }else{
            return "Diagnosed With Diabetes,Insulin Is recommended";
        }
    }
}
