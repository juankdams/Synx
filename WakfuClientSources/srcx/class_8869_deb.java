import java.nio.ByteBuffer;
import java.util.LinkedList;
import org.apache.log4j.Logger;

public final class deb extends dzz
{
  private long Tj;
  private boolean kYa;
  private byte[] kYb;
  private LinkedList cpa = new LinkedList();
  private LinkedList cpb = new LinkedList();

  public boolean a(byte[] paramArrayOfByte)
  {
    try {
      ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

      this.Tj = localByteBuffer.getLong();
      this.kYa = (localByteBuffer.get() == 1);

      int i = localByteBuffer.getShort();
      if (i > 0) {
        this.kYb = new byte[i];
        localByteBuffer.get(this.kYb);
      }

      i = localByteBuffer.getShort();
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

  public boolean cOS() {
    return this.kYa;
  }

  public long hf() {
    return this.Tj;
  }

  public int getId() {
    return 500;
  }

  public byte[] cOT() {
    return this.kYb;
  }

  public LinkedList abX() {
    return this.cpa;
  }

  public LinkedList abY() {
    return this.cpb;
  }
}