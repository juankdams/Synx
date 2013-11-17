import org.apache.log4j.Logger;

public class xV
  implements aqg
{
  protected static final Logger K = Logger.getLogger(xV.class);

  private static xV bqR = new xV();
  private static final float bqS = 25.0F;
  private static final float bqT = 1.0F;
  private static final float bqU = 0.0F;
  private static final double bqV = -0.5235987755982988D;
  private boolean bqW;
  private float bqX;
  private float bqY;

  private xV()
  {
    this.bqW = false;

    this.bqX = 0.0F;
    this.bqY = 0.0F;
  }

  public void a(aQm paramaQm, aKS paramaKS) {
    switch (IY.bSf[paramaQm.ordinal()]) {
    case 1:
      if (paramaKS.isSynchronized())
        a((dDE)paramaKS);
      break;
    }
  }

  public void a(dDE paramdDE)
  {
  }

  public float GR()
  {
    return this.bqX;
  }

  public float GS()
  {
    return this.bqY;
  }

  public boolean GT() {
    return this.bqW;
  }

  public void am(boolean paramBoolean) {
    this.bqW = paramBoolean;
  }

  public static xV GU() {
    return bqR;
  }
}