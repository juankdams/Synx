import java.nio.ByteBuffer;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class cEP
  implements cMN
{
  protected static final Logger K = Logger.getLogger(cEP.class);

  aoL iyU = new aoL();
  dbo iyV;
  byte iyW = -1;

  public cEP()
  {
  }

  public void e(dbo paramdbo) {
    this.iyV = paramdbo;
  }

  public cEP(cnv paramcnv)
  {
    this.iyV = new dbo(paramcnv);
  }

  public void j(long paramLong, short paramShort) {
    m(paramLong, paramShort);
    this.iyV.B(paramLong, this.iyW + 1);
    this.iyV.AT();
  }

  public void k(long paramLong, short paramShort) {
    m(paramLong, (short)(paramShort + 1));
  }

  public void l(long paramLong, short paramShort) {
    this.iyV.B(paramLong, this.iyW + 1);
    this.iyV.AT();
  }

  public boolean N(long paramLong) {
    return this.iyU.containsKey(paramLong);
  }

  private void m(long paramLong, short paramShort)
  {
    dDP localdDP = new dDP(paramLong, paramShort);
    this.iyU.put(paramLong, localdDP);
    this.iyV.ju(paramLong);
  }

  public void fD(long paramLong)
  {
    if (!N(paramLong)) {
      K.error("On tente de retirer un fighter absent de la timeline (" + paramLong + ')');
      return;
    }

    if ((AP()) && (ae(paramLong))) {
      cAu().dfJ();
    }
    cbQ localcbQ = cAr();
    int i = Math.min(this.iyW + 1, localcbQ.size());
    for (int j = 0; j < i; j++) {
      if (localcbQ.uD(j) == paramLong) {
        this.iyW = ((byte)(this.iyW - 1));
      }
    }
    this.iyV.fD(paramLong);

    this.iyU.remove(paramLong);
  }

  public void AS()
  {
    this.iyV.AS();
  }

  public void AW()
  {
    cAo();
    cAq();
  }

  private void cAo() {
    this.iyV.cMZ();
  }

  public void cAp() {
    this.iyV.AT();
  }

  private void cAq() {
    this.iyW = -1;
  }

  public cbQ cAr() {
    return this.iyV.AO();
  }

  public cbQ cAs() {
    return this.iyV.bPL();
  }

  public boolean AP() {
    return (this.iyW >= 0) && (this.iyW < cAr().size());
  }

  public long cAt() {
    if (!AP()) {
      cAC();
      throw new IllegalStateException("currentFighter() sans hasCurrentFighter()");
    }
    return cAr().get(this.iyW);
  }

  public boolean ae(long paramLong) {
    return (AP()) && (cAt() == paramLong);
  }

  dDP cAu() {
    if (!AP()) {
      cAC();
      throw new IllegalStateException("currentNode() sans hasCurrentFighter()");
    }
    return (dDP)this.iyU.get(cAt());
  }

  public byte cAv() {
    return this.iyW;
  }

  public boolean cAw() {
    return this.iyW + 1 < cAr().size();
  }

  public void cAx() {
    if (!cAw()) {
      return;
    }
    this.iyW = ((byte)(this.iyW + 1));
  }

  public long cAy() {
    if (!cAw()) {
      throw new IllegalStateException("peekAtNextFighter() sans hasNextFighter()");
    }
    return cAr().get(this.iyW + 1);
  }

  public void cAz() {
    if (AP())
      cAu().dfI();
  }

  public Iterator cAA()
  {
    return cAu().cAA();
  }

  public Iterator cAB()
  {
    return cAu().cAB();
  }

  void cAC() {
    String str = toString();
    K.error(str + bBd.cH(1, 5));
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("[Timeline] ");
    localStringBuilder.append("P:").append(this.iyW).append(' ');
    localStringBuilder.append("T:[");

    cbQ localcbQ1 = cAr();

    int i = localcbQ1.size();
    for (int j = 0; j < i; j++) {
      localStringBuilder.append(localcbQ1.get(j)).append(',');
    }
    if (i > 0) {
      localStringBuilder.setLength(localStringBuilder.length() - 1);
    }
    localStringBuilder.append("] D:[");

    cbQ localcbQ2 = this.iyV.bPL();

    int k = localcbQ2.size();
    for (int m = 0; m < k; m++) {
      localStringBuilder.append(localcbQ2.get(m)).append(',');
    }
    if (k > 0) {
      localStringBuilder.setLength(localStringBuilder.length() - 1);
    }
    localStringBuilder.append(']');

    long[] arrayOfLong = this.iyU.aBb();
    int n = arrayOfLong.length;
    localStringBuilder.append(" N:[");
    for (int i1 = 0; i1 < n; i1++) {
      long l = arrayOfLong[i1];
      if (this.iyU.get(l) == null)
        localStringBuilder.append('!');
      localStringBuilder.append(l).append(',');
    }
    if (n > 0) {
      localStringBuilder.setLength(localStringBuilder.length() - 1);
    }
    localStringBuilder.append(']');

    return localStringBuilder.toString();
  }

  public boolean a(bvk parambvk, short paramShort) {
    long l = parambvk.AD();
    dDP localdDP = (dDP)this.iyU.get(l);

    if (localdDP == null) {
      return parambvk.bCU() < paramShort;
    }
    int i = parambvk.bCU() - localdDP.dfK();
    if ((!parambvk.bCT()) && (ae(l))) {
      i--;
    }
    return i < 0;
  }

  public short a(bvk parambvk) {
    long l = parambvk.AD();
    dDP localdDP = (dDP)this.iyU.get(l);

    if (localdDP == null) {
      return -1;
    }

    int i = parambvk.bCU() - localdDP.dfK();
    if ((parambvk.bCT()) && (!ae(l)))
      i++;
    return (short)i;
  }

  public bvk a(dIN paramdIN, cuf paramcuf, boolean paramBoolean) {
    long l = paramdIN.bwA();
    dDP localdDP = (dDP)this.iyU.get(l);

    if (localdDP == null) {
      K.info("[Timeline] Tentative d'attacher un " + paramdIN.getClass().getSimpleName() + " au fighter " + l + " absent de la timeline.");

      return bvk.bCS();
    }
    short s = (short)(localdDP.dfK() + paramcuf.csD());

    if (paramcuf.bCT())
      s = (short)(s - 1);
    if ((paramBoolean) && (paramcuf.csB())) {
      s = (short)(s + 1);
    }
    bvk localbvk = bvk.gf(l).rg(s).fs(paramcuf.bCT());

    localdDP.a(paramdIN, s, paramcuf.bCT());
    return localbvk;
  }

  public void a(dIN paramdIN, long paramLong, short paramShort, boolean paramBoolean) {
    dDP localdDP = (dDP)this.iyU.get(paramLong);
    if (localdDP == null) {
      return;
    }
    localdDP.a(paramdIN, paramShort, paramBoolean);
  }

  public void b(dIN paramdIN, bvk parambvk) {
    dDP localdDP = (dDP)this.iyU.get(parambvk.AD());
    localdDP.a(paramdIN, parambvk.bCU(), parambvk.bCT());
  }

  public cXU im(long paramLong) {
    dDP localdDP = (dDP)this.iyU.get(paramLong);
    return localdDP == null ? null : localdDP.dfM();
  }

  public short in(long paramLong) {
    if (!N(paramLong))
      return -1;
    return (short)(((dDP)this.iyU.get(paramLong)).dfK() - 1);
  }

  public boolean io(long paramLong)
  {
    return (cAw()) && (cAy() == paramLong);
  }

  public boolean ip(long paramLong) {
    return (AP()) && (cAt() == paramLong);
  }

  public int O()
  {
    int i = 1 + this.iyV.O() + 1 + 8 * this.iyU.size();

    for (long l : this.iyU.aBb()) {
      i += ((dDP)this.iyU.get(l)).O();
    }
    return i;
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    this.iyV.b(paramByteBuffer);

    paramByteBuffer.put((byte)this.iyU.size());
    for (int i = 0; i < this.iyU.aBb().length; i++) {
      long l = this.iyU.aBb()[i];
      paramByteBuffer.putLong(l);
      ((dDP)this.iyU.get(l)).b(paramByteBuffer);
    }

    paramByteBuffer.put(this.iyW);
  }

  public void a(ahy paramahy, ByteBuffer paramByteBuffer)
  {
    this.iyV.read(paramByteBuffer);

    int i = paramByteBuffer.get();
    for (int j = 0; j < i; j++) {
      long l = paramByteBuffer.getLong();
      dDP localdDP = dDP.e(paramahy, paramByteBuffer);
      localdDP.X(l);
      this.iyU.put(l, localdDP);
    }

    this.iyW = paramByteBuffer.get();
  }

  public static cEP c(ahy paramahy, ByteBuffer paramByteBuffer) {
    cEP localcEP = new cEP(paramahy.auo());
    localcEP.a(paramahy, paramByteBuffer);
    return localcEP;
  }

  public void clear()
  {
    this.iyU.clear();
    if (this.iyV != null)
      this.iyV.clear();
    cAq();
  }

  public void AZ() {
    dDP[] arrayOfdDP = new dDP[this.iyU.size()];
    this.iyU.d(arrayOfdDP);
    for (int i = 0; i < arrayOfdDP.length; i++) {
      dDP localdDP = arrayOfdDP[i];
      localdDP.dfN();
    }
  }
}