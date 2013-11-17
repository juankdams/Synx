import org.apache.log4j.Logger;

public final class bGV extends bFw
{
  private static final aee bx = new bOO(new WQ());

  private static final qM by = new dzQ(new ec[] { new dLx("% de la valeur de l'effet déclencheur", new dmb[] { new dmb("% de la valeur de l'effet déclencheur", dnN.lnR) }) });
  private float gDZ;

  public qM aF()
  {
    return by;
  }

  public bGV()
  {
    aH();
  }

  public bGV bOD()
  {
    bGV localbGV;
    try {
      localbGV = (bGV)bx.Mm();
      localbGV.aOr = bx;
    } catch (Exception localException) {
      localbGV = new bGV();
      localbGV.aOr = null;
      localbGV.eXg = false;
      K.error("Erreur lors d'un checkOut sur un HpLossPercentOfValue : " + localException.getMessage());
    }
    return localbGV;
  }

  public void b(int paramInt, float paramFloat, boolean paramBoolean)
  {
    super.b(paramInt, paramFloat, paramBoolean);
    switch (paramInt) {
    case 0:
      if (!paramBoolean)
        this.cxl = ((int)(this.cxl + this.cxl * paramFloat / 100.0F)); break;
    case 1:
      if (paramBoolean)
        this.cxl = bMr.ax(paramFloat);
      else
        this.cxl = ((int)(this.cxl + paramFloat));
      break;
    }
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (paramaVc != null) {
      this.cxl = Math.max(1, Math.round(paramaVc.getValue() * this.gDZ / 100.0F));
    }
    super.a(paramaVc, paramBoolean);
  }

  public void a(aVc paramaVc)
  {
    short s = cVC();
    this.cxl = 0;
    if (this.eWL == null)
      return;
    this.gDZ = ((dpI)this.eWL).a(0, s, dNF.meh);
  }
}