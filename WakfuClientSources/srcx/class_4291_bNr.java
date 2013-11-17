import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT.ObjectFactory;
import javax.media.opengl.GL;
import org.apache.log4j.Logger;

public abstract class bNr extends cDv
{
  protected static Logger K = Logger.getLogger(bNr.class);

  protected static long gSe = 500000000L;

  protected static float gSf = -512.0F;
  protected static float gSg = -512.0F;
  protected static float gSh = 1024.0F;
  protected static float gSi = 1024.0F;
  protected VertexBufferPCT aVY;

  public void initialize()
  {
    super.initialize();

    this.aVY = VertexBufferPCT.gNI.zN(4);

    d(this.aVY);
  }

  public void cleanUp() {
    this.aVY.axl();
    super.cleanUp();
  }

  private void d(VertexBufferPCT paramVertexBufferPCT)
  {
    int i = 0;
    float[] arrayOfFloat1 = new float[8];
    arrayOfFloat1[(i++)] = gSf;
    arrayOfFloat1[(i++)] = (gSg + gSi);
    arrayOfFloat1[(i++)] = gSf;
    arrayOfFloat1[(i++)] = gSg;
    arrayOfFloat1[(i++)] = (gSf + gSh);
    arrayOfFloat1[(i++)] = gSg;
    arrayOfFloat1[(i++)] = (gSf + gSh);
    arrayOfFloat1[(i++)] = (gSg + gSi);
    paramVertexBufferPCT.A(arrayOfFloat1);

    int j = 0;
    float[] arrayOfFloat2 = new float[8];
    arrayOfFloat2[(j++)] = 0.0F;
    arrayOfFloat2[(j++)] = 0.0F;
    arrayOfFloat2[(j++)] = 0.0F;
    arrayOfFloat2[(j++)] = 1.0F;
    arrayOfFloat2[(j++)] = 1.0F;
    arrayOfFloat2[(j++)] = 1.0F;
    arrayOfFloat2[(j++)] = 1.0F;
    arrayOfFloat2[(j++)] = 0.0F;
    paramVertexBufferPCT.G(arrayOfFloat2);

    float[] arrayOfFloat3 = new float[16];
    for (int k = 0; k < 16; k++)
      arrayOfFloat3[k] = bCO.bLk();
    paramVertexBufferPCT.E(arrayOfFloat3);
  }

  protected void bVb() {
    float f1 = gSh / 2.0F;
    float f2 = gSi / 2.0F;

    dsZ.cZe().a(this.dzZ, 0, 0, (int)gSh, (int)gSi);
    this.dzZ.glOrtho(-f1, f1, -f2, f2, 0.0D, 65535.0D);
    dsZ.cZe().a(this.dzZ, aLv.epN);
  }
}