import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=in.nextLine();

        System.out.println("Enter your Age");
        int age=in.nextInt();


        System.out.println(name + " is "+age+" years old.");

    }
}
