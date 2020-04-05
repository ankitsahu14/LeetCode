class Solution {
    public int reverse(int x) {
        long ans = 0;
        int a =x;
        while(a!=0){
            int r = a%10;
            ans = ans*10+r;
            a=a/10;
        }
        if(ans<Integer.MIN_VALUE || ans>Integer.MAX_VALUE)
            return 0;
        else
            return (int)ans;
    }
}
