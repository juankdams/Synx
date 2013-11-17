public class bZh extends dRq
{
  public static final String TAG = "drawer";
  public static final String hpA = "staticContainer";
  public static final String hpB = "popupContainer";
  private boolean hpC;
  private boolean hpD;
  private doN fvF;
  private doN cGQ;
  private dRq hpE;
  private dRq hpF;
  private aFG aWn;
  private aFG drn;
  public static final int drs = "align".hashCode();
  public static final int drt = "hotSpotPosition".hashCode();

  public bZh()
  {
    this.hpC = false;
    this.hpD = true;

    this.hpE = null;
    this.hpF = null;

    this.aWn = aFG.ecn;
    this.drn = aFG.ech;
  }

  public void a(aNL paramaNL) {
    int i = 1;
    if ((paramaNL instanceof dRq)) {
      dRq localdRq = (dRq)paramaNL;
      String str = localdRq.getThemeElementName();
      if (str != null) {
        if (str.equals("popupContainer")) {
          if (this.hpE != null) {
            this.hpE.release();
          }
          i = 0;
          this.hpE = localdRq;
          this.hpE.setModalLevel(Ts.cwm);
          f(this.hpE);
        } else if (str.equals("staticContainer")) {
          if (this.hpF != null) {
            this.hpF.beH();
          }
          this.hpF = localdRq;
        }
      }
    }

    if (i != 0)
      super.a(paramaNL);
  }

  public dOc getWidgetByThemeElementName(String paramString, boolean paramBoolean)
  {
    if ("staticContainer".equalsIgnoreCase(paramString)) {
      if (this.hpF != null)
        return this.hpF;
    }
    else if (("popupContainer".equalsIgnoreCase(paramString)) && 
      (this.hpE != null)) {
      return this.hpE;
    }

    return null;
  }

  public String getTag()
  {
    return "drawer";
  }

  public void setElementMap(cpa paramcpa)
  {
    super.setElementMap(paramcpa);

    if (this.hpE != null)
      this.hpE.setElementMap(paramcpa);
  }

  public void setHotSpotPosition(aFG paramaFG)
  {
    if (paramaFG != null)
      this.drn = paramaFG;
  }

  public void setAlign(aFG paramaFG) {
    if (paramaFG != null)
      this.aWn = paramaFG;
  }

  public void ajj()
  {
    super.ajj();
    setFocusable(true);
  }

  public void a(bsP parambsP)
  {
    this.fvF = new eD(this);

    parambsP.a(CH.bGu, this.fvF, false);

    this.cGQ = new eE(this);

    parambsP.a(CH.bGv, this.cGQ, false);
  }

  public void f(dRq paramdRq)
  {
    paramdRq.a(CH.bGw, new eF(this), false);
  }

  public boolean isPopupIsBeingDisplayed()
  {
    return this.hpC;
  }

  public void cdM() {
    if (this.hpC)
      closePopup();
    else
      cdN();
  }

  private void closePopup()
  {
    if (this.hpC) {
      this.hpE.beG();
      this.hpC = false;

      MQ.WK().WN();
    }
  }

  private void cdN()
  {
    if (!this.hpC)
    {
      Or localOr = this.hpE.getPrefSize();
      int i = localOr.width;
      int j = localOr.height;

      int k = getDisplayX();

      int n = getDisplayY();

      bsP localbsP = bsP.getInstance();

      aFG localaFG1 = this.aWn;
      aFG localaFG2 = this.drn;

      int i1 = getDisplayY() + localaFG1.iP(getHeight()) - localaFG2.iP(j);

      if ((i1 < 0) || (i1 > localbsP.getAppearance().getContentHeight() - j))
      {
        localaFG1 = localaFG1.aSd();
        localaFG2 = localaFG2.aSd();
      }

      i1 = getDisplayY() + localaFG1.iP(getHeight()) - localaFG2.iP(j);

      i1 = Math.max(0, Math.min(i1, localbsP.getAppearance().getContentHeight() - j));

      if ((n - j < 0) && (n + getHeight() + j > localbsP.getHeight()))
      {
        j = n;
        i1 = 0;
      }

      int m = k + localaFG1.iO(getWidth()) - localaFG2.iO(i);

      if ((m < 0) || (m > localbsP.getAppearance().getContentWidth() - i))
      {
        localaFG1 = localaFG1.aSc();
        localaFG2 = localaFG2.aSc();
      }

      m = getDisplayX() + localaFG1.iO(getWidth()) - localaFG2.iO(i);

      m = Math.max(0, Math.min(m, localbsP.getAppearance().getContentWidth() - i));

      if ((k - i < 0) && (k + getWidth() + i > localbsP.getWidth()))
      {
        i = k;
        m = 0;
      }

      this.hpE.setSizeToPrefSize();
      i = Math.max(this.hpE.getWidth(), i);
      j = Math.max(this.hpE.getHeight(), j);

      this.hpE.setSize(i, j);

      this.hpE.setPosition(m, i1);
      this.hpE.setNonBlocking(false);

      localbsP.getLayeredContainer().b(this.hpE, 30000);

      this.hpC = true;
      this.hpD = true;

      MQ.WK().WM();
    }
  }

  public void bc()
  {
    super.bc();

    bsP.getInstance().b(CH.bGu, this.fvF, false);

    bsP.getInstance().b(CH.bGv, this.cGQ, false);

    this.cGQ = null;
    this.fvF = null;

    this.aWn = null;
    this.drn = null;

    this.hpE.beH();

    this.hpE = null;
    this.hpF = null;
  }

  public void aJ()
  {
    super.aJ();

    dci localdci = new dci(this, null);
    localdci.aJ();
    a(localdci);

    this.hpE = dRq.checkOut();
    this.hpF = dRq.checkOut();

    this.meQ = false;

    a(bsP.getInstance());
  }

  public void c(bdj parambdj)
  {
    bZh localbZh = (bZh)parambdj;
    super.c(localbZh);

    dOc localdOc = (dOc)this.hpE.beO();

    localdOc.meW = false;
    localdOc.beJ();

    localbZh.a(localdOc);

    localbZh.b(CH.bGu, this.fvF, false);
    localbZh.b(CH.bGv, this.cGQ, false);
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == drs)
      setAlign(aFG.gr(paramString));
    else if (paramInt == drt)
      setHotSpotPosition(aFG.gr(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }
    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject)
  {
    if (paramInt == drs)
      setAlign((aFG)paramObject);
    else if (paramInt == drt)
      setHotSpotPosition((aFG)paramObject);
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }
    return true;
  }
}