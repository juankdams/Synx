import java.util.ArrayList;

class awC
{
  private final cyd dLP = new cyd();
  private final aDR dLQ;

  private awC(aDR paramaDR)
  {
    this.dLQ = paramaDR;
    this.dLP.setSpeed(1.0F);
    this.dLP.cs(0.001F);
    this.dLP.set(0.0F);
  }

  public void aH(float paramFloat) {
    this.dLP.cu(paramFloat);
  }

  public void update(int paramInt) {
    this.dLP.xd(paramInt);
    this.dLQ.update(paramInt);
  }

  public void x(ArrayList paramArrayList) {
    float f = xP();
    ArrayList localArrayList = this.dLQ.aQb();
    int i = localArrayList.size();
    for (int j = 0; j < i; j++) {
      dRE localdRE = (dRE)localArrayList.get(j);
      localdRE.A(f);
      paramArrayList.add(localdRE);
    }
  }

  public final float xP() {
    return this.dLP.getValue();
  }
}