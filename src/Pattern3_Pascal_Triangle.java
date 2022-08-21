import java.util.Scanner;

public class Pattern3_Pascal_Triangle {
    public static void main(String args[]){
        //Pascal triangle - triangular array of binomial coefficients .
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the triangle");
        int n= sc.nextInt();
        int [][]arr=new int[n][n];
        // Iterate through every line and print integer(s) in it
        for (int i=0;i<n;i++){
            // Every line has number of integers equal to line number
            for (int j=0;j<=i;j++){
                // First and last values in every row are 1
                if(i==j||j==0){
                    arr[i][j]=1;
                }
                // Other values are sum of values just above and left of above
                else{
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
