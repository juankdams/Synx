import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public abstract class cPc
{
  protected static Logger K = Logger.getLogger(cPc.class);
  protected final Ch kxY;
  protected final Ej kxZ;
  private final ArrayList kya;

  public cPc(Ch paramCh)
  {
    this.kxY = paramCh;

    this.kxZ = new Ej(this.kxY.Ll().bwV());
    this.kya = new ArrayList();
  }

  public short Lk() {
    return this.kxY.Lk();
  }

  public ArrayList cGs() {
    return this.kxZ;
  }

  public Ch cGt() {
    return this.kxY;
  }

  public int a(aEW paramaEW) {
    this.kxZ.add(paramaEW);
    cGv();

    return this.kxZ.indexOf(paramaEW);
  }

  protected void cGu() {
    this.kxZ.remove(this.kxZ.getLast());
  }

  public void iW(long paramLong) {
    Object localObject = null;
    int i = 0; for (int j = this.kxZ.size(); i < j; i++) {
      aEW localaEW = (aEW)this.kxZ.get(i);
      if (localaEW.EN() == paramLong) {
        localObject = localaEW;
        break;
      }
    }

    this.kxZ.remove(localObject);
    cGv();
  }

  public int b(aEW paramaEW) {
    this.kxZ.add(paramaEW);
    int i = this.kxZ.indexOf(paramaEW);
    this.kxZ.remove(paramaEW);
    return i;
  }

  public void reset() {
    this.kxZ.clear();
    cGw();
  }

  protected void cGv() {
    int i = 0; for (int j = this.kya.size(); i < j; i++)
      ((bqP)this.kya.get(i)).c(this);
  }

  protected void cGw() {
    int i = 0; for (int j = this.kya.size(); i < j; i++)
      ((bqP)this.kya.get(i)).b(this);
  }

  public void a(bqP parambqP) {
    if (!this.kya.contains(parambqP))
      this.kya.add(parambqP);
  }

  public aEW cGx() {
    return (aEW)this.kxZ.get(0);
  }

  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putShort(this.kxY.Lk());
    paramByteBuffer.putShort((short)this.kxZ.size());
    for (int i = 0; i < this.kxZ.size(); i++)
      ((aEW)this.kxZ.get(i)).b(paramByteBuffer);
  }

  public void aH(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.getShort();
    for (int j = 0; j < i; j++) {
      aEW localaEW = aEW.aj(paramByteBuffer);
      a(localaEW);
    }
  }

  public int O() {
    int i = 0;
    for (int j = 0; j < this.kxZ.size(); j++) {
      aEW localaEW = (aEW)this.kxZ.get(j);
      i += localaEW.O();
    }
    return 4 + i;
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();

    localStringBuffer.append("DungeonLadder(instanceId=").append(this.kxY.Lk()).append(", ladderType=").append(this.kxY.Ll().name()).append(", resultCount=").append(this.kxZ.size()).append(")");

    return localStringBuffer.toString();
  }
}