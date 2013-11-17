public class dCo
{
  public static final dCo lKF = new dCo(1.0F, 10.0F, 18.0F);
  private float cLB;
  private float cLC;
  private float cLD;
  public static final String lKG = "rollOffFactor";
  public static final String lKH = "refDistance";
  public static final String lKI = "maxDistance";

  public dCo()
  {
  }

  public dCo(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.cLB = paramFloat1;
    this.cLC = paramFloat2;
    this.cLD = paramFloat3;
  }

  public float bti() {
    return this.cLB;
  }

  public float btj() {
    return this.cLC;
  }

  public float btg() {
    return this.cLD;
  }

  public static dCo J(K paramK) {
    dCo localdCo = new dCo();
    for (K localK : paramK.getChildren()) {
      if (localK.getName().equals("rollOffFactor"))
        localdCo.cLB = localK.e("value").ai();
      else if (localK.getName().equals("refDistance"))
        localdCo.cLC = localK.e("value").ai();
      else if (localK.getName().equals("maxDistance")) {
        localdCo.cLD = localK.e("value").ai();
      }
    }
    return localdCo;
  }

  public static Xg K(K paramK) {
    Xg localXg = new Xg();
    for (K localK : paramK.getChildren()) {
      if (localK.getName().equals("rollOff")) {
        localXg.put(localK.e("id").getIntValue(), J(localK));
      }
    }
    return localXg;
  }
}