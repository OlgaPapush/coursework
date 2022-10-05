import java.util.Arrays;

public class Easy {


    public static int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee:employees) {
            sum += employees.getSalary(); }
        return sum;

    System.out.println("Сумма зарплаты всех сотрудников состаляет" + "рублей"); }


    public static void printEmployees(){
        for (Employee employee:employees){
            System.out.println(employee);
        }
    }

    public static Employee findEmployeeWithMinSalary(){
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee: employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result; }

    public static Employee findEmployeeWithMaxSalary(){
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee: employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result; }


    private static Employee [] employees = new Employee[10];
    public static void main(String[] args) {



        Employee employee1 = new Employee("Сапожникова", "Александра", "Дмитриевна", 1, 150_000);
        Employee employee2 = new Employee("Лысенкова", "Анна", "Юрьевна", 1, 120_000);
        Employee employee3 = new Employee("Кузьмина", "Юлия", "Сергеевна", 2, 140_000);
        Employee employee4 = new Employee("Коваль", "Ольга", "Игоревна", 2, 145_000);
        Employee employee5 = new Employee("Толстых", "Владимир", "Юрьевич", 3, 98_000);
        Employee employee6 = new Employee("Соколенко", "Максим", "Андреевич", 3, 30_000);
        Employee employee7 = new Employee("Папушин", "Иван", "Сергеевич", 4, 100_000);
        Employee employee8 = new Employee("Рязанова", "Татьяна", "Сергеевна", 4, 50_000);
        Employee employee9 = new Employee("Копылов", "Денис", "Андреевич", 5, 35_000);
        Employee employee10 = new Employee("Савченко", "Марина", "Игоревна", 5, 90_000);


        employees [2]=employee3;
        employees [1]=employee2;
        employees [2]=employee3;
        employees [2]=employee4;
        employees [3]=employee5;
        employees [3]=employee6;
        employees [4]=employee7;
        employees [4]=employee8;
        employees [5]=employee9;
        employees [5]=employee10;

        for( int i = 0; i<10; i++) {
            System.out.println(employees[i]); }


        calculateTotalSalary(sum);
        printEmployees();
        findEmployeeWithMinSalary(minSalary);
        findEmployeeWithMaxSalary(maxSalary);



    }
}