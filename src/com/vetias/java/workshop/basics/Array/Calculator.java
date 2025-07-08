package workshop.basics.Array;

public class Calculator{

    public int divides(int a,int b){
        try{
            if(b==0){
                throw new ArithmeticException("Division by zero is not allowed:");
            }
            }catch(ArithmeticException e){
                System.out.println(e.getMessage());
                return 0;
            }
            return a/b;
            } 

        public static void main(String[] args) {
            Calculator calculator=new Calculator();
            System.out.println("Division:" + calculator.divides(5,0));
            System.out.println("Division:" + calculator.divides(3,9));
            System.out.println("Division:" + calculator.divides(7,4));
        }
    }


