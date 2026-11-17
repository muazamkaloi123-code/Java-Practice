class StudentManagement{

    String name;
    int ID;
    int marks;
    double percentage;
    char grade;
    int total = 100;

    StudentManagement(String name,int ID,int marks){
        this.name = name;
        this.ID = ID;
        this.marks = marks;
     

    }

      void display(){
 
       percentage = (marks * 100.0) / total;
        if(marks >= 80 && marks <= 100){
            grade = 'A';
        }
        else if (marks >= 70) {
            grade = 'B';
        }
        else if (marks >= 60) {
            grade = 'C';
        }
   
        else{
            grade = 'F';
   
        }     

        System.out.println("===== Student Details =====");
        System.out.println();
        System.out.println("Name : "+ name);
        System.out.println("ID :" + ID);
        System.out.println("Marks :"+ marks);
        System.out.println("Percentage :"+ percentage + "%");
        System.out.println("Grade :"+ grade);
        System.out.println();

    
    }

      public static void main(String[] args) {
         
       StudentManagement sm = new StudentManagement("Moazam", 101, 85);
       StudentManagement sm1 = new StudentManagement("Ali", 102, 75);
       StudentManagement sm2 = new StudentManagement("Ahmed ", 103 , 55);

       sm.display();
       sm1.display();
       sm2.display();
       

      }

   }