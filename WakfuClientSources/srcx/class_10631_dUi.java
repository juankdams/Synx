import org.apache.log4j.Logger;

public class dUi
  implements cvW
{
  private static Logger K = Logger.getLogger(dUi.class);
  private final aye dUO;

  public dUi(aye paramaye)
  {
    this.dUO = paramaye;
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject;
    switch (paramcWG.getId())
    {
    case 2:
      localObject = (alU)paramcWG;

      this.dUO.D(((alU)localObject).ayC());

      return false;
    case 4:
      localObject = (avX)paramcWG;

      if (!((avX)localObject).IR()) {
        K.error("Reco impossible");
      }

      return false;
    case 6:
      localObject = (dIb)paramcWG;

      this.dUO.bs(((dIb)localObject).agd());

      return false;
    case 8:
      localObject = (cVN)paramcWG;

      this.dUO.F(((cVN)localObject).cKi());

      return false;
    case 110:
      localObject = (cfl)paramcWG;

      this.dUO.E(((cfl)localObject).cie());

      return false;
    case 100:
      localObject = (bCG)paramcWG;

      int i = ((bCG)localObject).aks();
      int j = ((bCG)localObject).bLa();
      long l = ((bCG)localObject).bLb();

      if (i == -1)
        this.dUO.aJP();
      else {
        this.dUO.a(i, j, l);
      }
      return false;
    case 102:
      localObject = (dkD)paramcWG;

      switch (((dkD)localObject).chP()) {
      case 0:
        cth.cqP().trace(((dkD)localObject).getMessage());
        break;
      case 1:
        cth.cqP().log(((dkD)localObject).getMessage());
        break;
      case 2:
        cth.cqP().err(((dkD)localObject).getMessage());
        break;
      default:
        K.error("Type de message inconnu " + ((dkD)localObject).chP());
      }

      return false;
    case 105:
      localObject = (ceS)paramcWG;

      switch (((ceS)localObject).chP()) {
      case 0:
        cth.cqP().trace(((ceS)localObject).getMessage());
        break;
      case 1:
        cth.cqP().log(((ceS)localObject).getMessage());
        break;
      case 2:
        cth.cqP().err(((ceS)localObject).getMessage());
        break;
      case 3:
        cth.cqP().s(((ceS)localObject).getMessage(), ((ceS)localObject).aBc());
        break;
      default:
        K.error("Type de message inconnu " + ((ceS)localObject).chP());
      }

      return false;
    case 103:
      localObject = (bBU)paramcWG;

      this.dUO.kZ(((bBU)localObject).bRq());

      return false;
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
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
  }
}