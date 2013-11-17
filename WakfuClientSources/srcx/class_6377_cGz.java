import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public final class cGz
{
  public static final cGz iBJ = new cGz();

  private final Set iBK = new HashSet();

  public void bb(Su paramSu)
  {
    byz localbyz = byv.bFN().bFO();
    if ((paramSu == localbyz) || (paramSu.adL() != localbyz)) {
      return;
    }
    if (paramSu.aJp() == SB.ctC)
      bc(paramSu);
  }

  private void bc(Su paramSu)
  {
    aJD localaJD = paramSu.aeQ().LC();
    Collection localCollection = localaJD.bbj();
    for (cjK localcjK : localCollection)
      if ((localcjK.axG() == paramSu) && (localcjK.getType() == xj.bpv.xj()))
      {
        bOX.bVM().o(localcjK);
        this.iBK.add(localcjK);
      }
  }

  public void bd(Su paramSu)
  {
    for (cjK localcjK : this.iBK)
      bOX.bVM().r(localcjK);
  }
}