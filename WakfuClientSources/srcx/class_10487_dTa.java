public class dTa
{
  private final cSR dYQ = new cSR();

  public static final dTa mpt = new dTa();
  static final int mpu = 1;
  static final int mpv = 2;
  static final int mpw = 3;
  static final int mpx = 4;
  static final int mpy = 5;
  static final int mpz = 6;

  public dTa()
  {
    this.dYQ.put(1, new bEJ(this));

    this.dYQ.put(2, new bEL(this));

    this.dYQ.put(3, new bEF(this));

    this.dYQ.put(4, new bEH(this));

    this.dYQ.put(5, new bER(this));

    this.dYQ.put(6, new bEQ(this));
  }

  public aZa a(int paramInt, aYQ paramaYQ)
  {
    VF localVF = (VF)this.dYQ.get(paramInt);
    return localVF.h(paramaYQ);
  }
}