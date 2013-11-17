import java.util.Arrays;
import java.util.List;

public class aNi extends bik
{
  public byte etj;
  public byte eqF;
  public short etk;
  public int etl;
  public int etm;
  public int etn;
  public int eto;
  private aLL etp;

  protected List aR()
  {
    return Arrays.asList(new String[] { "Revision", "Sbz1", "Control", "Owner", "Group", "Sacl", "Dacl" });
  }

  public aNi()
  {
  }

  public aNi(byte[] paramArrayOfByte)
  {
    super(new dcj(paramArrayOfByte.length));
    sF().write(0L, paramArrayOfByte, 0, paramArrayOfByte.length);
    bea();
  }

  public aNi(axA paramaxA) {
    super(paramaxA);
    bea();
  }

  public aLL bdZ() {
    return this.etp;
  }

  private final void bea() {
    hb();
    if (this.eto != 0)
      this.etp = new aLL(sF().dp(this.eto));
  }
}