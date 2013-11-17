import java.nio.ByteBuffer;
import java.util.ArrayList;

public class cjH
{
  protected final aYr bwL;
  private final aoL hJh = new aoL();
  protected final dxa hJi = new dxa();

  private final ArrayList aBf = new ArrayList();

  public cjH(aYr paramaYr) {
    this.bwL = paramaYr;
  }

  public void a(cFY paramcFY) {
    if (!this.aBf.contains(paramcFY))
      this.aBf.add(paramcFY);
  }

  public void b(cFY paramcFY) {
    this.aBf.remove(paramcFY);
  }

  public void b(dpE paramdpE) {
    if ((this.hJi.N(paramdpE.getId())) || (this.hJh.N(paramdpE.HK().getId())))
      dK(paramdpE.getId());
    this.hJh.put(paramdpE.HK().getId(), paramdpE);
    this.hJi.J(paramdpE.getId(), paramdpE.HK().getId());

    for (int i = 0; i < this.aBf.size(); i++)
      ((cFY)this.aBf.get(i)).c(paramdpE);
  }

  public void dK(long paramLong) {
    long l = this.hJi.gc(paramLong);
    dpE localdpE = (dpE)this.hJh.remove(l);

    for (int i = 0; i < this.aBf.size(); i++)
      ((cFY)this.aBf.get(i)).d(localdpE);
  }

  public void m(Yp paramYp) {
    dpE localdpE = (dpE)this.hJh.get(paramYp.getId());
    if (localdpE != null)
      dK(localdpE.getId());
  }

  public void clo() {
    for (aSp localaSp = this.hJi.dco(); localaSp.hasNext(); ) {
      localaSp.fl();
      dpE localdpE = (dpE)this.hJh.remove(localaSp.bid());
      localaSp.remove();

      for (int i = 0; i < this.aBf.size(); i++)
        ((cFY)this.aBf.get(i)).d(localdpE);
    }
  }

  public void clear() {
    this.hJh.clear();
    this.hJi.clear();
  }

  public dpE clp()
  {
    return (dpE)this.hJh.get(Yp.cIQ.getId());
  }

  public dpE hv(long paramLong)
  {
    return (dpE)this.hJh.get(this.hJi.gd(paramLong));
  }

  public dpE n(Yp paramYp)
  {
    return (dpE)this.hJh.get(paramYp.getId());
  }

  public cHu clq() {
    return this.hJh.aBa();
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.hJh.size());
    for (cHu localcHu = this.hJh.aBa(); localcHu.hasNext(); ) {
      localcHu.fl();
      ((dpE)localcHu.value()).b(paramByteBuffer);
    }
  }

  public void U(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getInt();
    for (int j = 0; j < i; j++) {
      dpE localdpE = dpE.aL(paramByteBuffer);
      this.hJh.put(localdpE.HK().getId(), localdpE);
      this.hJi.J(localdpE.getId(), localdpE.HK().getId());
    }
  }

  public int O() {
    int i = 4;
    for (cHu localcHu = this.hJh.aBa(); localcHu.hasNext(); ) {
      localcHu.fl();
      i += ((dpE)localcHu.value()).O();
    }
    return i;
  }
}