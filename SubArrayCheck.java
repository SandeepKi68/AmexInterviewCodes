public class SubArrayCheck {
    static boolean isSubArray(int[] A,int[] B,int n,int m){
        for(int i=0;i<=n-m;i++){
            int j;
            for(j=0;j<m;j++){
                if(A[i+j]!=B[j]){
                    break;
                }
            }
            if(j==m){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] A = {2, 3, 0, 5, 1, 1, 2};
        int n = A.length;
        int[] B = {3, 0, 5, 1};
        int m = B.length;

        if (isSubArray(A, B, n, m))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
