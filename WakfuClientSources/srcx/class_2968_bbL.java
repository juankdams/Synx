import java.nio.ByteBuffer;

class bbL
{
  final dIN fkX;
  final bvk fkY;

  public bvk bqi()
  {
    return this.fkY;
  }

  public dIN bqj() {
    return this.fkX;
  }

  public int O()
  {
    return this.fkX.O() + 2 + 1;
  }

  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putShort(this.fkY.bCU());
    paramByteBuffer.put((byte)(this.fkY.bCT() ? 1 : 0));
    this.fkX.b(paramByteBuffer);
  }

  public static bbL a(ahy paramahy, long paramLong, ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort();
    boolean bool = paramByteBuffer.get() == 1;
    return new bbL(dIN.f(paramahy, paramByteBuffer), bvk.gf(paramLong).rg(i).fs(bool));
  }

  public static bbL a(dIN paramdIN, bvk parambvk)
  {
    return new bbL(paramdIN, parambvk);
  }

  bbL(dIN paramdIN, bvk parambvk) {
    this.fkX = paramdIN;
    this.fkY = parambvk;
  }
}