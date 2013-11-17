import java.nio.ByteBuffer;

public class aDE extends aRw
{
  private int dYD;
  private int dYE;
  private float aFm;
  private short TD;

  public void setLocation(int paramInt1, int paramInt2)
  {
    this.dYD = paramInt1;
    this.dYE = paramInt2;
  }

  public void c(float paramFloat) {
    this.aFm = paramFloat;
  }

  public byte[] encode() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(14);
    localByteBuffer.putShort(this.TD);
    localByteBuffer.putInt(this.dYD);
    localByteBuffer.putInt(this.dYE);
    localByteBuffer.putFloat(this.aFm);
    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 9401;
  }

  public void Y(short paramShort) {
    this.TD = paramShort;
  }
}