public enum aiI
  implements ccI
{
  private final int aRQ;
  private boolean dgA = true;
  private final csx dgB;

  public static void cl(boolean paramBoolean)
  {
    aiI[] arrayOfaiI = values();
    int i = 0; for (int j = arrayOfaiI.length; i < j; i++)
      arrayOfaiI[i].dgA = paramBoolean;
  }

  private aiI(int arg3, csx arg4)
  {
    int i;
    this.aRQ = i;
    Object localObject;
    this.dgB = localObject;
  }

  public String bK() {
    return toString();
  }

  public String bL() {
    return toString();
  }

  public csx avt() {
    csx localcsx = this.dgB.qb();
    localcsx.setUsable(this.dgA);
    return localcsx;
  }

  public int eo() {
    return this.aRQ;
  }

  public csx avu() {
    return this.dgB;
  }

  public boolean isUsable()
  {
    return this.dgA;
  }

  public void setUsable(boolean paramBoolean)
  {
    this.dgA = paramBoolean;
  }

  public String bN() {
    return bL();
  }

  public static aiI iI(int paramInt) {
    aiI[] arrayOfaiI = values();
    for (int i = 0; i < arrayOfaiI.length; i++) {
      aiI localaiI = arrayOfaiI[i];
      if (localaiI.eo() == paramInt) {
        return localaiI;
      }
    }
    return null;
  }
}