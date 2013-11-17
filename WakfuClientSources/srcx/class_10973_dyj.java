public abstract class dyj
  implements arr
{
  private axA hYy;
  static Class bZT;

  protected dyj()
  {
    this.hYy = axA.dMG;
  }

  protected dyj(axA paramaxA)
  {
    this.hYy = paramaxA;
  }

  public Class WJ()
  {
    return bZT == null ? (dyj.bZT = cd("axA")) : bZT;
  }

  public Object aDQ()
  {
    return sF();
  }

  public axA sF()
  {
    return this.hYy;
  }

  public void m(axA paramaxA) {
    this.hYy = paramaxA;
  }

  public Object a(Object paramObject, hT paramhT)
  {
    if (paramObject == null)
      return null;
    try
    {
      dyj localdyj = (dyj)getClass().newInstance();
      localdyj.hYy = ((axA)paramObject);
      return localdyj;
    }
    catch (InstantiationException localInstantiationException) {
      throw new IllegalArgumentException("Can't instantiate " + getClass());
    } catch (IllegalAccessException localIllegalAccessException) {
    }
    throw new IllegalArgumentException("Not allowed to instantiate " + getClass());
  }

  public int hashCode()
  {
    return this.hYy != null ? this.hYy.hashCode() : 0;
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this) return true;
    if ((paramObject instanceof dyj)) {
      axA localaxA = ((dyj)paramObject).sF();
      if (this.hYy == null)
        return localaxA == null;
      return this.hYy.equals(localaxA);
    }
    return false;
  }

  public String toString() {
    return this.hYy.toString() + " (" + super.toString() + ")";
  }

  static Class cd(String paramString)
  {
    try
    {
      return Class.forName(paramString); } catch (ClassNotFoundException localClassNotFoundException) { throw new NoClassDefFoundError().initCause(localClassNotFoundException); }

  }
}