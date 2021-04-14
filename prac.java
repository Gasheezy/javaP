class HelloWorld{
    public static void main(String[] args) {

       /* double myDouble = 3.4;
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
        System.out.println("2. println ");*/

        /*Scanner input = new Scanner (System.in);
        System.out.print("Enter an Intereger: ");
        //int number = input.nextInt();
        System.out.println("You entered number " + (input.nextInt()));

        input.close();*/

//------------Nested if Example--------------------------
        /*Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largest;
        if (n1>=n2){
            if (n1>=n3) {
                largest = n1;
            } else {
                largest = n3;
            }
        }
        else{
            if (n2>=n3) {
                largest = n2;
            } else {
                largest = n3;
            }
        }
        System.out.println("Largest Number is: " +largest);*/

//------------Java switch Statement--------------------------
        /*int number = 42;
        String size;

        switch (number){
            case 29:
            size = "small";
            break;
            
            case 42:
            size = "medium";
            break;

            case 44:
            size = "Large";
            break;

            case 48:
            size = "Extra Large";
            break;

            default:
            size = "Unknown";
            break;
            
        }
    System.out.println("Size: " + size);*/

//------------Java for-each Loop-------------------------
        int[] numbers = {3, 5, 7, -5};    //creating an array

        for (int number: numbers){      //iterating through the array
            System.out.println(number);
        }

    }
} 