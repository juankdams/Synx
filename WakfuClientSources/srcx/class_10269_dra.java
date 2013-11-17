public abstract class dra extends cGj
{
  public static final String aIE = "type";
  public static final String bC = "name";
  public static final String ciu = "iconUrl";
  public static final String Ac = "duration";
  public static final String ltw = "sourceName";
  public static final String ltx = "actionDescription";
  public static final String GB = "level";
  public static final String lty = "levelText";
  public static final String ltz = "multiple";
  public static final String hAp = "canUseAsIngredient";
  private final bcz hQS;
  private final int RZ;
  private final int aSg;
  private final int Sk;
  private int gEg;
  private final int aKS;
  private final boolean ltA;
  private final boolean hAx;

  protected dra(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, bcz parambcz)
  {
    this.RZ = paramInt1;
    this.Sk = paramInt2;
    this.gEg = paramInt3;
    this.aSg = Hh.QM().dh(this.RZ).oc();
    this.aKS = paramInt4;
    this.ltA = paramBoolean;
    this.hQS = parambcz;
    this.hAx = DA.bIr.i(new int[] { this.RZ });
  }

  public String[] getFields()
  {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return getName();
    if (paramString.equals("iconUrl"))
      return ay.bd().a("itemsIconsPath", "defaultIconPath", new Object[] { Integer.valueOf(this.aSg) });
    if (paramString.equals("sourceName"))
      return getSourceName();
    if (paramString.equals("actionDescription")) {
      aCH localaCH = clR.cni().vL(this.Sk);
      String str1 = bU.fH().getString("desc.mru." + localaCH.aOS());
      String str2 = getSourceName();
      return bU.fH().getString("harvest.action", new Object[] { str1, str2 });
    }if (paramString.equals("duration"))
      return String.format("%.1f s", new Object[] { Float.valueOf(this.aKS / 1000.0F) });
    if (paramString.equals("type"))
      return Byte.valueOf(cPa.a(ajA()));
    if (paramString.equals("multiple"))
      return Boolean.valueOf(this.ltA);
    if (paramString.equals("level"))
      return Integer.valueOf(this.gEg);
    if (paramString.equals("canUseAsIngredient"))
      return Boolean.valueOf(this.hAx);
    if (paramString.equals("levelText")) {
      return bU.fH().getString("levelShort.custom", new Object[] { Integer.valueOf(this.gEg) });
    }
    return null;
  }

  public String getName() {
    return bU.fH().b(15, this.RZ, new Object[0]);
  }

  public int bOH() {
    return this.gEg;
  }

  public int gw() {
    return this.RZ;
  }

  public bcz cYc() {
    return this.hQS;
  }

  public void Bh(int paramInt) {
    this.gEg = paramInt;
  }

  public abstract String getSourceName();

  public abstract cPa ajA();
}