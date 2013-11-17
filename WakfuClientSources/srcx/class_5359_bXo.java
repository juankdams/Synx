import org.apache.log4j.Logger;

public class bXo extends cSx
{
  private static Logger K = Logger.getLogger(bXo.class);

  private float dmV = 0.0F;

  public bXo(dOc paramdOc)
  {
    this.kET = paramdOc;
  }

  public void setValue(float paramFloat)
  {
    this.dmV = paramFloat;
  }

  public float getValue()
  {
    return this.dmV;
  }

  public CH mp()
  {
    return CH.bGC;
  }
}