import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public abstract class duW extends hk
{
  protected dxL lAd;
  protected cds lAe;
  protected cds lAf;
  protected boolean lAg;

  public duW(aAY paramaAY)
  {
  }

  protected abstract void aT();

  public void b(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putLong(this.bdf.dUl != null ? this.bdf.dUl.rO() : kb.hwQ.rO());
    paramByteBuffer.putLong(this.bdf.dUm != null ? this.bdf.dUm.rO() : kb.hwQ.rO());
    paramByteBuffer.putLong(this.bdf.dUj != null ? this.bdf.dUj.rP() : 0L);
    paramByteBuffer.put((byte)(this.bdf.dUi ? 1 : 0));
  }

  public void c(ByteBuffer paramByteBuffer, int paramInt)
  {
    try {
      this.lAe = kb.I(paramByteBuffer.getLong());
      this.lAf = kb.I(paramByteBuffer.getLong());
      this.lAd = cYq.jq(paramByteBuffer.getLong());
      this.lAg = (paramByteBuffer.get() == 1);
      aT();
    } catch (Exception localException) {
      aAY.K.error("Exception", localException);
    }
  }

  public int O()
  {
    return 25;
  }
}