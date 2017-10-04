import java.util.Scanner;


public class HelloWorldName
{

    public static void main(String args[])
    {

        String name = "";
        String name2 = "";


        System.out.println("What is your name?");
        Scanner keyboard = new Scanner(System.in);
        name = keyboard.nextLine();

        System.out.println(helloName(name + "" + name2));
    }

    public static String helloName(String name)

    {

        return "Hello,"+name+"!";
    }

}

