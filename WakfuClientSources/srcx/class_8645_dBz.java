import java.util.ArrayList;
import java.util.Iterator;

public class dBz extends dRq
{
  public static final String TAG = "MRU";
  public static final String fcB = "Button";
  public static final String lJd = "IncreaseButton";
  public static final String lJe = "DecreaseButton";
  public static final int lJf = 40;
  public static final float lJg = 0.7853982F;
  private biy igL;
  private anG lJh;
  private cWk lJi;
  private doN hVU;
  private boolean ilP;
  private int ilL;
  private int ilM;
  private int cAK;
  private final ArrayList eju;
  private byte lJj;
  private biy gfO;
  private biy gfP;
  public static final int lJk = "radius".hashCode();

  public dBz()
  {
    this.ilP = false;

    this.cAK = 40;

    this.eju = new ArrayList(3);

    this.lJj = 0;
  }

  public static float Co(int paramInt)
  {
    switch (paramInt) {
    case 2:
      return 1.570796F;
    case 4:
    case 6:
      return 1.047198F;
    case 3:
    case 5: } return 0.7853982F;
  }

  public void b(aNL paramaNL)
  {
    if ((paramaNL instanceof anG))
      this.lJh = ((anG)paramaNL);
    else if ((paramaNL instanceof biy))
      this.igL = ((biy)paramaNL);
    else if (!(paramaNL instanceof dOc))
      super.b(paramaNL);
  }

  public void a(String paramString1, String paramString2, String paramString3, dDq paramdDq, String paramString4, Iterable paramIterable, csA paramcsA, boolean paramBoolean)
  {
    if (this.eju.isEmpty()) {
      return;
    }

    biy localbiy = (biy)this.igL.beO();
    if (paramString1 != null) {
      localbiy.setText(paramString1);
    }
    if ((paramString2 != null) && (this.lJi != null)) {
      localbiy.a(CH.bGz, new awI(this, paramString2, localbiy, paramString3), true);

      localbiy.a(CH.bGA, new awG(this), true);
    }

    if (paramdDq != null) {
      localObject = aAR.checkOut();
      ((aAR)localObject).setPixmap(paramdDq);
      localbiy.setPixmap((aAR)localObject);
    }
    if (paramString4 != null) {
      localbiy.rC(paramString4);
    }

    localbiy.setStyle("MRU" + getStyle() + "$buttonNorth", true);

    localbiy.setOnClick(paramcsA);
    localbiy.setEnabled(paramBoolean);
    localbiy.setVisible(false);

    for (Object localObject = paramIterable.iterator(); ((Iterator)localObject).hasNext(); ) { cag localcag = (cag)((Iterator)localObject).next();
      localcag.setRemovable(false);
      localbiy.getAppearance().a(localcag);
    }

    localObject = ((dos)this.eju.get(this.eju.size() - 1)).fcK;
    ((ArrayList)localObject).add(localbiy);
    a(localbiy);
  }

  public String getTag()
  {
    return "MRU";
  }

  public dOc getWidgetByThemeElementName(String paramString, boolean paramBoolean)
  {
    if ("Button".equalsIgnoreCase(paramString)) {
      if (this.igL != null) {
        return this.igL;
      }
      biy localbiy = new biy();
      localbiy.aJ();
      return localbiy;
    }
    if ("DecreaseButton".equalsIgnoreCase(paramString))
      return this.gfP;
    if ("IncreaseButton".equalsIgnoreCase(paramString)) {
      return this.gfO;
    }
    return null;
  }

  public int getRadius()
  {
    return this.cAK;
  }

  public void setRadius(int paramInt)
  {
    this.cAK = paramInt;
  }

  public void deJ()
  {
    this.eju.add(new dos(null));
  }

  public int getGroupSize()
  {
    return this.eju.size();
  }

  public void ea(int paramInt1, int paramInt2)
  {
    setVisible(true);

    this.ilL = paramInt1;
    this.ilM = paramInt2;
  }

  public void show()
  {
    ea(cyb.cvg().getX(), cyb.cvg().getY());
  }

  public void hide()
  {
    if (this.aYZ)
      cBQ.cxL().mW(this.cUY.getId());
  }

  public void aji()
  {
    this.hVU = new awL(this);

    bsP.getInstance().a(CH.bGw, this.hVU, false);

    this.gfO.a(CH.bGw, new awK(this), false);

    this.gfP.a(CH.bGw, new awM(this), false);
  }

  public void cfM()
  {
    dsl();

    invalidate();
  }

  public void validate()
  {
    setSizeToPrefSize();

    int i = getWidth();
    int j = getHeight();
    int k = this.ilL - aFE.ece.iO(i);
    int m = this.ilM - aFE.ece.iP(j);

    Jg localJg = this.meE.getAppearance();
    k = Math.min(Math.max(0, k), localJg.getContentWidth() - i);
    m = Math.min(Math.max(0, m), localJg.getContentHeight() - j);

    setPosition(k, m);

    super.validate();
  }

  public boolean r(int paramInt)
  {
    boolean bool = super.r(paramInt);

    if (!this.ilP) {
      aji();
      this.ilP = true;
    }

    return bool;
  }

  public void rV()
  {
    super.rV();
    this.lJi = ((cWk)this.cUY.fi("popupText"));
  }

  public void aJ()
  {
    super.aJ();

    cGA localcGA = new cGA(this, null);
    localcGA.aJ();
    a(localcGA);

    this.gfO = new biy();
    this.gfO.aJ();
    a(this.gfO);

    this.gfO.setVisible(false);

    this.gfP = new biy();
    this.gfP.aJ();
    a(this.gfP);

    this.gfP.setVisible(false);

    setNeedsToPostProcess();
  }

  public void bc()
  {
    super.bc();
    bsP.getInstance().b(CH.bGw, this.hVU, false);

    this.eju.clear();

    if (this.lJh != null) {
      this.lJh.beH();
      this.lJh = null;
    }

    if (this.igL != null) {
      this.igL.beH();
      this.igL = null;
    }

    if (this.gfP != null) {
      this.gfP.beH();
      this.gfP = null;
    }

    if (this.gfO != null) {
      this.gfO.beH();
      this.gfO = null;
    }
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == lJk)
      setRadius(bUD.aR(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == lJk)
      setRadius(bUD.aR(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}