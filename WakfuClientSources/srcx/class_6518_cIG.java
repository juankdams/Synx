import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.keplerproject.luajava.LuaState;

public class cIG
{
  private final String m_name;
  private final Map iGv = new HashMap();

  public cIG() {
    this.m_name = null;
  }

  public cIG(String paramString) {
    this.m_name = paramString;
  }

  public final void v(String paramString, Object paramObject) {
    this.iGv.put(paramString, paramObject);
  }

  public final String getName() {
    return this.m_name;
  }

  public final void d(LuaState paramLuaState) {
    if ((!bB) && (this.m_name == null)) throw new AssertionError();
    Iterator localIterator;
    Map.Entry localEntry;
    if (this.m_name.length() == 0) {
      for (localIterator = this.iGv.entrySet().iterator(); localIterator.hasNext(); ) { localEntry = (Map.Entry)localIterator.next();
        new bFB(localEntry.getValue()).d(paramLuaState);
        paramLuaState.setGlobal((String)localEntry.getKey()); }
    }
    else {
      paramLuaState.newTable();
      for (localIterator = this.iGv.entrySet().iterator(); localIterator.hasNext(); ) { localEntry = (Map.Entry)localIterator.next();
        paramLuaState.pushString((String)localEntry.getKey());
        new bFB(localEntry.getValue()).d(paramLuaState);
        paramLuaState.setTable(-3);
      }
      paramLuaState.setGlobal(this.m_name);
    }
  }
}