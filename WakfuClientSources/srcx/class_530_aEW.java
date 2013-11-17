import java.nio.ByteBuffer;
import java.util.ArrayList;

public class aEW
{
  private long bkH;
  private final int eaH;
  private final dxL bXQ;
  private final kb eaI;
  private final int eaJ;
  private final int eaK;
  private final int eaL;
  private final long eaM;
  private final ArrayList eaN = new ArrayList();

  public aEW(long paramLong1, int paramInt1, dxL paramdxL, kb paramkb, int paramInt2, int paramInt3, int paramInt4, long paramLong2)
  {
    this.bkH = paramLong1;
    this.eaH = paramInt1;
    this.bXQ = paramdxL;
    this.eaI = paramkb;
    this.eaJ = paramInt2;
    this.eaK = paramInt3;
    this.eaL = paramInt4;
    this.eaM = paramLong2;
  }

  public int aRs() {
    return this.eaH;
  }

  public dxL VN() {
    return this.bXQ;
  }

  public kb aRt() {
    return this.eaI;
  }

  public int aRu() {
    return this.eaJ;
  }

  public int aRv() {
    return this.eaK;
  }

  public int aRw() {
    return this.eaL;
  }

  public long aRx() {
    return this.eaM;
  }

  public void a(dQa paramdQa) {
    this.eaN.add(paramdQa);
  }

  public ArrayList aRy() {
    return this.eaN;
  }

  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(this.bkH);
    paramByteBuffer.putInt(this.eaH);
    paramByteBuffer.putLong(this.bXQ.rP());
    paramByteBuffer.putLong(this.eaI.rO());
    paramByteBuffer.putInt(this.eaJ);
    paramByteBuffer.putInt(this.eaK);
    paramByteBuffer.putInt(this.eaL);
    paramByteBuffer.putLong(this.eaM);
    paramByteBuffer.putShort((short)this.eaN.size());
    for (int i = 0; i < this.eaN.size(); i++)
      ((dQa)this.eaN.get(i)).b(paramByteBuffer);
  }

  public static aEW aj(ByteBuffer paramByteBuffer)
  {
    long l1 = paramByteBuffer.getLong();
    int i = paramByteBuffer.getInt();
    long l2 = paramByteBuffer.getLong();
    long l3 = paramByteBuffer.getLong();
    int j = paramByteBuffer.getInt();
    int k = paramByteBuffer.getInt();
    int m = paramByteBuffer.getInt();
    long l4 = paramByteBuffer.getLong();

    aEW localaEW = new aEW(l1, i, cYq.jq(l2), kb.I(l3), j, k, m, l4);

    int n = paramByteBuffer.getShort();
    for (int i1 = 0; i1 < n; i1++) {
      localaEW.a(dQa.aV(paramByteBuffer));
    }

    return localaEW;
  }

  public int O() {
    int i = 0;
    for (int j = 0; j < this.eaN.size(); j++) {
      i += ((dQa)this.eaN.get(j)).O();
    }
    return 50 + i;
  }

  public dQa mo(int paramInt)
  {
    if (paramInt >= this.eaN.size()) {
      return null;
    }

    return (dQa)this.eaN.get(paramInt);
  }

  public long EN() {
    return this.bkH;
  }

  public void aH(long paramLong) {
    this.bkH = paramLong;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("date=").append(this.bXQ).append(", score=").append(this.eaM).append(", charactersCount=").append(this.eaN.size());
    return localStringBuilder.toString();
  }
}