package ziuk;

import java.awt.*;
import java.io.*;
import java.util.Scanner;

import static javax.print.attribute.standard.MediaSizeName.C;

/**
 * Created by RENT on 2017-01-10.
 */
public class pobieranie {

        public void readFile(String filePath) throws IOException {
            FileReader fileReader = new FileReader(C:\Users\RENT\Desktop);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            try {
                String textLine = bufferedReader.readLine();
                do {
                    System.out.println(textLine);

                    textLine = bufferedReader.readLine();
                } while (textLine != null);
            } finally {
                bufferedReader.close();
            }
        }

    }
}
