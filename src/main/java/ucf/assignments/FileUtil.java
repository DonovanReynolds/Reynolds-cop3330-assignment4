package ucf.assignments;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Donovan Reynolds
 */

import java.io.*;

public class FileUtil {


    public static void makeDirectory()
    {
        new File(getDirectory() + "List_Data").mkdir();
    }

    public static File getDirectory()
    {
        return new File(System.getProperty("user.dir"));
    }

    public static BufferedReader makeReader(String fileName) throws IOException {
        return new BufferedReader(new FileReader(getOutput(fileName)));

    }

    public static BufferedWriter makeWriter(String fileName , boolean newFile) throws IOException {
        return new BufferedWriter(new FileWriter(getOutput(fileName) , newFile));
    }

    public static void writeToFile(String string, String fileOutput) throws IOException
    {
        BufferedWriter write = FileUtil.makeWriter(fileOutput , false);

        write.write(string);
        write.close();
    }

    public static void appendToFile(String string, String fileOutput) throws IOException
    {
        BufferedWriter write = FileUtil.makeWriter(fileOutput , true);

        write.write(string);
        write.close();
    }

    public static File getOutput(String fileOutput) throws IOException {
        if (!new File(getDirectory() + "\\List_Data").exists())
        {
            makeDirectory();
        }
        //System.out.println(getDirectory() + "\\List_Data");
        File outputFile = new File(getDirectory() + "\\List_Data\\" + fileOutput);
        if (!outputFile.exists())
        {
            outputFile.createNewFile();
        }
        else
        {
            //System.out.println("NoFileCreated");
        }
        //System.out.println(fileOutput);
        return outputFile;
    }

}
