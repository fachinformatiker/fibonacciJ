package app.fachinformatiker.Utility;

import app.fachinformatiker.constants.constants;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

    public static void initializeFile() {
        try {
            File myObj = new File(constants.LOGFILE);
            if (myObj.createNewFile()) {
                System.out.println(constants.FILE_CREATED + myObj.getName());
            } else {
                System.out.println(constants.FILE_EXISTS);
            }
        } catch (IOException e) {
            System.out.println(constants.FILE_ERROR);
            e.printStackTrace();
        }
    }

    public static void writeToFile(String String) {
        try {
            FileWriter myWriter = new FileWriter(constants.LOGFILE);
            myWriter.write(String);
            myWriter.close();
            System.out.println(constants.FILE_SUCCESS);
        } catch (IOException e) {
            System.out.println(constants.FILE_ERROR);
            e.printStackTrace();
        }
    }

}
