import java.util.Arrays;

public abstract class iH
{
  protected byte[] aID;
  protected int m_size;

  protected iH(int paramInt)
  {
    this.aID = new byte[paramInt];

    this.m_size = 0;
  }

  public boolean aV(int paramInt) {
    if (paramInt > this.aID.length) {
      byte[] arrayOfByte = this.aID;
      this.aID = new byte[paramInt];
      System.arraycopy(arrayOfByte, 0, this.aID, 0, arrayOfByte.length);
      return true;
    }

    return false;
  }

  protected final int j(byte paramByte) {
    for (int i = this.m_size - 1; i >= 0; i--) {
      if (paramByte == this.aID[i]) {
        return i;
      }
    }

    return -1;
  }

  protected final int k(byte paramByte) {
    for (int i = this.m_size - 1; i >= 0; i--) {
      if (paramByte == this.aID[i]) {
        return -i - 1;
      }
    }

    return this.m_size;
  }

  protected final void qx() {
    if (this.m_size == this.aID.length)
      aV(this.aID.length * 2);
  }

  public final boolean contains(byte paramByte)
  {
    return j(paramByte) != -1;
  }

  public final void reset()
  {
    this.m_size = 0;
  }

  public void clear() {
    this.m_size = 0;
  }

  public final int size() {
    return this.m_size;
  }

  public final byte aW(int paramInt) {
    return this.aID[paramInt];
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if ((paramObject == null) || (getClass() != paramObject.getClass())) {
      return false;
    }
    iH localiH = (iH)paramObject;

    if (this.m_size != localiH.m_size)
      return false;
    if (!Arrays.equals(this.aID, localiH.aID)) {
      return false;
    }
    return true;
  }

  public int hashCode()
  {
    int i = this.aID != null ? Arrays.hashCode(this.aID) : 0;
    i = 31 * i + this.m_size;
    return i;
  }
}