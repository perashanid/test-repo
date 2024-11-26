public class Tester3 {

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();

        emp1.newEmployee("Harry Potter");
        emp2.newEmployee("Hermione Granger");
        emp3.newEmployee("Ron Weasley");

        System.out.println("1 ==========");
        emp1.displayInfo();
        System.out.println("2 ==========");
        emp2.displayInfo();
        System.out.println("3 ==========");
        emp3.displayInfo();
        System.out.println("4 ==========");
        emp1.calculateTax();
        System.out.println("5 ==========");
        emp1.promoteEmployee("lead");
        System.out.println("6 ==========");
        emp1.calculateTax();
        System.out.println("7 ==========");
        emp1.displayInfo();
        System.out.println("8 ==========");
        emp3.promoteEmployee("manager");
        System.out.println("9 ==========");
        emp3.calculateTax();
        System.out.println("10 ==========");
        emp3.displayInfo();
    }
}

class Employee {
    public String name;
    public float salary = 30000;
    public String designation = "junior";

    public void newEmployee(String name) {
        this.name = name;
    }

    public void promoteEmployee(String x) {
        this.designation = x;
        System.out.println(name + " has been promoted to " + x);
        if (designation.equals("senior")) {
            salary += 25000;
        } else if (designation.equals("lead")) {
            salary += 50000;
        } else {
            salary += 75000;
        }
        System.out.println(" new salary: " + salary + " tk ");
    }

    public void displayInfo() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee salary: " + salary + " tk");
         System.out.println("Employee designation: " + designation);
    }

    public void calculateTax() {
        float tax = 0;

        if (salary == 30000) {
           
            System.out.println( "No need to pay tax");
           
        }

       else if (salary > 30000 &&  salary <50000) {
            tax =  (salary * 10)/100;
            
            System.out.println( name +" tax amount: " + tax + " tk");
             
       } else {
            tax =  (salary * 30)/100;
            System.out.println( name + " tax amount: " + tax + " tk");
        }
    }
}
