public class cJN extends bxE
{
  public static final String TAG = "tooltip";
  public static bNa iHZ = bNa.gRy;
  public static bNa iIa = new bNa(1.0F, 1.0F, 1.0F, 0.7F);
  public static bNa iIb = new bNa(0.06F, 0.04F, 0.03F, 0.4F);
  public static hf iIc;
  public static float iId = 1.5F;

  public String hi = "";
  public int bjr = 0;
  public int bjs = 0;
  public float aDg = iId;
  public int aKS = BD.KC();
  public float iIe = -1.0F;
  public bNa aDi = iHZ;
  public bNa iIf = iIa;
  public bNa aDj = iIb;
  public hf iIg = iIc;
  public bSi iIh = bSi.hcF;
  public aFG iIi = aFG.ecg;

  public static final int fyW = "text".hashCode();
  public static final int iIj = "backgroundColor".hashCode();
  public static final int iIk = "borderColor".hashCode();
  public static final int iIl = "borderWidth".hashCode();
  public static final int aLa = "duration".hashCode();
  public static final int iIm = "hotPointPosition".hashCode();
  public static final int iIn = "maxWidth".hashCode();
  public static final int dUa = "position".hashCode();
  public static final int ija = "textColor".hashCode();
  public static final int drv = "xOffset".hashCode();
  public static final int drw = "yOffset".hashCode();

  public void c(bdj parambdj)
  {
    cJN localcJN = (cJN)parambdj;
    super.c(parambdj);

    localcJN.hi = this.hi;
    localcJN.bjr = this.bjr;
    localcJN.bjs = this.bjs;
    localcJN.aKS = this.aKS;
    localcJN.iIe = this.iIe;
    localcJN.setTextColor(this.aDi);
    localcJN.setBackgroundColor(this.iIf);
    localcJN.setBorderColor(this.aDj);
    localcJN.iIg = this.iIg;
    localcJN.iIh = this.iIh;
    localcJN.iIi = this.iIi;
    localcJN.aDg = this.aDg;
  }

  public String getTag() {
    return "tooltip";
  }

  public void setDuration(int paramInt) {
    this.aKS = (paramInt * 1000);
  }

  public bNa getBackgroundColor() {
    return this.iIf;
  }

  public bNa getBorderColor() {
    return this.aDj;
  }

  public float getBorderWidth()
  {
    return this.aDg;
  }

  public int getDuration() {
    return this.aKS;
  }

  public hf getFont() {
    return this.iIg;
  }

  public bSi getHotPointPosition() {
    return this.iIh;
  }

  public float getMaxWidth() {
    return this.iIe;
  }

  public aFG getPosition() {
    return this.iIi;
  }

  public String getText() {
    return this.hi;
  }

  public bNa getTextColor() {
    return this.aDi;
  }

  public Integer getXOffset() {
    return Integer.valueOf(this.bjr);
  }

  public int getYOffset() {
    return this.bjs;
  }

  public void setBackgroundColor(bNa parambNa) {
    if (this.iIf == parambNa) {
      return;
    }
    this.iIf = parambNa;
  }

  public void setBorderColor(bNa parambNa) {
    if (this.aDj == parambNa) {
      return;
    }

    this.aDj = parambNa;
  }

  public void setBorderWidth(float paramFloat)
  {
    this.aDg = paramFloat;
  }

  public void setHotPointPosition(bSi parambSi) {
    this.iIh = parambSi;
  }

  public void setMaxWidth(float paramFloat) {
    this.iIe = paramFloat;
  }

  public void setPosition(aFG paramaFG) {
    this.iIi = paramaFG;
  }

  public void setText(String paramString) {
    this.hi = paramString;
  }

  public void setTextColor(bNa parambNa) {
    if (this.aDi == parambNa) {
      return;
    }

    this.aDi = parambNa;
  }

  public void setXOffset(int paramInt) {
    this.bjr = paramInt;
  }

  public void setYOffset(int paramInt) {
    this.bjs = paramInt;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == fyW)
      setText(paramaKN.gL(paramString));
    else if (paramInt == iIj)
      setBackgroundColor(paramaKN.gJ(paramString));
    else if (paramInt == iIk)
      setBorderColor(paramaKN.gJ(paramString));
    else if (paramInt == aLa)
      setDuration(bUD.aR(paramString));
    else if (paramInt == iIm)
      setHotPointPosition(bSi.kp(paramString));
    else if (paramInt == iIn)
      setMaxWidth(bUD.getFloat(paramString));
    else if (paramInt == dUa)
      setPosition(aFG.gr(paramString));
    else if (paramInt == drv)
      setXOffset(bUD.aR(paramString));
    else if (paramInt == drw)
      setYOffset(bUD.aR(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == fyW)
      setText(String.valueOf(paramObject));
    else if (paramInt == iIj)
      setBackgroundColor((bNa)paramObject);
    else if (paramInt == iIk)
      setBorderColor((bNa)paramObject);
    else if (paramInt == aLa)
      setDuration(bUD.aR(paramObject));
    else if (paramInt == iIm)
      setHotPointPosition((bSi)paramObject);
    else if (paramInt == iIn)
      setMaxWidth(bUD.getFloat(paramObject));
    else if (paramInt == dUa)
      setPosition((aFG)paramObject);
    else if (paramInt == drv)
      setXOffset(bUD.aR(paramObject));
    else if (paramInt == drw)
      setYOffset(bUD.aR(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }

  public void bc()
  {
    super.bc();

    this.aDi = null;

    this.iIf = null;

    this.aDj = null;
  }
}