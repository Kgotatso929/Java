// These are the list of attributes of a President
/* Age, Earnings, Qualifications */

public class President implements java.io.Serializable {
    private int age;
    private Double earnings;
    private String qualification;

    public int getAge() {
    	return age;
    }

    public void setAge(int pAge) {
    	age = pAge;
    }

    public Double getEarnings() {
    	return earnings;
    }

    public void setEarnings(Double pEarnings) {
	earnings = pEarnings;
    }

    public String getQualification() {
    	return qualification;
    }

    public void setQualification(String pQualification) {
    	qualification = pQualification;
    }

}