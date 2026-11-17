public class Calculator2 {
    
    int a;
    int b;

   static int Add(int a, int b){
    return a + b ;

   }
   
 int subs(int a, int b){
    return a - b;

 }

   static  int multipy(int a, int b){
    return a * b;
   }

   static double divide(double a , double b){
    return a/b;
   }

   void display(){
    System.out.println("Addition :" + Add(20, 10));
    System.out.println("Substraction : "+ subs(20 , 10));
    System.out.println("Multiplicatio :"+ multipy(20 , 10));
    System.out.println("Division : "+ divide(20, 10));

   }

   public static void main(String[] args) {
    Calculator2 c =  new Calculator2();

    c.display();
   }
    }
