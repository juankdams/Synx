import java.util.Arrays;
import java.util.List;

public class bXh extends bik
{
  public aFT hlX;
  public aFT hlY;
  public aFT hlZ;
  public WP hma;
  public aFT hmb;
  public aFT hmc;
  public aFT hmd;
  public aBJ hme;
  public aFT hmf;
  public char[] hmg = new char[260];

  public bXh()
  {
    this.hlX = new aFT(size());
  }

  public bXh(axA paramaxA) {
    super(paramaxA);
    hb();
  }

  protected List aR()
  {
    return Arrays.asList(new String[] { "dwSize", "cntUsage", "th32ProcessID", "th32DefaultHeapID", "th32ModuleID", "cntThreads", "th32ParentProcessID", "pcPriClassBase", "dwFlags", "szExeFile" });
  }
}