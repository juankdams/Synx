import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

class IJ extends cCH
{
  IJ(aVc paramaVc, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(this.bRW.oj());
    paramByteBuffer.putLong(this.bRW.bkb());

    paramByteBuffer.putInt(this.bRW.eWL == null ? this.bRW.bkW().yR() : this.bRW.eWL.yR());

    if (this.bRW.eUw == null) {
      paramByteBuffer.putInt(0);
      paramByteBuffer.putInt(0);
      paramByteBuffer.putShort((short)0);
    } else {
      paramByteBuffer.putInt(this.bRW.eUw.getX());
      paramByteBuffer.putInt(this.bRW.eUw.getY());
      paramByteBuffer.putShort(this.bRW.eUw.IB());
    }
    paramByteBuffer.putInt(this.bRW.cxl);
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    long l1 = paramByteBuffer.getLong();
    this.bRW.aH(l1);
    long l2 = paramByteBuffer.getLong();
    this.bRW.eWP = l2;

    int i = paramByteBuffer.getInt();
    if ((this.bRW.ejP != null) && (this.bRW.ejP.LG() != null)) {
      this.bRW.eWL = this.bRW.ejP.LG().hI(i);

      if (this.bRW.eWL == null) {
        K.error("Impossible de désérialiser un WakfuRunningEffect : generic effet inconnu : " + i);
      }
    }
    this.bRW.eUw.ac(paramByteBuffer.getInt(), paramByteBuffer.getInt(), paramByteBuffer.getShort());
    this.bRW.cxl = paramByteBuffer.getInt();
  }
}