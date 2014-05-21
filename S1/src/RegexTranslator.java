/**
 * Created by M4Sh on 2014-05-21.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexTranslator {
    Pattern regex;
    Scanner inFile;

    public RegexTranslator(File textToTranslate){
        this.regex.pattern();
        try {
            this.inFile = new Scanner(textToTranslate);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public File doTheMagic() {
        while (this.inFile.hasNextLine() == true) {
            regex.matcher(inFile.nextLine());

        }
        return null;
    }

}
