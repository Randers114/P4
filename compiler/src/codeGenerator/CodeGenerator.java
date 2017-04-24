package codeGenerator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Created by lassekristensen on 20/04/2017.
 */

public class CodeGenerator {
    public void openfile() {
        try {
            File file = new File(("newfile.C"));

            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists.");
            }
        }
        catch (IOException exception) {
            exception.printStackTrace();
        }

        try {
            PrintWriter writer = new PrintWriter("newfile.C", "UTF-8");
            writer.println("#include <stdio.h>");

            writer.close();
        }
        catch (IOException exception) {
            System.out.println(exception);
        }
    }

   /* public int treewalk(Node node)
    {
        int result = 0;


        return result;
    }*/


    }




