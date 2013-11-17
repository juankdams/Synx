import com.sun.jna.ptr.ByteByReference;
import java.util.Arrays;
import java.util.List;

public class brC extends bik
{
  public aFT fNd;
  public String fNe;
  public String fNf;
  public String fNg;
  public aFT fNh;
  public aFT fNi;
  public aFT fNj;
  public aFT fNk;
  public aFT fNl;
  public aFT fNm;
  public aFT fNn;
  public int dwFlags;
  public dRo fNo;
  public dRo fNp;
  public ByteByReference fNq;
  public dNQ fNr;
  public dNQ fNs;
  public dNQ fNt;

  protected List aR()
  {
    return Arrays.asList(new String[] { "cb", "lpReserved", "lpDesktop", "lpTitle", "dwX", "dwY", "dwXSize", "dwYSize", "dwXCountChars", "dwYCountChars", "dwFillAttribute", "dwFlags", "wShowWindow", "cbReserved2", "lpReserved2", "hStdInput", "hStdOutput", "hStdError" });
  }

  public brC() {
    this.fNd = new aFT(size());
  }
}