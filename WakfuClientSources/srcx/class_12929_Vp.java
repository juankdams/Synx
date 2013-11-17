import org.keplerproject.luajava.LuaState;

 enum Vp
{
  Vp()
  {
    super(str, i, null);
  }
  public boolean a(LuaState paramLuaState, int paramInt) { return paramLuaState.isNumber(paramInt); }

}