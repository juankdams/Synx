import java.util.Arrays;
import java.util.List;

public class CX extends bik
{
  public int bHm;
  public int bHn;
  public int bHo;
  public int bHp;
  public int bHq;
  public int bHr;
  public int bHs;
  public int dwProcessId;
  public int bHt;

  protected List aR()
  {
    return Arrays.asList(new String[] { "dwServiceType", "dwCurrentState", "dwControlsAccepted", "dwWin32ExitCode", "dwServiceSpecificExitCode", "dwCheckPoint", "dwWaitHint", "dwProcessId", "dwServiceFlags" });
  }

  public CX() {
  }

  public CX(int paramInt) {
    super(new dcj(paramInt));
  }
}