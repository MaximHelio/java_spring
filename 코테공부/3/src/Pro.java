import java.util.*;

public class Pro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int building[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            building[i] = in.nextInt();
        }

        System.out.println(checkAllBuilding(building, n));
    }

    public static int checkAllBuilding(int[] building, int n) {
        int max = 0;

        for (int i = 1; i <= n; i++) {
            int sum = calcGradient(building, i, n, 1) + calcGradient(building, i, n, -1);
            max = Math.max(max, sum);
        }

        return max;
    }

    public static int calcGradient(int[] building, int index, int n, int dx) {
        if ((index == 1 && dx < 0) || (index == n && dx > 0)) {
            return 0;
        }

        int num = 1;
        int checkIndex = index + dx;
        long gradientY = building[index] - building[checkIndex];
        long gradientX = index - checkIndex;

        while (true) {
            checkIndex += dx;
            if (checkIndex <= 0 || checkIndex > n) {
                break;
            }

            long nextGradientY = building[index] - building[checkIndex];
            long nextGradientX = index - checkIndex;
            if (isPossible(gradientY, gradientX, nextGradientY, nextGradientX, dx)) {
                gradientY = nextGradientY;
                gradientX = nextGradientX;
                num++;
            }
        }
        return num;
    }

    public static boolean isPossible(long gradientY, long gradientX, long nextGradientY, long nextGradientX, int dx) {
        if (dx > 0) { // 포인터가 오른쪽으로 움직이고 있는 경우 - 기울기가 증가해야 함
            return nextGradientY * gradientX > gradientY * nextGradientX;
        }

        // 포인터가 왼쪽으로 움직이고 있는 경우 - 기울기가 감소해야 함
        return nextGradientY * gradientX < gradientY * nextGradientX;
    }
}
 