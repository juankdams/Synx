import com.ankamagames.baseImpl.graphics.script.SoundFunctionsLibrary;

public abstract class cCD extends Yo
{
  private final dJe iuY = new dJe();
  private final dxa iuZ = new dxa();
  private static final int edg = 700;
  private final long[] iva = { 400L, 410L, 420L };

  public void a(int paramInt, long paramLong1, long paramLong2, long paramLong3)
  {
    this.iuY.C(paramInt, paramLong1);
    this.iuZ.J(paramLong3, paramLong2);
  }

  private long xq(int paramInt) {
    return this.iuY.remove(paramInt);
  }

  public boolean i(long paramLong1, long paramLong2)
  {
    long l1 = beq.fq(paramLong2);
    if (!aUP.c(this.iva, l1)) {
      return true;
    }
    long l2 = this.iuZ.gd(paramLong2);
    return 700L <= Math.abs(paramLong1 - l2);
  }

  protected boolean atb() {
    return SoundFunctionsLibrary.ckJ().atb();
  }

  public void i(int paramInt, boolean paramBoolean)
  {
    long l = xq(paramInt);
    if (paramBoolean) {
      ZG localZG = cFl.cAH().ir(l);
      SoundFunctionsLibrary.ckJ().a(l, localZG);
    }
  }
}