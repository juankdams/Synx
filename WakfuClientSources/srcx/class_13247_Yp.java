public enum Yp
  implements ccI
{
  private final byte cJa;
  private final long aTz;
  private final String aKM;
  private float cJb;
  private int bvj;
  private bZA aB = null;

  private Yp(long paramString, String arg5)
  {
    this.cJa = ((byte)(int)paramString);
    this.aTz = (1 << (int)paramString);
    Object localObject;
    this.aKM = localObject;
  }

  public static Yp cj(long paramLong) {
    for (Yp localYp : values()) {
      if (localYp.getId() == paramLong)
        return localYp;
    }
    return null;
  }

  public long getId() {
    return this.aTz;
  }

  public String bK() {
    return String.valueOf(this.aTz);
  }

  public String bL() {
    return this.aKM;
  }

  public String bN() {
    return null;
  }

  public void a(bZA parambZA) {
    this.aB = parambZA;
  }

  public bZA F() {
    return this.aB;
  }

  public void ab(float paramFloat) {
    this.cJb = paramFloat;
  }

  public float ajX() {
    return this.cJb;
  }

  public byte ajY() {
    return this.cJa;
  }

  public int IP() {
    return this.bvj;
  }

  public void hp(int paramInt) {
    this.bvj = paramInt;
  }
}