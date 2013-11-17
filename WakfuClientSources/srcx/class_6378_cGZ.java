import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class cGZ
{
  private final int aw;
  private dbS iBX;
  private final aoL drX = new aoL();
  private final aoL iBY = new aoL();
  private final dPx iBZ = new dPx();
  private final aoL iCa = new aoL();

  private final aoL iCb = new aoL();
  private final dli iCc = new dli();

  private final vK iCd = new vK();

  public cGZ(int paramInt) {
    this.aw = paramInt;
  }

  public int getId() {
    return this.aw;
  }

  public void a(dbS paramdbS) {
    if (this.iBX != null)
      throw new nY("Un observer " + this.iBX + " a déjà été défini sur ce market");
    this.iBX = paramdbS;
  }

  public void b(cyc paramcyc) {
    this.iCd.a(paramcyc);
  }

  public void g(aVw paramaVw)
  {
    long l1 = paramaVw.getId();
    if (this.drX.containsKey(l1)) {
      throw new nY("Une entrée d'Id " + l1 + " existe déjà");
    }

    this.drX.put(l1, paramaVw);

    long l2 = paramaVw.bdG();
    bKR localbKR = (bKR)this.iBY.get(l2);
    if (localbKR == null)
      this.iBY.put(l2, localbKR = new bKR());
    localbKR.add(l1);

    bAp localbAp = paramaVw.bdK();
    Ej localEj1 = (Ej)this.iBZ.bf(localbAp.ewr);
    if (localEj1 == null)
      this.iBZ.c(localbAp.ewr, localEj1 = new Ej(ctB.idz.cdQ));
    localEj1.add(paramaVw);

    int i = paramaVw.aFY();
    int j = paramaVw.Hy().ewr;
    long l3 = bCO.cM(i, j);
    Ej localEj2 = (Ej)this.iCa.get(l3);
    if (localEj2 == null)
      this.iCa.put(l3, localEj2 = new Ej(ctB.idr.cdQ));
    localEj2.add(paramaVw);

    if (this.iBX != null)
      this.iBX.a(this, paramaVw);
  }

  public aVw ix(long paramLong)
  {
    aVw localaVw = (aVw)this.drX.remove(paramLong);
    if (localaVw == null) {
      throw new nY("Entrée " + paramLong + " introuvable");
    }

    long l1 = localaVw.bdG();
    bKR localbKR = (bKR)this.iBY.get(l1);
    localbKR.bB(paramLong);
    if (localbKR.isEmpty()) {
      this.iBY.remove(l1);
    }

    bAp localbAp = localaVw.bdK();
    Ej localEj1 = (Ej)this.iBZ.bf(localbAp.ewr);
    localEj1.remove(localaVw);
    if (localEj1.isEmpty()) {
      this.iBZ.be(localbAp.ewr);
    }

    int i = localaVw.aFY();
    int j = localaVw.Hy().ewr;
    long l2 = bCO.cM(i, j);
    Ej localEj2 = (Ej)this.iCa.get(l2);
    localEj2.remove(localaVw);
    if (localEj2.isEmpty()) {
      this.iCa.remove(l2);
    }
    if (this.iBX != null) {
      this.iBX.b(this, localaVw);
    }
    return localaVw;
  }

  public aVw a(long paramLong1, long paramLong2, short paramShort)
  {
    aVw localaVw1 = (aVw)this.iCb.get(paramLong1);
    if (localaVw1 != null) {
      throw new nY("Le joueur " + paramLong1 + " a déjà un ordre d'achat en attente pour l'entrée " + localaVw1);
    }

    aVw localaVw2 = (aVw)this.drX.get(paramLong2);
    if (localaVw2 == null) {
      throw new nY("Impossible de trouver l'entrée " + paramLong2 + " pour l' ordre d'achat");
    }

    if (localaVw2.bdI() == paramShort)
      ix(localaVw2.getId());
    else
      localaVw2.bj(paramShort);
    this.iCb.put(paramLong1, localaVw2);
    this.iCc.r(paramLong1, paramShort);
    return localaVw2;
  }

  public void iy(long paramLong)
  {
    aVw localaVw = (aVw)this.iCb.remove(paramLong);
    short s = this.iCc.jL(paramLong);
    if (localaVw == null) {
      throw new nY("Aucun ordre d'achat pour le joueur " + paramLong);
    }
    if (this.drX.containsKey(localaVw.getId()))
      localaVw.bk(s);
    else
      g(localaVw);
  }

  public void iz(long paramLong)
  {
    aVw localaVw = (aVw)this.iCb.remove(paramLong);
    short s = this.iCc.jL(paramLong);
    if (localaVw == null) {
      throw new nY("Aucun ordre d'achat pour le joueur " + paramLong);
    }
    this.iCd.a(localaVw, s);

    if (this.iBX != null)
      this.iBX.a(this, localaVw, s);
  }

  public int iA(long paramLong)
  {
    int i = this.iCd.aA(paramLong);
    if (this.iBX != null)
      this.iBX.a(this, paramLong);
    return i;
  }

  public aVw[] iB(long paramLong)
  {
    aoL localaoL = this.iCd.aE(paramLong);
    if (localaoL == null) {
      throw new nY("Aucune entrée expirée a récupérer pour le joueur " + paramLong);
    }

    long[] arrayOfLong = localaoL.aBb();
    aVw[] arrayOfaVw = new aVw[arrayOfLong.length];
    int i = 0; for (int j = arrayOfLong.length; i < j; i++) {
      arrayOfaVw[i] = b(paramLong, arrayOfLong[i]);
    }
    return arrayOfaVw;
  }

  public aVw b(long paramLong1, long paramLong2)
  {
    aVw localaVw = this.iCd.b(paramLong1, paramLong2);
    if (this.iBX != null)
      this.iBX.a(this, paramLong1, localaVw);
    return localaVw;
  }

  public void b(bmr parambmr)
  {
    bAp[] arrayOfbAp = bAp.values();
    int i = 0; for (int j = arrayOfbAp.length; i < j; i++) {
      bAp localbAp = arrayOfbAp[i];
      a(parambmr, localbAp);
    }
  }

  private void a(bmr parambmr, bAp parambAp) {
    Ej localEj = (Ej)this.iBZ.bf(parambAp.ewr);
    long l = parambmr.VN().rP();
    while ((localEj != null) && (!localEj.isEmpty()) && (((aVw)localEj.getFirst()).ek(l))) {
      aVw localaVw = (aVw)localEj.remove(0);

      ix(localaVw.getId());
      this.iCd.a(localaVw);

      if (this.iBX != null)
        this.iBX.c(this, localaVw);
    }
  }

  public aVw iC(long paramLong)
  {
    return (aVw)this.drX.get(paramLong);
  }

  public bKR iD(long paramLong) {
    return (bKR)this.iBY.get(paramLong);
  }

  public int iE(long paramLong) {
    bKR localbKR = iD(paramLong);
    return localbKR != null ? localbKR.size() : 0;
  }

  public aVw iF(long paramLong) {
    return (aVw)this.iCb.get(paramLong);
  }

  public void a(long paramLong, dhL paramdhL) {
    this.iCd.a(paramLong, paramdhL);
  }

  public void iG(long paramLong) {
    this.iCd.aB(paramLong);
  }

  public void aB(long paramLong) {
    bKR localbKR = (bKR)this.iBY.get(paramLong);
    if (localbKR == null)
      return;
    long[] arrayOfLong = localbKR.toArray();
    int i = 0; for (int j = arrayOfLong.length; i < j; i++) {
      long l = arrayOfLong[i];
      ix(l);
    }
  }

  public dhL c(long paramLong1, long paramLong2) {
    return this.iCd.c(paramLong1, paramLong2);
  }

  public int aD(long paramLong) {
    return this.iCd.aD(paramLong);
  }

  public void a(aVw paramaVw) {
    this.iCd.a(paramaVw);
  }

  public aVw d(long paramLong1, long paramLong2) {
    return this.iCd.d(paramLong1, paramLong2);
  }

  public int aF(long paramLong) {
    return this.iCd.aF(paramLong);
  }

  public int size() {
    return this.drX.size();
  }

  public int cBN() {
    return this.iBY.size();
  }

  public int cBO() {
    return this.iCb.size();
  }

  public aVw a(int paramInt, bCe parambCe)
  {
    long l = bCO.cM(paramInt, parambCe.ewr);
    Ej localEj = (Ej)this.iCa.get(l);
    return localEj == null ? null : (aVw)localEj.getFirst();
  }

  public void clear() {
    this.drX.clear();
    this.iBY.clear();
    this.iCb.clear();
    this.iCc.clear();
    this.iCd.clear();
  }

  public byte[] a(alK paramalK, ctB paramctB, short paramShort1, short paramShort2)
  {
    ArrayList localArrayList = new ArrayList();
    for (cHu localcHu = this.drX.aBa(); localcHu.hasNext(); ) {
      localcHu.fl();
      aVw localaVw = (aVw)localcHu.value();
      if (paramalK.b(localaVw)) {
        localArrayList.add(localaVw);
      }
    }

    if (paramctB != null) {
      Collections.sort(localArrayList, paramctB.cdQ);
    }

    int i = Math.max(paramShort1, 0);
    int j = Math.min(paramShort2, localArrayList.size());
    cXr localcXr = new cXr();
    localcXr.putInt(j - i);
    for (int k = i; k < j; k++)
      localcXr.aD(((aVw)localArrayList.get(k)).bdN());
    return localcXr.toArray();
  }

  public byte[] iH(long paramLong) {
    bKR localbKR = (bKR)this.iBY.get(paramLong);

    cXr localcXr = new cXr();

    int i = localbKR == null ? 0 : localbKR.size();
    localcXr.putInt(i);
    bKT localbKT;
    if (localbKR != null) {
      for (localbKT = localbKR.bTc(); localbKT.hasNext(); )
        localcXr.aD(((aVw)this.drX.get(localbKT.bTd())).bdN());
    }
    return localcXr.toArray();
  }

  public byte[] iI(long paramLong) {
    return this.iCd.aG(paramLong);
  }

  public String toString() {
    return "Market{m_id=" + this.aw + ", m_items=" + this.drX.size() + ", m_itemsByCharacterId=" + this.iBY.size() + ", m_ordered=" + this.iCb.size() + ", m_history=" + this.iCd + '}';
  }
}