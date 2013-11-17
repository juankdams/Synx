import java.util.Comparator;

final class dnM
  implements Comparator
{
  private final int bdj;
  private final dDe gHu;

  dnM(int paramInt, dDe paramdDe)
  {
    this.bdj = paramInt;
    this.gHu = paramdDe;
  }

  public int f(dhJ paramdhJ1, dhJ paramdhJ2) {
    if (this.gHu.fc(paramdhJ1.getId()) > this.gHu.fc(paramdhJ2.getId()))
      return -1;
    if (this.gHu.fc(paramdhJ1.getId()) < this.gHu.fc(paramdhJ2.getId()))
      return 1;
    if (paramdhJ1.nU() > paramdhJ2.nU())
      return -1;
    if (paramdhJ1.nU() < paramdhJ2.nU()) {
      return 1;
    }
    int i = Integer.valueOf(jN(paramdhJ1.getId())).compareTo(Integer.valueOf(jN(paramdhJ2.getId())));
    if (i != 0) {
      return i;
    }
    return Long.valueOf(paramdhJ1.getId()).compareTo(Long.valueOf(paramdhJ2.getId()));
  }

  private int jN(long paramLong) {
    int i = (int)(paramLong + this.bdj + this.gHu.fc(paramLong) & 0xFFFF);
    int j = i * i;
    return j & 0xFF ^ j >> 16 & 0xFF00;
  }
}