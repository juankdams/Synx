import java.util.Arrays;
import java.util.List;

public class bsq extends bik
{
  public aFT dPM;
  public aFT dPN;
  public aFT dPO;
  public aFT dPP;
  public aFT dPQ;
  public char[] szCSDVersion;
  public dRo fZj;
  public dRo fZk;
  public dRo fZl;
  public byte wProductType;
  public byte wReserved;

  protected List aR()
  {
    return Arrays.asList(new String[] { "dwOSVersionInfoSize", "dwMajorVersion", "dwMinorVersion", "dwBuildNumber", "dwPlatformId", "szCSDVersion", "wServicePackMajor", "wServicePackMinor", "wSuiteMask", "wProductType", "wReserved" });
  }

  public bsq() {
    this.szCSDVersion = new char[''];
    this.dPM = new aFT(size());
  }

  public bsq(axA paramaxA) {
    super(paramaxA);
    hb();
  }
}