import java.util.*;

public class Connection {

    public static void main(String[] args) {
        int income = 9500;
        int answer = 0;
        int[][] taxes = {{1200, 6}, {4600, 15}, {8800, 24}, {15000, 35}, {0, 38}};
        // 정렬
        Arrays.sort(taxes, Comparator.comparingInt(o1 -> o1[1]));

        List<Integer> money_list = new ArrayList<>();
        List<Integer> percent_list = new ArrayList<>();

        for (int i = 0; i < taxes.length; i++) {
            money_list.add(taxes[i][0]);
            percent_list.add(taxes[i][1]);
        }
        for (int i = 0; i < taxes.length; i++) {
            [i]
        }
//        // 다시 배열로 변환
        int[] money = money_list.stream().mapToInt(Integer::intValue).toArray();
        int[] percent = percent_list.stream().mapToInt(Integer::intValue).toArray();

        int [] arr2 = new int[money.length];
        arr2[0] = money[0] * percent[0]/100;
        for (int i = 0; i < money.length-2; i++) {
            arr2[i+1] = (money[i + 1] - money[i]) * percent[i+1] / 100;
        }


        if(money[0] >= income){ // 가장 작은 값 이하
            answer += percent[0] * income /100;
        } else if (money[money.length-1] < income){ // 가장 큰 값 이상
            int sum = Arrays.stream(arr2).sum();
            answer += sum;
            answer += (income-money[money.length-2]) *  percent[money.length-1] / 100;
        }
        else { // 기준을 찾아야 함
            for (int i = 0; i < money.length-1; i++) {
                int standard = 0;
                if (money[i] <= income && income< money[i+1]) {
                    standard = i;
                    for (int j = 0; j < standard-1; j++) {
                        answer += arr2[j];
                    }
                    answer += (income-money[standard]) *  percent[standard] / 100;
                }
            }
        }System.out.println(answer);
    }
}
