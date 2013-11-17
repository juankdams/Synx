public class awd extends bGk
{
  private static final awd dLk = new awd();

  private final cSR dLl = new cSR();

  private final dWg dLm = new dWg(1024);
  private final bXF dLn = new bXF(null);

  public static awd aIc()
  {
    return dLk;
  }

  public void aId()
  {
    this.dLm.reset();

    if (!this.dLl.isEmpty()) {
      float f = 1.0F;

      this.dLl.s(new dry(this));
    }
  }

  public void update(int paramInt)
  {
  }

  public int getPriority()
  {
    return 600;
  }

  public boolean wS() {
    return this.dLl.isEmpty();
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat) {
    this.dLm.a(paramInt1, paramInt2, paramInt3, paramArrayOfFloat);
  }

  void d(float paramFloat, int paramInt)
  {
    this.dLn.i(paramFloat, paramInt);
    if (!this.dLl.isEmpty()) {
      this.dLl.s(this.dLn);
    }

    int i = this.dLn.hmV.size();
    if (i != 0)
      for (int j = 0; j < i; j++)
        kF(this.dLn.hmV.wm(j));
  }

  public final void c(bGL parambGL)
  {
    this.dLl.put(parambGL.getId(), parambGL);
    beV.fsh.c(parambGL);
  }

  public final void kF(int paramInt) {
    bGL localbGL = (bGL)this.dLl.remove(paramInt);
    beV.fsh.d(localbGL);
  }

  public final void clear() {
    this.dLl.clear();
  }

  public final bGL kG(int paramInt) {
    return (bGL)this.dLl.get(paramInt);
  }

  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.dLm.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }
}