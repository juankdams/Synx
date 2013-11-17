import java.util.ArrayList;
import java.util.Collections;

public class cPH extends aMT
  implements xl
{
  public static final String RH = "iconUrl";
  public static final String kyR = "rootIconUrl";
  public static final String dmg = "progressionText";
  public static final String hMb = "progressionValue";
  public static final String kyS = "isFollowed";
  public static final String kyT = "isCompleted";
  public static final String kyU = "isVisible";
  public static final String[] bF = { "name", "achievements", "iconUrl", "progressionText", "progressionValue", "isHistory", "achievementsQuickList" };
  private final bXs kyV;
  private final cSR kyW = new cSR();
  private final ArrayList hmm = new ArrayList();
  private final int hMr;

  public cPH(bXs parambXs, int paramInt)
  {
    this.kyV = parambXs;
    this.esv = parambXs.getId();
    this.hMr = paramInt;
  }

  public void e(ckJ paramckJ) {
    if (!this.hmm.contains(paramckJ))
      this.hmm.add(paramckJ);
  }

  public String[] getFields()
  {
    return bF;
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("iconUrl"))
      return ay.bd().I(this.kyV.getId());
    if (paramString.equals("rootIconUrl"))
      return ay.bd().m("background" + this.kyV.getId());
    if (paramString.equals("progressionText"))
      return GA() + "/" + Gz();
    if (paramString.equals("progressionValue"))
      return Float.valueOf(GA() / Gz());
    if (paramString.equals("isFollowed"))
      return Boolean.valueOf(anv());
    if (paramString.equals("isCompleted")) {
      bCP localbCP = byv.bFN().bFO().bGa();
      for (int i = this.hmm.size() - 1; i >= 0; i--) {
        if (!localbCP.md(((ckJ)this.hmm.get(i)).getId())) {
          return Boolean.valueOf(false);
        }
      }
      return Boolean.valueOf(true);
    }if (paramString.equals("categories")) {
      return cGI();
    }

    return super.getFieldValue(paramString);
  }

  private boolean anv() {
    for (int i = this.hmm.size() - 1; i >= 0; i--) {
      if (((ckJ)this.hmm.get(i)).anv()) {
        return true;
      }
    }
    return false;
  }

  protected aMT cGH() {
    return (aMT)this.kyW.get(this.esv);
  }

  protected String getName()
  {
    return this.kyV == null ? bU.fH().getString("achievement.rootName") : bU.fH().b(61, this.kyV.getId(), new Object[0]);
  }

  protected ArrayList cGI()
  {
    ArrayList localArrayList = new ArrayList();
    for (dmn localdmn = this.kyW.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      cPH localcPH = (cPH)localdmn.value();
      if (!localcPH.bdV().isEmpty())
        localArrayList.add(localcPH);
    }
    Collections.sort(localArrayList, new czp(this));

    return localArrayList;
  }

  public boolean bdT()
  {
    return false;
  }

  protected boolean bwW() {
    return (this.kyW != null) && (this.kyW.size() > 0);
  }

  public void a(cPH paramcPH)
  {
    this.kyW.put(paramcPH.getId(), paramcPH);
  }

  public cSR bdU()
  {
    return this.kyW;
  }

  protected ArrayList bdV()
  {
    bCP localbCP = byv.bFN().bFO().bGa();
    ArrayList localArrayList = new ArrayList();
    for (ckJ localckJ : this.hmm) {
      int i = localckJ.getId();
      cPH localcPH = (cPH)this.kyW.get(this.esv);
      if ((localcPH == null) || (localcPH.equals(this)) || (localcPH.a(localckJ)))
      {
        boolean bool1 = localbCP.mc(i);
        boolean bool2 = localbCP.md(i);

        dHX localdHX = bMK.bUv().bUz();
        if ((localdHX.b(bool1, bool2)) && 
          (localckJ.isVisible()))
        {
          localArrayList.add(localckJ);
        }
      }
    }
    return localArrayList;
  }

  public int cmy() {
    return this.hMr;
  }

  public int Gz() {
    int i = 0;
    for (int j = this.hmm.size() - 1; j >= 0; j--) {
      ckJ localckJ = (ckJ)this.hmm.get(j);
      if (localckJ.cmv())
      {
        i++;
      }
    }
    return i;
  }

  public int GA() {
    int i = 0;
    bCP localbCP = byv.bFN().bFO().bGa();
    for (ckJ localckJ : this.hmm) {
      if (localbCP.md(localckJ.getId()))
        i++;
    }
    return i;
  }

  public boolean a(ckJ paramckJ) {
    return this.hmm.contains(paramckJ);
  }

  public int getId()
  {
    return this.kyV.getId();
  }

  public ckJ yN(int paramInt) {
    dLE.doY().a(this, new String[] { "isFollowed" });
    int i = 0; for (int j = this.hmm.size(); i < j; i++) {
      ckJ localckJ = (ckJ)this.hmm.get(i);
      if (localckJ.getId() == paramInt) {
        localckJ.cmz();
        return localckJ;
      }
    }

    return null;
  }
}