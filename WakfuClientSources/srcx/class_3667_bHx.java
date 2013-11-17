import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.log4j.Logger;

public abstract class bHx extends cGj
{
  private static final Logger K = Logger.getLogger(bHx.class);
  protected ig gFZ;
  private dRq aBV;
  private dRq gGa;

  public bHx(ig paramig)
  {
    this.gFZ = paramig;
  }

  public ig bOX() {
    return this.gFZ;
  }

  public abstract void buL();

  public void gG(long paramLong)
  {
    bFr localbFr = this.gFZ.pV();
    boolean bool = (localbFr == bFr.gAs) || ((paramLong >= localbFr.getStart()) && ((paramLong < localbFr.qV()) || (localbFr.qV() == -1)));

    if (this.aBV.isVisible() != bool)
      this.aBV.setVisible(bool);
  }

  public dRq a(dRq paramdRq, bFT parambFT) {
    dQx localdQx = this.gFZ.pR();
    this.aBV = dRq.checkOut();
    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setSize(new Or(localdQx.width(), localdQx.height()));
    localcwP.setX(localdQx.drw());
    double d = ((cwP)paramdRq.getLayoutData()).getSize().getHeight();

    localcwP.setY((int)(d - localdQx.drz()));
    this.aBV.setLayoutData(localcwP);

    czO localczO = new czO();
    localczO.aJ();
    localczO.setAdaptToContentSize(true);
    this.aBV.setLayoutManager(localczO);

    dsd localdsd = this.gFZ.pT();
    this.gGa = null;
    Object localObject3;
    Object localObject4;
    if (localdsd != null) {
      this.gGa = dRq.checkOut();
      localObject1 = new cwP();
      ((cwP)localObject1).aJ();
      ((cwP)localObject1).setSize(new Or(100.0F, 100.0F));
      ((cwP)localObject1).setAlign(ajb.dhZ);
      this.gGa.setLayoutData((dgQ)localObject1);

      if (localdsd.cYN()) {
        try {
          czv localczv = new czv();
          localObject3 = localdsd.cYO().getFile().toURL();
          localObject4 = new dDq(dQU.drS().n((URL)localObject3));
          localczv.aJ();
          localczv.setNonBlocking(true);
          localczv.setExpandable(false);
          localczv.setPixmap((dDq)localObject4);
          localczv.rf();
          localczv.setSizeToPrefSize();
          this.gGa.a(localczv);
          this.gGa.rV();
        } catch (MalformedURLException localMalformedURLException1) {
          K.warn("URL malformée : \"" + localdsd.cYO().getFile() + "\"");
        }
      } else {
        localObject2 = new jO();
        ((jO)localObject2).aJ();
        ((jO)localObject2).setColor(localdsd.getColor());
        this.gGa.getAppearance().a((aNL)localObject2);
      }
      this.aBV.a(this.gGa);
      this.aBV.rV();
    }

    Object localObject1 = this.gFZ.pU();
    if (localObject1 != null) {
      localObject2 = dRq.checkOut();
      localObject3 = new cwP();
      ((cwP)localObject3).aJ();
      ((cwP)localObject3).setSize(new Or(100.0F, 100.0F));
      ((cwP)localObject3).setAlign(ajb.dhZ);
      ((dRq)localObject2).setLayoutData((dgQ)localObject3);
      ((dRq)localObject2).setVisible(false);

      if (((dsd)localObject1).cYN()) {
        try {
          localObject4 = new czv();
          URL localURL = ((dsd)localObject1).cYO().getFile().toURL();
          dDq localdDq = new dDq(dQU.drS().n(localURL));
          ((czv)localObject4).aJ();
          ((czv)localObject4).setNonBlocking(true);
          ((czv)localObject4).setExpandable(false);
          ((czv)localObject4).setPixmap(localdDq);
          ((czv)localObject4).rf();
          ((czv)localObject4).setSizeToPrefSize();
          ((dRq)localObject2).a((aNL)localObject4);
          ((dRq)localObject2).rV();
        } catch (MalformedURLException localMalformedURLException2) {
          K.warn("URL malformée : \"" + ((dsd)localObject1).cYO().getFile() + "\"");
        }
      } else {
        jO localjO = new jO();
        localjO.aJ();
        localjO.setColor(((dsd)localObject1).getColor());
        ((dRq)localObject2).getAppearance().a(localjO);
      }
      this.aBV.a((aNL)localObject2);
      this.aBV.rV();

      this.aBV.a(CH.bGs, new LY(this, (dRq)localObject2), false);

      this.aBV.a(CH.bGt, new LZ(this, (dRq)localObject2), false);
    }

    Object localObject2 = this.gFZ.pV();
    if (((bFr)localObject2).getStart() > 0) {
      this.aBV.setVisible(false);
    }
    return this.aBV;
  }

  public void awo() {
    if (this.aBV == null)
      return;
    this.aBV.beH();
    this.aBV.beJ();
  }
}