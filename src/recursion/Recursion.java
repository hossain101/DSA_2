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
}
