import org.apache.log4j.Logger;

public final class qL extends aWS
{
  private static final aee bx = new bOO(new dbq());

  public qL()
  {
    aH();
  }

  public qL xC()
  {
    qL localqL;
    try {
      localqL = (qL)bx.Mm();
      localqL.aOr = bx;
    } catch (Exception localException) {
      localqL = new qL();
      localqL.aOr = null;
      localqL.eXg = false;
      K.error("Erreur lors d'un checkOut sur un RunningEffectGroupEffectRandomInAreaByCharac : " + localException.getMessage());
    }
    a(localqL);
    return localqL;
  }

  public void a(aVc paramaVc) {
    super.a(paramaVc);
    if (this.evo.b(eu.aAg))
      this.eXw = this.evo.e(eu.aAg);
  }
}