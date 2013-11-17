import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public final class nw
  implements cvW
{
  private static final boolean aRN = false;
  private final Logger K = Logger.getLogger(nw.class);
  private static final nw aRO = new nw();

  public static nw uJ() {
    return aRO;
  }

  public void a(aqv paramaqv, boolean paramBoolean)
  {
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public boolean a(cWG paramcWG)
  {
    switch (paramcWG.getId()) {
    case 2058:
      Fh localFh = (Fh)paramcWG;
      boolean bool = false;

      if (bWP.cbM().cbP() > localFh.getTimestamp())
      {
        return false;
      }
      if (bWP.cbM().cbP() < localFh.getTimestamp())
      {
        dAJ.def().clear();
        bWP.cbM().hc(localFh.getTimestamp());
        bool = true;
      }

      for (Object localObject = localFh.OM().iterator(); ((Iterator)localObject).hasNext(); ) { byte[] arrayOfByte = (byte[])((Iterator)localObject).next();
        dAJ.def().aL(arrayOfByte);
      }

      localObject = new bxe();
      ((bxe)localObject).d(17723);
      ((bxe)localObject).fv(bool);
      cjO.clE().j((cWG)localObject);

      return false;
    }

    return true;
  }
}