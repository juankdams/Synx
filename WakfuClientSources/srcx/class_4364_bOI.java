import java.nio.ByteBuffer;
import java.util.ArrayList;

public class bOI extends dzz
{
  private byte[] geJ;
  private final ArrayList gTP = new ArrayList();
  private final ArrayList gTQ = new ArrayList();

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer1 = ByteBuffer.wrap(paramArrayOfByte);

    this.geJ = new byte[localByteBuffer1.getShort() & 0xFFFF];
    localByteBuffer1.get(this.geJ);

    byte[] arrayOfByte1 = new byte[localByteBuffer1.getShort() & 0xFFFF];
    localByteBuffer1.get(arrayOfByte1);

    ByteBuffer localByteBuffer2 = ByteBuffer.wrap(arrayOfByte1);
    int i = localByteBuffer2.getShort();
    for (int j = 0; j < i; j++) {
      localObject = new byte[localByteBuffer2.getShort() & 0xFFFF];
      localByteBuffer2.get((byte[])localObject);
      this.gTP.add(localObject);
    }

    byte[] arrayOfByte2 = new byte[localByteBuffer1.getShort() & 0xFFFF];
    localByteBuffer1.get(arrayOfByte2);

    Object localObject = ByteBuffer.wrap(arrayOfByte2);
    int k = ((ByteBuffer)localObject).getShort();
    for (int m = 0; m < k; m++) {
      this.gTQ.add(bkQ.as((ByteBuffer)localObject));
    }

    return true;
  }

  public int getId()
  {
    return 4100;
  }

  public byte[] bCJ() {
    return this.geJ;
  }

  public ArrayList bVE() {
    return this.gTP;
  }

  public ArrayList bVF() {
    return this.gTQ;
  }
}