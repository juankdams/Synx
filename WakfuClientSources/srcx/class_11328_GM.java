public class GM extends kn
{
  public GM(int paramInt)
  {
    super(paramInt);
  }

  public GM() {
    super(10);
  }

  public void add(long paramLong) {
    qx();
    int i = M(paramLong);

    if (i >= 0) {
      this.aNM[i] = paramLong;
      this.m_size += 1;
    }
  }

  public boolean bB(long paramLong) {
    if (this.m_size == 0) {
      return false;
    }

    int i = L(paramLong);
    if (i < 0) {
      return false;
    }

    return eN(i);
  }

  public boolean eN(int paramInt) {
    this.aNM[paramInt] = this.aNM[(this.m_size - 1)];

    this.m_size -= 1;

    return true;
  }
}