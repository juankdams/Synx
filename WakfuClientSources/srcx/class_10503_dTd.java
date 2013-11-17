public class dTd extends dRq
{
  public static final String TAG = "FoldingContainer";
  private static final String fIZ = "titleBar";
  private static final String fJb = "content";
  private aFD mpA;
  private dRq mpB;
  private dRq lck;
  private boolean mpC;
  private boolean mpD;
  public static final int mpE = "titleBarPosition".hashCode();
  public static final int mpF = "folded".hashCode();

  public dTd()
  {
    this.mpA = aFD.ebV;
  }

  public void b(aNL paramaNL)
  {
    if (((paramaNL instanceof dRq)) && (((dOc)paramaNL).getThemeElementName().equals("titleBar"))) {
      if (this.mpB != null) {
        this.mpB.beH();
      }
      this.mpB = ((dRq)paramaNL);
      a(this.mpB);
    } else if (((paramaNL instanceof dRq)) && (((dOc)paramaNL).getThemeElementName().equals("content"))) {
      if (this.lck != null) {
        this.lck.beH();
      }
      this.lck = ((dRq)paramaNL);
      this.lck.setVisible(!this.mpC);
      a(this.lck);
    } else if (!(paramaNL instanceof dOc)) {
      super.b(paramaNL);
    }
  }

  public String getTag()
  {
    return "FoldingContainer";
  }

  public aFD getTitleBarPosition()
  {
    return this.mpA;
  }

  public void setTitleBarPosition(aFD paramaFD)
  {
    this.mpA = paramaFD;

    invalidate();
  }

  public void setFolded(boolean paramBoolean)
  {
    if (paramBoolean)
      dtg();
    else
      dth();
  }

  public boolean isFolded()
  {
    return this.mpC;
  }

  public void dtg()
  {
    this.mpC = true;
    this.mpD = this.meO;
    setExpandable(false);
    if (this.lck != null) {
      this.lck.setVisible(false);
    }
    cfM();
  }

  public void dth()
  {
    this.mpC = false;
    setExpandable(this.mpD);
    this.lck.setVisible(true);
    cfM();
  }

  public void bc()
  {
    super.bc();

    this.mpA = null;
    this.lck = null;
    this.mpB = null;
  }

  public void aJ()
  {
    super.aJ();

    bEA localbEA = new bEA(this);
    localbEA.aJ();
    a(localbEA);
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == mpE)
      setTitleBarPosition((aFD)paramaKN.b(aFD.class, paramString));
    else if (paramInt == mpF)
      setFolded(bUD.getBoolean(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }
    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == mpE)
      setTitleBarPosition((aFD)paramObject);
    else if (paramInt == mpF)
      setFolded(bUD.getBoolean(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }
    return true;
  }
}