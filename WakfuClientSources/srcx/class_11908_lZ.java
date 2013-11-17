import java.util.ArrayList;

public class lZ
{
  protected final StringBuilder aQa = new StringBuilder(100);
  protected boolean aQb;
  protected bY aQc = bY.QO;

  protected final ArrayList aQd = new ArrayList();
  static long aQe;
  static long aQf;
  static long count;

  public lZ q(Object paramObject)
  {
    if (this.aQb) {
      tR();
    }
    this.aQa.append(paramObject.toString());
    return this;
  }

  public lZ a(CharSequence paramCharSequence) {
    if (this.aQb) {
      tR();
    }
    this.aQa.append(paramCharSequence);
    return this;
  }

  public lZ a(CharSequence paramCharSequence, int paramInt1, int paramInt2) {
    if (this.aQb) {
      tR();
    }
    this.aQa.append(paramCharSequence, paramInt1, paramInt2);
    return this;
  }

  public lZ v(byte paramByte) {
    if (this.aQb) {
      tR();
    }
    this.aQa.append(format(paramByte));
    return this;
  }

  public lZ o(short paramShort) {
    if (this.aQb) {
      tR();
    }
    this.aQa.append(format(paramShort));
    return this;
  }

  public lZ e(char paramChar) {
    if (this.aQb) {
      tR();
    }
    this.aQa.append(paramChar);
    return this;
  }

  public lZ bw(int paramInt) {
    if (this.aQb) {
      tR();
    }
    this.aQa.append(format(paramInt));
    return this;
  }

  public lZ P(long paramLong) {
    if (this.aQb) {
      tR();
    }
    this.aQa.append(format(paramLong));
    return this;
  }

  public lZ x(float paramFloat) {
    if (this.aQb) {
      tR();
    }
    this.aQa.append(format(paramFloat));
    return this;
  }

  public lZ b(double paramDouble) {
    if (this.aQb) {
      tR();
    }
    this.aQa.append(format(paramDouble));
    return this;
  }

  public lZ F(boolean paramBoolean) {
    if (this.aQb) {
      tR();
    }
    this.aQa.append(paramBoolean);
    return this;
  }

  protected void ak(String paramString) {
    this.aQd.add(paramString);
    this.aQa.append('<').append(paramString);
    this.aQb = true;
    this.aQc = bY.QP;
  }

  protected void al(String paramString) {
    this.aQd.remove(this.aQd.size() - 1);
    this.aQa.append("</").append(paramString).append('>');
    this.aQc = bY.QO;
  }

  protected void a(String paramString, bY parambY) {
    this.aQd.add(paramString);
    this.aQa.append('<').append(paramString);
    this.aQb = true;
    this.aQc = parambY;
  }

  public lZ tz() {
    if (this.aQb) {
      tR();
    }

    ak("b");
    return this;
  }

  public lZ tA() {
    if (this.aQb) {
      tR();
    }

    al("b");
    return this;
  }

  public lZ tB() {
    if (this.aQb) {
      tR();
    }

    ak("c");
    return this;
  }

  public lZ tC() {
    if (this.aQb) {
      tR();
    }

    al("c");
    return this;
  }

  public lZ tD() {
    if (this.aQb) {
      tR();
    }

    ak("i");
    return this;
  }

  public lZ tE() {
    if (this.aQb) {
      tR();
    }

    al("i");
    return this;
  }

  public lZ tF() {
    if (this.aQb) {
      tR();
    }

    ak("u");
    return this;
  }

  public lZ tG() {
    if (this.aQb) {
      tR();
    }

    al("u");
    return this;
  }

  public lZ tH() {
    if (this.aQb) {
      tR();
    }
    this.aQa.append('\n');
    return this;
  }

  public lZ tI() {
    if (this.aQb) {
      tR();
    }

    ak("text");
    return this;
  }

  public lZ tJ() {
    if (this.aQb) {
      tR();
    }

    al("text");
    return this;
  }

  public lZ tK() {
    if (this.aQb) {
      tR();
    }

    a("image", bY.QQ);
    return this;
  }

  public lZ tL() {
    if (this.aQb) {
      tR();
    }

    al("image");
    return this;
  }

  public lZ a(String paramString1, int paramInt1, int paramInt2, String paramString2) {
    a(paramString1, paramInt1, paramInt2, paramString2, null);
    return this;
  }

  public lZ a(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3) {
    tK();
    f("pixmap", paramString1);
    if (paramInt1 > 0) {
      f("width", String.valueOf(paramInt1));
    }
    if (paramInt2 > 0) {
      f("height", String.valueOf(paramInt2));
    }
    if (paramString2 != null) {
      f("align", paramString2);
    }
    if (paramString3 != null) {
      f("popupTranslatorKey", paramString3);
    }
    tL();
    return this;
  }

  public lZ tM() {
    e("align", "center");
    return this;
  }

  public lZ tN() {
    e("align", "east");
    return this;
  }

  public lZ tO() {
    e("align", "west");
    return this;
  }

  public lZ b(bNa parambNa) {
    return am(parambNa.bUV());
  }

  public lZ am(String paramString) {
    e("color", paramString);
    return this;
  }

  public lZ an(String paramString) {
    e("name", paramString);
    return this;
  }

  public lZ bx(int paramInt) {
    e("size", String.valueOf(paramInt));
    return this;
  }

  public lZ ao(String paramString) {
    e("id", paramString);
    return this;
  }

  public lZ by(int paramInt) {
    e("width", String.valueOf(paramInt));
    return this;
  }

  public lZ bz(int paramInt) {
    e("height", String.valueOf(paramInt));
    return this;
  }

  public lZ ap(String paramString) {
    e("pixmap", paramString);
    return this;
  }

  public String toString()
  {
    return this.aQa.toString();
  }

  public int length() {
    return this.aQa.length();
  }

  public String tP() {
    if (!this.aQd.isEmpty()) {
      tQ();
    }
    if (this.aQa.length() > aQe) {
      aQe = this.aQa.length();
    }
    count += 1L;
    aQf += this.aQa.length();
    return this.aQa.toString();
  }

  public static boolean aq(String paramString) {
    return paramString.contains("<text");
  }

  public static boolean ar(String paramString) {
    return paramString.contains("color=");
  }

  protected void e(String paramString1, String paramString2)
  {
    if (this.aQc != bY.QP) {
      tI();
    }

    this.aQa.append(' ').append(paramString1).append("=\"").append(paramString2).append('"');
  }

  protected void f(String paramString1, String paramString2) {
    if (this.aQc != bY.QQ) {
      tK();
    }

    this.aQa.append(' ').append(paramString1).append("=\"").append(paramString2).append('"');
  }

  protected void tQ() {
    if (this.aQb) {
      tR();
    }

    while (!this.aQd.isEmpty())
      this.aQa.append("</").append((String)this.aQd.remove(this.aQd.size() - 1)).append('>');
  }

  protected void tR()
  {
    if ((!bB) && (!this.aQb)) throw new AssertionError();
    this.aQa.append('>');
    this.aQb = false;
  }

  public void clear() {
    this.aQa.delete(0, this.aQa.length());
  }

  public boolean tS() {
    return this.aQb;
  }

  private String format(long paramLong) {
    return cHO.cCa().iK(paramLong);
  }

  private String format(double paramDouble) {
    return cHO.cCa().R(paramDouble);
  }
}