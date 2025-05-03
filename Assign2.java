public class Assign2 {
    public static void q1() {
        int num = 345;
        int unit = num%10;
        System.out.println("Unit digit of "+num+" is: "+unit);
    }
    public static void q2() {
        int num = 253;
        int rmvLastDgt = num/10;
        System.out.println(num+" without last digit: "+rmvLastDgt);
    }
    public static void q3() {
        int num1 = 25;
        int num2 = 46;
        System.out.println("Org value of num1:"+num1+" & num2:"+num2);
        int num3 = num1;
        num1=num2;
        num2=num3;
        System.out.println("Swap value of num1:"+num1+" & num2:"+num2);
    }
    public static void q4() {
        int num1 = 10;
        int num2 = 20;
        System.out.println("Org value of num1:"+num1+" & num2:"+num2);
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        System.out.println("Swap value of num1:"+num1+" & num2:"+num2);
    }
    public static void q7() {
        System.out.println("Output of 35&83: "+(35&83));
    }
    public static void q8() {
        System.out.println("Output of 47|29: "+(47|29));
    }
    public static void q9() {
        System.out.println("Output of 76^108: "+(76^108));
    }
    public static void q10() {
        int num = 123;
        int num2 = num%10 * 100 + (num/10);
        System.out.println("Output after rotate "+num+" toward right: "+num2);
    }
}
