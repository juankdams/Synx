import java.nio.ByteBuffer;

public abstract class VI extends cJZ
{
  protected final aCH cAO;
  protected final int aSf;
  private boolean cAP;

  VI(int paramInt1, byte paramByte, bZA parambZA, boolean paramBoolean1, aCH paramaCH, int paramInt2, long paramLong, boolean paramBoolean2, boolean paramBoolean3)
  {
    super(paramInt1, paramByte, parambZA, paramBoolean1, paramBoolean3, paramLong);
    this.cAO = paramaCH;
    this.aSf = paramInt2;
    this.cAP = paramBoolean2;
  }

  public void a(byo parambyo) {
    if (this.cAP)
      byv.bFN().bFO().bHi().hV(this.ctZ);
  }

  public boolean h(byo parambyo) {
    byz localbyz1 = byv.bFN().bFO();
    byz localbyz2 = this.geW ? parambyo : localbyz1;
    byo localbyo = this.geW ? localbyz1 : parambyo;
    return (this.aB == null) || (this.aB.i(localbyz2, localbyo, this, localbyz2.ayL()));
  }

  public aCH te() {
    return this.cAO;
  }

  public int uN() {
    return this.aSf;
  }

  protected void bZ(long paramLong)
  {
    awX localawX = new awX(paramLong, this);
    byv.bFN().aJK().d(localawX);
    clear();
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    throw new UnsupportedOperationException("Pas de désérialization dans le Client");
  }
}