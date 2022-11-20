import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Cote {
    public static void main(String[] args) {
        int[] arr = {1123, 1412, 23, 44, 512132};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        Collections.max(list);
        Collections.min(list);

        Collections.sort(list);
        Collections.sort(list, Collections.reverseOrder());
        Collections.reverse(list);

        Collections.frequency(list, 23);
    }
}
