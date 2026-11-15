
      class student{
        String name;
        int English, Math, Computer;
        int totalMarks;
        double percentage;
        
        student(String name, int English, int Math, int Computer ){
            this.name = name;
            this.English= English;
            this.Math = Math;
            this.Computer = Computer;

        }

        void display(){
           totalMarks = English + Math + Computer;
            percentage = (totalMarks / 300.0 ) * 100;

            System.out.println("Name : "+name);
            System.out.println("English marks : "+English);
            System.out.println("Math marks : "+ Math);
            System.out.println("Computer Marks :"+ Computer);
            System.out.println("Total Marks : "+totalMarks);
             System.out.println("Percentage " + percentage + "%");


        }

        public static void main(String[] args) {
            student s1 = new student("Moazam", 75, 80, 90);

            s1.display();
        }

        }