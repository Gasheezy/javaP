import java.util.Scanner;
class HelloWorld{
//     public static void main(String[] args) {
        
//     System.out.println("Hello World");
        
//     }
// }

//class Main{

    public static void main(String[] args) {

        double myDouble = 3.4;
        float myFloat = 3.4F;

        int a = 8, b = 20, result;

        double myDoubScienti = 3.445e2;

        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(myDoubScienti);

        result = --b;
        System.out.println(result);

        String str = "Programiz";
        boolean result1;

        result1 = str instanceof String;
        System.out.println("Is str an object of String? " +result1);

        int febDays = 29;
        String result2;

        result2 = (febDays == 29) ? "Not a leap year" : "Leap Year";
        System.out.println(result2);

        System.out.println("1. println ");
        System.out.println("2. println ");

        Scanner input = new Scanner (System.in);
        int number = input.nextInt();
    
    }
} 