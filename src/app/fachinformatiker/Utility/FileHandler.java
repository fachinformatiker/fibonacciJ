package app.fachinformatiker.Utility;

import app.fachinformatiker.constants.constants;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;

public class FileHandler {

    public static void initializeFile() {
        try {
            File myObj = new File(constants.LOGFILE);
            if (myObj.createNewFile()) {
                System.out.println(constants.FILE_CREATED + myObj.getName());
            } else {
                Debug.returnInfo(constants.FILE_EXISTS);
            }
        } catch (IOException e) {
            System.out.println(constants.FILE_ERROR);
            e.printStackTrace();
        }
    }

    public static void writeToFile(String String) {

        BufferedWriter bw = null;
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        try {
            bw = new BufferedWriter(new FileWriter(constants.LOGFILE, true));
            bw.write(timestamp + " - " + String);
            bw.newLine();
            bw.flush();
            Debug.returnInfo(constants.FILE_SUCCESS);
        } catch (IOException e) {
            System.out.println(constants.FILE_ERROR);
            e.printStackTrace();
        } finally {
            if (bw != null) try {
                bw.close();
            } catch (IOException e) {
                System.out.println(constants.FILE_ERROR);
                e.printStackTrace();
            }
        }
    }

}
