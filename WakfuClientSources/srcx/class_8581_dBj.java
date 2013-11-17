import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class dBj extends dsQ
{
  private final List lIN = new ArrayList();
  private final List lIO = new ArrayList();
  private final List frD = new ArrayList();
  private boolean iGR;

  public boolean a(byte[] paramArrayOfByte)
  {
    if (!j(paramArrayOfByte.length, 13, false)) {
      return false;
    }

    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    aN(localByteBuffer);

    this.iGR = (localByteBuffer.get() == 1);
    if (!this.iGR) {
      int i = localByteBuffer.get();
      long l;
      for (int j = 0; j < i; j++) {
        l = localByteBuffer.getLong();
        this.lIN.add(Long.valueOf(l));
      }

      i = localByteBuffer.get();
      for (j = 0; j < i; j++) {
        l = localByteBuffer.getLong();
        this.lIO.add(Long.valueOf(l));
      }

      i = localByteBuffer.get();
      for (j = 0; j < i; j++) {
        l = localByteBuffer.getLong();
        this.frD.add(Long.valueOf(l));
      }
    }

    return true;
  }

  public int getId()
  {
    return 8300;
  }

  public List deA() {
    return this.lIN;
  }

  public List deB() {
    return this.lIO;
  }

  public List deC() {
    return this.frD;
  }

  public int eo()
  {
    return 0;
  }

  public dPD ep()
  {
    return dPD.mhj;
  }

  public boolean deD() {
    return this.iGR;
  }
}