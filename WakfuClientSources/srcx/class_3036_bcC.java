import org.apache.log4j.Logger;

public class bcC
  implements cvW
{
  private static final Logger K = Logger.getLogger(bcC.class);

  public static final bcC fmO = new bcC();

  public boolean a(cWG paramcWG)
  {
    Object localObject;
    switch (paramcWG.getId()) {
    case 5526:
      localObject = (aJH)paramcWG;
      bSm.bZg().a(((aJH)localObject).CD(), ((aJH)localObject).uo(), ((aJH)localObject).bbm());
      return false;
    case 20095:
      localObject = (bJK)paramcWG;
      je localje = ((bJK)localObject).aRB();
      String str = null;
      switch (zQ.buK[localje.ordinal()])
      {
      case 1:
        str = "havenWorldMoneyNeeded";
        break;
      case 2:
        str = "havenWorldHasAnotherBid";
        break;
      default:
        K.error("Code d'erreur d'enchère d'havre monde non géré");
      }

      if (str != null) {
        cBQ.cxL().a(bU.fH().getString(str), Cn.et(8), 1027L, 7, 1);
      }

      return false;
    }

    return true;
  }

  public long getId() {
    return 1L;
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