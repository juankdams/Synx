import org.apache.log4j.Logger;

public class dKQ extends cWG
{
  private static final aee bx = new bOO(new dpU());
  public static final int ID = -2147483648;
  private long aPT;
  private int iwz;
  private long aFb;

  public static dKQ djF()
  {
    try
    {
      dKQ localdKQ = (dKQ)bx.Mm();
      localdKQ.a(bx);
      return localdKQ;
    } catch (Exception localException) {
      K.error(bBd.g(localException));
    }return new dKQ();
  }

  private dKQ()
  {
    this.iwz = 0;
  }

  public long czk() {
    return this.aPT;
  }

  public void ih(long paramLong) {
    this.aPT = paramLong;
  }

  public void xv(int paramInt) {
    this.iwz = paramInt;
  }

  public int czj() {
    return this.iwz;
  }

  public byte[] encode() {
    return null;
  }

  public boolean a(byte[] paramArrayOfByte) {
    return true;
  }

  public int getId() {
    return -2147483648;
  }

  public void d(int paramInt) {
  }

  public void aJ() {
  }

  public void bc() {
  }

  public long getTimeStamp() {
    return this.aFb;
  }

  public void setTimeStamp(long paramLong) {
    this.aFb = paramLong;
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder("ClockMessage clockId=").append(this.aPT).append(", subClockId=").append(this.iwz).append(", timestamp=").append(this.aFb);
    return localStringBuilder.toString();
  }
}