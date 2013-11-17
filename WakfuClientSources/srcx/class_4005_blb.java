import org.apache.log4j.Logger;

public abstract class blb extends cgs
{
  private cgs fBS;
  private cgs fBT;

  public blb(cgs paramcgs1, cgs paramcgs2)
  {
    if ((paramcgs1 == null) || (paramcgs2 == null)) {
      cgs.ch().error("Problème dans un " + getClass().getName() + " : un des Spring est null");
    }
    if (paramcgs1 != null)
      this.fBS = paramcgs1;
    else {
      this.fBS = vi(0);
    }
    if (paramcgs2 != null)
      this.fBT = paramcgs2;
    else
      this.fBT = vi(0);
  }

  public int getValue()
  {
    return op(this.fBS.getValue(), this.fBT.getValue());
  }

  public void setValue(int paramInt)
  {
    super.setValue(paramInt);
    this.fBS.setValue(paramInt);
    this.fBT.setValue(paramInt);
  }

  public abstract int op(int paramInt1, int paramInt2);

  public void bc()
  {
    super.bc();
    this.fBS = null;
    this.fBT = null;
  }
}