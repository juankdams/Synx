import org.keplerproject.luajava.LuaState;

 enum Vh
{
  Vh()
  {
    super(str, i, null);
  }
  public boolean a(LuaState paramLuaState, int paramInt) { return (paramLuaState.isObject(paramInt)) || (paramLuaState.isNumber(paramInt)); }

}