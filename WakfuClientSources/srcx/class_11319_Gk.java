public class Gk extends bmE
{
  public Gk(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    super(paramFloat1, paramFloat2, paramFloat3, paramFloat4);

    if ((!bB) && (a(-1, 1, cOo.kwG) != b(-1, 1, cOo.kwF))) throw new AssertionError();
    if ((!bB) && (a(-1, 1, cOo.kwH) != b(-1, 1, cOo.kwG))) throw new AssertionError();
  }

  public float a(int paramInt1, int paramInt2, float paramFloat, cOo paramcOo)
  {
    int i = paramInt1 - paramInt2;

    return paramInt1 - i * paramFloat;
  }

  protected float b(int paramInt1, int paramInt2, cOo paramcOo)
  {
    if ((!bB) && ((paramcOo == cOo.kwE) || (paramcOo == cOo.kwI))) throw new AssertionError();
    switch (bHY.aKD[paramcOo.ordinal()]) {
    case 1:
      return paramInt1 + 0.4F;
    case 2:
      return paramInt1 + 0.4F;
    case 3:
      return paramInt2;
    }
    throw new IllegalArgumentException("phase de suat incorrect " + paramcOo);
  }

  protected float a(int paramInt1, int paramInt2, cOo paramcOo) {
    if ((!bB) && ((paramcOo == cOo.kwE) || (paramcOo == cOo.kwI))) throw new AssertionError();
    switch (bHY.aKD[paramcOo.ordinal()]) {
    case 1:
      return paramInt1;
    case 2:
      return paramInt1 + 0.4F;
    case 3:
      return paramInt1 + 0.4F;
    }
    throw new IllegalArgumentException("phase de suat incorrect " + paramcOo);
  }
}