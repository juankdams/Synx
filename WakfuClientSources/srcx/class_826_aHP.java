public class aHP extends dte
{
  private final String ega;
  private final String Tl;
  private static final String egb = "*";

  public aHP(String paramString)
  {
    this("*", paramString);
  }

  public aHP(String paramString1, String paramString2) {
    this.ega = paramString1;
    this.Tl = paramString2;
  }

  public boolean isValid()
  {
    return (this.Tl != null) && (this.ega != null);
  }

  public void execute()
  {
    if ("*".equals(this.ega)) {
      cKX localcKX = cBQ.cxL().a("<b>Attention !\n\nVous êtes sur le point d'envoyer un message à l'ensemble des joueurs connectés, êtes vous sûr ?\n\nMessage :</b>\n" + this.Tl, Cn.et(0), 2073L, 102, 1);

      localcKX.a(new dEx(this));
    }
    else
    {
      mO();
    }
  }

  private void mO() {
    aIG localaIG = new aIG();
    localaIG.bM((byte)2);
    localaIG.bf((short)34);
    localaIG.gC(this.ega);
    localaIG.gC(this.Tl);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}