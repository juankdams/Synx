import java.io.ByteArrayInputStream;
import javax.imageio.ImageIO;

public class bBh
{
  public static bsn b(aYQ paramaYQ, int paramInt)
  {
    byte[] arrayOfByte = paramaYQ.ot(paramInt);
    ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
    return new bsn(ImageIO.read(localByteArrayInputStream), true);
  }

  public static bsn s(aYQ paramaYQ)
  {
    int i = paramaYQ.readUnsignedShort();
    int j = paramaYQ.readUnsignedShort();
    int k = (int)paramaYQ.readUnsignedInt();
    byte[] arrayOfByte = null;
    if (k > 0) {
      arrayOfByte = paramaYQ.ot(k);
    }
    return new bsn(i, j, arrayOfByte);
  }
}