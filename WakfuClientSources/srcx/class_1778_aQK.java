import java.nio.ByteBuffer;
import java.util.ArrayList;

public class aQK extends dzz
{
  private final ArrayList eNy = new ArrayList();

  private final bvv eNz = new bvv();

  private final ArrayList eNA = new ArrayList();

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    int i = localByteBuffer.getShort();
    for (int j = 0; j < i; j++) {
      this.eNy.add(Long.valueOf(localByteBuffer.getLong()));
      this.eNz.add(localByteBuffer.get());
      this.eNA.add(Long.valueOf(localByteBuffer.getLong()));
    }
    return true;
  }

  public int getId() {
    return 5208;
  }

  public ArrayList bhj()
  {
    return this.eNy;
  }

  public bvv bhk()
  {
    return this.eNz;
  }

  public ArrayList bhl()
  {
    return this.eNA;
  }
}