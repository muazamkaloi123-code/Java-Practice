public class Calculator3 {
    
    int a, b;

    static int Add(int a, int b){
        return a + b;
    }
    static  int add(int a, int b, int c){
        return a + b +c;
    }
    static int multiply(int a, int b){
        return  a * b;
    }
    static int square(int a){
        return a * a;
    }

    void  display(){
    System.out.println("Add of  2 number is : "+ Add(20,10));
    System.out.println("Addition of 3 numbers is :"+ add(20, 10, 30));
    System.out.println("Multiplication : "+ multiply(10, 20));
    System.out.println("Square :" + square(5));

    }

    public static void main(String[] args) {
        Calculator3 c = new Calculator3();

        c.display();
    }

}
