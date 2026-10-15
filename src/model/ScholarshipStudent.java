package model;

public class ScholarshipStudent extends Student {
    private double scholarshipRate;
    public ScholarshipStudent() {
        super();
    }
    public ScholarshipStudent(String studentId, String fullName, String gender, String phoneNumber, String university, double scholarshipRate) {
        super(studentId, fullName, gender, phoneNumber, university);
        this.scholarshipRate = scholarshipRate;
    }

    public double getScholarshipRate() {
        return scholarshipRate;
    }

    public void setScholarshipRate(double scholarshipRate) {
        this.scholarshipRate = scholarshipRate;
    }

    @Override
    public String getStudentType() {
        return "SCHOLARSHIP";
    }

    @Override
    public String toString() {
        return String.format("RegularStudent[id=%s, name=%s, gender=%s, phoneNum=%s, uni=%s, rate=%.0f]",
                studentId, fullName, gender, phoneNumber, university, scholarshipRate);
    }
}
