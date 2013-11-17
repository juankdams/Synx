import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;

public class bMX
{
  private final cYq gRn;
  protected ArrayList gRo = new ArrayList();
  protected int gRp = 0;

  public bMX() {
    this.gRn = cYq.jq(0L);
  }

  public int abA() {
    return this.gRo.size();
  }

  public int aNb() {
    return this.gRp;
  }

  public cYq bUE() {
    return this.gRn;
  }

  public void b(int paramInt1, int paramInt2, ArrayList paramArrayList) {
    int i = paramInt1 + Math.min(paramInt2, this.gRo.size() - paramInt1);
    for (int j = paramInt1; j < i; j++)
      paramArrayList.add(this.gRo.get(j));
  }

  public void p(aYr paramaYr) {
    this.gRn.set(paramaYr.aMT().rP());
    this.gRp = 0;
    for (cHu localcHu = paramaYr.bnJ(); localcHu.hasNext(); ) {
      localcHu.fl();
      Qy localQy = (Qy)localcHu.value();
      this.gRo.add(localQy);
      this.gRp += localQy.acg();
    }
    Collections.sort(this.gRo, aTQ.eSF);
  }

  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(this.gRn.rP());
    paramByteBuffer.putInt(this.gRp);
    paramByteBuffer.putShort((short)this.gRo.size());
    for (int i = 0; i < this.gRo.size(); i++)
      ((Qy)this.gRo.get(i)).b(paramByteBuffer);
  }

  public void U(ByteBuffer paramByteBuffer)
  {
    this.gRo.clear();
    this.gRn.set(paramByteBuffer.getLong());
    this.gRp = paramByteBuffer.getInt();
    int i = paramByteBuffer.getShort();
    for (int j = 0; j < i; j++)
      this.gRo.add(Qy.T(paramByteBuffer));
  }

  public int O() {
    int i = 14;
    for (int j = 0; j < this.gRo.size(); j++)
      i += ((Qy)this.gRo.get(j)).O();
    return i;
  }

  public void clear() {
    this.gRn.set(0L);
    this.gRo.clear();
    this.gRp = 0;
  }
}