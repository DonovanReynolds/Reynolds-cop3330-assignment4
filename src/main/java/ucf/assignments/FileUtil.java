package ucf.assignments;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Donovan Reynolds
 */

import java.io.*;

public class FileUtil {

    private File file;
    private boolean exists;


    public FileUtil(String path)
    {
        file = new File(path);
        exists = file.exists();
    }

    public File makeDirectory(String directory)
    {
        //makes a directory with the specified file
        //returns the file to the new directory
        return null;
    }

    public File getDirectory()
    {
        return file;
    }

    public BufferedReader makeReader() throws FileNotFoundException {
        return new BufferedReader(new FileReader(file));
    }

    public BufferedWriter makeWriter() throws IOException {
        return new BufferedWriter(new FileWriter(file));
    }
}
