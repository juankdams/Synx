import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class dDL
{
  private static final Logger K = Logger.getLogger(dDL.class);

  private final adz lLZ = new adz();

  public void aa(String paramString, int paramInt) {
    try {
      if ((!bB) && (!this.lLZ.isEmpty())) throw new AssertionError();
      byte[] arrayOfByte = dtb.readFile(String.format(paramString, new Object[] { Integer.valueOf(paramInt) }));
      ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte);
      int i = arrayOfByte.length / 4;
      for (int j = 0; j < i; j++)
        this.lLZ.hL(localByteBuffer.getInt());
    }
    catch (Throwable localThrowable) {
      K.error("problème de lecture des coordonnées de maps valides", localThrowable);
    }
  }

  public boolean ff(int paramInt1, int paramInt2) {
    return this.lLZ.contains(bCO.cN(paramInt1, paramInt2));
  }

  public void clear() {
    this.lLZ.clear();
  }

  public void Z(short paramShort1, short paramShort2) {
    this.lLZ.hL(bCO.cN(paramShort1, paramShort2));
  }
}