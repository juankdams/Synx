public class cMT
{
  private String name;
  private Object ksk;
  private Object ksl;

  public cMT(EZ paramEZ)
  {
  }

  public void setName(String paramString)
  {
    this.name = paramString;
  }

  public void l(Object paramObject)
  {
    this.ksk = paramObject;
  }

  public void L(String paramString)
  {
    l(paramString);
  }

  public void m(Object paramObject)
  {
    this.ksl = paramObject;
  }

  public void M(String paramString)
  {
    m(paramString);
  }

  public String getName()
  {
    return this.name;
  }

  public String X(FF paramFF)
  {
    return Y(paramFF) ? this.name : null;
  }

  private boolean Y(FF paramFF) {
    afR localafR = afR.t(paramFF);
    return (localafR.U(this.ksk)) && (localafR.V(this.ksl));
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    if (this.name == null)
      localStringBuffer.append("noname");
    else {
      localStringBuffer.append(this.name);
    }
    if ((this.ksk != null) || (this.ksl != null)) {
      localStringBuffer.append(":");
      String str = "";

      if (this.ksk != null) {
        localStringBuffer.append("if->");
        localStringBuffer.append(this.ksk);
        str = ";";
      }
      if (this.ksl != null) {
        localStringBuffer.append(str);
        localStringBuffer.append("unless->");
        localStringBuffer.append(this.ksl);
      }
    }
    return localStringBuffer.toString();
  }
}