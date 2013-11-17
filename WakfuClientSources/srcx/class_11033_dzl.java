import com.sun.jna.Native;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class dzl
{
  protected void finalize()
  {
    Iterator localIterator;
    synchronized (Native.agp()) {
      for (localIterator = Native.agp().entrySet().iterator(); localIterator.hasNext(); ) {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        Native.a((Class)localEntry.getKey(), (long[])localEntry.getValue());
        localIterator.remove();
      }
    }
  }
}