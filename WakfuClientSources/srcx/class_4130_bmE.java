import org.apache.log4j.Logger;

public abstract class bmE
{
  protected static final float fFr = 1.0F;
  protected static Logger K = Logger.getLogger(bmE.class);
  final float[] fFs;

  public bmE(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.fFs = new float[] { paramFloat1, paramFloat2, paramFloat3, paramFloat4 };
  }

  public cOo bo(float paramFloat)
  {
    if ((!bB) && ((paramFloat < 0.0F) || (paramFloat > 1.0F))) throw new AssertionError();

    if (paramFloat < this.fFs[0])
      return cOo.kwE;
    if (paramFloat < this.fFs[1])
      return cOo.kwF;
    if (paramFloat < this.fFs[2])
      return cOo.kwG;
    if (paramFloat < this.fFs[3])
      return cOo.kwH;
    return cOo.kwI;
  }

  public float a(int paramInt1, int paramInt2, float paramFloat, cOo paramcOo) {
    if ((!bB) && (bo(paramFloat) != paramcOo)) throw new AssertionError();
    if ((!bB) && ((paramcOo == cOo.kwE) || (paramcOo == cOo.kwI))) throw new AssertionError();
    float f1 = a(paramInt1, paramInt2, paramcOo);
    float f2 = b(paramInt1, paramInt2, paramcOo);
    int i = paramcOo.ordinal();
    float f3 = (paramFloat - this.fFs[(i - 1)]) / (this.fFs[i] - this.fFs[(i - 1)]);
    return bCO.s(f1, f2, f3);
  }

  protected abstract float a(int paramInt1, int paramInt2, cOo paramcOo);

  protected abstract float b(int paramInt1, int paramInt2, cOo paramcOo);
}