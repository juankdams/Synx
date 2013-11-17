import java.lang.reflect.InvocationTargetException;

public final class aAK
{
  private cqV dTE;
  private Object dTF;
  private FF aIn;
  private Object dTG;
  private String dTH;

  private aAK(FF paramFF, Object paramObject, cqV paramcqV)
  {
    this.aIn = paramFF;
    this.dTF = paramObject;
    this.dTE = paramcqV;
  }

  public void ga(String paramString)
  {
    this.dTH = paramString;
  }

  public Object create()
  {
    if (this.dTH != null) {
      if (!this.dTE.cpM()) {
        throw new cJ("Not allowed to use the polymorphic form for this element");
      }

      aXW localaXW = aXW.v(this.aIn);
      this.dTG = localaXW.hv(this.dTH);
      if (this.dTG == null)
        throw new cJ("Unable to create object of type " + this.dTH);
    }
    try
    {
      this.dTG = this.dTE.b(this.aIn, this.dTF, this.dTG);
      if (this.aIn != null) {
        this.aIn.G(this.dTG);
      }
      return this.dTG;
    } catch (IllegalAccessException localIllegalAccessException) {
      throw new cJ(localIllegalAccessException);
    } catch (InstantiationException localInstantiationException) {
      throw new cJ(localInstantiationException);
    } catch (IllegalArgumentException localIllegalArgumentException) {
      if (this.dTH == null) {
        throw localIllegalArgumentException;
      }
      throw new cJ("Invalid type used " + this.dTH);
    } catch (InvocationTargetException localInvocationTargetException) {
      throw wE.b(localInvocationTargetException);
    }
  }

  public Object aMC()
  {
    return this.dTE.aMC();
  }

  public void store()
  {
    try
    {
      this.dTE.p(this.dTF, this.dTG);
    } catch (IllegalAccessException localIllegalAccessException) {
      throw new cJ(localIllegalAccessException);
    } catch (InstantiationException localInstantiationException) {
      throw new cJ(localInstantiationException);
    } catch (IllegalArgumentException localIllegalArgumentException) {
      if (this.dTH == null) {
        throw localIllegalArgumentException;
      }
      throw new cJ("Invalid type used " + this.dTH);
    } catch (InvocationTargetException localInvocationTargetException) {
      throw wE.b(localInvocationTargetException);
    }
  }
}