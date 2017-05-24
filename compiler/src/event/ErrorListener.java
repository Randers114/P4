package event;


import java.util.EventListener;

public interface ErrorListener extends EventListener{
    void Error(ErrorEvent event);
}
