public class bzx
  implements bYw
{
  private int hY;
  private int hZ;
  private duv gnE;
  private String SK;
  private boolean bIx = false;

  public bzx(int paramInt1, int paramInt2, duv paramduv, String paramString) {
    this.hY = paramInt1;
    this.hZ = paramInt2;
    this.gnE = paramduv;
    this.SK = paramString;

    this.bIx = true;
  }

  public bzx(K paramK) {
    if ((!paramK.getName().equalsIgnoreCase("cursor")) || (paramK.e("path") == null)) {
      return;
    }
    K localK1 = paramK.e("path");
    if (localK1 != null) {
      K localK2 = paramK.e("x");
      K localK3 = paramK.e("y");
      K localK4 = paramK.e("type");

      this.hY = (localK2 == null ? 0 : localK2.getIntValue());
      this.hZ = (localK3 == null ? 0 : localK3.getIntValue());
      this.gnE = (localK4 == null ? duv.lyl : duv.valueOf(localK4.getStringValue().toUpperCase()));
      this.SK = localK1.getStringValue();

      this.bIx = true;
    }
  }

  public void a(uk paramuk) {
    if (this.bIx)
      paramuk.a(this.SK, this.gnE, this.hY, this.hZ);
  }

  public void a(bKD parambKD)
  {
    if (!this.bIx) {
      return;
    }

    parambKD.al(duv.class);

    String str = parambKD.bSL();

    parambKD.a(new bol(null, "loadCursor", str, new String[] { "\"" + this.SK + "\"", duv.class.getSimpleName() + "." + this.gnE.name(), String.valueOf(this.hY), String.valueOf(this.hZ) }));
  }

  public boolean isInitialized()
  {
    return this.bIx;
  }
}