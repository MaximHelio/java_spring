public class Main {
    static class Solution {
        public int solution(int[] common) {
            int answer = 0;

            //등차수열인지 체크
            if (common[1] - common[0] == common[2] - common[1]) {
                int d = common[1] - common[0];
                answer = common[common.length-1] + d;
            } else {// 등비수열인지 체크
                int e = common[1] / common[0];
                answer = common[common.length-1] * e;
            }
            return answer;
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {2, 4, 8};
        System.out.println(sol.solution(arr));
    }

}
