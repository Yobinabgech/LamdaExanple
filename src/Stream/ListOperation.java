package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOperation {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
//        List<Integer> integers = new ArrayList<>();
//        System.out.println(integers.size());
//        integers.add(3);
//        integers.addAll(nums);


        int sum = nums.stream().mapToInt(Integer::intValue).sum();

        int average = sum / nums.size();
        System.out.println(average);

        //Compute average = sum / number of elements in array.

        System.out.println(sum);

        Double aDouble = nums.stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);
        System.out.println(aDouble);


        List<Integer> filtered = nums
                .stream()
                .filter(c -> c > 10)
                .collect(Collectors.toList());


        filtered.forEach(System.out::println);

//      find the first odd number in List<Integer>
//        Add odd numbers in the List using stream
//        Multiply numbers in the List using stream

        List<Integer> oddList = nums.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());

        System.out.println(" Add odd numbers in the List using stream : " + oddList);

        List<Integer> evenList = nums.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(" Add even numbers in the List using stream : " + evenList);

        int mul[] = {1,2,3,4,5,6,7,8};
        System.out.println("Mulitply  numbers in  the list using stream" +  Arrays.stream(mul)
                .reduce(1, (m,n) -> m*n));




    }
}
