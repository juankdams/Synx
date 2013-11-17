import java.io.InputStream;
import org.apache.log4j.Logger;

public class bfQ
{
  private final cSR ftO = new cSR(20000, 1.0F);
  protected static final Logger K = Logger.getLogger(bfQ.class);

  public bfQ(InputStream paramInputStream)
  {
    load(paramInputStream);
  }

  private void c(aCD paramaCD)
  {
    if (aCD.a(paramaCD) == null)
      return;
    String str = aCD.b(paramaCD);
    if ((str != null) && (str.length() > 0)) {
      int i = str.length() - 1;
      for (int j = 0; j < i; j++)
        if (str.charAt(j) == '\\')
        {
          int k = str.charAt(j + 1);
          if (k == 110) {
            str = str.length() + str.substring(0, j) + '\n' + str.substring(j + 2);

            i--;
          }
        }
    } else {
      str = "";
    }

    this.ftO.put(aCD.a(paramaCD).hashCode(), str.intern());
  }

  public void load(InputStream paramInputStream) {
    aCD localaCD = new aCD(paramInputStream);
    this.ftO.clear();
    while (localaCD.abl()) {
      c(localaCD);
    }

    c(localaCD);
    this.ftO.compact();
  }

  public String get(String paramString) {
    return get(paramString.hashCode());
  }

  public String get(int paramInt) {
    return (String)this.ftO.get(paramInt);
  }

  public boolean containsKey(String paramString) {
    return containsKey(paramString.hashCode());
  }

  public boolean containsKey(int paramInt) {
    return this.ftO.containsKey(paramInt);
  }
}