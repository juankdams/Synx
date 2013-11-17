public abstract class bZw extends cGj
{
  private static final String bC = "name";
  private static final String eMS = "enabled";
  private static final String epU = "kamasCost";
  private static final String hpT = "currentQuantity";
  private static final String cKW = "maxQuantity";
  private static final String hpU = "quantityText";
  protected static final String[] hpV = { "name", "kamasCost", "enabled", "quantityText" };
  protected bjn hpW;
  protected final bvy hpX;
  private boolean erS;

  protected static String[] x(String[] paramArrayOfString)
  {
    String[] arrayOfString = new String[hpV.length + paramArrayOfString.length];
    System.arraycopy(hpV, 0, arrayOfString, 0, hpV.length);
    System.arraycopy(paramArrayOfString, 0, arrayOfString, hpV.length, paramArrayOfString.length);
    return arrayOfString;
  }

  protected bZw(bvy parambvy)
  {
    this.hpX = parambvy;
  }

  public abstract bUj uz();

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name")) {
      return getName();
    }
    if (paramString.equals("kamasCost"))
    {
      int i;
      if ((this.hpX instanceof bOB)) {
        localObject1 = (bOB)this.hpX;
        localObject2 = aDF.e((bOB)localObject1);
        i = dGu.a((cUh)localObject2, dfX.laF.cPy());
      } else {
        i = this.hpX.ahA();
      }
      Object localObject1 = bU.fH().iK(i);
      Object localObject2 = new lZ();
      if (!ux()) {
        ((lZ)localObject2).am(bNa.gRz.bUV());
      }
      ((lZ)localObject2).a((CharSequence)localObject1);
      return ((lZ)localObject2).tP();
    }
    if (paramString.equals("enabled")) {
      return Boolean.valueOf(bvn());
    }
    if (paramString.equals("currentQuantity")) {
      return Integer.valueOf(sA());
    }
    if (paramString.equals("maxQuantity")) {
      return Short.valueOf(this.hpX.aTB());
    }
    if (paramString.equals("quantityText")) {
      if (this.hpX.aTB() <= 0) {
        return null;
      }
      return sA() + "/" + this.hpX.aTB();
    }
    return null;
  }

  public abstract boolean ux();

  public abstract int sA();

  public bvy bqR() {
    return this.hpX;
  }

  public String getName() {
    return dat.a(bqR());
  }

  public void a(bjn parambjn) {
    this.hpW = parambjn;
  }

  public void gf(boolean paramBoolean) {
    this.erS = paramBoolean;
    dLE.doY().a(this, new String[] { "enabled", "maxQuantity", "quantityText" });
  }

  public boolean bvn() {
    return this.erS;
  }

  public abstract bZw uy();
}