public class fJ extends dte
{
  private final String Tl;

  public fJ(String paramString)
  {
    this.Tl = paramString;
  }

  public boolean isValid()
  {
    return (this.Tl != null) && (this.Tl.length() > 0);
  }

  public void execute()
  {
    cKX localcKX = cBQ.cxL().a("<b>Attention !\n\nVous êtes sur le point d'envoyer un message à l'ensemble des joueurs connectés, êtes vous sûr ?\n\nMessage :</b>\n" + this.Tl, Cn.et(0), 2073L, 102, 1);

    localcKX.a(new cTZ(this));
  }

  private void mO()
  {
    aZv localaZv = new aZv();
    localaZv.ca(this.Tl);
    localaZv.hH("all_channel");
    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaZv);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}