import java.nio.ByteBuffer;

public class ccZ extends dzz
{
  private final cSi hvJ = new cSi();
  private final cSi hvK = new cSi();

  public boolean a(byte[] paramArrayOfByte) {
    if (paramArrayOfByte.length < 2) {
      return false;
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    int i = localByteBuffer.getShort() & 0xFFFF;
    if (localByteBuffer.remaining() != i * 8) {
      return false;
    }
    for (int j = 0; j < i; j++) {
      this.hvJ.add(localByteBuffer.getInt());
      this.hvK.add(localByteBuffer.getInt());
    }
    return true;
  }

  public int getId() {
    return 15204;
  }

  public final int cfW() {
    return this.hvJ.size();
  }

  public final int uI(int paramInt) {
    return this.hvJ.get(paramInt);
  }

  public final int uJ(int paramInt) {
    return this.hvK.get(paramInt);
  }
}