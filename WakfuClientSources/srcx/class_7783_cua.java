import java.lang.reflect.Method;

class cua extends bKj
{
  cua(wE paramwE, Method paramMethod1, Class paramClass, String paramString, Method paramMethod2)
  {
    super(paramMethod1, paramClass);
  }
  public void e(FF paramFF, Object paramObject, String paramString) {
    if (paramString.length() == 0) {
      throw new cJ("The value \"\" is not a legal value for attribute \"" + this.ieg + "\"");
    }

    this.idX.invoke(paramObject, (Object[])new Character[] { new Character(paramString.charAt(0)) });
  }
}