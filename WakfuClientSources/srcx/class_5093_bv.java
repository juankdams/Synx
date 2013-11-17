import org.apache.log4j.Logger;

public abstract class bv extends cSx
{
  private static Logger K = Logger.getLogger(bv.class);
  protected int kr;

  public int getModifiers()
  {
    return this.kr;
  }

  public void setModifiers(int paramInt)
  {
    this.kr = paramInt;
  }

  public boolean ex() {
    return (this.kr & 0x80) == 128;
  }

  public boolean ey() {
    return (this.kr & 0x200) == 512;
  }

  public boolean ez() {
    return (this.kr & 0x2000) == 8192;
  }

  public boolean eA() {
    return (this.kr & 0x40) == 64;
  }

  public boolean eB() {
    return (this.kr & 0x100) == 256;
  }

  public void bc()
  {
    super.bc();
    this.kr = 0;
  }
}