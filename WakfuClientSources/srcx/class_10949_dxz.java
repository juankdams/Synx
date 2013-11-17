import com.ankamagames.baseImpl.graphics.isometric.particles.CellParticleSystem;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public final class dxz
  implements buF
{
  private static final Logger K = Logger.getLogger(dxz.class);
  private static final dzY lDO = new dzY();
  private final cew aEM;

  public dxz(cew paramcew)
  {
    if ((!bB) && (paramcew == null)) throw new AssertionError();
    this.aEM = paramcew;
  }

  public void a(cUo paramcUo, boolean paramBoolean)
  {
    if ((!bB) && (paramcUo != this.aEM)) throw new AssertionError();

    if (dcw()) {
      return;
    }
    if (paramBoolean)
      w(this.aEM);
    else
      x(this.aEM);
  }

  public static void w(cew paramcew)
  {
    dOc localdOc = bsP.getInstance().getMouseOver();
    if ((localdOc != null) && (localdOc != bsP.getInstance())) {
      return;
    }
    Su localSu = paramcew.cbD();
    if (localSu == null) {
      return;
    }
    if (localSu.afk()) {
      return;
    }
    if (localSu.i(cfY.hCt)) {
      return;
    }
    dD localdD = new dD(paramcew, paramcew.chc());

    paramcew.a(new bMd(paramcew));

    bWN.hjg.a(true, paramcew.cbD());

    a(localSu, localdD);

    cjO.clE().j(localdD);
  }

  public static void a(Su paramSu, dD paramdD) {
    lZ[] arrayOflZ = { new lZ(), new lZ() };

    boolean bool1 = paramSu.aeL().asQ();
    Su localSu2;
    Su localSu3;
    Su localSu1;
    if (paramSu.c(cfY.hCg)) {
      localSu2 = paramSu.adM();
      localSu3 = paramSu.adM();
      localSu1 = paramSu.adM();
    } else {
      localSu3 = paramSu;
      localSu2 = paramSu;
      if (paramSu.uO() == 1550)
        localSu1 = paramSu.adL();
      else {
        localSu1 = paramSu;
      }
    }
    String str = null;

    if ((!localSu1.isDead()) && (!localSu1.cQK())) {
      if ((localSu1 instanceof byo)) {
        a(bool1, localSu1, arrayOflZ, paramdD);
      }
      str = bC(localSu1);
      a(paramdD, localSu1);
      j(paramSu, true);
    }

    int i = byv.bFN().bFO().aeR();
    int j = paramSu.aeR();
    boolean bool2 = i == j;

    arl localarl = paramSu.aeQ();
    if ((bool2) && (localarl != null) && (localarl.aEt().bbS()) && 
      ((localSu1 instanceof byo)) && (localSu1.c(dKm.lXs))) {
      arrayOflZ[1].tH().tI().am(bNa.gRJ.bUV());
      arrayOflZ[1].a(bU.fH().getString("arcadeDungeon.monsterScoreBonus", new Object[] { Integer.valueOf(((byo)paramSu).bFG()) }));
      arrayOflZ[1].tJ();
    }

    h(paramSu, bool2);

    int k = (paramSu.adF()) && (!bool2) ? 1 : 0;
    if (k != 0) {
      arrayOflZ[1].tH().a(bU.fH().getString("desc.inFight"));
    }

    int m = (k != 0) && (dmM.cUe().cUf() != j) ? 1 : 0;

    if (m != 0)
      o(cjS.clP().vz(j));
    Object localObject;
    if ((localarl != null) && (!F.a(localSu3))) {
      localObject = localSu3.adz();
      if ((localObject != null) && (((String)localObject).length() > 0)) {
        arrayOflZ[1].tH().a((CharSequence)localObject);
      }

    }

    if (paramdD.hw().isEmpty()) {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(arrayOflZ[0].tP());
      ((StringBuilder)localObject).append(i(localSu2, bool1));
      ((StringBuilder)localObject).append(arrayOflZ[1].tP());
      paramdD.c(((StringBuilder)localObject).toString(), str);
    }
  }

  public static void a(dD paramdD, Su paramSu) {
    String str1 = bB(paramSu);

    String str2 = null;
    if (str1 != null)
      try {
        str2 = String.format(ay.bd().getString("popupIconPath"), new Object[] { str1 });
      } catch (bdh localbdh) {
        K.error(localbdh.getMessage(), localbdh);
      }
    paramdD.G(str2);
  }

  private static String bB(Su paramSu) {
    if ((paramSu instanceof bKm)) {
      return "breed" + paramSu.uO();
    }
    String str = null;
    if ((paramSu instanceof byo)) {
      ayn localayn = (ayn)paramSu.boT();
      bdi localbdi = cMn.cFp().dP(paramSu.uO());
      ciJ localciJ = bRu.bYI().tP(localbdi.nn());
      int i = (paramSu.c(dKm.lXg)) && (localayn == null) ? 0 : localciJ.ckB();
      dJf localdJf = dJf.lUH;
      if (i == 0) {
        localdJf = dJf.lUG;
      }
      if (localayn != null) {
        localdJf = dJf.lUI;
      }
      if (localdJf == dJf.lUH)
        str = "monsters";
      else if (localdJf == dJf.lUJ)
        str = "hooded";
    }
    return str;
  }

  private static void h(Su paramSu, boolean paramBoolean) {
    if ((paramBoolean) && (!paramSu.isDead()) && (paramSu.cQK())) {
      Iterator localIterator = paramSu.ayK().iterator();
      while (localIterator.hasNext()) {
        aVc localaVc = (aVc)localIterator.next();
        dle localdle = localaVc.bkf();
        if ((localdle != null) && (localaVc.bkc() != null) && (localaVc.bkc().yR() == 25274)) {
          CellParticleSystem localCellParticleSystem = cof.cop().vZ(78900);
          localCellParticleSystem.f(localdle.fa(), localdle.fb(), localdle.fc());
          localCellParticleSystem.setDuration(2000);
          cWS.cKD().b(localCellParticleSystem);
        }
      }
    }
  }

  public static String i(Su paramSu, boolean paramBoolean) {
    lZ locallZ1 = new lZ();

    byz localbyz = byv.bFN().bFO();

    int i = paramSu.uO() == 1550 ? 1 : 0;

    locallZ1.tz();

    if (paramSu.aeQ() != null) {
      locallZ1.a(paramSu.cQF());
      int j = paramSu.e(eu.ayM) + paramSu.e(eu.aAj);

      locallZ1.a(" (").a(bU.fH().getString("hp.var", new Object[] { Integer.valueOf(j) })).a(")");
      float f = paramSu.cRk();
      if (f > 1.0F)
        locallZ1.tH().a(bU.fH().getString("desc.healRes", new Object[] { Integer.valueOf((int)f) }));
    }
    else {
      if (paramBoolean) {
        locallZ1.a("[").P(paramSu.getId()).a("] ");
      }

      if (((paramSu instanceof byo)) && ((paramSu.isDead()) || (paramSu.c(dKm.lWV)))) {
        locallZ1.a(bU.fH().getString("npc.corpse"));
      }

      locallZ1.a(paramSu.cQF());

      if (paramBoolean) {
        locallZ1.a(" (").bw(paramSu.fa()).a(";").bw(paramSu.fb()).a(") ");
      }

      if (paramSu.aeI()) {
        locallZ1.a(" (").a(bU.fH().getString("levelShort.custom", new Object[] { Short.valueOf(paramSu.nU()) })).a(")");
      }

    }

    if ((paramSu.aJr()) && (i == 0) && (paramSu.adL() != paramSu)) {
      locallZ1.a("\n").a(bU.fH().getString("owners.summoning", new Object[] { paramSu.adL().getName() }));
    }

    if (((paramSu instanceof byo)) && (!paramSu.isDead()) && (!paramSu.c(dKm.lWV)) && (i == 0)) {
      locallZ1.a("\n(").a(bU.fH().getString("levelShort.custom", new Object[] { Short.valueOf(paramSu.nU()) }));

      locallZ1.a(")");
    }

    if (paramSu.aJu()) {
      locallZ1.a(" ").a(bU.fH().getString("koMessage", new Object[] { Integer.valueOf(paramSu.e(eu.ayX)) }));
    }

    locallZ1.tA();

    if ((localbyz.aeQ() != null) && (paramSu.aeR() == localbyz.aeR()) && (paramSu.getId() != localbyz.getId())) {
      a(locallZ1, paramSu, localbyz);
    }

    if (i != 0) {
      paramSu = paramSu.adL();
    }
    cvY localcvY = localbyz.cJf();
    Object localObject1;
    Object localObject2;
    if ((paramSu instanceof byo)) {
      localObject1 = (ayn)paramSu.boT();
      if (localObject1 != null) {
        aYr localaYr1 = ((ayn)localObject1).ava();
        int k = localaYr1.bP();
        localObject2 = new lZ();
        ((lZ)localObject2).tI();

        ((lZ)localObject2).am(bPl.a(localcvY, localaYr1).bUV());

        ((lZ)localObject2).a(bU.fH().b(39, k, new Object[0])).tJ();

        locallZ1.a("\n").a(((lZ)localObject2).toString());
      }
    } else if ((paramSu instanceof bKm)) {
      localObject1 = (bKm)paramSu;

      byte b = bjv.buS();
      bjv.cN(((bKm)localObject1).xK());
      String str = ((bKm)localObject1).bSm();
      bjv.cN(b);
      if (str != null) {
        locallZ1.tH().tD().a(str).tE();
      }

      if ((((bKm)localObject1).bSw()) && 
        (((bKm)localObject1).bSw())) {
        localObject2 = ((bKm)localObject1).bSt();
        locallZ1.tH().tD().a(((bMG)localObject2).getName()).tE();
      }

      localObject2 = dmY.cUs().cUu().ky(((bKm)localObject1).sN());
      if (localObject2 != null) {
        localObject3 = ((dbV)localObject2).cNC();
        if ((localObject3 != null) && (((String)localObject3).length() > 0)) {
          locallZ1.tH().tD().a((CharSequence)localObject3).tE();
        }
      }

      Object localObject3 = (ctE)((bKm)localObject1).cJf();
      aYr localaYr2 = ((ctE)localObject3).UI();
      int m = localaYr2.bP();

      locallZ1.tH();
      locallZ1.tI();

      locallZ1.am(bPl.a(localcvY, localaYr2).bUV());

      locallZ1.a(bU.fH().b(39, m, new Object[0])).tJ();

      if (localaYr2 == localcvY.UI()) {
        Yp localYp = ((ctE)localObject3).HK();
        if (localYp != null) {
          locallZ1.tH().tI();
          locallZ1.am("efcc0a").tz().a(bU.fH().b(57, (int)localYp.getId(), new Object[0])).tA().tJ();
        }

        if (((ctE)localObject3).biI().size() > 0) {
          lZ locallZ2 = new lZ();
          for (Iterator localIterator = ((ctE)localObject3).biI().iterator(); localIterator.hasNext(); ) {
            dLC localdLC = (dLC)localIterator.next();
            if ((localdLC.doX() == null) || (!localdLC.doX().equals(localYp)))
            {
              locallZ2.a(bU.fH().getString(localdLC.name()));
              if (localIterator.hasNext())
                locallZ2.a(" ,"); 
            }
          }
          if (locallZ2.length() > 0) {
            locallZ1.tH().tI();
            locallZ1.am("efcc0a").tz();
            locallZ1.a(locallZ2.tP());
            locallZ1.tA().tJ();
          }
        }
        if (((ctE)localObject3).biG()) {
          locallZ1.tH().tI().am("efcc0a").tz().a(bU.fH().getString("nation.vote.candidate_overhead")).tA().tJ();
        }

      }

    }

    return locallZ1.tP();
  }

  private static void a(lZ paramlZ, Su paramSu, byz parambyz) {
    if (parambyz.aii() == SB.ctK) {
      b(paramlZ, paramSu, parambyz);
      return;
    }
    if (parambyz.aii() == SB.ctD) {
      a(paramlZ, paramSu);
      return;
    }
  }

  private static void a(lZ paramlZ, Su paramSu) {
    Rx localRx1 = paramSu.d(eu.ayM);
    Rx localRx2 = paramSu.d(eu.aAj);
    float f = (localRx1.value() + localRx2.value()) / (localRx1.max() + localRx2.max());
    paramlZ.tH().tI();
    if (0.15F > f)
      paramlZ.am(bNa.gRA.bUV());
    else {
      paramlZ.am(bNa.gRE.bUV());
    }
    paramlZ.a(bU.fH().getString("hasBledDryBonus", new Object[] { Integer.valueOf((int)(f * 100.0F)) })).tJ();
  }

  private static void b(lZ paramlZ, Su paramSu, byz parambyz) {
    Rx localRx1 = paramSu.d(eu.ayM);
    Rx localRx2 = paramSu.d(eu.aAj);
    float f1 = (localRx1.value() + localRx2.value()) / (localRx1.max() + localRx2.max());
    Rx localRx3 = parambyz.d(eu.ayM);
    Rx localRx4 = parambyz.d(eu.aAj);
    float f2 = (localRx3.value() + localRx4.value()) / (localRx3.max() + localRx4.max());
    if (f2 < f1)
      paramlZ.tH().tI().am(bNa.gRA.bUV()).a(bU.fH().getString("hasMoreLife")).tJ();
  }

  public static void x(cew paramcew)
  {
    daO.cML().a(paramcew);

    Su localSu1 = paramcew.cbD();
    if (localSu1 == null) {
      return;
    }
    if ((localSu1 instanceof byo)) {
      Tn localTn = cWz.cKu().ji(((byo)localSu1).hf());
      if ((!localSu1.adF()) && (localTn != null)) {
        for (dzM localdzM : localTn.ags()) {
          Su localSu2 = CA.Lv().bj(localdzM.getId());

          if (localSu2 != null) {
            localSu2.aeL().atq();
            bSH.bZs().a(localSu2.getId(), 0, clP.hOQ);
          }
        }
      }
    }

    bWN.hjg.cbL();
    dcx();
    j(localSu1, false);
  }

  private static void a(boolean paramBoolean, Su paramSu, lZ[] paramArrayOflZ, dD paramdD) {
    Tn localTn = cWz.cKu().ji(((byo)paramSu).hf());

    if ((!paramSu.adF()) && (localTn != null))
    {
      int i = localTn.agv();
      if (localTn.ags().size() > 1) {
        a(paramdD, i);
      }
      if (paramBoolean) {
        a(paramdD, localTn.getId());
        localObject = paramSu.boT();
        if (localObject != null) {
          b(paramdD, ((aid)localObject).getId());
        }
      }
      Object localObject = localTn.ags();
      int j = ((List)localObject).size();
      for (int k = 0; k < j; k++) {
        dzM localdzM = (dzM)((List)localObject).get(k);
        a(paramBoolean, paramSu, paramdD, localdzM);
      }

      a(paramArrayOflZ, i);
    } else if ((localTn == null) && (paramSu != byv.bFN().bFO().bSo()))
    {
      K.info("On ne dispose pas d'information sur le groupe du NPC id=" + paramSu.getId() + " : étrange");
    }

    if ((paramBoolean) && 
      (paramSu.adF()))
      a(paramSu, paramArrayOflZ);
  }

  public static void a(dD paramdD, int paramInt)
  {
    paramdD.setTitle(new lZ().tz().a(bU.fH().getString("levelShort.custom", new Object[] { Integer.valueOf(paramInt) })).tA().tP());
  }

  private static void a(Su paramSu, lZ[] paramArrayOflZ) {
    lZ locallZ = paramArrayOflZ[1];
    locallZ.tH().tF().a("        ").tG().tH();
    locallZ.tI().am("999999").a("cheap fight debug panel :").tH();
    locallZ.a("summoned=").F(paramSu.aJr()).tH();
    locallZ.a(paramSu.cyl()).tJ();
  }

  private static void a(lZ[] paramArrayOflZ, double paramDouble)
  {
  }

  private static void a(dD paramdD, double paramDouble)
  {
    paramdD.addInfo(String.format("<b>Group level: %.2f</b>", new Object[] { Double.valueOf(paramDouble) }));
  }

  private static void a(dD paramdD, long paramLong) {
    paramdD.addInfo(String.format("<b>Group ID: %d</b>", new Object[] { Long.valueOf(paramLong) }));
  }

  private static void b(dD paramdD, int paramInt) {
    paramdD.addInfo(String.format("<b>Protector ID: %d</b>", new Object[] { Integer.valueOf(paramInt) }));
  }

  public static void a(boolean paramBoolean, Su paramSu, dD paramdD, dzM paramdzM)
  {
    lZ locallZ = new lZ();
    bdi localbdi = cMn.cFp().dP(paramdzM.bQz());
    ciJ localciJ = bRu.bYI().tP(localbdi.nn());
    ayn localayn = (ayn)paramSu.boT();
    int i = (paramSu.c(dKm.lXg)) && (localayn == null) ? 0 : localciJ.ckB();
    dJf localdJf = dJf.lUH;
    if (i == 0) {
      localdJf = dJf.lUG;
    }
    if (localayn != null) {
      localdJf = dJf.lUI;
    }

    if (F.a(paramSu)) {
      localdJf = dJf.lUJ;
    }

    if ((paramdzM.getId() == paramSu.getId()) && (localdJf != dJf.lUG)) {
      locallZ.tz();
    }

    locallZ.a(paramdzM.a(paramBoolean, localdJf));
    if ((paramdzM.getId() == paramSu.getId()) && (localdJf != dJf.lUG)) {
      locallZ.tA();
    }

    cwv localcwv = a(paramdzM, localbdi);

    byz localbyz = byv.bFN().bFO();
    if (localayn != null) {
      if (localayn.aqN() == paramSu.getId())
        localcwv = cwv.iia;
      localObject1 = localayn.ava();
      int j = ((aYr)localObject1).bP();
      localObject2 = localbyz.cJf();
      localObject3 = ((cvY)localObject2).UI();
      locallZ.tH().tI();

      locallZ.am(bPl.a((cvY)localObject2, (aYr)localObject1).bUV());

      locallZ.a(bU.fH().b(39, j, new Object[0])).tJ();
    }

    Object localObject1 = null;
    if (i != 0) {
      localObject1 = localcwv.wW(i);
      if (!bAy.jy((String)localObject1)) {
        localObject1 = localcwv.wW(0);
      }
    }
    ArrayList localArrayList = new ArrayList();
    Object localObject2 = bWW.ccf().FB();
    if (localObject2 != null) {
      localObject3 = ((ayn)localObject2).aKu();
      if (((aur)localObject3).iA(localciJ.nn())) {
        localArrayList.add(ay.bd().a("ecosystemProtectedIconPath", "defaultIconPath", new Object[0]));
        paramdD.a(bNa.gRz);
      }
    }

    if ((localbyz.aii() == SB.ctB) && (localbdi.b(cfY.hBM)))
    {
      localArrayList.add(ay.bd().a("osamodasMonsterIconPath", "defaultIconPath", new Object[0]));
    }

    paramdD.a(locallZ.tP(), (String)localObject1, localArrayList);

    Object localObject3 = (byo)CA.Lv().bj(paramdzM.getId());

    if (localObject3 != null) {
      beo.c(((byo)localObject3).aeL());
      bSH.bZs().a(((byo)localObject3).getId(), 0, clP.hOR);
    }
  }

  private static cwv a(dzM paramdzM, bdi parambdi)
  {
    switch (bMc.gPA[parambdi.brk().ordinal()]) {
    case 1:
      return cwv.ihX;
    case 2:
      return cwv.ihW;
    }
    return cwv.dN(byv.bFN().bFO().nU(), paramdzM.nU());
  }

  public static String bC(Su paramSu)
  {
    if (!(paramSu instanceof bKm)) {
      return null;
    }

    bKm localbKm = (bKm)paramSu;
    long l = localbKm.CD();
    if (l <= 0L) {
      return null;
    }
    dbY localdbY = new dbY(localbKm.bSt().CH());
    dTN localdTN = new dTN(localdbY.cNJ(), localdbY.cNL(), boJ.byr().db(localdbY.cNM()), boJ.byr().db(localdbY.cNK()));
    ahL.auH().a(localdTN);
    localdTN.cleanUp();
    return String.valueOf(localdTN.dtJ());
  }

  private static void j(Su paramSu, boolean paramBoolean) {
    byz localbyz = byv.bFN().bFO();
    arl localarl = localbyz.aeQ();
    if ((localarl != null) && (localbyz.aeR() == paramSu.aeR()))
    {
      localarl.aDp().b(paramSu, paramBoolean);
    }
  }

  private static boolean dcw() {
    if (cHM.cBY().cFw())
      return true;
    if (amE.azg().cFw())
      return true;
    if (dFM.dhf().cFw())
      return true;
    return false;
  }

  private static void o(ckT paramckT) {
    lDO.dcx();
    lDO.p(paramckT);
    long l = ()(WakfuClientInstance.awy().awB().c(bmz.fEF) * 1000.0F);

    cAo.cxf().a(lDO, l, 0, 1);
  }

  private static void dcx() {
    lDO.dcx();
  }
}