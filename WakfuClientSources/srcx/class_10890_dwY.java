import java.util.ArrayList;

public class dwY extends dRq
{
  private doN lCU = null;
  private aFG drn = aFG.ecg;
  private aFG aWn = aFG.eco;
  private bqp lCV;
  private dOc lCW;
  private String lCX = null;
  private boolean dro = true;
  private boolean lCY = true;
  private boolean lCZ = true;
  private int drq;
  private int drr;
  public static final int drs = "align".hashCode();
  public static final int drt = "hotSpotPosition".hashCode();

  public void ajj()
  {
    this.lCU = new atH(this);

    bsP.getInstance().a(CH.bGu, this.lCU, false);

    a(CH.bGu, new atI(this), false);

    a(CH.bGv, new atJ(this), false);
  }

  public void ccT()
  {
    bsP.getInstance().b(CH.bGu, this.lCU, false);
  }

  public void show()
  {
    if (!getVisible()) {
      setVisible(true);

      setSizeToPrefSize();

      setPositionToOptimal();
    }
  }

  public void validate() {
    super.validate();

    setPositionToOptimal();
  }

  public void setPositionToOptimal() {
    if ((this.lCV != null) && (this.aWn != null) && (this.drn != null)) {
      int i = this.lCV.getDisplayX();
      int j = this.lCV.getDisplayY();

      aFG localaFG1 = this.aWn;
      aFG localaFG2 = this.drn;

      int k = i + localaFG1.iO(this.lCV.getWidth()) - localaFG2.iO(this.haN.width);
      int m = j + localaFG1.iP(this.lCV.getHeight()) - localaFG2.iP(this.haN.height);

      if ((this.lCY) && ((k < 0) || (k > this.meE.getAppearance().getContentWidth() - this.haN.width)))
      {
        localaFG1 = localaFG1.aSc();
        localaFG2 = localaFG2.aSc();
      }

      if ((this.lCZ) && ((m < 0) || (m > this.meE.getAppearance().getContentHeight() - this.haN.height)))
      {
        localaFG1 = localaFG1.aSd();
        localaFG2 = localaFG2.aSd();
      }

      k = i + localaFG1.iO(this.lCV.getWidth()) - localaFG2.iO(this.haN.width);
      m = j + localaFG1.iP(this.lCV.getHeight()) - localaFG2.iP(this.haN.height);

      k = Math.max(0, Math.min(k, this.meE.getAppearance().getContentWidth() - this.haN.width));
      m = Math.max(0, Math.min(m, this.meE.getAppearance().getContentHeight() - this.haN.height));

      if ((i >= k) && (j >= m) && (i < k + this.haN.width) && (j < m + this.haN.height)) {
        k = i - this.haN.width;

        k = Math.max(0, Math.min(k, this.meE.getAppearance().getContentWidth() - this.haN.width));
      }

      setPosition(k + this.drq, m + this.drr);
    }
  }

  public void hide() {
    setVisible(false);
    this.dro = true;
  }

  public bqp getClient() {
    return this.lCV;
  }

  public void setClient(bqp parambqp) {
    this.lCX = null;

    this.lCV = parambqp;

    if (this.lCV != null) {
      cpa localcpa = this.lCV.getElementMap();
      while (localcpa.coR() != null) {
        localcpa = localcpa.coR();
      }
      this.lCX = localcpa.getId();
    }
  }

  public aFG getHotSpotPosition()
  {
    return this.drn;
  }

  public void setHotSpotPosition(aFG paramaFG)
  {
    if (paramaFG != null)
      this.drn = paramaFG;
  }

  public boolean getHideOnClick()
  {
    return this.dro;
  }

  public void setHideOnClick(boolean paramBoolean) {
    this.dro = paramBoolean;
  }

  public aFG getAlign() {
    return this.aWn;
  }

  public void setAlign(aFG paramaFG) {
    this.aWn = paramaFG;
  }

  public void setXOffset(int paramInt) {
    this.drq = paramInt;
  }

  public void setYOffset(int paramInt) {
    this.drr = paramInt;
  }

  public void setContent(dOc paramdOc) {
    if (this.lCW != paramdOc) {
      for (int i = this.mmr.size() - 1; i >= 0; i--) {
        ((dOc)this.mmr.get(i)).beH();
      }

      if (paramdOc != null) {
        paramdOc = (dOc)paramdOc.beO();
        a(paramdOc);
      }
      this.lCW = paramdOc;
    }
  }

  public dOc getContent() {
    return this.lCW;
  }

  public boolean getEnableSwitchXAlign() {
    return this.lCY;
  }

  public void setEnableSwitchXAlign(boolean paramBoolean) {
    this.lCY = paramBoolean;
  }

  public boolean getEnableSwitchYAlign() {
    return this.lCZ;
  }

  public void setEnableSwitchYAlign(boolean paramBoolean) {
    this.lCZ = paramBoolean;
  }

  public void aJ()
  {
    super.aJ();

    cwP localcwP = new cwP();
    localcwP.aJ();

    a(localcwP);

    setVisible(false);

    cBQ.cxL().a(new atK(this));

    this.dro = true;
  }

  public void bc()
  {
    super.bc();
    this.aWn = null;
    this.drn = null;

    this.lCX = null;

    this.lCU = null;

    this.lCW = null;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == drs)
      setAlign(aFG.gr(paramString));
    else if (paramInt == drt)
      setHotSpotPosition(aFG.gr(paramString));
    else if (paramInt == gea)
      setVisible(bUD.getBoolean(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == drs)
      setAlign((aFG)paramObject);
    else if (paramInt == drt)
      setHotSpotPosition((aFG)paramObject);
    else if (paramInt == gea)
      setVisible(bUD.getBoolean(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}