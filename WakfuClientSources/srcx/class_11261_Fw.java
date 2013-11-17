import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class Fw extends ctN
{
  private static final Logger K = Logger.getLogger(Fw.class);

  public static final aug aGB = new aFb();
  private long bMO;
  private long bMP;

  public Fw()
  {
    super(dfr.kZH);
  }

  public void by(long paramLong) {
    this.bMO = paramLong;
  }

  public void bz(long paramLong) {
    this.bMP = paramLong;
  }

  public void execute() {
    aYr localaYr = crk();
    if (localaYr == null) {
      K.error("Impossible d'exécuter l'action " + this + " : la nation " + this.ie + " n'existe pas");
      return;
    }

    localaYr.t(this.bMO, this.bMP);
  }

  public boolean h(cTK paramcTK) {
    int i = paramcTK.cJf().bP();
    if (i != this.ie)
      return false;
    if (paramcTK.nU() < 1)
      return false;
    int j = paramcTK.cJf().dJ(i);
    return dwC.dbQ().BQ(j).a(aRk.eOd);
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(this.bMO);
    paramByteBuffer.putLong(this.bMP);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.bMO = paramByteBuffer.getLong();
    this.bMP = paramByteBuffer.getLong();

    return true;
  }

  public int O() {
    return 16;
  }

  public void clear() {
    this.ie = -1;
    this.bMO = -1L;
    this.bMP = -1L;
  }
}