package cardiologyService;

public class FeverTestRecommendation implements Consultation {
    private int WBC;
    private int plateletCount;
    private double temperature;

    public FeverTestRecommendation(int WBC, int plateletCount,double temperature) {
        this.WBC = WBC;
        this.plateletCount = plateletCount;
        this.temperature=temperature;
    }

    public String temperatureCheck(int temperature) {
        if (temperature >= 98 && temperature < 100) {
            System.out.println("low fever");
            return "low fever";
        } else if (temperature >= 100 && temperature < 102) {
            return "moderate fever";
        } else {
            return "high fever";
        }
    }

    @Override
    public String recommendTest() {
        if(WBC<15000 && plateletCount<250000){
            return "Malaria Fever is Attacked";
        }else if(WBC<5000 && plateletCount<150000){
            return "Dengue Fever Is Attacked";
        }else{
            return "Typhoid Fever Is Attacked";
        }
    }

    @Override
    public int bloodTest(int amtOfBlood) {
        System.out.println(amtOfBlood);
        int hbPercentage=13;
        return hbPercentage;
//        int quantityOfBlood=amtOfBlood;
//        return quantityOfBlood;

    }
}
