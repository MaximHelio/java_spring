class Solution{
    public int solution(String[] babbling){
        int answer = 0;
        for (int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replace("aya", " ");
            babbling[i] = babbling[i].replace("ye", " ");
            babbling[i] = babbling[i].replace("ma", " ");
            babbling[i] = babbling[i].replace("woo", " ");
            babbling[i] = babbling[i].replace(" ", "");

            if(babbling[i].length() == 0){
                answer += 1;
            }

        }
        return answer;

    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] arr = {"aya", "yee", "u", "maa", "wyeoo"};
        System.out.println(sol.solution(arr));
    }
}
