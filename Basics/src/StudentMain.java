public class StudentMain {
    public static void main(String[] args) {
        Student barry = new Student("Barry", "Allen", 2020, 8.42, "CSE");
        Student oliver = new Student("Oliver", "Queen", 2019, 7.36, "AEIE");
        barry.incrementGraduationYear();
        System.out.println(barry.expectedYearOfGraduation);
    }
}
