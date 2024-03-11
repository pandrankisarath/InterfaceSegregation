package cardiologyService;

public class HealthCareTest {
     public static void main(String[] args) {

    PatientDetails patientDetails = new PatientDetails("Priya", 23, "Female", "Fever",
            "1234567890", 500);
        PatientHealth patientHealth=new PatientHealth();
        System.out.println(patientDetails);
        patientHealth.CalculateBMI(3.0,55);
        String diseaseType = patientDetails.getDisease();
        System.out.println(diseaseType);

        TestRecommendation test=new TestRecommendation();
        test.CreateRecommendation("Fever");


        FeverTestRecommendation fever=new FeverTestRecommendation(14999,200000,101);
        String bodyTemperature=fever.temperatureCheck(101);
        System.out.println(bodyTemperature);
        String typeOfTest = fever.recommendTest();
        System.out.println(typeOfTest);
        int quantityOfBlood= fever.bloodTest(20);
        System.out.println(quantityOfBlood);

        ThyroidTestRecommendation thyroid=new ThyroidTestRecommendation(2.0,100,4);
        int quantityOfBlood1=thyroid.bloodTest(20);
        System.out.println(quantityOfBlood1);
        String typeOfTest1=thyroid.recommendTest();
        System.out.println(typeOfTest1);

        HeartTestRecommendation heart=new HeartTestRecommendation(75,120);
        int quantityOfBlood2= heart.bloodTest(20);
        System.out.println(quantityOfBlood2);
        String typeOfTest2=heart.recommendTest();
        System.out.println(typeOfTest2);
        String glucoseTest= heart.glucoseTest(150);
        System.out.println(glucoseTest);

        GeneralTestRecommendation generalTest=new GeneralTestRecommendation(80,120);
        int quantityOfBlood3= generalTest.bloodTest(20);
        System.out.println(quantityOfBlood3);
        String typeOfTest3=generalTest.recommendTest();
        System.out.println(typeOfTest3);
        TestRecommendation testRecommendation=new TestRecommendation();
        testRecommendation.CreateRecommendation(diseaseType);


    }
}