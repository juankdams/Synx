import com.ankamagames.framework.graphics.engine.VertexBufferPCT;

public class cWi extends biA
{
  protected void b(VertexBufferPCT paramVertexBufferPCT, int paramInt)
  {
    paramVertexBufferPCT.tg(paramInt);
    if (this.bQC != null)
    {
      int j = 0;
      for (int k = 0; k < paramInt; k++) {
        float f1 = 1.0F - Math.abs((paramInt / 2.0F - k) / (paramInt / 2.0F));
        int i = k % 4 < 2 ? 1 : 0;
        j = j == 0 ? 1 : 0;
        float f2 = i != 0 ? this.bQC.bjK() : this.bQC.bjJ();
        float f3 = j != 0 ? this.bQC.bjL() : this.bQC.bjM();
        paramVertexBufferPCT.c(k, f2, f3);
        paramVertexBufferPCT.a(k, 1.0F, 1.0F, 1.0F, f1);
      }
    }
  }

  public void aJ() {
    super.aJ();
    bj(0.95F);
  }
}