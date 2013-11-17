import java.util.Arrays;
import java.util.List;

public class amv extends bik
{
  public aFT doX;
  public aFT doY;
  public dWd doZ;
  public dWd dpa;
  public dWd dpb;
  public dWd dpc;
  public dWd dpd;
  public dWd dpe;
  public dWd dpf;

  protected List aR()
  {
    return Arrays.asList(new String[] { "dwLength", "dwMemoryLoad", "ullTotalPhys", "ullAvailPhys", "ullTotalPageFile", "ullAvailPageFile", "ullTotalVirtual", "ullAvailVirtual", "ullAvailExtendedVirtual" });
  }

  public amv() {
    this.doX = new aFT(size());
  }
}