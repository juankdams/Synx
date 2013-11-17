import java.util.ArrayList;
import org.apache.log4j.Logger;

class cDR
  implements dGy
{
  cDR(azF paramazF)
  {
  }

  public boolean b(aIL paramaIL)
  {
    try
    {
      paramaIL.aUL();
      paramaIL.updateState();
      if (paramaIL.isActive())
        azF.a(this.ehD).add(aIL.a(paramaIL));
    } catch (Exception localException) {
      azF.K.error("", localException);
    }
    paramaIL.clear();
    return true;
  }
}