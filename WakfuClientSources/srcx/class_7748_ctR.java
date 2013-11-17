public class ctR extends cde
{
  private int[] idZ;

  public ctR()
  {
    this(10);
  }

  public ctR(int paramInt) {
    super(paramInt);

    this.idZ = new int[paramInt];
  }

  public boolean aV(int paramInt)
  {
    int i = this.fcT.length;
    if (!super.aV(paramInt)) {
      return false;
    }

    int[] arrayOfInt = this.idZ;
    this.idZ = new int[paramInt];
    System.arraycopy(arrayOfInt, 0, this.idZ, 0, i);

    return true;
  }

  public void put(int paramInt1, int paramInt2) {
    qx();
    int i = uL(paramInt1);

    if (i < 0) {
      i = -i - 1;
    }
    else {
      this.m_size += 1;
      this.fcT[i] = paramInt1;
    }

    this.idZ[i] = paramInt2;
  }

  public int wH(int paramInt) {
    if (this.m_size == 0) {
      return 0;
    }

    int i = uK(paramInt);
    if (i < 0) {
      return 0;
    }

    int j = this.idZ[i];

    this.fcT[i] = this.fcT[(this.m_size - 1)];
    this.idZ[i] = this.idZ[(this.m_size - 1)];

    this.m_size -= 1;

    return j;
  }

  public int get(int paramInt) {
    int i = uK(paramInt);
    if (i < 0) {
      return 0;
    }

    return this.idZ[i];
  }

  public int wI(int paramInt) {
    return this.idZ[paramInt];
  }

  public void compact()
  {
    super.compact();

    int[] arrayOfInt = this.idZ;
    this.idZ = new int[this.m_size];
    System.arraycopy(arrayOfInt, 0, this.idZ, 0, this.m_size);
  }
}