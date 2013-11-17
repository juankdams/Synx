import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class apl extends bkn
  implements Iterable
{
  private final czS dvh = new czS();
  private final List dvi = new ArrayList();

  public static apl aa(ByteBuffer paramByteBuffer) {
    return new apl().ab(paramByteBuffer);
  }

  private apl ab(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.get();
    for (int j = 0; j < i; j++)
      ac(paramByteBuffer);
    j = paramByteBuffer.get();
    for (int k = 0; k < j; k++) {
      this.dvi.add(new bQE(paramByteBuffer.getLong(), paramByteBuffer.getInt()));
    }
    dUy localdUy = new dUy();
    int m = paramByteBuffer.get();
    for (int n = 0; n < m; n++) {
      localdUy.G(paramByteBuffer.getLong(), paramByteBuffer.getInt());
    }
    a(localdUy);
    aBs();
    return this;
  }

  private void aBs() {
    for (bQE localbQE : this.dvi) {
      pq localpq = (pq)this.fAN.get(localbQE.bXC());
      if (localpq != null)
      {
        localpq.d(localbQE.getSecond(), (short)1);
      }
    }
    bvp().a(new ayR(this));
  }

  private void ac(ByteBuffer paramByteBuffer)
  {
    this.dvh.aE(paramByteBuffer);
    pq localpq = this.dvh.cwP();
    this.fAN.put(localpq.eq(), localpq);
  }

  public int size() {
    return this.fAN.size();
  }

  public Iterator iterator() {
    return new ayM(this);
  }

  public List aBt()
  {
    return this.dvi;
  }
}