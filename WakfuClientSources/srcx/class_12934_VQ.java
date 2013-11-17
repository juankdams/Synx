import java.util.ArrayList;

public class VQ extends cGj
{
  public static final String bC = "name";
  public static final String cAZ = "lootList";
  public static final String cBa = "finished";
  public static final String cBb = "selectedItem";
  public static final String cBc = "maxColumns";
  public static final String[] bF = { "name", "lootList", "finished", "selectedItem" };
  private boolean cBd;
  private bVw cBe;
  private int cBf;
  private final ArrayList cBg;
  private final String m_name;

  public String[] getFields()
  {
    return bF;
  }

  public VQ(String paramString, ArrayList paramArrayList)
  {
    this.cBg = paramArrayList;
    this.m_name = paramString;
    int i = this.cBg.size();
    float f = bCO.bK(i);
    int j = Math.round(f);
    int k = -1;
    if ((i % 10 == 0) && (i / 10 > 1))
      k = 10;
    else if ((i % 5 == 0) && (i / 5 > 1))
      k = 5;
    else if ((i % 3 == 0) && (i / 3 > 1)) {
      k = 3;
    }
    if ((k == -1) || (Math.abs(k - j) > 2)) {
      k = j;
    }
    this.cBf = k;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name")) {
      return this.m_name;
    }
    if (paramString.equals("lootList")) {
      return this.cBg;
    }
    if (paramString.equals("finished")) {
      return Boolean.valueOf(this.cBd);
    }
    if (paramString.equals("selectedItem")) {
      return this.cBe;
    }
    if (paramString.equals("maxColumns")) {
      return Integer.valueOf(this.cBf);
    }
    return null;
  }

  public void bz(boolean paramBoolean) {
    this.cBd = paramBoolean;
    dLE.doY().a(this, new String[] { "finished" });
  }

  public int indexOf(int paramInt) {
    return this.cBg.indexOf(Hh.QM().dh(paramInt));
  }

  public int aiP() {
    return this.cBg.size();
  }

  public void Z(float paramFloat)
  {
    dLE.doY().a(this, new String[] { "selectedItem" });
  }
}