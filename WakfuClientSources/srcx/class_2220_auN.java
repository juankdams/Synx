import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import java.nio.FloatBuffer;
import org.apache.log4j.Logger;

public class auN
  implements cix
{
  private static final Logger K = Logger.getLogger(auN.class);
  private int dJi;
  private VertexBufferPCT dJj;
  private float[] aWb;

  public void a(VertexBufferPCT paramVertexBufferPCT, float[] paramArrayOfFloat, int paramInt)
  {
    this.dJj = paramVertexBufferPCT;
    this.dJi = (paramVertexBufferPCT.bSV() * 4);
    if ((this.aWb == null) || (this.aWb.length != paramInt)) {
      this.aWb = new float[paramInt];
    }
    System.arraycopy(paramArrayOfFloat, 0, this.aWb, 0, paramInt);
  }

  public void k(float[] paramArrayOfFloat) {
    if (this.aWb == null) {
      return;
    }
    float f1 = paramArrayOfFloat[0];
    float f2 = paramArrayOfFloat[1];
    float f3 = paramArrayOfFloat[2];
    float f4 = 1.0F;

    int i = 0;
    int j = this.aWb.length / 4;
    for (int k = 0; k < j; k++) {
      this.aWb[(i++)] *= f1;
      this.aWb[(i++)] *= f2;
      this.aWb[(i++)] *= f3;
      this.aWb[(i++)] *= 1.0F;
    }
    FloatBuffer localFloatBuffer = this.dJj.bSQ();
    localFloatBuffer.position(this.dJi);
    localFloatBuffer.put(this.aWb);
  }
}