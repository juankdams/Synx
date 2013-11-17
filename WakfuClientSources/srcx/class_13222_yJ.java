import org.apache.log4j.Logger;

public abstract class yJ
  implements bWU, eo
{
  protected static Logger K = Logger.getLogger(yJ.class);

  protected final rU bsn = new rU();

  public void aJ() {
    this.bsn.clear();
  }

  public void bc() {
    this.bsn.clear();
  }

  public boolean c(Kf paramKf)
  {
    Byte localByte = Byte.valueOf(this.bsn.A(paramKf.bJ()));

    return (localByte != null) && (localByte.byteValue() != 0);
  }

  public byte d(Kf paramKf)
  {
    Byte localByte = Byte.valueOf(this.bsn.A(paramKf.bJ()));
    if (localByte == null)
      return 0;
    return localByte.byteValue();
  }

  public void a(Kf paramKf, byte paramByte) {
    this.bsn.d(paramKf.bJ(), paramByte);
  }

  public byte e(Kf paramKf)
  {
    if (this.bsn.D(paramKf.bJ())) {
      byte b = (byte)(this.bsn.A(paramKf.bJ()) + 1);
      this.bsn.d(paramKf.bJ(), b);
      return b;
    }
    this.bsn.d(paramKf.bJ(), (byte)1);
    return 1;
  }

  public byte[] Hq()
  {
    return this.bsn.yv();
  }

  public byte f(Kf paramKf)
  {
    if (this.bsn.D(paramKf.bJ())) {
      byte b = (byte)(this.bsn.A(paramKf.bJ()) - 1);
      if (b <= 0) {
        this.bsn.B(paramKf.bJ());
        return 0;
      }
      this.bsn.d(paramKf.bJ(), b);
      return b;
    }

    return 0;
  }

  public void g(Kf paramKf)
  {
    this.bsn.B(paramKf.bJ());
  }

  public void reset()
  {
    this.bsn.clear();
  }

  public rU Hr() {
    return this.bsn;
  }

  public boolean isEmpty() {
    return this.bsn.isEmpty();
  }
}