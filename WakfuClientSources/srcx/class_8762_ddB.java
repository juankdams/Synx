import java.awt.Color;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class ddB
{
  private static final String kWR = "text";
  private static final String kWS = "selectableText";
  private static final String kWT = "image";
  private static final String kWU = "type";
  private static final String kWV = "align";
  private static final Pattern kWW = Pattern.compile("(text|image|selectableText)");

  private static final Pattern kWX = Pattern.compile("align=\"(west|center|east)\"");

  private bY kWY = bY.QO;
  private final boolean kWZ;
  private final atq haD;
  private final ddB kXa;
  private aFE fNU = null;

  private String kXb = null;

  public ddB(atq paramatq, ddB paramddB, boolean paramBoolean)
  {
    this.haD = paramatq;
    this.kWZ = paramBoolean;
    this.kXa = paramddB;
  }

  protected abstract String getTypeName();

  public bY cOJ()
  {
    return this.kWY;
  }

  public atq bYe() {
    return this.haD;
  }

  protected void a(bY parambY) {
    this.kWY = parambY;
  }

  public String getData() {
    return this.kXb;
  }

  public void setData(String paramString)
  {
    this.kXb = (paramString != null ? paramString.intern() : null);
  }

  public aFE bAh() {
    return this.fNU;
  }

  public void a(aFE paramaFE) {
    if (paramaFE != null)
      this.fNU = paramaFE;
  }

  public abstract int cms();

  public boolean a(Matcher paramMatcher, ArrayList paramArrayList)
  {
    String str1 = paramMatcher.group(5);
    if (str1 != null) {
      String str2 = paramMatcher.group(2);
      String str3 = paramMatcher.group(4);

      av(str2, str3);

      Matcher localMatcher = KV.bXC.matcher(str1);
      boolean bool = false;
      while (localMatcher.find()) {
        ddB localddB = ((KV)this.haD).a(localMatcher, this, bool);
        if (localddB != this) {
          bool = true;
        }

        localddB.a(localMatcher, paramArrayList);
      }
    } else {
      setData(oU(paramMatcher.group(7)));
      av(null, null);
    }

    return true;
  }

  public final String cOK()
  {
    StringBuilder localStringBuilder1 = new StringBuilder(512);
    b(localStringBuilder1);

    if (cOg.f(localStringBuilder1)) {
      return getData();
    }
    StringBuilder localStringBuilder2 = new StringBuilder("<").append(getTypeName());
    localStringBuilder2.append(localStringBuilder1.toString()).append('>');
    localStringBuilder2.append(cOL());
    localStringBuilder2.append("</").append(getTypeName()).append('>');
    return localStringBuilder2.toString();
  }

  protected static void a(StringBuilder paramStringBuilder, String paramString1, String paramString2)
  {
    paramStringBuilder.append(' ').append(paramString1);
    paramStringBuilder.append("=\"").append(paramString2).append('"');
  }

  protected static void a(StringBuilder paramStringBuilder, String paramString, int paramInt) {
    paramStringBuilder.append(' ').append(paramString);
    paramStringBuilder.append("=\"").append(paramInt).append('"');
  }

  protected static void a(StringBuilder paramStringBuilder, String paramString, boolean paramBoolean) {
    paramStringBuilder.append(' ').append(paramString);
    paramStringBuilder.append('=').append(paramBoolean);
  }

  protected static void a(StringBuilder paramStringBuilder, String paramString, Color paramColor) {
    paramStringBuilder.append(' ').append(paramString);
    paramStringBuilder.append("=\"");
    paramStringBuilder.append(Integer.toHexString(paramColor.getRed() & 0xFF));
    paramStringBuilder.append(Integer.toHexString(paramColor.getGreen() >> 8 & 0xFF));
    paramStringBuilder.append(Integer.toHexString(paramColor.getBlue() >> 16 & 0xFF));
    paramStringBuilder.append('"');
  }

  private String cOL()
  {
    String str = getData();
    str = cOg.replace(str, "<", "&lt;");
    str = cOg.replace(str, ">", "&gt;");

    return str;
  }

  private String oU(String paramString)
  {
    String str = paramString;
    str = cOg.replace(str, "&lt;", "<");
    str = cOg.replace(str, "&gt;", ">");

    return str;
  }

  protected void b(StringBuilder paramStringBuilder)
  {
    if (this.fNU != null)
      a(paramStringBuilder, "align", this.fNU.toString().toLowerCase());
  }

  protected void av(String paramString1, String paramString2)
  {
    if (this.kXa != null) {
      this.fNU = this.kXa.fNU;
    }

    if (paramString2 == null) {
      return;
    }

    Matcher localMatcher = kWX.matcher(paramString2);
    if (localMatcher.find()) {
      aFE localaFE = aFE.valueOf(localMatcher.group(1).toUpperCase());
      if (localaFE != null)
        a(localaFE);
    }
  }

  public static bY oV(String paramString)
  {
    bY localbY = bY.QP;
    if ((paramString != null) && (paramString.length() != 0)) {
      Matcher localMatcher = kWW.matcher(paramString);
      if (localMatcher.find()) {
        localbY = bY.valueOf(localMatcher.group(1).toUpperCase());
      }
    }
    return localbY;
  }

  public abstract boolean vE(int paramInt);

  public abstract boolean vF(int paramInt);

  public abstract boolean dA(int paramInt1, int paramInt2);

  public String toString()
  {
    return getClass().getSimpleName() + " data=" + getData();
  }

  public ddB cOM() {
    return this.kXa;
  }

  public ddB b(bY parambY)
  {
    if (this.kXa == null) {
      return null;
    }

    if (this.kXa.cOJ() == parambY) {
      return this.kXa;
    }

    return this.kXa.b(parambY);
  }
}