import java.util.ArrayList;

public class gD extends cGj
{
  private static gD aFE = new gD();
  public static final String aFF = "giftPackages";
  public static final String aFG = "numPackages";
  public static final String aFH = "selectedPackage";
  public static final String[] bF = { "giftPackages", "numPackages", "selectedPackage" };

  private final ArrayList bI = new ArrayList();

  private final ArrayList aFI = new ArrayList();
  private bsf aFJ = null;

  public static gD oL()
  {
    return aFE;
  }

  public void a(ddO paramddO, boolean paramBoolean) {
    this.bI.add(new cKo(this.aFJ, paramddO, paramBoolean));
  }

  public void s(boolean paramBoolean) {
    if (this.bI.size() == 0) {
      return;
    }
    cKo localcKo = (cKo)this.bI.remove(0);
    if (!paramBoolean) {
      return;
    }
    bsf localbsf = localcKo.cDY();
    int i = this.aFI.indexOf(localbsf);

    if (i == -1) {
      return;
    }
    if (localbsf.a(localcKo.brY(), localcKo.Wu())) {
      this.aFI.remove(localbsf);
      if (this.aFJ == localbsf) {
        this.aFJ = (this.aFI.size() > 0 ? (bsf)this.aFI.get(0) : null);
      }
    }

    dLE.doY().a(this, new String[] { "giftPackages", "numPackages", "selectedPackage" });
  }

  public String[] getFields()
  {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("giftPackages"))
      return this.aFI;
    if (paramString.equals("selectedPackage"))
      return this.aFJ;
    if (paramString.equals("numPackages")) {
      return Integer.valueOf(this.aFI.size());
    }
    return null;
  }

  public void e(ArrayList paramArrayList) {
    clear();

    this.aFI.addAll(paramArrayList);
    oM();

    if (this.aFI.size() > 0)
      a((bsf)this.aFI.get(0));
    else
      a(null);
  }

  private void oM()
  {
    dLE.doY().a(this, new String[] { "giftPackages" });
  }

  public bsf oN() {
    return this.aFJ;
  }

  public void a(bsf parambsf) {
    this.aFJ = parambsf;
    dLE.doY().a(this, new String[] { "selectedPackage" });
  }

  public boolean isEmpty() {
    return this.aFI.isEmpty();
  }

  public void clear() {
    this.aFI.clear();
    this.aFJ = null;
  }
}