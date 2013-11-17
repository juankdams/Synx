import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class auS extends dzz
{
  private final ArrayList dJr = new ArrayList();
  private final bvv dJs = new bvv();
  private final cSi dJt = new cSi();

  public List aGU() {
    return this.dJr;
  }

  public bvv aGV() {
    return this.dJs;
  }

  public cSi aGW() {
    return this.dJt;
  }

  public boolean a(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    int i = localByteBuffer.get() & 0xFF;
    for (int j = 0; j < i; j++) {
      asj localasj = new asj();
      if (localasj.h(localByteBuffer)) {
        this.dJr.add(localasj);
        this.dJs.add(localByteBuffer.get());
        this.dJt.add(localByteBuffer.getInt());
      } else {
        K.error("Erreur durant la dé-serialisation d'un des inventaires marchands");
        return false;
      }
    }
    return true;
  }

  public int getId() {
    return 10114;
  }
}