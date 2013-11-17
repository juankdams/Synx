public class DJ extends cde
{
  private short[] bIB;

  public DJ()
  {
    this(10);
  }

  public DJ(int paramInt) {
    super(paramInt);

    this.bIB = new short[paramInt];
  }

  public boolean aV(int paramInt)
  {
    int i = this.fcT.length;
    if (!super.aV(paramInt)) {
      return false;
    }

    short[] arrayOfShort = this.bIB;
    this.bIB = new short[paramInt];
    System.arraycopy(arrayOfShort, 0, this.bIB, 0, i);

    return true;
  }

  public void i(int paramInt, short paramShort) {
    qx();
    int i = uL(paramInt);

    if (i < 0) {
      i = -i - 1;
    }
    else {
      this.m_size += 1;
      this.fcT[i] = paramInt;
    }

    this.bIB[i] = paramShort;
  }

  public short aP(int paramInt) {
    if (this.m_size == 0) {
      return 0;
    }

    int i = uK(paramInt);
    if (i < 0) {
      return 0;
    }

    short s = this.bIB[i];

    this.fcT[i] = this.fcT[(this.m_size - 1)];
    this.bIB[i] = this.bIB[(this.m_size - 1)];

    this.m_size -= 1;

    return s;
  }

  public short get(int paramInt) {
    int i = uK(paramInt);
    if (i < 0) {
      return 0;
    }

    return this.bIB[i];
  }

  public short eF(int paramInt) {
    return this.bIB[paramInt];
  }

  public void compact()
  {
    super.compact();

    short[] arrayOfShort = this.bIB;
    this.bIB = new short[this.m_size];
    System.arraycopy(arrayOfShort, 0, this.bIB, 0, this.m_size);
  }
}