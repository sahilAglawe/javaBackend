package kapilit;

class Employee {
    String name;
    double salary;

    // constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // method to display details
    void display() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

public class employee {
    
    // Method that accepts multiple employees, increments their salary, 
    // and returns the updated employees
    Employee[] updateSalary(Employee... employees) {
        for (Employee emp : employees) {
            emp.salary += 5000;  // increment logic
        }
        return employees;
    }

    public static void main(String[] args) {
        employee obj = new employee();
        
        // create 10 employees
        Employee e1 = new Employee("A", 30000);
        Employee e2 = new Employee("B", 32000);
        Employee e3 = new Employee("C", 28000);
        Employee e4 = new Employee("D", 35000);
        Employee e5 = new Employee("E", 40000);
        Employee e6 = new Employee("F", 37000);
        Employee e7 = new Employee("G", 42000);
        Employee e8 = new Employee("H", 31000);
        Employee e9 = new Employee("I", 45000);
        Employee e10 = new Employee("J", 39000);

        // call method
        Employee[] updated = obj.updateSalary(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);

        // display updated details
        for (Employee emp : updated) {
            emp.display();
        }
    }
}
