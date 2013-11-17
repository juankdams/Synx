import java.awt.Dimension;

public final class JW
  implements Cloneable
{
  public static final int bVC = 0;
  public static final int FILL_HORIZONTAL = 1;
  public static final int FILL_VERTICAL = 2;
  public static final int FILL_BOTH = 3;
  public static final int bVD = 0;
  public static final int bVE = 1;
  public static final int bVF = 2;
  public static final int bVG = 4;
  public static final int bVH = 8;
  public static final int bVI = 5;
  public static final int bVJ = 6;
  public static final int bVK = 10;
  public static final int bVL = 9;
  public static final int bVM = 0;
  public static final int bVN = 1;
  public static final int bVO = 2;
  public static final int bVP = 4;
  public static final int ALIGN_LEFT = 0;
  public static final int ALIGN_CENTER = 1;
  public static final int ALIGN_RIGHT = 2;
  public static final int bVQ = 3;
  private int bVR;
  private int bVS;
  private int bVT;
  private int bVU;
  private int bVV;
  private int bVW;
  private int bVX;
  private int bVY;
  public final Dimension bVZ;
  public final Dimension bWa;
  public final Dimension bWb;
  private int bWc;
  private boolean bWd;

  public JW()
  {
    this.bVT = 1;
    this.bVU = 1;
    this.bVV = 3;
    this.bVW = 3;
    this.bVX = 0;
    this.bVY = 0;
    this.bVZ = new Dimension(-1, -1);
    this.bWa = new Dimension(-1, -1);
    this.bWb = new Dimension(-1, -1);
    this.bWc = 0;
  }

  public JW(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, Dimension paramDimension1, Dimension paramDimension2, Dimension paramDimension3)
  {
    this.bVR = paramInt1;
    this.bVS = paramInt2;
    this.bVT = paramInt3;
    this.bVU = paramInt4;
    this.bVY = paramInt5;
    this.bVX = paramInt6;
    this.bVW = paramInt7;
    this.bVV = paramInt8;
    this.bVZ = (paramDimension1 != null ? new Dimension(paramDimension1) : new Dimension(-1, -1));
    this.bWa = (paramDimension2 != null ? new Dimension(paramDimension2) : new Dimension(-1, -1));
    this.bWb = (paramDimension3 != null ? new Dimension(paramDimension3) : new Dimension(-1, -1));
    this.bWc = 0;
  }

  public JW(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, Dimension paramDimension1, Dimension paramDimension2, Dimension paramDimension3, int paramInt9)
  {
    this(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramDimension1, paramDimension2, paramDimension3);
    this.bWc = paramInt9;
  }

  public JW(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, Dimension paramDimension1, Dimension paramDimension2, Dimension paramDimension3, int paramInt9, boolean paramBoolean)
  {
    this(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramDimension1, paramDimension2, paramDimension3, paramInt9);
    this.bWd = paramBoolean;
  }

  public Object clone()
  {
    return new JW(getRow(), getColumn(), getRowSpan(), getColSpan(), UE(), UF(), UC(), UD(), new Dimension(this.bVZ), new Dimension(this.bWa), new Dimension(this.bVZ), getIndent(), UG());
  }

  public int getColumn()
  {
    return this.bVS;
  }

  public void setColumn(int paramInt) {
    if (paramInt < 0) {
      throw new IllegalArgumentException("wrong column: " + paramInt);
    }
    this.bVS = paramInt;
  }

  public int getRow() {
    return this.bVR;
  }

  public void setRow(int paramInt) {
    if (paramInt < 0) {
      throw new IllegalArgumentException("wrong row: " + paramInt);
    }
    this.bVR = paramInt;
  }

  public int getRowSpan() {
    return this.bVT;
  }

  public void setRowSpan(int paramInt) {
    if (paramInt <= 0) {
      throw new IllegalArgumentException("wrong rowSpan: " + paramInt);
    }
    this.bVT = paramInt;
  }

  public int getColSpan() {
    return this.bVU;
  }

  public void setColSpan(int paramInt) {
    if (paramInt <= 0) {
      throw new IllegalArgumentException("wrong colSpan: " + paramInt);
    }
    this.bVU = paramInt;
  }

  public int UC() {
    return this.bVW;
  }

  public void fr(int paramInt) {
    if ((paramInt < 0) || (paramInt > 7)) {
      throw new IllegalArgumentException("invalid sizePolicy: " + paramInt);
    }
    this.bVW = paramInt;
  }

  public int UD() {
    return this.bVV;
  }

  public void fs(int paramInt) {
    if ((paramInt < 0) || (paramInt > 7)) {
      throw new IllegalArgumentException("invalid sizePolicy: " + paramInt);
    }
    this.bVV = paramInt;
  }

  public int UE() {
    return this.bVY;
  }

  public void ft(int paramInt) {
    if ((paramInt < 0) || (paramInt > 15)) {
      throw new IllegalArgumentException("invalid anchor: " + paramInt);
    }
    this.bVY = paramInt;
  }

  public int UF() {
    return this.bVX;
  }

  public void fu(int paramInt) {
    if ((paramInt != 0) && (paramInt != 1) && (paramInt != 2) && (paramInt != 3))
    {
      throw new IllegalArgumentException("invalid fill: " + paramInt);
    }
    this.bVX = paramInt;
  }

  public int getIndent() {
    return this.bWc;
  }

  public void setIndent(int paramInt) {
    this.bWc = paramInt;
  }

  public boolean UG() {
    return this.bWd;
  }

  public void aT(boolean paramBoolean) {
    this.bWd = paramBoolean;
  }

  public JW UH() {
    JW localJW = new JW();

    localJW.setRow(this.bVR);
    localJW.setColumn(this.bVS);
    localJW.setColSpan(this.bVU);
    localJW.setRowSpan(this.bVT);
    localJW.fs(this.bVV);
    localJW.fr(this.bVW);
    localJW.fu(this.bVX);
    localJW.ft(this.bVY);
    localJW.setIndent(this.bWc);
    localJW.aT(this.bWd);

    localJW.bVZ.setSize(this.bVZ);
    localJW.bWa.setSize(this.bWa);
    localJW.bWb.setSize(this.bWb);

    return localJW;
  }

  public void c(JW paramJW) {
    this.bVR = paramJW.bVR;
    this.bVS = paramJW.bVS;
    this.bVT = paramJW.bVT;
    this.bVU = paramJW.bVU;
    this.bVW = paramJW.bVW;
    this.bVV = paramJW.bVV;
    this.bVX = paramJW.bVX;
    this.bVY = paramJW.bVY;
    this.bWc = paramJW.bWc;
    this.bWd = paramJW.bWd;

    this.bVZ.setSize(paramJW.bVZ);
    this.bWa.setSize(paramJW.bWa);
    this.bWb.setSize(paramJW.bWb);
  }

  public boolean equals(Object paramObject) {
    if (this == paramObject) return true;
    if (!(paramObject instanceof JW)) return false;

    JW localJW = (JW)paramObject;

    if (this.bVY != localJW.bVY) return false;
    if (this.bVU != localJW.bVU) return false;
    if (this.bVS != localJW.bVS) return false;
    if (this.bVX != localJW.bVX) return false;
    if (this.bVW != localJW.bVW) return false;
    if (this.bVR != localJW.bVR) return false;
    if (this.bVT != localJW.bVT) return false;
    if (this.bVV != localJW.bVV) return false;
    if ((localJW.bWb != null ? 1 : this.bWb != null ? 0 : !this.bWb.equals(localJW.bWb) ? 1 : 0) != 0) return false;
    if ((localJW.bVZ != null ? 1 : this.bVZ != null ? 0 : !this.bVZ.equals(localJW.bVZ) ? 1 : 0) != 0) return false;
    if ((localJW.bWa != null ? 1 : this.bWa != null ? 0 : !this.bWa.equals(localJW.bWa) ? 1 : 0) != 0) return false;
    if (this.bWc != localJW.bWc) return false;
    if (this.bWd != localJW.bWd) return false;

    return true;
  }

  public int hashCode()
  {
    int i = this.bVR;
    i = 29 * i + this.bVS;
    i = 29 * i + this.bVT;
    i = 29 * i + this.bVU;
    i = 29 * i + this.bVV;
    i = 29 * i + this.bVW;
    i = 29 * i + this.bVX;
    i = 29 * i + this.bVY;
    i = 29 * i + (this.bVZ != null ? this.bVZ.hashCode() : 0);
    i = 29 * i + (this.bWa != null ? this.bWa.hashCode() : 0);
    i = 29 * i + (this.bWb != null ? this.bWb.hashCode() : 0);
    i = 29 * i + this.bWc;
    i = 29 * i + (this.bWd ? 1 : 0);
    return i;
  }

  public int aU(boolean paramBoolean) {
    return paramBoolean ? getRow() : getColumn();
  }

  public void b(boolean paramBoolean, int paramInt) {
    if (paramBoolean) {
      setRow(paramInt);
    }
    else
      setColumn(paramInt);
  }

  public int aV(boolean paramBoolean)
  {
    return paramBoolean ? getRowSpan() : getColSpan();
  }

  public void c(boolean paramBoolean, int paramInt) {
    if (paramBoolean) {
      setRowSpan(paramInt);
    }
    else
      setColSpan(paramInt);
  }

  public boolean d(boolean paramBoolean, int paramInt)
  {
    if (paramBoolean) {
      return (paramInt >= this.bVR) && (paramInt < this.bVR + this.bVT);
    }
    return (paramInt >= this.bVS) && (paramInt < this.bVS + this.bVU);
  }

  public String toString()
  {
    return "GridConstraints (row=" + this.bVR + ", col=" + this.bVS + ", rowspan=" + this.bVT + ", colspan=" + this.bVU + ")";
  }
}