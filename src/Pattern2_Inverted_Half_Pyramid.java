import java.util.Scanner;

public class Pattern2_Inverted_Half_Pyramid {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the triangle");
        int n=sc.nextInt();
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
