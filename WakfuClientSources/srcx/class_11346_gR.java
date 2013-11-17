import java.nio.ByteBuffer;
import java.util.zip.CRC32;
import org.apache.log4j.Logger;

public abstract class gR
{
  protected static final Logger K = Logger.getLogger(gR.class);
  private static final CRC32 aFT = new CRC32();
  private int aFU;
  private short aFV;
  private long aFW;
  private long aFX;
  private boolean aFY;
  private long aFZ;
  private boolean aGa;

  private gR()
  {
    this.aFY = false;
    this.aFW = System.currentTimeMillis();
    this.aFX = 9223372036854775807L;
    this.aGa = false;
    this.aFY = false;
  }

  protected gR(short paramShort) {
    this();
    this.aFV = paramShort;
  }

  public int oW()
  {
    return this.aFU;
  }

  public void aL(int paramInt) {
    this.aFU = paramInt;
  }

  public short oX()
  {
    return this.aFV;
  }

  public void m(short paramShort) {
    this.aFV = paramShort;
  }

  public long c(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0)) {
      aFT.reset();
      aFT.update(paramArrayOfByte);
      this.aFZ = aFT.getValue();
    } else {
      this.aFZ = 0L;
    }
    return this.aFZ;
  }

  public final void oY()
  {
    if (!this.aGa) {
      if (this.aFX < 9223372036854775807L)
        this.aFY = true;
    }
    else K.error("toggleModified sur un BinaryStorable flaggé UNUSED " + oW());
  }

  public abstract int oZ();

  public abstract byte[] pa();

  public abstract void a(ByteBuffer paramByteBuffer, int paramInt, short paramShort);

  public abstract gR pb();

  public long pc()
  {
    return this.aFX;
  }

  public void F(long paramLong)
  {
    this.aFX = paramLong;
  }

  public boolean pd()
  {
    return this.aFY;
  }

  public long pe()
  {
    return this.aFW;
  }

  public void a(aZl paramaZl) {
    paramaZl.a(anm.dqU, this);
    this.aFY = false;
    this.aFW = System.currentTimeMillis();
  }

  public void b(aZl paramaZl) {
    paramaZl.a(anm.dqT, this);
    this.aFY = false;
    this.aFW = System.currentTimeMillis();
  }

  public boolean pf() {
    return this.aGa;
  }

  public String toString() {
    return "Bstorable type:" + oZ() + ", id:" + oW() + ", version:" + oX();
  }
}