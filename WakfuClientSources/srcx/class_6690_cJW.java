import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import java.awt.Dimension;
import java.util.ArrayList;

public final class cJW extends bah
{
  private float ayE;
  private float ayF;
  private float iIr;
  private float iIs;
  private int iIt;
  private int iIu;
  private bGn eQa;

  public cJW()
  {
    this.eQa = bGn.gCA;
  }

  public void setMapDisplayer(dWq paramdWq)
  {
    super.setMapDisplayer(paramdWq);

    BatchTransformer localBatchTransformer = this.fhW.getEntity().dsE();
    localBatchTransformer.a(this.fhX);
    localBatchTransformer.a(this.fhY);
  }

  public void ai(float paramFloat1, float paramFloat2) {
    this.iIr = paramFloat1;
    this.iIs = paramFloat2;
    a(null);
  }

  public void setSize(int paramInt1, int paramInt2) {
    this.iIt = paramInt1;
    this.iIu = paramInt2;
    a(null);
  }

  public void a(float paramFloat1, float paramFloat2) {
    this.ayE = paramFloat1;
    this.ayF = paramFloat2;
    a(null);
  }

  protected void a(Dimension paramDimension)
  {
    float f1 = (this.iIr + this.ayE) * this.blZ;
    float f2 = (this.iIs + this.ayF) * this.blZ;

    N(this.iIt / 2 - f1, this.iIu / 2 - f2);
  }

  protected void aGQ()
  {
    if (this.bqm.aSj().isEmpty())
      this.bqm.d(this.fhW.getEntity());
    else
      this.bqm.a(0, this.fhW.getEntity());
  }
}