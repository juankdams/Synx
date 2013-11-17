import org.apache.log4j.Logger;

public class dpH extends cMb
{
  private static final Logger K = Logger.getLogger(dpH.class);
  private static final int lqr = 31;

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    switch (aht.av[paramdJO.ordinal()]) {
    case 1:
      K.info("[MAILBOX] Activation d'une mailbox");
      ctM localctM = new ctM();
      localctM.mi(byv.bFN().bFO().getName());
      localctM.setTitle("Test title");
      localctM.setMessage("Yeah RastaPouet ... test de message de ouf ^^\r\n!!!Vive les barbus!!!");
      byv.bFN().aJK().d(localctM);
      return true;
    }
    return false;
  }

  public dJO eR() {
    return dJO.lVv;
  }

  public dJO[] eS()
  {
    return new dJO[] { dJO.lVv };
  }

  public void aJ()
  {
    super.aJ();
    eu(true);
    ev(true);
    D(true);
  }

  public csx[] am()
  {
    csx[] arrayOfcsx = new csx[1];

    csl localcsl = (csl)aiI.dfO.avt();
    localcsl.iT(31);
    arrayOfcsx[0] = localcsl;

    return arrayOfcsx;
  }

  public String getName()
  {
    return bU.fH().getString("mailbox.name");
  }

  public void a(abc paramabc)
  {
  }
}