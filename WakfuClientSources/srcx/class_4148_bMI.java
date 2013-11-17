import org.apache.log4j.Logger;

public abstract class bMI
  implements cMc
{
  private static final Logger K = Logger.getLogger(bMI.class);
  private static final String NAME = "name";
  protected String m_name;

  public void A(K paramK)
  {
    K localK = paramK.e("name");
    if (localK != null)
      this.m_name = localK.getStringValue();
  }

  public void a(cZy paramcZy)
  {
    dEn localdEn = paramcZy.gD(this.m_name);
    if (localdEn == null) {
      K.warn("Impossible de trouver la préférence " + this.m_name);
      return;
    }

    a(localdEn, paramcZy);
  }

  protected abstract void a(dEn paramdEn, cZy paramcZy);
}