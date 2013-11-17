import java.util.ArrayList;
import java.util.List;

public class OW extends cGj
{
  private static final String cfZ = "gemsList";
  private static final String cga = "gemsEffects";
  private static final String cgb = "hasGems";
  private static final String cgc = "isEditable";
  private static final String[] bF = { "gemsList", "gemsEffects", "hasGems", "isEditable" };
  private final gA cgd;
  private final cdI aFj;
  private final List cge = new ArrayList();

  public OW(gA paramgA, cdI paramcdI) {
    this.cgd = paramgA;
    this.aFj = paramcdI;

    byte b1 = 0; for (byte b2 = this.aFj.cgx(); b1 < b2; b1 = (byte)(b1 + 1))
      this.cge.add(new bfk(this.cgd, this.aFj.uS(b1), b1));
  }

  public String[] getFields()
  {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("gemsList"))
      return this.cge;
    if (paramString.equals("gemsEffects"))
      return aaP();
    if (paramString.equals("hasGems"))
      return Boolean.valueOf(this.aFj.cgx() != 0);
    if (paramString.equals("isEditable")) {
      return Boolean.valueOf(this.aFj.isEditable());
    }
    return null;
  }

  private ArrayList aaP() {
    ArrayList localArrayList = new ArrayList();
    int i = 0; for (int j = this.cge.size(); i < j; i++) {
      localArrayList.addAll(((bfk)this.cge.get(i)).bsH());
    }
    return localArrayList;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("GemsDisplayer");
    localStringBuilder.append("{m_gems=").append(this.aFj);
    localStringBuilder.append(", m_gemSlotDisplayers=").append(this.cge);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}