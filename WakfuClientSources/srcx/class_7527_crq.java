public class crq extends aHK
{
  private final Jf iaL;

  public crq(bFe parambFe, Jf paramJf)
  {
    super(parambFe);
    this.iaL = paramJf;
  }

  public String getName()
  {
    String str = aTM().getName();
    if (cum()) {
      return str;
    }
    String[] arrayOfString = this.iaL.cg(str);
    return (arrayOfString != null) && (arrayOfString.length > 0) ? arrayOfString[0] : null;
  }

  public void a(cxK paramcxK)
  {
    if (this.iaL != null) {
      throw cur();
    }
    super.a(paramcxK);
  }

  public Object G(Class paramClass)
  {
    return dmo.class.isAssignableFrom(paramClass) ? null : aTM().G(paramClass);
  }

  public int hashCode()
  {
    String str = getName();
    return str == null ? super.hashCode() : str.hashCode();
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!paramObject.getClass().equals(getClass()))) {
      return false;
    }
    crq localcrq = (crq)paramObject;
    String str1 = getName();
    String str2 = localcrq.getName();
    return (str1 == null ? str2 == null : str1.equals(str2)) && (aTM().equals(localcrq.aTM()));
  }
}