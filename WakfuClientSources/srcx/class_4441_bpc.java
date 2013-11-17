import java.nio.ByteBuffer;
import java.util.ArrayList;

public class bpc extends dzz
{
  private final ArrayList fIL = new ArrayList();

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    int i = localByteBuffer.get() & 0xFF;
    this.fIL.clear();
    this.fIL.ensureCapacity(i);

    for (int j = 0; j < i; j++) {
      int k = localByteBuffer.getShort();
      byte[] arrayOfByte = new byte[k];
      localByteBuffer.get(arrayOfByte);
      ayb localayb = new ayb(this);
      localayb.C(arrayOfByte);
      this.fIL.add(localayb);
    }

    return true;
  }

  public int getId()
  {
    return 3144;
  }

  public void bc()
  {
    super.bc();
    this.fIL.clear();
  }

  public Iterable byG()
  {
    return this.fIL;
  }
}