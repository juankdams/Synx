import org.apache.log4j.Logger;

public abstract class BX
{
  private static final Logger K = Logger.getLogger(BX.class);
  public static final int bEm = -6;
  private static final int bEn = 4;
  private static final int bEo = 4;
  protected final short az;
  private int bEp;
  private int bEq;
  private int ia;
  private int ib;
  private short[][] bEr;
  private final aoL bEs = new aoL();
  private final aom bEt = new aom(this.bEs);

  protected BX(short paramShort, int paramInt1, int paramInt2) {
    this.az = paramShort;
    c(0, 0, paramInt1, paramInt2);
    B((short)0);
  }

  protected BX(short paramShort) {
    this(paramShort, 4, 4);
  }

  protected BX(BX paramBX) {
    this.az = paramBX.az;
    this.bEp = paramBX.bEp;
    this.bEq = paramBX.bEq;
    this.ia = paramBX.ia;
    this.ib = paramBX.ib;

    this.bEr = ((short[][])paramBX.bEr.clone());
    int i = 0; for (int j = paramBX.bEr.length; i < j; i++) {
      this.bEr[i] = ((short[])paramBX.bEr[i].clone());
    }

    this.bEs.e(paramBX.bEs);
    this.bEt.aAB();
  }

  public boolean Q(int paramInt1, int paramInt2) {
    return KT().contains(paramInt1, paramInt2);
  }

  public dQx KT() {
    return new dQx(KU() + 2, KW() - 2, KV() + 2, KX() - 8);
  }

  public final int KU() {
    return this.bEp;
  }

  public final int KV() {
    return this.bEq;
  }

  public final int getWidth() {
    return this.ia;
  }

  public final int getHeight() {
    return this.ib;
  }

  public final int KW() {
    return this.bEp + this.ia - 1;
  }

  public final int KX() {
    return this.bEq + this.ib - 1;
  }

  public final void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = ej(paramInt3);
    int j = ek(paramInt4);

    this.bEr = new short[i][j];

    this.ia = i;
    this.ib = j;
    this.bEp = ej(paramInt1);
    this.bEq = ek(paramInt2);
  }

  protected final short[][] KY() {
    short[][] arrayOfShort = new short[this.ia][];
    for (int i = 0; i < this.ia; i++) {
      arrayOfShort[i] = ((short[])this.bEr[i].clone());
    }
    return arrayOfShort;
  }

  protected final void B(short paramShort) {
    for (int i = 0; i < this.ia; i++)
      for (int j = 0; j < this.ib; j++)
        this.bEr[i][j] = paramShort;
  }

  public dCl e(short paramShort1, short paramShort2)
  {
    dCl localdCl = new dCl(paramShort1, paramShort2);
    a(paramShort1, paramShort2, localdCl);
    return localdCl;
  }

  protected final void a(short paramShort1, short paramShort2, cFC paramcFC) {
    int i = ej(paramShort1);
    int j = ek(paramShort2);

    paramcFC.a(S(i, j), S(i + 1, j), S(i, j + 1), S(i + 1, j + 1));

    b(paramShort1, paramShort2, paramcFC);
  }

  public void b(short paramShort1, short paramShort2, cFC paramcFC) {
    paramcFC.a(this.bEt.g(paramShort1, paramShort2));
  }

  public final boolean f(short paramShort1, short paramShort2) {
    int i = ej(paramShort1);
    int j = ek(paramShort2);

    if ((i < KU()) || (i > KW()) || (j < KV()) || (j > KX()))
    {
      return false;
    }

    return (R(i, j) != bnp.fGg) || (R(i + 1, j) != bnp.fGg) || (R(i, j + 1) != bnp.fGg) || (R(i + 1, j + 1) != bnp.fGg);
  }

  public final void j(int paramInt1, int paramInt2, short paramShort)
  {
    this.bEr[(paramInt1 - this.bEp)][(paramInt2 - this.bEq)] = paramShort;
  }

  public short R(int paramInt1, int paramInt2) {
    return this.bEr[(paramInt1 - this.bEp)][(paramInt2 - this.bEq)];
  }

  public void a(short paramShort1, short paramShort2, short paramShort3, short paramShort4, short paramShort5, short paramShort6) {
    int i = ej(paramShort1);
    int j = ek(paramShort2);

    j(i, j, paramShort3);
    j(i + 1, j, paramShort4);
    j(i, j + 1, paramShort5);
    j(i + 1, j + 1, paramShort6);
  }

  protected final bnp S(int paramInt1, int paramInt2) {
    int i = R(paramInt1, paramInt2);
    return i == bnp.fGg ? null : ee(i);
  }

  public abstract bnp ee(int paramInt);

  public short D() {
    return this.az;
  }

  public void b(aXL paramaXL) {
    bh(paramaXL.gv());
    this.bEs.put(paramaXL.gv(), paramaXL);
    this.bEt.aAB();
  }

  public aXL bh(long paramLong) {
    aXL localaXL = (aXL)this.bEs.remove(paramLong);
    if (localaXL != null) {
      this.bEt.aAB();
    }
    return localaXL;
  }

  public static short ef(int paramInt) {
    int i = bCO.bD(paramInt / 9.0F);
    return bCO.go(i);
  }

  public static short eg(int paramInt) {
    int i = bCO.bD(paramInt / 9.0F);
    return bCO.go(i);
  }

  public static short eh(int paramInt) {
    int i = bCO.bD(paramInt / 2.0F);
    return bCO.go(i);
  }

  public static short ei(int paramInt) {
    int i = bCO.bD(paramInt / 2.0F);
    return bCO.go(i);
  }

  public static short ej(int paramInt) {
    int i = paramInt * 2;
    return bCO.go(i);
  }

  public static short ek(int paramInt) {
    int i = paramInt * 2;
    return bCO.go(i);
  }

  public static short el(int paramInt) {
    return ej(paramInt);
  }

  public static short em(int paramInt) {
    return ek(paramInt);
  }

  public static short en(int paramInt) {
    int i = ej(paramInt) + 1;
    return bCO.go(i);
  }

  public static short eo(int paramInt) {
    return ek(paramInt);
  }

  public static short ep(int paramInt) {
    return ej(paramInt);
  }

  public static short eq(int paramInt) {
    int i = ek(paramInt) + 1;
    return bCO.go(i);
  }

  public static short er(int paramInt) {
    int i = ej(paramInt) + 1;
    return bCO.go(i);
  }

  public static short es(int paramInt) {
    int i = ek(paramInt) + 1;
    return bCO.go(i);
  }

  public aXL[] g(short paramShort1, short paramShort2) {
    return this.bEt.g(paramShort1, paramShort2);
  }

  public boolean e(dGy paramdGy) {
    return this.bEs.s(paramdGy);
  }

  public abstract BX KZ();

  public aXL d(long paramLong, int paramInt) {
    aXL localaXL = (aXL)this.bEs.get(paramLong);
    if (localaXL == null) {
      K.error("le batiment " + paramLong + " n'existe pas");
      return null;
    }
    localaXL.ab(paramInt);
    return localaXL;
  }

  public int La() {
    return 250000;
  }
}