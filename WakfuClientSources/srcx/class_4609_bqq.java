import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class bqq extends ctN
{
  public static byte bRz = 1;
  public static byte bRA = 2;

  private static final Logger K = Logger.getLogger(bqq.class);

  public static final aug aGB = new clS();
  private byte fLw;
  private long iI;
  private byte fLx;

  public bqq()
  {
    super(dfr.kZK);
  }

  public void cY(byte paramByte) {
    this.fLw = paramByte;
  }

  public void g(long paramLong) {
    this.iI = paramLong;
  }

  public void d(dLC paramdLC) {
    this.fLx = paramdLC.bJ();
  }

  public void execute() {
    aYr localaYr = crk();
    if (localaYr == null) {
      K.error("Impossible d'exécuter l'action " + this + " : la nation " + this.ie + " n'existe pas");
      return;
    }
    if (this.fLw == bRz)
      localaYr.a(this.iI, dLC.fQ(this.fLx));
    else if (this.fLw == bRA)
      localaYr.b(this.iI, dLC.fQ(this.fLx));
  }

  public boolean h(cTK paramcTK) {
    return false;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.put(this.fLw);
    paramByteBuffer.putLong(this.iI);
    paramByteBuffer.put(this.fLx);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.fLw = paramByteBuffer.get();
    this.iI = paramByteBuffer.getLong();
    this.fLx = paramByteBuffer.get();
    return true;
  }

  public int O() {
    return 10;
  }

  public void clear() {
    this.ie = -1;
    this.fLw = -1;
    this.iI = -1L;
    this.fLx = -1;
  }
}