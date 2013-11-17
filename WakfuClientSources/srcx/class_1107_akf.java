import org.apache.log4j.Logger;

public final class akf extends Vn
{
  private static final aee bx = new bOO(new agA());

  public akf()
  {
    aH();
  }

  public akf axt()
  {
    akf localakf;
    try {
      localakf = (akf)bx.Mm();
      localakf.aOr = bx;
    } catch (Exception localException) {
      localakf = new akf();
      localakf.aOr = null;
      K.error("Erreur lors d'un newInstance sur un HPLoss : " + localException.getMessage());
    }
    localakf.cpW = this.cpW;

    return localakf;
  }

  protected void ah(short paramShort)
  {
    this.cpW = bTI.dx((byte)((dpI)this.eWL).a(0, paramShort, dNF.mei));
  }

  protected void aiy()
  {
    bFw localbFw = bFw.a(this.ejP, this.cpW, dnO.lnU, this.cxl, this.evp);
    localbFw.i(this.evo);
    localbFw.b(this.eWL);
    localbFw.ct((byte)1);
    localbFw.bNp();
    localbFw.ct((byte)2);
    localbFw.c(null, false);
  }
}