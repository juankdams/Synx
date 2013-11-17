public enum eu
  implements ccI, dSc
{
  private final byte hV;
  private final int aAq;
  private final int aAr;
  private final int aAs;
  private final int aAt;
  private final int aAu;
  private final int aAv;
  private final boolean aAw;
  private final int aAx;
  private final int aAy;
  private final int aAz;
  private final int aAA;
  private bTI aAB = null;
  private final boolean aAC;
  protected final boolean aAD;
  private static int aAE = -2147483648;

  private eu(int paramInt3, int paramInt4, int paramInt5, int paramInt6, int arg7, int arg8)
  {
    this(paramInt3, paramInt4, paramInt5, paramInt6, i, j, false, false, -1, -1, -1, -1, false, -1);
  }

  private eu(int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramBoolean, int arg8, boolean arg9) {
    this(paramInt3, paramInt4, paramInt5, paramInt6, paramBoolean, i, bool, false, -1, -1, -1, -1, false, -1);
  }

  private eu(int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramBoolean1, int paramBoolean2, boolean arg9, boolean arg10) {
    this(paramInt3, paramInt4, paramInt5, paramInt6, paramBoolean1, paramBoolean2, bool1, bool2, -1, -1, -1, -1, false, -1);
  }

  private eu(int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramBoolean, int paramInt7, boolean paramInt8, int paramInt9, int paramInt10, int arg12, int arg13)
  {
    this(paramInt3, paramInt4, paramInt5, paramInt6, paramBoolean, paramInt7, paramInt8, false, paramInt9, paramInt10, i, j, false, -1);
  }

  private eu(int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramBoolean, int paramInt7, boolean paramInt8, int paramInt9, int paramInt10, int paramInt11, int arg13, int arg14)
  {
    this(paramInt3, paramInt4, paramInt5, paramInt6, paramBoolean, paramInt7, paramInt8, false, paramInt9, paramInt10, paramInt11, i, false, j);
  }

  private eu(int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramBoolean1, int paramBoolean2, boolean paramInt7, boolean paramInt8, int paramInt9, int paramInt10, int paramBoolean3, int paramInt11, boolean arg15, int arg16)
  {
    boolean bool;
    this.aAD = bool;
    this.hV = ((byte)paramInt3);
    this.aAq = paramInt4;
    this.aAr = paramInt5;
    this.aAs = paramInt6;
    this.aAt = paramBoolean1;
    this.aAv = paramBoolean2;
    this.aAw = paramInt7;
    this.aAx = paramInt9;
    this.aAy = paramInt10;
    this.aAz = paramBoolean3;
    this.aAA = paramInt11;
    this.aAC = paramInt8;
    int i;
    this.aAu = i;
  }

  public byte bJ() {
    return this.hV;
  }

  public byte ln() {
    return 0;
  }

  public void a(bTI parambTI) {
    if (this.aAB != null)
      throw new RuntimeException("Trying to associate element " + parambTI + " with carac " + this + " but charac is already associated to " + this.aAB);
    this.aAB = parambTI;
  }

  public int lo() {
    return this.aAq;
  }

  public int lp() {
    return this.aAr;
  }

  public int lq() {
    return this.aAs;
  }

  public int lr() {
    return this.aAt;
  }

  public int getDefaultValue() {
    return this.aAv;
  }

  public boolean isExpandable() {
    return this.aAw;
  }

  public boolean isNegative() {
    return this.aAC;
  }

  public int ls() {
    return this.aAx;
  }

  public int lt() {
    return this.aAy;
  }

  public int lu() {
    return this.aAz;
  }

  public int lv() {
    return this.aAA;
  }

  public boolean lw() {
    return this.aAx != -1;
  }

  public boolean lx() {
    return this.aAy != -1;
  }

  public boolean ly() {
    return this.aAz != -1;
  }

  public boolean lz() {
    return this.aAA != -1;
  }

  public boolean lA() {
    return this.aAB != null;
  }

  public bTI lB() {
    return this.aAB;
  }

  public boolean lC() {
    return this.aAD;
  }

  public int lD() {
    return this.aAu;
  }

  public static eu a(Byte paramByte) {
    for (eu localeu : values()) {
      if (localeu.bJ() == paramByte.byteValue())
        return localeu;
    }
    return null;
  }

  public String bK() {
    return String.valueOf(this.hV);
  }

  public String bL() {
    return name();
  }

  public String bN() {
    return null;
  }

  static int lE()
  {
    if (aAE == -2147483648) {
      eu[] arrayOfeu1 = values();
      int i = 0;
      for (eu localeu : arrayOfeu1) {
        if (localeu.bJ() < 0)
          throw new AssertionError("Utiliser une hashMap plutôt (id <0)");
        if (localeu.bJ() > i) {
          i = localeu.bJ();
        }
      }
      if (i > arrayOfeu1.length * 1.5F)
        throw new AssertionError("Utiliser une hashMap plutôt (tableau avec trop de vide)");
      aAE = i;
    }
    return aAE;
  }
}