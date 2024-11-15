class Solution {
    public int solution(int n) {
        if(n == 0 || n == 1) return n;
        int answer = 1 + n;
        for (int i = 2; i <= n/2; i++) {
                answer += n % i == 0 ? i : 0;
        }
        return answer;
    }
}