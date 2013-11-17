import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class bOA extends ctN
{
  private static final Logger K = Logger.getLogger(bOA.class);

  public static final aug aGB = new cZS();
  private long gTF;
  private long gTG;
  private cuX gTH;

  public bOA()
  {
    super(dfr.kZJ);
  }

  public void gR(long paramLong) {
    this.gTF = paramLong;
  }

  public void gS(long paramLong) {
    this.gTG = paramLong;
  }

  public void a(cuX paramcuX) {
    this.gTH = paramcuX;
  }

  public void execute() {
    aYr localaYr = crk();
    if (localaYr == null) {
      K.error("Impossible d'exécuter l'action " + this + " : la nation " + this.ie + " n'existe pas");
      return;
    }
    localaYr.a(Yp.cj(this.gTF), Yp.cj(this.gTG), this.gTH);
  }

  public boolean h(cTK paramcTK) {
    aYr localaYr = paramcTK.cJf().UI();
    if (localaYr.bP() != this.ie)
      return false;
    dpE localdpE = localaYr.aNd().hv(paramcTK.getId());
    if (localdpE == null)
      return false;
    if (localdpE.HK().getId() != this.gTF)
      return false;
    return bfi.b(localdpE.HK(), Yp.cj(this.gTF));
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(this.gTF);
    paramByteBuffer.putLong(this.gTG);
    paramByteBuffer.put(this.gTH.bJ());
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.gTF = paramByteBuffer.getLong();
    this.gTG = paramByteBuffer.getLong();
    this.gTH = cuX.dZ(paramByteBuffer.get());

    return true;
  }

  public int O() {
    return 17;
  }

  public void clear() {
    this.ie = -1;
    this.gTF = -1L;
    this.gTG = -1L;
  }
}