public class SalaryCalculator {
    public static double GrossSalary(double hoursPerWeek, double amountPerHour, int vacationDaysPerYear) {
        return ((hoursPerWeek * 52) - (vacationDaysPerYear * 8)) * amountPerHour;
    }
    public static void main(String[] args) {
        double hoursPerWeek = 42.5;
        double amountPerHour = 250;
        int vacationDaysPerYear = 15;
        System.out.println("Gross yearly salary: "  + GrossSalary(hoursPerWeek, amountPerHour, vacationDaysPerYear));
    }
}