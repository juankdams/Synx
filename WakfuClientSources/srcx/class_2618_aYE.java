import java.awt.Font;

public class aYE
  implements hf
{
  private final Font fey;
  private final boolean fez;
  private final boolean feA;

  public aYE(Font paramFont, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.fey = paramFont;
    this.fez = paramBoolean1;
    this.feA = paramBoolean2;
  }

  public hf a(int paramInt, float paramFloat, boolean paramBoolean)
  {
    if (!adF.bT(paramBoolean)) {
      return null;
    }
    Font localFont = this.fey.deriveFont(paramInt, paramFloat);
    return new aYE(localFont, isAntiAliased(), at());
  }

  public float getSize() {
    return this.fey.getSize2D();
  }

  public int getStyle() {
    int i = 0;
    if (this.fey.isBold()) {
      i |= 1;
    }
    if (this.fey.isItalic()) {
      i |= 2;
    }
    return i;
  }

  public short ph() {
    return 0;
  }

  public final Font bnO() {
    return this.fey;
  }

  public final boolean isAntiAliased() {
    return this.fez;
  }

  public boolean at() {
    return this.feA;
  }

  public boolean equals(Object paramObject) {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject == null) || (getClass() != paramObject.getClass())) {
      return false;
    }

    aYE localaYE = (aYE)paramObject;

    if (this.fez != localaYE.fez) {
      return false;
    }
    if (this.feA != localaYE.feA) {
      return false;
    }
    if (!this.fey.equals(localaYE.fey)) {
      return false;
    }

    return true;
  }

  public int hashCode() {
    int i = this.fey.hashCode();
    i = 31 * i + (this.fez ? 1 : 0);
    i = 31 * i + (this.feA ? 1 : 0);
    return i;
  }
}