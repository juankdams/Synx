import java.nio.ByteBuffer;
import java.util.BitSet;
import org.apache.log4j.Logger;

public class cyj extends cMb
  implements AQ, axQ, cdO, dMT, dle
{
  private static final Logger K = Logger.getLogger(cyj.class);
  protected atS imp;
  protected aoV dcN;
  private byte hJn;
  private static final dSc[] imq = { eu.ayM, eu.azk, eu.azl, eu.azm, eu.azn };
  private final cCH kC;

  public cyj()
  {
    this.kC = new cLj(this, 7);
  }

  public boolean boE()
  {
    return true;
  }

  private void k(UG paramUG) {
    if (paramUG != null)
      paramUG.h(this);
  }

  private void aD(ByteBuffer paramByteBuffer)
  {
    this.csY = paramByteBuffer.getInt();
    this.hJn = paramByteBuffer.get();
    if (this.csY <= 0)
      return;
    ckT localckT = cjS.clP().vz(this.csY);
    if (j(localckT)) {
      return;
    }
    bnc.bxw().a(this.csY, new cLl(this, dqt.cXz(), 0, 0));
  }

  private boolean j(ckT paramckT)
  {
    return (paramckT != null) && (paramckT.LB() != null) && (paramckT.LB().au(this.hJn) == this);
  }

  private void cvj() {
    ckT localckT = cjS.clP().vz(this.csY);
    if (localckT == null)
      K.error("Impossible d'ajouter l'obstacle a un combat inconnu " + this.csY);
    k(localckT);
  }

  private void k(ckT paramckT) {
    UG localUG = paramckT.LB();
    if (localUG == null) {
      K.error("Le combat n'a pas de FightMap, impossible d'ajouter l'obstacle");
      return;
    }
    cdO localcdO = localUG.au(this.hJn);
    if (localcdO == null) {
      K.info("Ajout de l'obstacle = " + this);
      localUG.j(this);
    } else if (localcdO != this) {
      K.error("Un autre obstacle différent a le meme ID, ce n'est pas normal");
    }
  }

  public boolean ayb() { return true; }


  public boolean a(dJO paramdJO, bhL parambhL)
  {
    d(paramdJO);
    return false;
  }

  public dJO eR()
  {
    return dJO.lVD;
  }

  public dJO[] eS()
  {
    return dJO.lWj;
  }

  public String getName()
  {
    return bU.fH().b(81, this.imp.getId(), new Object[0]);
  }

  public String cvk()
  {
    int i = this.dcN.e(eu.ayM);
    int j = this.dcN.f(eu.ayM);
    return this.csY != -1 ? " (" + i + " / " + j + ")" : "";
  }

  public boolean aMB()
  {
    return (this.aTn != 2) && (super.aMB());
  }

  public void a(abc paramabc)
  {
  }

  public boolean c(abc paramabc)
  {
    if ((paramabc instanceof ahm)) {
      ((ahm)paramabc).id(dLw.mbl.asR());
    }
    return super.c(paramabc);
  }

  protected cCH ak()
  {
    return this.kC;
  }

  public void al()
  {
    String[] arrayOfString = this.fgH.split(";");
    if (arrayOfString.length != 1) {
      K.error("[LD] La Machine Destructible " + this.aTz + " doit avoir 1 paramètre");
      return;
    }
    atS localatS = (atS)aKY.epr.a(cdc.hvT, Integer.valueOf(arrayOfString[0]).intValue());
    if (localatS == null) {
      K.error("[LD] La Machine Destructible " + this.aTz + " à un paramètre [" + Integer.valueOf(arrayOfString[0]) + "] qui ne correspond a rien dans les Admins");
      return;
    }
    this.imp = localatS;
    cvl();
  }

  private void cvl() {
    this.dcN.acY();
    this.dcN.a(eu.ayM).setMax(this.imp.ash());
    this.dcN.a(eu.ayM).cpx();
    this.dcN.a(eu.azl).set(this.imp.asj());
    this.dcN.a(eu.azk).set(this.imp.ask());
    this.dcN.a(eu.azm).set(this.imp.asl());
    this.dcN.a(eu.azn).set(this.imp.asm());
  }

  public void aJ()
  {
    super.aJ();
    this.csY = -1;
    this.hJn = -1;

    if ((!bB) && (this.dcN != null)) throw new AssertionError();
    this.dcN = new aoV(imq);
    setVisible(true);
    ix(true);
    a(XV.cIy);
    x((short)0);
    D(true);
    eu(true);
    ev(true);
    c(CG.bFG);
    setSelectable(true);
    if ((!bB) && (this.imp != null)) throw new AssertionError();
  }

  public void bc()
  {
    super.bc();
    setVisible(false);
    x((short)2);
    this.dcN = null;
    this.imp = null;
  }

  public byte afD()
  {
    return 0;
  }

  public void dF(byte paramByte) {
    this.hJn = paramByte;
  }

  public byte cgE() {
    return this.hJn;
  }

  public boolean atP() {
    return true;
  }

  public boolean aeH() {
    return sO();
  }

  public boolean atQ() {
    return boD();
  }

  public byte aLY() {
    return 10;
  }

  public dDN atO() {
    return null;
  }

  public boolean bGg() {
    return true;
  }

  public byte[] cls() {
    return new byte[0];
  }

  public void aq(byte[] paramArrayOfByte)
  {
  }

  public void d(int paramInt1, int paramInt2, short paramShort)
  {
  }

  public void q(int paramInt1, int paramInt2, short paramShort) {
  }

  public boolean b(dSc paramdSc) {
    return this.dcN.c(paramdSc);
  }

  public boolean i(Kf paramKf) {
    return false;
  }

  public boolean du(long paramLong) {
    return false;
  }

  public int dv(long paramLong) {
    return -1;
  }

  public boolean r(long paramLong1, long paramLong2) {
    return false;
  }

  public boolean a(long paramLong, axQ paramaxQ) {
    return false;
  }

  public boolean a(long paramLong1, long paramLong2, axQ paramaxQ) {
    return false;
  }

  public boolean s(long paramLong1, long paramLong2) {
    return false;
  }

  public boolean a(afC paramafC) {
    return afC.cYC == paramafC;
  }

  public int aJt() {
    return 0;
  }

  public int kV(int paramInt) {
    return 0;
  }

  public boolean aJs() {
    return false;
  }

  public cqm a(dSc paramdSc) {
    return this.dcN.a(paramdSc);
  }

  public bhh aJp() {
    return null;
  }

  public byte Fx() {
    return -1;
  }

  public void as(byte paramByte) {
  }

  public long aJq() {
    return 0L;
  }

  public boolean aJr() {
    return false;
  }

  public int e(dSc paramdSc) {
    return this.dcN.e(paramdSc);
  }

  public int g(dSc paramdSc) {
    return this.dcN.f(paramdSc);
  }

  public boolean c(Kf paramKf) {
    return false;
  }

  public byte d(Kf paramKf) {
    return 0;
  }

  public void a(Kf paramKf, byte paramByte)
  {
  }

  public void a(Kf paramKf) {
  }

  public void j(Kf paramKf) {
  }

  public void b(Kf paramKf) {
  }

  public void c(CG paramCG) {
    super.c(paramCG);
  }

  public CG atM() {
    return null;
  }

  public void g(CG paramCG) {
  }

  public aYx atN() {
    return null;
  }

  public void b(dle paramdle) {
  }

  public void c(dle paramdle) {
  }

  public void d(dle paramdle) {
  }

  public boolean clu() {
    return false;
  }

  public boolean atL() {
    return false;
  }

  public void ps() {
  }

  public boolean aJu() {
    return false;
  }

  public void adY() {
  }

  public boolean cly() {
    return false;
  }

  public void adZ() {
  }

  public boolean byd() {
    return false;
  }

  public boolean adX() {
    return true;
  }

  public void he(boolean paramBoolean) {
  }

  public dle clC() {
    return this;
  }

  public boolean a(BitSet paramBitSet, aVc paramaVc, byte paramByte) {
    return false;
  }

  public diP tj() {
    return this.imp;
  }
}