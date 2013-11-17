import com.sun.opengl.util.texture.TextureData;
import com.sun.opengl.util.texture.TextureIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import javax.imageio.ImageIO;
import org.apache.log4j.Logger;

public class FL extends aoI
{
  private static final Logger K = Logger.getLogger(FL.class);

  public crX bU(String paramString)
  {
    BufferedImage localBufferedImage = null;
    try {
      InputStream localInputStream = dtb.pT(paramString);
      localBufferedImage = ImageIO.read(localInputStream);
      localInputStream.close();
    } catch (IOException localIOException) {
      K.error("Exception", localIOException);
    }

    if (localBufferedImage == null) {
      return null;
    }

    return a(localBufferedImage);
  }

  private static crX a(BufferedImage paramBufferedImage) {
    TextureData localTextureData = TextureIO.newTextureData(paramBufferedImage, 6407, 6407, false);

    Buffer localBuffer = localTextureData.getBuffer();
    cSJ localcSJ = new cSJ(localTextureData.getWidth(), localTextureData.getHeight(), (short)24, null, ((ByteBuffer)localBuffer).array(), 0, localBuffer.limit());

    crX localcrX = new crX(bIN.gJk, localcSJ);
    localcSJ.axl();
    return localcrX;
  }

  protected crX a(aYQ paramaYQ)
  {
    throw new UnsupportedOperationException("pas bien : appeler loadImage(String filename)");
  }

  protected MD b(aYQ paramaYQ)
  {
    paramaYQ.os(10);
    return new MD(paramaYQ.readShort(), paramaYQ.readShort());
  }

  protected int aU()
  {
    return 14;
  }
}