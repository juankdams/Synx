import java.nio.ByteBuffer;

public class dOF
{
  private int ihl;
  private int ihm;
  private int ihn;

  private dOF(int paramInt1, int paramInt2, int paramInt3)
  {
    this.ihl = paramInt1;
    this.ihm = paramInt2;
    this.ihn = paramInt3;
  }

  public int ctz() {
    return this.ihl;
  }

  public int ctA() {
    return this.ihm;
  }

  public int ctB() {
    return this.ihn;
  }

  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putInt(this.ihl);
    paramByteBuffer.putInt(this.ihm);
    paramByteBuffer.putInt(this.ihn);
  }

  public static dOF aQ(ByteBuffer paramByteBuffer) {
    return new dOF(paramByteBuffer.getInt(), paramByteBuffer.getInt(), paramByteBuffer.getInt());
  }

  public int O() {
    return 12;
  }
}