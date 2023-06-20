// Question 24 - Lesson 7 Parameters and local variabe

public class VoidMethTest {
    public static int method1() {
        return 1;
    }

    public static int method2() {
        return 2;
    }

    public static int method3() {
        return 3;
    }

    public static int method4() {
        return 4;
    }

    public static int method5() {
        return 5;
    }

    public static int method6() {
        return 6;
    }

    public static void main(String[] args) {
        
	// Call the methods and th‏eir return values
	
	int number1 = method1();
        int number2 = method2();
        int number3 = method3();
        int number4 = method4();
        int number5 = method5();
        int number6 = method6();


	// Here we print the values
        System.out.println("Method 1 returns: " + number1);
        System.out.println("Method 1 returns: " + number2);
        System.out.println("Method 1 returns: " + number3);
        System.out.println("Method 1 returns: " + number4);
        System.out.println("Method 1 returns: " + number5);
        System.out.println("Method 1 returns: " + number6);
	System.out.println("End of print");
    }

}