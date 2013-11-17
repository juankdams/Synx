public abstract class bxd
{
  protected String value;
  private int index = -1;

  public abstract String[] wp();

  public static bxd g(Class paramClass, String paramString)
  {
    if (!bxd.class.isAssignableFrom(paramClass)) {
      throw new cJ("You have to provide a subclass from EnumeratedAttribut as clazz-parameter.");
    }

    bxd localbxd = null;
    try {
      localbxd = (bxd)paramClass.newInstance();
    } catch (Exception localException) {
      throw new cJ(localException);
    }
    localbxd.setValue(paramString);
    return localbxd;
  }

  public final void setValue(String paramString)
  {
    int i = jl(paramString);
    if (i == -1) {
      throw new cJ(paramString + " is not a legal value for this attribute");
    }
    this.index = i;
    this.value = paramString;
  }

  public final boolean containsValue(String paramString)
  {
    return jl(paramString) != -1;
  }

  public final int jl(String paramString)
  {
    String[] arrayOfString = wp();
    if ((arrayOfString == null) || (paramString == null)) {
      return -1;
    }
    for (int i = 0; i < arrayOfString.length; i++) {
      if (paramString.equals(arrayOfString[i])) {
        return i;
      }
    }
    return -1;
  }

  public final String getValue()
  {
    return this.value;
  }

  public final int getIndex()
  {
    return this.index;
  }

  public String toString()
  {
    return getValue();
  }
}