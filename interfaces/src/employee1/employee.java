package employee1;

public class employee implements Cloneable {

    int empId;
    String empName;
    int age, salary;

    public employee() {
        super();
    }

    public employee(int empId, String empName, int age, int salary) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.age = age;
        this.salary = salary;
    }

    // Overriding clone() method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }

    @Override
    public String toString() {
        return "employee [empId=" + empId + ", empName=" + empName + ", age=" + age + ", salary=" + salary + "]";
    }

    public static void main(String[] args) {
        employee e = new employee(123, "viju", 22, 200000);

        try {
            employee e1 = (employee) e.clone();

            System.out.println("Original Object: " + e);
            System.out.println("Cloned Object:   " + e1);

            // Check reference equality
            System.out.println("Are both objects same? " + (e == e1));

        } catch (CloneNotSupportedException ex) {
            System.out.println("Cloning not supported: " + ex);
        }
    }
}
