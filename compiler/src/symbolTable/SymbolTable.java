package symbolTable;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 * Created by Simon on 4/5/2017.
 */
public class SymbolTable {
    public final int NUMBER = 1;
    public final int BOOL = 2;
    public final int MOTOR = 3;
    public final int SENSOR = 4;
    public final int TOUCH_SENSOR = 5;
    public final int ULTRASONIC_SENSOR = 6;
    public final int LIST = 7;
    public final int VOID = 8;

    public SymbolTable()
    {
        hashtable = new Hashtable<String, String>();
        childTables = new ArrayList<SymbolTable>();
        parentTables = new ArrayList<SymbolTable>();
    }

    public Hashtable<String, String> hashtable;
    public List<SymbolTable> childTables;
    public List<SymbolTable> parentTables;

    public void Insert(String varName, int dataType)
    {
        hashtable.Put(varName, dataType);
    }

    public void LookUp(String varName)
    {
        return hashtable.con;
    }

    public int GetDataTypeByKey_InHashTable(varName)
    {
        if (LookUp(varName))
            return
        else
            return -1;
    }
}
