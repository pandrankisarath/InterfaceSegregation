package cardiologyService;

public class HealthCareTest {
    public static void main(String[] args) {

        PatientDetails patientDetails = new PatientDetails("Priya", 23, "Female", "fever" ,
                "1234567890", 500);
        PatientHealth patientHealth = new PatientHealth();
        System.out.println(patientDetails);
        patientHealth.CalculateBMI(3.0, 55);
        String diseaseType = patientDetails.getDisease();
        System.out.println("Disease Type is : " +diseaseType);

        Consultation testRecommendation;

        if (diseaseType.equalsIgnoreCase("Fever")) {
            testRecommendation = new FeverTestRecommendation(14999, 200000, 101);
        } else if (diseaseType.equalsIgnoreCase("Thyroid")) {
            testRecommendation = new ThyroidTestRecommendation(2.0, 100, 4);
        } else if (diseaseType.equalsIgnoreCase("Heart")) {
            testRecommendation = new HeartTestRecommendation(75, 120);
        } else {
            testRecommendation = new GeneralTestRecommendation(80, 120);
        }


        if (testRecommendation instanceof FeverTestRecommendation) {
            String quantityOfBlood = testRecommendation.bloodTest(20,10);
            System.out.println(quantityOfBlood);
            String temperature=((FeverTestRecommendation) testRecommendation).temperatureCheck(100);
            System.out.println(temperature);
            String typeOfTest = testRecommendation.recommendTest();
            System.out.println(typeOfTest);
        }

        if (testRecommendation instanceof HeartTestRecommendation) {
            String quantityOfBlood1 = testRecommendation.bloodTest(20,10);
            System.out.println(quantityOfBlood1);
            String typeOfTest1 = testRecommendation.recommendTest();
            System.out.println(typeOfTest1);
            String glucose = ((HeartTestRecommendation) testRecommendation).glucoseTest(120);
            System.out.println(glucose);
        }
        if (testRecommendation instanceof ThyroidTestRecommendation) {
            String quantityOfBlood2 =  testRecommendation.bloodTest(20,9);
            System.out.println(quantityOfBlood2);
            String typeOfTest2 = testRecommendation.recommendTest();
            System.out.println(typeOfTest2);
        }

        if (testRecommendation instanceof GeneralTestRecommendation) {
            String quantityOfBlood3 =  testRecommendation.bloodTest(20,12);
            System.out.println(quantityOfBlood3);
            String typeOfTest3 = testRecommendation.recommendTest();
            System.out.println(typeOfTest3);
        }
    }
}