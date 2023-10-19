import java.util.Arrays;
import java.util.List;

public class DisplayEvenAndOdd {
    public static void main(String[] args) {
     
     List<Integer> list = Arrays.asList(10,20,24,26,27,29,30);
     
     list.stream().filter(x-> x%2 ==0).forEach(System.out::println);
     
     System.out.println(" ----------- ");
     
     list.stream().filter(n -> n%2!=0).forEach(System.out::println);
      
    }
}