import com.sun.opengl.util.texture.TextureData;
import com.sun.opengl.util.texture.TextureIO;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.apache.log4j.Logger;

public class dwP extends aoI
{
  private static final Logger K = Logger.getLogger(dwP.class);

  public crX bU(String paramString)
  {
    try {
      InputStream localInputStream = dtb.pT(paramString);
      crX localcrX = o(localInputStream);
      localInputStream.close();
      return localcrX;
    } catch (IOException localIOException) {
      K.error("Exception", localIOException);
    }
    return null;
  }

  private static crX o(InputStream paramInputStream) {
    TextureData localTextureData = TextureIO.newTextureData(paramInputStream, 6408, 6408, false, "png");
    Buffer localBuffer = localTextureData.getBuffer();
    cSJ localcSJ = new cSJ(localTextureData.getWidth(), localTextureData.getHeight(), (short)32, null, ((ByteBuffer)localBuffer).array(), 0, localBuffer.limit());
    crX localcrX = new crX(bIN.gJi, localcSJ);
    localcSJ.axl();
    return localcrX;
  }

  protected crX a(aYQ paramaYQ)
  {
    try {
      paramaYQ.a(ByteOrder.BIG_ENDIAN);
      return o(new ut(paramaYQ));
    } catch (IOException localIOException) {
      K.error("Exception", localIOException);
    }

    return null;
  }

  protected MD b(aYQ paramaYQ)
  {
    paramaYQ.a(ByteOrder.BIG_ENDIAN);
    byte[] arrayOfByte = new byte[8];
    paramaYQ.W(arrayOfByte);
    if (!aI(arrayOfByte)) {
      return null;
    }

    paramaYQ.os(8);
    return new MD(paramaYQ.readInt(), paramaYQ.readInt());
  }

  private static boolean aI(byte[] paramArrayOfByte) {
    return (paramArrayOfByte[0] == -119) && (paramArrayOfByte[1] == 80) && (paramArrayOfByte[2] == 78) && (paramArrayOfByte[3] == 71) && (paramArrayOfByte[4] == 13) && (paramArrayOfByte[5] == 10) && (paramArrayOfByte[6] == 26) && (paramArrayOfByte[7] == 10);
  }

  protected int aU()
  {
    return 24;
  }
}