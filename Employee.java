public class Employee {
    private String name; // Имя сотрудника
    private Department department; // Отдел, в котором работает сотрудник

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
        department.addEmployee(this); // Добавляем сотрудника в отдел при создании
    }

    public String getName() {
        return name; // Получение имени сотрудника
    }

    public Department getDepartment() {
        return department; // Получение отдела
    }

    @Override public String toString() {
        if (department.getHead() == this) {
            return name + " начальник отдела " + department.getName();
        } else {
            return name + " работает в отделе " + department.getName() + ", начальник которого " + department.getHead().getName();
        }
    }
}
