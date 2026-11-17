
  class LibraryFine{
    String Student_Name;
    int days;
    int fine_per_day;
    int late_days;
    int total_fine;

    LibraryFine(String Student_Name ,int fine_per_day , int late_days){
        

        this.Student_Name = Student_Name;
        this.fine_per_day = fine_per_day;
        this.late_days = late_days;

    }
     
    void display(){
            total_fine = fine_per_day * late_days ;

            System.out.println("Student Name :"+ Student_Name);
            System.out.println("Late Days :"+ late_days);
            System.out.println("Fine Per Day :"+ fine_per_day);
            System.out.println("Total Fine :"+total_fine);

        
    }
    public static void main(String[] args) {

        LibraryFine f = new LibraryFine("Moazam", 20, 5);
        f.display();

    }

  }