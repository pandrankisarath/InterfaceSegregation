package cardiologyService;

public class TestRecommendation {
    public  Consultation CreateRecommendation(String disease){
        switch (disease.toLowerCase()){
            case "Fever":
                FeverTestRecommendation feverTestRecommendation=new FeverTestRecommendation(10000,150000,101.0);
                String temp=feverTestRecommendation.temperatureCheck(99);
                System.out.println(temp);
                return feverTestRecommendation;
            case "Thyroid":
                return new ThyroidTestRecommendation(2.5,125,4);
            case "Heart":
                return new HeartTestRecommendation(70,120);
            default:
                return new GeneralTestRecommendation(75,110);
        }
    }
}
