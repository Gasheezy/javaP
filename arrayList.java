import java.util.ArrayList;

class arrayList{
    public static void main(String[] args) {
        //create ArrayList
        ArrayList<String> languages = new ArrayList<>();
        
        //add() method without the index parameter
        languages.add("Java");
        languages.add("C");
        languages.add("Python");
        languages.add("Ruby");
        System.out.println("Array List: " + languages);

        //add() method with index parameter
        languages.add(1, "Javascript");
        System.out.println("Updated List: " + languages);

        //get an alement from the arraylist
        //String str = languages.get(1);
        System.out.println("Element at index 1 is: " + languages.get(1));

        //convert an arrayList to an array
        String [] arr = new String[languages.size()];
        languages.toArray(arr);

        for (String item : arr){
            System.out.println(item + ",");
        }
        
    }
}