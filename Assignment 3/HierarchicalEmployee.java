class Employee {
    String name;
    int empId;
    int baseSalary;

    void setEmployeeDetails(String name, int empId, int baseSalary) {
        this.name = name;
        this.empId = empId;
        this.baseSalary = baseSalary;
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Base Salary: ₹" + baseSalary);
    }
}

class SalesDepartment extends Employee {
    void calculateSalary(long commission) {
        
	long totalSalary = baseSalary + commission;
        System.out.println("Commission Earned: ₹" + commission);
        System.out.println("Total Salary (Sales Dept): ₹" + totalSalary);
    }
}

class DevelopmentDepartment extends Employee {
    void calculateSalary(
long bonus) {
        long totalSalary = baseSalary + bonus;
        System.out.println("Bonus Earned: ₹" + bonus);
        System.out.println("Total Salary (Development Dept): ₹" + totalSalary);
    }
}

public class HierarchicalEmployee {
    public static void main(String[] args) {
        SalesDepartment salesEmp = new SalesDepartment();
        salesEmp.setEmployeeDetails("Rohit Sharma", 101, 50000);
        salesEmp.calculateSalary(15000);

        System.out.println();

        DevelopmentDepartment devEmp = new DevelopmentDepartment();
        devEmp.setEmployeeDetails("Virat Kohli", 102, 60000);
        devEmp.calculateSalary(20000);
    }
}
