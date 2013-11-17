import java.nio.ByteBuffer;
import java.text.MessageFormat;

public class bvk
  implements Comparable
{
  private long aXW;
  private int gfd;
  private short bdn;
  private boolean gfe;
  private static final bvk gff = new bvk(0L, 0, (short)-1, false);

  public bvk()
  {
  }

  public bvk(long paramLong, int paramInt, short paramShort, boolean paramBoolean) {
    this.gfe = paramBoolean;
    this.aXW = paramLong;
    this.gfd = paramInt;
    this.bdn = paramShort;
  }

  public bvk(bvk parambvk) {
    this(parambvk.aXW, parambvk.gfd, parambvk.bdn, parambvk.gfe);
  }

  public static bvk bCS() {
    return gff;
  }

  public boolean isInfinite() {
    return this.bdn < 0;
  }

  public long AD() {
    return this.aXW;
  }

  public boolean bCT() {
    return this.gfe;
  }

  public short bCU() {
    return this.bdn;
  }

  public void setPosition(int paramInt) {
    this.gfd = paramInt;
  }

  public int getPosition() {
    return this.gfd;
  }

  public static bvk gf(long paramLong)
  {
    bvk localbvk = new bvk();
    localbvk.aXW = paramLong;
    return localbvk;
  }

  public bvk rg(int paramInt) {
    this.bdn = ((short)paramInt);
    return this;
  }

  public bvk fs(boolean paramBoolean) {
    this.gfe = paramBoolean;
    return this;
  }

  public static int O()
  {
    return 11;
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putLong(this.aXW);
    paramByteBuffer.putShort(this.bdn);
    paramByteBuffer.put((byte)(this.gfe ? 1 : 0));
  }

  public static bvk ay(ByteBuffer paramByteBuffer) {
    bvk localbvk = new bvk();
    localbvk.read(paramByteBuffer);
    return localbvk;
  }

  void read(ByteBuffer paramByteBuffer) {
    this.aXW = paramByteBuffer.getLong();
    this.bdn = paramByteBuffer.getShort();
    this.gfe = (paramByteBuffer.get() == 1);
  }

  public String toString()
  {
    return MessageFormat.format("@T{0}{2}({1})", new Object[] { Short.valueOf(this.bdn), Long.valueOf(this.aXW), this.gfe ? "+" : "-" });
  }

  public int b(bvk parambvk) {
    if (this == parambvk) {
      return 0;
    }
    if (bCV()) {
      return -1;
    }
    if ((parambvk == null) || (parambvk.bCV())) {
      return 1;
    }
    if (parambvk.aXW != this.aXW)
    {
      return 0;
    }

    int i = Integer.signum(this.bdn - parambvk.bdn);
    if (i != 0)
      return i;
    return (this.gfe ? 1 : 0) - (parambvk.gfe ? 1 : 0);
  }

  public boolean bCV() {
    return (bCU() == gff.bCU()) && (AD() == gff.AD()) && (bCT() == gff.bCT());
  }
}