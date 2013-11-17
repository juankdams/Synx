import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public abstract class cCH
{
  protected static final Logger K = Logger.getLogger(cCH.class);
  private static final int ivg = 32;
  private bTZ ivh;
  protected boolean dvk = false;

  public static final cCH ivi = new gI();
  private final int ivj;

  public cCH()
  {
    this.ivj = 32;
  }

  public cCH(int paramInt) {
    this.ivj = paramInt;
  }

  public bTZ cyO() {
    return this.ivh;
  }

  public void a(bTZ parambTZ) {
    this.ivh = parambTZ;
  }

  protected void clear() {
    this.dvk = false;
  }

  public void cyP() {
    if (this.ivh != null)
      this.ivh.aS();
  }

  public void Ho()
  {
    if (this.ivh != null)
      this.ivh.aT();
  }

  protected void cyQ()
  {
    this.dvk = false;
  }

  protected void nc(String paramString) {
    K.error(paramString);
    this.dvk = true;
  }

  protected void a(String paramString, Exception paramException) {
    K.error(paramString, paramException);
    this.dvk = true;
  }

  public boolean hasError() {
    return this.dvk;
  }

  void clearError() {
    this.dvk = false;
  }

  public int cc()
  {
    return this.ivj;
  }

  public abstract void b(ByteBuffer paramByteBuffer);

  public abstract void a(ByteBuffer paramByteBuffer, int paramInt);
}