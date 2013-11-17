import org.apache.log4j.Logger;

public class bGt extends bQf
  implements bWU
{
  protected static final Logger gCU = Logger.getLogger(bGt.class);
  private cVF gCV;
  private static final aee bx = new bOO(new Xz());

  public static bGt a(bHF parambHF, cVF paramcVF)
  {
    bGt localbGt;
    try
    {
      localbGt = (bGt)bx.Mm();
      localbGt.aOr = bx;
    } catch (Exception localException) {
      gCU.error("Erreur lors d'un checkOut sur un message de type ItemExchangerEndEvent : " + localException.getMessage());
      localbGt = new bGt();
    }
    localbGt.b(parambHF, paramcVF);
    return localbGt;
  }

  protected bGt() {
    this.gYo = null;
    this.gYp = null;
  }

  protected void b(bHF parambHF, cVF paramcVF) {
    b(parambHF, bzG.goi);
    this.gCV = paramcVF;
  }

  public void release()
  {
    if (this.aOr != null) {
      this.aOr.y(this);
      this.aOr = null;
    } else {
      gCU.error("Double release de " + getClass().toString());
      bc();
    }
  }

  public cVF bOp() {
    return this.gCV;
  }

  public void aJ()
  {
    super.aJ();
  }

  public void bc()
  {
    super.bc();
    this.gCV = null;
  }
}