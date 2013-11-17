public enum cVE
{
  private static dPx kBj;
  public final byte ewr;
  public final float kIb;
  public final float kIc;
  public final float kId;

  private cVE(int paramFloat2, float paramFloat3, float arg5, float arg6)
  {
    this.ewr = ((byte)paramFloat2);

    this.kIb = paramFloat3;
    Object localObject1;
    this.kIc = localObject1;
    Object localObject2;
    this.kId = localObject2;
  }

  public static cVE eH(byte paramByte) {
    return (cVE)kBj.bf(paramByte);
  }

  static
  {
    kBj = new dPx();

    for (cVE localcVE : values())
      kBj.c(localcVE.ewr, localcVE);
  }
}