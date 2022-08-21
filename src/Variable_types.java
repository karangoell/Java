public class Variable_types {
    public String Karan;//Instance variable
    public static String KaranPro="Karangoel";

    public Variable_types(){
            //Default Constructor
            this.Karan="Karan Goel";
        }
        public static void main(String args[]){
            //Difference between local, static and instance variable
            //Local Variable - Defined within a method and accessible in the method and initialized before using.
            //Instance Variable - Defined outside method at class level and accessible throughout whole class and is always given a default value based on data type and does not require to be initialized before.
            //(can Only be accessed with objects and are created when object of class is created)
            //Static Variable - Defined at class level outside method and accessible throughout the class. it is given default value so no need to initialize before.
            //(It requires static keyword to be specified along with the access specifier)
            int a=10;
            System.out.println("Local variable is : "+a);

            //Instance varibale called using object
            Variable_types d2 = new Variable_types();
            System.out.println("Hello instance variable name "+d2.Karan);

            //No need to initialize static variable and its default value is 0
            System.out.println("Static varibale are always called using the class name and the static variable is "+Variable_types.KaranPro);
        }
    }

