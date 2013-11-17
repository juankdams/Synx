public abstract class bhK
{
  protected short aEd;
  protected short aEe;

  public bhK()
  {
    this((short)0, (short)0);
  }

  public bhK(short paramShort1, short paramShort2) {
    this.aEd = paramShort1;
    this.aEe = paramShort2;
  }

  public final short nx()
  {
    return this.aEd;
  }

  public final short ny()
  {
    return this.aEe;
  }

  public final void y(short paramShort1, short paramShort2) {
    this.aEd = paramShort1;
    this.aEe = paramShort2;
  }

  public final boolean p(int paramInt1, int paramInt2)
  {
    int i = this.aEd * 18;
    int j = this.aEe * 18;
    return (paramInt1 >= i) && (paramInt1 < i + 18) && (paramInt2 >= j) && (paramInt2 < j + 18);
  }

  public abstract void clear();

  public void d(aYQ paramaYQ)
  {
    this.aEd = paramaYQ.readShort();
    this.aEe = paramaYQ.readShort();
  }

  public void b(dSw paramdSw) {
    paramdSw.writeShort(this.aEd);
    paramdSw.writeShort(this.aEe);
  }

  public final int pH(int paramInt) {
    if ((!bB) && ((paramInt < 0) || (paramInt >= 18))) throw new AssertionError();
    return paramInt + this.aEd * 18;
  }

  public final int pI(int paramInt) {
    if ((!bB) && ((paramInt < 0) || (paramInt >= 18))) throw new AssertionError();
    return paramInt + this.aEe * 18;
  }
}