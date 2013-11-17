import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class dzy extends cGj
  implements Lh
{
  public static final String cXa = "content";
  public static final String cXb = "unlocked";
  public static final String eMS = "enabled";
  public static final String cXf = "index";
  public static final String cXg = "size";
  public static final String cXd = "unlockingText";
  public static final String cXe = "shortUnlockingText";
  public static final String cWZ = "itemNeeded";
  public static final String ciu = "iconUrl";
  public static final String cXh = "displayed";
  public static final String NAME = "name";
  public static final String[] bF = { "content", "enabled", "unlocked", "index", "size", "itemNeeded" };

  private final dfZ lGl = new dfZ();
  private final dIC lGm;

  public dzy(dIC paramdIC)
  {
    this.lGm = paramdIC;
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("unlocked")) {
      return Boolean.valueOf(VC());
    }

    if (paramString.equals("index")) {
      return Byte.valueOf(this.lGm.dit());
    }

    if (paramString.equals("size")) {
      if (this.lGl == null) {
        return null;
      }
      return Short.valueOf(this.lGl.cFy());
    }

    if (paramString.equals("enabled")) {
      return Boolean.valueOf(this.lGl.isEnabled());
    }

    if (paramString.equals("unlockingText")) {
      switch (aEB.ear[ddb().ordinal()]) {
      case 1:
        return Xo.cHI.ajq();
      case 2:
        return Xo.cHJ.ajq();
      case 3:
        return Xo.cHH.ajq();
      case 4:
        return Xo.cHK.ajq();
      }
    }

    if (paramString.equals("shortUnlockingText")) {
      switch (aEB.ear[ddb().ordinal()]) {
      case 1:
        return Xo.cHI.ajp();
      case 2:
        return Xo.cHJ.ajp();
      case 3:
        return Xo.cHH.ajp();
      case 4:
        return Xo.cHK.ajp();
      }
    }

    if (paramString.equals("itemNeeded")) {
      return null;
    }

    if (paramString.equals("content")) {
      if (this.lGl == null) {
        return null;
      }

      int i = dda();
      ArrayList localArrayList1 = new ArrayList(i);
      cty localcty = new cty();

      ArrayList localArrayList2 = this.lGl.cPE();
      int j = 0; for (int k = localArrayList2.size(); j < k; j++) {
        cZl localcZl = (cZl)localArrayList2.get(j);
        int n;
        for (int m = 0; m < localcZl.cFy(); n = (byte)(m + 1)) {
          gA localgA = localcZl.ag(m);
          Object localObject;
          if (localcZl.isEnabled())
            localObject = localgA == null ? localcty : localgA.nH();
          else {
            localObject = localgA == null ? new bzm(localcty) : new bzm(localgA);
          }
          localArrayList1.add(localObject);
        }
      }

      for (j = localArrayList1.size(); j < i; j++) {
        localArrayList1.add(new bzm(localcty));
      }

      return localArrayList1;
    }

    if (paramString.equals("displayed")) {
      return Boolean.valueOf((VC()) || (VD()));
    }

    if (paramString.equals("iconUrl")) {
      switch (aEB.ear[ddb().ordinal()]) {
      case 1:
        return Xo.cHI.fJ();
      case 2:
        return Xo.cHJ.fJ();
      case 3:
        return Xo.cHH.fJ();
      case 4:
        return Xo.cHK.fJ();
      }

      return null;
    }

    if (paramString.equals("name")) {
      switch (aEB.ear[ddb().ordinal()]) {
      case 1:
        return Xo.cHI.getName();
      case 2:
        return Xo.cHJ.getName();
      case 3:
        return Xo.cHH.getName();
      case 4:
        return Xo.cHK.getName();
      }
    }

    return null;
  }

  private int dda() {
    AtomicInteger localAtomicInteger = new AtomicInteger(0);
    this.lGm.ab(new aEG(this, localAtomicInteger));

    return localAtomicInteger.get();
  }

  private dgx ddb() {
    return dBY.Cr(this.lGm.dir()).ddb();
  }

  public boolean VC() {
    if (this.lGl.cPE().isEmpty()) {
      mG localmG = (mG)Nj.Xh().Xi();
      AtomicBoolean localAtomicBoolean = new AtomicBoolean(false);
      this.lGm.ab(new aEE(this, localmG, localAtomicBoolean));

      return localAtomicBoolean.get();
    }
    return this.lGl.isEnabled();
  }

  public boolean VD()
  {
    if (this.lGl.cPE().isEmpty()) {
      mG localmG = (mG)Nj.Xh().Xi();
      AtomicBoolean localAtomicBoolean = new AtomicBoolean(false);
      this.lGm.ab(new aED(this, localmG, localAtomicBoolean));

      return localAtomicBoolean.get();
    }
    return true;
  }

  public void a(dor paramdor)
  {
    this.lGl.a((cZl)paramdor);
    dLE.doY().a(this, new String[] { "content", "unlocked", "enabled" });
  }

  public void VE()
  {
    this.lGl.cPD();
  }

  public byte VH() {
    return (byte)this.lGm.ordinal();
  }

  private boolean ddc() {
    boolean bool = (dqB.cXD().b(cnm.hTj)) || (dqB.cXD().b(this.lGm.dis()));

    return bool;
  }

  public void a(auY paramauY, cZl paramcZl) {
    if ((!ddc()) && ((paramauY.um() == aHB.efw) || (paramauY.um() == aHB.efz)))
    {
      localObject = bU.fH().getString("group.error.accessDenied");
      String str = Cn.et(4);
      cBQ.cxL().a((String)localObject, str, 515L, 102, 1);

      return;
    }
    Object localObject = new cbN(paramcZl.cMg().aw, paramauY);
    byv.bFN().aJK().d((cWG)localObject);
  }

  public void select() {
    cCV localcCV = new cCV();
    localcCV.du(this.lGm.dir());
    byv.bFN().aJK().d(localcCV);
  }

  public void VF() {
    dLE.doY().a(this, bF);
  }

  public void VG() {
    dCt localdCt = new dCt();
    localdCt.du(getId());
    byv.bFN().aJK().d(localdCt);

    Nj.Xh().a(this);
  }

  public String toString()
  {
    return "GuildAggregatedCompartmentView{m_compartment=" + this.lGl + ", m_guildStorageCompartmentLinkType=" + this.lGm + '}';
  }

  public boolean n(gA paramgA)
  {
    return this.lGl.au(paramgA);
  }

  public boolean j(gA paramgA) {
    return this.lGl.bI(paramgA.oj()) != null;
  }

  public gA aO(byte paramByte) {
    return this.lGl.ag(paramByte);
  }

  public int getId() {
    return VH();
  }

  public bnq a(gA paramgA, short paramShort, byte paramByte) {
    if (paramByte != -1) {
      return b(paramgA, paramShort, paramByte);
    }
    short s1 = paramShort;

    int i = this.lGl.cFy();
    int k;
    for (int j = 0; j < i; k = (byte)(j + 1)) {
      gA localgA = this.lGl.ag(j);
      if ((localgA != null) && (localgA.b(paramgA)) && (localgA.nP() != localgA.nR()))
      {
        int m = bCO.go(localgA.nR() - localgA.nP());
        short s2 = bCO.go(Math.min(s1, m));

        bnq localbnq = b(paramgA, s2, j);

        if (localbnq != bnq.fGr) {
          return localbnq;
        }

        s1 = (short)(s1 - s2);
        if (s1 == 0) {
          return bnq.fGr;
        }
      }
    }

    return b(paramgA, s1, this.lGl.cPF());
  }

  private bnq b(gA paramgA, short paramShort, byte paramByte)
  {
    byte b = this.lGl.eW(paramByte);
    cZl localcZl = this.lGl.eV(paramByte);
    if (!localcZl.isEnabled()) {
      return bnq.fGt;
    }
    axb localaxb = new axb(paramgA.oj(), paramShort, b);

    if (!this.lGl.au(paramgA)) {
      return bnq.fGt;
    }

    a(localaxb, localcZl);

    return bnq.fGr;
  }

  public bnq a(long paramLong, byte paramByte) {
    byte b1 = this.lGl.iU(paramLong);
    cZl localcZl1 = this.lGl.eV(b1);
    cZl localcZl2 = this.lGl.eV(paramByte);
    byte b2 = this.lGl.eW(b1);
    byte b3 = this.lGl.eW(paramByte);
    Object localObject;
    if (localcZl1 == localcZl2) {
      localObject = this.lGl.ag(paramByte);
      if ((localObject != null) && (((gA)localObject).oj() == paramLong)) {
        return bnq.fGt;
      }

      dPQ localdPQ = new dPQ(paramLong, b3);
      a(localdPQ, localcZl1);
    }
    else {
      localObject = new aUN();
      ((aUN)localObject).nZ(localcZl1.cMg().aw);
      ((aUN)localObject).oa(localcZl2.cMg().aw);
      ((aUN)localObject).cs(b2);
      ((aUN)localObject).cr(b3);
      byv.bFN().aJK().d((cWG)localObject);
    }

    return bnq.fGr;
  }

  public bnq a(long paramLong1, short paramShort, long paramLong2, byte paramByte) {
    byte b = this.lGl.iU(paramLong1);

    cZl localcZl = this.lGl.eV(b);

    cjz localcjz = new cjz(paramLong1, paramShort, paramLong2, paramByte);
    a(localcjz, localcZl);

    return bnq.fGr;
  }
}