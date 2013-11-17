import org.apache.log4j.Logger;

public class aoq extends dKf
{
  private static final Logger K = Logger.getLogger(aoq.class);
  private short dts;

  public aoq(int paramInt)
  {
    super(paramInt);
  }

  public boolean f(gA paramgA) {
    byo localbyo = byv.bFN().bFO().bSo();
    if ((localbyo != null) && (localbyo.uO() != this.dts)) {
      K.info("[RIDE] Impossible d'utiliser deux monture à la fois");
      return false;
    }

    bZ(paramgA.oj());
    return true;
  }

  public void c(String[] paramArrayOfString) {
    this.dts = Short.valueOf(paramArrayOfString[0]).shortValue();
  }

  public void clear()
  {
  }
}