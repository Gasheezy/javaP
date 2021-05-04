//this is a functional interface
/*@FunctionalInterface
interface MyInterface{

    //abstract method
    double getPiValue();
}

class lambda {
    public static void main(String[] args) {
        //declare a reference to MyInterface
        MyInterface ref;

        //lambda expression
        ref = ()-> 3.1415;

        System.out.println("Value of pi is: " + ref.getPiValue());
    }
}*/

//-------Lambda expression with parameters-----------
@FunctionalInterface
interface MyInterface {
    //abstract method
    String reverse (String n);
}

class lambda {
    public static void main(String[] args) {
        //declare a reference to MyInterface
        //assign a lambda expression to the interface
        MyInterface ref = (str) -> {

            String result = "";
            for (int i=str.length()-1; i>=0; i--)
            result += str.charAt(i);

            return result;
        };

        //call the method of the interface
        System.out.println("Lambda reversed = " + ref.reverse("Lambda"));
    }
}

//-------Scanner Class-----------