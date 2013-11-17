import org.apache.log4j.Logger;

public class dFr extends cwJ
{
  private static Logger K = Logger.getLogger(dFr.class);
  public static final String TAG = "ButtonAppearance";
  public static final String DEFAULT = "default";
  public static final String lPr = "disabled";
  public static final String lPs = "mouseHover";
  public static final String lPt = "pressed";
  private static final aee aOr = new bOO(new bhW());

  protected int lPu = 5;

  protected int cj = -3;

  protected boolean lPv = false;
  protected boolean lPw = false;
  protected boolean bur = true;

  public static final int lPx = "gap".hashCode();

  public static dFr checkOut()
  {
    dFr localdFr;
    try
    {
      localdFr = (dFr)aOr.Mm();
      localdFr.fnG = aOr;
    }
    catch (Exception localException)
    {
      K.error("Problème au borrowObject.");
      localdFr = new dFr();
      localdFr.aJ();
    }
    return localdFr;
  }

  public String getTag()
  {
    return "ButtonAppearance";
  }

  public int getGap() {
    return this.lPu;
  }

  public void setGap(int paramInt) {
    this.lPu = paramInt;
  }

  public int getClickSoundId() {
    return this.cj;
  }

  public void setClickSoundId(int paramInt) {
    this.cj = paramInt;
    biy localbiy = (biy)this.aPS;
    if ((localbiy != null) && (this.cj != -3))
      localbiy.setClickSoundId(this.cj);
  }

  public void setWidget(dOc paramdOc)
  {
    super.setWidget(paramdOc);
    biy localbiy = (biy)this.aPS;
    if (this.cj != -3)
      localbiy.setClickSoundId(this.cj);
  }

  public boolean isOver()
  {
    return this.lPw;
  }

  public boolean isArmed() {
    return this.lPv;
  }

  public void enter()
  {
    this.lPw = true;
    cre();
  }

  public void exit()
  {
    this.lPw = false;
    cre();
  }

  public void dgU()
  {
    this.lPv = true;
    cre();
  }

  public void dgV()
  {
    if (this.lPv) {
      this.lPv = false;
      cre();
    }
  }

  public void dgW()
  {
    if (this.bur) {
      this.bur = false;
      cre();
    }
  }

  public void dgX()
  {
    if (!this.bur) {
      this.bur = true;
      cre();
    }
  }

  protected void cre() {
    SY();
    Lj();
  }

  protected void Lj()
  {
    if (this.bur) {
      if (this.lPw) {
        if (this.lPv)
          setEnabled("pressed", true);
        else
          setEnabled("mouseHover", true);
      }
      else
        setEnabled("default", true);
    }
    else
      setEnabled("disabled", true);
  }

  public void c(bdj parambdj)
  {
    dFr localdFr = (dFr)parambdj;
    super.c(parambdj);
    localdFr.lPu = this.lPu;
    localdFr.cj = this.cj;
  }

  public void aJ()
  {
    super.aJ();

    this.lPu = 5;
    this.cj = -3;
    this.lPv = false;
    this.lPw = false;
    this.bur = true;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == lPx)
      setGap(bUD.aR(paramString));
    else if (paramInt == biy.cq)
      setClickSoundId(bUD.aR(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == lPx)
      setGap(bUD.aR(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}