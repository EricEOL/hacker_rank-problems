package AppleAndOrange;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AppleAndOrange {
    public static void main(String[] args) {
        List<Integer> apples = Arrays.asList(2, 3, -4);
        List<Integer> oranges = Arrays.asList(3, -2, -4);
        AppleAndOrange.countApplesAndOranges(7, 10, 4, 12, apples, oranges);
    }

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        List<Integer> transformApples = apples.stream().map(apple -> apple = apple + a).collect(Collectors.toList());
        List<Integer> transformOranges = oranges.stream().map(orange -> orange = orange + b).collect(Collectors.toList());

        int countApples = 0;
        int countOranges = 0;

        for(int apple: transformApples) {
            if(apple >= s && apple <= t) countApples++;
        }
        for(int orange: transformOranges) {
            if(orange >= s && orange <= t) countOranges++;
        }

        System.out.println(countApples);
        System.out.println(countOranges);
    }
}
