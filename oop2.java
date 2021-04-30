class oop2{
    //method and field of parent class
    String name;
    public void eat(){
        System.out.println("I can eat");
    }

}
//inherit from oop2
class Dog extends oop2{

    //new method in subclass
    public void display(){
        System.out.println("My name is " +name);
    }
}
class main2{
    public static void main (String [] args){

        //create an object of the subclass
        Dog labrador = new Dog();

        //access field of superclass
        labrador.name = "Rohu";
        labrador.display();

        //call method of superclass
        //using objects of subclass
        labrador.eat();
    }
}