package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionHandling {
    public void readFile() {
        File file = new File("files/numbers.txt");
        //Scanner fileReader = null;

        try(Scanner fileReader = new Scanner(file);) {
            while (fileReader.hasNext()) {
                System.out.println(fileReader.nextDouble());
            }
        } catch (FileNotFoundException | InputMismatchException error) {
            System.out.println(error.getMessage());
        } //finally {
//            assert fileReader != null;
//            fileReader.close();
//        }
    }
}
