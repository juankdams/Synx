import java.util.ArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;

public class afa extends cGj
  implements Lh
{
  protected static final Logger K = Logger.getLogger(afa.class);
  public static final String cWZ = "itemNeeded";
  public static final String cXa = "content";
  public static final String cXb = "unlocked";
  public static final String cXc = "canBeUnlocked";
  public static final String cXd = "unlockingText";
  public static final String cXe = "shortUnlockingText";
  public static final String cXf = "index";
  public static final String cXg = "size";
  public static final String ciu = "iconUrl";
  public static final String cXh = "displayed";
  public static final String NAME = "name";
  public static final String[] bF = { "itemNeeded", "content", "unlocked", "canBeUnlocked", "index", "size", "unlockingText" };

  private byte cXi = 0;
  private cMu cXj;
  private final cLD cXk;

  public afa(cLD paramcLD, byte paramByte)
  {
    this.cXk = paramcLD;
    this.cXi = paramByte;
  }

  public afa(cLD paramcLD, byte paramByte, cMu paramcMu) {
    this.cXk = paramcLD;
    this.cXj = paramcMu;
    this.cXi = paramByte;
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("itemNeeded")) {
      return aqC();
    }

    if (paramString.equals("unlocked")) {
      return Boolean.valueOf(VC());
    }

    if (paramString.equals("canBeUnlocked")) {
      return Boolean.valueOf(aqB());
    }

    if (paramString.equals("index")) {
      return Integer.valueOf(this.cXi + 1);
    }

    if (paramString.equals("size")) {
      return Byte.valueOf(this.cXk.afS());
    }

    if (paramString.equals("unlockingText")) {
      return aqA();
    }

    if (paramString.equals("shortUnlockingText")) {
      return aqA();
    }

    if (paramString.equals("content")) {
      if (this.cXj == null) {
        return null;
      }
      ArrayList localArrayList = new ArrayList(this.cXj.cFy());
      cty localcty = new cty();
      int j;
      for (int i = 0; i < this.cXj.cFy(); j = (byte)(i + 1)) {
        gA localgA = this.cXj.ag(i);
        localArrayList.add(localgA == null ? localcty : localgA.nH());
      }
      return localArrayList;
    }

    if (paramString.equals("displayed")) {
      return Boolean.valueOf((VC()) || (VD()));
    }

    if (paramString.equals("iconUrl")) {
      return Xo.cHG.fJ();
    }

    if (paramString.equals("name")) {
      return Xo.cHG.getName();
    }

    return null;
  }

  private String aqA() {
    bVw localbVw = aqC();
    if (localbVw == null) {
      return null;
    }
    return bU.fH().getString("storageBox.unlockingInfo", new Object[] { localbVw.getName() });
  }

  public boolean aqB() {
    bVw localbVw = aqC();
    return (localbVw == null) || (byv.bFN().bFO().bGP().ye(localbVw.getId()) != null);
  }

  public boolean VC() {
    return (aqC() == null) || (this.cXj != null);
  }

  public boolean VD() {
    return VC();
  }

  public void a(dor paramdor) {
    this.cXj = ((cMu)paramdor);
  }

  public void VE() {
    this.cXj = null;
  }

  public void VF() {
    dLE.doY().a(this, bF);
  }

  public void VG() {
    bVw localbVw = aqC();
    if (!aqB()) {
      K.error("impossible de débloquer le compartiment d'index=" + VH());
      return;
    }
    if (VC()) {
      return;
    }
    cKX localcKX = cBQ.cxL().a(bU.fH().getString("storageBox.unlockQuestion", new Object[] { localbVw.getName() }), ay.bd().v(localbVw.oc()), 25L, 102, 1);

    localcKX.a(new dWA(this));
  }

  public byte VH()
  {
    return this.cXi;
  }

  public void a(auY paramauY) {
    axV localaxV = new axV(getId(), paramauY);
    byv.bFN().aJK().d(localaxV);
  }

  public void select() {
    dOq localdOq = new dOq();
    localdOq.du(getId());
    byv.bFN().aJK().d(localdOq);
  }

  public int getId() {
    return this.cXk.getId();
  }

  public bVw aqC() {
    return (bVw)Hh.QM().dh(this.cXk.cEI());
  }

  public cLD aqD() {
    return this.cXk;
  }

  public void a(cMu paramcMu) {
    this.cXj = paramcMu;
  }

  public String toString()
  {
    return "CompartmentViewImpl{m_index=" + this.cXi + ", m_inventory=" + this.cXj + ", m_compartment=" + this.cXk + '}';
  }

  public boolean n(gA paramgA)
  {
    return this.cXj.au(paramgA);
  }

  public boolean j(gA paramgA) {
    return this.cXj.bI(paramgA.oj()) != null;
  }

  public gA aO(byte paramByte) {
    return this.cXj.ag(paramByte);
  }

  public bnq a(gA paramgA, short paramShort, byte paramByte) {
    axb localaxb = new axb(paramgA.oj(), paramShort, paramByte);

    byz localbyz = byv.bFN().bFO();
    bBn localbBn = paramgA.oi();

    if ((localbBn.a(Aq.bvR) != null) && (!localbBn.a(Aq.bvR).i(localbyz, Byte.valueOf(paramByte), localbBn, localbyz.bEY())))
    {
      return bnq.fGs;
    }

    if (!n(paramgA)) {
      K.warn("Impossible d'ajouter l'item");
      return bnq.fGt;
    }

    a(localaxb);

    return bnq.fGr;
  }

  public bnq a(long paramLong, byte paramByte) {
    gA localgA = aO(paramByte);
    if ((localgA != null) && (localgA.oj() == paramLong)) {
      K.error("Impossible de drop un item sur le meme slot");
      return bnq.fGt;
    }

    dPQ localdPQ = new dPQ(paramLong, paramByte);
    a(localdPQ);

    return bnq.fGr;
  }

  public bnq a(long paramLong1, short paramShort, long paramLong2, byte paramByte) {
    cjz localcjz = new cjz(paramLong1, paramShort, paramLong2, paramByte);
    a(localcjz);

    return bnq.fGr;
  }
}