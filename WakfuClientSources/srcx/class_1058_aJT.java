import java.util.Collection;

public class aJT extends bxE
  implements fu
{
  public static final String TAG = "ValueReplacer";
  public static final String eks = "size";
  public static final String ekt = "concat";
  protected aWj eku;
  private String hX = null;
  private String bFu = null;

  public static final int crX = "value".hashCode();
  public static final int crZ = "key".hashCode();

  public String getTag()
  {
    return "ValueReplacer";
  }

  public String getKey()
  {
    return this.hX;
  }

  public void setKey(String paramString)
  {
    this.hX = paramString;
  }

  public String getValue()
  {
    return this.bFu;
  }

  public void setValue(String paramString)
  {
    this.bFu = paramString;
  }

  public void setResultProviderParent(aWj paramaWj) {
    this.eku = paramaWj;
  }

  public Object getResult(Object paramObject) {
    if (this.hX == null) {
      return null;
    }
    if (this.hX.equalsIgnoreCase("size")) {
      if ((paramObject instanceof Collection))
        return Integer.valueOf(((Collection)paramObject).size());
      if ((paramObject instanceof Object[])) {
        return Integer.valueOf(((Object[])paramObject).length);
      }
      return Integer.valueOf(0);
    }if (this.hX.equalsIgnoreCase("concat")) {
      return this.bFu + (paramObject != null ? paramObject.toString() : "");
    }
    return null;
  }

  public void c(bdj parambdj)
  {
    aJT localaJT = (aJT)parambdj;
    localaJT.setKey(this.hX);
    localaJT.setValue(this.bFu);
    super.c(localaJT);
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == crX)
      setValue(paramaKN.gL(paramString));
    else if (paramInt == crZ)
      setKey(paramaKN.gL(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == crX)
      setValue(String.valueOf(paramObject));
    else if (paramInt == crZ)
      setKey(String.valueOf(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}