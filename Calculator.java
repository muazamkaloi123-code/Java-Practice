
     import java.util.Scanner;

     class Calculator{
       
        int num1, num2;

        Calculator(int num1, int num2){
            this.num1 = num1;
            this.num2 = num2;

        }
    void add(){
        System.out.println("Addition : "+ (num1 + num2));
       
    }
    void subtract(){
        System.out.println("substraction : "+ (num1 - num2));
    }

    void  multiply(){
        System.out.println("multiply : "+ (num1 * num2));
    }

    void divide(){
        System.out.println("Substraction :"+ (num1 / num2));
    }
        
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("1st number :");
            int a = sc.nextInt();

            System.out.println("2nd Number :");
            int b = sc.nextInt();
                   
            Calculator obj = new Calculator(a , b);

            System.out.println();

           
                obj.add();
                obj.subtract();
                obj.multiply();
                obj.divide();
        
                sc.close();
      
        }
    }
       
