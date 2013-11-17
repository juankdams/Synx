public class avo extends bxE
{
  public static final String TAG = "data";
  private Object aOd;
  public static final int crX = "value".hashCode();

  public String getTag()
  {
    return "data";
  }

  public Object getValue()
  {
    return this.aOd;
  }

  public void setValue(Object paramObject)
  {
    this.aOd = paramObject;
  }

  public Object getElementValue()
  {
    return this.aOd;
  }

  public void c(bdj parambdj)
  {
    avo localavo = (avo)parambdj;
    super.c(parambdj);
    localavo.aOd = this.aOd;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == crX)
      setValue(paramaKN.gL(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == crX)
      setValue(paramObject);
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}