class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int score = 0;
        for(int i=0;i<k;i++){
            score += cardPoints[i];
        }
        int maxscore = score;
        int l = k-1;
        int r = cardPoints.length-1;
        while(l>=0){
            score -= cardPoints[l];
            score += cardPoints[r];
            maxscore = Math.max(maxscore,score);
            l--;
            r--;
        }
        return maxscore;
    }
}