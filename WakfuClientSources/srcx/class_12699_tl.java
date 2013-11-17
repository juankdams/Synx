import java.nio.ByteBuffer;
import java.util.Iterator;
import org.apache.log4j.Logger;

public abstract class tl
  implements cbl
{
  protected static final Logger K = Logger.getLogger(tl.class);

  protected int bdj = -1;
  protected cMN bdk;
  protected caT bdl;
  private cnv bdm;
  protected short bdn;
  private int bdo = 0;
  protected int bdp;
  private boolean aKV;
  protected dVx bdq = dVx.mus;
  protected boolean bdr;
  private long bds;

  protected tl(int paramInt, cMN paramcMN, caT paramcaT, cnv paramcnv)
  {
    this.bdj = paramInt;
    this.bdk = paramcMN;
    this.bdl = paramcaT;
    this.bdm = paramcnv;
  }

  protected tl(caT paramcaT)
  {
    this(0, new cEP(), paramcaT, null);
  }

  protected void a(cnv paramcnv)
  {
    this.bdm = paramcnv;
    this.bdk.e(new dbo(paramcnv));
  }

  public void cR(int paramInt)
  {
    this.bdp = paramInt;
  }

  public int AL() {
    return this.bdp;
  }

  public void start()
  {
    this.aKV = true;
  }

  public void stop() {
    this.aKV = false;
  }

  public boolean isRunning() {
    return this.aKV;
  }

  public void b(long paramLong, boolean paramBoolean)
  {
    if (paramBoolean)
      this.bdk.j(paramLong, this.bdn);
    else
      this.bdk.k(paramLong, this.bdn);
    ap(paramLong);
  }

  public void ac(long paramLong) {
    if (isRunning()) {
      if ((this.bdk.ae(paramLong)) && ((this.bdq == dVx.muw) || (this.bdq == dVx.mut) || (this.bdq == dVx.muv))) {
        ad(paramLong);
      }
      this.bdk.fD(paramLong);
    }
    aq(paramLong);
  }

  private void ad(long paramLong) {
    this.bdr = true;
    this.bds = paramLong;
  }

  public boolean AM() {
    return this.bdr;
  }

  public void AN() {
    this.bdr = false;
    this.bds = 0L;
  }

  protected cbQ AO()
  {
    return this.bdk.cAr();
  }

  public boolean AP() {
    return (this.bdk.AP()) || (this.bdr);
  }

  public boolean ae(long paramLong) {
    if (this.bdr)
      return this.bds == paramLong;
    return this.bdk.ae(paramLong);
  }

  public boolean af(long paramLong) {
    if (this.bdq != dVx.mut)
      return false;
    if (this.bdr)
      return this.bds == paramLong;
    return this.bdk.ae(paramLong);
  }

  public long AQ()
  {
    return this.bdr ? this.bds : this.bdk.cAt();
  }

  public int AR() {
    return this.bdk.cAv() + (this.bdr ? 1 : 0);
  }

  public int ag(long paramLong) {
    return ah(paramLong);
  }

  public int ah(long paramLong) {
    return this.bdk.cAr().hl(paramLong);
  }

  public int ai(long paramLong) {
    return this.bdk.cAs().hl(paramLong);
  }

  public void AS()
  {
    this.bdk.AS();
  }

  public void AT() {
    this.bdk.cAp();
  }

  public short AU()
  {
    return this.bdn;
  }

  public void AV() {
    Z(false);
  }

  public void Z(boolean paramBoolean) {
    if (!isRunning()) {
      return;
    }
    if (this.bdn == 0) {
      if (this.bdq != dVx.mus)
        return;
      this.bdq = dVx.muu;
    } else {
      if ((!paramBoolean) && (!Bd())) {
        return;
      }
      a(aUF.bjR());
    }

    AW();
  }

  public void AW() {
    if (!isRunning()) {
      return;
    }
    this.bdn = ((short)(this.bdn + 1));
    this.bdk.AW();

    a(abw.anV());
    if (!isRunning()) {
      return;
    }
    rU();
  }

  public int AX()
  {
    return this.bdo;
  }

  public boolean aj(long paramLong)
  {
    if (!at(paramLong)) {
      return false;
    }

    AN();
    this.bdq = dVx.muw;

    this.bdk.cAx();
    rS();

    a(this.bdk.cAA());

    if (!isRunning()) {
      return false;
    }
    if (this.bdq != dVx.muw) {
      return true;
    }
    this.bdq = dVx.mut;
    this.bdo += 1;

    ar(paramLong);
    return true;
  }

  public boolean ak(long paramLong)
  {
    if (this.bdq == dVx.muv) {
      return true;
    }

    if (!this.bdr) {
      if (!au(paramLong)) {
        return false;
      }
      this.bdq = dVx.muv;

      a(this.bdk.cAB());
      if (!this.bdr)
        this.bdk.cAz();
    }
    else if (this.bds != paramLong) {
      return false;
    }

    if (!isRunning()) {
      return false;
    }
    if (this.bdq == dVx.muw) {
      al(paramLong);
      return true;
    }

    this.bdq = dVx.muu;
    AN();
    as(paramLong);
    return true;
  }

  public void al(long paramLong)
  {
    this.bdq = dVx.muu;
    an(paramLong);
  }

  public caT AY()
  {
    return this.bdl;
  }

  public bvk a(dIN paramdIN, cuf paramcuf)
  {
    if (b(paramdIN, paramcuf)) {
      return bvk.bCS();
    }

    long l = paramdIN.bwA();
    return a(paramdIN, paramcuf, l);
  }

  protected bvk a(dIN paramdIN, cuf paramcuf, long paramLong) {
    boolean bool = am(paramLong);

    return this.bdk.a(paramdIN, paramcuf, bool);
  }

  public void AZ() {
    this.bdk.AZ();
  }

  private boolean b(dIN paramdIN, cuf paramcuf) {
    boolean bool = paramcuf.csE();
    if (bool) {
      a(paramdIN);
    }
    return bool;
  }

  protected boolean am(long paramLong) {
    return (this.bdk.ae(paramLong)) && (this.bdq == dVx.mut);
  }

  public cUz Ba()
  {
    return new cUz(AR(), AU(), false);
  }

  public short a(bvk parambvk)
  {
    if (!this.bdk.N(parambvk.AD()))
      return -1;
    return this.bdk.a(parambvk);
  }

  public int O()
  {
    return 11 + this.bdk.O();
  }

  public byte[] Bb() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(O());
    y(localByteBuffer);
    return localByteBuffer.array();
  }

  protected void y(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putShort(this.bdn);
    paramByteBuffer.putInt(this.bdo);
    paramByteBuffer.put(this.bdq.bJ());
    paramByteBuffer.putInt(this.bdp);
    this.bdk.b(paramByteBuffer);
  }

  public void a(cOE paramcOE, byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    Bc();
    ahy localahy = a(paramcOE);
    a(localahy, localByteBuffer);
  }

  protected ahy a(cOE paramcOE) {
    return new ahy(paramcOE, this.bdm);
  }

  protected void a(ahy paramahy, ByteBuffer paramByteBuffer) {
    this.bdn = paramByteBuffer.getShort();
    this.bdo = paramByteBuffer.getInt();
    byte b = paramByteBuffer.get();
    this.bdq = dVx.fZ(b);
    this.bdp = paramByteBuffer.getInt();
    this.bdk.clear();
    this.bdk.a(paramahy, paramByteBuffer);
  }

  protected void Bc()
  {
    stop();
    this.bdk.clear();
  }

  protected void a(ag paramag)
  {
    if (paramag == null) {
      K.error("On ne peut pas envoyer un timeEvent null");
      return;
    }
    if (this.bdl == null) {
      K.error("Pas de TimeEventHandler sur la timeline");
      return;
    }
    try
    {
      paramag.a(this.bdl);
    } catch (Exception localException) {
      K.error("Exception levee", localException);
    }
  }

  protected abstract void an(long paramLong);

  protected abstract void ao(long paramLong);

  protected abstract void rU();

  protected abstract void ap(long paramLong);

  protected abstract void aq(long paramLong);

  protected abstract void rS();

  private void a(Iterator paramIterator)
  {
    while ((isRunning()) && (paramIterator.hasNext())) {
      dIN localdIN = (dIN)paramIterator.next();
      paramIterator.remove();
      a(localdIN);
    }
  }

  private void ar(long paramLong)
  {
    bfX localbfX = bfX.fw(paramLong);
    try {
      a(localbfX);
    } finally {
      localbfX.release();
    }

    if (this.bdk.ae(paramLong))
      ao(paramLong);
  }

  private void as(long paramLong)
  {
    ciz localciz = ciz.ht(paramLong);
    a(localciz);
    localciz.release();

    an(paramLong);
  }

  private boolean Bd()
  {
    if (this.bdq != dVx.muu) {
      K.error(aD("Etat de la timeline incorrect : " + this.bdq + ", attendu: " + dVx.muu + " at " + bBd.rV(5)));
      return false;
    }
    if (this.bdk.cAw()) {
      K.error(aD("Assertion incorrecte sur la timeline (demande de fin de tour alors que joueur suivant = " + (this.bdk.cAw() ? Long.valueOf(this.bdk.cAy()) : "null") + ')').append(bBd.rV(16)));
      return false;
    }
    return true;
  }

  private boolean at(long paramLong) {
    if (this.bdq != dVx.muu) {
      K.error(aD("Etat de la timeline incorrect : " + this.bdq + ", attendu: " + dVx.muu + " at " + bBd.rV(5)));
      return false;
    }
    if (!this.bdk.io(paramLong)) {
      K.error(aD("Assertion incorrecte sur la timeline (joueur suivant = " + (this.bdk.cAw() ? Long.valueOf(this.bdk.cAy()) : "null") + ", attendu = " + paramLong + ')').append(bBd.rV(16)));

      return false;
    }
    return true;
  }

  private boolean au(long paramLong) {
    if (this.bdq != dVx.mut) {
      K.error(aD("Etat de la timeline incorrect : " + this.bdq + ", attendu: " + dVx.mut));
      return false;
    }
    if (!this.bdk.ip(paramLong)) {
      String str = AP() ? String.valueOf(AQ()) : "NONE";
      K.error(aD("Assertion incorrecte sur la timeline (joueur courant = " + str + ", attendu = " + paramLong + ')').append(bBd.rV(16)));
      return false;
    }
    return true;
  }

  public int a()
  {
    return this.bdj;
  }

  public void cS(int paramInt) {
    this.bdj = paramInt;
  }

  protected StringBuilder aD(String paramString)
  {
    return new StringBuilder().append("[_TL_] fightId=").append(this.bdj).append(" - ").append(paramString).append(" - ").append(Be());
  }

  public StringBuilder Be()
  {
    StringBuilder localStringBuilder = new StringBuilder(this.bdk.toString());
    if (this.bdr)
      localStringBuilder.append(" R:").append(this.bds);
    return localStringBuilder;
  }

  protected StringBuilder a(String paramString, Throwable paramThrowable)
  {
    return aD(paramString).append(' ').append(bBd.g(paramThrowable));
  }

  public void av(long paramLong) {
  }

  public long Bf() {
    if (this.bdk.cAw())
      return this.bdk.cAy();
    cbQ localcbQ = this.bdk.cAs();
    if (!localcbQ.isEmpty())
      return localcbQ.get(0);
    return 0L;
  }
}