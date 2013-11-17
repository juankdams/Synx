import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class cSU
  implements cCm
{
  private final List kFJ = new ArrayList(4);
  private final List kFK = new ArrayList(4);

  public void a(dIN paramdIN, boolean paramBoolean) {
    List localList = paramBoolean ? this.kFK : this.kFJ;
    localList.add(paramdIN);
    paramdIN.a(this);
  }

  public Iterable cIL() {
    return this.kFK;
  }

  public Iterable cIM() {
    return new ArrayList(this.kFK);
  }

  public Iterable cIN() {
    return this.kFJ;
  }

  public Iterable cIO() {
    return new ArrayList(this.kFJ);
  }

  public int O()
  {
    int i = 4;
    i += L(this.kFK);
    i += L(this.kFJ);
    return i;
  }

  private int L(List paramList) {
    int i = 0;
    for (dIN localdIN : paramList) {
      i += localdIN.O();
    }
    return i;
  }

  public void b(ByteBuffer paramByteBuffer) {
    a(paramByteBuffer, this.kFJ);
    a(paramByteBuffer, this.kFK);
  }

  private void a(ByteBuffer paramByteBuffer, List paramList) {
    paramByteBuffer.putShort((short)paramList.size());
    for (dIN localdIN : paramList)
      localdIN.b(paramByteBuffer);
  }

  protected void a(ahy paramahy, ByteBuffer paramByteBuffer)
  {
    a(paramahy, paramByteBuffer, this.kFJ);
    a(paramahy, paramByteBuffer, this.kFK);
  }

  private void a(ahy paramahy, ByteBuffer paramByteBuffer, List paramList) {
    int i = paramByteBuffer.getShort();
    for (int j = 0; j < i; j = (short)(j + 1))
      paramList.add(dIN.f(paramahy, paramByteBuffer));
  }

  public static cSU d(ahy paramahy, ByteBuffer paramByteBuffer)
  {
    cSU localcSU = new cSU();
    localcSU.a(paramahy, paramByteBuffer);
    return localcSU;
  }

  public void clear()
  {
    dIN localdIN;
    for (int i = 0; i < this.kFJ.size(); i++) {
      localdIN = (dIN)this.kFJ.get(i);
      localdIN.clean();
    }
    this.kFJ.clear();
    for (i = 0; i < this.kFK.size(); i++) {
      localdIN = (dIN)this.kFK.get(i);
      localdIN.clean();
    }
    this.kFK.clear();
  }

  public void b(dIN paramdIN) {
    this.kFK.remove(paramdIN);
    this.kFJ.remove(paramdIN);
  }
}