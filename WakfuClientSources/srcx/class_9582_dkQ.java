import java.nio.ByteBuffer;

public class dkQ extends aRw
{
  private agT liq;

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(2 + this.liq.size() * 4);
    localByteBuffer.putShort((short)this.liq.size());
    auO localauO = this.liq.ast();
    while (localauO.hasNext()) {
      localauO.fl();
      localByteBuffer.putShort(localauO.fm());
      localByteBuffer.putShort(localauO.Lb());
    }
    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 8407;
  }

  public void b(agT paramagT) {
    this.liq = paramagT;
  }
}