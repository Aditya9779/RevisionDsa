package Medium;

public class NthRootOfNumber {
    public static void main(String[] args) {
        System.out.println(nthRoot(4, 16));
    }
    // N=3 , M=27 so the root is 3^3 we have to return the root
    static int nthRoot(int N, int M){
        if (N==0 && M!=0) return 0;
        if (N!=0 && M==0) return 1;
       int start=1;
       int end=M;
       while (start<=end){
         int mid=(start+end)/2;
         if((Math.pow(N, mid))==M){
             return mid;
         }
         else if(Math.pow(N, mid)<M){
             start=mid+1;
         }
         else {
             end=mid-1;
         }
       }
       return -1;
    }
}
