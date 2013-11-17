import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public abstract class aAY extends JY
  implements bDm, bXV
{
  protected static final Logger K = Logger.getLogger(aAY.class);

  public static final cHu dUf = new aoL().aBa();
  public static final bMX dUg = new bMX();
  private final bcY dUh = new bcY(null);

  protected boolean dUi = false;

  protected final cYq dUj = cYq.cLM();

  private final cYq dUk = cYq.cLM();

  protected final kb dUl = new kb(kb.hwQ);

  protected final kb dUm = new kb(kb.hwQ);

  protected final aoL dUn = new aoL();
  protected final bMX dUo;
  protected final dPE dUp;
  protected final cjH dUq;
  protected final n dUr;
  protected final aoK dUs;
  protected final dtF dUt;
  private final List dUu = new ArrayList();

  protected dwI dUv = null;

  private final Fx dUw = new Fx(this);
  private final dFC dUx = new dFC(this, null);
  private final th dUy = new th(this, null);
  private final czQ dUz = new czQ(this, null);
  private final ZC dUA = new ZC(this, Boolean.valueOf(true), null);
  private final ZC dUB = new ZC(this, Boolean.valueOf(false), null);
  private final cPZ dUC = new cPZ(this, null);
  private final dEH dUD = new dEH(this, null);
  private final czk dUE = new czk(this);
  private final asz dUF = new asz(this, null);
  protected duW dUG = null;

  protected aAY(aYr paramaYr) {
    super(paramaYr);
    this.dUo = aMM();
    this.dUq = aML();
    this.dUr = new n(UI());
    this.dUs = aMK();
    this.dUp = new dPE(UI());
    this.dUt = new dtF(this);
  }

  protected aoK aMK() {
    return new aoK(UI());
  }

  protected cjH aML() {
    return new cjH(UI());
  }

  protected bMX aMM() {
    return new bMX();
  }

  public void ir()
  {
  }

  public void a(bXV parambXV)
  {
    this.dUu.add(parambXV);
  }

  public void b(bXV parambXV)
  {
    this.dUu.remove(parambXV);
  }

  public int aMN() {
    return 3000;
  }

  public n aMO() {
    return this.dUr;
  }

  public aoK aMP() {
    return this.dUs;
  }

  public dPE aMQ() {
    return this.dUp;
  }

  public abstract void d(long paramLong, String paramString);

  public abstract void a(long paramLong, Qy paramQy);

  public void a(dey paramdey)
  {
    throw new UnsupportedOperationException();
  }

  public abstract void t(long paramLong1, long paramLong2);

  public void a(dxL paramdxL, cds paramcds, boolean paramBoolean)
  {
    throw new UnsupportedOperationException("Commande non implémentée sur ce serveur ou ce client");
  }

  public boolean aMR() {
    throw new UnsupportedOperationException("Operation non authorisée sur ce serveur ou ce client");
  }

  public boolean aMS() {
    throw new UnsupportedOperationException("Operation non authorisée sur ce serveur ou ce client");
  }

  public boolean dB(long paramLong) {
    throw new UnsupportedOperationException("Operation non authorisée sur ce serveur ou ce client");
  }

  public boolean dC(long paramLong) {
    throw new UnsupportedOperationException("Operation non authorisée sur ce serveur ou ce client");
  }

  public void a(deS paramdeS) {
    throw new UnsupportedOperationException();
  }

  public void a(long paramLong1, byte paramByte, long paramLong2) {
    throw new UnsupportedOperationException();
  }

  public void a(Yp paramYp1, Yp paramYp2, cuX paramcuX) {
    throw new UnsupportedOperationException();
  }

  public dxL aMT()
  {
    return this.dUj;
  }

  public dxL aMU()
  {
    return this.dUk;
  }

  public cds aMV()
  {
    return this.dUl;
  }

  public kb aMW() {
    return this.dUm;
  }

  public void a(cds paramcds1, cds paramcds2)
  {
    this.dUl.a(paramcds1);
    this.dUm.a(paramcds2);
  }

  public final boolean aMX()
  {
    return this.dUi;
  }

  public final boolean dD(long paramLong) {
    return this.dUt.dD(paramLong);
  }

  public boolean s(dxL paramdxL)
  {
    if (UI() == aYr.feh) {
      this.dUj.P(cYq.kLU);
      return true;
    }

    if (paramdxL.avJ()) {
      K.info("[NATION] La date de début de vote pour la nation " + UI() + " est définie à null. Un nouveau vote va commencer dès que possible.");
      paramdxL = dDE.dft().VN();
    }

    this.dUj.P(paramdxL);
    this.dUk.P(paramdxL);
    this.dUk.n(this.dUl);

    K.debug("[NATION_DEBUG] Vote fixée pour la nation " + UI() + " du " + this.dUj + " au " + this.dUk);

    return !this.dUj.avJ();
  }

  public final boolean u(long paramLong1, long paramLong2)
  {
    Qy localQy = (Qy)this.dUn.get(paramLong2);
    if (localQy == null) {
      return false;
    }
    cTK localcTK = UI().o(paramLong1);
    if (localcTK == null) {
      return false;
    }

    localQy.V((short)(localQy.acg() + 1));
    localcTK.cJf().D(dDE.dft().bcF());
    localcTK.cJf().a(asK.dCA);

    for (int i = 0; i < this.dUu.size(); i++) {
      bXV localbXV = (bXV)this.dUu.get(i);
      localbXV.f(paramLong1, paramLong2);
    }

    return true;
  }

  public final void b(long paramLong, Qy paramQy)
  {
    K.info("[NATION] Enregistrement du character " + paramLong + " (" + paramQy + ") en tant que candidat pour la nation " + UI());

    if (paramQy == null)
    {
      K.error("[NATION] Tentative d'enregistrement d'un candidat null en tant que candidat. CharacterId : " + paramLong + " Nation : " + UI(), new IllegalArgumentException());

      return;
    }

    this.dUn.put(paramLong, paramQy);

    for (int i = 0; i < this.dUu.size(); i++) {
      bXV localbXV = (bXV)this.dUu.get(i);
      localbXV.be(paramLong);
    }
  }

  public final boolean dE(long paramLong) {
    Qy localQy = (Qy)this.dUn.get(paramLong);
    if (localQy == null) {
      K.info("[NATION] On demande le désistement du candidat " + paramLong + " mais il n'est pas enregistré dans la nation " + UI());
      return false;
    }

    localQy.bh(true);

    for (int i = 0; i < this.dUu.size(); i++) {
      bXV localbXV = (bXV)this.dUu.get(i);
      localbXV.bf(paramLong);
    }

    return true;
  }

  public final boolean dF(long paramLong) {
    Qy localQy = (Qy)this.dUn.get(paramLong);
    if (localQy == null) {
      K.info("[NATION] On demande la rééligibilité du candidat " + paramLong + " mais il n'est pas enregistré dans la nation " + UI());
      return false;
    }

    localQy.bh(false);

    for (int i = 0; i < this.dUu.size(); i++) {
      bXV localbXV = (bXV)this.dUu.get(i);
      localbXV.bg(paramLong);
    }

    return true;
  }

  public boolean dG(long paramLong)
  {
    return this.dUn.containsKey(paramLong);
  }

  public Qy dH(long paramLong) {
    return (Qy)this.dUn.get(paramLong);
  }

  protected boolean aMY() {
    return !this.dUn.isEmpty();
  }

  protected void aMZ()
  {
    this.dUn.clear();
  }

  public cHu aNa()
  {
    return this.dUn.aBa();
  }

  public int abA() {
    return this.dUn.size();
  }

  public int aNb() {
    this.dUh.size = 0;
    this.dUn.s(this.dUh);
    return this.dUh.size;
  }

  public void b(int paramInt1, int paramInt2, ArrayList paramArrayList) {
    int i = paramInt1 + Math.min(paramInt2, this.dUn.size() - paramInt1);
    Object[] arrayOfObject = this.dUn.getValues();
    for (int j = paramInt1; j < i; j++)
      paramArrayList.add((Qy)arrayOfObject[j]);
  }

  public void C(ArrayList paramArrayList)
  {
    throw new UnsupportedOperationException();
  }

  public void bz(int paramInt1, int paramInt2) {
    throw new UnsupportedOperationException();
  }

  public void h(aYr paramaYr) {
    this.dUo.clear();
    this.dUo.p(paramaYr);
  }

  public bMX aNc() {
    return this.dUo;
  }

  public cjH aNd() {
    return this.dUq;
  }

  public void lz(int paramInt)
  {
  }

  public hk aNe()
  {
    return this.dUG;
  }

  public hk aNf() {
    return this.dUw;
  }

  public hk aNg() {
    return this.dUx;
  }

  public hk aNh()
  {
    if (this.dUv == null) {
      this.dUv = new dwI(this);
    }
    return this.dUv;
  }

  public hk aNi() {
    return this.dUy;
  }

  public hk aNj() {
    return this.dUz;
  }

  public hk aNk() {
    return this.dUA;
  }

  public hk aNl() {
    return this.dUB;
  }

  public hk aNm() {
    return this.dUC;
  }

  public hk aNn() {
    return this.dUD;
  }

  public czk aNo() {
    return this.dUE;
  }

  public hk aNp() {
    return this.dUF;
  }

  public void clear() {
    aMZ();
  }
}