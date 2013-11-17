import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class drZ extends ctN
{
  private static final Logger K = Logger.getLogger(drZ.class);

  public static final aug aGB = new bNM();
  private int aGC;
  private int[] aGD;

  public drZ()
  {
    super(dfr.kZC);
  }

  public void aM(int paramInt) {
    this.aGC = paramInt;
  }

  public void c(int[] paramArrayOfInt) {
    this.aGD = paramArrayOfInt;
  }

  public void execute() {
    aYr localaYr = crk();
    if (localaYr == null) {
      K.error("Impossible d'exécuter l'action " + this + " : la nation " + this.ie + " n'existe pas");
      return;
    }
    localaYr.d(this.aGC, this.aGD);
  }

  public boolean h(cTK paramcTK) {
    return false;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putInt(this.aGC);
    if (this.aGD != null) {
      int i = this.aGD.length;
      for (int j = 0; j < i; j++) {
        paramByteBuffer.putInt(this.aGD[j]);
      }
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.aGC = paramByteBuffer.getInt();
    int i = paramByteBuffer.remaining();
    if (i % 4 != 0) {
      K.error("Impossible de désérialiser une nationActionRequest. Nombre d'octets restants non valides pour former des entiers... pas multiple de 4.");
      return false;
    }
    int j = i / 4;
    this.aGD = new int[j];
    for (int k = 0; k < j; k++)
      this.aGD[k] = paramByteBuffer.getInt();
    return true;
  }

  public int O() {
    if (this.aGD == null)
      return 4;
    return 4 + 4 * this.aGD.length;
  }

  public void clear() {
    this.aGD = null;
    this.ie = -1;
    this.aGC = -1;
  }
}