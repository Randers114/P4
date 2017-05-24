package event;


import javax.swing.event.EventListenerList;

public class FireableError {
    private EventListenerList eventListenerList = new EventListenerList();

    public void AddErrorListener(ErrorListener e){
        eventListenerList.add(ErrorListener.class, e);
    }

    protected void FireError(ErrorEvent e) {
        ErrorListener[] ls = eventListenerList.getListeners(ErrorListener.class);
        for (ErrorListener l : ls) {
            l.Error(e);
        }
    }
}
