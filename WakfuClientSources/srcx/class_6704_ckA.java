import java.awt.Color;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class ckA extends ddB
{
  private static Logger K = Logger.getLogger(ckA.class);
  private static final String hLD = "text";
  private static final String hLE = "font";
  private static final String hLF = "u";
  private static final String hLG = "b";
  private static final String hLH = "i";
  private static final String hLI = "c";
  private static final String hLJ = "name";
  private static final String hLK = "(name|face)";
  private static final String hLL = "color";
  private static final String hLM = "id";
  private static final Pattern hLN = Pattern.compile("(name|face)=\"([a-zA-Z 0-9-]+)\"");
  private static final Pattern hLO = Pattern.compile("size=\"([0-9]+)\"");
  private static final Pattern hLP = Pattern.compile("color=\"([0-9A-Fa-f]{6})\"");

  private static final Pattern hLQ = Pattern.compile("id=\"(([^,]+)|([^,]+\\-[^,]+))\"");

  private String bYJ = null;
  private P dQn;
  private boolean hLR = false;
  private boolean hLS = false;
  private Color dWl;
  private boolean dWm = false;

  private boolean dWn = false;

  public ckA(atq paramatq, ddB paramddB, boolean paramBoolean)
  {
    super(paramatq, paramddB, paramBoolean);
    if (!paramBoolean)
      a(bY.QP);
  }

  public void setData(String paramString)
  {
    super.setData(ln(paramString));
  }

  public int F(String paramString, int paramInt)
  {
    String str1 = ln(paramString);
    String str2 = getText();
    String str3 = str2 == null ? "" : str2.substring(0, paramInt);
    String str4 = str2 == null ? "" : str2.substring(paramInt);
    super.setData(str3 + str1 + str4);
    return str1.length();
  }

  public void setText(String paramString) {
    setData(paramString);
  }

  public String getText() {
    return getData();
  }

  public String cmr() {
    if (bYe().aFm()) {
      return getText().replaceAll(".", "*");
    }
    return getText();
  }

  public P aOe() {
    return this.dQn;
  }

  public void b(P paramP) {
    this.dQn = paramP;
  }

  public Color getColor() {
    return this.dWl;
  }

  public void setColor(Color paramColor) {
    if (paramColor != null)
      this.dWl = paramColor;
  }

  public boolean isUnderline()
  {
    return this.dWm;
  }

  public void setUnderline(boolean paramBoolean) {
    this.dWm = paramBoolean;
  }

  public boolean aOh() {
    return this.dWn;
  }

  public void df(boolean paramBoolean) {
    this.dWn = paramBoolean;
  }

  public String getId() {
    return this.bYJ;
  }

  public void setId(String paramString) {
    this.bYJ = paramString;
  }

  protected String getTypeName()
  {
    return "text";
  }

  public int cms()
  {
    return getText().length();
  }

  public boolean a(Matcher paramMatcher, ArrayList paramArrayList)
  {
    int i = paramArrayList.size();
    boolean bool = super.a(paramMatcher, paramArrayList);
    if ((bool) && ((getData() == null) || (getData().length() == 0)))
    {
      return false;
    }
    paramArrayList.add(i, this);
    return bool;
  }

  public String ln(String paramString)
  {
    Pattern localPattern = bYe().aFl();
    if (localPattern == null) {
      return paramString;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < paramString.length(); i++) {
      String str = Character.toString(paramString.charAt(i));
      if (localPattern.matcher(str).matches()) {
        localStringBuilder.append(str);
      }
    }
    return localStringBuilder.toString();
  }

  protected void b(StringBuilder paramStringBuilder)
  {
    super.b(paramStringBuilder);

    if (this.dQn != null) {
      String str = this.dQn.getFontName();
      if (str != null) {
        a(paramStringBuilder, "name", str);
      }
    }

    if (this.dWl != null) {
      a(paramStringBuilder, "color", this.dWl);
    }

    if (this.bYJ != null) {
      a(paramStringBuilder, "id", this.bYJ);
    }

    if (this.dWm) {
      a(paramStringBuilder, "u", this.dWm);
    }

    if (this.dWn)
      a(paramStringBuilder, "c", this.dWn);
  }

  protected void av(String paramString1, String paramString2)
  {
    super.av(paramString1, paramString2);

    int i = 0;

    ckA localckA = (ckA)b(bY.QP);

    if (localckA != null) {
      this.hLR = localckA.hLR;
      this.hLS = localckA.hLS;
      this.dWm = localckA.dWm;
      this.dWn = localckA.dWn;
      this.dWl = localckA.dWl;
      this.dQn = localckA.dQn;
      this.bYJ = localckA.bYJ;

      if (this.hLR) {
        i |= 1;
      }
      if (this.hLS) {
        i |= 2;
      }
    }

    hf localhf = null;
    if (bYe().aFz() != null) {
      localhf = bYe().aFz().getFont();
    }

    if (this.dQn != null) {
      localhf = this.dQn.getFont();
    }

    int j = 0;
    if (paramString2 != null) {
      Matcher localMatcher1 = hLN.matcher(paramString2);
      if (localMatcher1.find()) {
        String str = localMatcher1.group(2);
        localhf = adF.j(str, bYe().isEnableAWTFont());
        j = 1;
      }

    }

    float f = 0.0F;
    int k = 0;
    Matcher localMatcher2;
    if (paramString2 != null) {
      localMatcher2 = hLO.matcher(paramString2);
      if ((localhf != null) && (localMatcher2.find())) {
        f = Float.parseFloat(localMatcher2.group(1));
        k = 1;
      }
    }

    if (localhf != null) {
      if (paramString2 != null)
      {
        localMatcher2 = hLP.matcher(paramString2);
        if (localMatcher2.find()) {
          try {
            int n = Integer.valueOf(localMatcher2.group(1), 16).intValue();
            setColor(new Color(n));
          } catch (NumberFormatException localNumberFormatException) {
            K.warn("la couleur " + localMatcher2.group(1) + " est invalide !");
          }
        }
      }

      i = localhf.getStyle();

      int m = 0;
      if ("b".equalsIgnoreCase(paramString1)) {
        this.hLR = true;
        m = 1;
      }
      if ("i".equalsIgnoreCase(paramString1)) {
        this.hLS = true;
        m = 1;
      }

      if (m != 0) {
        if (this.hLR) {
          i |= 1;
        }
        if (this.hLS) {
          i |= 2;
        }
      }

      if (k == 0) {
        f = localhf.getSize();
      }
      if ((k != 0) || (m != 0)) {
        localhf = localhf.a(i, f, bYe().isEnableAWTFont());
        j = 1;
      }

      if (j != 0) {
        b(bsB.b(localhf));
      }

    }

    if ("u".equals(paramString1)) {
      setUnderline(true);
    }

    if ("c".equals(paramString1)) {
      df(true);
    }

    if (paramString2 != null) {
      Matcher localMatcher3 = hLQ.matcher(paramString2);
      if (localMatcher3.find())
        setId(String.valueOf(localMatcher3.group(1)));
    }
  }

  public boolean vE(int paramInt)
  {
    String str = getText();
    if (str.length() <= paramInt)
      return false;
    setText(str.substring(0, paramInt));
    return getText().length() == 0;
  }

  public boolean dA(int paramInt1, int paramInt2)
  {
    String str = getText();
    if (str == null) {
      return false;
    }
    if ((paramInt1 < 0) || (paramInt1 > str.length()) || (paramInt2 < 0) || (paramInt2 > str.length()))
    {
      return false;
    }setText(str.substring(0, paramInt1) + str.substring(paramInt2));
    return getText().length() == 0;
  }

  public boolean vF(int paramInt)
  {
    setText(getText().substring(paramInt));
    return getText().length() == 0;
  }
}