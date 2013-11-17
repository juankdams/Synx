import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

class crg
  implements ddz
{
  private static final Logger K = Logger.getLogger(crg.class);
  private long cfv;
  private short aFe;
  private short cJY;
  private long iaJ;

  crg()
  {
  }

  crg(long paramLong1, short paramShort1, long paramLong2, short paramShort2)
  {
    this.cfv = paramLong1;
    this.aFe = paramShort1;
    this.iaJ = paramLong2;
    this.cJY = paramShort2;
  }

  public byte[] j() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(20);
    localByteBuffer.putLong(this.cfv);
    localByteBuffer.putShort(this.aFe);
    localByteBuffer.putLong(this.iaJ);
    localByteBuffer.putShort(this.cJY);
    return localByteBuffer.array();
  }

  public void a(ByteBuffer paramByteBuffer) {
    this.cfv = paramByteBuffer.getLong();
    this.aFe = paramByteBuffer.getShort();
    this.iaJ = paramByteBuffer.getLong();
    this.cJY = paramByteBuffer.getShort();
  }

  public void a(cfH paramcfH) {
    try {
      if ((this.iaJ == -1L) || (this.iaJ == 0L)) {
        paramcfH.e(this.cfv, this.aFe);
      } else if (this.iaJ == 2L) {
        paramcfH.i(this.cfv, this.cJY);
      } else {
        short s = (short)(paramcfH.cf(this.cfv) - this.aFe);
        paramcfH.a(this.cfv, this.iaJ, this.cJY, s);
      }
    } catch (czR localczR) {
      K.error("Impossible de modifier la quantité. " + localczR.getMessage());
    }
  }

  public adY cfD() {
    return adY.cUS;
  }

  public String toString()
  {
    return "ItemQuantityChange{m_itemId=" + this.cfv + ", m_quantity=" + this.aFe + '}';
  }
}