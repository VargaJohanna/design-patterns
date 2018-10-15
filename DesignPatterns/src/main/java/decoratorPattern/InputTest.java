package decoratorPattern;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    @Test
    public void main() throws IOException{
        int c;

        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("C:\\Users\\varga\\IdeaProjects\\cucumber-jvm\\DesignPatterns\\src\\main\\java\\decoratorPattern\\test.txt")));

            while ((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
