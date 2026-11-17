class MethodOverloading{

        int num1, num2, num3;
        double num4;

        MethodOverloading(int num1, int num2, int num3, double num4){
            this.num1 = num1;
            this.num2 = num2;
            this.num3 = num3;
            this.num4 = num4;

        }

        void display(){
            System.out.println("Addition :"+( num1 + num2));
            System.out.println("Addition :"+(num1 + num2 + num3));
            System.out.println("Multiply :" +(num1 * num2));
            System.out.println("Square : "+ (num1 * num1));
        }
        public static void main(String[] args) {
            MethodOverloading m = new MethodOverloading(10, 20, 10, 20);
                     
            m.display();
        }
       }
