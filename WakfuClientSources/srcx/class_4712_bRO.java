import java.util.Hashtable;

public class bRO
  implements Rr
{
  private Hashtable hbE = null;

  private EJ biH = null;
  private int hbF = 0;
  private cfr hbG = null;
  private boolean hbH = false;

  aTw hbI = null;
  cMh hbJ = null;
  bjX hbK = null;
  dRS hbL = null;

  public bRO(EJ paramEJ)
  {
    this.hbF = 0;
    this.biH = paramEJ;
    this.hbE = new Hashtable();
    bYO();
  }

  private void bYO()
  {
    this.hbI = new aTw();
    this.hbJ = new cMh();
    this.hbJ.a(this.biH);
    this.hbK = new bjX();
    this.hbL = new dRS();
  }

  public bhj acQ()
  {
    this.hbF += 1;
    int i = 0;

    while (this.biH.NF())
    {
      i = this.biH.NH();

      if (this.hbH) {
        ctq localctq = bYP();
        localctq.setIndex(this.hbF);
        return localctq;
      }

      if (i == 60)
      {
        int j = this.biH.getChar(this.biH.NE() + 1);

        if (j == 33)
        {
          localObject2 = bYR();
          ((dcm)localObject2).setIndex(this.hbF);
          return localObject2;
        }

        Object localObject2 = bYQ();
        if (localObject2 != null) {
          if (!((cJt)localObject2).cin())
          {
            this.hbG = ((cfr)localObject2);
            if (c((cfr)localObject2)) {
              this.hbH = true;
            }

          }
          else if ((this.hbG != null) && (this.hbG.getTagName().equalsIgnoreCase(((cJt)localObject2).getTagName())))
          {
            this.hbG = null;
          }
        }

        ((cJt)localObject2).setIndex(this.hbF);
        return localObject2;
      }

      if ((i == 32) || (i == 10) || (i == 13) || (i == 9))
      {
        this.biH.NG();
      }
      else
      {
        if (this.hbG != null)
        {
          if ((this.hbG.getTagName().equalsIgnoreCase("script")) || (this.hbG.getTagName().equalsIgnoreCase("style")))
          {
            localObject1 = bYP();
            ((ctq)localObject1).setIndex(this.hbF);
            return localObject1;
          }

          localObject1 = d(null);
          ((uI)localObject1).setIndex(this.hbF);
          return localObject1;
        }

        Object localObject1 = d(null);
        ((uI)localObject1).setIndex(this.hbF);
        return localObject1;
      }

    }

    return null;
  }

  private boolean c(cfr paramcfr) {
    String str = paramcfr.getTagName();
    if ((str.equalsIgnoreCase("script")) || (str.equalsIgnoreCase("style")))
      return true;
    return false;
  }

  private ctq bYP()
  {
    this.hbH = false;

    this.hbI.a(this.biH);
    this.hbI.a(this.hbG);

    ctq localctq = null;
    try {
      localctq = (ctq)this.hbI.qm();
    } catch (dg localdg) {
      localdg.printStackTrace();
    }
    return localctq;
  }

  public cJt bYQ()
  {
    this.hbJ.a(this.biH);

    cJt localcJt = null;
    try {
      localcJt = (cJt)this.hbJ.cFk();
    } catch (dg localdg) {
      localdg.printStackTrace();
    }

    return localcJt;
  }

  public uI d(cfr paramcfr)
  {
    this.hbK.a(this.biH);
    this.hbK.b(paramcfr);

    uI localuI = null;
    try {
      localuI = (uI)this.hbK.buZ();
    } catch (dg localdg) {
      localdg.printStackTrace();
    }
    return localuI;
  }

  private dcm bYR()
  {
    this.hbL.a(this.biH);

    bhj localbhj = null;
    try {
      localbhj = this.hbL.qm();
    } catch (dg localdg) {
      localdg.printStackTrace();
    }
    return (dcm)localbhj;
  }

  public EJ DH() {
    return this.biH;
  }

  public boolean acR() {
    return this.biH.NF();
  }

  public void a(iw paramiw)
  {
  }
}