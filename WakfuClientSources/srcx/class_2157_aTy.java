import com.sun.opengl.util.texture.TextureCoords;
import java.nio.ByteBuffer;

public class aTy extends dzZ
{
  protected final TextureCoords[] eRC;

  public aTy(int paramInt, short[] paramArrayOfShort, TextureCoords[] paramArrayOfTextureCoords)
  {
    super(paramInt, paramArrayOfShort);
    this.eRC = paramArrayOfTextureCoords;
  }

  public static aTy a(dFd paramdFd)
  {
    TextureCoords[] arrayOfTextureCoords = a(dFd.b(paramdFd), dFd.c(paramdFd), dFd.d(paramdFd), dFd.e(paramdFd), dFd.f(paramdFd), false);

    return new aTy(paramdFd.lGH, paramdFd.lGI, arrayOfTextureCoords);
  }

  public static aTy b(ByteBuffer paramByteBuffer, boolean paramBoolean) {
    return a(aYQ.ar(paramByteBuffer), paramBoolean);
  }

  public static aTy a(aYQ paramaYQ, boolean paramBoolean) {
    return (aTy)dzZ.b(false, paramaYQ, paramBoolean);
  }

  public void a(dSw paramdSw)
  {
    throw new UnsupportedOperationException("utiliser la classe AnimData.Export");
  }

  public TextureCoords br(short paramShort)
  {
    int i = (paramShort & 0xFFFF) % this.lGH;

    for (int j = 0; j < this.lGI.length; j++) {
      i -= this.lGI[j];
      if (i < 0)
        return this.eRC[j];
    }
    return this.eRC[0];
  }
}