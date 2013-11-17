import java.util.ArrayList;

public class bmG extends bxE
{
  public static final String TAG = "RadioGroup";
  private ArrayList fFt = new ArrayList();
  private String bFu;
  public static final int crX = "value".hashCode();

  public String getTag()
  {
    return "RadioGroup";
  }

  public String getValue()
  {
    return this.bFu;
  }

  public void setValue(String paramString)
  {
    this.bFu = paramString;
    for (aHd localaHd : this.fFt)
      if ((localaHd.getValue() != null) && (localaHd.getValue().equalsIgnoreCase(paramString))) {
        localaHd.setSelected(true);
        break;
      }
  }

  public void K(dGy paramdGy)
  {
    int i = 0; for (int j = this.fFt.size(); i < j; i++)
      if (!paramdGy.d(this.fFt.get(i)))
        return;
  }

  public void b(aHd paramaHd)
  {
    if (!this.fFt.contains(paramaHd))
      this.fFt.add(paramaHd);
  }

  public void c(aHd paramaHd)
  {
    this.fFt.remove(paramaHd);
  }

  public void setRadioButtonList(ArrayList paramArrayList)
  {
    this.fFt = paramArrayList;
  }

  public void setElementMap(cpa paramcpa)
  {
    super.setElementMap(paramcpa);

    if (this.bYJ != null)
      this.cUY.a(this.bYJ, this);
  }

  public void setId(String paramString)
  {
    if ((this.cUY != null) && (this.cUY.lH(this.bYJ))) {
      this.cUY.lI(this.bYJ);
    }

    super.setId(paramString);

    if (this.cUY != null)
      this.cUY.a(this.bYJ, this);
  }

  public void bc()
  {
    super.bc();
    this.fFt.clear();
  }

  public void c(bdj parambdj)
  {
    bmG localbmG = (bmG)parambdj;
    super.c(localbmG);
    localbmG.bFu = this.bFu;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == crX) {
      setValue(paramaKN.gL(paramString));
      return true;
    }
    return super.setXMLAttribute(paramInt, paramString, paramaKN);
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject)
  {
    if (paramInt == crX) {
      setValue(String.valueOf(paramObject));
      return true;
    }
    return super.setPropertyAttribute(paramInt, paramObject);
  }
}