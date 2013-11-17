import java.awt.Font;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class dIJ extends dxn
{
  private static final Logger K = Logger.getLogger(dIJ.class);
  public static final String TAG = "interactiveBubble";
  public static final String lTY = "buttonContainer";
  public static final String lTZ = "clickLabel";
  public static final String lUa = "text";
  public static final String lUb = "image";
  private final ArrayList fcK = new ArrayList();
  private int aAO;
  private int aAP;
  private int lUc;
  private String lUd;
  private int lUe;
  private int lUf;
  private boolean lUg = false;
  private boolean lUh = false;
  private boolean cYm = true;
  private boolean bPU = false;
  private boolean bPV = true;

  private doN hVU = null;

  public static final int lUi = "actAsButton".hashCode();
  public static final int lUj = "bubbleText".hashCode();
  public static final int fyW = "text".hashCode();
  public static final int lUk = "closeOnClick".hashCode();
  public static final int lUl = "forcedDisplaySpark".hashCode();

  public dIJ()
  {
    this.lUd = "Arial Unicode MS";
    this.lUe = 0;
    this.lUf = 12;
  }

  public void a(String paramString, doN paramdoN, boolean paramBoolean)
  {
    Object localObject;
    if (!this.bPU) {
      localObject = new biy();
      this.fcK.add(localObject);
      ((biy)localObject).aJ();
      ((biy)localObject).setText(paramString);
      ((biy)localObject).setExpandable(false);
      ((biy)localObject).a(CH.bGw, paramdoN, true);
      ((biy)localObject).setEnabled(paramBoolean);
      dOc localdOc = getWidgetByThemeElementName("buttonContainer", false);
      if ((localdOc instanceof dRq)) {
        localdOc.a((aNL)localObject);
      }

      ((biy)localObject).rV();
      ((biy)localObject).setStyle("interactiveBubble" + getStyle() + "$button", true);

      localdOc = getWidgetByThemeElementName("clickLabel", false);
      if (localdOc != null)
        localdOc.setVisible(false);
    }
    else {
      a(CH.bGw, paramdoN, true);
      localObject = getWidgetByThemeElementName("clickLabel", false);
      if (localObject != null)
        ((dOc)localObject).setVisible(true);
    }
  }

  public String getTag()
  {
    return "interactiveBubble";
  }

  public wv getAppearance()
  {
    return (wv)this.czl;
  }

  public boolean isAppearanceCompatible(Jg paramJg)
  {
    return paramJg instanceof wv;
  }

  public void h(int paramInt, String paramString)
  {
    biy localbiy = (biy)this.fcK.get(paramInt);
    if (localbiy != null)
      localbiy.setText(paramString);
  }

  public void a(int paramInt, doN paramdoN1, doN paramdoN2)
  {
    dRq localdRq = this.bPU ? this : (dRq)this.fcK.get(paramInt);
    if (localdRq != null) {
      localdRq.b(CH.bGw, paramdoN1, true);
      localdRq.a(CH.bGw, paramdoN2, true);
    }
  }

  public void setText(String paramString)
  {
    dOc localdOc = getWidgetByThemeElementName("text", false);
    if ((localdOc != null) && ((localdOc instanceof duS)))
      ((duS)localdOc).setText(paramString);
    else
      K.warn("Le champ de texte n'a pas été défini dans le XML");
  }

  public void setIconUrl(String paramString)
  {
    dOc localdOc = getWidgetByThemeElementName("image", false);
    if ((localdOc != null) && ((localdOc instanceof czv))) {
      uz localuz = tq.Bg().b(dHL.lSB.dhZ(), byn.jp(paramString), paramString, false);
      if (localuz == null) {
        return;
      }
      ((czv)localdOc).setPixmap(new dDq(localuz));
    }
  }

  public boolean getActAsButton()
  {
    return this.bPU;
  }

  public void setActAsButton(boolean paramBoolean)
  {
    if (paramBoolean != this.bPU)
      this.bPU = paramBoolean;
  }

  public final void setBubbleFontName(String paramString)
  {
    this.lUd = paramString;
    invalidate();
  }

  public final void setBubbleFontStyle(int paramInt) {
    this.lUe = paramInt;
    invalidate();
  }

  public final void setBubbleFontSize(int paramInt) {
    this.lUf = paramInt;
    invalidate();
  }

  public final void setBubbleText(String paramString) {
    setText(paramString);
  }

  public void setForcedDisplaySpark(boolean paramBoolean)
  {
    this.lUh = true;
    this.lUg = paramBoolean;
    wv localwv = getAppearance();
    if ((localwv != null) && (localwv.getBubbleBorder() != null)) {
      localwv.getBubbleBorder().setDisplaySpark(this.lUg);
    }

    localwv = (wv)this.meD;
    if ((localwv != null) && (localwv.getBubbleBorder() != null))
      localwv.getBubbleBorder().setDisplaySpark(this.lUg);
  }

  public boolean isCloseOnClick()
  {
    return this.bPV;
  }

  public void setCloseOnClick(boolean paramBoolean) {
    if (this.bPV != paramBoolean) {
      this.bPV = paramBoolean;
      kW(this.bPV);
    }
  }

  private void kW(boolean paramBoolean) {
    if (paramBoolean) {
      if (this.hVU != null) {
        b(CH.bGw, this.hVU, false);
      }

      this.hVU = new aWy(this);

      a(CH.bGw, this.hVU, false);
    }
    else {
      b(CH.bGw, this.hVU, false);
    }
  }

  public void clear()
  {
    beH();
  }

  public void reset()
  {
    setText("");
    for (int i = this.fcK.size() - 1; i >= 0; i--) {
      ((biy)this.fcK.get(i)).beH();
    }
    this.fcK.clear();
  }

  public final void show()
  {
    setVisible(true);
  }

  public final void hide()
  {
    setVisible(false);
  }

  public void c(bdj parambdj)
  {
    super.c(parambdj);

    dIJ localdIJ = (dIJ)parambdj;
    if (this.lUh) {
      localdIJ.setForcedDisplaySpark(this.lUg);
    }
    setActAsButton(this.bPU);
    setCloseOnClick(this.bPV);
  }

  public void ajj()
  {
    super.ajj();
    kW(this.bPV);
  }

  public void bc()
  {
    super.bc();
    this.fcK.clear();
    this.hVU = null;
  }

  public void aJ()
  {
    super.aJ();

    Font localFont = new Font(this.lUd, this.lUe, this.lUf);

    this.lUh = false;
    this.lUg = false;
    this.cYm = true;
    this.bPU = false;
    this.bPV = true;

    wv localwv = new wv();
    localwv.aJ();
    localwv.setWidget(this);
    a(localwv);

    setNeedsToPostProcess();
  }

  public final boolean r(int paramInt)
  {
    super.r(paramInt);

    return true;
  }

  public final void invalidate()
  {
    super.invalidate();

    a(getTarget(), this.aAO, this.aAP, this.lUc);
  }

  public void a(agn paramagn, int paramInt1, int paramInt2, int paramInt3) {
    if (!isUseTargetPositionning()) {
      return;
    }

    this.aAO = paramInt1;
    this.aAP = paramInt2;
    this.lUc = paramInt3;

    cmV localcmV = cBQ.cxL().cxS();
    float f1 = localcmV.MH();
    float f2 = localcmV.MI();

    Or localOr = getSize();
    float f3 = paramInt1 + f1 * 0.5F;
    float f4 = paramInt2 + f2 * 0.5F + paramInt3;

    int i = 0;
    int j = 0;
    int k = getScreenX();
    int m = getScreenY();
    if (k < 0)
      i = -k;
    else if (k + localOr.width > this.meE.getAppearance().getContentWidth()) {
      i = this.meE.getAppearance().getContentWidth() - localOr.width - k;
    }
    if (m < 0)
      j = -m;
    else if (m + localOr.height > this.meE.getAppearance().getContentHeight()) {
      j = this.meE.getAppearance().getContentHeight() - localOr.height - m;
    }

    boolean bool = this.lUh ? this.lUg : true;

    if (!this.lUg) {
      if ((f3 < 0.0F) || (f3 > f1)) {
        bool = false;
      }
      if ((f4 < 0.0F) || (f4 > f2)) {
        bool = false;
      }
    }

    if (bool != this.cYm) {
      wv localwv = getAppearance();
      if ((localwv != null) && (localwv.getBubbleBorder() != null)) {
        localwv.getBubbleBorder().setDisplaySpark(bool);
        this.cYm = bool;
      }

    }

    super.a(paramagn, (int)f3 - getHalfDisplayWidth(), (int)f4 - getHalfDisplayHeight(), 0);
  }

  public void setOffset(int paramInt1, int paramInt2)
  {
    super.setOffset(paramInt1, paramInt2);
  }

  public String toString()
  {
    dOc localdOc = getWidgetByThemeElementName("text", false);
    String str = "";
    if ((localdOc != null) && ((localdOc instanceof duS))) {
      str = ((duS)localdOc).getText();
    }

    return "InteractiveBubble{m_text=" + str + ", m_targetX=" + this.aAO + ", m_targetY=" + this.aAP + ", m_screenX=" + getDisplayX() + ", m_screenY=" + getDisplayY() + '}';
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == lUi)
      setActAsButton(bUD.getBoolean(paramString));
    else if (paramInt == lUj)
      setBubbleText(paramaKN.gL(paramString));
    else if (paramInt == fyW)
      setText(paramaKN.gL(paramString));
    else if (paramInt == lUk)
      setCloseOnClick(bUD.getBoolean(paramString));
    else if (paramInt == lUl)
      setForcedDisplaySpark(bUD.getBoolean(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == lUi)
      setActAsButton(bUD.getBoolean(paramObject));
    else if (paramInt == lUj) {
      if (paramObject == null)
        setBubbleText(null);
      else
        setBubbleText(String.valueOf(paramObject));
    }
    else if (paramInt == fyW) {
      if (paramObject == null)
        setText(null);
      else
        setText(String.valueOf(paramObject));
    }
    else if (paramInt == lUk)
      setCloseOnClick(bUD.getBoolean(paramObject));
    else if (paramInt == lUl)
      setForcedDisplaySpark(bUD.getBoolean(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}