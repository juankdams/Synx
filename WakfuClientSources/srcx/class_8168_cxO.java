public class cxO extends dRq
{
  public static final String TAG = "PopupMenu";
  public static final String fcB = "Button";
  public static final String ilJ = "Label";
  public static final String ilK = "Separator";
  private aFG drn = aFG.ecg;
  private int ilL = -1; private int ilM = -1;
  private doN hVU;
  private doN ilN;
  private biy igL;
  private caF eun;
  private oc ilO;
  private boolean ilP = false;

  public static final int drt = "hotSpotPosition".hashCode();

  public void b(aNL paramaNL)
  {
    if ((paramaNL instanceof biy))
      this.igL = ((biy)paramaNL);
    else if ((paramaNL instanceof caF))
      this.eun = ((caF)paramaNL);
    else if ((paramaNL instanceof oc))
      this.ilO = ((oc)paramaNL);
    else if (!(paramaNL instanceof dOc))
      super.b(paramaNL);
  }

  public void a(String paramString, dDq paramdDq)
  {
    caF localcaF = (caF)this.eun.beO();
    localcaF.setText(paramString);
    a(localcaF);
  }

  public void a(String paramString, dDq paramdDq, csA paramcsA, boolean paramBoolean)
  {
    biy localbiy = (biy)this.igL.beO();
    a(localbiy);
    localbiy.setText(paramString);
    localbiy.setOnClick(paramcsA);
    localbiy.setEnabled(paramBoolean);
  }

  public void addSeparator()
  {
    oc localoc = (oc)this.ilO.beO();
    a(localoc);
  }

  public String getTag()
  {
    return "PopupMenu";
  }

  public dOc getWidgetByThemeElementName(String paramString, boolean paramBoolean)
  {
    Object localObject;
    if ("Button".equalsIgnoreCase(paramString)) {
      if (this.igL != null) {
        return this.igL;
      }
      localObject = new biy();
      ((biy)localObject).aJ();
      return localObject;
    }
    if ("Label".equalsIgnoreCase(paramString)) {
      if (this.eun != null) {
        return this.eun;
      }
      localObject = new caF();
      ((caF)localObject).aJ();
      return localObject;
    }
    if ("Separator".equalsIgnoreCase(paramString)) {
      if (this.ilO != null) {
        return this.ilO;
      }
      localObject = new oc();
      ((oc)localObject).aJ();
      return localObject;
    }

    return null;
  }

  public void setHotSpotPosition(aFG paramaFG)
  {
    this.drn = paramaFG;
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

  public void aji()
  {
    this.hVU = new cRG(this);

    this.ilN = new cRH(this);

    bsP.getInstance().a(CH.bGw, this.hVU, false);

    bsP.getInstance().a(CH.bGu, this.ilN, false);
  }

  public void validate()
  {
    setSizeToPrefSize();

    this.ilL -= this.drn.iO(getWidth());
    this.ilM -= this.drn.iP(getHeight());

    dhh localdhh = (dhh)getWidgetParentOfType(dhh.class);
    this.ilL = Math.min(localdhh.getWidth() - getWidth(), this.ilL);
    if (this.ilM < 0)
      this.ilM = 0;
    this.ilM = Math.min(localdhh.getHeight() - getHeight(), this.ilM);

    setPosition(this.ilL, this.ilM);

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
    setStyle(this.meV[0], true);
  }

  public void aJ()
  {
    super.aJ();

    aId localaId = aId.checkOut();
    localaId.setHorizontal(false);
    a(localaId);

    setNeedsToPostProcess();
  }

  public void bc()
  {
    super.bc();
    bsP.getInstance().b(CH.bGw, this.hVU, false);

    bsP.getInstance().b(CH.bGu, this.ilN, false);

    if (this.igL != null) {
      this.igL.beH();
      this.igL = null;
    }

    if (this.eun != null) {
      this.eun.beH();
      this.eun = null;
    }

    if (this.ilO != null) {
      this.ilO.beH();
      this.ilO = null;
    }
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == drt)
      setHotSpotPosition(aFG.gr(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == drt)
      setHotSpotPosition((aFG)paramObject);
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}