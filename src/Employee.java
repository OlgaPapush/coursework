public class Employee{

  private static int counter = 0;
  private Integer id;
  private final String employeeSurname;
  private final String employeeName;
  private final String employeeMiddleName;
  private int department;
  private int salary;

  public Employee (String employeeSurname, String employeeName, String employeeMiddleName, int department, int salary) {
    this.employeeName = employeeName;
    this.employeeSurname = employeeSurname;
    this.employeeMiddleName = employeeMiddleName;
    this.department = department;
    this.salary = salary;
    this.id = counter++;
  }

  public String getEmployeeSurname() { return employeeSurname; }
  public String getEmployeeName() { return employeeName;}
  public String getEmployeeMiddleName() { return employeeMiddleName;}
  public int getDepartment() {return department;}
  public int getSalary() {return salary;}
  public Integer getId() { return id;}

  public void setDepartment (int department) { this.department = department;}
  public void setSalary (int salary) {this.salary = salary;}

  @Override
  public String toString() {
    return "Employee{" +
            "id=" + id +
            ", employeeSurname='" + employeeSurname + '\'' +
            ", employeeName='" + employeeName + '\'' +
            ", employeeMiddleName='" + employeeMiddleName + '\'' +
            ", department=" + department +
            ", salary=" + salary +
            '}';
  }
}



