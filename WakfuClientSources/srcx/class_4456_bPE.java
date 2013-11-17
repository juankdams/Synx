import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class bPE
  implements dBv
{
  private static final bPE gWx = new bPE();
  private static final Logger K = Logger.getLogger(bPE.class);
  public static final String bC = "name";
  public static final String gWy = "candidates";
  public static final String gWz = "government";
  public static final String gWA = "governor";
  public static final String gWB = "marshal";
  public static final String gWC = "general";
  public static final String gWD = "governorHistory";
  public static final String gWE = "isVoteRunning";
  public static final String gWF = "candidateRegistrationFee";
  public static final String frX = "nationColor";
  public static final String frV = "flagIconUrl";
  public static final String tN = "electionClosureDescription";
  public static final String tL = "electionTotalVotes";
  public static final String tM = "electionTotalCandidates";
  public static final String gWG = "governorIsLocalPlayer";
  public static final String gWH = "marshalIsLocalPlayer";
  public static final String gWI = "generalIsLocalPlayer";
  public static final String gWJ = "governorTitles";
  public static final String gWK = "timeBeforeMandateEnd";
  public static final String gWL = "timeBeforeMandateEndPerc";
  public static final String gWM = "mandateStartDate";
  public static final String gWN = "mandateEndDate";
  public static final String gWO = "localPlayerHasRankToChangeTaxes";
  public static final String gWP = "localPlayerHasRankToBuyChallenges";
  public static final String gWQ = "localPlayerHasRankToBuyClimateBonuses";
  public static final String gWR = "localPlayerHasRankToBuyZoology";
  public static final String gWS = "localPlayerHasRankToChangeLaws";
  public static final String gWT = "localPlayerHasRankToChangeDiplomacy";
  public static final String gWU = "protectorList";
  public static final String gWV = "protectorTotalWillsSize";
  public static final String gWW = "protectorSatisfiedWillsSize";
  public static final String gWX = "economy";
  public static final String gWY = "laws";
  public static final String gWZ = "otherNationsLaws";
  public static final String gXa = "nationDiplomacyList";
  public static final String gXb = "sortedNationTerritoriesList";
  public static final String gXc = "currentGovernorOpinionId";
  public static final String gXd = "currentGovernorOpinionText";
  public static final String gXe = "currentGovernorOpinionValue";
  public static final String gXf = "opinionBadConsequency";
  public static final String gXg = "opinionGoodConsequency";
  public static final String gXh = "currentGovernorPopularityScoreText";
  public static final String gXi = "opinionDirty";
  public static final String gXj = "cantGiveOpinionReason";
  public static final String gXk = "protectorBuffsRegular";
  public static final String gXl = "protectorBuffsShukrute";
  public static final String gXm = "protectorNumBuffsRegular";
  public static final String gXn = "protectorNumBuffsShukrute";
  public static final String[] bF = { "name", "candidates", "government", "governor", "governorHistory", "isVoteRunning", "candidateRegistrationFee", "nationColor", "flagIconUrl", "electionClosureDescription", "electionTotalVotes", "electionTotalCandidates", "governorIsLocalPlayer", "marshalIsLocalPlayer", "generalIsLocalPlayer", "governorTitles", "timeBeforeMandateEnd", "timeBeforeMandateEndPerc", "mandateStartDate", "mandateEndDate", "localPlayerHasRankToChangeTaxes", "localPlayerHasRankToBuyChallenges", "localPlayerHasRankToBuyClimateBonuses", "localPlayerHasRankToBuyZoology", "localPlayerHasRankToChangeLaws", "localPlayerHasRankToChangeDiplomacy", "protectorList", "protectorTotalWillsSize", "protectorSatisfiedWillsSize", "economy", "laws", "nationDiplomacyList", "sortedNationTerritoriesList", "otherNationsLaws", "currentGovernorOpinionId", "currentGovernorOpinionText", "currentGovernorOpinionValue", "opinionDirty", "cantGiveOpinionReason" };
  public static final String gXo = "fca33a";
  private aYr bwL;
  private final dHF gXp = new dHF();

  private cSR gXq = new cSR();
  private Ax gXr;
  private aCe gXs;
  private aCe gXt;
  private cLP gXu;
  private bPu gXv = new bPu();
  private ArrayList gXw;
  private aoL dUM = new aoL();
  private ArrayList gXx;
  private String gXy;
  private ArrayList gXz;
  private bYL gXA;
  private cuk gXB;
  private ArrayList gXC;
  private ArrayList gXD;
  private cSR gXE = new cSR();
  private dFu gXF = new dFu();
  private ArrayList gXG;
  private byte gXH;
  final ceG gXI = new cQH(this);

  final ceG gXJ = new cQJ(this);

  final ceG gXK = new cQL(this);

  final ceG gXL = new cQM(this);

  final ceG gXM = new cQO(this);

  final ceG gXN = new cRa(this);

  final ceG gXO = new cQZ(this);
  private bjI aML;
  private bjI gXP;
  final ceG gXQ = new cRc(this);

  final ceG gXR = new cRb(this);

  public static bPE bWu()
  {
    return gWx;
  }

  private bPE()
  {
    Yp localYp;
    for (localYp : Yp.values())
    {
      if ((localYp != Yp.cIQ) && (localYp != Yp.cIX) && (localYp != Yp.cIY))
      {
        this.dUM.put(localYp.getId(), new dNp(localYp));
      }
    }
    for (localYp : aon.values()) {
      this.gXv.c(localYp.nc(), new ase(localYp));
    }

    this.gXv.c((short)-1, new ase(null));
  }

  private void bWv()
  {
    if (UI() == aYr.feh) {
      return;
    }
    bWZ();
    int i = 0;
    boolean bool = bWx();
    int j = dLE.doY().rr("nationCurrentPageIndex");
    int k = j == 3 ? 1 : 0;
    int m = (cBQ.cxL().mZ("nationDialog")) && (k != 0) ? 1 : 0;
    bjJ localbjJ;
    if ((bool) && (k == 0)) {
      localbjI = gz(bool);

      for (localbjJ = localbjI.buW(); localbjJ.hasNext(); ) {
        localbjJ.fl();

        i = 1;
        localdqU = dqU.fx(localbjJ.Gh());
        str1 = null;
        str2 = null;
        switch (aMK.bDD[localdqU.ordinal()]) {
        case 1:
          str1 = "nation.suggestAllianceChat";
          str2 = "notification.diplomacySuggestAllianceText";
          break;
        case 2:
          str1 = "nation.suggestTruceChat";
          str2 = "notification.diplomacySuggestTruceText";
        }

        if (str1 != null) {
          n = dsh.luB.BA(localbjJ.zY()).bP();
          str3 = bU.fH().b(39, n, new Object[0]);
          str4 = bU.fH().getString(str1, new Object[] { str3 });
          localObject = new aEe(str4);
          ((aEe)localObject).mm(8);
          CM.LV().a((aEe)localObject);
        }

        if (str2 != null) {
          n = dsh.luB.BA(localbjJ.zY()).bP();
          str3 = bU.fH().b(39, n, new Object[0]);

          str4 = bU.fH().getString("notification.diplomacyTitle");

          localObject = cda.createLink(bU.fH().getString(str2, new Object[] { str3 }), ana.dqi, "3");

          localaz = new az(str4, (String)localObject, ana.dqi, 600132);
          cjO.clE().j(localaz);
        }
      }
    }
    dqU localdqU;
    String str1;
    String str2;
    int n;
    String str3;
    String str4;
    Object localObject;
    az localaz;
    bjI localbjI = gz(false);
    if (this.aML != null) {
      for (localbjJ = localbjI.buW(); localbjJ.hasNext(); ) {
        localbjJ.fl();
        if (localbjJ.Gh() != this.aML.get(localbjJ.zY())) {
          i = 1;
          localdqU = dqU.fx(localbjJ.Gh());
          str1 = null;
          str2 = null;
          switch (aMK.bDD[localdqU.ordinal()]) {
          case 1:
            str1 = "nation.allianceChat";
            str2 = "notification.diplomacyAllianceText";
            break;
          case 2:
            if (dqU.fx(this.aML.get(localbjJ.zY())) == dqU.ltr) {
              str1 = "nation.breakAllianceChat";
              str2 = "notification.diplomacyBreakAllianceText";
            } else {
              str1 = "nation.truceChat";
              str2 = "notification.diplomacyTruceText";
            }
            break;
          case 3:
            str1 = "nation.declareWarChat";
            str2 = "notification.diplomacyWarText";
          }

          if (str1 != null) {
            n = dsh.luB.BA(localbjJ.zY()).bP();
            str3 = bU.fH().b(39, n, new Object[0]);
            str4 = bU.fH().getString(str1, new Object[] { str3 });
            localObject = new aEe(str4);
            ((aEe)localObject).mm(8);
            CM.LV().a((aEe)localObject);
          }

          if (str2 != null) {
            n = dsh.luB.BA(localbjJ.zY()).bP();
            str3 = bU.fH().b(39, n, new Object[0]);

            str4 = bU.fH().getString("notification.diplomacyTitle");

            localObject = cda.createLink(bU.fH().getString(str2, new Object[] { str3 }), ana.dqi, "3");

            localaz = new az(str4, (String)localObject, ana.dqi, 600132);
            cjO.clE().j(localaz);
          }
        }
      }

    }

    this.aML = localbjI;

    dLE.doY().a(this, new String[] { "nationDiplomacyList", "sortedNationTerritoriesList" });
    if ((m == 0) && (i != 0)) {
      Bf.Kk().Kn();
    }
    bTX.cah().gG(true);
  }

  private bjI gz(boolean paramBoolean) {
    bjI localbjI = new bjI();
    for (bdm localbdm : bWy()) {
      if (!localbdm.bsp())
      {
        int i = localbdm.bP();
        if (paramBoolean) {
          if (localbdm.bro())
            localbjI.o(i, dqU.ltr.bJ());
          else if (localbdm.brp())
            localbjI.o(i, dqU.ltq.bJ());
        }
        else {
          localbjI.o(i, localbdm.brq().bJ());
        }
      }
    }
    return localbjI;
  }

  public void m(aYr paramaYr) {
    if (this.bwL != null) {
      this.bwL.a(bYR.hoQ).b(this.gXI);
      this.bwL.a(bYR.hoR).b(this.gXJ);
      this.bwL.a(bYR.hoU).b(this.gXK);
      this.bwL.a(bYR.hoW).b(this.gXL);
      this.bwL.a(bYR.hoP).b(this.gXM);
      this.bwL.a(bYR.hoX).b(this.gXO);
      for (localdmn = dsh.luB.cgk(); localdmn.hasNext(); ) {
        localdmn.fl();
        localaYr = (aYr)localdmn.value();
        localaYr.a(bYR.hoS).b(this.gXQ);
        localaYr.a(bYR.hoS).b(this.gXR);
        localaYr.a(bYR.hoP).b(this.gXN);
      }
    }
    aYr localaYr;
    this.bwL = paramaYr;

    dLE.doY().t("nation", this);

    this.bwL.a(bYR.hoQ).a(this.gXI);
    this.bwL.a(bYR.hoR).a(this.gXJ);
    this.bwL.a(bYR.hoU).a(this.gXK);
    this.bwL.a(bYR.hoW).a(this.gXL);
    this.bwL.a(bYR.hoP).a(this.gXM);
    this.bwL.a(bYR.hoX).a(this.gXO);
    for (dmn localdmn = dsh.luB.cgk(); localdmn.hasNext(); ) {
      localdmn.fl();
      localaYr = (aYr)localdmn.value();
      localaYr.a(bYR.hoS).a(this.gXR);
      localaYr.a(bYR.hoP).a(this.gXN);
    }
    updateUI();
  }

  public String getName() {
    if (this.bwL != null) {
      return bU.fH().b(39, this.bwL.bP(), new Object[0]);
    }

    return null;
  }

  public dNp gT(long paramLong) {
    return (dNp)this.dUM.get(paramLong);
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return getName();
    if (paramString.equals("candidates")) {
      int i = aUy.bjB().bjE();
      if ((this.gXq.isEmpty()) || (!this.gXq.containsKey(i))) {
        return null;
      }
      return this.gXq.get(i);
    }if (paramString.equals("isVoteRunning"))
      return Boolean.valueOf(this.bwL.aMX());
    if (paramString.equals("candidateRegistrationFee"))
      return Integer.valueOf(aMN());
    Object localObject1;
    if (paramString.equals("government")) {
      if (this.gXx == null) {
        this.gXx = new ArrayList();
        for (localObject1 = this.dUM.aBa(); ((cHu)localObject1).hasNext(); ) {
          ((cHu)localObject1).fl();
          this.gXx.add(((cHu)localObject1).value());
        }
        Collections.sort(this.gXx, new aMR(this));
      }

      return this.gXx;
    }if (paramString.equals("governorHistory"))
      return this.gXu;
    if (paramString.equals("governor")) {
      if (this.gXr == null) {
        localObject1 = this.bwL.aNd().clp();
        if (localObject1 != null) {
          this.gXr = new Ax((dpE)localObject1);
        }
      }
      return this.gXr;
    }if (paramString.equals("marshal")) {
      if (this.gXt == null) {
        localObject1 = this.bwL.aNd().n(Yp.cIS);
        if (localObject1 != null) {
          this.gXt = new aCe((dpE)localObject1);
        }
      }
      return this.gXt;
    }if (paramString.equals("general")) {
      if (this.gXs == null) {
        localObject1 = this.bwL.aNd().n(Yp.cIT);
        if (localObject1 != null) {
          this.gXs = new aCe((dpE)localObject1);
        }
      }
      return this.gXs;
    }if (paramString.equals("flagIconUrl"))
      try {
        return String.format(ay.bd().getString("nationFlagIconsPath"), new Object[] { Integer.valueOf(this.bwL.bP()) });
      } catch (bdh localbdh) {
        K.warn(localbdh.getMessage());
        return null;
      }
    if (paramString.equals("electionClosureDescription"))
      return bU.fH().getString("election.closureDescription", new Object[] { "fca33a", bWP() });
    int j;
    if (paramString.equals("electionTotalCandidates")) {
      j = this.bwL.aMX() ? this.bwL.abA() : this.bwL.aNc().abA();
      return bU.fH().getString("election.totalCandidates", new Object[] { "fca33a", Integer.valueOf(j) });
    }if (paramString.equals("electionTotalVotes")) {
      j = this.bwL.aMX() ? this.bwL.aNb() : this.bwL.aNc().aNb();
      return bU.fH().getString("election.totalVotes", new Object[] { "fca33a", Integer.valueOf(j) });
    }if (paramString.equals("governorIsLocalPlayer")) {
      if (this.gXr == null) {
        return Boolean.valueOf(false);
      }
      return Boolean.valueOf(this.gXr.cEO().getId() == byv.bFN().bFO().getId());
    }if (paramString.equals("marshalIsLocalPlayer")) {
      if (this.gXt == null) {
        return Boolean.valueOf(false);
      }
      return Boolean.valueOf(this.gXt.cEO().getId() == byv.bFN().bFO().getId());
    }if (paramString.equals("generalIsLocalPlayer")) {
      if (this.gXs == null) {
        return Boolean.valueOf(false);
      }
      return Boolean.valueOf(this.gXs.cEO().getId() == byv.bFN().bFO().getId());
    }
    Object localObject2;
    if (paramString.equals("governorTitles")) {
      if (this.gXw == null) {
        this.gXw = new ArrayList();
        for (localObject2 = this.gXv.bVW(); ((bM)localObject2).hasNext(); ) {
          ((bM)localObject2).fl();
          this.gXw.add(((bM)localObject2).value());
        }
        Collections.sort(this.gXw, new aMP(this));
      }

      return this.gXw;
    }if (paramString.equals("nationColor"))
      return getColor();
    int m;
    if (paramString.equals("mandateStartDate")) {
      localObject2 = bWO();
      m = ((cYq)localObject2).getMinutes();
      return bU.fH().getString("nation.shortElectionDate", new Object[] { Integer.valueOf(((cYq)localObject2).getDay()), Integer.valueOf(((cYq)localObject2).getMonth()), Integer.valueOf(((cYq)localObject2).getYear()), Integer.valueOf(((cYq)localObject2).getHours()), m < 10 ? "0" + m : Integer.valueOf(m) });
    }
    if (paramString.equals("mandateEndDate")) {
      localObject2 = bWN();
      m = ((cYq)localObject2).getMinutes();
      return bU.fH().getString("nation.shortElectionDate", new Object[] { Integer.valueOf(((cYq)localObject2).getDay()), Integer.valueOf(((cYq)localObject2).getMonth()), Integer.valueOf(((cYq)localObject2).getYear()), Integer.valueOf(((cYq)localObject2).getHours()), m < 10 ? "0" + m : Integer.valueOf(m) });
    }
    if (paramString.equals("timeBeforeMandateEndPerc"))
      return new cwC(bWM() * 100.0F);
    if (paramString.equals("localPlayerHasRankToChangeTaxes")) {
      localObject2 = byv.bFN().bFO().cJf().HK();
      return Boolean.valueOf((localObject2 != null) && (bfi.g((Yp)localObject2)));
    }if (paramString.equals("localPlayerHasRankToBuyClimateBonuses")) {
      localObject2 = byv.bFN().bFO().cJf().HK();
      return Boolean.valueOf((localObject2 != null) && (bfi.i((Yp)localObject2)));
    }if (paramString.equals("localPlayerHasRankToBuyZoology")) {
      localObject2 = byv.bFN().bFO().cJf().HK();
      return Boolean.valueOf((localObject2 != null) && (bfi.f((Yp)localObject2)));
    }if (paramString.equals("localPlayerHasRankToChangeLaws"))
      return Boolean.valueOf(bWA());
    if (paramString.equals("localPlayerHasRankToBuyChallenges")) {
      localObject2 = byv.bFN().bFO().cJf().HK();
      return Boolean.valueOf((localObject2 != null) && (bfi.e((Yp)localObject2)));
    }if (paramString.equals("localPlayerHasRankToChangeDiplomacy"))
      return Boolean.valueOf(bWx());
    int k;
    Object localObject4;
    Object localObject5;
    if (paramString.equals("protectorTotalWillsSize")) {
      k = 0;
      localObject4 = bWD();
      for (localObject5 = ((ArrayList)localObject4).iterator(); ((Iterator)localObject5).hasNext(); ) { aoB localaoB = (aoB)((Iterator)localObject5).next();
        k += localaoB.aAO();
      }
      return Integer.valueOf(k);
    }if (paramString.equals("protectorSatisfiedWillsSize")) {
      k = 0;
      for (localObject4 = bWD().iterator(); ((Iterator)localObject4).hasNext(); ) { localObject5 = (aoB)((Iterator)localObject4).next();
        k += ((aoB)localObject5).aAQ();
      }
      return Integer.valueOf(k);
    }if (paramString.equals("protectorList"))
      return bWD();
    if (paramString.equals("timeBeforeMandateEnd"))
      return Float.valueOf(bWM());
    Object localObject3;
    if (paramString.equals("otherNationsLaws")) {
      if (this.gXG == null) {
        this.gXG = new ArrayList();
        for (localObject3 = dsh.luB.cgk(); ((dmn)localObject3).hasNext(); ) {
          ((dmn)localObject3).fl();
          localObject4 = (aYr)((dmn)localObject3).value();
          if ((((aYr)localObject4).bP() != this.bwL.bP()) && (((aYr)localObject4).bP() != 0)) {
            this.gXG.add(new cuk(this, (aYr)localObject4));
          }
        }
      }
      return this.gXG;
    }if (paramString.equals("laws"))
      return bWB();
    if (paramString.equals("economy")) {
      if (this.gXA == null) {
        this.gXA = new bYL(this, this.bwL.aMO().t());
      }
      return this.gXA;
    }if (paramString.equals("nationDiplomacyList"))
      return bWy();
    if (paramString.equals("sortedNationTerritoriesList"))
      return bWz();
    if (paramString.equals("opinionBadConsequency")) {
      localObject3 = new DecimalFormat("#0.##");
      localObject4 = ((NumberFormat)localObject3).format(-50.0D) + '%';
      return bU.fH().getString("nation.opinionBadConsequency", new Object[] { localObject4 });
    }if (paramString.equals("opinionGoodConsequency")) {
      localObject3 = new DecimalFormat("#0.##");
      localObject4 = ((NumberFormat)localObject3).format(50.0D) + '%';
      return bU.fH().getString("nation.opinionGoodConsequency", new Object[] { localObject4 });
    }if (paramString.equals("currentGovernorPopularityScoreText")) {
      localObject3 = UI().aMQ();
      localObject4 = new DecimalFormat("#0.##");
      localObject5 = new lZ();
      ((lZ)localObject5).tz().a(bU.fH().getString("nation.opinionScore")).a(" : ");
      ((lZ)localObject5).a(((NumberFormat)localObject4).format(((dPE)localObject3).dhW() * 100.0F)).e('%');
      return ((lZ)localObject5).tP();
    }
    int i1;
    if (paramString.equals("currentGovernorOpinionText")) {
      localObject3 = UI().aMQ();
      int n = ((dPE)localObject3).b(asK.dCB);
      i1 = ((dPE)localObject3).b(asK.dCA);
      int i2 = ((dPE)localObject3).b(asK.dCz);
      DecimalFormat localDecimalFormat = new DecimalFormat("#0.##");
      lZ locallZ = new lZ();
      locallZ.tz().a(bU.fH().getString("nation.opinionScore")).a(" : ");
      locallZ.a(localDecimalFormat.format(((dPE)localObject3).dhW() * 100.0F)).a("%");
      locallZ.tA().tH();
      locallZ.tI().am(bNa.gRA.bUV());
      locallZ.a(bU.fH().getString("nation.opinionGood")).a(" : ");
      locallZ.bw(n);
      locallZ.tJ().tH();
      locallZ.tI().am(bNa.gRK.bUV());
      locallZ.a(bU.fH().getString("nation.opinionNeutral")).a(" : ");
      locallZ.bw(i1);
      locallZ.tJ().tH();
      locallZ.tI().am(bNa.gRz.bUV());
      locallZ.a(bU.fH().getString("nation.opinionBad")).a(" : ");
      locallZ.bw(i2);
      locallZ.tJ();
      return locallZ.tP();
    }if (paramString.equals("currentGovernorOpinionValue")) {
      localObject3 = UI().aMQ();
      return new cwC((((dPE)localObject3).dqH() > 0 ? ((dPE)localObject3).dhW() + 1.0F : 1.0F) / 2.0F * 100.0F);
    }if (paramString.equals("opinionDirty"))
      return Boolean.valueOf(this.gXH != byv.bFN().bFO().cJf().biJ().bUy);
    if (paramString.equals("cantGiveOpinionReason")) {
      localObject3 = UI().aMQ();
      byz localbyz = byv.bFN().bFO();
      if (!bGP.gDv.a(new aGH[] { localbyz })) {
        return bU.fH().getString("error.playerNotSubscribed");
      }

      i1 = ((dPE)localObject3).l(localbyz);
      if (i1 == 0) {
        return null;
      }
      switch (i1) {
      case 2:
        return bU.fH().getString("opinionReason.didntVote");
      case 1:
        return bU.fH().getString("opinionReason.voteRunning");
      case 3:
        return bU.fH().getString("opinionReason.noGovernor");
      }

      return null;
    }if (paramString.equals("currentGovernorOpinionId"))
      return Byte.valueOf(bWG());
    if (paramString.equals("protectorBuffsRegular"))
      return a(bMn.gPH);
    if (paramString.equals("protectorBuffsShukrute"))
      return a(bMn.gPI);
    if (paramString.equals("protectorNumBuffsRegular"))
      return Integer.valueOf(b(bMn.gPH));
    if (paramString.equals("protectorNumBuffsShukrute")) {
      return Integer.valueOf(b(bMn.gPI));
    }
    return null;
  }

  private ArrayList a(bMn parambMn) {
    crV localcrV = this.bwL.auU();
    if (localcrV == null) {
      return null;
    }

    ArrayList localArrayList = new ArrayList();
    int i = 0; for (int j = localcrV.size(); i < j; i++) {
      cHN localcHN = dPR.mji.Do(localcrV.get(i));
      if (localcHN.cBZ() == parambMn) {
        localArrayList.add(new asP(localcHN, null, false));
      }
    }

    return localArrayList;
  }

  private int b(bMn parambMn) {
    crV localcrV = this.bwL.auU();
    if (localcrV == null) {
      return 0;
    }

    int i = 0;
    int j = 0; for (int k = localcrV.size(); j < k; j++) {
      cHN localcHN = dPR.mji.Do(localcrV.get(j));
      if (localcHN.cBZ() == parambMn) {
        i++;
      }
    }

    return i;
  }

  private boolean bWw() {
    return this.bwL.aNd().hv(byv.bFN().bFO().getId()) != null;
  }

  private boolean bWx() {
    byz localbyz = byv.bFN().bFO();
    if (localbyz == null) {
      return false;
    }
    Yp localYp = localbyz.cJf().HK();
    return (localYp != null) && (bfi.k(localYp));
  }

  public void e(int paramInt, String paramString) {
    this.gXE.put(paramInt, paramString);
  }

  public String tJ(int paramInt) {
    return (String)this.gXE.get(paramInt);
  }

  private ArrayList bWy()
  {
    dmn localdmn;
    if (this.gXC == null) {
      this.gXC = new ArrayList();
      for (localdmn = dsh.luB.cgk(); localdmn.hasNext(); ) {
        localdmn.fl();
        int i = localdmn.zY();
        if (i != 0) {
          this.gXC.add(new bdm(i));
        }
      }
    }
    return this.gXC;
  }

  private ArrayList bWz() {
    if (this.gXD == null) {
      this.gXD = new ArrayList();
      for (dmn localdmn = dsh.luB.cgk(); localdmn.hasNext(); ) {
        localdmn.fl();
        int j = localdmn.zY();

        if (tK(j) > 0) {
          this.gXD.add(new dKz(j));
        }
      }
      Collections.sort(this.gXD, new aMQ(this));

      int i = 0;
      for (dKz localdKz : this.gXD) {
        i += localdKz.u();
        localdKz.CN(i);
      }
      Collections.sort(this.gXD, new aMJ(this));
    }

    return this.gXD;
  }

  private boolean bWA() {
    Yp localYp = byv.bFN().bFO().cJf().HK();
    return (localYp != null) && (bfi.j(localYp));
  }

  private cuk bWB() {
    if (this.gXB == null) {
      this.gXB = new cuk(this, this.bwL);
    }
    return this.gXB;
  }

  public int bWC() {
    return cuk.a(this.gXB);
  }

  private ArrayList bWD()
  {
    dmn localdmn;
    if (this.gXz == null) {
      this.gXz = new ArrayList();
      for (localdmn = this.bwL.aMO().s(); localdmn.hasNext(); ) {
        localdmn.fl();
        this.gXz.add(new aoB((bkQ)localdmn.value()));
      }
    }
    return this.gXz;
  }

  public void bWE() {
    dLE.doY().a(this.gXB, new String[] { "currentLawPoints" });
  }

  public int bWF() {
    int i = 0;
    for (dmn localdmn = dsh.luB.cgk(); localdmn.hasNext(); ) {
      localdmn.fl();
      i += tK(localdmn.zY());
    }
    return i;
  }

  public int tK(int paramInt) {
    return this.gXF.get(paramInt);
  }

  public void de(int paramInt1, int paramInt2) {
    this.gXF.fg(paramInt1, paramInt2);
  }

  public void q(aYr paramaYr) {
    paramaYr.a(bYR.hoP).a(this.gXN);
  }

  public void r(aYr paramaYr) {
    paramaYr.a(bYR.hoP).b(this.gXN);
  }

  public void dv(byte paramByte) {
    this.gXH = paramByte;
    dLE.doY().a(this, new String[] { "currentGovernorOpinionId", "currentGovernorOpinionValue", "opinionDirty" });
  }

  public byte bWG() {
    return this.gXH;
  }

  public void bWH() {
    if (this.gXt == null) {
      return;
    }
    dLE.doY().a(this.gXt, this.gXt.getFields());
  }

  public void bWI() {
    if (this.gXs == null) {
      return;
    }
    dLE.doY().a(this.gXs, this.gXs.getFields());
  }

  public void a(aCe paramaCe) {
    dLE.doY().a(paramaCe, paramaCe.getFields());
  }

  public void clean() {
    bWJ();
    bWY();
  }

  public void bWJ() {
    bWZ();
    bXh();
    bWV();
    bWW();
    bWX();
    bWU();
    gA(false);
    kk(null);
  }

  public void gA(boolean paramBoolean)
  {
    dmn localdmn;
    aYr localaYr;
    if (paramBoolean)
      for (localdmn = dsh.luB.cgk(); localdmn.hasNext(); ) {
        localdmn.fl();
        localaYr = (aYr)localdmn.value();
        localaYr.a(bYR.hoS).b(this.gXR);
        localaYr.a(bYR.hoS).a(this.gXQ);
      }
    else
      for (localdmn = dsh.luB.cgk(); localdmn.hasNext(); ) {
        localdmn.fl();
        localaYr = (aYr)localdmn.value();
        localaYr.a(bYR.hoS).b(this.gXQ);
        localaYr.a(bYR.hoS).a(this.gXR);
      }
  }

  public void bWK()
  {
    clean();
    dLE.doY().a(this, bF);
  }

  public void bWL() {
    this.gXz = null;
    dLE.doY().a(this, new String[] { "protectorList" });
  }

  private float bWM()
  {
    dxL localdxL = dDE.dft().VN();
    cYq localcYq = bWO();
    kb localkb1 = localcYq.V(localdxL);
    kb localkb2 = new kb(this.bwL.bnI());
    localkb2.e(this.bwL.aMV());
    return (float)localkb1.rO() / (float)localkb2.rO();
  }

  private cYq bWN() {
    cYq localcYq = new cYq(this.bwL.aMT());
    localcYq.n(this.bwL.aMV());
    return localcYq;
  }

  private cYq bWO() {
    cYq localcYq = new cYq(this.bwL.aMT());
    localcYq.n(this.bwL.aMV());
    localcYq.o(this.bwL.bnI());
    return localcYq;
  }

  private String bWP() {
    cYq localcYq = cYq.jq(System.currentTimeMillis());
    dxL localdxL = this.bwL.aMT();
    kb localkb = new kb(this.bwL.aMV().rO() - localdxL.V(localcYq).rO());
    if (!localkb.rN()) {
      return "-";
    }

    return bU.fH().getString("remainingDuration", new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(localkb.getDays()), Integer.valueOf(localkb.getHours()), Integer.valueOf(localkb.getMinutes()), Integer.valueOf(localkb.getSeconds()) });
  }

  public int aMN() {
    return this.bwL.aMN();
  }

  private bNa getColor() {
    return clP.hPn;
  }

  public void a(String paramString, Object paramObject) {
  }

  public void b(String paramString, Object paramObject) {
  }

  public void c(String paramString, Object paramObject) {
  }

  public boolean l(String paramString) {
    return false;
  }

  private void bWQ() {
    if (this.bwL == null) {
      return;
    }
    byz localbyz = byv.bFN().bFO();
    if (localbyz == null) {
      return;
    }
    cjH localcjH = this.bwL.aNd();
    dpE localdpE1 = localcjH.hv(localbyz.getId());
    for (cHu localcHu = this.dUM.aBa(); localcHu.hasNext(); ) {
      localcHu.fl();
      dNp localdNp = (dNp)localcHu.value();
      Yp localYp = localdNp.HK();
      dpE localdpE2 = localcjH.n(localYp);
      localdNp.rw(localdpE2 == null ? null : localdpE2.getName());
    }
  }

  private void bWR() {
    if (this.bwL == null) {
      return;
    }

    int i = this.bwL.aMX() ? aUy.bjB().bjE() : 0;

    while (i != -1) {
      ArrayList localArrayList1 = (ArrayList)this.gXq.get(i);
      if ((localArrayList1 != null) && (!this.bwL.aMX())) {
        i = tL(i + 1);
      }
      else {
        localArrayList1 = new ArrayList();
        ArrayList localArrayList2 = new ArrayList();
        if (this.bwL.aMX())
          this.bwL.b(0, 3, localArrayList2);
        else if (localArrayList1.size() == 0) {
          this.bwL.aNc().b(i * 3, 3, localArrayList2);
        }

        if (localArrayList2.size() == 0) {
          i = -1;
        }
        else
        {
          int j = 1;
          for (Qy localQy : localArrayList2) {
            if ((i == 0) && (j != 0) && (!this.bwL.aMX()) && (!localQy.ach()))
              localArrayList1.add(new Vf(localQy));
            else {
              localArrayList1.add(new cLP(localQy));
            }
            j = 0;
          }
          this.gXq.put(i, localArrayList1);
          i = this.bwL.aMX() ? -1 : tL(i + 1);
        }
      }
    }
  }

  private int tL(int paramInt) { for (int i = paramInt; i < this.gXq.size(); i++) {
      ArrayList localArrayList = (ArrayList)this.gXq.get(i);
      if (localArrayList == null) {
        return -1;
      }
      if (localArrayList.size() < 3) {
        return i;
      }
    }
    return paramInt;
  }

  public void bWS()
  {
    for (dmn localdmn = this.gXq.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      ArrayList localArrayList = (ArrayList)localdmn.value();
      int i = 0; for (int j = localArrayList.size(); i < j; i++) {
        ((cLP)localArrayList.get(i)).clear();
      }
    }
    this.gXq.clear();
    this.bwL.aMZ();
  }

  public void bWT() {
    this.gXB = null;
  }

  public void bWU() {
    this.gXG = null;
  }

  public void bWV() {
    this.gXr = null;
  }

  public void bWW() {
    this.gXt = null;
  }

  public void bWX() {
    this.gXs = null;
  }

  public void bWY() {
    this.aML = null;
  }

  public void bWZ()
  {
    this.gXC = null;
    this.gXD = null;
  }

  public void updateUI() {
    bWR();
    bWQ();
    bXf();
    bWI();
    bWH();
    bWE();
    dLE.doY().a(this, bF);
  }

  public cLP gU(long paramLong) {
    for (dmn localdmn = this.gXq.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      for (cLP localcLP : (ArrayList)localdmn.value()) {
        if (localcLP.cEO().getId() == paramLong) {
          return localcLP;
        }
      }
    }
    return null;
  }

  public aYr UI() {
    return this.bwL;
  }

  public ase cO(short paramShort) {
    return (ase)this.gXv.cx(paramShort);
  }

  public void kk(String paramString) {
    this.gXy = paramString;
  }

  public String bXa() {
    return this.gXy;
  }

  public Ax bXb() {
    return this.gXr;
  }

  public aCe bXc() {
    return this.gXt;
  }

  public aCe bXd() {
    return this.gXs;
  }

  public boolean bXe() {
    cYq localcYq1 = cYq.jq(System.currentTimeMillis());
    cYq localcYq2 = new cYq(this.bwL.aMT());
    return localcYq1.Q(localcYq2);
  }

  public void bXf() {
    if (this.gXr == null) {
      return;
    }
    dLE.doY().a(this.gXr, this.gXr.getFields());
  }

  public bKR bXg() {
    bKR localbKR = new bKR();
    if (this.gXB == null) {
      return localbKR;
    }
    for (Iterator localIterator = cuk.b(this.gXB).iterator(); localIterator.hasNext(); ) { localapD = (apD)localIterator.next();
      if (localapD.aBz())
        localbKR.add(localapD.aBy().getId());
    }
    apD localapD;
    for (localIterator = cuk.c(this.gXB).iterator(); localIterator.hasNext(); ) { localapD = (apD)localIterator.next();
      if (localapD.aBz()) {
        localbKR.add(localapD.aBy().getId());
      }
    }
    return localbKR;
  }

  public void bXh() {
    if (this.gXB == null) {
      return;
    }
    for (apD localapD : cuk.b(this.gXB))
      localapD.clean();
  }
}