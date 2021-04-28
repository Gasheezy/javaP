//------------Protected Access Modifier-------------
/*class accessModifiers {
    protected void display (){
        System.out.println("I am an animal");
    }
}

class Dog extends accessModifiers{
    public static void main(String[] args) {
     //create an object of class Dog
     Dog dog = new Dog();
     //access protected method
     dog.display();   
    }
}*/

//------------Public Access Modifier-------------
public class accessModifiers {
    // public variable
    public int legCount;

    // public method
    public void display() {
        System.out.println("I am an animal.");
        System.out.println("I have " + legCount + " legs.");
    }
}

// Main.java
class Main2 {
    public static void main( String[] args ) {
        // accessing the public class
        accessModifiers animal = new accessModifiers();

        // accessing the public variable
        animal.legCount = 4;
        // accessing the public method
        animal.display();
    }
}

