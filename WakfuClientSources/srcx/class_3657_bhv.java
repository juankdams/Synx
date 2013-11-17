import java.nio.ByteBuffer;

public class bhv extends aRw
{
  private int aGC;
  private final cLO fwp = new cLO();

  public void aM(int paramInt) {
    this.aGC = paramInt;
  }

  public void d(baR parambaR) {
    this.fwp.b(parambaR.bpn().ewr, parambaR.getValue());
  }

  public byte[] encode() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(6 + 5 * this.fwp.size());
    localByteBuffer.putInt(this.aGC);

    localByteBuffer.putShort((short)this.fwp.size());

    this.fwp.a(new aTB(this, localByteBuffer));

    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 15321;
  }
}