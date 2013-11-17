import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.Entity3D.ObjectFactory;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import com.ankamagames.xulor2.component.mesh.GLTextGeometry;
import com.ankamagames.xulor2.component.mesh.GLTextGeometry.ObjectFactory;
import java.util.ArrayList;

public abstract class duS extends dOc
  implements Qe, aWM, dKW, dbR
{
  public static final String lzI = "text";
  private static final double lzJ = 0.001D;
  private bRi ekm;
  protected Entity3D lzK;
  protected boolean lzL;
  protected String lzM;
  private static final aIn lzN = new aIn();
  private final ArrayList lzO;
  private float dka;
  private float lzP;
  private boolean lzQ;
  private boolean lzR;
  public static final int drs = "align".hashCode();
  public static final int iiZ = "justify".hashCode();
  public static final int fyX = "font".hashCode();
  public static final int lzS = "brightenColor".hashCode();
  public static final int lzT = "darkenColor".hashCode();
  public static final int lzU = "horizontalAlignment".hashCode();
  public static final int lzV = "verticalAlignment".hashCode();
  public static final int iIn = "maxWidth".hashCode();
  public static final int lzW = "minWidth".hashCode();
  public static final int lzX = "multiline".hashCode();
  public static final int lzY = "orientation".hashCode();
  public static final int fyW = "text".hashCode();
  public static final int lzZ = "enableShrinking".hashCode();
  public static final int ijb = "useHighContrast".hashCode();
  public static final int lAa = "displayCharDelay".hashCode();
  public static final int hre = "zoom".hashCode();
  public static final int lAb = "enableAutoZoomShrink".hashCode();

  public duS()
  {
    this.lzL = true;

    this.lzM = null;

    this.lzO = new ArrayList();

    this.lzQ = false;
    this.lzR = false;
  }

  public void a(aRv paramaRv)
  {
    if (!this.lzO.contains(paramaRv))
      this.lzO.add(paramaRv);
  }

  public void b(aRv paramaRv)
  {
    if (this.lzO.contains(paramaRv))
      this.lzO.remove(paramaRv);
  }

  public void daL()
  {
    GLTextGeometry localGLTextGeometry = (GLTextGeometry)this.lzK.pW(0);
    localGLTextGeometry.setCurrentTime(-1L);
  }

  protected void rd()
  {
    super.rd();
    this.bqm.d(this.lzK);
  }

  public boolean isAppearanceCompatible(Jg paramJg)
  {
    return true;
  }

  public bRi getTextBuilder()
  {
    return this.ekm;
  }

  protected void setTextBuilder(bRi parambRi)
  {
    this.ekm = parambRi;
    GLTextGeometry localGLTextGeometry = (GLTextGeometry)this.lzK.pW(0);
    localGLTextGeometry.setTextBuilder(parambRi);
  }

  public void setModulationColor(bNa parambNa) {
    GLTextGeometry localGLTextGeometry = (GLTextGeometry)this.lzK.pW(0);
    localGLTextGeometry.setModulationColor(parambNa);
  }

  public bNa getModulationColor() {
    GLTextGeometry localGLTextGeometry = (GLTextGeometry)this.lzK.pW(0);
    return localGLTextGeometry.getModulationColor();
  }

  public String getText()
  {
    return this.ekm.Vt();
  }

  public boolean isTextReduced() {
    return this.ekm.isTextReduced();
  }

  public void setText(String paramString) {
    setText(paramString);
  }

  public void setText(Object paramObject)
  {
    String str;
    if (paramObject == null)
      str = "";
    else if ((paramObject instanceof Number))
      str = cHO.cCa().R(((Number)paramObject).doubleValue());
    else {
      str = String.valueOf(paramObject);
    }
    if ((this.lzM != null) || (!this.ekm.cA(str))) {
      this.lzM = str;
      setNeedsToPreProcess();
    }
  }

  public void setZoomTween(float paramFloat, int paramInt) {
    J(biU.class);
    a(new biU(Float.valueOf(this.dka), Float.valueOf(paramFloat), this, 0, paramInt, ddp.kWG));
  }

  public void setTextImmediate(String paramString)
  {
    setText(paramString);
    biN();
  }

  public void setBrightenColor(boolean paramBoolean) {
    GLTextGeometry localGLTextGeometry = (GLTextGeometry)this.lzK.pW(0);
    localGLTextGeometry.setBrightenColor(paramBoolean);
  }

  public boolean getBrightenColor() {
    GLTextGeometry localGLTextGeometry = (GLTextGeometry)this.lzK.pW(0);
    return localGLTextGeometry.bbs();
  }

  public void setDarkenColor(boolean paramBoolean) {
    GLTextGeometry localGLTextGeometry = (GLTextGeometry)this.lzK.pW(0);
    localGLTextGeometry.setDarkenColor(paramBoolean);
  }

  public boolean getDarkenColor() {
    GLTextGeometry localGLTextGeometry = (GLTextGeometry)this.lzK.pW(0);
    return localGLTextGeometry.bbt();
  }

  public void setUseHighContrast(boolean paramBoolean) {
    this.ekm.setUseHighContrast(paramBoolean);
  }

  public boolean getUseHighContrast() {
    return this.ekm.aFA();
  }

  public void setColor(bNa parambNa, String paramString) {
    if ((paramString == null) || (paramString.equalsIgnoreCase("text")))
      this.ekm.h(parambNa);
  }

  public boolean getEnableAutoZoomShrink()
  {
    return this.lzQ;
  }

  public void setEnableAutoZoomShrink(boolean paramBoolean) {
    this.lzQ = paramBoolean;
    this.lzR = true;
  }

  public void setAlign(aFG paramaFG)
  {
    if (paramaFG.awa())
      setVerticalAlignment(aFE.eca);
    else if (paramaFG.awb())
      setVerticalAlignment(aFE.ecb);
    else {
      setVerticalAlignment(aFE.ece);
    }

    if (paramaFG.awc())
      setHorizontalAlignment(aFE.ecd);
    else if (paramaFG.awd())
      setHorizontalAlignment(aFE.ecc);
    else
      setHorizontalAlignment(aFE.ece);
  }

  public void setHorizontalAlignment(aFE paramaFE)
  {
    this.ekm.b(paramaFE);
  }

  public void setVerticalAlignment(aFE paramaFE) {
    this.ekm.setVerticalAlignment(paramaFE);
  }

  public void setOrientation(Pw paramPw) {
    this.ekm.setOrientation(paramPw);
    this.lzL = true;
    setNeedsToPostProcess();
  }

  public Pw getOrientation()
  {
    return this.ekm.getOrientation();
  }

  public boolean isEnableAWTFont() {
    return getTextBuilder().bYe().isEnableAWTFont();
  }

  public void setEnableAWTFont(boolean paramBoolean) {
    getTextBuilder().bYe().setEnableAWTFont(paramBoolean);
  }

  public void setMultiline(boolean paramBoolean) {
    this.ekm.setMultiline(paramBoolean);
  }

  public boolean getMultiline()
  {
    return this.ekm.bYj();
  }

  public void setEnableShrinking(boolean paramBoolean) {
    this.ekm.setEnableShrinking(paramBoolean);
  }

  public boolean getEnableShrinking() {
    return this.ekm.bYl();
  }

  public void setMinWidth(int paramInt) {
    this.ekm.setMinWidth(paramInt);
  }

  public int getMinWidth() {
    return this.ekm.getMinWidth();
  }

  public void setMaxWidth(int paramInt) {
    this.ekm.setMaxWidth(paramInt);
  }

  public int getMaxWidth() {
    return this.ekm.getMaxWidth();
  }

  public void setFont(P paramP) {
    this.ekm.a(paramP);
  }

  public void setSize(int paramInt1, int paramInt2)
  {
    setTextWidgetSize(paramInt1, paramInt2, false);
  }

  public void setTextWidgetSize(int paramInt1, int paramInt2, boolean paramBoolean) {
    super.setSize(paramInt1, paramInt2);

    Or localOr1 = this.czl.getContentSize();
    if (this.lzQ) {
      Or localOr2 = this.ekm.bYr();
      float f2 = Math.min(localOr1.width / localOr2.width, localOr1.height / localOr2.height);
      if ((f2 < 1.0F) && (Math.abs(this.lzP - f2) > 0.001D)) {
        this.lzP = f2;
        setNeedsToPostProcess();
      } else if ((f2 >= 1.0F) && (Math.abs(this.lzP - 1.0F) > 0.001D)) {
        this.lzP = 1.0F;
        setNeedsToPostProcess();
      }
    }

    float f1 = getAppliedZoom();
    if (paramBoolean) {
      this.ekm.setMinWidth((int)(localOr1.width / f1));
    }
    this.ekm.setSize((int)Math.ceil(localOr1.width / f1), (int)Math.ceil(localOr1.height / f1));
  }

  private float getAppliedZoom() {
    return this.dka != 1.0F ? this.dka : this.lzP;
  }

  public void setZoom(float paramFloat) {
    this.dka = paramFloat;

    if (this.meE != null) {
      this.meE.cfM();
    }
    setNeedsToPostProcess();
  }

  public Or getContentMinSize()
  {
    Or localOr = this.ekm.getMinSize();
    localOr.setWidth((int)(localOr.width * this.dka));
    localOr.setHeight((int)(localOr.height * this.dka));
    return localOr;
  }

  public void setDisplayCharDelay(long paramLong) {
    this.ekm.gZ(paramLong);
  }

  public void setJustify(boolean paramBoolean) {
    this.ekm.setJustify(paramBoolean);
  }

  protected void biN()
  {
    if (this.lzM != null) {
      this.ekm.cB(this.lzM);
      daM();
      this.lzM = null;
    }
  }

  public void daM()
  {
    ((GLTextGeometry)this.lzK.pW(0)).bbu();
  }

  public void validate()
  {
    super.validate();

    if (this.ekm.bYc().booleanValue()) {
      this.ekm.bYd();
    }
    if (this.ekm.bYt()) {
      this.ekm.gB(true);
    }

    if (this.ekm.bYu())
      this.ekm.gC(true);
  }

  public void invalidate()
  {
    super.invalidate();
    this.lzL = true;
    setNeedsToPostProcess();
  }

  public boolean bb(int paramInt)
  {
    biN();

    if (this.ekm.bYs()) {
      this.ekm.bYB();
      this.lzL = true;
      setNeedsToPostProcess();

      if (this.meE != null) {
        this.meE.cfM();
      }
    }
    return super.bb(paramInt);
  }

  public boolean je(int paramInt)
  {
    boolean bool = super.je(paramInt);

    if ((this.ekm.bYt()) || (this.ekm.bYu())) {
      invalidate();
    }

    return bool;
  }

  public boolean r(int paramInt)
  {
    boolean bool = super.r(paramInt);

    if (!this.lzL) {
      return bool;
    }

    Or localOr = this.ekm.getSize();
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    switch (cRE.cwd[getOrientation().ordinal()]) {
    case 1:
      f1 = this.czl.getLeftInset() + localOr.width;
      f2 = this.czl.getBottomInset();
      f3 = 1.570796F;
      break;
    case 2:
      f1 = this.czl.getLeftInset();
      f2 = this.czl.getBottomInset();
      f3 = 0.0F;
      break;
    case 3:
      f1 = this.czl.getLeftInset();
      f2 = this.czl.getBottomInset() + localOr.height;
      f3 = -1.570796F;
      break;
    case 4:
      f1 = this.czl.getLeftInset();
      f2 = this.czl.getBottomInset() + localOr.height;
      f3 = 3.141593F;
      break;
    default:
      if (!bB) throw new AssertionError("We should never end here");
      break;
    }

    float f4 = getAppliedZoom();
    this.lzK.dsE().b(0, f4, f4);

    cxn localcxn = (cxn)this.lzK.dsE().sz(1);
    localcxn.b(f1, f2, 0.0F);
    lzN.a(cEi.ixM, f3);
    localcxn.f(lzN);
    this.lzK.dsE().b(1, localcxn);
    this.lzL = false;
    return bool;
  }

  public void bhT() {
    for (int i = this.lzO.size() - 1; i >= 0; i--)
      ((aRv)this.lzO.get(i)).bhT();
  }

  public void bc()
  {
    super.bc();
    if (this.ekm != null) {
      this.ekm.clean();
      this.ekm = null;
    }

    this.lzO.clear();

    this.lzK.a(null);
    this.lzK.b(null);
    this.lzK.axl();
    this.lzK = null;
  }

  public void aJ()
  {
    super.aJ();

    if ((!bB) && (this.lzK != null)) throw new AssertionError();
    this.lzK = ((Entity3D)Entity3D.fAs.bQy());

    cxn localcxn = new cxn();
    localcxn.Ls();
    this.lzK.dsE().a(localcxn);
    localcxn = new cxn();
    localcxn.Ls();
    this.lzK.dsE().a(localcxn);

    GLTextGeometry localGLTextGeometry = (GLTextGeometry)GLTextGeometry.ekj.bQy();
    this.lzK.a(localGLTextGeometry);
    localGLTextGeometry.axl();

    this.dka = 1.0F;
    this.lzP = 1.0F;
    this.lzQ = false;
    this.lzR = false;
  }

  public void c(bdj parambdj)
  {
    duS localduS = (duS)parambdj;
    super.c(localduS);
    localduS.setText(this.ekm.Vt());
    if (this.lzM != null) {
      localduS.lzM = this.lzM;
    }
    localduS.setJustify(this.ekm.bYb());
    localduS.setMaxWidth(this.ekm.getMaxWidth());
    localduS.setMinWidth(this.ekm.getMinWidth());
    localduS.setEnableShrinking(getEnableShrinking());
    localduS.setMultiline(getMultiline());
    localduS.setOrientation(getOrientation());
    localduS.setUseHighContrast(getUseHighContrast());
    localduS.setBrightenColor(getBrightenColor());
    localduS.setDarkenColor(getDarkenColor());
    localduS.setZoom(this.dka);
    if (this.lzR) {
      localduS.setEnableAutoZoomShrink(this.lzQ);
    }
    localduS.setEnableAWTFont(isEnableAWTFont());
  }

  public String toString()
  {
    return super.toString() + (this.ekm != null ? " : " + getText() : "");
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == drs)
      setAlign(aFG.gr(paramString));
    else if (paramInt == iiZ)
      setJustify(bUD.getBoolean(paramString));
    else if (paramInt == fyX)
      setFont(paramaKN.gO(paramString));
    else if (paramInt == lzU)
      setHorizontalAlignment(aFE.gq(paramString));
    else if (paramInt == lzS)
      setBrightenColor(bUD.getBoolean(paramString));
    else if (paramInt == lzT)
      setDarkenColor(bUD.getBoolean(paramString));
    else if (paramInt == lzV)
      setVerticalAlignment(aFE.gq(paramString));
    else if (paramInt == iIn)
      setMaxWidth(bUD.aR(paramString));
    else if (paramInt == lzW)
      setMinWidth(bUD.aR(paramString));
    else if (paramInt == lzX)
      setMultiline(bUD.getBoolean(paramString));
    else if (paramInt == lzY)
      setOrientation(Pw.df(paramString));
    else if (paramInt == fyW)
      setText(paramaKN.gL(paramString));
    else if (paramInt == ijb)
      setUseHighContrast(bUD.getBoolean(paramString));
    else if (paramInt == lzZ)
      setEnableShrinking(bUD.getBoolean(paramString));
    else if (paramInt == hre)
      setZoom(bUD.getFloat(paramString));
    else if (paramInt == lAa)
      setDisplayCharDelay(bUD.getLong(paramString));
    else if (paramInt == lAb)
      setEnableAutoZoomShrink(bUD.getBoolean(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == fyW)
      setText(paramObject);
    else if (paramInt == drs)
      setAlign((aFG)paramObject);
    else if (paramInt == iiZ)
      setJustify(bUD.getBoolean(paramObject));
    else if (paramInt == fyX)
      setFont((bMR)paramObject);
    else if (paramInt == lzS)
      setBrightenColor(bUD.getBoolean(paramObject));
    else if (paramInt == lzT)
      setDarkenColor(bUD.getBoolean(paramObject));
    else if (paramInt == lzU)
      setHorizontalAlignment((aFE)paramObject);
    else if (paramInt == lzV)
      setVerticalAlignment((aFE)paramObject);
    else if (paramInt == iIn)
      setMaxWidth(bUD.aR(paramObject));
    else if (paramInt == lzW)
      setMinWidth(bUD.aR(paramObject));
    else if (paramInt == lzX)
      setMultiline(bUD.getBoolean(paramObject));
    else if (paramInt == lzY)
      setOrientation((Pw)paramObject);
    else if (paramInt == lzZ)
      setEnableShrinking(bUD.getBoolean(paramObject));
    else if (paramInt == ijb)
      setUseHighContrast(bUD.getBoolean(paramObject));
    else if (paramInt == hre)
      setZoom(bUD.getFloat(paramObject));
    else if (paramInt == lAa)
      setDisplayCharDelay(bUD.getLong(paramObject));
    else if (paramInt == lAb)
      setEnableAutoZoomShrink(bUD.getBoolean(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}