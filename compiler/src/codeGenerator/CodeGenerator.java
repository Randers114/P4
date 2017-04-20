package codeGenerator;

import abstractSyntaxTree.nodes.*;
import symbolTable.*;

/**
 * Created by lassekristensen on 20/04/2017.
 */

public class CodeGenerator {

    public boolean test (Node node1){
        int i = 1;
        if(i == 1)
        {
           System.out.println("Fuck Simon");
        }
        else
        {
            System.out.println("Simon sutter");
        }

        return false;
    }

    public boolean test2(SymbolTable st){
        return false;
    }

}
