import org.apache.log4j.Logger;

public class Du extends dKc
  implements diG
{
  protected static final Logger K = Logger.getLogger(Du.class);
  private final XQ bIe;

  public Du(XQ paramXQ)
  {
    this.bIe = paramXQ;
  }

  public XQ MF() {
    return this.bIe;
  }

  public short fU() {
    return 7;
  }

  public boolean fV()
  {
    byz localbyz = byv.bFN().bFO();
    cew localcew = localbyz.aeL();
    if (((!this.bIe.cFe()) && (this.bIe.V(localcew.atB()))) || ((this.bIe.cFe()) && (localcew.atB().Z(this.bIe.fa(), this.bIe.fb(), this.bIe.fc()))))
    {
      return true;
    }
    return false;
  }

  public void begin() {
    K.info("Lancement de l'occupation MANAGE_FLEA sur la vitrine uid=" + this.bIe.aiQ());

    this.bSY.q(false, true);

    dwN localdwN = this.bSY.bHb();
    dKd.d(localdwN);

    byz localbyz = byv.bFN().bFO();
    int i = this.bIe.fa() - localbyz.fa();
    int j = this.bIe.fb() - localbyz.fb();
    localbyz.aeL().c(CG.T(i, j));

    this.bIe.b(dJO.lVJ, byv.bFN().bFO());

    if (byv.bFN().c(bLT.bTA()))
      byv.bFN().b(bLT.bTA());
    bLT.bTA().a(this.bIe);
    byv.bFN().a(bLT.bTA());

    this.bSY.a(this);
    buj.bCk().a(cED.iyC, "dimensionalBagFleaDialog");
  }

  public boolean a(boolean paramBoolean1, boolean paramBoolean2)
  {
    K.info("On arrete l'occupation MANAGE_FLEA sur la vitrine uid=" + this.bIe.aiQ() + " (fromServer=" + paramBoolean1 + ", sendMessage=" + paramBoolean2 + ')');

    byv.bFN().b(bLT.bTA());

    dKd.d(null);

    if (paramBoolean2) {
      this.bIe.b(dJO.lVK, byv.bFN().bFO());
    }

    buj.bCk().a(cED.iyB, null);

    return true;
  }

  public boolean fW()
  {
    return true;
  }
}