package model;

public class RegularStudent extends Student {
    public RegularStudent() {
        super();
    }
    public RegularStudent(String studentId, String fullName, String gender, String phoneNumber, String university) {
        super(studentId, fullName, gender, phoneNumber, university);
    }
    @Override
    public String getStudentType() {
        return "REGULAR";
    }

    @Override
    public String toString() {
        return String.format("RegularStudent[id=%s, name=%s, gender=%s, phoneNum=%s, uni=%s]",
                studentId, fullName, gender, phoneNumber, university);
    }
}
