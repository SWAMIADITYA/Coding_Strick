public class Day1{

    public static void method1(int num1, int num2){
        int a=num1;
        int b=num2;
        int sum = a+b;

        System.out.println("sum is ="+ sum);
    }

    public static void method1(int num1, int num2, int num3){
        int a=num1;
        int b=num2;
        int c=num3;
        int sum = a+b+c;

        System.out.println("sum is ="+ sum);
    }
    public static void main(String[] args){
       System.out.println("aditya swami comning back"); 
       method1(10,20);
       method1(100,200);
       method1(100,200,300);
    }
}