package recursion;

public class Recursion {
    public void method1(){
        method2();
        System.out.println("Printing method 1 yoo");
    }

    public void method2(){
        method3();
        System.out.println("Printing method 2 yoo");
    }

    public void method3(){

        System.out.println("Printing method 3 yoo");
    }


    public double factorial(double n){
        if(n==1) return 1;


       double result = n* factorial(n-1); // The result is n * the result from the previous recursion.

        System.out.println(result);

        return result;

    }
}
