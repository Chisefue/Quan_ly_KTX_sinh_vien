package model;
import java.util.Objects;
public abstract class Student {
    protected String studentId;
    protected String fullName;
    protected String gender;
    protected String phoneNumber;
    protected String university;

    public Student() { }
    public Student(String studentId, String fullName, String gender, String phoneNumber, String university) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.university = university;
    }

    public abstract String getStudentType();

    public String getStudentId() {
        return studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getGender() {
        return gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getUniversity() {
        return university;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    @Override
    public String toString() {
        return String.format("Student[id=%s, name=%s, gender=%s, phoneNum=%s, uni=%s, type=%s]",
                studentId, fullName, gender, phoneNumber, university, getStudentType());
    }
}
