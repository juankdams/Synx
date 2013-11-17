import java.net.MalformedURLException;
import java.net.URL;
import org.apache.log4j.Logger;

public class bWx
{
  protected static final Logger K = Logger.getLogger(bWx.class);
  private static bWx hiI;
  private dOc aPS;
  private boolean hiJ = false;
  private aFG hiK = aFG.ecm;
  private int bjr = 0; private int bjs = 0;
  private int hY = 0; private int hZ = 0;

  private byte hiL = -1;
  protected dPx hiM = new dPx();

  protected bWx() {
    hiI = this;

    this.hiM.c((byte)1, new cnA(this));

    this.hiM.c((byte)2, new cmf(this));

    this.hiM.c((byte)3, new cmd(this));
  }

  public void setWidget(dOc paramdOc)
  {
    this.aPS = paramdOc;
  }

  public static bWx cbz()
  {
    if (hiI == null)
      hiI = new bWx();
    return hiI;
  }

  public void dm(int paramInt1, int paramInt2) {
    this.hY = paramInt1;
    this.hZ = paramInt2;
    bjP();
  }

  public void bjP() {
    if (this.aPS != null) {
      int i = this.hY - this.hiK.iO(this.aPS.getWidth()) + this.bjr;
      int j = this.hZ - this.hiK.iP(this.aPS.getHeight()) + this.bjs - this.aPS.getHeight() / 2;
      this.aPS.setPosition(i, j);
    }
  }

  public void a(String paramString1, String paramString2, int paramInt1, int paramInt2, aFG paramaFG) {
    Sl localSl = aq(paramString1, paramString2);
    if (localSl == null) {
      K.warn("Impossible de créer les data pour iconUrl=" + paramString1 + " et text=" + paramString2);
      return;
    }

    a(localSl, paramInt1, paramInt2, paramaFG);
  }

  public void a(Sl paramSl, int paramInt1, int paramInt2, aFG paramaFG) {
    hide();

    this.hiL = paramSl.getType();

    MB localMB = (MB)this.hiM.bf(paramSl.getType());
    if (localMB == null) {
      return;
    }
    dOc localdOc = localMB.a(paramSl);
    if (localdOc == null) {
      return;
    }

    setWidget(localdOc);
    setXOffset(paramInt1);
    setYOffset(paramInt2);
    a(paramaFG);
    show();
  }

  private Sl aq(String paramString1, String paramString2) {
    if ((paramString1 != null) && (paramString2 != null))
      return new ddu(paramString1, paramString2);
    if (paramString1 != null)
      return new bzQ(paramString1);
    if (paramString2 != null) {
      return new aSF(paramString2);
    }
    return null;
  }

  public void show()
  {
    if (this.hiJ) {
      return;
    }
    cOP localcOP = cBQ.cxL().cxS().getMasterRootContainer().getLayeredContainer();
    localcOP.b(this.aPS, 40000);

    this.hiJ = true;
  }

  public void hide()
  {
    if ((this.aPS == null) || (!this.hiJ)) {
      return;
    }
    MB localMB = (MB)this.hiM.bf(this.hiL);
    if (localMB == null) {
      return;
    }

    localMB.f(this.aPS);
    this.aPS = null;
    this.hiJ = false;
  }

  public aFG cbA() {
    return this.hiK;
  }

  public void a(aFG paramaFG) {
    this.hiK = paramaFG;
    bjP();
  }

  public int getXOffset() {
    return this.bjr;
  }

  public void setXOffset(int paramInt) {
    this.bjr = paramInt;
    bjP();
  }

  public int getYOffset() {
    return this.bjs;
  }

  public void setYOffset(int paramInt) {
    this.bjs = paramInt;
    bjP();
  }

  private dOc kx(String paramString) {
    return a(paramString, null, null);
  }

  private dOc ky(String paramString) {
    return a(null, paramString, null);
  }

  private dOc ar(String paramString1, String paramString2) {
    return a(paramString1, paramString2, null);
  }

  private dOc c(String paramString, cpa paramcpa) {
    if (paramcpa == null)
      paramcpa = cbB();
    try
    {
      czv localczv = new czv();
      URL localURL = new URL(paramString);
      dDq localdDq = new dDq(dQU.drS().n(localURL));
      localczv.aJ();
      localczv.setNonBlocking(true);
      localczv.setExpandable(false);
      localczv.setPixmap(localdDq);
      localczv.rf();
      localczv.setId("image");
      paramcpa.a(localczv.getId(), localczv);
      localczv.setElementMap(paramcpa);
      localczv.setSizeToPrefSize();
      return localczv;
    } catch (MalformedURLException localMalformedURLException) {
      K.warn("URL malformée : \"" + paramString + "\"");
    }
    return null;
  }

  private dOc d(String paramString, cpa paramcpa) {
    if (paramcpa == null) {
      paramcpa = cbB();
    }
    cWk localcWk = new cWk();
    localcWk.aJ();
    localcWk.setExpandable(false);
    localcWk.setNonBlocking(true);
    localcWk.setStyle("White14Bordered");
    localcWk.setText(paramString);

    localcWk.setSizeToPrefSize();
    localcWk.setId("text");
    paramcpa.a(localcWk.getId(), localcWk);
    localcWk.setElementMap(paramcpa);
    localcWk.rV();
    return localcWk;
  }

  private cpa cbB() {
    return new cpa("test", cBQ.cxL().coO());
  }

  private dOc a(String paramString1, String paramString2, cpa paramcpa) {
    if (paramcpa == null) {
      paramcpa = cbB();
    }
    aId localaId = new aId();
    localaId.aJ();
    localaId.setAlign(aFG.ech);
    localaId.setHorizontal(false);
    dRq localdRq = new dRq();
    localdRq.aJ();
    localdRq.setLayoutManager(localaId);
    dOc localdOc;
    dpm localdpm;
    if (paramString1 != null) {
      localdOc = c(paramString1, paramcpa);
      localdpm = new dpm();
      localdpm.aJ();
      localdpm.setAlign(aFG.ecj);
      localdOc.setExpandable(false);
      localdOc.setLayoutData(localdpm);
      localdRq.a(localdOc);
    }
    if (paramString2 != null) {
      localdOc = d(paramString2, paramcpa);
      localdpm = new dpm();
      localdpm.aJ();
      localdpm.setAlign(aFG.ecj);
      localdOc.setExpandable(false);
      localdOc.setLayoutData(localdpm);
      localdRq.a(localdOc);
    }
    localdRq.setElementMap(paramcpa);
    localdRq.setPack(true);
    localdRq.brn();
    localdRq.rV();
    return localdRq;
  }

  public void setText(String paramString) {
    if (this.aPS == null)
      return;
    aNL localaNL = this.aPS.getElementMap().fi("text");
    if (localaNL == null)
      return;
    ((cWk)localaNL).setText(paramString);
    bjP();
  }

  public void setIconUrl(String paramString) {
    if (this.aPS == null)
      return;
    aNL localaNL = this.aPS.getElementMap().fi("image");
    if (localaNL == null)
      return;
    try {
      URL localURL = new URL(paramString);
      dDq localdDq = new dDq(dQU.drS().n(localURL));
      ((czv)localaNL).setPixmap(localdDq);
      bjP();
    } catch (MalformedURLException localMalformedURLException) {
      K.warn("URL malformée : \"" + paramString + "\"");
    }
  }

  public boolean avJ() {
    return this.aPS == null;
  }

  public boolean isVisible() {
    return (this.aPS != null) && (this.aPS.getVisible());
  }
}