package event;


import java.util.EventObject;

public class ErrorEvent extends EventObject{
    public ErrorEvent(Object source) {
        super(source);
    }
}
