import java.util.*;
public class String_User_Input {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //To include space we use nextLine()
        String a = sc.nextLine();
        System.out.println("What is your name? ");
        System.out.println("My name is "+a);
    }
}
