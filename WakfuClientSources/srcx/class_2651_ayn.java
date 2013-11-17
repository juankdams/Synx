import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import org.apache.log4j.Logger;

public final class ayn extends aid
  implements cVH
{
  private long cXv;
  private bxH dOi;
  private bFg dOj;
  private bFg dOk;
  private bFg dOl;
  private FD dOm = null;
  private final ArrayList dOn;
  private final cSi dOo;
  private final cSi dOp;
  private final cSi dOq;
  private final cSi dOr;
  private final ArrayList dOs;
  private final EnumMap dOt;
  private final asX dOu;
  private final aur dOv;
  private cYk cGk = new cYk();

  private int[] dOw = null;
  private chC dOx;

  ayn(int paramInt)
  {
    super(paramInt);

    this.dOt = new EnumMap(cVE.class);
    this.dOn = new ArrayList();
    this.dOp = new cSi();
    this.dOq = new cSi();
    this.dOu = new asX(this);
    this.dOs = new ArrayList();
    this.dOr = new cSi();
    this.dOo = new cSi();
    this.dOv = new aur(this);
  }

  public String getName() {
    return bU.fH().b(48, getId(), new Object[0]);
  }

  public long aqN() {
    return this.cXv;
  }

  public void dz(long paramLong) {
    this.cXv = paramLong;
  }

  public cYk aKb() {
    return this.cGk;
  }

  public void d(int paramInt1, int paramInt2, short paramShort) {
    this.cGk.ac(paramInt1, paramInt2, paramShort);
  }

  public int[] aKc() {
    return this.dOw;
  }

  public void r(int[] paramArrayOfInt) {
    this.dOw = paramArrayOfInt;
  }

  public cBV[] aKd() {
    aYr localaYr = ava();
    if (localaYr != null) {
      crV localcrV = localaYr.ix(getId());
      if (localcrV != null) {
        cBV[] arrayOfcBV = new cBV[localcrV.size()];
        int i = 0; for (int j = localcrV.size(); i < j; i++) {
          int k = localcrV.wm(i);
          arrayOfcBV[i] = ((cBV)dPR.mji.Do(k));
        }
        return arrayOfcBV;
      }

    }

    return new cBV[0];
  }

  public bFg aKe() {
    return this.dOj;
  }

  public void b(bFg parambFg) {
    this.dOj = parambFg;
    this.dOm = new FD(parambFg);
    this.dOj.a(new aVp(this));
  }

  public void aKf()
  {
    if (this.dOm != null)
      this.dOm.update();
  }

  public void aKg()
  {
    if (this.dOm != null)
      this.dOm.Pp();
  }

  public FD aKh()
  {
    return this.dOm;
  }

  public bxH aKi() {
    return this.dOi;
  }

  public void a(bxH parambxH) {
    this.dOi = parambxH;
  }

  public bFg aKj() {
    return this.dOk;
  }

  public void c(bFg parambFg) {
    this.dOk = parambFg;
  }

  public byo aKk() {
    Su localSu = CA.Lv().bj(this.cXv);
    if ((localSu instanceof byo))
      return (byo)localSu;
    if (localSu != null) {
      K.error("Un protecteur a un uid qui ne correspond pas à celui d'un NPC uid=" + this.cXv);
    }

    return null;
  }

  public String aAU() {
    bva localbva = (bva)avb();
    if (localbva == null) {
      return null;
    }
    if (bU.fH().ed(66, localbva.getId())) {
      String str = bU.fH().b(66, localbva.getId(), new Object[0]);
      if ((str != null) && (str.length() > 0)) {
        return str;
      }
    }
    return null;
  }

  public bFg aKl() {
    return this.dOl;
  }

  public void d(bFg parambFg) {
    this.dOl = parambFg;
  }

  public ArrayList aKm() {
    return this.dOn;
  }

  public cSi aKn() {
    return this.dOp;
  }

  public cSi aKo() {
    return this.dOo;
  }

  public cSi aKp() {
    return this.dOq;
  }

  public cSi aKq() {
    return this.dOr;
  }

  public EnumMap aKr() {
    return this.dOt;
  }

  public asX aKs() {
    return this.dOu;
  }

  public cIZ ave()
  {
    return this.dOu.ZU();
  }

  public void a(deN paramdeN) {
    this.dOs.add(paramdeN);
  }

  public Iterator aKt() {
    return this.dOs.iterator();
  }

  public aur aKu() {
    return this.dOv;
  }

  public float a(cVE paramcVE) {
    return ((baR)this.dOt.get(paramcVE)).getValue();
  }

  public void a(cVE paramcVE, float paramFloat) {
    ((baR)this.dOt.get(paramcVE)).setValue(paramFloat);
  }

  public int c(dkl paramdkl, cVE paramcVE, int paramInt) {
    if (!a(paramdkl)) {
      return 0;
    }
    baR localbaR = (baR)this.dOt.get(paramcVE);
    return localbaR != null ? localbaR.oF(paramInt) : 0;
  }

  public void a(cVE paramcVE, int paramInt) {
    throw new UnsupportedOperationException("Non supporté dnas le client");
  }

  public boolean a(dkl paramdkl) {
    if (!(paramdkl instanceof Su)) {
      return false;
    }

    return true;
  }

  public cYk ML() {
    return this.cGk;
  }

  public void a(chC paramchC) {
    this.dOx = paramchC;
  }

  public chC aKv() {
    return this.dOx;
  }
}