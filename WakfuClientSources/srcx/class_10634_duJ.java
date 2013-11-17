import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class duJ extends vC
{
  private dTw lzy;
  private static final int lzz = 25;
  private static final int cPR = 0;
  private static final int lzA = 1;
  private static final int kwX = 2;
  private static final int kwY = 3;
  private final BitSet lzB = new BitSet(bfM.values().length);
  private boolean lzC;
  private int cPV;

  public duJ()
  {
    this.lzy = null;
  }

  public duJ(dTw paramdTw) {
    this.lzy = paramdTw;
  }

  public csx qb() {
    return new duJ(this.lzy);
  }

  public aiI pW()
  {
    if (this.lzy != null) {
      switch (csN.hgp[this.lzy.ordinal()]) {
      case 1:
        return aiI.dfB;
      }
    }
    return aiI.dfw;
  }

  public void run()
  {
    if (!pZ()) {
      K.error("Tentative de lancement de l'action '" + pW().bL() + "' alors que isRunnable retourne que l'action est impossible");
      return;
    }

    cew localcew1 = byv.bFN().bFO().aeL();

    if (cBQ.cxL().mZ("recycleDialog")) {
      byv.bFN().b(dhC.cQm());
    }

    cew localcew2 = ((Su)this.dvI).aeL();
    int i = localcew2.dpB();
    int j = localcew2.dpC();
    short s = (short)(int)localcew2.getAltitude();

    if (cqJ.c(localcew1, localcew2) <= 25)
      if (this.lzy != null) {
        switch (csN.hgp[this.lzy.ordinal()]) {
        case 1:
          if (!FJ.a(new czx(((Su)this.dvI).getName(), 1)))
            return;
          dpv localdpv = new dpv();
          localdpv.j(((Su)this.dvI).getId());
          localdpv.ad(i, j, s);
          localdpv.kc(WakfuClientInstance.awy().awB().a(bmz.fEy));
          byv.bFN().aJK().d(localdpv);

          lZ locallZ = new lZ().am(cPU.kAA);
          locallZ.a(bU.fH().getString("fight.invitation", new Object[] { ((Su)this.dvI).getName() }));
          aEe localaEe = new aEe(locallZ.tP());
          localaEe.mm(4);
          CM.LV().a(localaEe);
        }

      }
      else if (((this.dvI instanceof byo)) && (((byo)this.dvI).FB() != null)) {
        int k = ((byo)this.dvI).FB().getId();
        byv.bFN().bFO().rw(k);
      } else {
        byv.bFN().bFO().aA((Su)this.dvI);
      }
  }

  public void a(bfM[] paramArrayOfbfM)
  {
    for (bfM localbfM : paramArrayOfbfM)
      this.lzB.set(localbfM.ordinal(), true);
  }

  private boolean b(bfM[] paramArrayOfbfM)
  {
    for (bfM localbfM : paramArrayOfbfM) {
      if (this.lzB.get(localbfM.ordinal())) {
        return true;
      }
    }
    return false;
  }

  public boolean daw() {
    return b(bfM.values());
  }

  public boolean pZ()
  {
    this.cPV = 0;

    if (!(this.dvI instanceof Su)) {
      return false;
    }

    if (b(new bfM[] { bfM.fto, bfM.ftv, bfM.ftw })) {
      return false;
    }
    byz localbyz = byv.bFN().bFO();

    Su localSu = (Su)this.dvI;

    if (localSu.isDead()) {
      return false;
    }
    if (localbyz.bHa() != null) {
      return false;
    }
    if (localbyz.adF()) {
      return false;
    }
    if (localbyz.bGK()) {
      return false;
    }

    if (aYP.feK.bnQ()) {
      return false;
    }

    if (localbyz.d(dKm.lWN) > 0) {
      return false;
    }
    boolean bool1 = localSu instanceof byo;
    if ((bool1) && (localbyz.c(dKm.lXF)))
      return false;
    ayn localayn;
    if (bool1) {
      byo localbyo = (byo)localSu;
      localayn = localbyo.FB();
    } else {
      localayn = null;
    }
    if (localSu.c(dKm.lWP)) {
      return false;
    }

    if (localSu.c(dKm.lXc)) {
      this.cPV = 1;
    }

    boolean bool2 = bGP.gDv.a(new aGH[] { localbyz });
    boolean bool3 = bGP.gDx.a(new aGH[] { localbyz });
    if (((!bool2) && (this.lzy == dTw.mpS)) || (!bool3)) {
      this.cPV = 2;
    }

    if ((localSu instanceof bKm)) {
      localObject = (bKm)localSu;
      boolean bool4 = bGP.gDv.a(new aGH[] { localObject });
      boolean bool5 = bGP.gDx.a(new aGH[] { localObject });
      if ((!bool5) || ((!bool4) && (this.lzy != dTw.mqi))) {
        this.cPV = 3;
      }
    }

    if (localSu.c(dKm.lWV)) {
      return false;
    }
    Object localObject = localbyz.cJf();
    int i = ((cvY)localObject).bP();
    if ((localayn != null) && (localayn.avc() == i)) {
      return false;
    }

    if (this.lzy != null) {
      switch (csN.hgp[this.lzy.ordinal()]) {
      case 1:
        if (!(localSu instanceof bKm)) {
          return false;
        }
        break;
      }

    }

    return true;
  }

  public String qa()
  {
    if (this.lzy != null) {
      switch (csN.hgp[this.lzy.ordinal()]) {
      case 1:
        return "duelStart";
      }
    }

    return "fightStart";
  }

  public String getLabel()
  {
    if (!(this.dvI instanceof Su)) {
      return qa();
    }

    Su localSu = (Su)this.dvI;

    String str = localSu.getName();

    lZ locallZ = new lZ().tz().am(apQ().bUV());
    if (b(new bfM[] { bfM.ftm }))
      locallZ.a(bU.fH().getString("fight.error.nopathtomonster", new Object[] { str }));
    else if (b(new bfM[] { bfM.ftl }))
      locallZ.a(bU.fH().getString("fight.error.monstertoofar", new Object[] { str }));
    else if (b(new bfM[] { bfM.ftn }))
      locallZ.a(bU.fH().getString("fight.error.insideGroup"));
    else if (b(new bfM[] { bfM.fto }))
      locallZ.a(bU.fH().getString("fight.error.character.inFight", new Object[] { str }));
    else if (b(new bfM[] { bfM.ftp }))
      locallZ.a(bU.fH().getString("fight.error.pvpForbidden", new Object[] { str }));
    else if (b(new bfM[] { bfM.ftq }))
      locallZ.a(bU.fH().getString("systemNotification.instanceConfig.cannotFight"));
    else if (b(new bfM[] { bfM.fts }))
      locallZ.a(bU.fH().getString("fight.error.not.enemy.protector"));
    else if (b(new bfM[] { bfM.ftt }))
      locallZ.a(bU.fH().getString("fight.error.target.level.too.low"));
    else if (b(new bfM[] { bfM.ftu }))
      locallZ.a(bU.fH().getString("fight.error.cant.be.aggro"));
    else if (b(new bfM[] { bfM.ftr }))
      locallZ.a(bU.fH().getString("fight.error.memberBusy"));
    else if (this.lzC)
      locallZ.a(bU.fH().getString("fight.pvp.with", new Object[] { str }));
    else if (this.lzy != null)
      switch (csN.hgp[this.lzy.ordinal()]) {
      case 1:
        locallZ.a(bU.fH().getString("fight.duel.with", new Object[] { str }));
        break;
      default:
        locallZ.a(bU.fH().getString("fight.with", new Object[] { str }));
        break;
      }
    else {
      locallZ.a(bU.fH().getString("fight.with", new Object[] { str }));
    }
    locallZ.tA();

    if (this.cPV != 0) {
      switch (this.cPV) {
      case 1:
        return locallZ.tH().am(ict).a(bU.fH().getString("fight.error.protector.attacked.too.recenlty", new Object[] { str })).tP();
      case 2:
        return locallZ.tH().am(ict).a(bU.fH().getString("error.playerNotSubscribed")).tP();
      case 3:
        return locallZ.tH().am(ict).a(bU.fH().getString("error.targetNotSubscribed")).tP();
      }

    }

    return locallZ.tP();
  }

  public bNa apQ() {
    if (b(new bfM[] { bfM.ftm, bfM.ftl, bfM.ftn, bfM.fto, bfM.ftp, bfM.ftr, bfM.ftq, bfM.fts, bfM.ftu, bfM.ftt }))
    {
      return bNa.gRz;
    }
    return bNa.gRx;
  }

  protected int qc()
  {
    if (this.lzy != null) {
      switch (csN.hgp[this.lzy.ordinal()]) {
      case 1:
        return coH.hXq.aw;
      }
    }
    return coH.hWh.aw;
  }

  public boolean isEnabled() {
    if (!super.isEnabled())
      return false;
    if (daw())
      return false;
    if (this.cPV != 0)
      return false;
    return true;
  }

  public void Q(Object paramObject) {
    super.Q(paramObject);
    Su localSu = (Su)this.dvI;

    if (localSu.isDead()) {
      a(new bfM[] { bfM.ftq });
      return;
    }

    if (localSu.adF()) {
      a(new bfM[] { bfM.fto });
      return;
    }

    dUx localdUx1 = bDk.bLI().cr(localSu.Lk());
    byz localbyz = WakfuClientInstance.awy().awz().bFO();

    cYk localcYk = localbyz.ML();
    boolean bool1 = cwO.Y(localcYk.getX(), localcYk.getY(), localcYk.IB());
    localcYk = localSu.ML();
    boolean bool2 = cwO.Y(localcYk.getX(), localcYk.getY(), localcYk.IB());
    dUx localdUx2 = bDk.bLI().cr(localbyz.Lk());
    if ((!localdUx2.dux()) || (bool1) || (bool2))
      a(new bfM[] { bfM.ftq });
    Object localObject1;
    Object localObject2;
    if ((localSu instanceof byo)) {
      if ((localdUx1 != null) && (!localdUx1.mrT)) {
        a(new bfM[] { bfM.ftq });
      }

      localObject1 = (byo)localSu;
      localObject2 = cWz.cKu().ji(((byo)localObject1).hf());
      if ((localObject2 != null) && (((Tn)localObject2).agr())) {
        a(new bfM[] { bfM.ftr });
      }

      ayn localayn = ((byo)localObject1).FB();
      if ((localayn != null) && (localayn.avc() != 0) && 
        (localbyz.cJf().UI().aMP().jq(localayn.avc()) != dqU.ltp)) {
        a(new bfM[] { bfM.fts });
      }

    }

    if ((localSu instanceof bKm)) {
      if (this.lzy == dTw.mqi) {
        if ((localdUx1 != null) && (!localdUx1.mrU)) {
          a(new bfM[] { bfM.ftp });
        }
        if ((localbyz.c(dKm.lXy)) || (localSu.c(dKm.lXy)))
          a(new bfM[] { bfM.ftv });
      }
      else {
        if ((localbyz.c(dKm.lXz)) || (localSu.c(dKm.lXz))) {
          a(new bfM[] { bfM.ftw });
        }
        if ((localdUx1 != null) && (!localdUx1.mrV)) {
          a(new bfM[] { bfM.ftp });
        }
        if ((localSu.nU() < 15) && (localSu.cQt() == localSu.cJf().bP()) && (!localSu.cJf().HL()))
        {
          a(new bfM[] { bfM.ftt });
        } else if (localSu.c(dKm.lXu))
          a(new bfM[] { bfM.ftu });
        else {
          this.lzC = true;
        }
        return;
      }

    }

    if (!localSu.c(dKm.lXe)) {
      localObject1 = localbyz.aeL();
      localObject2 = ((cew)localObject1).c(localSu.ML(), true, true);
      if (localObject2 == dqg.lrp)
        a(new bfM[] { bfM.ftm });
      else if (((cuB)localObject2).csW() > 25)
        a(new bfM[] { bfM.ftl });
    }
  }

  public List EB()
  {
    byz localbyz = byv.bFN().bFO();

    ArrayList localArrayList = new ArrayList();
    dhJ localdhJ = (dhJ)this.dvI;
    dTw localdTw;
    Object localObject4;
    if ((this.dvI instanceof byo)) {
      localObject1 = (byo)this.dvI;
      localdTw = ((byo)localObject1).FB() != null ? dTw.mpX : dTw.mpT;
      localObject2 = cWz.cKu().ji(((byo)localObject1).hf());
      for (localObject3 = ((Tn)localObject2).ags().iterator(); ((Iterator)localObject3).hasNext(); ) { localObject4 = (dzM)((Iterator)localObject3).next();
        Su localSu = CA.Lv().bj(((dzM)localObject4).getId());
        if (localSu != null)
          localArrayList.add(localSu); }
    }
    else
    {
      localdTw = this.lzy != null ? this.lzy : dTw.mpS;
      localArrayList.add(localdhJ);
    }
    Object localObject1 = bWW.ccf().FB();
    Object localObject2 = new En(localbyz, localdTw, localbyz, localdhJ, localObject1 == null ? null : ((ayn)localObject1).aKu(), localArrayList);

    Object localObject3 = ((En)localObject2).bDr();
    if ((this.lzy != null) && (this.lzy == dTw.mqi)) {
      localObject4 = new Wn(localbyz);
      ((List)localObject3).addAll(((Wn)localObject4).bDr());
    }
    return localObject3;
  }

  public List EC() {
    byz localbyz = byv.bFN().bFO();

    ArrayList localArrayList = new ArrayList();
    dhJ localdhJ = (dhJ)this.dvI;
    De localDe = new De(localbyz);
    dTw localdTw;
    if ((this.dvI instanceof byo)) {
      localObject1 = (byo)this.dvI;
      localdTw = ((byo)localObject1).FB() != null ? dTw.mpX : dTw.mpT;

      if (Ew() == dqU.ltr) {
        localObject2 = cWz.cKu().ji(((byo)localObject1).hf());
        for (localObject3 = ((Tn)localObject2).ags().iterator(); ((Iterator)localObject3).hasNext(); ) { localObject4 = (dzM)((Iterator)localObject3).next();
          Su localSu = CA.Lv().bj(((dzM)localObject4).getId());
          if (localSu != null) {
            localArrayList.add(localSu);
            if (localDe.Mr() != agy.daq)
            {
              acy localacy = blo.bws().qc(((byo)localObject1).bFD().nn());
              if ((localacy != null) && (localacy.aoT()) && (!localacy.aoU()))
              {
                int i = localacy.aoV();
                if (i != 0)
                {
                  if (i > 0)
                    localDe.a(agy.daq);
                  else
                    localDe.a(agy.dap);
                }
              }
            }
          } }
      }
    } else {
      localdTw = this.lzy != null ? this.lzy : dTw.mpS;
      localArrayList.add(localdhJ);
    }
    Object localObject1 = new cxQ(localbyz, localdTw, localbyz);
    Object localObject2 = new bbY(localbyz, localdTw);
    Object localObject3 = new bbb(localbyz, localdhJ, (byte)0, (byte)1, localdTw);

    Object localObject4 = new ArrayList();
    ((ArrayList)localObject4).addAll(((cxQ)localObject1).bDr());
    ((ArrayList)localObject4).addAll(((bbY)localObject2).bDr());
    ((ArrayList)localObject4).addAll(((bbb)localObject3).bDr());
    ((ArrayList)localObject4).addAll(localDe.bDr());
    return localObject4;
  }
}