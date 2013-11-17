import java.nio.ByteBuffer;
import java.util.ArrayList;

public class Rh extends dzz
{
  private byte cqy = 0;
  private long cqz = 0L;
  private byte cqA = 0;
  private int hY;
  private int hZ;
  private byte cqB;
  private short cqC;
  private ArrayList cm = new ArrayList();

  public boolean a(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.cqz = localByteBuffer.getInt();
    this.cqy = localByteBuffer.get();
    this.hY = localByteBuffer.getInt();
    this.hZ = localByteBuffer.getInt();
    this.cqA = localByteBuffer.get();

    this.cqB = localByteBuffer.get();
    this.cqC = localByteBuffer.getShort();

    int i = localByteBuffer.getShort();
    for (int j = 0; j < i; j++) {
      long l1 = localByteBuffer.getLong();
      int k = localByteBuffer.getInt();
      int m = localByteBuffer.get();
      long l2 = localByteBuffer.getLong();

      bBn localbBn = Hh.QM().dh(k);
      if (localbBn != null) {
        gA localgA = new gA(l1);
        localgA.b(localbBn);
        localgA.l((short)m);
        this.cm.add(new Cs(Long.valueOf(l2), localgA));
      }
    }

    return true;
  }

  public int getId() {
    return 4204;
  }

  public byte acF() {
    return this.cqy;
  }

  public long acG() {
    return this.cqz;
  }

  public int getX() {
    return this.hY;
  }

  public int getY() {
    return this.hZ;
  }

  public byte acH() {
    return this.cqA;
  }

  public ArrayList getItems() {
    return this.cm;
  }

  public byte acI() {
    return this.cqB;
  }

  public short acJ() {
    return this.cqC;
  }

  public byte acK()
  {
    return this.cqB;
  }
}