public enum cwy
  implements aqm, ccI
{
  private final int aw;
  private qM doG;

  private cwy(int arg3, qM arg4)
  {
    int i;
    this.aw = i;
    Object localObject;
    this.doG = localObject;
  }

  public String bK() {
    return Integer.toString(this.aw);
  }

  public String bL() {
    return toString();
  }

  public String bN() {
    return null;
  }

  public qM aF() {
    return this.doG;
  }

  public int getId() {
    return this.aw;
  }

  public static Ig dU(int paramInt1, int paramInt2) {
    if (paramInt1 == iiB.getId())
      return new bod(paramInt2);
    if (paramInt1 == iiC.getId())
      return new aJq(paramInt2);
    if (paramInt1 == iiD.getId())
      return new cEC(paramInt2);
    if (paramInt1 == iiE.getId())
      return new diz(paramInt2);
    if (paramInt1 == iiF.getId()) {
      return new aSr(paramInt2);
    }
    return null;
  }
}