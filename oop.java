// class oop{
//     public static void main(String[] args) {}

//     //state or field
//     private int gear = 5;

//     //behavior or method
//     public void braking (){
//         System.out.println("Working of braking");
//     }
// }

//------------Java Classes and Objects-------------
/*class lamp{
    boolean isOn;

    void turnOn(){
        isOn = true;
        System.out.println("Lights On? " +isOn);
    }

    void turnOff(){
        isOn = false;
        System.out.println("Lights Off? " +isOn);
    }
}

class Main {
    public static void main(String[] args) {
        lamp led = new lamp();
        lamp halogen = new lamp();
        
        led.turnOn();
        halogen.turnOff();
    }
}*/

//------------Classes and Objects-------------
/*class Main{
    public int addNumbers(int a, int b){
        int sum = a +b;
        return sum;
    }
public static void main(String[] args) {
    int num1 = 59;
    int num2 = 79;
    
    Main obj = new Main();
    //calling method
    int result = obj.addNumbers(num1, num2);
    System.out.println("Sum is " +result);
}
}*/

//------------Method for Code Reusability-------------
/*class Main{

    //method defined
    private static int getSquare(int x) {
        return x * x;
    }

   public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            int result = getSquare(i);
            System.out.println("Square of " + i +" is: " +result);
        }
    }
}*/

//----Method Overloading by changing the number of arguments-----------
/*class MethodOverLoading{
    private static void display (int a){
        System.out.println("Arguments: " +a);
    }
    private static void display (int a, int b){
        System.out.println("Arguments " +a + " and " +b);
    }
    public static void main(String[] args) {
        display(1);
        display(1, 4);
            
    }
}*/

//---------------Parameterized constructor-------------------
/*class Main{
    Main(String languages){
        System.out.println(languages + " programming language");
    }
    public static void main( String[] args) {

        //call constructor by passing a single value
        Main obj1 = new Main("Java");
        Main obj2 = new Main("Python");
        Main obj3 = new Main("Ruby");
    }
}*/

//---------------Join two Strings-------------------
class Main{
    public static void main(String[] args) {      
        String first = "Java ", second = "programming";

    System.out.println("First string is: " +first);
    System.out.println("Second string is: " +second);
    System.out.println("Joined String is " +first.concat(second));
    }
    
}