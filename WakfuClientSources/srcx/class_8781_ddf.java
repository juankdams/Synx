import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class ddf extends dzz
{
  private boolean kWs;
  private bvv kWt;
  private cbQ kWu;
  private List kWv;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.kWs = (localByteBuffer.get() == 1);
    int i = localByteBuffer.get() & 0xFF;
    this.kWt = new bvv(i);
    this.kWu = new cbQ(i);
    this.kWv = new ArrayList(i);
    for (int j = 0; j < i; j++) {
      this.kWt.add(localByteBuffer.get());
      this.kWu.add(localByteBuffer.getLong());
      int k = localByteBuffer.getShort() & 0xFFFF;
      byte[] arrayOfByte = new byte[k];
      localByteBuffer.get(arrayOfByte);
      this.kWv.add(arrayOfByte);
    }
    return true;
  }

  public int getId()
  {
    return 4102;
  }

  public boolean cOq() {
    return this.kWs;
  }

  public bvv cOr() {
    return this.kWt;
  }

  public cbQ cOs() {
    return this.kWu;
  }

  public List cOt() {
    return this.kWv;
  }
}