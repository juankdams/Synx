import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import javax.imageio.ImageIO;
import javax.media.opengl.GL;
import org.apache.log4j.Logger;

public class Jj extends dCQ
{
  boolean bvA = false;
  final bAU aMs;

  public Jj(bAU parambAU)
  {
    this(96, 192, 1.5F, 0.5F, 0.1F, parambAU);
  }

  public Jj(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, bAU parambAU) {
    super(paramInt1, paramInt2, paramFloat1, paramFloat2, paramFloat3);
    this.aMs = parambAU;
  }

  public void a(ByteArrayOutputStream paramByteArrayOutputStream, String paramString)
  {
    a(paramString, new cHz(this, paramByteArrayOutputStream));
  }

  public void v(String paramString1, String paramString2)
  {
    a(paramString2, new cHy(this, paramString1));
  }

  public void a(String paramString, dsP paramdsP)
  {
    this.aMs.a(new cHv(this, paramString, paramdsP));
  }

  public void cancel()
  {
    this.bvA = true;
  }

  private int b(GL paramGL)
  {
    int[] arrayOfInt = new int[1];
    paramGL.glEnable(3553);
    cdg.a(paramGL, this.lLm, this.lLn, arrayOfInt, true);
    return arrayOfInt[0];
  }

  private byte[] a(int paramInt, ayc paramayc, String paramString) {
    GL localGL = (GL)paramayc.bZk();
    int i = this.lLm;
    int j = this.lLn;

    float[] arrayOfFloat = new float[4];
    localGL.glGetFloatv(3106, arrayOfFloat, 0);

    dsZ.cZe().x(paramayc);
    localGL.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);

    paramayc.dNI.qH(0);
    dsZ localdsZ = dsZ.cZe();

    localdsZ.a(localGL, aLv.epO, Matrix44.bFe);
    localdsZ.a(localGL, aLv.epN, Matrix44.bFe);

    Fi localFi = new Fi(0, 0, i, j);
    localdsZ.a(localGL, localFi);

    localdsZ.reset();
    Pb.aaU().aaX();

    ajQ.axf().c(localGL);

    localdsZ.a(localGL, aLv.epP, Matrix44.bFe);
    paramayc.g(Matrix44.bFe);

    float f1 = localFi.ON() * (this.aZs - 0.5F) / this.dka;
    float f2 = localFi.OO() * (this.aZt - 0.5F) / this.dka;

    this.eSL.setColor(1.0F, 1.0F, 1.0F, 1.0F);

    cxn localcxn = new cxn();
    localcxn.c(this.dka, this.dka, 1.0F);
    localcxn.b(f1, f2, 0.0F);
    this.eSL.a(FB.bMT);
    this.eSL.b(FB.bMT);
    this.dca.a(0, this.eSL, 0);

    localdsZ.dk(2.0F);

    this.eSL.dsE().a(localcxn);
    this.eSL.p(paramayc);
    localdsZ.ks(true);

    localGL.glBindTexture(3553, paramInt);
    localGL.glCopyTexImage2D(3553, 0, 6408, 0, 0, i, j, 0);

    byte[] arrayOfByte = new byte[i * j * 4];
    ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte);
    localGL.glGetTexImage(3553, 0, 6408, 5121, localByteBuffer);

    BufferedImage localBufferedImage1 = atf.a(i, j, arrayOfByte, dbx.kTw);

    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    try {
      BufferedImage localBufferedImage2 = atf.a(localBufferedImage1, true);
      ImageIO.write(localBufferedImage2, paramString, localByteArrayOutputStream);
    } catch (IOException localIOException) {
      dCQ.ch().error("", localIOException);
    }

    localdsZ.reset();

    localGL.glClearColor(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2], arrayOfFloat[3]);

    return localByteArrayOutputStream.toByteArray();
  }
}