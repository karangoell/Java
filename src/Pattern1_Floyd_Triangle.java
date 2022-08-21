import java.util.Scanner;

public class Pattern1_Floyd_Triangle {
    static int count=1;
    public static void main(String args[]){
        //Floyd's Triable is a right angles triangle with the arrangement of natural numbers
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of the triangle");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print(count+" ");

                Pattern1_Floyd_Triangle.count+=1;
            }
            System.out.println();
        }
    }
}
