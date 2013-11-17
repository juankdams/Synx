public abstract class cGB
{
  public static final cGB iBL = new aKl();

  public abstract boolean a(dhJ paramdhJ, bor parambor);

  protected abstract String name();

  public String toString()
  {
    return name();
  }

  public static cGB eh(byte paramByte)
  {
    return new dMV(paramByte);
  }

  public static cGB cBz()
  {
    return new dMY();
  }

  public static cGB cBA()
  {
    return new dMZ();
  }

  public static cGB cBB()
  {
    return new dNc();
  }

  public static cGB cBC()
  {
    return new dNd();
  }

  public static cGB iw(long paramLong)
  {
    return new dNe(paramLong);
  }

  public static cGB ei(byte paramByte)
  {
    return new dNf(paramByte);
  }

  public static cGB ej(byte paramByte)
  {
    return new dNi(paramByte);
  }

  public static cGB l(Kf paramKf)
  {
    return new dNk(paramKf);
  }

  public static cGB cBD()
  {
    return new aLH();
  }

  public static cGB cBE()
  {
    return new aLG();
  }

  public static cGB cBF()
  {
    return new aLF();
  }

  public static cGB aS(dhJ paramdhJ)
  {
    if (paramdhJ == null) {
      return iBL;
    }
    return new aJY(paramdhJ);
  }

  public static cGB ek(byte paramByte)
  {
    return new aJX(paramByte);
  }

  public static cGB aT(dhJ paramdhJ)
  {
    if (paramdhJ == null) {
      return iBL;
    }
    return new aKa(paramdhJ);
  }

  public static cGB c(cGB[] paramArrayOfcGB)
  {
    return new aJZ(paramArrayOfcGB);
  }

  public static cGB d(cGB[] paramArrayOfcGB)
  {
    return new aKc(paramArrayOfcGB);
  }

  public static cGB a(cGB paramcGB)
  {
    return new aKb(paramcGB);
  }

  public static cGB cBG()
  {
    return new aKf();
  }
}