import java.util.ArrayList;

public class bvx extends dRq
{
  public static final String TAG = "valueSelector";
  public static final String gfK = "increaseButton";
  public static final String gfL = "decreaseButton";
  public static final String gfM = "textEditor";
  private aTp gfN;
  private biy gfO;
  private biy gfP;
  private int cxl;
  private int gfQ;
  private int gfR;
  private String gfS;
  public static final int dnk = "maxBound".hashCode();
  public static final int dnl = "minBound".hashCode();
  public static final int crX = "value".hashCode();
  public static final int gfT = "displayFormat".hashCode();

  public String getTag()
  {
    return "valueSelector";
  }

  public int getValue() {
    return this.cxl;
  }

  public void setValue(int paramInt) {
    paramInt = bCO.J(paramInt, this.gfQ, this.gfR);

    int i = paramInt != this.cxl ? 1 : 0;
    int j = this.cxl;
    this.cxl = paramInt;

    bDl();

    if (i != 0) {
      diZ localdiZ = new diZ(this);
      localdiZ.aJ();
      localdiZ.setValue(Integer.valueOf(this.cxl));
      localdiZ.bk(Integer.valueOf(j));

      g(localdiZ);
    }
  }

  public int getMinBound() {
    return this.gfQ;
  }

  public void setMinBound(int paramInt) {
    if (this.gfQ == paramInt) {
      return;
    }
    this.gfQ = paramInt;
    if (this.cxl < this.gfQ)
      setValue(paramInt);
  }

  public int getMaxBound()
  {
    return this.gfR;
  }

  public void setMaxBound(int paramInt) {
    if (this.gfR == paramInt) {
      return;
    }
    this.gfR = paramInt;
    if (this.cxl > this.gfR)
      setValue(paramInt);
  }

  public String getDisplayFormat()
  {
    return this.gfS;
  }

  public void setDisplayFormat(String paramString) {
    this.gfS = paramString;
    bDl();
  }

  public dOc getWidgetByThemeElementName(String paramString, boolean paramBoolean)
  {
    if (paramString.equals("increaseButton"))
      return this.gfO;
    if (paramString.equals("decreaseButton"))
      return this.gfP;
    if (paramString.equals("textEditor")) {
      return this.gfN;
    }

    return null;
  }

  public void bDl()
  {
    this.gfN.setText(String.format(this.gfS, new Object[] { Integer.valueOf(this.cxl) }));
  }

  private void bDm() {
    this.gfN = new aTp();
    this.gfN.aJ();
    this.gfN.setText(String.valueOf(this.cxl));
    this.gfN.a(CH.bGj, new dAB(this), false);

    a(this.gfN);

    dRq localdRq = dRq.checkOut();
    localdRq.setExpandable(false);

    aId localaId = aId.checkOut();
    localaId.setHorizontal(false);
    localaId.setAlign(aFG.eck);

    localdRq.a(localaId);

    this.gfO = new biy();
    this.gfO.aJ();
    this.gfO.a(CH.bGw, new dAw(this), false);

    this.gfO.setClickSoundId(MQ.WK().WT());

    this.gfP = new biy();
    this.gfP.aJ();
    this.gfP.a(CH.bGw, new dAx(this), false);

    this.gfP.setClickSoundId(MQ.WK().WU());

    localdRq.a(this.gfO);
    localdRq.a(this.gfP);

    a(localdRq);
  }

  public void c(bdj parambdj)
  {
    super.c(parambdj);
    bvx localbvx = (bvx)parambdj;
    localbvx.gfS = this.gfS;
    localbvx.setMinBound(this.gfQ);
    localbvx.setMaxBound(this.gfR);
    localbvx.setValue(this.cxl);

    ArrayList localArrayList = this.gfO.getListeners(CH.bGw, false);
    int i;
    if (localArrayList != null) {
      for (i = localArrayList.size() - 1; i >= 0; i--) {
        localbvx.gfO.b(CH.bGw, (doN)localArrayList.get(i), false);
      }
    }

    localArrayList = this.gfP.getListeners(CH.bGw, false);
    if (localArrayList != null) {
      for (i = localArrayList.size() - 1; i >= 0; i--) {
        localbvx.gfP.b(CH.bGw, (doN)localArrayList.get(i), false);
      }
    }

    localArrayList = this.gfN.getListeners(CH.bGj, false);
    if (localArrayList != null)
      for (i = localArrayList.size() - 1; i >= 0; i--)
        localbvx.gfN.b(CH.bGj, (doN)localArrayList.get(i), false);
  }

  public void aJ()
  {
    super.aJ();

    bDm();

    this.gfQ = 0;
    this.gfR = 100;
    this.cxl = 0;
    this.gfS = "%d";
  }

  public void bc()
  {
    super.bc();

    this.gfN = null;
    this.gfO = null;
    this.gfP = null;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == dnk)
      setMaxBound(bUD.aR(paramString));
    else if (paramInt == dnl)
      setMinBound(bUD.aR(paramString));
    else if (paramInt == crX)
      setValue(bUD.aR(paramString));
    else if (paramInt == gfT)
      setDisplayFormat(paramString);
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == dnk)
      setMaxBound(bUD.aR(paramObject));
    else if (paramInt == dnl)
      setMinBound(bUD.aR(paramObject));
    else if (paramInt == crX)
      setValue(bUD.aR(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}