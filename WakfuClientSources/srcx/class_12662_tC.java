import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class tC extends dzz
{
  private static final Logger K = Logger.getLogger(aIG.class);
  protected short bem;
  protected ByteBuffer ben;

  public void aJ()
  {
    super.aJ();
    this.bem = 0;
    this.ben = null;
  }

  public void bc() {
    super.bc();
    this.bem = 0;
    this.ben = null;
  }

  public short BM()
  {
    return this.bem;
  }

  public boolean a(byte[] paramArrayOfByte)
  {
    if (!j(paramArrayOfByte.length, 4, false))
      return false;
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bem = localByteBuffer.getShort();
    int i = localByteBuffer.getShort() & 0xFFFF;
    if (!j(paramArrayOfByte.length - 4, i, true))
      return false;
    byte[] arrayOfByte = new byte[i];
    localByteBuffer.get(arrayOfByte);
    this.ben = ByteBuffer.wrap(arrayOfByte);
    return true;
  }

  public int getId()
  {
    return 109;
  }

  public String BN()
  {
    if (this.ben.remaining() < 2) {
      K.error("extractStringParameter() impossible d'extraire la taille de la chaîne : " + this.ben.remaining() + " bytes restant dans le buffer (2 requis)");
      return null;
    }
    int i = this.ben.getShort() & 0xFFFF;
    byte[] arrayOfByte = new byte[i];
    if (this.ben.remaining() < i) {
      K.error("extractStringParameter() impossible d'extraire la chaîne : " + this.ben.remaining() + " bytes restant dans le buffer (" + i + " requis)");
      return null;
    }
    this.ben.get(arrayOfByte);
    return dzp.aJ(arrayOfByte);
  }

  public int BO()
  {
    if (this.ben.remaining() < 4) {
      K.error("extractIntParameter() impossible d'extraire l'Integer : " + this.ben.remaining() + " bytes restant dans le buffer (4 requis)");
      return 0;
    }
    return this.ben.getInt();
  }

  public boolean cV(int paramInt) {
    return this.ben.remaining() >= paramInt;
  }

  public boolean BP()
  {
    if (this.ben.remaining() < 1) {
      K.error("extractBooleanParameter() impossible d'extraire le Boolean : " + this.ben.remaining() + " bytes restant dans le buffer (1 requis)");
      return false;
    }
    return this.ben.get() != 0;
  }

  public byte BQ()
  {
    if (this.ben.remaining() < 1) {
      K.error("extractByteParameter() impossible d'extraire le Byte : " + this.ben.remaining() + " bytes restant dans le buffer (1 requis)");
      return 0;
    }
    return this.ben.get();
  }

  public long BR()
  {
    if (this.ben.remaining() < 8) {
      K.error("extractLongParameter() impossible d'extraire le Long : " + this.ben.remaining() + " bytes restant dans le buffer (8 requis)");
      return 0L;
    }
    return this.ben.getLong();
  }

  public short BS()
  {
    if (this.ben.remaining() < 2) {
      K.error("extractShortParameter() impossible d'extraire le Short : " + this.ben.remaining() + " bytes restant dans le buffer (2 requis)");
      return 0;
    }
    return this.ben.getShort();
  }

  public float BT()
  {
    if (this.ben.remaining() < 4) {
      K.error("extractFloatParameter() impossible d'extraire le Float : " + this.ben.remaining() + " bytes restant dans le buffer (4 requis)");
      return 0.0F;
    }
    return this.ben.getFloat();
  }
}