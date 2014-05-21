import java.io.File;

/**
 * Created by M4Sh on 2014-05-21.
 */

public class Main {
    private static RegexTranslator regex;

    public static void main(File file) {
        regex = new RegexTranslator(file);
        regex.doTheMagic();
    }
}
