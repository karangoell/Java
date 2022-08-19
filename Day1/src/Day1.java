import java.util.*;

public class Day1 {
    public static void main(String[] args) {
//1. Basic Java Programs
        //1. Basic Print Statement
        System.out.println("Hello Karan");

        //2. Read and print a string value
        String a="",b="";
        Scanner sc= new Scanner(System.in);
        System.out.println("How are you ?");
        a= sc.next();
        System.out.println("I am "+a);
        //Important concept in the next line. Make sure to take the whole left over line including the new line.
        sc.nextLine();
        System.out.println("How old are you?");
        int c= Integer.parseInt(sc.nextLine());
        System.out.println("I am "+c+" years old.");

        //Simply using nextLine would skip it from reading the
        //text from the user as the curser is still at the reader for variable "a"
        //and the scanner class starts reading from the place where you entered the character/word for
        //variable "a" . After enter it goes to the new line as we are using nextLine and is represented by
        // "\n" . Hence the variable stored in b is just new line i.e. "\n".

        //To solve this issue we use parseInt or we consume the leftover new line
        //a. //Read the complete line as a string and convert it to integer
        //int a=Integer.parseInt(sc.nextLine());

        //Now To take a whole line
        System.out.println("You sure?");
        b= sc.nextLine();
        System.out.println("Yes I am " +b);

    }

}
