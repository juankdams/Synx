import java.nio.ByteBuffer;
import java.util.LinkedList;
import org.apache.log4j.Logger;

public final class Qf extends dzz
{
  private long Tj;
  private LinkedList cpa = new LinkedList();
  private LinkedList cpb = new LinkedList();

  public boolean a(byte[] paramArrayOfByte)
  {
    try {
      ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

      this.Tj = localByteBuffer.getLong();

      int i = localByteBuffer.getShort();
      long l;
      byte[] arrayOfByte;
      for (int j = 0; j < i; j++) {
        l = localByteBuffer.getLong();
        arrayOfByte = new byte[localByteBuffer.getShort()];
        localByteBuffer.get(arrayOfByte);
        this.cpa.add(new Cs(Long.valueOf(l), arrayOfByte));
      }

      i = localByteBuffer.getShort();
      for (j = 0; j < i; j++) {
        l = localByteBuffer.getLong();
        arrayOfByte = new byte[localByteBuffer.getShort()];
        localByteBuffer.get(arrayOfByte);
        this.cpb.add(new Cs(Long.valueOf(l), arrayOfByte));
      }
    }
    catch (RuntimeException localRuntimeException) {
      K.error("Exception levée à la désérialisation d'un message de type GroupGlobalDataUpdateMessage");
      return false;
    }

    return true;
  }

  public long hf() {
    return this.Tj;
  }

  public int getId() {
    return 514;
  }

  public LinkedList abX() {
    return this.cpa;
  }

  public LinkedList abY() {
    return this.cpb;
  }
}