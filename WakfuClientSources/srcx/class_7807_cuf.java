import java.text.MessageFormat;

public class cuf
{
  short iel;
  boolean gfe;
  short iem;
  boolean ien;

  public short csA()
  {
    return this.iem;
  }

  public boolean csB() {
    return this.ien;
  }

  public static cuf csC() {
    return new cuf();
  }

  public static cuf wN(int paramInt) {
    cuf localcuf = new cuf();
    localcuf.iel = ((short)paramInt);
    return localcuf;
  }

  public cuf hG(boolean paramBoolean) {
    this.gfe = paramBoolean;
    return this;
  }

  public cuf dl(short paramShort) {
    this.iem = paramShort;
    return this;
  }

  public boolean bCT() {
    return this.gfe;
  }

  public short csD() {
    return this.iel;
  }

  public cuf hH(boolean paramBoolean) {
    this.ien = paramBoolean;
    return this;
  }

  public boolean csE() {
    return this.iel <= 0;
  }

  public String toString() {
    return MessageFormat.format("{0}T{1}{2}", new Object[] { Short.valueOf(this.iel), this.gfe ? "+" : "-", this.ien ? "!" : "" });
  }

  public void wO(int paramInt) {
    this.iel = ((short)paramInt);
  }
}