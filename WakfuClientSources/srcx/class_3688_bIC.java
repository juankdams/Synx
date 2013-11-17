import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import org.apache.log4j.Logger;

public abstract class bIC extends tl
{
  protected final dDe gHu;
  private boolean gHM = false;
  private final eB gHN;
  protected final dEB fnx;
  aoL gHO = new aoL();

  protected bIC(caT paramcaT, eB parameB, dDe paramdDe, cnv paramcnv, cMN paramcMN)
  {
    super(((arO)paramcaT).getId(), paramcMN, paramcaT, paramcnv);
    this.gHN = parameB;
    this.fnx = ((dEB)paramcaT);
    this.gHu = paramdDe;
  }

  protected cbQ AO()
  {
    return super.AO();
  }

  public void AS()
  {
    super.AS();
    bPK();
  }

  private void bPK() {
    cbQ localcbQ = bPL();

    int[] arrayOfInt = new int[localcbQ.size()];
    for (int i = localcbQ.size(); i-- > 0; ) {
      arrayOfInt[i] = this.gHu.fc(localcbQ.get(i));
    }
    bPN().aD(cTT.W(arrayOfInt));
    Ii();
  }

  protected void Ii() {
  }

  public cbQ bPL() {
    return this.bdk.cAs();
  }

  public abstract void Ic();

  protected void rU()
  {
    bPM();
  }

  private void bPM()
  {
    Iterator localIterator;
    for (long l : this.gHO.aBb())
      for (localIterator = ((dge)this.gHO.get(l)).iterator(); localIterator.hasNext(); ) {
        if (!isRunning())
          return;
        bbL localbbL = (bbL)localIterator.next();
        if (b(localbbL)) {
          localIterator.remove();
          c(localbbL);
        }
      }
  }

  public void b(long paramLong, boolean paramBoolean)
  {
    if (this.gHO.containsKey(paramLong)) {
      K.error(aD("Échec de l'ajout à la Timeline de " + paramLong + " (présent dans les fighters stockés)"));
      gM(paramLong);
      return;
    }
    super.b(paramLong, paramBoolean);
  }

  public void av(long paramLong) {
    if (!this.bdk.N(paramLong)) {
      K.error(aD("Échec du stockage des événements pour " + paramLong + " : fighter absent"));
      return;
    }
    short s = this.bdk.in(paramLong);
    if (am(paramLong)) {
      s = (short)(s + 1);
    }
    dge localdge = new dge(s);
    cXU localcXU = this.bdk.im(paramLong);
    while (localcXU.cLp()) {
      localdge.d(bbL.a(localcXU.cLr(), localcXU.cLq()));
    }
    this.gHO.put(paramLong, localdge);
    super.ac(paramLong);
  }

  public void gM(long paramLong) {
    if (!this.gHO.containsKey(paramLong)) {
      K.error(aD("Échec de restauration des événements pour " + paramLong + " : absent des fighters stockés"));
      return;
    }

    dge localdge = (dge)this.gHO.remove(paramLong);
    b(paramLong, true);
    a(localdge);
  }

  public void ac(long paramLong)
  {
    if (!this.gHO.containsKey(paramLong)) {
      K.error(aD("Échec du retrait de la Timeline de " + paramLong + " : absent des fighters stockés"));
      return;
    }
    this.gHO.remove(paramLong);
  }

  private void a(dge paramdge)
  {
    if (paramdge == null)
      return;
    for (bbL localbbL : paramdge)
      if (b(localbbL))
        c(localbbL);
      else
        a(localbbL);
  }

  private void a(bbL parambbL)
  {
    this.bdk.b(parambbL.bqj(), parambbL.bqi());
  }

  private boolean b(bbL parambbL) {
    return this.bdk.a(parambbL.bqi(), this.bdn);
  }

  private void c(bbL parambbL) {
    dIN localdIN = parambbL.bqj();
    if (localdIN == null)
      return;
    a(localdIN);
  }

  public short a(bvk parambvk)
  {
    if (this.bdk.N(parambvk.AD())) {
      return super.a(parambvk);
    }
    int i = parambvk.bCU() - this.bdn;
    if (parambvk.bCT()) {
      i++;
    }
    if ((this.gHO.containsKey(parambvk.AD())) && (!((dge)this.gHO.get(parambvk.AD())).ec(this.bdn)))
    {
      i--;
    }return (short)i;
  }

  protected bvk a(dIN paramdIN, cuf paramcuf, long paramLong)
  {
    if (!this.gHO.containsKey(paramLong)) {
      return super.a(paramdIN, paramcuf, paramLong);
    }
    if (paramdIN.isPersistent()) {
      return bvk.bCS();
    }
    int i = (short)(AU() + paramcuf.csD());
    bvk localbvk = bvk.gf(paramLong).rg(i).fs(paramcuf.bCT());

    dge localdge = (dge)this.gHO.get(paramLong);
    localdge.d(bbL.a(paramdIN, localbvk));

    return localbvk;
  }

  public int O()
  {
    int i = super.O() + 1;
    for (long l : this.gHO.aBb()) {
      i += 8 + ((dge)this.gHO.get(l)).O();
    }
    int j = this.fnx.bgG().size();
    i += 1 + j * 12;
    return i;
  }

  protected void y(ByteBuffer paramByteBuffer)
  {
    super.y(paramByteBuffer);
    paramByteBuffer.put((byte)this.gHO.size());
    for (long l : this.gHO.aBb()) {
      paramByteBuffer.putLong(l);
      ((dge)this.gHO.get(l)).b(paramByteBuffer);
    }
    ??? = this.fnx.bgG();
    paramByteBuffer.put((byte)((Collection)???).size());
    for (Iterator localIterator = ((Collection)???).iterator(); localIterator.hasNext(); ) {
      dhJ localdhJ = (dhJ)localIterator.next();
      paramByteBuffer.putLong(localdhJ.getId());
      paramByteBuffer.putInt(this.gHN.r(localdhJ.getId()));
    }
  }

  protected void Bc()
  {
    super.Bc();
    this.gHO.clear();
  }

  public void gN(long paramLong) {
    this.bdk.l(paramLong, this.bdn);
  }

  protected void a(ahy paramahy, ByteBuffer paramByteBuffer)
  {
    super.a(paramahy, paramByteBuffer);
    int i = paramByteBuffer.get();
    for (int j = 0; j < i; j++) {
      long l1 = paramByteBuffer.getLong();
      dge localdge = dge.b(paramahy, l1, paramByteBuffer);
      this.gHO.put(l1, localdge);
    }
    j = paramByteBuffer.get();
    for (int k = 0; k < j; k++) {
      long l2 = paramByteBuffer.getLong();
      int m = paramByteBuffer.getInt();
      ((Ok)this.gHN).f(l2, m);
    }
  }

  public StringBuilder Be()
  {
    StringBuilder localStringBuilder = super.Be();
    localStringBuilder.append(" S:[");
    if (!this.gHO.isEmpty()) {
      for (long l : this.gHO.aBb()) {
        localStringBuilder.append(l).append(',');
      }
      localStringBuilder.setLength(localStringBuilder.length() - 1);
    }
    localStringBuilder.append(']');

    localStringBuilder.append(" E:[");
    AO().b(new CZ(this, localStringBuilder));

    localStringBuilder.setLength(localStringBuilder.length() - 1);
    localStringBuilder.append("]/");

    localStringBuilder.append(this.gHN.lQ());

    localStringBuilder.append(" I:[");
    bPL().b(new Da(this, localStringBuilder));

    localStringBuilder.setLength(localStringBuilder.length() - 1);
    localStringBuilder.append(']');

    return localStringBuilder;
  }

  public eB bPN()
  {
    return this.gHN;
  }

  public void qx(int paramInt) {
    this.gHM = false;
    this.gHN.aD(paramInt);
    Ii();
  }
}