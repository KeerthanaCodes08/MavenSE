package hi.example.my_maven_java;

/**
 * Hello world!
 */
import java.io.*;
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
                InputStream input=App.class.getClassLoader()
                        .getResourceAsStream("config.properties");
                System.out.println(input);
    }
}
