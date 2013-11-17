import org.apache.log4j.Logger;

public class bvI extends dwm
{
  private coe ggc;
  protected int ggd;
  private static final aee bx = new bOO(new azq());

  public coe bDw()
  {
    return this.ggc;
  }

  public int bDx() {
    if (this.lBs != dxK.lEE) {
      throw new UnsupportedOperationException("Amount of cash can be retrieved for Cash Modification events only");
    }
    return this.ggd;
  }

  public static bvI a(bHF parambHF, coe paramcoe)
  {
    bvI localbvI;
    try
    {
      localbvI = (bvI)bx.Mm();
      localbvI.aOr = bx;
    } catch (Exception localException) {
      K.error("Erreur lors d'un checkOut sur un message de type WakfuItemExchangerModifiedEvent : " + localException.getMessage());
      localbvI = new bvI();
    }
    localbvI.b(parambHF, paramcoe);
    return localbvI;
  }

  public static bvI a(bHF parambHF, dxK paramdxK, long paramLong, dsj paramdsj, short paramShort, coe paramcoe) {
    bvI localbvI;
    try {
      localbvI = (bvI)bx.Mm();
      localbvI.aOr = bx;
    } catch (Exception localException) {
      K.error("Erreur lors d'un checkOut sur un message de type ItemExchangerEndEvent : " + localException.getMessage());
      localbvI = new bvI();
    }
    localbvI.b(parambHF, paramdxK, paramLong, paramdsj, paramShort, paramcoe);
    return localbvI;
  }

  public static bvI a(bHF parambHF, dxK paramdxK, long paramLong, int paramInt, coe paramcoe)
  {
    if (paramdxK != dxK.lEE) {
      throw new UnsupportedOperationException("checkout with this parameters should only be use for a cash modification");
    }
    bvI localbvI;
    try
    {
      localbvI = (bvI)bx.Mm();
      localbvI.aOr = bx;
    } catch (Exception localException) {
      K.error("Erreur lors d'un checkOut sur un message de type ItemExchangerEndEvent : " + localException.getMessage());
      localbvI = new bvI();
    }
    localbvI.b(parambHF, paramdxK, paramLong, paramInt, paramcoe);
    return localbvI;
  }

  public static bvI a(bHF parambHF, dxK paramdxK, long paramLong, int paramInt)
  {
    if (paramdxK != dxK.lEE) {
      throw new UnsupportedOperationException("checkout with this parameters should only be use for a cash modification");
    }
    bvI localbvI;
    try
    {
      localbvI = (bvI)bx.Mm();
      localbvI.aOr = bx;
    } catch (Exception localException) {
      K.error("Erreur lors d'un checkOut sur un message de type ItemExchangerEndEvent : " + localException.getMessage());
      localbvI = new bvI();
    }

    localbvI.b(parambHF, paramdxK, paramLong, paramInt, null);
    return localbvI;
  }

  private void b(bHF parambHF, dxK paramdxK, long paramLong, dsj paramdsj, short paramShort, coe paramcoe)
  {
    b(parambHF, bzG.goh);
    this.lBs = paramdxK;
    this.dES = paramLong;
    this.lBt = paramdsj;
    this.lBu = paramShort;
    this.ggc = paramcoe;
  }

  private void b(bHF parambHF, dxK paramdxK, long paramLong, int paramInt, coe paramcoe)
  {
    b(parambHF, bzG.goh);
    this.lBs = paramdxK;
    this.dES = paramLong;
    this.ggd = paramInt;
    this.ggc = paramcoe;
  }

  protected bvI()
  {
    this.gYo = null;
    this.gYp = null;
    this.ggc = null;
  }

  protected void b(bHF parambHF, coe paramcoe) {
    b(parambHF, bzG.goh);
    this.ggc = paramcoe;
  }

  public void release()
  {
    if (this.aOr != null) {
      this.aOr.y(this);
      this.aOr = null;
    } else {
      bc();
    }
  }

  public void aJ()
  {
    super.aJ();
    this.ggc = null;
    this.ggd = -1;
  }

  public void bc()
  {
    super.bc();
    this.ggc = null;
    this.ggd = -1;
  }
}