import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

public class cLK extends dzz
{
  private Set iLf = new HashSet();

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    int i = localByteBuffer.get();

    aHR localaHR = new aHR();
    for (int j = 0; j < i; j++) {
      localaHR.egd.a(localByteBuffer, aUk.eVd);
      localaHR.egf.a(localByteBuffer, aUk.eVd);
      this.iLf.add(localaHR.qI());
      localaHR.o(null);
    }
    return true;
  }

  public Set cEK() {
    return this.iLf;
  }

  public int getId() {
    return 568;
  }
}