import org.apache.log4j.Logger;

public class cwG extends cdR
{
  protected static final Logger K = Logger.getLogger(cwG.class);
  protected aYH iiQ;
  private float iiR = 1.0F;

  public cwG(bYb parambYb) {
    super(parambYb);
    ((bYb)this.gCl).a(this.gCm);
  }

  public float ctV() {
    return this.iiR;
  }

  public final void cq(float paramFloat)
  {
    this.iiR *= paramFloat;
  }

  public void cr(float paramFloat) {
    this.iiR = paramFloat;
  }

  public void Qk()
  {
    if (!isActive()) {
      return;
    }
    for (int i = 0; i < this.hxQ.length; i++)
      this.hxQ[i].a(this.hxR[i]);
  }

  public final void update(int paramInt)
  {
  }

  public final void b(aYH paramaYH)
  {
    this.iiQ = paramaYH;
  }

  public boolean isActive() {
    return (this.iiQ == null) || (this.iiQ.floatValue() == 1.0F);
  }
}