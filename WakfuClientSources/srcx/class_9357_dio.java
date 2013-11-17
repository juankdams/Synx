import java.lang.reflect.Method;

class dio extends bKj
{
  dio(wE paramwE, Method paramMethod1, Class paramClass1, Class paramClass2, Method paramMethod2)
  {
    super(paramMethod1, paramClass1);
  }

  public void e(FF paramFF, Object paramObject, String paramString)
  {
    Enum localEnum1;
    try {
      Enum localEnum2 = Enum.valueOf(this.idW, paramString);

      localEnum1 = localEnum2;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      throw new cJ("'" + paramString + "' is not a permitted value for " + this.idW.getName());
    }

    this.idX.invoke(paramObject, new Object[] { localEnum1 });
  }
}