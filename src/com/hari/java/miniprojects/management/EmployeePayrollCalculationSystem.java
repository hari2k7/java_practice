package com.hari.java.miniprojects.management;

import java.util.Scanner;

class Employee{
    private String name;
    private String department;
    private double basicSalary;

    Employee(){
        this.name = "unkown";
        this.department = "General";
        this.basicSalary = 0.0;
    }
    Employee(String name, String department){
        this.name = name;
        this.department = department;
        this.basicSalary = 0.0;
    }
    Employee(String name, String department, double basicSalary){
        this.name = name;
        this.department = department;
        this.basicSalary = basicSalary;
    }

    double computeNetSalary() {
        return basicSalary;
    }

    double computeNetSalary(double bonusPercent) {
        return basicSalary + (bonusPercent*(basicSalary)/100.0);
    }
    double computeNetSalary(double bonusPercent, double deductionPercent) {
        return basicSalary + ((bonusPercent/100.0)*basicSalary) - ((deductionPercent/100.0)*basicSalary);
    }

    void printPayslip() {
        System.out.println("Name: "+ name + " | dept: "+department + " | Basic Salary: "+basicSalary);
    }
    void printPayslip(double bonusPercent) {
        double b = bonusPercent * basicSalary / 100.0;
        double ns = basicSalary + b;
        System.out.println("Name: "+ name + " | dept: "+department + " | Basic Salary: "+basicSalary+ " | Bonus: "+b+" | Net Salary: "+ns);
    }

    void printPayslip(double bonusPercent, double deductionPercent) {
        double b = bonusPercent * basicSalary / 100.0;
        double d = deductionPercent * basicSalary / 100.0;
        double ns = basicSalary + b - d;
        System.out.println("Name: "+ name + " | dept: "+department + " | Basic Salary: "+basicSalary+ " | Bonus: "+b+" |deduction: "+d +" | Net Salary: "+ns);
    }

    void displayDetails() {
        System.out.println("Name: "+name);
        System.out.println("department: "+department);
        System.out.println("basicSalary: "+basicSalary);
    }

    double getBasicSalary() {
        return basicSalary;
    }
    String getDepartment() {
        return department;
    }
    String getName() {
        return name;
    }
    static Employee findHighestPaid(Employee a, Employee b) {
        double nsa = a.computeNetSalary();
        double nsb = b.computeNetSalary();
        if(nsa>nsb) {
            return a;
        }else {
            return b;
        }
    }
    static boolean isSameDepartment(Employee a, Employee b) {
        String da = a.getDepartment();
        String db = b.getDepartment();
        if(da.equalsIgnoreCase(db)) {
            return true;
        }else {
            return false;
        }
    }
}

public class EmployeePayrollCalculationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees?: ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee[] employee = new Employee[n];

        for(int i=0; i<n;i++) {
            System.out.print("Employee "+(i+1)+" — Details (1/2/3):");
            int det = sc.nextInt();
            sc.nextLine();

            switch(det) {
                case 1:{
                    System.out.println("(Defaults applied)");
                    employee[i] = new Employee();
                    break;
                }
                case 2:{
                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Dept: ");
                    String dept = sc.nextLine();

                    employee[i] = new Employee(name,dept);
                    break;
                }
                case 3:{
                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Dept");
                    String dept = sc.nextLine();

                    System.out.print("Salary: ");
                    double salary = sc.nextDouble();

                    employee[i] = new Employee(name,dept,salary);
                    break;
                }
            }

        }

        int ch;
        do {

            System.out.println("1. Print Payslip");
            System.out.println("2. Employees With Salary Above a Limit");
            System.out.println("3. Search by Department");
            System.out.println("4. Find Highest Paid");
            System.out.println("5. Check Same Department");
            System.out.println("6. Display All");
            System.out.println("7. Exit");
            System.out.print("Your Choice: ");
            ch = sc.nextInt();

            switch(ch) {
                case 1:{
                    System.out.print("Employee Index: ");
                    int index = sc.nextInt();
                    System.out.println("1. Basic  2. With Bonus  3. Full (Bonus + Deduction)");
                    System.out.print("Option: ");
                    int opt = sc.nextInt();

                    switch(opt) {
                        case 1:{
                            employee[index].printPayslip();
                            break;
                        }
                        case 2:{
                            System.out.print("Bonus %: ");
                            double bonus = sc.nextDouble();
                            employee[index].printPayslip(bonus);
                            break;
                        }
                        case 3:{
                            System.out.print("Bonus %: ");
                            double bonus = sc.nextDouble();

                            System.out.print("Deduction %: ");
                            double ded = sc.nextDouble();

                            employee[index].printPayslip(bonus, ded);
                            break;
                        }
                    }
                    break;
                }

                case 2:{
                    System.out.print("Enter salary limit: ");
                    double limit = sc.nextDouble();
                    sc.nextLine();
                    boolean found = false;
                    for(int i=0; i<employee.length; i++) {
                        if(employee[i].getBasicSalary()>limit) {
                            employee[i].displayDetails();
                            found = true;
                        }
                    }
                    if(!found) {
                        System.out.println("No employees found.");
                    }
                    break;
                }
                case 3:{
                    System.out.print("Department: ");
                    String dept = sc.nextLine();
                    boolean dFound = false;
                    for (int i = 0; i < n; i++) {
                        if (employee[i].getDepartment().equalsIgnoreCase(dept)) {
                            employee[i].displayDetails();
                            dFound = true;
                        }
                    }
                    if (!dFound) System.out.println("No employees found.");
                    break;
                }
                case 4:{
                    System.out.print("Index of Employee 1: ");
                    int e1 = sc.nextInt();
                    System.out.print("Index of Employee 2: ");
                    int e2 = sc.nextInt();

                    Employee highest = Employee.findHighestPaid(employee[e1], employee[e2]);

                    System.out.println("Highest Paid: " + highest.getName()
                            + " (" + highest.getDepartment() + ")"
                            + " | Net Salary: " + highest.computeNetSalary());

                    break;
                }
                case 5:{
                    System.out.print("Index of Employee 1: ");
                    int e1 = sc.nextInt();
                    System.out.print("Index of Employee 2: ");
                    int e2 = sc.nextInt();

                    boolean samedept = Employee.isSameDepartment(employee[e1],employee[e2]);

                    if (samedept) {
                        System.out.println("Same Department: true — Both are in "
                                + employee[e1].getDepartment());
                    } else {
                        System.out.println("Same Department: false — "
                                + employee[e1].getDepartment() + " vs "
                                + employee[e2].getDepartment());
                    }
                    break;

                }
                case 6:{
                    System.out.println("\n--- All Employees ---");
                    for(int i=0; i<employee.length; i++) {
                        System.out.print("[" + i + "] ");
                        employee[i].displayDetails();
                    }
                    break;
                }
                case 7:{
                    System.out.println("Exiting...");
                    break;
                }
                default:
                    System.out.println("Invalid choice.");
            }

        }while(ch!=7);

        sc.close();
    }
}
