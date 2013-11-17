import java.nio.ByteBuffer;
import java.util.HashMap;

public class duT extends dzz
{
  private long dES;
  private int aRQ;
  private Gj lAc;
  private final HashMap eds = new HashMap();

  public boolean a(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.dES = localByteBuffer.getLong();
    this.aRQ = localByteBuffer.getInt();
    this.lAc = Gj.U(localByteBuffer.get());
    int i = localByteBuffer.getInt();
    for (int j = 0; j < i; j++) {
      byte[] arrayOfByte = new byte[localByteBuffer.getInt()];
      localByteBuffer.get(arrayOfByte);
      this.eds.put(dzp.aJ(arrayOfByte), Long.valueOf(localByteBuffer.getLong()));
    }

    return true;
  }

  public int getId() {
    return 15800;
  }

  public long aFL() {
    return this.dES;
  }

  public int eo() {
    return this.aRQ;
  }

  public Gj daN() {
    return this.lAc;
  }

  public HashMap aSw() {
    return this.eds;
  }
}