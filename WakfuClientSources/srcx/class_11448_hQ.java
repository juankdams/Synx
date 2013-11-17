import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public abstract class hQ
{
  protected static final Logger K = Logger.getLogger(hQ.class);

  public abstract String getName();

  public abstract String getDescription();

  void a(LuaState paramLuaState)
  {
    dsg[] arrayOfdsg1 = b(paramLuaState);
    if (arrayOfdsg1 != null) {
      paramLuaState.newTable();
      for (dsg localdsg1 : arrayOfdsg1)
        if (localdsg1 != null)
        {
          if ((!bB) && (localdsg1.getName() == null)) throw new AssertionError();
          paramLuaState.pushString(localdsg1.getName());
          paramLuaState.pushJavaFunction(localdsg1);
          paramLuaState.setTable(-3);
        }
      if (getName() != null)
        paramLuaState.setGlobal(getName());
      else {
        paramLuaState.setGlobal("UnknownLibrary " + toString());
      }

    }

    ??? = c(paramLuaState);
    if (??? != null)
      for (dsg localdsg2 : ???)
        localdsg2.register();
  }

  public abstract dsg[] b(LuaState paramLuaState);

  public abstract dsg[] c(LuaState paramLuaState);
}