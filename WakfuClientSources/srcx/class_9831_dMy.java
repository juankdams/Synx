public class dMy extends cde
{
  private boolean[] mcB;

  public dMy()
  {
    this(10);
  }

  public dMy(int paramInt) {
    super(paramInt);

    this.mcB = new boolean[paramInt];
  }

  public boolean aV(int paramInt)
  {
    int i = this.fcT.length;
    if (!super.aV(paramInt)) {
      return false;
    }

    boolean[] arrayOfBoolean = this.mcB;
    this.mcB = new boolean[paramInt];
    System.arraycopy(arrayOfBoolean, 0, this.mcB, 0, i);

    return true;
  }

  public void K(int paramInt, boolean paramBoolean) {
    qx();
    int i = uL(paramInt);

    if (i < 0) {
      i = -i - 1;
    }
    else {
      this.m_size += 1;
      this.fcT[i] = paramInt;
    }

    this.mcB[i] = paramBoolean;
  }

  public boolean remove(int paramInt) {
    if (this.m_size == 0) {
      return false;
    }

    int i = uK(paramInt);
    if (i < 0) {
      return false;
    }

    int j = this.mcB[i];

    this.fcT[i] = this.fcT[(this.m_size - 1)];
    this.mcB[i] = this.mcB[(this.m_size - 1)];

    this.m_size -= 1;

    return j;
  }

  public boolean get(int paramInt) {
    int i = uK(paramInt);
    if (i < 0) {
      return false;
    }

    return this.mcB[i];
  }

  public boolean CY(int paramInt) {
    return this.mcB[paramInt];
  }

  public void compact()
  {
    super.compact();
    boolean[] arrayOfBoolean = this.mcB;
    this.mcB = new boolean[this.m_size];
    System.arraycopy(arrayOfBoolean, 0, this.mcB, 0, this.m_size);
  }
}