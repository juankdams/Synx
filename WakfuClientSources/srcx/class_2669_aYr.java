import java.util.ArrayList;
import org.apache.log4j.Logger;

public final class aYr
{
  protected static final Logger K = Logger.getLogger(aYr.class);
  public static final boolean aRN = true;
  public static final int fec = 0;
  public static final int fed = 30;
  public static final int fee = 31;
  public static final int fef = 32;
  public static final int feg = 33;
  public static final aYr feh = new aYr(0, cuv.csN());

  private static csX fei = null;
  private dX fej;
  private aAY fek;
  private final aic fel;
  private bzv fem;
  private int ie;
  private final dqV fen = new dqV(this);

  private final bLR feo = new bLR(this, null);

  public static void a(csX paramcsX)
  {
    fei = paramcsX;

    feh.fej = paramcsX.i(feh);

    feh.fek = paramcsX.j(feh);

    feh.fem = paramcsX.l(feh);
  }

  public static aYr bnv()
  {
    return oq(-1);
  }

  public static aYr oq(int paramInt)
  {
    if (fei == null) {
      throw new UnsupportedOperationException("La factory de handlers de nation (NationHandlersFactory) doit être définie");
    }
    return new aYr(paramInt, fei);
  }

  private aYr(int paramInt, csX paramcsX) {
    this.fej = paramcsX.i(this);
    this.fek = paramcsX.j(this);
    this.fel = paramcsX.k(this);
    this.fem = paramcsX.l(this);
    this.ie = paramInt;
  }

  public int bP()
  {
    return this.ie;
  }

  public void dc(int paramInt)
  {
    this.ie = paramInt;
  }

  public void ir()
  {
    if (this.fej != null) {
      this.fej.ir();
    }

    if (this.fek != null) {
      this.fek.ir();
    }

    if (this.fel != null) {
      this.fel.ir();
    }

    if (this.fem != null)
      this.fem.ir();
  }

  public byte[] a(dFf paramdFf)
  {
    return this.fen.b(paramdFf);
  }

  public void f(byte[] paramArrayOfByte, int paramInt) {
    this.fen.q(paramArrayOfByte, paramInt);
  }

  public byte[] bnw() {
    return this.fen.b(dFf.lOD);
  }

  public byte[] bnx() {
    return this.fen.b(dFf.lOT);
  }

  public hk a(bYR parambYR)
  {
    switch (dwz.lBX[parambYR.ordinal()]) {
    case 1:
      return bny();
    case 2:
      return aNe();
    case 3:
      return aNf();
    case 4:
      return aNg();
    case 5:
      return bnL();
    case 6:
      return auW();
    case 7:
      return aNh();
    case 8:
      return bnE();
    case 9:
      return bnF();
    case 10:
      return aNi();
    case 11:
      return aNj();
    case 12:
      return bnK();
    case 13:
      return aNk();
    case 14:
      return aNm();
    case 15:
      return aNn();
    case 16:
      return aNl();
    }
    return hk.aGx;
  }

  hk aNe()
  {
    if (this.fek != null) {
      return this.fek.aNe();
    }
    return hk.aGx;
  }

  hk aNf()
  {
    if (this.fek != null) {
      return this.fek.aNf();
    }
    return hk.aGx;
  }

  hk aNg() {
    if (this.fek != null) {
      return this.fek.aNg();
    }
    return hk.aGx;
  }

  hk auW()
  {
    if (this.fel != null) {
      return this.fel.auW();
    }
    return hk.aGx;
  }

  hk aNh()
  {
    if (this.fek != null) {
      return this.fek.aNh();
    }
    return hk.aGx;
  }

  bLR bny()
  {
    return this.feo;
  }

  public String toString()
  {
    return "{Nation id=" + this.ie + "}";
  }

  public void a(short paramShort1, short paramShort2, int paramInt1, int paramInt2)
  {
    if (this.fem != null)
      this.fem.b(paramShort1, paramShort2, paramInt1, paramInt2);
  }

  public cWY bnz()
  {
    if (this.fem != null) {
      return this.fem.bnz();
    }
    throw new UnsupportedOperationException();
  }

  public short bnA() {
    if (this.fem != null) {
      return this.fem.bnA();
    }
    throw new UnsupportedOperationException();
  }

  public short bnB() {
    if (this.fem != null) {
      return this.fem.bnB();
    }
    throw new UnsupportedOperationException();
  }

  public int bnC() {
    if (this.fem != null) {
      return this.fem.bnC();
    }
    throw new UnsupportedOperationException();
  }

  public int bnD() {
    if (this.fem != null) {
      return this.fem.bnD();
    }
    throw new UnsupportedOperationException();
  }

  public void eR(long paramLong) {
    if (this.fem != null)
      this.fem.eR(paramLong);
    else
      throw new UnsupportedOperationException();
  }

  public void eS(long paramLong)
  {
    if (this.fem != null)
      this.fem.eS(paramLong);
    else
      throw new UnsupportedOperationException();
  }

  hk bnE()
  {
    if (this.fem != null) {
      return this.fem.bIj();
    }
    return hk.aGx;
  }

  hk bnF() {
    if (this.fem != null) {
      return this.fem.bIk();
    }
    return hk.aGx;
  }

  public void a(cKY paramcKY)
  {
    if (this.fem == null) {
      return;
    }
    this.fem.c(paramcKY);
  }

  public void b(cKY paramcKY)
  {
    if (this.fem == null) {
      return;
    }
    this.fem.d(paramcKY);
  }

  public void c(bXV parambXV)
  {
    if (this.fek == null) {
      return;
    }
    this.fek.a(parambXV);
  }

  public void d(bXV parambXV)
  {
    if (this.fek == null) {
      return;
    }
    this.fek.b(parambXV);
  }

  public void a(cds paramcds1, cds paramcds2) {
    if (this.fek != null)
      this.fek.a(paramcds1, paramcds2);
  }

  public void a(dxL paramdxL, cds paramcds, boolean paramBoolean)
  {
    if (this.fek != null)
      this.fek.a(paramdxL, paramcds, paramBoolean);
  }

  public boolean bnG()
  {
    return (this.fek != null) && (this.fek.aMR());
  }

  public boolean bnH() {
    return (this.fek != null) && (this.fek.aMS());
  }

  public void F(dxL paramdxL)
  {
    if (this.fek != null)
      this.fek.s(paramdxL);
  }

  public boolean aMX()
  {
    return (this.fek != null) && (this.fek.aMX());
  }

  public boolean dD(long paramLong) {
    return (this.fek != null) && (this.fek.dD(paramLong));
  }

  public dxL aMT() {
    if (this.fek != null) {
      return this.fek.aMT();
    }
    return null;
  }

  public cds aMV() {
    if (this.fek != null) {
      return this.fek.aMV();
    }
    return null;
  }

  public cds bnI() {
    if (this.fek != null) {
      return this.fek.aMW();
    }
    return null;
  }

  public boolean dG(long paramLong) {
    return (this.fek != null) && (this.fek.dG(paramLong));
  }

  public Qy dH(long paramLong) {
    if (this.fek != null) {
      return this.fek.dH(paramLong);
    }
    return null;
  }

  public cHu bnJ() {
    if (this.fek != null) {
      return this.fek.aNa();
    }
    return aAY.dUf;
  }

  public int abA() {
    if (this.fek != null) {
      return this.fek.abA();
    }
    return 0;
  }

  public int aNb() {
    if (this.fek != null) {
      return this.fek.aNb();
    }
    return 0;
  }

  public void b(int paramInt1, int paramInt2, ArrayList paramArrayList) {
    if (this.fek != null)
      this.fek.b(paramInt1, paramInt2, paramArrayList);
  }

  public void C(ArrayList paramArrayList)
  {
    if (this.fek != null)
      this.fek.C(paramArrayList);
  }

  public void bz(int paramInt1, int paramInt2)
  {
    if (this.fek != null)
      this.fek.bz(paramInt1, paramInt2);
  }

  public void b(dey paramdey)
  {
    if (this.fek != null)
      this.fek.a(paramdey);
  }

  public void g(long paramLong, String paramString)
  {
    if (this.fek != null)
      this.fek.d(paramLong, paramString);
  }

  public void c(long paramLong, Qy paramQy)
  {
    if (this.fek != null)
      this.fek.a(paramLong, paramQy);
  }

  public void a(Qy paramQy)
  {
    if (this.fek != null)
      this.fek.b(paramQy.getId(), paramQy);
  }

  public void a(deS paramdeS)
  {
    if (this.fek != null)
      this.fek.a(paramdeS);
  }

  public void a(long paramLong1, byte paramByte, long paramLong2)
  {
    if (this.fek != null)
      this.fek.a(paramLong1, paramByte, paramLong2);
  }

  public void a(Yp paramYp1, Yp paramYp2, cuX paramcuX)
  {
    if (this.fek != null)
      this.fek.a(paramYp1, paramYp2, paramcuX);
  }

  public void h(aYr paramaYr)
  {
    if (this.fek != null)
      this.fek.h(paramaYr);
  }

  public bMX aNc()
  {
    return this.fek != null ? this.fek.aNc() : aAY.dUg;
  }

  public cjH aNd()
  {
    return this.fek != null ? this.fek.aNd() : null;
  }

  public n aMO() {
    return this.fek != null ? this.fek.aMO() : null;
  }

  public aoK aMP() {
    return this.fek != null ? this.fek.aMP() : null;
  }

  public dPE aMQ() {
    return this.fek != null ? this.fek.aMQ() : null;
  }

  public void eT(long paramLong)
  {
    if (this.fek != null)
      this.fek.dB(paramLong);
  }

  public void eU(long paramLong)
  {
    if (this.fek != null)
      this.fek.dC(paramLong);
  }

  public void t(long paramLong1, long paramLong2)
  {
    if (this.fek != null)
      this.fek.t(paramLong1, paramLong2);
  }

  public int aMN()
  {
    if (this.fek != null) {
      return this.fek.aMN();
    }
    return 2147483647;
  }

  public void aMZ() {
    if (this.fek != null)
      this.fek.clear();
  }

  hk aNi()
  {
    return this.fek != null ? this.fek.aNi() : hk.aGx;
  }

  hk aNj() {
    return this.fek != null ? this.fek.aNj() : hk.aGx;
  }

  hk aNk() {
    return this.fek != null ? this.fek.aNk() : hk.aGx;
  }

  hk aNl() {
    return this.fek != null ? this.fek.aNl() : hk.aGx;
  }

  hk aNm() {
    return this.fek != null ? this.fek.aNm() : hk.aGx;
  }

  hk aNn() {
    return this.fek != null ? this.fek.aNn() : hk.aGx;
  }

  hk bnK() {
    return this.fek != null ? this.fek.aNo() : hk.aGx;
  }

  hk bnL() {
    return this.fek != null ? this.fek.aNp() : hk.aGx;
  }

  public int is()
  {
    return this.fej.is();
  }

  public boolean c(cTK paramcTK) {
    return (this.fej != null) && (this.fej.c(paramcTK));
  }

  public void c(qT paramqT)
  {
    if (this.fej == null) {
      return;
    }
    this.fej.a(paramqT);
  }

  public void d(qT paramqT)
  {
    if (this.fej == null) {
      return;
    }
    this.fej.b(paramqT);
  }

  public void eV(long paramLong) {
    if (this.fej != null)
      this.fej.q(paramLong);
  }

  public cTK o(long paramLong)
  {
    if (this.fej == null) {
      return null;
    }
    return this.fej.o(paramLong);
  }

  public void e(cTK paramcTK)
  {
    if (this.fej != null)
      this.fej.e(paramcTK);
  }

  public void d(cTK paramcTK)
  {
    if (this.fej != null)
      this.fej.d(paramcTK);
  }

  public void p(long paramLong)
  {
    if (this.fej != null)
      this.fej.p(paramLong);
  }

  public void a(long paramLong, dLC paramdLC)
  {
    if (this.fej != null)
      this.fej.a(paramLong, paramdLC);
  }

  public void b(long paramLong, dLC paramdLC)
  {
    if (this.fej != null)
      this.fej.b(paramLong, paramdLC);
  }

  public boolean g(cTK paramcTK)
  {
    if (this.fej != null) {
      return this.fej.g(paramcTK);
    }
    throw new UnsupportedOperationException();
  }

  public void j(cTK paramcTK)
  {
    if (this.fej != null)
      this.fej.f(paramcTK);
  }

  public void a(dGy paramdGy)
  {
    if (this.fej != null)
      this.fej.a(paramdGy);
  }

  public void c(cUq paramcUq)
  {
    if (this.fel == null) {
      return;
    }
    this.fel.a(paramcUq);
  }

  public void d(cUq paramcUq)
  {
    if (this.fel == null) {
      return;
    }
    this.fel.b(paramcUq);
  }

  public void b(int paramInt, int[] paramArrayOfInt)
  {
    if (this.fel == null) {
      return;
    }
    this.fel.b(paramInt, paramArrayOfInt);
  }

  public void d(int paramInt, int[] paramArrayOfInt)
  {
    if (this.fel == null) {
      return;
    }
    this.fel.d(paramInt, paramArrayOfInt);
  }

  public void iw(int paramInt)
  {
    if (this.fel == null) {
      return;
    }
    this.fel.iw(paramInt);
  }

  public void c(int paramInt, int[] paramArrayOfInt)
  {
    if (this.fel == null) {
      return;
    }
    this.fel.c(paramInt, paramArrayOfInt);
  }

  public crV ix(int paramInt)
  {
    if (this.fel == null) {
      return null;
    }
    return this.fel.ix(paramInt);
  }

  public crV auU()
  {
    if (this.fel == null) {
      return null;
    }
    return this.fel.auU();
  }

  public void lz(int paramInt) {
    if (this.fek == null) {
      return;
    }

    this.fek.lz(paramInt);
  }

  static
  {
    dsh.luB.s(feh);
  }
}