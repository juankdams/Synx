import java.util.ArrayList;
import org.apache.log4j.Logger;

public class chu
  implements bYw
{
  private static final Logger K = Logger.getLogger(chu.class);
  private int hY;
  private int hZ;
  private duv gnE;
  private int aGf;
  private ArrayList hFH;
  private boolean bIx = false;

  public chu(K paramK) {
    if (!paramK.getName().equalsIgnoreCase("animatedCursor")) {
      return;
    }
    try
    {
      K localK1 = paramK.e("x");
      K localK2 = paramK.e("y");
      K localK3 = paramK.e("delay");
      K localK4 = paramK.e("type");
      this.hY = (localK1 == null ? 0 : localK1.getIntValue());
      this.hZ = (localK2 == null ? 0 : localK2.getIntValue());
      this.aGf = (localK3 == null ? 500 : localK3.getIntValue());
      this.gnE = (localK4 == null ? duv.lyl : duv.valueOf(localK4.getStringValue().toUpperCase()));

      ArrayList localArrayList = paramK.c("cursorFrame");
      this.hFH = new ArrayList(localArrayList.size());
      int i = 0; for (int j = localArrayList.size(); i < j; i++) {
        K localK5 = (K)localArrayList.get(i);
        K localK6 = localK5.e("path");
        this.hFH.add(localK6.getStringValue());
      }

      this.bIx = true;
    } catch (Exception localException) {
      K.warn("Problème à la lecture d'un AnimatedCursor");
    }
  }

  public chu(int paramInt1, int paramInt2, duv paramduv, int paramInt3, int paramInt4, ArrayList paramArrayList) {
    this.hY = paramInt1;
    this.hZ = paramInt2;
    this.gnE = paramduv;
    this.aGf = paramInt3;
    this.hFH = paramArrayList;
  }

  public void a(uk paramuk) {
    if (this.bIx)
      paramuk.a(this.gnE, this.hY, this.hZ, this.aGf, this.hFH);
  }

  public String a(bUk parambUk)
  {
    if (!this.bIx) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    String str = parambUk.can();
    localStringBuilder.append(new cHH(ArrayList.class, str, "new ArrayList<String>()").a(parambUk));
    localStringBuilder.append("\n");

    int i = 0; for (int j = this.hFH.size(); i < j; i++) {
      localStringBuilder.append(new bol(null, "add", str, new String[] { "\"" + (String)this.hFH.get(i) + "\"" }).a(parambUk)).append("\n");
    }
    localStringBuilder.append("\n");

    localStringBuilder.append("InitLoaderManager.getInstance().addLoader(new AnimatedCursorInitLoader(").append(this.hY).append(", ").append(this.hZ).append(", ").append("CursorFactory.CursorType.").append(this.gnE.name()).append(", ").append(this.aGf).append(", ").append(str).append("));");

    return localStringBuilder.toString();
  }

  public void a(bKD parambKD)
  {
    if (!this.bIx) {
      return;
    }

    parambKD.al(ArrayList.class);
    parambKD.al(duv.class);

    String str1 = parambKD.bSL();

    String str2 = parambKD.can();
    parambKD.a(new cHH(ArrayList.class, str2, "new ArrayList<String>()"));

    int i = 0; for (int j = this.hFH.size(); i < j; i++) {
      parambKD.a(new bol(null, "add", str2, new String[] { "\"" + (String)this.hFH.get(i) + "\"" }));
    }

    parambKD.a(new bol(null, "loadAnimatedCursor", str1, new String[] { duv.class.getSimpleName() + "." + this.gnE.name(), String.valueOf(this.hY), String.valueOf(this.hZ), String.valueOf(this.aGf), str2 }));
  }

  public boolean isInitialized()
  {
    return this.bIx;
  }
}