package plugin.event;

import java.util.HashMap;
import java.util.Map;

public class EventInformation {

    private Map<String, Object> args;
    private boolean cancel = false;

    public EventInformation() {
        args = new HashMap<String, Object>(20);
    }

    public EventInformation(Map<String, Object> args) {
        this.args = new HashMap<String, Object>(args);
    }

    public Object get(String name) {
        if (!args.containsKey(name)) {
            return null;
        }
        return args.get(name);
    }

    public EventInformation set(String name, Object obj) {
        args.put(name, obj);
        return this;//pour permettre le stackage de .set().set().set;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void cancel() {
        this.cancel = true;
    }

}
