import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class cFx extends dsQ
{
  private long izY;
  private long[] izZ;
  private cYk ifS;

  public boolean a(byte[] paramArrayOfByte)
  {
    if (!j(paramArrayOfByte.length, 29, false)) {
      return false;
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    aN(localByteBuffer);

    this.izY = localByteBuffer.getLong();
    long l = localByteBuffer.getLong();
    this.ifS = aUG.eF(l);

    int i = localByteBuffer.get() & 0xFF;
    if (i <= 0) {
      K.warn("Aucun fighter le détecte l'invisibilité ?");
    }

    if (!j(localByteBuffer.remaining(), 8 * i, true)) {
      return false;
    }
    this.izZ = new long[i];
    for (int j = 0; j < i; j = (byte)(j + 1)) {
      this.izZ[j] = localByteBuffer.getLong();
    }

    return true;
  }

  public int getId()
  {
    return 4508;
  }

  public long cAT()
  {
    return this.izY;
  }

  public long[] cAU() {
    return this.izZ;
  }

  public cYk cAV() {
    return this.ifS;
  }

  public int eo()
  {
    return 0;
  }

  public dPD ep()
  {
    return dPD.mhS;
  }
}