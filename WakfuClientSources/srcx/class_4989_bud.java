import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class bud extends ctN
{
  private static final Logger K = Logger.getLogger(bud.class);

  public static final aug aGB = new bpF();
  private long iI;

  public bud()
  {
    super(dfr.kZF);
  }

  public void g(long paramLong) {
    this.iI = paramLong;
  }

  public void execute() {
    aYr localaYr = crk();
    if (localaYr == null) {
      K.error("Impossible d'exécuter l'action " + this + " : la nation " + this.ie + " n'existe pas");
      return;
    }
    localaYr.p(this.iI);
  }

  public boolean h(cTK paramcTK) {
    return false;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(this.iI);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.iI = paramByteBuffer.getLong();
    return true;
  }

  public int O() {
    return 8;
  }

  public void clear() {
    this.ie = -1;
    this.iI = -1L;
  }
}