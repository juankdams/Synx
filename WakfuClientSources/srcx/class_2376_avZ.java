public enum avZ
{
  public static final int dLf = 5;
  private int m_index;
  private double dLg;

  private avZ(int arg3, double arg4)
  {
    int i;
    this.m_index = i;
    Object localObject;
    this.dLg = localObject;
  }

  public int getIndex() {
    return this.m_index;
  }

  public double getValue() {
    return this.dLg;
  }

  public static avZ kE(int paramInt) {
    switch (paramInt) {
    case 0:
      return dLa;
    case 1:
      return dLb;
    case 2:
      return dLc;
    case 3:
      return dLd;
    case 4:
      return dLe;
    }

    return dLa;
  }
}