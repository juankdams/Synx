import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class dqB extends cGj
{
  private static final Logger K = Logger.getLogger(dqB.class);

  private static final dqB lsw = new dqB();
  private final aLb lsx;
  private cyS bgA;
  public static final String bC = "name";
  public static final String fOh = "blazon";
  public static final String lsy = "numMembers";
  public static final String lsz = "membersLevelAverage";
  public static final String lsA = "guildLevelText";
  public static final String lsB = "currentGuildPoints";
  public static final String lsC = "totalGuildPoints";
  public static final String lsD = "conquestPoints";
  public static final String lsE = "membersList";
  public static final String lsF = "displayDisconnectedMembers";
  public static final String lsG = "canInvite";
  public static final String lsH = "iAmLeader";
  public static final String lsI = "guildDescription";
  public static final String lsJ = "guildMessage";
  public static final String lsK = "hasRightToEditGuildDescription";
  public static final String lsL = "hasRightToEditGuildMessage";
  public static final String lsM = "hasRightToEditRanks";
  public static final String lsN = "hasRightToBuyBonus";
  public static final String lsO = "hasHavenWorld";
  public static final String lsP = "havenWorld.auctionBookIconUrl";
  public static final String lsQ = "havenWorldPageWarning";
  public static final String lsR = "localPlayer";
  public static final String gjr = "ranks";
  public static final String hbA = "smileys";
  public static final String eNt = "quests";
  public static final String GB = "level";
  public static final String lsS = "nextLevel";
  public static final String lsT = "nextLevelCost";
  public static final String lsU = "nextLevelDuration";
  public static final String lsV = "canLevelUp";
  public static final String lsW = "availableBonuses";
  public static final String lsX = "loadingBonuses";
  public static final String lsY = "permanentBonuses";
  public static final String lsZ = "temporaryBonuses";
  public static final String lta = "simultaneousBonusesText";
  public static final String ltb = "currentWeekGuildPoints";
  public static final String[] bF = { "name", "blazon", "numMembers", "membersLevelAverage", "guildLevelText", "currentGuildPoints", "totalGuildPoints", "membersList", "displayDisconnectedMembers", "canInvite", "iAmLeader", "guildDescription", "guildMessage", "hasRightToEditGuildDescription", "hasRightToEditGuildMessage", "hasRightToEditRanks", "hasRightToBuyBonus", "havenWorldPageWarning", "localPlayer", "ranks", "quests", "level", "nextLevel", "nextLevelCost", "availableBonuses", "loadingBonuses", "temporaryBonuses", "permanentBonuses", "simultaneousBonusesText", "conquestPoints", "currentWeekGuildPoints" };
  private boolean ltc;
  private final ArrayList ltd;
  private final ArrayList lte;
  private Comparator ltf;
  private boolean cXr;
  private int ltg;
  private final ArrayList lth;

  public dqB()
  {
    this.lsx = new bTr(this);

    this.ltc = true;
    this.ltd = new ArrayList();
    this.lte = new ArrayList();

    this.ltf = aNp.bef();

    this.lth = new ArrayList();
  }

  public static dqB cXD()
  {
    return lsw;
  }

  public void init()
  {
    byz localbyz = byv.bFN().bFO();
    this.bgA = ((ud)localbyz.bSt()).CG();
    cXE();
    aji();
    kh(false);
    this.ltf = aNp.bef();
    this.cXr = true;
    this.ltg = 0;
    this.lth.clear();
    for (aYU localaYU : aYU.values())
    {
      if (localaYU.getId() > 14) {
        break;
      }
      this.lth.add(new AI(this.bgA.ay(localbyz.getId()), localaYU.getId()));
    }
    ki(false);
    dLE.doY().a(this, bF);
  }

  private void cXE() {
    this.bgA.C(new bTq(this));
  }

  private void k(bqd parambqd)
  {
    if (!crP.e(qY.aYI.cw(parambqd.ajL()))) {
      return;
    }

    dvQ localdvQ = aOq.euI.nn(parambqd.ajL());
    localdvQ.byB();
  }

  public void cXF() {
    sP localsP = jX(this.bgA.CE()).arX();
    dLE.doY().t("selectedGuildRank", localsP);
    cpa localcpa = cBQ.cxL().coO().nf("guildManagementDialog");
    if (localcpa == null) {
      return;
    }
    aTp localaTp = (aTp)localcpa.fi("guildName");
    localaTp.setText(localsP.getName());
  }

  public void aji() {
    this.bgA.a(this.lsx);
    this.bgA.a(new azf(this.bgA));
  }

  public AI fv(byte paramByte) {
    for (AI localAI : this.lth) {
      if (localAI.JV() == paramByte) {
        return localAI;
      }
    }
    return null;
  }

  public ArrayList cXG() {
    return this.lte;
  }

  public agw jX(long paramLong) {
    for (agw localagw : this.lte) {
      if (localagw.getId() == paramLong) {
        return localagw;
      }
    }
    return null;
  }

  public aCl ay(long paramLong) {
    return this.bgA.ay(paramLong);
  }

  public boolean isLoaded() {
    return this.bgA != null;
  }

  public cyS CG() {
    return this.bgA;
  }

  public void cXH() {
    String str = bU.fH().getString("guild.newRank");
    long l = cnm.d(new ArrayList());
    aDz localaDz = new aDz(str, l);
    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaDz);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }

  public void jY(long paramLong)
  {
    cXF();
    AR localAR = new AR(paramLong);
    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localAR);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }

  public void a(agw paramagw)
  {
    cvz localcvz = new cvz(paramagw.getId(), paramagw.arU(), paramagw.getName());
    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localcvz);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }

  public void pI(String paramString)
  {
    bIZ localbIZ = new bIZ(paramString);
    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localbIZ);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }

  public void pJ(String paramString)
  {
    dPp localdPp = new dPp(paramString);
    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localdPp);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }

  public void pK(String paramString)
  {
    ZB localZB = new ZB(paramString);
    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localZB);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }

  public void fw(byte paramByte)
  {
    dwH localdwH = new dwH(paramByte);
    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localdwH);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }

  public int size()
  {
    return this.ltd.size();
  }

  public void cXI() {
    aEe localaEe = new aEe(bU.fH().getString("chat.pipeName.guild"), this.bgA.getMessage());
    localaEe.mm(6);
    if (!arV.aEw())
      arV.d(localaEe);
    else
      CM.LV().a(localaEe);
  }

  public void Bd(int paramInt)
  {
    bOB localbOB = aDF.ba((short)paramInt);
    cUh localcUh = aDF.d(localbOB);
    String str1 = "notification.havenWorldBuildingAddedTitle";
    String str2 = bU.fH().b(126, localcUh.nc(), new Object[0]);
    String str3 = bU.fH().getString("notification.havenWorldBuildingAddedText", new Object[] { str2 });

    String str4 = bU.fH().getString("notification.havenWorldBuildingAddedTitle");
    String str5 = cda.createLink(str3, ana.dqj);
    az localaz = new az(str4, str5, ana.dqj);
    cjO.clE().j(localaz);

    String str6 = bU.fH().getString("guild.chatBuildingAdded", new Object[] { str2 });
    aEe localaEe = new aEe(bU.fH().getString("chat.pipeName.guild"), str6);
    localaEe.mm(4);
    CM.LV().a(localaEe);
  }

  public void Be(int paramInt) {
    bOB localbOB = aDF.ba((short)paramInt);
    cUh localcUh = aDF.d(localbOB);
    String str1 = "notification.havenWorldBuildingRemovedTitle";
    String str2 = bU.fH().b(126, localcUh.nc(), new Object[0]);
    String str3 = bU.fH().getString("notification.havenWorldBuildingRemovedText", new Object[] { str2 });

    String str4 = bU.fH().getString("notification.havenWorldBuildingRemovedTitle");
    String str5 = cda.createLink(str3, ana.dqj);
    az localaz = new az(str4, str5, ana.dqj);
    cjO.clE().j(localaz);

    String str6 = bU.fH().getString("guild.chatBuildingRemoved", new Object[] { str2 });
    aEe localaEe = new aEe(bU.fH().getString("chat.pipeName.guild"), str6);
    localaEe.mm(4);
    CM.LV().a(localaEe);
  }

  public void eR(int paramInt1, int paramInt2) {
    bOB localbOB = aDF.ba((short)paramInt2);
    cUh localcUh = aDF.d(localbOB);
    if (localcUh.nc() != paramInt2) {
      Bd(localcUh.nc());
      return;
    }

    String str1 = "notification.havenWorldBuildingEvolvedTitle";
    String str2 = bU.fH().b(126, paramInt1, new Object[0]);
    String str3 = bU.fH().b(126, paramInt2, new Object[0]);
    String str4 = bU.fH().getString("notification.havenWorldBuildingEvolvedText", new Object[] { str2, str3 });

    String str5 = bU.fH().getString("notification.havenWorldBuildingEvolvedTitle");
    String str6 = cda.createLink(str4, ana.dqj);
    az localaz = new az(str5, str6, ana.dqj);
    cjO.clE().j(localaz);

    String str7 = bU.fH().getString("guild.chatBuildingEvolved", new Object[] { str2, str3 });
    aEe localaEe = new aEe(bU.fH().getString("chat.pipeName.guild"), str7);
    localaEe.mm(4);
    CM.LV().a(localaEe);
  }

  public void Bf(int paramInt)
  {
    if (this.ltg == paramInt) {
      this.cXr = (!this.cXr);
    } else {
      this.cXr = true;
      this.ltg = paramInt;
    }

    Object localObject = null;
    switch (this.ltg) {
    case 0:
      if (this.cXr)
        localObject = aNp.bef();
      else {
        localObject = aNp.beg();
      }
      break;
    case 1:
      if (this.cXr)
        localObject = afd.aqF();
      else {
        localObject = afd.aqG();
      }
      break;
    case 2:
      if (this.cXr)
        localObject = ceX.chR();
      else {
        localObject = ceX.chS();
      }
      break;
    case 3:
      if (this.cXr)
        localObject = ceX.chR();
      else {
        localObject = ceX.chS();
      }
      break;
    case 5:
      if (this.cXr)
        localObject = dDo.dfh();
      else {
        localObject = dDo.dfi();
      }
      break;
    case 4:
    }

    this.ltf = ((Comparator)localObject);
    kj(true);
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name")) {
      if (this.bgA == null) {
        return null;
      }
      return this.bgA.getName();
    }
    Object localObject3;
    if (paramString.equals("blazon")) {
      if (this.bgA == null) {
        return null;
      }
      dbY localdbY = new dbY(this.bgA.CH());
      if (localdbY == null) {
        return null;
      }
      dTN localdTN = new dTN(localdbY.cNJ(), localdbY.cNL(), boJ.byr().db(localdbY.cNM()), boJ.byr().db(localdbY.cNK()));
      localObject3 = ahL.auH().a(localdTN);
      localdTN.cleanUp();
      return localObject3;
    }if (paramString.equals("numMembers")) {
      if (this.bgA == null) {
        return Integer.valueOf(0);
      }
      return kg(false).size() + " / " + this.bgA.aNs();
    }
    Object localObject4;
    if (paramString.equals("membersLevelAverage")) {
      if (this.bgA == null) {
        return Integer.valueOf(0);
      }
      long l = 0L;
      for (localObject3 = this.ltd.iterator(); ((Iterator)localObject3).hasNext(); ) { localObject4 = (bxW)((Iterator)localObject3).next();
        l += ((bxW)localObject4).nU();
      }
      return Integer.valueOf(Math.round((float)l / this.bgA.aNs()));
    }if (paramString.equals("currentGuildPoints"))
      return Integer.valueOf(this.bgA.CI());
    if (paramString.equals("conquestPoints"))
    {
      return Integer.valueOf(0);
    }if (paramString.equals("totalGuildPoints"))
      return Integer.valueOf(this.bgA.aNr());
    Object localObject1;
    if (paramString.equals("localPlayer")) {
      localObject1 = new ArrayList();
      ((ArrayList)localObject1).add(cXQ());
      return localObject1;
    }if (paramString.equals("membersList"))
      return kg(this.ltc);
    if (paramString.equals("canInvite"))
      return Boolean.valueOf(b(cnm.hTf));
    if (paramString.equals("displayDisconnectedMembers"))
      return Boolean.valueOf(this.ltc);
    if (paramString.equals("hasRightToEditRanks"))
      return Boolean.valueOf(b(cnm.hTi));
    if (paramString.equals("hasRightToEditGuildDescription"))
      return Boolean.valueOf(b(cnm.hTk));
    if (paramString.equals("hasRightToEditGuildMessage"))
      return Boolean.valueOf(b(cnm.hTl));
    if (paramString.equals("hasRightToBuyBonus"))
      return Boolean.valueOf((cXJ()) && (b(cnm.hTo)));
    if (paramString.equals("hasHavenWorld")) {
      if (this.bgA == null) {
        return null;
      }
      return Boolean.valueOf(dLE.doY().rv("havenWorld") != null);
    }if (paramString.equals("havenWorld.auctionBookIconUrl")) {
      localObject1 = Hh.QM().dh(17426);
      return ay.bd().v(((bBn)localObject1).oc());
    }if (paramString.equals("havenWorldPageWarning")) {
      if (this.bgA == null) {
        return null;
      }
      localObject1 = dLE.doY().rv("havenWorld");
      int j = this.bgA.nU() < 3 ? 1 : 0;
      if ((j != 0) || (localObject1 == null)) {
        return bU.fH().getString("guild.havenWorldPageWarning", new Object[] { Integer.valueOf(3) });
      }
      return null;
    }if (paramString.equals("guildDescription")) {
      if (this.bgA == null) {
        return null;
      }
      return this.bgA.getDescription();
    }if (paramString.equals("guildMessage")) {
      if (this.bgA == null) {
        return null;
      }
      return this.bgA.getMessage();
    }if (paramString.equals("ranks"))
      return this.lte;
    if (paramString.equals("iAmLeader"))
      return Boolean.valueOf(cXP());
    if (paramString.equals("smileys"))
      return this.lth;
    if (paramString.equals("quests"))
      return cXU();
    if (paramString.equals("level"))
      return Short.valueOf(cXM());
    if (paramString.equals("nextLevel")) {
      if (this.bgA.nU() == 10) {
        return null;
      }
      return Integer.valueOf(cXM() + 1);
    }if (paramString.equals("nextLevelCost")) {
      if (this.bgA.nU() == 10) {
        return null;
      }

      return Integer.valueOf(cdH.hxE.uO(cXM() + 1));
    }
    Object localObject2;
    if (paramString.equals("nextLevelDuration")) {
      if (this.bgA.nU() == 10) {
        return null;
      }

      localObject1 = clr.vI(cXM() + 1);
      localObject2 = ((dax)localObject1).cMJ();
      return bXW.l(((cig)localObject2).cjW());
    }
    int i;
    if (paramString.equals("canLevelUp")) {
      if (this.bgA.nU() == 10) {
        return Boolean.valueOf(false);
      }
      i = cdH.hxE.uO(cXM() + 1);
      if (i > this.bgA.CI()) {
        return Boolean.valueOf(false);
      }
      localObject2 = clr.vI(cXM() + 1);
      localObject3 = ((dax)localObject2).cMJ();
      localObject4 = this.bgA.lA(((cig)localObject3).getId());
      return Boolean.valueOf((localObject4 == null) || (!crP.a((bqd)localObject4, (cig)localObject3, this.bgA)));
    }if (paramString.equals("availableBonuses"))
      return cXK();
    if (paramString.equals("loadingBonuses"))
      return cXL();
    if (paramString.equals("temporaryBonuses"))
      return kf(false);
    if (paramString.equals("simultaneousBonusesText")) {
      if (cXJ()) {
        return null;
      }
      i = this.bgA.aNv().bwR();
      return bU.fH().getString("guildBonus.maxSimultaneous", new Object[] { Integer.valueOf(i) });
    }if (paramString.equals("currentWeekGuildPoints")) {
      i = dDE.dft().get(3);
      int k;
      if (this.bgA.aNy() != i)
        k = 0;
      else {
        k = this.bgA.aNx();
      }
      return k + "/" + this.bgA.aNw();
    }if (paramString.equals("permanentBonuses")) {
      ArrayList localArrayList1 = new ArrayList();
      ArrayList localArrayList2 = new ArrayList();
      for (localObject3 = kf(true).iterator(); ((Iterator)localObject3).hasNext(); ) { localObject4 = (dvQ)((Iterator)localObject3).next();
        aRH localaRH = ((dvQ)localObject4).cjZ();
        if (localaRH.Rf() == dyv.lET) {
          cnW localcnW = (cnW)localaRH;
          int m = localcnW.yR();
          dpI localdpI = ciQ.ckL().nc(m);
          localArrayList2.add(localdpI);
        } else {
          localArrayList1.add(((dvQ)localObject4).dbc());
        }
      }

      localObject3 = new aYM(bU.fH(), localArrayList2, (short)0, true);

      localArrayList1.addAll(((aYM)localObject3).aaP());
      return localArrayList1;
    }
    return null;
  }

  private boolean cXJ() {
    int i = this.bgA.aNv().bwR();
    return cXL().size() < i;
  }

  public ArrayList cXK() {
    cSR localcSR = new cSR();

    for (dax localdax : dax.values()) {
      if (!clr.a(localdax))
      {
        cig localcig = localdax.cMJ();
        int k = localcig.getId();
        bqd localbqd = this.bgA.lA(k);
        int m = cdH.hxE.uQ(k);

        if (!localcSR.containsKey(m)) {
          localcSR.put(m, new ArrayList());
        }
        ArrayList localArrayList = (ArrayList)localcSR.get(m);
        if (localbqd == null) {
          localArrayList.add(aOq.euI.nn(k));
        }
      }
    }
    ??? = new ArrayList(localcSR.size());
    mt localmt = null;
    for (dmn localdmn = localcSR.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      localmt = new mt(localdmn.zY(), (ArrayList)localdmn.value());
      ((ArrayList)???).add(localmt);
    }
    Collections.sort((List)???, new bTw(this));

    return ???;
  }

  public ArrayList cXL() {
    ArrayList localArrayList = new ArrayList();

    this.bgA.C(new bTu(this, localArrayList));

    return localArrayList;
  }

  public ArrayList kf(boolean paramBoolean) {
    ArrayList localArrayList = new ArrayList();

    for (dax localdax : dax.values())
      if (!clr.a(localdax))
      {
        cig localcig = localdax.cMJ();
        bqd localbqd = this.bgA.lA(localcig.getId());
        if (localbqd != null)
        {
          if (!(!localcig.bkM() ^ paramBoolean))
          {
            if (!crP.a(localbqd, localcig, this.bgA))
              localArrayList.add(aOq.euI.nn(localcig.getId())); 
          }
        }
      }
    return localArrayList;
  }

  public ArrayList kg(boolean paramBoolean) {
    ArrayList localArrayList = new ArrayList();
    for (bxW localbxW : this.ltd) {
      if ((paramBoolean) || (localbxW.isConnected())) {
        localArrayList.add(localbxW);
      }
    }
    return localArrayList;
  }

  public short cXM() {
    return this.bgA.nU();
  }

  public boolean b(cnm paramcnm) {
    if (this.bgA == null) {
      return false;
    }
    long l = cXN();
    if (l == -1L) {
      return false;
    }
    aUJ localaUJ = this.bgA.az(l);
    if (localaUJ == null) {
      return false;
    }
    return localaUJ.a(paramcnm);
  }

  public long cXN() {
    bxW localbxW = cXQ();
    if (localbxW == null) {
      return -1L;
    }
    return localbxW.aOC();
  }

  public aUJ cXO() {
    if (this.bgA == null) {
      return null;
    }
    return this.bgA.az(cXN());
  }

  public boolean cXP() {
    if (this.bgA == null) {
      return false;
    }
    bxW localbxW = cXQ();
    if (localbxW == null) {
      return false;
    }
    return this.bgA.CE() == localbxW.aOC();
  }

  public bxW cXQ() {
    return jZ(byv.bFN().bFO().getId());
  }

  public bxW jZ(long paramLong) {
    for (bxW localbxW : this.ltd) {
      if (localbxW.getId() == paramLong) {
        return localbxW;
      }
    }
    return null;
  }

  public void kh(boolean paramBoolean) {
    this.lte.clear();
    this.bgA.B(new bTB(this));

    kj(paramBoolean);
    cXR();
    if (paramBoolean)
      dLE.doY().a(this, new String[] { "ranks", "hasRightToEditGuildDescription", "hasRightToEditGuildMessage", "hasRightToEditRanks", "hasRightToBuyBonus" });
  }

  private void cXR()
  {
    Collections.sort(this.lte, new bTA(this));
  }

  private void h(aCl paramaCl)
  {
    for (bxW localbxW : this.ltd) {
      if (localbxW.getId() == paramaCl.getId()) {
        dLE.doY().a(localbxW, bxW.bF);
      }
    }
    dLE.doY().a(this, new String[] { "hasRightToEditGuildDescription", "hasRightToEditGuildMessage", "hasRightToEditRanks", "hasRightToBuyBonus" });
  }

  private void h(aUJ paramaUJ)
  {
    for (agw localagw : this.lte)
      if (localagw.getId() == paramaUJ.getId())
        dLE.doY().a(localagw, agw.bF);
  }

  public void ki(boolean paramBoolean)
  {
    this.ltd.clear();
    this.bgA.A(new bTE(this));

    kj(paramBoolean);
    if (paramBoolean)
      dLE.doY().a(this, new String[] { "numMembers", "membersLevelAverage", "numMembers", "membersList", "localPlayer", "hasRightToEditRanks", "hasRightToEditGuildDescription", "hasRightToEditGuildMessage", "hasRightToBuyBonus" });
  }

  private void kj(boolean paramBoolean)
  {
    Collections.sort(this.ltd, this.ltf);
    if (paramBoolean)
      dLE.doY().a(this, new String[] { "iAmLeader", "canInvite", "membersLevelAverage", "localPlayer", "membersList" });
  }

  public boolean cXS()
  {
    return this.ltc;
  }

  public void kk(boolean paramBoolean) {
    if (this.ltc == paramBoolean) {
      return;
    }
    this.ltc = paramBoolean;
    ki(true);
  }

  public void I(long paramLong1, long paramLong2) {
    aiY localaiY = new aiY(paramLong1, paramLong2);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaiY);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }

  public void ka(long paramLong)
  {
    awh localawh = new awh(paramLong);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localawh);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }

  public void pL(String paramString)
  {
    if (!FJ.a(new czx(paramString, 3))) {
      return;
    }
    String str = bU.fH().getString("guild.inviting.character", new Object[] { paramString });
    CM.LV().f(str, 4);

    aTD localaTD = new aTD(paramString);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaTD);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }

  public void cXT()
  {
    akz localakz = new akz();

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localakz);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }

  public long CE()
  {
    if (this.bgA == null) {
      return -1L;
    }
    return this.bgA.CE();
  }

  public long aNq() {
    if (this.bgA == null) {
      return -1L;
    }
    return this.bgA.aNq();
  }

  private ArrayList cXU() {
    ArrayList localArrayList = new ArrayList();
    dQN.mlr.l(new bTC(this, localArrayList));

    return localArrayList;
  }

  public void clean() {
    if (this.bgA != null) {
      this.bgA.b(this.lsx);
    }
    this.bgA = null;
    this.ltd.clear();
    this.lte.clear();
    this.lth.clear();
  }
}