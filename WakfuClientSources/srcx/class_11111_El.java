import java.awt.Dimension;

public enum El
  implements ccI
{
  private final byte hV;
  private final String aKM;
  private final boolean bIY;
  private final dxL aPJ;
  private final boolean bIZ;
  private final boolean bJa;
  private final boolean bJb;
  private final Dimension bJc;

  private El(byte paramBoolean1, String paramdxL, boolean paramBoolean2, dxL paramBoolean3, boolean paramDimension, boolean paramBoolean4, Dimension arg9, boolean arg10)
  {
    this.hV = paramBoolean1;
    this.aKM = paramdxL;
    this.bIY = paramBoolean2;
    this.aPJ = paramBoolean3;
    this.bIZ = paramDimension;
    this.bJa = paramBoolean4;
    Object localObject;
    this.bJc = localObject;
    boolean bool;
    this.bJb = bool;
  }

  public byte bJ() {
    return this.hV;
  }

  public String bK() {
    return String.valueOf(this.hV);
  }

  public String bL() {
    return this.aKM;
  }

  public String bN() {
    return null;
  }

  public boolean MQ() {
    return this.bIY;
  }

  public boolean MR() {
    return this.bIZ;
  }

  public boolean MS() {
    return (this.bJa) || (cwl.ctP());
  }

  public Dimension getSize() {
    return this.bJc;
  }

  public boolean MT() {
    return this.bJb;
  }

  public static El Q(byte paramByte) {
    for (El localEl : values()) {
      if (localEl.hV == paramByte) {
        return localEl;
      }
    }

    return null;
  }

  public dxL tw() {
    return this.aPJ;
  }
}