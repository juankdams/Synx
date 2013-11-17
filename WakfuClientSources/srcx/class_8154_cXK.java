import java.nio.ByteBuffer;

public class cXK extends dzz
{
  private cKg aQq;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    brW localbrW = ars.dzL.aL(localByteBuffer.getShort());
    bpu localbpu = bpu.av(localByteBuffer);
    this.aQq = XT.a(localbrW, localbpu);
    aBd localaBd = new aBd(this.aQq);
    int i = 0; for (int j = localByteBuffer.getInt(); i < j; i++) {
      localaBd.ag(localByteBuffer);
    }
    i = 0; for (j = localByteBuffer.getInt(); i < j; i++) {
      localaBd.ah(localByteBuffer);
    }
    return true;
  }

  public cKg tZ() {
    return this.aQq;
  }

  public int getId()
  {
    return 5518;
  }
}