public class dyR extends bjo
{
  public boolean aB(dhJ paramdhJ)
  {
    return false;
  }

  public XB aC(dhJ paramdhJ)
  {
    return null;
  }

  public SB aD(dhJ paramdhJ)
  {
    return (SB)paramdhJ.aJp();
  }

  public int getDate()
  {
    if (!dDE.dft().isSynchronized()) {
      return 0;
    }
    dxL localdxL = dDE.dft().VN();
    return localdxL.getYear() * 10000 + localdxL.getMonth() * 100 + localdxL.getDay();
  }

  public int getHour()
  {
    if (!dDE.dft().isSynchronized()) {
      return 0;
    }
    dxL localdxL = dDE.dft().VN();
    return localdxL.getHours() * 100 + localdxL.getMinutes();
  }

  public cYk aE(dhJ paramdhJ)
  {
    return paramdhJ.ML();
  }

  public int b(dhJ paramdhJ, long paramLong)
  {
    return 0;
  }

  public byte aF(dhJ paramdhJ)
  {
    return paramdhJ.xK();
  }

  public dfy aG(dhJ paramdhJ)
  {
    return null;
  }

  public avZ aH(dhJ paramdhJ)
  {
    return avZ.dLb;
  }

  public int c(dhJ paramdhJ, long paramLong)
  {
    return 15;
  }

  public int d(dhJ paramdhJ, long paramLong)
  {
    return 0;
  }

  public int e(dhJ paramdhJ, long paramLong)
  {
    return 15;
  }

  public int f(dhJ paramdhJ, long paramLong)
  {
    return 0;
  }

  public cKT aI(dhJ paramdhJ)
  {
    return null;
  }

  public dhJ fB(long paramLong) {
    return CA.Lv().bj(paramLong);
  }
}