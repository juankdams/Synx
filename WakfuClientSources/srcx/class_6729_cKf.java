import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class cKf extends ddB
{
  private static final String hLD = "image";
  private static final String iIQ = "width";
  private static final String iIR = "height";
  private static final String iIS = "pixmap";
  private static final String iIT = "popupTranslatorKey";
  private static final Pattern iIU = Pattern.compile("width=\"([0-9]+)\"");
  private static final Pattern iIV = Pattern.compile("height=\"([0-9]+)\"");
  private static final Pattern iIW = Pattern.compile("pixmap=\"([a-zA-Z0-9\\-_/!:.]+)\"");
  private static final Pattern iIX = Pattern.compile("popupTranslatorKey=\"([a-zA-Z0-9\\-_/!:.]+)\"");
  private String iIY;
  private dDq bQC;
  private int ia = 0;
  private int ib = 0;
  private boolean iIZ = false;
  private String iJa;

  public cKf(atq paramatq, ddB paramddB)
  {
    super(paramatq, paramddB, true);
    a(bY.QQ);
  }

  public dDq getPixmap() {
    return this.bQC;
  }

  public void setPixmap(dDq paramdDq) {
    this.bQC = paramdDq;
  }

  public int getWidth()
  {
    if (this.iIZ) {
      return this.ia;
    }
    if (this.bQC != null) {
      return this.bQC.getWidth();
    }
    return 0;
  }

  public void setWidth(int paramInt)
  {
    this.ia = paramInt;
    this.iIZ = true;
  }

  public int getHeight()
  {
    if (this.iIZ) {
      return this.ib;
    }
    if (this.bQC != null) {
      return this.bQC.getHeight();
    }
    return 0;
  }

  public void setHeight(int paramInt)
  {
    this.ib = paramInt;
    this.iIZ = true;
  }

  public int cms()
  {
    return 1;
  }

  protected void b(StringBuilder paramStringBuilder)
  {
    super.b(paramStringBuilder);

    if (this.ia != 0) {
      a(paramStringBuilder, "width", this.ia);
    }

    if (this.ib != 0) {
      a(paramStringBuilder, "height", this.ib);
    }

    if (this.iIY != null)
      a(paramStringBuilder, "pixmap", this.iIY);
  }

  protected void av(String paramString1, String paramString2)
  {
    super.av(paramString1, paramString2);

    if (paramString2 != null)
    {
      Matcher localMatcher1 = iIU.matcher(paramString2);
      if (localMatcher1.find()) {
        setWidth(Integer.valueOf(localMatcher1.group(1)).intValue());
      }

      Matcher localMatcher2 = iIV.matcher(paramString2);
      if (localMatcher2.find()) {
        setHeight(Integer.valueOf(localMatcher2.group(1)).intValue());
      }

      Matcher localMatcher3 = iIW.matcher(paramString2);
      if (localMatcher3.find()) {
        localObject = localMatcher3.group(1);
        uz localuz = dQU.drS().rO((String)localObject);
        if (localuz != null) {
          setPixmap(new dDq(localuz));
          this.iIY = ((String)localObject);
        }

      }

      Object localObject = iIX.matcher(paramString2);
      if (((Matcher)localObject).find())
        this.iJa = ((Matcher)localObject).group(1);
    }
  }

  public String cDW()
  {
    return this.iJa;
  }

  public boolean vE(int paramInt)
  {
    return true;
  }

  public boolean dA(int paramInt1, int paramInt2)
  {
    return true;
  }

  public boolean vF(int paramInt)
  {
    return true;
  }

  public boolean a(Matcher paramMatcher, ArrayList paramArrayList)
  {
    int i = paramArrayList.size();
    boolean bool = super.a(paramMatcher, paramArrayList);
    if (this.iIY == null) {
      return false;
    }
    paramArrayList.add(i, this);
    return bool;
  }

  protected String getTypeName()
  {
    return "image";
  }

  public String getData()
  {
    return "";
  }
}