import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

public class cLW extends dzz
{
  private Set iLf = new HashSet();

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    int i = localByteBuffer.get();

    aHR localaHR = new aHR();
    for (int j = 0; j < i; j++) {
      localaHR.U(localByteBuffer);
      this.iLf.add(localaHR.qI());
    }
    return true;
  }

  public Set cEK() {
    return this.iLf;
  }

  public int getId() {
    return 578;
  }
}