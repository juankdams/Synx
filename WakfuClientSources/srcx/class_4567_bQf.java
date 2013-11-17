import org.apache.log4j.Logger;

public class bQf
  implements bWU
{
  protected static final Logger K = Logger.getLogger(bQf.class);
  protected bzG gYo;
  protected bHF gYp;
  protected long dES = -1L;
  protected aee aOr;
  private static final aee bx = new bOO(new bgd());

  public static bQf a(bHF parambHF, bzG parambzG)
  {
    bQf localbQf;
    try
    {
      localbQf = (bQf)bx.Mm();
      localbQf.aOr = bx;
    } catch (Exception localException) {
      K.error("Erreur lors d'un checkOut sur un message de type ItemExchangerEvent : " + localException.getMessage());
      localbQf = new bQf();
    }
    localbQf.b(parambHF, parambzG);
    return localbQf;
  }

  protected bQf() {
    this.gYo = null;
    this.gYp = null;
  }

  protected void b(bHF parambHF, bzG parambzG) {
    this.gYp = parambHF;
    this.gYo = parambzG;
  }

  public void release() {
    if (this.aOr != null) {
      this.aOr.y(this);
      this.aOr = null;
    } else {
      K.error("Double release de " + getClass().toString());
      bc();
    }
  }

  public bzG bXt() {
    return this.gYo;
  }

  public bHF bXu() {
    return this.gYp;
  }

  public void gV(long paramLong) {
    this.dES = paramLong;
  }

  public long aFL() {
    return this.dES;
  }

  public void aJ() {
  }

  public void bc() {
    this.gYp = null;
    this.gYo = null;
    this.dES = -1L;
  }
}