import org.apache.log4j.Logger;

public class diH
{
  private static final Logger K = Logger.getLogger(diH.class);
  public final String leU;
  public final boolean leV;

  public diH(String paramString, boolean paramBoolean)
  {
    this.leU = paramString;
    this.leV = paramBoolean;
  }

  public boolean b(diH paramdiH) {
    return (this.leV == paramdiH.leV) && (dzp.k(this.leU, paramdiH.leU, false));
  }

  public void bh(Su paramSu) {
    bdi localbdi = cMn.cFp().dP(bUD.getShort(this.leU));
    if (localbdi == null) {
      K.error("breed inconnu " + this.leU);
      return;
    }
    bcg.a(localbdi.brl(), paramSu);
    bcg.c(localbdi.brl(), paramSu);
    bcg.b(localbdi.brl(), paramSu);
  }
}