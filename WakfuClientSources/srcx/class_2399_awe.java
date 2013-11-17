import java.nio.ByteBuffer;
import java.util.ArrayList;

public class awe extends dzz
{
  private final ArrayList dLo = new ArrayList();
  private boolean dLp = false;
  private boolean dLq = false;

  public boolean a(byte[] paramArrayOfByte)
  {
    if (!j(paramArrayOfByte.length, 3, false)) {
      return false;
    }

    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.dLp = (localByteBuffer.get() == 1);
    this.dLq = (localByteBuffer.get() == 1);
    int i = localByteBuffer.get() & 0xFF;
    if (!j(localByteBuffer.remaining(), i * 9, true)) {
      return false;
    }
    for (int j = 0; j < i; j++) {
      byte b = localByteBuffer.get();
      long l = localByteBuffer.getLong();
      this.dLo.add(new Cs(Byte.valueOf(b), Long.valueOf(l)));
    }
    return true;
  }

  public int getId()
  {
    return 4104;
  }

  public ArrayList aIe()
  {
    return this.dLo;
  }

  public boolean aIf() {
    return this.dLp;
  }

  public boolean aIg() {
    return this.dLq;
  }
}