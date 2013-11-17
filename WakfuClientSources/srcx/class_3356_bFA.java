import java.nio.ByteBuffer;

public class bFA extends aXL
{
  private static int gAH = 0;
  private int gAI;

  public bFA(long paramLong, int paramInt1, int paramInt2, short paramShort1, short paramShort2)
  {
    super(dks.lhB, paramLong, paramInt1, paramInt2, paramShort1, paramShort2);
  }

  public bFA(cuF paramcuF) {
    super(dks.lhB, paramcuF);
  }

  public bFA(short paramShort, int paramInt1, int paramInt2) {
    this(--gAH, paramShort, 0, (short)paramInt1, (short)paramInt2);
  }

  public int getLayer() {
    return this.gAI;
  }

  public void setLayer(int paramInt) {
    this.gAI = paramInt;
  }

  public static aXL az(ByteBuffer paramByteBuffer) {
    long l = paramByteBuffer.getLong();
    int i = paramByteBuffer.getShort();
    int j = paramByteBuffer.getInt();
    short s1 = paramByteBuffer.getShort();
    short s2 = paramByteBuffer.getShort();

    return new bFA(l, i, j, s1, s2);
  }
}