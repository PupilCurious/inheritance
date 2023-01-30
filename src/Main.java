public class Main {
    public static void main(String[] args) {
        Costumer costumer = new Costumer();
        Employee employee = new Employee();
        costumer.lastName = "ertugrul";
        employee.age = 32;

        CostumerManager costumerManager = new CostumerManager();
        costumerManager.list();
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.bestemployee();

    }
}