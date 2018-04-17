package stonesStrict.pattern_decorator.IOCase;

import java.io.*;

/**
 * Created by admin on 2018/4/17.
 */
public class LowerCaseTest {

    public static void main(String[] args) throws IOException {
        BufferedInputStream in = new BufferedInputStream(new LowerCaseInputStream(
                new FileInputStream("E:\\Projects\\DesignPattern\\src\\main\\java\\stonesStrict\\pattern_decorator\\IOCase\\LowerCaseInputStream.java")));
        int i;
        while ((i = in.read()) > -1) {
            System.out.print((char) i);
        }
    }

}
