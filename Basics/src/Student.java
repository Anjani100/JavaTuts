public class Student {
    String studentFirstName, studentLastName;
    int expectedYearOfGraduation;
    double GPA;
    String declaredMajor;
    public Student(String studentFirstName, String studentLastName, int expectedYearOfGraduation, double GPA, String declaredMajor) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.expectedYearOfGraduation = expectedYearOfGraduation;
        this.GPA = GPA;
        this.declaredMajor = declaredMajor;
    }
    public void incrementGraduationYear() {
        this.expectedYearOfGraduation++;
    }
}
