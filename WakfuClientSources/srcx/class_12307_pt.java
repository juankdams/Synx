import org.apache.log4j.Logger;

public class pt extends csx
  implements bye
{
  private int aVF;
  private cYk aVG;

  public pt()
  {
  }

  public pt(int paramInt)
  {
    this.aVF = paramInt;
  }

  public pt wP() {
    return new pt(this.aVF);
  }

  public String qa()
  {
    return "followMonster";
  }

  public boolean pZ()
  {
    if (byv.bFN().bFO().adF()) {
      return false;
    }
    if (aYP.feK.bnQ()) {
      return false;
    }
    return true;
  }

  public void run()
  {
    if (!pZ()) {
      K.error("Tentative de lancement de l'action '" + pW().bL() + "' alors que isRunnable retourne que l'action est impossible");
      return;
    }

    byo localbyo = (byo)this.dvI;
    this.aVG = localbyo.ML();
    byz localbyz = byv.bFN().bFO();

    if (!localbyz.q(false, true))
      return;
    localbyz.aeL().b(this);

    if (!byv.bFN().bFO().b(this.aVG, true, true)) {
      byv.bFN().bFO().aeL().c(this);
      if ((Math.abs(localbyz.aeL().atB().getX() - this.aVG.getX()) <= 1) && (Math.abs(localbyz.aeL().atB().getY() - this.aVG.getY()) <= 1))
      {
        dIH localdIH = new dIH();
        localdIH.cb(this.aVF);
        byv.bFN().aJK().d(localdIH);
      }
    }
  }

  public aiI pW()
  {
    return aiI.dfQ;
  }

  public void b(dMM paramdMM, int paramInt1, int paramInt2, short paramShort)
  {
    paramdMM.c(this);
    dIH localdIH = new dIH();
    localdIH.cb(this.aVF);
    byv.bFN().aJK().d(localdIH);
  }

  protected int qc()
  {
    return coH.hWQ.aw;
  }

  public void cb(int paramInt) {
    this.aVF = paramInt;
  }
}