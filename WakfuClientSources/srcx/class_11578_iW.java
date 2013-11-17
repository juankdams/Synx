import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class iW extends ctN
{
  private static final Logger K = Logger.getLogger(iW.class);

  public static final aug aGB = new cfu();
  private int aGC;

  public iW()
  {
    super(dfr.kZD);
  }

  public void aM(int paramInt) {
    this.aGC = paramInt;
  }

  public void execute() {
    aYr localaYr = crk();
    if (localaYr == null) {
      K.error("Impossible d'exécuter l'action " + this + " : la nation " + this.ie + " n'existe pas");
      return;
    }
    localaYr.iw(this.aGC);
  }

  public boolean h(cTK paramcTK) {
    return false;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putInt(this.aGC);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.aGC = paramByteBuffer.getInt();
    return true;
  }

  public int O() {
    return 4;
  }

  public void clear() {
    this.ie = -1;
    this.aGC = -1;
  }
}