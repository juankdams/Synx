import org.keplerproject.luajava.LuaState;

public enum bxT
{
  final boolean a(bxT parambxT)
  {
    if (this == parambxT) {
      return true;
    }

    if (this == gja) {
      return parambxT == gjb;
    }

    if (this == gjb) {
      return parambxT == gja;
    }

    return false;
  }

  public abstract boolean a(LuaState paramLuaState, int paramInt);
}