public class Employee_Salary {
    
    String name;
    int ID;
    int salary;
    int bonus;

    Employee_Salary(){
       name = "unknown";
       ID = 0;
       salary = 0;

    }
    Employee_Salary(String name, int ID){
    this.name = name;
    this.ID = ID;
    this.salary = 30000;
}

    Employee_Salary(String name, int ID, int salary){
          this.name = name;
        this.ID = ID;
        this.salary = salary;

    }

    double calculateBonus(double percentage) {
    return salary * percentage / 100;
}

     int calculateBonus(int fixedAmount) {
    return fixedAmount;
}
    void display(){

        System.out.println("Name :"+ name);
        System.out.println("ID :"+ ID);
        System.out.println("Salary :"+ salary);
        System.out.println("Bonus (10%): " + calculateBonus(10.0));
       System.out.println("Fixed Bonus: " + calculateBonus(3000));
          System.out.println();
    }

    public static void main(String[] args) {
        Employee_Salary es = new Employee_Salary();
       Employee_Salary es1 = new Employee_Salary("Moazam", 101);
       Employee_Salary es2 = new Employee_Salary("Ali", 102, 50000);

       System.out.println("Employee 1 :");
       es.display();

       System.out.println("Employee 2 :");
       es1.display();

         System.out.println("Employee 3 :");
       es2.display();
       
            
    }
    }

