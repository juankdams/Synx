import com.sun.opengl.util.texture.TextureData;
import com.sun.opengl.util.texture.TextureIO;
import java.awt.Graphics;
import java.awt.color.ColorSpace;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.ComponentColorModel;
import java.awt.image.DataBufferByte;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Iterator;
import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.MemoryCacheImageOutputStream;
import org.apache.log4j.Logger;

public class atf
{
  protected static final Logger K = Logger.getLogger(atf.class);

  public static BufferedImage a(BufferedImage paramBufferedImage, int paramInt)
  {
    BufferedImage localBufferedImage = new BufferedImage(paramBufferedImage.getWidth() + paramInt * 2, paramBufferedImage.getHeight() + paramInt * 2, 2);
    Graphics localGraphics = localBufferedImage.getGraphics();
    localGraphics.drawImage(paramBufferedImage, paramInt, paramInt, null);
    localGraphics.dispose();
    return localBufferedImage;
  }

  public static void b(BufferedImage paramBufferedImage)
  {
    if (paramBufferedImage != null)
    {
      for (int i = 0; i < paramBufferedImage.getHeight(); i++) {
        int j = i + paramBufferedImage.getMinY();
        for (int k = 0; k < paramBufferedImage.getWidth(); k++) {
          int m = k + paramBufferedImage.getMinX();

          int n = paramBufferedImage.getRGB(m, j);
          float f1 = (n >> 24 & 0xFF) / 255.0F;
          if (f1 != 0.0F)
          {
            float f2 = (n >> 16 & 0xFF) / 255.0F;
            float f3 = (n >> 8 & 0xFF) / 255.0F;
            float f4 = (n & 0xFF) / 255.0F;

            f2 = f2 / f1 < 1.0F ? f2 / f1 : 1.0F;
            f3 = f3 / f1 < 1.0F ? f3 / f1 : 1.0F;
            f4 = f4 / f1 < 1.0F ? f4 / f1 : 1.0F;

            n = (int)(f1 * 255.0F) << 24 | (int)(f2 * 255.0F) << 16 | (int)(f3 * 255.0F) << 8 | (int)(f4 * 255.0F);
            paramBufferedImage.setRGB(m, j, n);
          }
        }
      }
    }
  }

  public static void c(BufferedImage paramBufferedImage) {
    if (paramBufferedImage != null)
    {
      for (int i = 0; i < paramBufferedImage.getHeight(); i++) {
        int j = i + paramBufferedImage.getMinY();
        for (int k = 0; k < paramBufferedImage.getWidth(); k++) {
          int m = k + paramBufferedImage.getMinX();

          int n = paramBufferedImage.getRGB(m, j);
          float f1 = (n >> 24 & 0xFF) / 255.0F;
          float f2 = (n >> 16 & 0xFF) / 255.0F * f1;
          float f3 = (n >> 8 & 0xFF) / 255.0F * f1;
          float f4 = (n & 0xFF) / 255.0F * f1;

          paramBufferedImage.setRGB(m, j, (int)(f1 * 255.0F) << 24 | (int)(f2 * 255.0F) << 16 | (int)(f3 * 255.0F) << 8 | (int)(f4 * 255.0F));
        }
      }
    }
  }

  public static BufferedImage d(BufferedImage paramBufferedImage) {
    BufferedImage localBufferedImage = new BufferedImage(paramBufferedImage.getWidth(), paramBufferedImage.getHeight(), 2);
    Graphics localGraphics = localBufferedImage.getGraphics();
    localGraphics.drawImage(paramBufferedImage, 0, 0, null);
    localGraphics.dispose();
    return localBufferedImage;
  }

  public static BufferedImage e(BufferedImage paramBufferedImage) {
    BufferedImage localBufferedImage = new BufferedImage(paramBufferedImage.getWidth(), paramBufferedImage.getHeight(), 3);
    Graphics localGraphics = localBufferedImage.getGraphics();
    localGraphics.drawImage(paramBufferedImage, 0, 0, null);
    localGraphics.dispose();
    return localBufferedImage;
  }

  public static BufferedImage e(InputStream paramInputStream)
  {
    try
    {
      TextureData localTextureData = TextureIO.newTextureData(paramInputStream, false, "tga");
      int i = localTextureData.getHeight();
      int j = localTextureData.getWidth();

      int k = 4 * j;

      ByteBuffer localByteBuffer1 = ByteBuffer.allocate(k * i);
      ByteBuffer localByteBuffer2 = (ByteBuffer)localTextureData.getBuffer();

      byte[] arrayOfByte = new byte[j * 4];

      int m = k * i;
      for (int n = 0; n < i; n++) {
        m -= k;
        localByteBuffer2.get(arrayOfByte);
        localByteBuffer1.position(m);
        localByteBuffer1.put(arrayOfByte);
      }

      localByteBuffer1.rewind();

      return a(j, i, localByteBuffer1.array(), dbx.kTx);
    } catch (IOException localIOException) {
      K.error("Exception", localIOException);
    }return null;
  }

  public static BufferedImage fG(String paramString)
  {
    try {
      FileInputStream localFileInputStream = new FileInputStream(paramString);
      return e(localFileInputStream);
    } catch (FileNotFoundException localFileNotFoundException) {
      K.error("Exception", localFileNotFoundException);
    }

    return null;
  }

  public static BufferedImage a(BufferedImage paramBufferedImage, boolean paramBoolean) {
    if (paramBufferedImage == null) {
      return null;
    }
    int i = paramBufferedImage.getWidth();
    int j = paramBufferedImage.getHeight();
    BufferedImage localBufferedImage = new BufferedImage(i, j, 2);
    localBufferedImage.getGraphics().drawImage(paramBufferedImage, 0, 0, i, j, 0, 0, i, j, null);
    if (paramBoolean)
    {
      AffineTransform localAffineTransform = AffineTransform.getScaleInstance(1.0D, -1.0D);
      localAffineTransform.translate(0.0D, -paramBufferedImage.getHeight(null));
      AffineTransformOp localAffineTransformOp = new AffineTransformOp(localAffineTransform, 1);
      localBufferedImage = localAffineTransformOp.filter(localBufferedImage, null);
    }
    return localBufferedImage;
  }

  public static dQx b(BufferedImage paramBufferedImage, int paramInt)
  {
    int i = paramBufferedImage.getWidth();
    int j = paramBufferedImage.getHeight();
    int k = 0;
    int m = i;
    int n = 0;
    int i1 = j;
    int i3;
    int i4;
    for (int i2 = 0; i2 < i1; i2++) {
      for (i3 = 0; i3 < m; i3++) {
        i4 = (paramBufferedImage.getRGB(i3, i2) & 0xFF000000) >> 24 & 0xFF;
        if (i4 > paramInt) {
          m = i3;
          if (k != 0) break;
          k = i2; break;
        }

      }

    }

    for (i2 = j - 1; i2 > k; i2--) {
      for (i3 = i - 1; i3 > n; i3--) {
        i4 = (paramBufferedImage.getRGB(i3, i2) & 0xFF000000) >> 24 & 0xFF;
        if (i4 > paramInt) {
          n = i3;
          if (i1 != j) break;
          i1 = i2; break;
        }

      }

    }

    if ((m == i) || (k == j))
    {
      return new dQx(0, 0, 0, 0);
    }if (m >= n) {
      return new dQx(0, i, 0, j);
    }
    return new dQx(m, n + 1, k, i1 + 1);
  }

  public static BufferedImage a(int paramInt1, int paramInt2, byte[] paramArrayOfByte, dbx paramdbx)
  {
    if ((paramInt1 == 0) || (paramInt2 == 0)) {
      return null;
    }

    DataBufferByte localDataBufferByte = new DataBufferByte(paramArrayOfByte, paramInt1 * paramInt2);

    int i = 4;
    int j = 4 * paramInt1;
    WritableRaster localWritableRaster = Raster.createInterleavedRaster(localDataBufferByte, paramInt1, paramInt2, j, 4, paramdbx.apl(), null);

    ColorSpace localColorSpace = ColorSpace.getInstance(1000);
    int k = 1;
    int m = 0;
    int n = 3;
    int i1 = 0;
    ComponentColorModel localComponentColorModel = new ComponentColorModel(localColorSpace, true, false, 3, 0);

    return new BufferedImage(localComponentColorModel, localWritableRaster, false, null);
  }

  public static void a(BufferedImage paramBufferedImage, OutputStream paramOutputStream, float paramFloat) {
    if ((!bB) && ((paramFloat < 0.0F) || (paramFloat > 1.0F))) throw new AssertionError();
    Iterator localIterator = ImageIO.getImageWritersByFormatName("jpeg");
    ImageWriter localImageWriter = (ImageWriter)localIterator.next();
    ImageWriteParam localImageWriteParam = localImageWriter.getDefaultWriteParam();
    localImageWriteParam.setCompressionMode(2);
    localImageWriteParam.setCompressionQuality(paramFloat);
    localImageWriter.setOutput(new MemoryCacheImageOutputStream(paramOutputStream));
    localImageWriter.write(null, new IIOImage(paramBufferedImage, null, null), localImageWriteParam);
    localImageWriter.dispose();
  }

  public static void a(BufferedImage paramBufferedImage, String paramString) {
    TextureData localTextureData = new TextureData(6408, 6408, false, paramBufferedImage);

    Buffer localBuffer = localTextureData.getBuffer();
    cSJ localcSJ = new cSJ(localTextureData.getWidth(), localTextureData.getHeight(), (short)32, null, ((ByteBuffer)localBuffer).array(), 0, localBuffer.limit());
    axE localaxE = new axE();
    localcSJ.za(0);
    crX.o(localcSJ.getData(), localcSJ.getBitDepth());
    crX.p(localcSJ.getData(), localcSJ.getWidth() * 4);

    FileOutputStream localFileOutputStream = dtb.qd(paramString);
    dSw localdSw = new dSw(localFileOutputStream);
    localaxE.a(localdSw, new crX(bIN.gJg, localcSJ));
    localcSJ.axl();
    localdSw.close();
  }
}