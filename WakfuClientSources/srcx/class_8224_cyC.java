public class cyC
{
  private static final cYk imY = new cYk();
  private static final cYk imZ = new cYk();
  private static final int ina = 6;

  public static boolean a(alr paramalr, dbE paramdbE, int paramInt1, int paramInt2, short paramShort)
  {
    return a(paramalr, paramdbE.LB(), paramInt1, paramInt2, paramShort, paramdbE.bo(paramInt1, paramInt2));
  }

  public static boolean a(alr paramalr1, UG paramUG, int paramInt1, int paramInt2, short paramShort, alr paramalr2)
  {
    float f = 0.8F;
    int i = (short)(int)(paramalr1.bY() * 0.8F);

    int j = 6;
    if (paramalr2 != null) {
      j = (short)(int)(paramalr2.bY() * 0.8F);
    }

    if (i >= 0) {
      imY.ac(paramalr1.fa(), paramalr1.fb(), paramalr1.fc());
      imY.dG((short)(imY.IB() + i));

      imZ.ac(paramInt1, paramInt2, paramShort);
      imZ.dG((short)(imZ.IB() + j));

      bcy localbcy = bcy.bqD();
      localbcy.a(paramUG);
      localbcy.F(imY.getX(), imY.getY(), imY.IB());
      localbcy.G(paramInt1, paramInt2, paramShort);
      if ((paramalr1 instanceof cdO))
        paramUG.e((cdO)paramalr1);
      boolean bool1 = localbcy.bqG();
      paramUG.ahO();
      if (!bool1) {
        if (j == 0) {
          localbcy.release();
          return false;
        }
        localbcy.G(imZ.getX(), imZ.getY(), imZ.IB());
        boolean bool2 = localbcy.bqG();
        if (!bool2) {
          localbcy.release();
          return false;
        }
      }

      localbcy.release();
    }
    return true;
  }
}