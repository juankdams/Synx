import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class mw extends cGj
  implements cfM
{
  private static final Logger K = Logger.getLogger(mw.class);
  public static final String aQG = "categories";
  public static final String aQH = "selectedCategory";
  public static final String aQI = "sidoaText";
  public static final String aQJ = "isDirty";
  public static final String aQK = "quotation";
  public static final String aQL = "totalPrice";
  public static final String aQM = "resources";
  public static final String aQN = "resourcesCost";
  public static final String aQO = "usedSidoas";
  public static final String[] bF = { "categories", "selectedCategory", "sidoaText", "isDirty", "quotation", "totalPrice", "resources", "resourcesCost", "usedSidoas" };

  private final cSR aQP = new cSR();

  private final ArrayList aQQ = new ArrayList();
  private byte aQR;
  private boolean aQS;
  private final bBg aQT;

  public String[] getFields()
  {
    return bF;
  }

  public mw(bBg parambBg) {
    this.aQT = parambBg;

    ud();
    uc();

    this.aQR = ((byte)bUj.hga.getId());
  }

  private dTk a(bUj parambUj) {
    int i = (byte)parambUj.getId();
    dTk localdTk = (dTk)this.aQP.get(i);
    if (localdTk == null) {
      localdTk = new dTk(parambUj);
      this.aQP.put(i, localdTk);
    }
    return localdTk;
  }

  private void uc() {
    dTk localdTk = a(bUj.hfZ);

    ars.dzL.u(new cYz(this, localdTk));
  }

  private void ud()
  {
    dTk localdTk1 = a(bUj.hga);
    dTk localdTk2 = a(bUj.hgb);
    dTk localdTk3 = a(bUj.hgc);

    for (bOB localbOB : ars.dzL.aDR())
      if (localbOB.aTA())
      {
        switch (dxA.i(localbOB)) {
        case 1:
          a(localbOB, bUj.hga, localdTk1);
          break;
        case 2:
          a(localbOB, bUj.hgb, localdTk2);
          break;
        case 3:
          a(localbOB, bUj.hgc, localdTk3);
        case 0:
        }
      }
  }

  private static void a(bvy parambvy, bUj parambUj, dTk paramdTk)
  {
    bZw localbZw = dfX.laF.b(parambvy);
    int i = parambvy.aTz();

    bhZ localbhZ = paramdTk.DX(i);
    if (localbhZ == null) {
      localbhZ = new bhZ(parambUj, i);
      paramdTk.b(localbhZ);
    }
    localbhZ.c(localbZw);
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("categories")) {
      ArrayList localArrayList = new ArrayList();
      Object[] arrayOfObject = this.aQP.getValues();
      for (int i = 0; i < arrayOfObject.length; i++) {
        localArrayList.add((dTk)arrayOfObject[i]);
      }
      Collections.sort(localArrayList, new cYA(this));

      return localArrayList;
    }
    if (paramString.equals("selectedCategory")) {
      return this.aQP.get(this.aQR);
    }
    if (paramString.equals("sidoaText")) {
      return this.aQT.bJX() + "/" + this.aQT.arK();
    }
    if (paramString.equals("isDirty")) {
      return Boolean.valueOf(this.aQS);
    }
    if (paramString.equals("quotation")) {
      return uf();
    }
    if (paramString.equals("totalPrice")) {
      return bU.fH().iK(this.aQT.bJS());
    }
    if (paramString.equals("usedSidoas")) {
      return Integer.valueOf(this.aQT.bJV());
    }
    if (paramString.equals("resources")) {
      return bU.fH().iK(this.aQT.arM());
    }
    if (paramString.equals("resourcesCost")) {
      return bU.fH().iK(this.aQT.bJY());
    }
    return null;
  }

  public int ue() {
    return this.aQQ.size();
  }

  public ArrayList uf() {
    return new ArrayList(this.aQQ);
  }

  public void a(ju paramju) {
    if ((paramju.rj() instanceof ie)) {
      a((ie)paramju.rj());
    }
    this.aQQ.add(paramju);
    this.aQS = true;
  }

  private void a(ie paramie) {
    Iterator localIterator = this.aQQ.iterator();
    while (localIterator.hasNext()) {
      ju localju = (ju)localIterator.next();
      dDO localdDO = localju.rj();
      if ((localdDO instanceof ie))
      {
        bcQ localbcQ1 = (bcQ)((ie)localdDO).Qw();
        bcQ localbcQ2 = (bcQ)paramie.Qw();

        if ((localbcQ1.bqO() == localbcQ2.bqO()) && (localbcQ1.bqP() == localbcQ2.bqP()))
          localIterator.remove(); 
      }
    }
  }

  public void b(ju paramju) { this.aQQ.remove(paramju);
    this.aQS = (!this.aQQ.isEmpty());
    dLE.doY().a(this, bF); }

  public ju b(dDO paramdDO)
  {
    bNi localbNi = paramdDO.Qw();
    return a(localbNi.EN(), localbNi.bqM());
  }

  public ju a(long paramLong, dmh paramdmh) {
    int i = 0; for (int j = this.aQQ.size(); i < j; i++) {
      ju localju = (ju)this.aQQ.get(i);
      bNi localbNi = localju.rj().Qw();
      if ((localbNi.EN() == paramLong) && (localbNi.bqM() == paramdmh)) {
        return localju;
      }
    }
    return null;
  }

  public int p(short paramShort) {
    int i = 0;
    for (ju localju : this.aQQ) {
      bZw localbZw = localju.ri();
      if ((localbZw instanceof aXZ))
      {
        if (((aXZ)localbZw).bnr().nc() == paramShort)
          i++;
      }
    }
    return i;
  }

  public dmh ug() {
    for (bUj localbUj : bUj.values()) {
      if (localbUj.getId() == this.aQR) {
        return localbUj.bqM();
      }
    }
    return null;
  }

  public byte uh() {
    return this.aQR;
  }

  public void x(byte paramByte) {
    this.aQR = paramByte;
    dLE.doY().a(this, new String[] { "selectedCategory" });
  }

  public void ui() {
    dLE.doY().a(this, bF);
  }

  public bBg uj() {
    return this.aQT;
  }

  public boolean isDirty() {
    return this.aQS;
  }

  public void clear() {
    uk();
    this.aQR = -1;
    this.aQP.clear();
  }

  public void uk() {
    this.aQQ.clear();
    this.aQS = false;
    dLE.doY().a(this, bF);
  }

  public boolean b(bZw parambZw) {
    dTk localdTk = (dTk)this.aQP.get(parambZw.uz().getId());
    if (localdTk == null) {
      return true;
    }
    bhZ localbhZ = (bhZ)localdTk.cfe.get(parambZw.bqR().aTz());
    if (localbhZ == null)
      return true;
    ArrayList localArrayList = localbhZ.cwY;

    if (localArrayList == null) {
      return true;
    }
    for (dBv localdBv : localArrayList) {
      if (((parambZw instanceof mV)) && ((localdBv instanceof mV))) {
        cDs localcDs1 = (cDs)((mV)localdBv).bqR();
        cDs localcDs2 = (cDs)((mV)parambZw).bqR();
        if (localcDs1.bqQ() == localcDs2.bqQ()) {
          return ((mV)localdBv).bvn();
        }
      }
    }
    return true;
  }

  public void a(bBg parambBg) {
    this.aQP.s(new cYC(this, parambBg));
  }

  private boolean q(short paramShort)
  {
    cDs localcDs = ars.dzL.aP(paramShort);
    if (localcDs == null)
      return false;
    return dxA.lEm.contains(localcDs.aTz());
  }

  public void a(cuF paramcuF) {
  }

  public void a(bpu parambpu) {
  }

  public void b(cuF paramcuF) {
  }

  public void a(bnt parambnt) {
  }

  public void b(bnt parambnt) {
  }

  public void bG(int paramInt) {
    dLE.doY().a(this, new String[] { "resources" });
  }
}