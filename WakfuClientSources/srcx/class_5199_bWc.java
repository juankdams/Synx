import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public abstract class bWc extends dIN
{
  private static final int hiq = -1;
  protected aVc etJ;
  private static final Logger K = Logger.getLogger(bWc.class);
  private long hir;
  private long kD;

  public aVc cbs()
  {
    if ((this.etJ != null) && (this.etJ.oj() != this.hir)) {
      K.error("Le running effect n'est plus le même qu'a la creation de l'event " + this.hir);
      return null;
    }
    return this.etJ;
  }

  public boolean isValid()
  {
    return (this.etJ != null) && (this.etJ.oj() == this.hir);
  }

  protected void L(aVc paramaVc)
  {
    this.etJ = paramaVc;
    this.hir = paramaVc.oj();
    this.etJ.a(this);
  }

  protected void O(long paramLong) {
    this.kD = paramLong;
  }

  protected void b(aVc paramaVc, long paramLong) {
    L(paramaVc);
    this.kD = paramLong;
  }

  public long bwA()
  {
    long l = this.kD;
    if (this.etJ == null)
      return l;
    duF localduF = this.etJ.bkc();
    if (localduF == null)
      return l;
    if ((localduF.atX()) && 
      (this.etJ.bke() != null))
      return this.etJ.bke().getId();
    return l;
  }

  protected int bwy()
  {
    return 16;
  }

  protected void at(ByteBuffer paramByteBuffer)
  {
    if (this.etJ == null)
      paramByteBuffer.putLong(-1L);
    else {
      paramByteBuffer.putLong(this.hir);
    }
    paramByteBuffer.putLong(this.kD);
  }

  protected void b(ahy paramahy, ByteBuffer paramByteBuffer)
  {
    long l = paramByteBuffer.getLong();
    this.kD = paramByteBuffer.getLong();
    if (l == -1L) {
      return;
    }
    aVc localaVc = paramahy.cN(l);
    if (localaVc == null)
    {
      K.warn("Désérialisation de timeline : on ne trouve pas le RunningEffect d'UID " + l);
      return;
    }
    L(localaVc);
  }

  public boolean isPersistent()
  {
    return (this.etJ != null) && (this.etJ.isPersistent());
  }

  public void cbt() {
    this.etJ = null;
    diA();
  }
}