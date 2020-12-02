import java.util.Comparator;

public class Genericclass {
    public static <T extends Comparable<T>> T maximum(T x,T y,T z){
        T max = x;
        if(y.compareTo(max) > 0)
            max=y;
        if(z.compareTo(max)>0)
            max=z;
        return max;
    }

    public static void main(String[] args) {
        System.out.println(".......Generics practices.......");
        System.out.println("Finding maximum for Integers");
        System.out.println("Maximum of 3,2,1 is: "+maximum(3,2,1));
        System.out.println("Maximum of 4,5,3 is: "+maximum(4,5,3));
        System.out.println("Maximum of 4,5,6 is: "+maximum(4,5,6));

        System.out.println("Finding maximum for Float");
        System.out.println("Maximum of 3.1,2.1,1.1 is: "+maximum(3.1,2.1,1.1));
        System.out.println("Maximum of 4.5,5.5,3.5 is: "+maximum(4.5,5.5,3.5));
        System.out.println("Maximum of 4.5,5.5,6.5 is: "+maximum(4.5,5.5,6.5));
    }
}
