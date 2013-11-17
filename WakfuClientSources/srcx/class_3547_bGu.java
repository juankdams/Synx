import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class bGu extends dzz
{
  private byte gCW;
  private ByteBuffer ben;

  public boolean a(byte[] paramArrayOfByte)
  {
    if (!j(paramArrayOfByte.length, 1, false))
      return false;
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.gCW = localByteBuffer.get();
    byte[] arrayOfByte = new byte[paramArrayOfByte.length - 1];
    localByteBuffer.get(arrayOfByte);
    this.ben = ByteBuffer.wrap(arrayOfByte);
    return true;
  }

  public int getId() {
    return 106;
  }

  public byte bOq() {
    return this.gCW;
  }

  public String BN()
  {
    if (this.ben.remaining() < 2) {
      K.error("extractStringParameter() impossible d'extraire la taille de la chaîne : " + this.ben.remaining() + " bytes restant dans le buffer (2 requis)");
      return null;
    }
    int i = this.ben.get() & 0xFF;
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
}