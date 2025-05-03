public class Assign3 {
    public static void q1() {
        char c = 'A';
        System.out.println(c+" after increment is :"+(++c));
    }
    public static void q2() {
        int c = '+';
        System.out.println("Unicode of '+' is :"+c);
    }
    public static void q3() {
        int num = 2345;
        num = num/10*10;
        System.out.println(num);
    }
    public static void q4() {
        int num = 123;
        int sum = num%10 + (num/10%10) + (num/100);
        System.out.println("Sum of digits of "+num+" is: "+sum);
    }
    public static void q9() {
        int num = 456;
        int rev = num%10*100 + (num/10%10)*10 + (num/100);
        System.out.println("Reverse of "+num+" is: "+rev);
    }
    public static void q10() {
        char num = 100;
        System.out.println("Unicode of character 100 is: "+num);
    }    
}
