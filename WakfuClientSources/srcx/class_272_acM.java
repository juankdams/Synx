import java.io.File;
import java.util.ArrayList;

public class acM extends cGj
  implements aZH
{
  public static final String NAME = "name";
  public static final String aLh = "description";
  public static final String ciu = "iconUrl";
  public static final String cSY = "depthMargin";
  private final int aw;
  private final String m_name;
  private final String aLm;
  private final String cSZ;
  private int brR;
  private dyT cTa;
  private acM cTb;
  private final ArrayList bFw = new ArrayList();

  public acM(int paramInt, String paramString1, String paramString2, String paramString3) {
    this.aw = paramInt;
    this.m_name = paramString1;
    this.aLm = paramString2;
    this.cSZ = paramString3;
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

  public String apg() {
    return this.cSZ;
  }

  public void a(acM paramacM) {
    this.bFw.add(paramacM);
    paramacM.b(this);
  }

  public void b(acM paramacM) {
    this.cTb = paramacM;
    paramacM.brR += 1;
  }

  public acM aph() {
    return this.cTb;
  }

  public int getDepth() {
    return this.brR;
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
    if (paramString.equals("depthMargin")) {
      int i = this.brR * 10;
      return "0,0," + i + ", 0";
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

  public boolean n(dGy paramdGy) {
    if (!paramdGy.d(this)) {
      return false;
    }
    int i = 0; for (int j = this.bFw.size(); i < j; i++) {
      acM localacM = (acM)this.bFw.get(i);
      if (!localacM.n(paramdGy)) {
        return false;
      }
    }
    return true;
  }

  public String toString()
  {
    return "Category{m_depth=" + this.brR + ", m_imageUrl='" + this.cSZ + '\'' + ", m_description='" + this.aLm + '\'' + ", m_name='" + this.m_name + '\'' + ", m_id=" + this.aw + '}';
  }
}