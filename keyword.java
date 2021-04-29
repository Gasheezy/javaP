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
class keyword {
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
} 


//--------this in Constructor Overloading-------------
//------------this Keyword-------------
//------------this Keyword-------------
//------------this Keyword-------------


