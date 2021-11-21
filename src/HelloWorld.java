import java.util.Scanner;

public class HelloWorld {

    public static void main(String... args){
        Scanner scanner = new Scanner("Hello\nMy\nDear\nWorld!\n");
        while(scanner.hasNext())
            System.out.println(scanner.nextLine());
    }
}
