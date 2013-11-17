public abstract class cDn
{
  public abstract int[] R(int[] paramArrayOfInt);

  public abstract int[] S(int[] paramArrayOfInt);

  static cDn a(int paramInt1, int paramInt2, CG paramCG, boolean paramBoolean)
  {
    if ((paramBoolean) || (paramCG == CG.bFP) || (paramCG == CG.bFG))
      return new dco(paramInt1, paramInt2);
    return new cPk(paramInt1, paramInt2, paramCG);
  }
}