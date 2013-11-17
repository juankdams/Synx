import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

public class aet extends cGj
  implements aZH
{
  public static final String NAME = "name";
  public static final String aLh = "description";
  public static final String ciu = "iconUrl";
  public static final String cVD = "subtitle";
  public static final String cVE = "price";
  public static final String cVF = "originalPrice";
  public static final String cVG = "currency";
  public static final String cVH = "stock";
  public static final String cVI = "content";
  public static final String cVJ = "contents";
  private final int aw;
  private final String m_name;
  private final String aLm;
  private final String cVK;
  private final float cVL;
  private final float cVM;
  private final dlS cVN;
  private final int cVO;
  private final cSi cVP;
  private final String cSZ;
  private dyT cTa;

  public aet(int paramInt1, String paramString1, String paramString2, String paramString3, float paramFloat1, float paramFloat2, dlS paramdlS, int paramInt2, cSi paramcSi, String paramString4)
  {
    this.aw = paramInt1;
    this.m_name = paramString1;
    this.aLm = paramString2;
    this.cVK = paramString3;
    this.cVL = paramFloat1;
    this.cVM = paramFloat2;
    this.cVN = paramdlS;
    this.cVO = paramInt2;
    this.cVP = paramcSi;
    this.cSZ = paramString4;

    Ww();
  }

  public int getId() {
    return this.aw;
  }

  public String getName() {
    return this.m_name;
  }

  public String getDescription() {
    return this.aLm;
  }

  public String aqf() {
    return this.cVK;
  }

  public float aqg() {
    return this.cVL;
  }

  public float aqh() {
    return this.cVM;
  }

  public dlS aqi() {
    return this.cVN;
  }

  public int aqj() {
    return this.cVO;
  }

  public String apg() {
    return this.cSZ;
  }

  public String[] getFields() {
    return lJb;
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("name")) {
      return this.m_name;
    }
    if (paramString.equals("description")) {
      return this.aLm;
    }
    if (paramString.equals("iconUrl")) {
      return this.cTa == null ? null : this.cTa.getUrl();
    }
    if (paramString.equals("subtitle")) {
      return this.cVK;
    }
    if (paramString.equals("price")) {
      return Float.valueOf(this.cVL);
    }
    if (paramString.equals("originalPrice")) {
      return this.cVM > 0.0F ? Float.valueOf(this.cVM) : null;
    }
    if (paramString.equals("currency")) {
      return this.cVN.fJ();
    }
    if (paramString.equals("stock")) {
      return this.cVO == -1 ? null : bU.fH().getString("playerGift.itemCount", new Object[] { Integer.valueOf(this.cVO) });
    }
    if ((paramString.equals("content")) && 
      (this.cVP.size() == 1)) {
      return Hh.QM().dh(this.cVP.get(0));
    }

    if (paramString.equals("contents")) {
      ArrayList localArrayList = new ArrayList();
      int i = 0; for (int j = this.cVP.size(); i < j; i++) {
        localArrayList.add(Hh.QM().dh(this.cVP.get(i)));
      }
      return localArrayList;
    }
    return null;
  }

  private void Ww() {
    if (this.cSZ == null) {
      return;
    }
    File localFile = Bh.ai(this.cSZ);
    String str = Bh.i(localFile);

    this.cTa = new dyT(null, str, "iconUrl", this);
    cTr.kFU.a(this.cSZ, this.cTa);
  }

  public void x(String paramString1, String paramString2) {
    dLE.doY().a(this, new String[] { paramString1 });
  }
}