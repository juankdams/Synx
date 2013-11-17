import org.keplerproject.luajava.LuaException;
import org.keplerproject.luajava.LuaState;

public final class bFB
{
  private final Object aOd;
  private final bxT gAJ;

  public bFB(Object paramObject)
  {
    if (paramObject == null) {
      this.gAJ = bxT.gjf;
      this.aOd = paramObject;
      return;
    }

    if ((paramObject instanceof String)) {
      this.gAJ = bxT.giZ;
      this.aOd = paramObject;
      return;
    }

    if ((paramObject instanceof Boolean)) {
      this.gAJ = bxT.gjc;
      this.aOd = paramObject;
      return;
    }

    if ((paramObject instanceof Double)) {
      this.gAJ = bxT.gjb;
      this.aOd = paramObject;
      return;
    }

    if ((paramObject instanceof Integer)) {
      this.gAJ = bxT.gja;
      this.aOd = paramObject;
      return;
    }

    if ((paramObject instanceof Long)) {
      this.gAJ = bxT.giY;
      this.aOd = paramObject;
      return;
    }

    if ((paramObject instanceof Float)) {
      this.gAJ = bxT.gjb;
      this.aOd = Double.valueOf(((Float)paramObject).doubleValue());
      return;
    }

    if ((paramObject instanceof Short)) {
      this.gAJ = bxT.gja;
      this.aOd = Integer.valueOf(((Short)paramObject).intValue());
      return;
    }
    if ((paramObject instanceof Byte)) {
      this.gAJ = bxT.gja;
      this.aOd = Integer.valueOf(((Byte)paramObject).intValue());
      return;
    }
    if ((paramObject instanceof Character)) {
      this.gAJ = bxT.giZ;
      this.aOd = ((Character)paramObject).toString();
      return;
    }

    this.gAJ = bxT.giX;
    this.aOd = paramObject;
  }

  public bxT bNs() {
    return this.gAJ;
  }

  public Object getValue() {
    return this.aOd;
  }

  public void d(LuaState paramLuaState) {
    switch (UV.czk[bNs().ordinal()]) {
    case 1:
      paramLuaState.pushNumber(((Double)getValue()).doubleValue());
      break;
    case 2:
      paramLuaState.pushNumber(((Integer)getValue()).intValue());
      break;
    case 3:
      paramLuaState.pushBoolean(((Boolean)getValue()).booleanValue());
      break;
    case 4:
      paramLuaState.pushString((String)getValue());
      break;
    case 5:
    case 6:
      paramLuaState.pushJavaObject(getValue());
      break;
    case 7:
      paramLuaState.pushNil();
    }
  }

  public static bFB b(LuaState paramLuaState, int paramInt)
  {
    if (paramLuaState.isNumber(paramInt)) {
      return new bFB(Double.valueOf(paramLuaState.toNumber(paramInt)));
    }

    if (paramLuaState.isBoolean(paramInt)) {
      return new bFB(Boolean.valueOf(paramLuaState.toBoolean(paramInt)));
    }

    if (paramLuaState.isString(paramInt)) {
      return new bFB(paramLuaState.toString(paramInt));
    }

    if (paramLuaState.isObject(paramInt)) {
      return new bFB(paramLuaState.toJavaObject(paramInt));
    }

    if (paramLuaState.isNil(paramInt)) {
      return new bFB(null);
    }

    throw new LuaException("Valeur de type inconnu dans un script Lua");
  }
}