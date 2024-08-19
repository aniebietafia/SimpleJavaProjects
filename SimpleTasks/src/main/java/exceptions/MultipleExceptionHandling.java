package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionHandling {
    public void readFile() {
        File file = new File("files/numbers.txt");
        File outputFile = new File("files/output.txt");
        //Scanner fileReader = null;

        try(
                Scanner fileReader = new Scanner(file);
                PrintWriter fileWriter = new PrintWriter(outputFile)
        ) {
            while (fileReader.hasNext()) {
                //System.out.println(fileReader.nextDouble());
                fileWriter.println(fileReader.nextDouble());
            }
        } catch (FileNotFoundException | InputMismatchException error) {
            System.out.println(error.getMessage());
        } //finally {
//            assert fileReader != null;
//            fileReader.close();
//        }
    }
}
