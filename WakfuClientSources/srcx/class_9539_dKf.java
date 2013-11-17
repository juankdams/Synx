import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public abstract class dKf extends adx
{
  private static final Logger K = Logger.getLogger(dKf.class);
  private cYk lWK;

  dKf(int paramInt)
  {
    super(paramInt);
  }

  public abstract void c(String[] paramArrayOfString);

  public abstract boolean f(gA paramgA);

  public boolean Z(gA paramgA) {
    return (this.aB == null) || (this.aB.i(byv.bFN().bFO(), paramgA, null, null));
  }

  void bZ(long paramLong) {
    byv.bFN().aJK().d(new aLf(paramLong, this));
    clear();
  }

  public final void ap(cYk paramcYk)
  {
    this.lWK = paramcYk;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    if (apu()) {
      if (this.lWK == null) {
        paramByteBuffer.put((byte)0);
      } else {
        paramByteBuffer.put((byte)1);
        paramByteBuffer.putInt(this.lWK.getX());
        paramByteBuffer.putInt(this.lWK.getY());
        paramByteBuffer.putShort(this.lWK.IB());
      }
    }
    return true;
  }

  public int O() {
    if (apu()) {
      if (this.lWK == null)
        return 1;
      return 11;
    }
    return 0;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    throw new UnsupportedOperationException("Pas de désérialization dans le Client");
  }

  public String bAu() {
    return null;
  }
}