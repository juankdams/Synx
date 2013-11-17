import java.lang.reflect.Method;

class ctP extends bKj
{
  ctP(wE paramwE, Method paramMethod1, Class paramClass1, Class paramClass2, Method paramMethod2)
  {
    super(paramMethod1, paramClass1);
  }
  public void e(FF paramFF, Object paramObject, String paramString) {
    try {
      bxd localbxd = (bxd)this.idW.newInstance();
      localbxd.setValue(paramString);
      this.idX.invoke(paramObject, new Object[] { localbxd });
    } catch (InstantiationException localInstantiationException) {
      throw new cJ(localInstantiationException);
    }
  }
}