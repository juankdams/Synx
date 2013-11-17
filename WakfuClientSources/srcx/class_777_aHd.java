import java.util.Stack;

public class aHd extends br
{
  public static final String TAG = "RadioButton";
  private String eeC = "";
  private String bFu;
  public static final int eeD = "groupId".hashCode();
  public static final int crX = "value".hashCode();

  public String getTag()
  {
    return "RadioButton";
  }

  public dNn getAppearance()
  {
    return (dNn)this.czl;
  }

  public boolean isAppearanceCompatible(Jg paramJg)
  {
    return paramJg instanceof dNn;
  }

  public String getGroupId()
  {
    return this.eeC;
  }

  public void setGroupId(String paramString)
  {
    this.eeC = paramString;

    aSZ();
  }

  public String getValue()
  {
    return this.bFu;
  }

  public void setValue(String paramString)
  {
    this.bFu = paramString;

    aSZ();
  }

  public void a(K paramK, aNL paramaNL, Stack paramStack, cDA paramcDA)
  {
    super.a(paramK, paramaNL, paramStack, paramcDA);
  }

  private void aSZ() {
    if (this.cUY.lH(this.eeC)) {
      this.cUY.lG(this.eeC).b(this);
      if ((this.bFu != null) && (this.bFu.equalsIgnoreCase(this.cUY.lG(this.eeC).getValue())) && (!getAppearance().isChecked()))
      {
        getAppearance().Li();
      }
    }
  }

  public void aTa()
  {
    super.aTa();

    aSZ();
  }

  public void aJ()
  {
    super.aJ();

    dNn localdNn = new dNn();
    localdNn.aJ();
    localdNn.setWidget(this);
    a(localdNn);
  }

  public void bc()
  {
    if (this.cUY.lH(this.eeC)) {
      this.cUY.lG(this.eeC).c(this);
    }
    super.bc();

    this.eeC = null;
    this.bFu = null;
  }

  public void c(bdj parambdj)
  {
    aHd localaHd = (aHd)parambdj;
    super.c(localaHd);
    localaHd.eeC = this.eeC;
    localaHd.bFu = this.bFu;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == eeD)
      setGroupId(paramaKN.gL(paramString));
    else if (paramInt == crX)
      setValue(paramaKN.gL(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == eeD)
      setGroupId(String.valueOf(paramObject));
    else if (paramInt == crX)
      setValue(String.valueOf(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}