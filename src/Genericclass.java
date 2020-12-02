import java.util.Comparator;

public class Genericclass {
    public static <T extends Comparable<T>> T maximumof3(T x,T y,T z){
        T max = x;
        if(y.compareTo(max) > 0)
            max=y;
        if(z.compareTo(max)>0)
            max=z;
        printmax(x,y,z,max);
        return max;
    }
    public static <T extends Comparable<T>> T printmax(T x,T y,T z,T max){
        T maximum =max;
        System.out.println("Maximum of x,y,z is: "+maximum);
        return maximum;
    }

    public static <T extends Comparable<T>> T maximumoflist(T[] list){
        T max = list[0];
        for(int i=1;i<list.length;i++){
            if(list[i].compareTo(max)>0){
                max=list[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(".......Generics practices.......");
        System.out.println("Finding maximum for Integers");
        //System.out.println("Maximum of 3,2,1 is: "+maximumof3(3,2,1));
        //System.out.println("Maximum of 4,5,3 is: "+maximumof3(4,5,3));
        //System.out.println("Maximum of 4,5,6 is: "+maximumof3(4,5,6));
        System.out.println(maximumof3(3,2,1));

        System.out.println("Finding maximum for Float");
        //System.out.println("Maximum of 3.1,2.1,1.1 is: "+maximumof3(3.1,2.1,1.1));
        //System.out.println("Maximum of 4.5,5.5,3.5 is: "+maximumof3(4.5,5.5,3.5));
        //System.out.println("Maximum of 4.5,5.5,6.5 is: "+maximumof3(4.5,5.5,6.5));
        System.out.println(maximumof3(3.1,2.1,1.1));

        System.out.println("Finding maximum for Strings");
        //System.out.println("Maximum of Apple, Peach, Banana is: "+maximumof3("Apple","Peach","Banana"));
        //System.out.println("Maximum of Peach, Banana, Apple is: "+maximumof3("Apple","Banana","Peach"));
        //System.out.println("Maximum of Apple, Peach, Banana is: "+maximumof3("Banana","Apple","Peach"));
        System.out.println(maximumof3("Banana","Apple","Peach"));


        System.out.println("Finding maximum of more than 3 elements");
        Integer[] intarray = {1,2,3,4,5,6};
        Double[] doublearray = {1.1,2.2,3.3,4.4,5.5};
        String[] stringarray = {"hello","peach","banana","mango","apple"};
        System.out.println("Maximum of integer array: "+maximumoflist(intarray));
        System.out.println("Maximum of Float array: "+maximumoflist(doublearray));
        System.out.println("Maximum of String array: "+maximumoflist(stringarray));
    }
}
