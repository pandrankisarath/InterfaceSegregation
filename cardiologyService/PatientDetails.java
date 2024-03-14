package cardiologyService;

public class PatientDetails {
    private String name;
    private int age;
    private String gender;
    private String disease;
    private String mobileNum;
    private int consultanceFee;



    public PatientDetails(String name, int age, String gender, String disease, String mobileNum, int consultanceFee) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.disease = disease;
        this.mobileNum = mobileNum;
        this.consultanceFee = consultanceFee;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDisease() {
        return disease;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public int getConsultanceFee() {
        return consultanceFee;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public void setConsultanceFee(int consultanceFee) {
        this.consultanceFee = consultanceFee;
    }

    @Override
    public String toString() {
        return "PatientDetails{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", disease='" + disease + '\'' +
                ", mobileNum='" + mobileNum + '\'' +
                ", consultanceFee=" + consultanceFee +
                '}';
    }
}
