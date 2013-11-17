import java.util.Arrays;
import java.util.List;

public class bUK extends bik
{
  public aFT hgN;
  public dNK[] hgO;

  protected List aR()
  {
    return Arrays.asList(new String[] { "PrivilegeCount", "Privileges" });
  }

  public bUK()
  {
    this(0);
  }

  public bUK(int paramInt)
  {
    this.hgN = new aFT(paramInt);
    this.hgO = new dNK[paramInt];
  }

  public bUK(axA paramaxA)
  {
    super(paramaxA);
    int i = paramaxA.getInt(0L);
    this.hgN = new aFT(i);
    this.hgO = new dNK[i];
    hb();
  }
}