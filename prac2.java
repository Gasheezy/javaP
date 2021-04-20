public class prac2 {
    public static void main(String[] args) {
//---------------Arrays start---------------------------    
       /* int[] age = {12, 58, 35, 71, 95};

        System.out.println("Accessing elements of an array");
        System.out.println("First element is: " + age[0]);
        System.out.println("First element is: " + age[1]);
        System.out.println("First element is: " + age[2]);
        System.out.println("First element is: " + age[3]);*/

        /*int [] age = {15, 87, 19};

        System.out.println("Using for each loop");
        for (int g: age){
            System.out.println(g);
        }*/

//-------Compute Sum and Average of Array Elements--------
    /*int [] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
    int sum = 0;
    Double average;

    for (int number : numbers){
        sum += number;
    }

    int arrayLength = numbers.length;
    average = ((double)sum) / ((double)arrayLength);

    System.out.println("Sum of the numbers is: " +sum);
    System.out.println("Average of the numbers is: " +average);*/

//---------------for each loop for multidimensional array--------------    
    /*int [][] a = {
        {1, -2, 3}, 
                {-4, -5, 6, 9}, 
                {7}, 
        };
        for (int [] innerArray : a){
            for (int data : innerArray){
                System. out.println(data);
            }
        }*/

//---------------for each loop for 3D array---------------------------    
        /*int [][][] test = {
            {
                {1, -2, 3}, {2, 3, 4}
            },
            {
                {-4, -5, 6, 9}, {1}, {2, 3}
            }
        };

        for (int [][] array2D : test){
            for (int [] array1D : array2D){
                for (int item : array1D){
                    System.out.println(item);
                }
            }
        }*/

        int [] numbers = {1, 2, 3, 4, 5, 6};
        int [] positiveNumbers = numbers;    // copying arrays

        numbers[0] = -1;

        for (int number: positiveNumbers) {
            System.out.print(number + ", ");
        }
    }
}
