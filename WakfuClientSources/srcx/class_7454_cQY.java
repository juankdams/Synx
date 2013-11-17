public enum cQY
  implements aqm, ccI
{
  public final int id;
  public final aBW kDh;
  public final cge kDi;

  private cQY(int paramcge, aBW arg4, cge arg5)
  {
    this.id = paramcge;
    Object localObject1;
    this.kDh = localObject1;
    Object localObject2;
    this.kDi = localObject2;
  }

  public static cQY yR(int paramInt) {
    cQY[] arrayOfcQY = values();
    for (int i = 0; i < arrayOfcQY.length; i++) {
      cQY localcQY = arrayOfcQY[i];
      if (localcQY.id == paramInt) {
        return localcQY;
      }
    }
    return null;
  }

  public String bK() {
    return String.valueOf(this.id);
  }

  public String bL() {
    return toString();
  }

  public String bN() {
    return toString();
  }

  public qM aF() {
    return this.kDh.gn();
  }
}