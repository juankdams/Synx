import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class ty
{
  private static final ty bei = new ty();
  private ByteBuffer bej;
  private final dFu aXq = new dFu();
  private ckq bek;
  private final cSR bel = new cSR();

  public static ty BI() {
    return bei;
  }

  public void a(String paramString, ckq paramckq)
  {
    this.bek = paramckq;
    setFileName(paramString);
  }

  private void setFileName(String paramString) {
    this.bej = aF(paramString);
    BJ();
  }

  private void BJ() {
    this.bej.position(0);
    this.aXq.clear();
    this.bel.clear();
    int i = this.bej.getInt();
    for (int j = 0; j < i; j++) {
      int k = this.bej.getInt();
      int m = this.bej.getInt();
      this.aXq.fg(k, m);
    }
  }

  public final bfh cU(int paramInt)
  {
    try {
      g(new int[] { paramInt });
    }
    catch (Exception localException) {
    }
    return (bfh)this.bel.get(paramInt);
  }

  public final void g(int[] paramArrayOfInt) {
    this.bel.clear();
    for (int k : paramArrayOfInt)
      this.bel.put(k, f(this.bej, k));
  }

  public final void BK()
  {
    g(this.aXq.qe());
  }

  private bfh f(ByteBuffer paramByteBuffer, int paramInt) {
    int i = this.aXq.get(paramInt);
    if (i > 0) {
      paramByteBuffer.position(i);
      bfh localbfh = new bfh(paramInt);
      localbfh.a(paramByteBuffer, this.bek);
      return localbfh;
    }
    return null;
  }

  public void a(ckq paramckq, ByteBuffer paramByteBuffer)
  {
    this.bek = paramckq;
    this.bej = paramByteBuffer;
    BJ();
    g(this.aXq.qe());
  }

  private ByteBuffer aF(String paramString) {
    byte[] arrayOfByte = dtb.readFile(paramString);
    ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte);
    localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    return localByteBuffer;
  }

  public final int xy() {
    return this.aXq.size();
  }

  public final int BL() {
    return this.bel.size();
  }

  public final void a(int paramInt, ByteBuffer paramByteBuffer, ckq paramckq) {
    bfh localbfh = (bfh)this.bel.get(paramInt);
    if (localbfh != null)
      localbfh.a(paramByteBuffer, paramckq);
  }
}