public class bHe extends dgQ
{
  public static final String TAG = "tld";
  private int gFg;
  private int gFh;
  private aFG gFi = null;
  private aFG gFj = null;

  public static final int gFk = "row".hashCode();
  public static final int gFl = "column".hashCode();
  public static final int gFm = "horizontalAlign".hashCode();
  public static final int gFn = "verticalAlign".hashCode();

  public int getRow()
  {
    return this.gFg;
  }

  public void setRow(int paramInt) {
    this.gFg = paramInt;
  }

  public int getColumn() {
    return this.gFh;
  }

  public void setColumn(int paramInt) {
    this.gFh = paramInt;
  }

  public aFG getHorizontalAlign() {
    return this.gFi;
  }

  public void setHorizontalAlign(aFG paramaFG) {
    this.gFi = paramaFG;
  }

  public aFG getVerticalAlign() {
    return this.gFj;
  }

  public void setVerticalAlign(aFG paramaFG) {
    this.gFj = paramaFG;
  }

  public void c(bdj parambdj) {
    super.c(parambdj);
    bHe localbHe = (bHe)parambdj;

    localbHe.setRow(this.gFg);
    localbHe.setColumn(this.gFh);
    localbHe.setHorizontalAlign(this.gFi);
    localbHe.setVerticalAlign(this.gFj);
  }

  public void bc() {
    super.bc();

    this.gFi = null;
    this.gFj = null;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == gFk)
      setRow(bUD.aR(paramString));
    else if (paramInt == gFl)
      setColumn(bUD.aR(paramString));
    else if (paramInt == gFm)
      setHorizontalAlign(aFG.gr(paramString));
    else if (paramInt == gFn)
      setVerticalAlign(aFG.gr(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    return super.setPropertyAttribute(paramInt, paramObject);
  }
}