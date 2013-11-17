import java.awt.Dimension;

abstract class dGj
  implements bae
{
  private cpa cUY;

  public void b(dcY paramdcY)
  {
    this.cUY = cBQ.cxL().coO().nf(paramdcY.getElementMap().getId());
    if ((!bB) && (this.cUY == null)) throw new AssertionError("Impossible de charger une bulle");
  }

  protected void qZ(String paramString)
  {
    if (this.cUY == null)
      return;
    duS localduS = (duS)this.cUY.fi("text");
    if (localduS == null)
      return;
    localduS.setStyle(paramString);
  }

  protected void a(String paramString, Or paramOr) {
    if (this.cUY == null)
      return;
    dRq localdRq1 = (dRq)this.cUY.fi("container");
    if (localdRq1 == null)
      return;
    localdRq1.setStyle(paramString);
    localdRq1.setPrefSize(paramOr);
    localdRq1.getAppearance().setModulationColor(null);

    dRq localdRq2 = (dRq)this.cUY.fi("coloredContainer");
    if (localdRq2 == null)
      return;
    localdRq2.setPrefSize(new Or(paramOr.getSize().width, paramOr.getSize().height + 20));
  }

  protected void m(String paramString, int paramInt1, int paramInt2) {
    if (this.cUY == null)
      return;
    czv localczv = (czv)this.cUY.fi("image");
    if (localczv == null) {
      return;
    }
    localczv.setStyle(paramString);
    localczv.getAppearance().setModulationColor(null);

    cwP localcwP = (cwP)localczv.getLayoutData();
    localcwP.setXOffset(paramInt1);
    localcwP.setYOffset(paramInt2);
  }

  public void c(dcY paramdcY) {
    this.cUY = cBQ.cxL().coO().nf(paramdcY.getElementMap().getId());
    czv localczv = (czv)this.cUY.fi("image");
    boolean bool = paramdcY.isToRight();
    localczv.setStyle(bool ? "BubbleArrowLeft" : "BubbleArrowRight");
    cwP localcwP = (cwP)localczv.getLayoutData();
    localcwP.setAlign(bool ? ajb.did : ajb.dih);
    b(paramdcY);
  }
}