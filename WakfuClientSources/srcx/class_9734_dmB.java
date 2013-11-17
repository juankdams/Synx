import org.apache.log4j.Logger;

public class dmB extends dKc
{
  private static final Logger K = Logger.getLogger(dmB.class);
  private final ajO gqJ;

  public dmB(ajO paramajO)
  {
    this.gqJ = paramajO;
  }

  public short fU() {
    return 19;
  }

  public boolean fV()
  {
    byz localbyz = byv.bFN().bFO();
    cew localcew = localbyz.aeL();
    return this.gqJ.V(localcew.atB());
  }

  public void begin() {
    K.info("Lancement de l'occupation MARKET sur la board " + this.gqJ);

    this.bSY.q(false, true);

    this.gqJ.b(dJO.lVH, byv.bFN().bFO());

    if (byv.bFN().c(bAO.bJl()))
      byv.bFN().b(bAO.bJl());
    bAO.bJl().a(this.gqJ);
    byv.bFN().a(bAO.bJl());

    byv.bFN().a(Nn.Xt());

    this.bSY.a(this);
  }

  public boolean a(boolean paramBoolean1, boolean paramBoolean2)
  {
    K.info("On annule l'occupation MARKET sur la board " + this.gqJ + " (fromServer=" + paramBoolean1 + ", sendMessage=" + paramBoolean2 + ")");

    byv.bFN().b(bAO.bJl());

    byv.bFN().b(Nn.Xt());

    if (paramBoolean2)
      this.gqJ.b(dJO.lVI, byv.bFN().bFO());
    return true;
  }

  public boolean fW()
  {
    K.info("On arrête l'occupation MARKET sur la board " + this.gqJ);

    byv.bFN().b(Nn.Xt());

    this.gqJ.b(dJO.lVI, byv.bFN().bFO());
    return true;
  }
}