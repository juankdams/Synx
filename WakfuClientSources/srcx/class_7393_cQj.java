import org.apache.log4j.Logger;

public final class cQj extends cMb
{
  private static final Logger K = Logger.getLogger(cQj.class);
  private static final String fib = "weatherBoard.title";
  private bbi kBd;
  private static final dOw kBe = new dOw();
  private final cCH kC;

  public cQj()
  {
    this.kBd = new bbi();

    this.kC = new dhS(this, 71);
  }

  protected cCH ak()
  {
    return this.kC;
  }

  public void a(abc paramabc)
  {
  }

  public byte bY() {
    return 8;
  }

  public boolean a(dJO paramdJO, bhL parambhL) {
    d(paramdJO);
    a(paramdJO);
    switch (dhW.av[paramdJO.ordinal()]) {
    case 1:
      byz localbyz = byv.bFN().bFO();
      if ((localbyz != null) && (localbyz.bSe() != kBe)) {
        kBe.a(this);
        kBe.begin();
      }
      return true;
    }
    return true;
  }

  public dJO eR() {
    return dJO.lVX;
  }

  public dJO[] eS() {
    return new dJO[] { dJO.lVX };
  }

  public csx[] am()
  {
    csl localcsl = (csl)aiI.dfO.avt();
    localcsl.iT(coH.hWk.aw);

    return new csx[] { localcsl };
  }

  public String getName()
  {
    return bU.fH().getString("weatherBoard.title");
  }

  public void cHe() {
    brL localbrL = brL.bzT();
    if (byv.bFN().c(localbrL)) {
      byv.bFN().b(localbrL);
    } else {
      sS.Al().b(this.kBd);
      localbrL.a(this);
      byv.bFN().a(localbrL);
    }
  }

  public void cHf() {
    brL localbrL = brL.bzT();
    byv.bFN().b(localbrL);
  }

  public void aJ()
  {
    super.aJ();
    D(true);
    ev(true);
  }

  public void bc()
  {
    super.bc();
    D(false);
    ev(false);
    this.kBd.reset();
  }
}