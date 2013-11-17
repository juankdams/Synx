 enum he
{
  he()
  {
    super(str, i, null);
  }
  public boolean a(aGH[] paramArrayOfaGH) {
    bHj localbHj1 = (bHj)paramArrayOfaGH[0].bSC();
    boolean bool = localbHj1.c(cPC.kyN);

    int i = 1; for (int j = paramArrayOfaGH.length; i < j; i++) {
      aGH localaGH = paramArrayOfaGH[i];
      bHj localbHj2 = (bHj)localaGH.bSC();
      if (!localbHj2.bOT())
      {
        if (localbHj2.c(cPC.kyN) != bool)
          return false;
      }
    }
    return true;
  }
}