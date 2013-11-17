import java.util.Collection;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class aIj
  implements cvW
{
  protected static final Logger K = Logger.getLogger(aIj.class);

  private static aIj egP = new aIj();

  public static aIj aUl()
  {
    return egP;
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject1;
    Object localObject2;
    switch (paramcWG.getId())
    {
    case 2048:
      K.info("Message de liste de personnages");
      return false;
    case 1200:
      localObject1 = (tG)paramcWG;

      localObject2 = ((tG)localObject1).BW();
      if (localObject2 != null)
      {
        bbf.bpt().at((byte[])localObject2);
        if (bbf.bpt().cnp().size() > 0) {
          dLE.doY().t("worldChoice.selectedWorldReference", bbf.bpt().cnp().iterator().next());
          dLE.doY().t("worldChoice.overWorldReference", null);
        }
      }

      return false;
    case 1202:
      localObject1 = (cre)paramcWG;

      if (((cre)localObject1).Kh() == 0) {
        byv.bFN().a(bbf.bpt().oG(((cre)localObject1).anM()));

        byv.bFN().b(this);

        cgG.ciL().gV(false);
        byv.bFN().a(cgG.ciL());
      }
      else if (((cre)localObject1).Kh() != 9)
      {
        localObject2 = "error.worldSelection";
        cBQ.cxL().a(bU.fH().getString((String)localObject2), Cn.et(1), 1027L, 3, 2);

        ckU.cmE().done();
      }

      return false;
    case 9:
      localObject1 = (dJQ)paramcWG;
      if (((dJQ)localObject1).djb() == 1) {
        djM.cSA().a(paramcWG, "error.connection.loginServerDown", new Object[0]);
        return false;
      }

      break;
    }

    return true;
  }

  public long getId()
  {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public void a(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      bXb.cci().clear();

      byv.bFN().a(cmZ.cnK());
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      byv.bFN().b(cmZ.cnK());
    }
  }
}