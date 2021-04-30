//------------this Keyword-------------
/*class keyword{
    int instVar;

    keyword (int instVar){
        this.instVar = instVar;
        System.out.println("this reference = " + this);

    }
    public static void main(String[] args) {
        keyword obj = new keyword(8);
        System.out.println("object reference = " + obj);
    }
}*/

//------------this with Getters and Setters-------------
/*class keyword {
    String name;

    //setter method
    void setName(String name){
        this.name = name;
    }
    //getter method
    String getName(){
        return this.name;
    }
    public static void main (String[] args){
        keyword obj = new keyword();

        //calling the getter and the setter methods
        obj.setName("Toshiba");
        System.out.println("obj.name: " + obj.getName());
    }
} */

//--------this in Constructor Overloading-------------
class keyword {
    private int a, b;

    //constructor with 2 parameters
    private keyword (int i, int j){
        this.a = i;
        this.b = j;
    }
    //constructor with single parameter
    private keyword(int i){
        //invokes the constructor with 2 parameters
        this(i, i);        
    }
    //constructor with no parameter
    private keyword(){
        //invokes the constuctor with single parameter
        this(0);
    }

    @Override
    public String toString(){
        return this.a + "+" + this.b + "i";
    }
    public static void main (String[] args){
        //creating object of keyword class
        //calls the constructor with 2 parameters
        keyword c1 = new keyword(2, 3);

        //calls the constructor with single parameters
        keyword c2 = new keyword(3);

        //calls the constructor with no parameters
        keyword c3 = new keyword();

        //print objects
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}

//------------this Keyword-------------
//------------this Keyword-------------
//------------this Keyword-------------


