import org.apache.log4j.Logger;

public class cmI
  implements cvW
{
  private static final Logger K = Logger.getLogger(cmI.class);

  private static cmI hRy = new cmI();
  private Su hRz;
  private Su hRA;
  private cMt hRB;
  private bOg hRC;

  public static cmI cnw()
  {
    return hRy;
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject1;
    Object localObject3;
    Object localObject4;
    Object localObject2;
    switch (paramcWG.getId())
    {
    case 16441:
      localObject1 = byv.bFN().bFO();
      if (localObject1 != null) {
        ((byz)localObject1).bGD().cWP();
      }
      return false;
    case 16442:
      localObject1 = byv.bFN().bFO();
      if (localObject1 != null) {
        ((byz)localObject1).bGD().cWQ();
      }
      return false;
    case 18001:
      localObject1 = this.hRA.aeQ();
      if (localObject1 == null) {
        return false;
      }

      ((arl)localObject1).Q(this.hRA);

      bOU.gUc.b(new Ob());
      return false;
    case 18012:
      localObject1 = (GU)paramcWG;
      byte b1 = ((GU)localObject1).QJ();
      localObject3 = ((GU)localObject1).getItem();
      localObject4 = ((GU)localObject1).QI();
      if ((localObject4 != null) && (localObject3 != null)) {
        apX localapX = dFM.dhf().azh();

        if ((byv.bFN().c(amE.azg())) && (localapX != null) && (localapX.equals(localObject4)))
        {
          byv.bFN().b(amE.azg());
        }
        else {
          if (byv.bFN().c(cHM.cBY())) {
            byv.bFN().b(cHM.cBY());
          }
          if (byv.bFN().c(dFM.dhf())) {
            byv.bFN().b(dFM.dhf());
          }

          if (this.hRA.aeQ().a(this.hRA, (gA)localObject3, (bfE)localObject4, null) == baf.fhx)
          {
            amE.azg().d((apX)localObject4);
            amE.azg().af(this.hRA);
            amE.azg().wb();
            amE.azg().a((gA)localObject3, b1);
            amE.azg().af(this.hRA);
            amE.azg().wb();

            amE.azg().cFx();

            this.hRB = amE.azg();

            byv.bFN().a(amE.azg());
          }
        }
      }

      return false;
    case 18002:
      localObject1 = (aSP)paramcWG;

      localObject2 = ((aSP)localObject1).QI();
      if (localObject2 != null) {
        if (this.hRC != null) {
          this.hRC.Gg();
          if (this.hRC.bVr()) {
            return false;
          }
        }
        localObject3 = dFM.dhf().azh();

        if ((byv.bFN().c(dFM.dhf())) && (localObject3 != null) && (localObject3.equals(localObject2))) {
          byv.bFN().b(dFM.dhf());
        }
        else {
          if (byv.bFN().c(cHM.cBY())) {
            byv.bFN().b(cHM.cBY());
          }
          if (byv.bFN().c(amE.azg())) {
            byv.bFN().b(amE.azg());
          }

          localObject4 = new bUP();
          ((bUP)localObject4).k(this.hRA.aeQ());
          if (((bUP)localObject4).a(this.hRA, (bfE)localObject2, null, true) == baf.fhx)
          {
            dFM.dhf().d((apX)localObject2);
            dFM.dhf().af(this.hRA);
            dFM.dhf().wb();

            dFM.dhf().cFx();

            this.hRB = dFM.dhf();

            byv.bFN().a(dFM.dhf());
          }
        }
      }

      return false;
    case 18009:
      localObject1 = (cGl)paramcWG;
      localObject2 = ((cGl)localObject1).getItem();
      byte b2 = ((cGl)localObject1).QJ();
      if (localObject2 != null) {
        localObject4 = cHM.cBY().getItem();

        if ((byv.bFN().c(cHM.cBY())) && (localObject4 != null) && (localObject4.equals(localObject2))) {
          byv.bFN().b(cHM.cBY());
          bWx.cbz().hide();
          dGx.dhr().unlock();
        }
        else {
          if (byv.bFN().c(dFM.dhf())) {
            byv.bFN().b(dFM.dhf());
          }

          if (byv.bFN().c(amE.azg())) {
            byv.bFN().b(amE.azg());
          }

          if (this.hRA.aeQ().a(this.hRA, (gA)localObject2, null, true) == baf.fhx)
          {
            cHM.cBY().a((gA)localObject2, b2);
            cHM.cBY().af(this.hRA);
            cHM.cBY().wb();

            cHM.cBY().cFx();

            this.hRB = cHM.cBY();

            byv.bFN().a(cHM.cBY());
          }
        }
      }
      return false;
    case 18010:
      localObject1 = (cGl)paramcWG;

      K.info("UIFightTurnFrame : onMessage : Methode a compléter (LIM)");

      return false;
    case 18006:
      localObject1 = new qH();

      ((qH)localObject1).X(this.hRA.getId());
      ((qH)localObject1).a(CG.bFM);
      byv.bFN().aJK().d((cWG)localObject1);

      return false;
    case 18003:
      localObject1 = new qH();

      ((qH)localObject1).X(this.hRA.getId());
      ((qH)localObject1).a(CG.bFK);
      byv.bFN().aJK().d((cWG)localObject1);

      return false;
    case 18004:
      localObject1 = new qH();

      ((qH)localObject1).X(this.hRA.getId());
      ((qH)localObject1).a(CG.bFG);
      byv.bFN().aJK().d((cWG)localObject1);

      return false;
    case 18005:
      localObject1 = new qH();

      ((qH)localObject1).X(this.hRA.getId());
      ((qH)localObject1).a(CG.bFI);
      byv.bFN().aJK().d((cWG)localObject1);

      return false;
    }

    return true;
  }

  private short bCU() {
    arl localarl = this.hRA.aeQ();
    if (localarl == null) {
      return 0;
    }
    zu localzu = localarl.aDp();
    if (localzu == null) {
      return 0;
    }
    return localzu.AU();
  }

  public void cnx() {
    if (this.hRA != null)
      aWc.blo().eO(600128L);
  }

  private static Su c(Su paramSu1, Su paramSu2)
  {
    if (paramSu1.c(cfY.hCw)) {
      return paramSu1;
    }

    if (paramSu1.c(cfY.hCi)) {
      return paramSu2;
    }

    if (paramSu2.c(cfY.hCi)) {
      return paramSu1;
    }

    return paramSu2;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      byz localbyz = byv.bFN().bFO();
      try {
        this.hRA = localbyz.aeQ().aDp().Ia();
        this.hRz = c(this.hRA, localbyz);

        if (this.hRA.adL() != localbyz) {
          K.warn("Frame de tour de combattant poussé pour le localPlayer alors que ce n'est pas lui le propriétaire de ce combattant");
          this.hRA = null;
        }

        if ((this.hRA != null) && (this.hRA.cQJ())) {
          K.warn("frame de tour poussé, pour le combattant local, mais pourtant géré par l'IA");
        }

        aS(this.hRA);

        if (!this.hRA.c(cfY.hBb)) {
          KO.Vm().a(new coS(cMS.ksg, bU.fH().getString("fight.yourTurn.0"), 2000));
        }
      }
      catch (Exception localException)
      {
        K.error("Frame de tour de combat poussé alors qu'un paramètre est null (combat ou combattant)");
      }

      if (!byv.bFN().c(aYX.bnY())) {
        byv.bFN().a(aYX.bnY());
      }
      byv.bFN().a(aDd.aPo());

      Bf.Kk().as(true);

      localbyz.bSs().ceJ();
      localbyz.bGI();

      localbyz.a(new eu[] { eu.ayN, eu.ayM, eu.ayO, eu.ayP });

      cpa localcpa = cBQ.cxL().coO().nf("equipmentDialog");
      if (localcpa != null)
        dLE.doY().b("itemDetail", "usableNow", localcpa);
    }
  }

  public static void aS(Su paramSu)
  {
    byz localbyz = byv.bFN().bFO();

    byv.bFN().ay(paramSu);
    if ((paramSu.uO() == 1550) || (paramSu.uO() == 2382)) {
      return;
    }

    if ((paramSu != localbyz) || (localbyz.bSs().aeE())) {
      dMU localdMU = localbyz.bGD().cWz();
      if (localdMU != null) {
        localdMU.bI(paramSu);
      }
      localbyz.bGD().cWA();
    } else {
      localbyz.bGD().cWB();
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    this.hRA = null;

    if (!paramBoolean) {
      axB.aIZ(); axB.aJi();
      this.hRB = null;

      bWx.cbz().hide();
      dGx.dhr().unlock();

      Bf.Kk().as(false);

      byz localbyz1 = byv.bFN().bFO();
      byz localbyz2 = this.hRz != null ? this.hRz : localbyz1;
      aS(localbyz2);

      byv.bFN().b(dFM.dhf());
      byv.bFN().b(cHM.cBY());
      byv.bFN().b(amE.azg());
      byv.bFN().b(aDd.aPo());
      byv.bFN().b(aYX.bnY());

      if (localbyz1 != null) {
        localbyz1.bSs().ceJ();
        localbyz1.bGI();
        localbyz1.a(new eu[] { eu.ayN, eu.ayM, eu.ayO, eu.ayP });
      }
    }
  }

  public long getId()
  {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public Su boc() {
    return this.hRA;
  }

  public cMt cny() {
    return this.hRB;
  }

  public void a(bOg parambOg) {
    this.hRC = parambOg;
  }

  public bOg cnz() {
    return this.hRC;
  }

  public void cleanUp() {
    this.hRz = null;
  }
}