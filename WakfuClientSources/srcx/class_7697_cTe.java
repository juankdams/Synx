import java.util.ArrayList;
import org.apache.log4j.Logger;

public abstract class cTe extends dRq
{
  private static final Logger K = Logger.getLogger(cTe.class);
  protected ArrayList biK;
  protected boolean kFN = false;

  public static final int kFO = "colors".hashCode();

  public void setColors(ArrayList paramArrayList)
  {
    if (this.biK == paramArrayList) {
      return;
    }

    this.biK = paramArrayList;

    this.kFN = true;
    setNeedsToPreProcess();
  }

  protected abstract void coy();

  public boolean bb(int paramInt)
  {
    boolean bool = super.bb(paramInt);

    if (this.kFN) {
      coy();
      this.kFN = false;
    }

    return bool;
  }

  public void bc()
  {
    super.bc();

    setColors(null);
  }

  public void aJ()
  {
    super.aJ();

    this.kFN = false;
    this.biK = new ArrayList();
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject)
  {
    if (paramInt == kFO)
      setColors((ArrayList)paramObject);
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }
    return true;
  }
}