import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.FloatBuffer;
import javax.imageio.ImageIO;
import org.apache.log4j.Logger;

public class dLc extends dCQ
{
  private final BufferedImage lZC;

  public dLc()
  {
    this(96, 192, 1.5F, 0.5F, 0.1F);
  }

  public dLc(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3) {
    super(paramInt1, paramInt2, paramFloat1, paramFloat2, paramFloat3);

    this.lZC = new BufferedImage(this.lLm, this.lLn, 2);
  }

  public void a(ByteArrayOutputStream paramByteArrayOutputStream, String paramString)
  {
    c(paramByteArrayOutputStream, paramString);
  }

  public void v(String paramString1, String paramString2)
  {
    try {
      c(dtb.qd(paramString1), paramString2);
    } catch (IOException localIOException) {
      dCQ.ch().error("", localIOException);
    }
  }

  public void a(String paramString, dsP paramdsP)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    if (dfe()) {
      c(localByteArrayOutputStream, paramString);
      paramdsP.af(localByteArrayOutputStream.toByteArray());
    }
  }

  private void c(OutputStream paramOutputStream, String paramString) {
    djL();
    try
    {
      AffineTransform localAffineTransform = new AffineTransform();
      localAffineTransform.scale(1.0D, -1.0D);
      localAffineTransform.translate(0.0D, -this.lZC.getHeight(null));
      AffineTransformOp localAffineTransformOp = new AffineTransformOp(localAffineTransform, 1);

      BufferedImage localBufferedImage = localAffineTransformOp.filter(this.lZC, null);
      ImageIO.write(localBufferedImage, paramString, paramOutputStream);
    } catch (IOException localIOException) {
      dCQ.ch().error("Erreur ici", localIOException);
    }
  }

  private void djL() {
    Graphics2D localGraphics2D = this.lZC.createGraphics();
    localGraphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);

    this.dca.a(0, this.eSL, 0);
    int i = this.eSL.bvg();
    aoL localaoL = new aoL(i);
    Object localObject;
    for (int j = 0; j < i; j++) {
      localObject = (GeometryMesh)this.eSL.pW(j);
      uz localuz = this.eSL.jP(j);
      String str = localuz.getFileName();
      long l = byn.jp(str);
      localuz = (uz)localaoL.get(l);
      if (localuz == null) {
        localuz = dHL.lSB.dhZ().b(l, str, true);
        localuz.ad(false);
        localaoL.put(l, localuz);
      }
      a((GeometryMesh)localObject, localuz, localGraphics2D);
    }

    cHu localcHu = localaoL.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      localObject = (uz)localcHu.value();
      while (((uz)localObject).bpu() >= 0) {
        ((uz)localObject).axl();
      }
    }
    localGraphics2D.dispose();
    cleanup();
  }

  private void a(GeometryMesh paramGeometryMesh, uz paramuz, Graphics2D paramGraphics2D) {
    cSJ localcSJ = paramuz.wn(0);
    VertexBufferPCT localVertexBufferPCT = paramGeometryMesh.bIl();
    int i = localVertexBufferPCT.bSV() / 4;
    for (int j = 0; j < i; j++)
      a(paramGraphics2D, j, localVertexBufferPCT, localcSJ);
  }

  private void a(Graphics2D paramGraphics2D, int paramInt, VertexBufferPCT paramVertexBufferPCT, cSJ paramcSJ)
  {
    FloatBuffer localFloatBuffer1 = paramVertexBufferPCT.bSP();
    FloatBuffer localFloatBuffer2 = paramVertexBufferPCT.bSR();
    FloatBuffer localFloatBuffer3 = paramVertexBufferPCT.bSQ();

    int i = paramInt * 4;

    int j = (short)i;
    int k = (short)(i + 1);
    int m = (short)(i + 2);

    float f1 = localFloatBuffer1.get(j * 2) * this.dka + this.lLm * this.aZs;
    float f2 = localFloatBuffer1.get(k * 2) * this.dka + this.lLm * this.aZs;
    float f3 = localFloatBuffer1.get(m * 2) * this.dka + this.lLm * this.aZs;
    float f4 = localFloatBuffer1.get(j * 2 + 1) * this.dka + this.lLn * this.aZt;
    float f5 = localFloatBuffer1.get(k * 2 + 1) * this.dka + this.lLn * this.aZt;
    float f6 = localFloatBuffer1.get(m * 2 + 1) * this.dka + this.lLn * this.aZt;

    float f7 = localFloatBuffer2.get(j * 2);
    float f8 = localFloatBuffer2.get(m * 2);
    float f9 = localFloatBuffer2.get(j * 2 + 1);
    float f10 = localFloatBuffer2.get(k * 2 + 1);

    float f11 = localFloatBuffer3.get(j * 4) * 1.25F + 0.5F;
    float f12 = localFloatBuffer3.get(j * 4 + 1) * 1.25F + 0.5F;
    float f13 = localFloatBuffer3.get(j * 4 + 2) * 1.25F + 0.5F;
    float f14 = localFloatBuffer3.get(j * 4 + 3);

    cEl localcEl1 = new cEl(f1 - f2, f4 - f5);
    cEl localcEl2 = new cEl(f3 - f2, f6 - f5);

    int n = Math.round(f9 * paramcSJ.getHeight());
    int i1 = Math.round(f7 * paramcSJ.getWidth());
    int i2 = Math.round(f10 * paramcSJ.getHeight());
    int i3 = Math.round(f8 * paramcSJ.getWidth());
    cSJ localcSJ = crX.a(paramcSJ, i2, i1, n, i3);
    int i4 = localcSJ.getWidth();
    int i5 = localcSJ.getHeight();
    BufferedImage localBufferedImage = atf.a(i4, i5, localcSJ.getData(), dbx.kTw);
    atf.b(localBufferedImage);
    localcSJ.axl();

    RescaleOp localRescaleOp = new RescaleOp(new float[] { f11, f12, f13, f14 }, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, null);
    localBufferedImage = localRescaleOp.filter(localBufferedImage, null);

    float f15 = localcEl2.aOR / i4;
    float f16 = localcEl2.aOS / i4;
    float f17 = localcEl1.aOR / i5;
    float f18 = localcEl1.aOS / i5;

    AffineTransform localAffineTransform = new AffineTransform(f15, f16, f17, f18, f2, f5);
    paramGraphics2D.drawImage(localBufferedImage, localAffineTransform, null);
  }
}