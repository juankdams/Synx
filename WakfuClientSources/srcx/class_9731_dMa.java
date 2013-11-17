import java.util.Arrays;
import java.util.List;

public abstract class dMa extends bik
{
  public byte mci;
  public byte mcj;
  public short mck;
  SR mcl;

  public dMa()
  {
  }

  public dMa(axA paramaxA)
  {
    super(paramaxA);
  }

  protected List aR() {
    return Arrays.asList(new String[] { "AceType", "AceFlags", "AceSize" });
  }

  public String dpe() {
    return beW.e(this.mcl);
  }

  public SR dpf() {
    return this.mcl;
  }
}