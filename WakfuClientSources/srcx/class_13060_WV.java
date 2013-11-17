import java.awt.Point;

public class WV extends dRq
{
  public static final String TAG = "WindowResizePoint";
  public static final String cwM = "WRP";
  private bpn cGL = null;
  private aFG cGM;
  private Point cGN;
  private boolean cGO = false;
  private dRq cGP = null;
  private doN cGQ;
  public static final int cGR = "pointAlign".hashCode();

  public String getTag()
  {
    return "WindowResizePoint";
  }

  public void setPointAlign(aFG paramaFG)
  {
    this.cGM = paramaFG;

    switch (akI.dlz[this.cGM.ordinal()]) {
    case 1:
    case 2:
      setCursorType(duv.lyp);
      break;
    case 3:
    case 4:
      setCursorType(duv.lyq);
      break;
    case 5:
    case 6:
      setCursorType(duv.lyr);
      break;
    case 7:
    case 8:
      setCursorType(duv.lys);
      break;
    case 9:
      setCursorType(duv.lyn);
    }
  }

  public aFG getPointAlign()
  {
    return this.cGM;
  }

  public void setWindow(bpn parambpn)
  {
    this.cGL = parambpn;
  }

  public bpn getWindow()
  {
    return this.cGL;
  }

  protected int setCheckedWidth(int paramInt)
  {
    int i = 0;
    Or localOr = this.cGL.getPrefSize();
    if (paramInt >= localOr.width) {
      this.cGL.setSize(paramInt, this.cGL.haN.height);
    } else {
      paramInt = localOr.width;
      this.cGL.setSize(paramInt, this.cGL.haN.height);
    }
    return paramInt;
  }

  protected int setCheckedHeight(int paramInt)
  {
    int i = 0;
    Or localOr = this.cGL.getPrefSize();
    if (paramInt >= localOr.height) {
      this.cGL.setSize(this.cGL.haN.width, paramInt);
    } else {
      paramInt = localOr.height;
      this.cGL.setSize(this.cGL.haN.width, paramInt);
    }
    return paramInt;
  }

  public void aji()
  {
    this.cGQ = new akJ(this);

    bsP.getInstance().a(CH.bGv, this.cGQ, false);

    a(CH.bGq, new akH(this), false);
  }

  public void ajj()
  {
    super.ajj();
    this.cGL = ((bpn)getParentOfType(bpn.class));
    if (this.cGL != null)
      this.cGP = this.cGL.getWidgetParentOfType(dhh.class);
  }

  public void bc()
  {
    super.bc();

    bsP.getInstance().b(CH.bGv, this.cGQ, false);

    this.cGL = null;
    this.cGM = null;
  }

  public void aJ()
  {
    super.aJ();
    aji();
    this.meQ = false;
  }

  public void c(bdj parambdj)
  {
    WV localWV = (WV)parambdj;
    super.c(parambdj);
    localWV.setPointAlign(this.cGM);
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == cGR)
      setPointAlign(aFG.gr(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    return super.setPropertyAttribute(paramInt, paramObject);
  }

  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    ajk();
  }

  public void setNetEnabled(boolean paramBoolean) {
    super.setNetEnabled(paramBoolean);
    ajk();
  }

  private void ajk() {
    if (isEnabledFull())
      setPointAlign(this.cGM);
    else
      setCursorType(duv.lyl);
  }
}