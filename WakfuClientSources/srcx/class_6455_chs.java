import org.apache.log4j.Logger;

public class chs extends brP
{
  private static final Logger K = Logger.getLogger(chs.class);

  public chs(BX paramBX) {
    super(paramBX);
  }

  public boolean dx(int paramInt1, int paramInt2)
  {
    int i = BX.ep(paramInt1);
    int j = BX.er(paramInt1);
    int k = BX.em(paramInt2);
    int m = BX.eq(paramInt2);

    dQx localdQx = ((BX)this.fNP).KT();
    if ((!localdQx.contains(i, k)) || (!localdQx.contains(j, k)) || (!localdQx.contains(i, m)) || (!localdQx.contains(j, m)))
    {
      return false;
    }
    return (!bnp.bS(((BX)this.fNP).R(i, k))) && (!bnp.bS(((BX)this.fNP).R(j, k))) && (!bnp.bS(((BX)this.fNP).R(i, m))) && (!bnp.bS(((BX)this.fNP).R(j, m)));
  }
}