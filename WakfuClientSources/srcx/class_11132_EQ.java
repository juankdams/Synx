public class EQ extends cde
{
  public EQ(int paramInt)
  {
    super(paramInt);
  }

  public EQ() {
    super(10);
  }

  public void add(int paramInt) {
    qx();
    int i = uL(paramInt);

    if (i >= 0) {
      this.m_size += 1;
      this.fcT[i] = paramInt;
    }
  }

  public boolean remove(int paramInt) {
    if (this.m_size == 0) {
      return false;
    }

    int i = uK(paramInt);
    if (i < 0) {
      return false;
    }

    this.fcT[i] = this.fcT[(this.m_size - 1)];

    this.m_size -= 1;

    return true;
  }
}