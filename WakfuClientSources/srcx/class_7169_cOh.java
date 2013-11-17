import java.nio.ByteBuffer;
import java.util.ArrayList;

public class cOh extends dzz
{
  private ArrayList gTP = new ArrayList();

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer1 = ByteBuffer.wrap(paramArrayOfByte);
    byte[] arrayOfByte1 = new byte[localByteBuffer1.getShort() & 0xFFFF];
    localByteBuffer1.get(arrayOfByte1);

    ByteBuffer localByteBuffer2 = ByteBuffer.wrap(arrayOfByte1);
    int i = localByteBuffer2.getShort();
    for (int j = 0; j < i; j++) {
      byte[] arrayOfByte2 = new byte[localByteBuffer2.getShort() & 0xFFFF];
      localByteBuffer2.get(arrayOfByte2);
      this.gTP.add(arrayOfByte2);
    }

    return true;
  }

  public int getId()
  {
    return 15326;
  }

  public ArrayList bVE() {
    return this.gTP;
  }
}