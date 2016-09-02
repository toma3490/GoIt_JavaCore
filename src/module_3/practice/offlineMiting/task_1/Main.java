package module_3.practice.offlineMiting.task_1;

public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("John", "Smith", 35, "Kyiv", 6500);
        employee[1] = new Employee("Jack", "Sailor", 24, "Kyiv", 1523.32);
        employee[2] = new Employee("Susan", "Sarandon", 56, "Kyiv", 16500);
        employee[3] = new Employee("Alise", "Wonderland", 16, "Kyiv", 500);
        employee[4] = new Employee("Jane", "Smith", 30, "Kyiv", 3259.25);
        employee[5] = new Employee("Tailor", "Cothner", 28, "Kyiv", 8900);
        employee[6] = new Employee("Sam", "Jones", 41, "Kyiv", 25870.2);
        employee[7] = new Employee("Kevin", "Cosner", 50, "Kyiv", 12587);
        employee[8] = new Employee("Jack", "Nikolson", 66, "Kyiv", 18523.25);
        employee[9] = new Employee("Whitney", "West", 48, "Kyiv", 12500);

        double salarySum = 0;

        for (Employee employees: employee) {
            salarySum = getSalarySum(salarySum, employees);
        }
        System.out.println(salarySum);
        
    }

    private static double getSalarySum(double salarySum, Employee employees) {
        salarySum += employees.getSalary();
        return salarySum;
    }


}
