import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

class cci
  implements ddz
{
  private static final Logger K = Logger.getLogger(cci.class);
  private long htC;
  private short cJY;
  private long cfv;

  cci()
  {
  }

  cci(long paramLong1, long paramLong2, short paramShort)
  {
    this.cfv = paramLong1;
    this.htC = paramLong2;
    this.cJY = paramShort;
  }

  public byte[] j() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(18);
    localByteBuffer.putLong(this.cfv);
    localByteBuffer.putLong(this.htC);
    localByteBuffer.putShort(this.cJY);
    return localByteBuffer.array();
  }

  public void a(ByteBuffer paramByteBuffer) {
    this.cfv = paramByteBuffer.getLong();
    this.htC = paramByteBuffer.getLong();
    this.cJY = paramByteBuffer.getShort();
  }

  public void a(cfH paramcfH) {
    try {
      if (this.htC == -1L) {
        gA localgA = paramcfH.hq(this.cfv);
        if (localgA != null)
          localgA.release();
      } else if (this.htC == 2L) {
        paramcfH.i(this.cfv, this.cJY);
      } else {
        paramcfH.a(this.cfv, this.htC, this.cJY, (short)-1);
      }
    } catch (czR localczR) {
      K.error("Impossible de retirer l'objet : " + localczR.getMessage());
    }
  }

  public adY cfD() {
    return adY.cUR;
  }

  public String toString()
  {
    return "RemoveItemChange{m_itemId=" + this.cfv + '}';
  }
}