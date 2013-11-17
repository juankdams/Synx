import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.awt.Point;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import org.apache.log4j.Logger;

public abstract class Su extends dhJ
  implements bBz, bhL, cRz, caY, dBv, dgL, duA, dyI
{
  public static final int csh = 999999;
  public static final int csi = 800067;
  public static final int csj = 800068;
  public static final String csk = "Smiley_";
  public static final String bC = "name";
  public static final String csl = "sex";
  public static final String csm = "breedInfo";
  public static final String csn = "breedId";
  public static final String cso = "smileyDescriptorLibrary";
  public static final String csp = "actorDescriptorLibrary";
  public static final String csq = "actorAnimationPath";
  public static final String csr = "actorLinkage";
  public static final String css = "actorAnimation";
  public static final String cst = "actorEquipment";
  public static final String csu = "actor";
  public static final String csv = "direction";
  public static final String csw = "avatarUrl";
  public static final String bsP = "level";
  public static final String bHI = "nameAndLevel";
  public static final String bHK = "levelValue";
  public static final String bHJ = "id";
  public static final String csx = "timelineDescription";
  public static final String csy = "debuffApVisible";
  public static final String csz = "debuffMpVisible";
  public static final String csA = "states";
  public static final String csB = "protectorStates";
  public static final String csC = "allStates";
  public static final String csD = "spellsInventory";
  public static final String csE = "timelinePosition";
  public static final String csF = "characteristics";
  public static final String csG = "isFightStateBarDisplayed";
  public static final String csH = "isKO";
  public static final String csI = "skinColors";
  public static final String csJ = "hairColors";
  public static final String csK = "pupilColors";
  public static final String csL = "secondarySkinColors";
  public static final String csM = "secondaryHairColors";
  public static final String csN = "leaderShipCost";
  public static final String csO = "stateAffinities";
  public static final String csP = "visible";
  public static final String csQ = "healResistDescription";
  public static final String[] bF = { "name", "sex", "breedInfo", "breedId", "smileyDescriptorLibrary", "actorDescriptorLibrary", "actorAnimationPath", "actorLinkage", "actorAnimation", "actorEquipment", "actor", "avatarUrl", "levelValue", "level", "skinColors", "hairColors", "pupilColors", "secondarySkinColors", "secondaryHairColors", "direction", "characteristics", "debuffApVisible", "debuffMpVisible", "states", "protectorStates", "allStates", "timelinePosition", "isFightStateBarDisplayed", "isKO", "spellsInventory", "leaderShipCost", "stateAffinities", "visible", "healResistDescription" };
  public static final String csR = "CHEVEUXCUSTOM";
  public static final String csS = "VETEMENTCUSTOM";
  public cew aEM;
  private aiI[] csT = { aiI.dfw, aiI.dfx, aiI.dfB, aiI.dfy, aiI.dfz, aiI.dfN, aiI.dfR, aiI.dgy, aiI.dfY, aiI.dfZ, aiI.dga, aiI.dgh, aiI.dgd, aiI.dgm };

  private static final chO csU = new As();
  private boolean csV;
  private dCb csW;
  private arl csX;
  private int csY = -1;
  private Gc csZ;
  private bj cta;
  private final sX ctb = new sX();
  private czN ctc;
  private dpa ctd;
  private final HashSet cte = new HashSet();
  protected ArrayList ctf;
  protected ArrayList ctg;
  protected ArrayList cth;
  protected final dwy cti;
  protected bDQ ctj;
  protected cdz ctk;
  private boolean ctl;
  private boolean ctm;
  private bVf bwx;
  private static final Ej ctn = new Ej(new Av());
  private boolean cto;
  private byte ctp = -1;
  private byte ctq = -1;
  private chO ctr;
  private dFx cts;
  private byte ctt;
  protected dtZ ctu;
  private PX ctv;

  protected Su()
  {
    this.cte.clear();
    this.cte.add(this);
    this.ldc.a(new dzV(this));
    this.cti = new dwy();
  }

  public void adp() {
    if (this.ctj != null)
      this.ctj.bMC();
  }

  public void adq()
  {
    if (this.ctj != null)
      this.ctj.adq();
  }

  public void a(bDQ parambDQ)
  {
    if (this.ctj == null) {
      this.ctj = new bDQ(this);
    }
    this.ctj.b(parambDQ);
  }

  public bDQ adr() {
    return this.ctj;
  }

  public boolean ads() {
    return this.ctl;
  }

  public void bn(boolean paramBoolean) {
    this.ctl = paramBoolean;
  }

  public boolean adt() {
    return this.ctm;
  }

  public void bo(boolean paramBoolean) {
    this.ctm = paramBoolean;
  }

  public void adu()
  {
    super.adu();
    if (aeQ() != null)
      a(this, aeQ().bgG());
  }

  public void a(Su paramSu, Collection paramCollection)
  {
    if (paramSu == byv.bFN().bFO()) {
      for (Su localSu : paramCollection) {
        asf.aED().a(localSu.getId(), localSu.JM(), true, false);
      }
    }
    else
      asf.aED().a(paramSu.getId(), paramSu.JM(), true, false);
  }

  public String toString()
  {
    return cQF();
  }

  public long adv() {
    return 0L;
  }

  public cCH[] adw()
  {
    return new cCH[] { cCH.ivi };
  }

  public drn adx()
  {
    return bQY.bXO();
  }

  public void c(String paramString, Object paramObject) {
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name")) {
      return getName();
    }
    if (paramString.equals("nameAndLevel")) {
      return new lZ().a(getName()).tI().am(bNa.gRJ.bUV()).a(" ").q(ady()).tP();
    }
    if (paramString.equals("sex")) {
      return Byte.valueOf(xK());
    }
    if (paramString.equals("breedInfo")) {
      return aet();
    }
    if (paramString.equals("breedId")) {
      return Short.valueOf(this.iIO.uO());
    }
    if (paramString.equals("smileyDescriptorLibrary")) {
      return JT();
    }
    if (paramString.equals("actorDescriptorLibrary")) {
      return aeL();
    }
    if (paramString.equals("actorAnimationPath")) {
      return aeL().getPath();
    }
    if (paramString.equals("actorLinkage")) {
      return aeL().ate();
    }
    if (paramString.equals("actorAnimation")) {
      return aeL().ata();
    }
    if (paramString.equals("actorEquipment")) {
      return aeL().aty();
    }
    if (paramString.equals("actor")) {
      return aeL();
    }
    if (paramString.equals("id")) {
      return Long.valueOf(this.aTz);
    }

    if (paramString.equals("levelValue")) {
      return Short.valueOf(nU());
    }

    if (paramString.equals("level")) {
      return ady();
    }

    if (paramString.equals("timelineDescription")) {
      return u(this);
    }

    if (paramString.equals("leaderShipCost")) {
      return getType() == 1 ? Integer.valueOf(c(cfY.hBM) ? cMn.cFp().dP(uO()).anj() : -1) : null;
    }

    if (paramString.equals("characteristics"))
      return this.ctk;
    int i;
    int j;
    if (paramString.equals("debuffApVisible")) {
      i = e(eu.azA);
      j = e(eu.azy);
      return Boolean.valueOf((i != 0) && (j != 0));
    }
    if (paramString.equals("debuffMpVisible")) {
      i = e(eu.azB);
      j = e(eu.azx);
      return Boolean.valueOf((i != 0) && (j != 0));
    }

    if (paramString.equals("states")) {
      return adE();
    }

    if (paramString.equals("protectorStates")) {
      return adD();
    }

    if (paramString.equals("allStates")) {
      return adC();
    }

    if (paramString.equals("stateAffinities")) {
      return this.cti;
    }
    if (paramString.equals("timelinePosition")) {
      arl localarl = aeQ();
      if (localarl == null) {
        return null;
      }

      j = localarl.bgL();
      int k = localarl.aDp().ag(getId());
      int m = Math.max(0, localarl.aDp().AR());
      if (k == -1) {
        return null;
      }
      int n = (k - m + j) % j;

      if (n == -1) {
        return null;
      }
      return Integer.valueOf(n + 1);
    }

    if (paramString.equals("isFightStateBarDisplayed")) {
      return Boolean.valueOf(this.csV);
    }
    if (paramString.equals("direction")) {
      return Integer.valueOf(E().m_index);
    }
    if (paramString.equals("isKO")) {
      return Boolean.valueOf(aJu());
    }

    if (paramString.equals("spellsInventory"))
      return aez();
    if (paramString.equals("skinColors"))
      return aey();
    if (paramString.equals("hairColors"))
      return aev();
    if (paramString.equals("pupilColors"))
      return aew();
    if (paramString.equals("visible")) {
      return Boolean.valueOf(aeL().isVisible());
    }

    if (paramString.equals("healResistDescription")) {
      return cRk() > 0.0F ? bU.fH().getString("desc.healRes", new Object[] { Integer.valueOf((int)cRk()) }) : null;
    }

    if (this.ctd != null) {
      return this.ctd.getFieldValue(paramString);
    }

    return null;
  }

  public String u(Su paramSu) {
    return bU.fH().getString("fight.timeline.fighterDescription", new Object[] { paramSu.getName(), ady(), B(paramSu), x(paramSu), z(paramSu), v(paramSu), C(paramSu) });
  }

  private Object ady()
  {
    return bU.fH().getString("levelShort.custom", new Object[] { Short.valueOf(nU()) });
  }

  public String v(Su paramSu) {
    lZ locallZ = new lZ();
    try {
      locallZ.a(dfn.eT((byte)5), 16, 16, null).a(" ");
    } catch (bdh localbdh) {
      K.warn(localbdh.getMessage());
      locallZ.a(bU.fH().getString("WPShort")).a(" : ");
    }
    locallZ.bw(paramSu.e(eu.ayP)).a("/").bw(paramSu.g(eu.ayP));

    return locallZ.tP();
  }

  public String w(Su paramSu) {
    lZ locallZ = new lZ();
    locallZ.bw(paramSu.e(eu.ayP)).a("/").bw(paramSu.g(eu.ayP));

    return locallZ.tP();
  }

  public String x(Su paramSu) {
    lZ locallZ = new lZ();
    try {
      locallZ.a(dfn.eT((byte)1), 16, 16, null).a(" ");
    } catch (bdh localbdh) {
      K.warn(localbdh.getMessage());
      locallZ.a(bU.fH().getString("APShort")).a(" : ");
    }
    locallZ.bw(paramSu.e(eu.ayN)).a("/").bw(paramSu.g(eu.ayN));

    return locallZ.tP();
  }

  public String y(Su paramSu) {
    lZ locallZ = new lZ();
    locallZ.bw(paramSu.e(eu.ayN)).a("/").bw(paramSu.g(eu.ayN));

    return locallZ.tP();
  }

  public String z(Su paramSu) {
    lZ locallZ = new lZ();
    try {
      locallZ.a(dfn.eT((byte)2), 16, 16, null).a(" ");
    } catch (bdh localbdh) {
      K.warn(localbdh.getMessage());
      locallZ.a(bU.fH().getString("MPShort")).a(" : ");
    }
    locallZ.bw(paramSu.e(eu.ayO)).a("/").bw(paramSu.g(eu.ayO));

    return locallZ.tP();
  }

  public String A(Su paramSu) {
    lZ locallZ = new lZ();
    locallZ.bw(paramSu.e(eu.ayO)).a("/").bw(paramSu.g(eu.ayO));

    return locallZ.tP();
  }

  public Object B(Su paramSu) {
    lZ locallZ = new lZ();
    locallZ.a(this.ctk.k(eu.ayM).Cp());

    if (g(eu.aAj) != 0) {
      locallZ.tH().a(this.ctk.k(eu.aAj).Cp());
    }

    return locallZ.tP();
  }

  public Object C(Su paramSu) {
    lZ locallZ = new lZ();
    locallZ.a(bU.fH().getString("INITShort")).a(" : ");
    locallZ.bw(paramSu.e(eu.azq));

    return locallZ.tP();
  }

  public Object D(Su paramSu) {
    lZ locallZ = new lZ();
    int i = paramSu.e(eu.azj);

    locallZ.a("Res.F").a(" : ");
    int j = paramSu.e(eu.azk) + i;
    locallZ.bw(j).a("% ");

    locallZ.a("Res.E").a(" : ");
    j = paramSu.e(eu.azl) + i;
    locallZ.bw(j).a("% ");

    locallZ.a("Res.T").a(" : ");
    j = paramSu.e(eu.azm) + i;
    locallZ.bw(j).a("% ");

    locallZ.a("Res.V").a(" : ");
    j = paramSu.e(eu.azn) + i;
    locallZ.bw(j).a("%");

    return locallZ.tP();
  }

  public String adz() {
    lZ locallZ = new lZ();
    ArrayList localArrayList = adE();
    int i;
    int j;
    brO localbrO;
    if ((localArrayList != null) && (localArrayList.size() > 0)) {
      i = 0; for (j = localArrayList.size(); i < j; i++) {
        localbrO = (brO)localArrayList.get(i);
        locallZ.a(localbrO.fJ(), 16, 16, null);
      }
    }

    localArrayList = adD();
    if ((localArrayList != null) && (localArrayList.size() > 0)) {
      i = 0; for (j = localArrayList.size(); i < j; i++) {
        localbrO = (brO)localArrayList.get(i);
        locallZ.a(localbrO.fJ(), 16, 16, null);
      }
    }

    return locallZ.length() > 0 ? locallZ.tP() : null;
  }

  protected void adA() {
    if ((this.ctf == null) || (this.ctg == null) || (this.cth == null)) {
      this.ctg = new ArrayList();
      this.ctf = new ArrayList();
      this.cth = new ArrayList();
      for (aVc localaVc : ayK()) {
        if (j(localaVc)) {
          brO localbrO = this.ctb.a(localaVc, -1);
          if (localbrO != null) {
            switch (localaVc.wa().nS()) {
            case 19:
            case 33:
              if (!this.ctg.contains(localbrO))
                this.ctg.add(localbrO); break;
            default:
              if (!this.ctf.contains(localbrO)) {
                this.ctf.add(localbrO);
              }
              break;
            }
            if (!this.cth.contains(localbrO)) {
              this.cth.add(localbrO);
            }
          }
        }
      }
      adB();
    }
  }

  protected void adB() {
    Collections.sort(this.ctf);
    Collections.sort(this.cth);
    Collections.sort(this.ctg);
  }

  private ArrayList adC() {
    if (F.a(this)) {
      return null;
    }
    if (this.cth == null) {
      adA();
    }

    return !this.cth.isEmpty() ? this.cth : null;
  }

  public ArrayList adD() {
    if (this.ctg == null) {
      adA();
    }

    return !this.ctg.isEmpty() ? this.ctg : null;
  }

  private ArrayList adE() {
    if (this.ctf == null) {
      adA();
    }

    return !this.ctf.isEmpty() ? this.ctf : null;
  }

  protected final boolean j(aVc paramaVc)
  {
    if (paramaVc.wa() == null) {
      return false;
    }

    if (paramaVc.getId() == bsj.fSj.getId())
    {
      return false;
    }

    if (paramaVc.getId() == bsj.fSk.getId()) {
      return false;
    }
    if ((paramaVc instanceof bIL)) {
      return false;
    }

    if ((paramaVc.wa() != null) && (paramaVc.wa().nS() == 1))
    {
      bXU localbXU = (bXU)paramaVc.wa();
      return localbXU.cdl();
    }

    int i = paramaVc.wa().nS();
    if ((i == 16) || (i == 18) || (i == 26) || (i == 28) || (i == 34) || (i == 30) || (i == 32) || (i == 33) || (i == 19))
    {
      return true;
    }

    if (!adF()) {
      return false;
    }

    if ((i == 12) && (paramaVc.bkc() != null) && (((dpI)paramaVc.bkc()).bev())) {
      return true;
    }

    if ((i == 12) || (i == 14) || (i == 31) || (i == 17))
    {
      return false;
    }

    if ((!paramaVc.bkM()) && (!paramaVc.aug())) {
      return false;
    }

    return true;
  }

  public String[] getFields() {
    return bF;
  }

  public boolean l(String paramString) {
    if (paramString.equals("name")) {
      return true;
    }
    return false;
  }

  public void b(String paramString, Object paramObject) {
  }

  public void a(String paramString, Object paramObject) {
    if (paramString.equals("isFightStateBarDisplayed")) {
      if ((paramObject instanceof Boolean)) {
        this.csV = ((Boolean)paramObject).booleanValue();
        if ((byv.bFN().bFO() != null) && (aeQ() != null) && (byv.bFN().bFO().aeQ() == aeQ()))
        {
          dLE.doY().a(this, new String[] { "isFightStateBarDisplayed" });
        }

      }
      else
      {
        K.error("Tentative de modifier l'attribut isFightStateBarDisplayed avec une valeur non booléenne");
      }
    }

    if (paramString.equals("name")) {
      setName(paramObject.toString());
      dLE.doY().a(this, new String[] { "name" });
    }
  }

  public boolean adF() {
    return ((this.csX != null) || (this.csY != -1)) && (this.lcV);
  }

  public int adG() {
    return this.cte.size();
  }

  public Collection adH()
  {
    return this.cte;
  }

  public Su bU(long paramLong)
  {
    Iterator localIterator = adH().iterator();
    while (localIterator.hasNext()) {
      Su localSu = (Su)localIterator.next();
      if ((localSu != null) && (localSu.getId() == paramLong)) {
        return localSu;
      }
    }
    return null;
  }

  public void gD(int paramInt)
  {
    this.csY = paramInt;
    if ((this.csX != null) && (this.csX.getId() != paramInt)) {
      if (paramInt != -1) {
        K.error("Pas de fight alors qu'on a un fightId ?");
      }
      b(null);
    }
    this.lcV = (paramInt != -1);
  }

  protected void b(arl paramarl) {
    this.csX = paramarl;
  }

  public dpa adI() {
    return this.ctd;
  }

  public void a(dpa paramdpa) {
    this.ctd = paramdpa;
  }

  public Su a(long paramLong, cYk paramcYk, short paramShort, csi paramcsi, boolean paramBoolean, aZx paramaZx)
  {
    bdi localbdi = cMn.cFp().dP(paramShort);
    if (localbdi == null) {
      K.error("Impossible d'invoquer la créature " + paramShort + " : non enregistré dans le MonsterCharacteristicManager");

      return null;
    }

    byo localbyo = byo.bFu();
    a(localbyo, paramLong, paramcYk, paramcsi, paramBoolean, localbdi, paramaZx);
    return localbyo;
  }

  private void a(Su paramSu, long paramLong, cYk paramcYk, csi paramcsi, boolean paramBoolean, bdi parambdi, aZx paramaZx)
  {
    a(paramSu, paramLong, paramcYk, paramcsi, parambdi);

    paramSu.initialize();
    paramcsi.b(paramSu, this);

    paramSu.setType((byte)2);
    Su localSu;
    if (paramBoolean)
      localSu = paramSu;
    else {
      localSu = this;
    }

    if ((paramaZx != null) && (!paramaZx.isEmpty())) {
      if (paramSu.cQZ() == null) {
        paramSu.cQL();
      }
      aZx localaZx = paramSu.cQZ();
      for (int k : paramaZx.Hq()) {
        cfY localcfY = cfY.vg(k);
        if (localcfY != null)
          localaZx.e(localcfY);
        else {
          K.error("id d'une propriété de base incorrect :" + k);
        }
      }
    }

    byte b = paramcsi.Fx() == -1 ? Fx() : paramcsi.Fx();
    a(paramSu, localSu, b);
    paramSu.aeX();

    CA.Lv().p(paramSu);

    paramSu.aeL().dI(paramSu.Fx());
    paramSu.aeL().j(paramSu.E());

    axB.aIZ(); axB.ae(paramSu);
    dmM.cUe().b(paramSu, paramSu.aeR());
    bOJ.aF(paramSu);
    paramSu.ayD();
    paramSu.aek();
  }

  private void a(Su paramSu, long paramLong, cYk paramcYk, csi paramcsi, bdi parambdi) {
    paramSu.a(paramLong);
    paramSu.c(parambdi);
    if (paramcsi != null) {
      paramSu.aQ(paramcsi.nU());
      paramSu.cO(paramcsi.xK());
    } else {
      K.warn("Charac null a l'initisalisation d'une invoc, uid : " + paramLong);
    }
    paramSu.n(paramcYk);
    CG localCG = paramcsi.E();
    if (localCG == CG.bFP)
      paramSu.c(E());
    else {
      paramSu.c(localCG);
    }
    paramSu.ji(true);
    paramSu.ctu = this.ctu;
  }

  private void a(Su paramSu1, Su paramSu2, byte paramByte) {
    paramSu1.bn(true);
    if (aeQ() != null) {
      aeQ().a(paramSu1, paramByte, true, paramSu2);
      paramSu1.bo(true);
    } else if (aeN() != null) {
      aeN().a(paramSu1, Fx());
    }
  }

  public boolean a(aTa paramaTa)
  {
    boolean bool = super.a(paramaTa);
    if (bool) {
      localObject = aeL();
      this.ctr = ((cew)localObject).caw();
      ((cew)localObject).b(false, ZV.cMH);
      ((cew)localObject).m(((dgL)paramaTa).aeM());

      ((cew)localObject).a(new At(this, paramaTa, (cew)localObject));
    }

    Object localObject = byv.bFN().bFO();
    if (adL() == localObject) {
      ((byz)localObject).bGI();
    }

    return bool;
  }

  public boolean l(cYk paramcYk)
  {
    return b(paramcYk, false);
  }

  public boolean m(cYk paramcYk)
  {
    return b(paramcYk, true);
  }

  private void adJ()
  {
    cew localcew = aeL();
    localcew.er(null);
    localcew.cgZ().g(localcew);

    if (this.ldx == null) {
      K.trace("Essaye de déposer alors qu'il ne porte personne");
      return;
    }
    if ((this.ldx instanceof ddn))
      localcew.eq("Anim03PorteTonneau");
    else
      localcew.eq("Anim04Porte");
  }

  private boolean b(cYk paramcYk, boolean paramBoolean)
  {
    return a(paramcYk, paramBoolean, paramBoolean);
  }

  private boolean a(cYk paramcYk, boolean paramBoolean1, boolean paramBoolean2) {
    cew localcew = aeL();
    if (paramBoolean1)
      adJ();
    else {
      localcew.cgZ().g(localcew);
    }

    cUo localcUo = localcew.a(paramBoolean2, paramcYk);
    if (this.ctr == null) {
      if (localcUo == null) {
        K.error("On dépose rien (?) . double uncarry ?");
      } else {
        K.error("Reset le movementSelector à null (interdit!!)");
        localcew.a(dFc.dgE());
      }
    } else {
      localcew.a(this.ctr);
      this.ctr = null;
    }

    return super.m(paramcYk);
  }

  public void adK()
  {
    cew localcew = aeL();
    localcew.cax();
    super.adK();
    localcew.cJD();
  }

  public void Vk()
  {
    super.Vk();
    aeL().cgZ().h(aeL());
  }

  public void b(cYl paramcYl)
  {
    super.b(paramcYl);
    aeL().a(dsG.cYZ());
  }

  public void a(int paramInt, Object paramObject)
  {
    switch (paramInt) {
    case 300:
      b((arl)paramObject);
      this.csY = this.csX.getId();
      adq();

      break;
    case 301:
      this.csV = false;
      b(null);
      this.csY = -1;

      this.ctd = null;
      if (aeL().aGC() == 1) {
        aeL().setStatus((byte)0);
      }
      adq();
    }
  }

  public Su adL()
  {
    return (Su)b(aeQ(), this);
  }

  public Su adM()
  {
    return (Su)c(aeQ(), this);
  }

  public void a(bXL parambXL)
  {
    Object localObject;
    switch (parambXL.getId()) {
    case 1000:
      doA localdoA = ((cpl)parambXL).coV();
      if (j(localdoA))
      {
        bp(true);
        if ((this == byv.bFN().bFO()) && ((localdoA instanceof bPD))) {
          localObject = ((bPD)localdoA).bWk();
          if (localObject != null)
            bOU.gUc.b(new cvO(((bJC)localObject).bQW()));
          else
            K.warn("Etat inexistant on ne peut pas lancer l'évènement"); 
        }
      }
      break;
    case 1002:
      localObject = (dTs)parambXL;
      if (this == byv.bFN().bFO()) {
        for (Map.Entry localEntry : ((dTs)localObject).dtl().entrySet())
        {
          this.ctb.a((aVc)localEntry.getValue(), ((Integer)localEntry.getKey()).intValue());
        }

        this.ctf = null;
        this.ctg = null;
        this.cth = null;
        dLE.doY().a(this, new String[] { "states", "protectorStates", "allStates" }); } break;
    case 1001:
      bp(false);
      break;
    case 1003:
      this.ctf = null;
      this.ctg = null;
      this.cth = null;

      dLE.doY().a(this, new String[] { "states", "protectorStates", "allStates" });

      break;
    case 101:
      if ((byv.bFN().bFO() == this) || (!afk()))
        aeL().che(); break;
    case 102:
      aeL().chh();

      break;
    case 103:
    }
  }

  protected void bp(boolean paramBoolean)
  {
    if (byv.bFN().bFO() == null) {
      return;
    }

    this.ctb.clear();
    this.ctf = null;
    this.ctg = null;
    this.cth = null;

    dLE.doY().a(this, new String[] { "states", "protectorStates", "allStates" });

    if ((this.csX != null) && (this.csX.Ij()))
    {
      zu localzu = aeQ().aDp();
      if (localzu != null)
        localzu.If();
    }
  }

  public csx[] adN()
  {
    ArrayList localArrayList = new ArrayList();

    for (int i = 0; i < this.csT.length; i++) {
      localArrayList.add(this.csT[i].avt());
    }

    if ((this instanceof byo))
    {
      ctn.clear();
      for (Object localObject = ((bdi)this.iIO).dhl(); ((dmn)localObject).hasNext(); ) {
        ((dmn)localObject).fl();
        ctn.add(new cfW((bKi)((dmn)localObject).value()));
      }
      localArrayList.addAll(ctn);
      ctn.clear();

      localObject = ((bdi)aJp()).bjo();
      for (int j = 0; j < ((ArrayList)localObject).size(); j++) {
        localArrayList.add(new acm((VI)((ArrayList)localObject).get(j)));
      }
    }

    return (csx[])localArrayList.toArray(new csx[localArrayList.size()]);
  }

  public boolean adO() {
    return true;
  }

  public Point adP() {
    dSz localdSz = WakfuClientInstance.awy().Dg();
    cYm localcYm = up.c(localdSz, getWorldX(), getWorldY(), getAltitude() + bY());
    int i = bCO.bC(localcYm.aOR);
    int j = bCO.bC(localcYm.aOS);
    return new Point(i, j);
  }

  public short OL() {
    return (short)(int)(aJp().bY() * 10.0F);
  }

  public bCc adQ()
  {
    return bCc.bKN();
  }

  protected cvY adR()
  {
    return ctE.k(this);
  }

  public Hh adS()
  {
    return Hh.QM();
  }

  public boolean b(dJO paramdJO, bhL parambhL)
  {
    boolean bool = !a(paramdJO, parambhL);
    if (!bool) {
      K.warn("Action " + paramdJO + " non prise en compte par ce CharacterInfo, type=" + getClass().getName() + ", id=" + getId());
    }

    return bool;
  }

  public void a(dJO paramdJO)
  {
    throw new UnsupportedOperationException("Les actions ne sont pas forwardée au serveur pour le moment, il existe encore des protocoles sous-jacents.");
  }

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    throw new UnsupportedOperationException("Pas d'action cliente prise en compte sur ce type d'élément interactif.");
  }

  public dJO adT()
  {
    return null;
  }

  public dJO[] adU()
  {
    return dJO.lWj;
  }

  public cOE adV()
  {
    cOE localcOE = super.adV();
    if (localcOE != null) {
      return localcOE;
    }
    if ((aeR() != -1) && (this.lcV) && (cjS.clP().vz(aeR()) != null))
    {
      return cjS.clP().vz(aeR()).aIq();
    }
    return null;
  }

  public cOE adW()
  {
    return SN.aga();
  }

  public void b(dle paramdle)
  {
  }

  public void c(dle paramdle)
  {
  }

  public void d(dle paramdle)
  {
  }

  public boolean adX()
  {
    return false;
  }

  public void aJ()
  {
    super.aJ();

    c(this);

    this.ctp = -1;
    this.ctq = -1;
  }

  public void bc()
  {
    if (this.csX != null) {
      this.csX.X(this);
    }

    if (this.ctc != null) {
      this.ctc.c(this);
    }

    super.bc();
    this.csV = false;
    this.csW = null;
    b(null);
    this.csY = -1;
    this.ctd = null;
    this.csZ = null;
    this.cta = null;
    this.ctc = null;
    c(null);
    this.cte.clear();
    this.ctb.clear();
    adp();
    CA.Lv().c(this.cts);
    this.cts = null;

    if (this.ctj != null) {
      this.ctj.clean();
    }

    if (this.bwx != null) {
      this.bwx.dispose();
      this.bwx = null;
    }
    this.ctu = null;
  }

  public void adY()
  {
    super.adY();
    this.ctk.c(new eu[] { eu.ayM });
  }

  public void ps()
  {
    super.ps();

    if (this.aEM != null)
      daO.cML().a(this.aEM);
  }

  public void adZ()
  {
    if (this.aEM == null) {
      K.error("actor null ? ", new Exception());
    } else {
      aKj.bbx().aj(this);
      this.aEM.cgV();
    }
    super.adZ();
  }

  public void a(aPH paramaPH)
  {
    super.a(paramaPH);
    if (this.csX == null) {
      b((arl)paramaPH);
      this.csY = this.csX.getId();
    }

    this.aEM.cg((short)azO.dRO.hV);

    JN();
  }

  public void aea()
  {
    super.aea();

    a(new dRe());

    if (cQK()) {
      localObject = aeL();
      bQK.bXG().g((cUo)localObject);
    }

    Object localObject = ayJ();
    if (localObject != null) {
      gA localgA = (gA)((bZH)localObject).dB((short)azO.dRO.hV);
      if (localgA != null) {
        this.aEM.a(localgA.oi(), (short)azO.dRO.hV);
      }
    }

    JO();
    if ((this.aEM != null) && (this.aEM.chq() != null))
      this.aEM.chq().bxn();
  }

  public void aeb()
  {
    a(aeQ(), this);
    if ((aeQ() != null) && (!aeQ().aDy()))
      aec();
  }

  public void h(long paramLong1, long paramLong2)
  {
    super.h(paramLong1, paramLong2);
    if (aeQ() == null) {
      return;
    }
    Su localSu = (Su)aeQ().eu(paramLong1);
    if (localSu != null)
      localSu.aec();
  }

  public void as(byte paramByte)
  {
    super.as(paramByte);
    aec();
  }

  public void aec() {
    aed();
    aee();

    if (this.ctd != null)
      this.ctd.cWw();
  }

  public void aed()
  {
    if (this.csX == null) {
      return;
    }

    if (!this.csX.R(this)) {
      return;
    }

    int i = (this.csX.aDp().ae(this.aTz)) && (afp()) ? 1 : 0;

    if (i != 0)
      aeL().dJ(Fx());
    else
      aeL().dI(Fx());
  }

  private void aee()
  {
    if (this.csX == null) {
      return;
    }

    if (!this.csX.R(this)) {
      return;
    }

    aeL().j(E());
  }

  public void a(cqm paramcqm) {
    dSc localdSc = paramcqm.adb();
    byz localbyz = byv.bFN().bFO();
    if (localdSc.ln() == 0)
      switch (AJ.aCX[((eu)paramcqm.adb()).ordinal()]) {
      case 1:
        ceR.chM().chN();
      case 2:
      case 3:
        if (byv.bFN().c(axB.aIZ())) {
          axB.aIZ(); axB.aJh();
        }
        if (byv.bFN().c(aYX.bnY())) {
          aYX.bnY().boe();
        }
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
        if ((localbyz != null) && ((aeI()) || (!cQJ())))
          b("updateShortcut", new AE(this, localbyz));
        break;
      }
  }

  public void h(Kf paramKf)
  {
    if (paramKf == null) {
      return;
    }

    if (paramKf.rQ() == 1)
      switch (AJ.bwy[((cfY)paramKf).ordinal()]) {
      case 1:
        this.ctk.c(new eu[] { eu.ayN });
        break;
      case 2:
        this.ctk.c(new eu[] { eu.azg, eu.aze, eu.azd, eu.azf, eu.azn, eu.azl, eu.azk, eu.azm });

        break;
      case 3:
      case 4:
      case 5:
      case 6:
        if ((this.csX != null) && (this.csX == byv.bFN().bFO().bGv())) {
          axB.aIZ(); axB.aJh();
          aYX.bnY().boe(); } break;
      case 7:
      case 8:
        if (aef()) {
          axB.ae(this);
        } else {
          aeL().atC();
          if (cQZ() != null) {
            boolean bool = !cQZ().c((cfY)paramKf);
            aeL().setVisible(bool);
            if (bool)
              aeL().cgU();
            else {
              aeL().cgV();
            }
          }
        }
        arl localarl = aeQ();
        if (localarl != null) {
          int i = !cQZ().c((cfY)paramKf) ? 1 : 0;
          if (i != 0)
            ((bWM)localarl.LB()).aK(this);
          else
            ((bWM)localarl.LB()).aJ(this);
        }
        break;
      }
  }

  public boolean aef()
  {
    byz localbyz = byv.bFN().bFO();
    if (localbyz == null) {
      return false;
    }
    arl localarl = localbyz.aeQ();
    return (aeI()) || ((localarl != null) && (localarl == aeQ()) && (localbyz.Fx() == Fx()));
  }

  public void c(CG paramCG)
  {
    aeL().c(paramCG);
    dLE.doY().a(this, new String[] { "direction" });
  }

  public void d(int paramInt1, int paramInt2, short paramShort)
  {
    super.d(paramInt1, paramInt2, paramShort);
    aeL().k(paramInt1, paramInt2, paramShort);
  }

  public void n(cYk paramcYk)
  {
    d(paramcYk.getX(), paramcYk.getY(), paramcYk.IB());
  }

  public void q(int paramInt1, int paramInt2, short paramShort)
  {
    if (Vl() != null) {
      ((Su)Vl()).a(new cYk(paramInt1, paramInt2, paramShort), true, false);
    }

    b(paramInt1, paramInt2, paramShort, false);
  }

  public void b(int paramInt1, int paramInt2, short paramShort, boolean paramBoolean)
  {
    aeJ();
    cYk localcYk = new cYk(paramInt1, paramInt2, paramShort);
    super.n(localcYk);
    aeL().a(localcYk, paramBoolean, false, false);
  }

  public abstract void JN();

  public abstract void JO();

  public void a(aiI paramaiI)
  {
    aiI[] arrayOfaiI = new aiI[this.csT.length + 1];
    System.arraycopy(this.csT, 0, arrayOfaiI, 0, this.csT.length);
    arrayOfaiI[this.csT.length] = paramaiI;
    this.csT = arrayOfaiI;
  }

  public void a(int paramInt, long paramLong, boolean paramBoolean) {
    if ((paramBoolean) && (!adF()))
      aeg();
  }

  public void b(int paramInt, long paramLong, boolean paramBoolean)
  {
    if ((paramBoolean) && (!adF()))
      aeg();
  }

  public void aeg()
  {
    if ((byv.bFN().bFO().adF()) && (aeR() != byv.bFN().bFO().aeR()))
    {
      return;
    }

    Iterator localIterator = cWS.cKD().cKE();
    while (localIterator.hasNext()) {
      localObject = (IsoParticleSystem)localIterator.next();
      if ((localObject instanceof FreeParticleSystem)) {
        FreeParticleSystem localFreeParticleSystem = (FreeParticleSystem)localObject;
        if ((localFreeParticleSystem.ciY() == 999999) && (localFreeParticleSystem.Gu() == aeL())) {
          return;
        }
      }
    }

    Object localObject = cof.cop().vY(999999);
    if (localObject == null) {
      return;
    }

    ((FreeParticleSystem)localObject).b(aeL());
    cWS.cKD().b((IsoParticleSystem)localObject);
  }

  public void cleanUp()
  {
    bq(false);
  }

  public void bq(boolean paramBoolean)
  {
    if (paramBoolean)
      c(null);
  }

  protected final void aeh()
  {
    dLE localdLE = dLE.doY();
    localdLE.a(this, new String[] { "actorAnimation", "actorAnimationPath", "actorDescriptorLibrary", "actorEquipment" });
  }

  public void q(byte[] paramArrayOfByte)
  {
    aei();
    super.q(paramArrayOfByte);
    aej();
  }

  public void aei() {
    this.ctt = ((byte)(this.ctt + 1));
  }

  public void aej() {
    if ((!bB) && (this.ctt <= 0)) throw new AssertionError();
    this.ctt = ((byte)(this.ctt - 1));
    aek();
  }

  public final void aek()
  {
    if (this.ctt > 0) {
      return;
    }

    try
    {
      cew localcew = this.aEM;
      if (localcew == null) {
        return;
      }

      if (localcew.aty() == null) {
        return;
      }

      localcew.bIW();
      localcew.aty().im();

      diH localdiH = localcew.chw();
      int i = (localdiH == null) || (localdiH.leV) ? 1 : 0;
      if (localdiH == null) {
        localcew.jz(Integer.toString(oc()));
        aep();
      } else {
        localdiH.bh(this);
      }

      if (i != 0) {
        aes();

        aeq();

        aeo();

        ael();

        aer();
      }

      aen();

      if (i != 0)
        aem();
    }
    catch (Exception localException)
    {
      K.error("problème lors de l'application de l'equipement sur l'acteur " + getId() + " " + getName(), localException);
    }

    aZr.boo().fa(this.aTz);
    aeh();
  }

  protected void ael() {
    if (this.ctu != null)
      this.ctu.v(aeL());
  }

  protected void aem()
  {
    cvY localcvY = cJf();
    Yp localYp = localcvY.HK();
    if (localYp == null) {
      return;
    }

    fs.a(localYp, localcvY.bP(), new AG(this));
  }

  protected void aen()
  {
    aDq localaDq = bSB();
    if ((localaDq != null) && 
      (localaDq.fU() == 16)) {
      aYR localaYR = (aYR)localaDq;
      localaYR.bnV();
    }
  }

  protected void aeo()
  {
  }

  protected void aep()
  {
    String str1 = afm();
    String str2 = afl();

    if ((str1 != null) || (str2 != null))
    {
      String str3;
      try {
        str3 = ay.bd().getString("ANMEquipmentPath");
      } catch (bdh localbdh) {
        K.error("Erreur au chargement d'une propriété", localbdh);
        return;
      }
      String str4;
      if (str1 != null) {
        str4 = String.format(str3, new Object[] { str1 });
        aeL().b(str4, diq.ph("VETEMENTCUSTOM"));
      }
      if (str2 != null) {
        str4 = String.format(str3, new Object[] { str2 });

        aeL().b(str4, diq.ph("CHEVEUXCUSTOM"));
      }
    }
  }

  protected void aeq()
  {
    if (this.aEM != null)
      aeL().chr();
  }

  protected void aer()
  {
  }

  public void aes() {
    PX localPX = aeu();
    if (localPX == null) {
      return;
    }
    for (jR localjR = localPX.abM(); localjR.hasNext(); ) {
      localjR.fl();
      int i = localjR.rC();
      int j = localjR.value();
      bVw localbVw = (bVw)Hh.QM().dh(j);
      if (localbVw == null) {
        K.error("Le ReferenceItem d'id " + j + " n'existe pas");
      }
      else
      {
        aeL().a(localbVw, (short)i);
      }
    }
  }

  public void gE(int paramInt) {
    super.gE(paramInt);
    for (azg localazg : this.lcU)
      localazg.G(this);
  }

  public Zp aet()
  {
    return aQC.bhe().nx(aJp().uO());
  }

  public PX aeu()
  {
    return this.ctv;
  }

  public void b(PX paramPX)
  {
    this.ctv = paramPX;
  }

  public aKG[] aev()
  {
    return agt.arQ().f(uO(), xK());
  }

  public aKG[] aew()
  {
    return agt.arQ().g(uO(), xK());
  }

  public long aex()
  {
    return getId();
  }

  public aKG[] aey()
  {
    return agt.arQ().e(uO(), xK());
  }

  public cay aez()
  {
    return null;
  }

  public apX bV(long paramLong) {
    return null;
  }

  public Iterable aeA() {
    return null;
  }

  public boolean l(int paramInt, short paramShort)
  {
    if (!aeE()) {
      K.error("Trying to add a spell to a temporary inventory, but no temporary inventory");
      return false;
    }
    dSR localdSR = Be.Kj().ea(paramInt);
    if (localdSR == null) {
      K.error("Trying to add spell " + paramInt + " to temporary inventory, but this spell doesn't exist");
      return false;
    }
    apX localapX = new apX(localdSR, paramShort, localdSR.getId());
    try
    {
      if (!aez().ceK().c(localapX))
        return false;
    }
    catch (dI localdI) {
      K.error("Exception levee", localdI);
      return false;
    } catch (dcF localdcF) {
      K.error("Exception levee", localdcF);
      return false;
    }

    byz localbyz = byv.bFN().bFO();
    Su localSu = cmI.cnw().boc();
    if ((localSu == this) && ((adM() == localbyz) || (adL() == localbyz))) {
      dpr localdpr = localbyz.bGD();
      localdpr.bGI();
      dMU localdMU = localdpr.cWz();
      if (localdMU != null) {
        localdMU.dpH();
      }
      localdMU.bI(localbyz);
      localdpr.cWA();
    }

    return true;
  }

  public void aeB()
  {
    if (aez() == null) {
      return;
    }
    aez().aP(this);
  }

  protected void a(int paramInt, cDZ paramcDZ)
  {
    aeC();
    if (aez() == null) {
      return;
    }
    bdi localbdi = cMn.cFp().dP((short)paramInt);
    if (localbdi == null) {
      return;
    }
    ArrayList localArrayList1 = localbdi.brj();
    short s;
    switch (AJ.bwz[paramcDZ.ordinal()]) {
    case 1:
      s = nU();
      break;
    case 2:
    default:
      s = localbdi.alM();
    }

    ArrayList localArrayList2 = new ArrayList();
    for (bvM localbvM : localArrayList1) {
      dSR localdSR = (dSR)localbvM.Lp();
      apX localapX = new apX(localdSR, s, localdSR.getId());
      localArrayList2.add(localapX);
    }

    aez().a(localArrayList2, this);
  }

  protected void aeC() {
    if (aeQ() == null) {
      return;
    }
    cWV localcWV = aeL().cgZ();
    if ((localcWV instanceof bgY)) {
      return;
    }
    bgY localbgY = new bgY(this);
    if (localcWV != null) {
      bOJ.c(aeL(), localbgY);
    } else {
      aeL().b(localbgY);
      localbgY.g(aeL());
    }
  }

  public void aeD()
  {
    if (aez() == null) {
      return;
    }
    aez().aeD();
  }

  public boolean aeE()
  {
    if (aez() == null) {
      return false;
    }
    return aez().aeE();
  }

  public boolean aeF()
  {
    return this.aEM != null;
  }

  public boolean aeG() {
    return this.csV;
  }

  public boolean aeH()
  {
    if (afk()) {
      return false;
    }

    return super.aeH();
  }

  public boolean aeI()
  {
    return false;
  }

  public void gF(int paramInt) {
    aiI[] arrayOfaiI = new aiI[this.csT.length - 1];
    for (int i = 0; i < this.csT.length - 1; i++) {
      if (this.csT[i].eo() == paramInt) {
        System.arraycopy(this.csT, i + 1, arrayOfaiI, i, arrayOfaiI.length - i);
        this.csT = arrayOfaiI;
        return;
      }
      arrayOfaiI[i] = this.csT[i];
    }

    if (this.csT[(this.csT.length - 1)].eo() == paramInt)
      this.csT = arrayOfaiI;
    else
      K.error("On a pas trouvé l'action à enlever");
  }

  public void aeJ()
  {
    if (this.csZ != null) {
      cew localcew = aeL();
      if (localcew == null) {
        return;
      }

      localcew.c(this.csZ);
      this.csZ = null;
    }
  }

  public void aeK()
  {
    cew localcew = aeL();
    int i = 0;

    if (isDead()) {
      i = 1;
      localcew.b(bRy.bYJ());
    } else {
      String str = localcew.ata();
      if (((isDead()) && (str.equalsIgnoreCase("AnimKO-SortieHS"))) || (str.equalsIgnoreCase("AnimKO-Debut")) || ((isDead()) && (str.equalsIgnoreCase("AnimDesincarnation"))) || ((isDead()) && (str.equalsIgnoreCase("AnimTombe"))) || (str.equalsIgnoreCase("AnimEmote-Victoire")))
      {
        i = 1;
      }
    }
    if (!isDead())
    {
      if (i != 0)
      {
        localcew.b(bRy.bYJ());
        bRy.bYJ().f(localcew);
      }
      else {
        bOJ.c(localcew, bRy.bYJ());
      }
    }
    localcew.cax();
    localcew.fG(false);
    localcew.aw(localcew.atD());
    localcew.atq();
    localcew.dpw();
    localcew.cgY();
    localcew.setVisible(true);
  }

  public void a(czN paramczN) {
    this.ctc = paramczN;
    if (paramczN != null) {
      this.csY = paramczN.getId();
      this.lcV = true;
    } else {
      this.csY = -1;
      this.lcV = false;
    }
  }

  public void a(bj parambj) {
    this.cta = parambj;
  }

  public void f(CG paramCG)
  {
    if ((!bB) && (paramCG == null)) throw new AssertionError();
    int i = !E().equals(paramCG) ? 1 : 0;
    if (i != 0) {
      super.c(paramCG);
      dLE.doY().a(this, new String[] { "direction" });
    }
  }

  public void br(boolean paramBoolean) {
    this.csV = paramBoolean;
  }

  public void r(int paramInt1, int paramInt2, short paramShort) {
    super.d(paramInt1, paramInt2, paramShort);
  }

  public void a(Gc paramGc) {
    if (paramGc == null) {
      return;
    }

    cew localcew = aeL();
    if (localcew == null) {
      return;
    }

    this.csZ = paramGc;
    localcew.b(this.csZ);
  }

  public bVf JT()
  {
    if (this.bwx == null) {
      bVf localbVf = new bVf(dsE.cYX(), aeL().getWorldX(), aeL().getWorldY(), aeL().getAltitude());
      String str = JG();
      try {
        localbVf.b(String.format(ay.bd().getString(JH()), new Object[] { str }), true);
      } catch (IOException localIOException) {
        K.error("", localIOException);
        localbVf.dispose();
        return null;
      } catch (bdh localbdh) {
        K.error("", localbdh);
        localbVf.dispose();
        return null;
      }
      localbVf.em(str);

      this.bwx = localbVf;
    }

    return this.bwx;
  }

  protected abstract String JG();

  protected abstract String JH();

  public cew aeL()
  {
    if (this.aEM == null) {
      c(new cew(this));

      if (afD() >= 1) {
        this.aEM.a(csU);
      }
    }

    return this.aEM;
  }

  public cUo aeM() {
    return aeL();
  }

  public czN aeN() {
    return this.ctc;
  }

  public void aeO()
  {
  }

  public void aeP()
  {
    this.lcZ = false;
    this.ldq = false;
    if (this.aEM != null) {
      this.aEM.setVisible(true);
    }
    cQV();
  }

  public arl aeQ() {
    return this.csX;
  }

  public int aeR() {
    return this.csY;
  }

  public dCb aeS() {
    return this.csW;
  }

  public bj aeT() {
    return this.cta;
  }

  public void b(dCb paramdCb) {
    this.csW = paramdCb;
  }

  public sX aeU() {
    return this.ctb;
  }

  public void c(cew paramcew) {
    if (paramcew == this.aEM) {
      return;
    }

    if (this.aEM != null) {
      bQK.bXG().g(this.aEM);
      this.aEM.release();
    }
    this.aEM = paramcew;

    if (this.aEM != null)
      bQK.bXG().d(this.aEM);
  }

  public void aeV()
  {
    aeW();
  }

  private void aeW()
  {
    csi localcsi = cQn();
    if (localcsi != null) {
      CA localCA = CA.Lv();
      long l = localcsi.cqJ();
      Su localSu = localCA.bj(l);
      if ((localSu == null) && (this.cts == null)) {
        this.cts = new AH(this, l, localcsi, localCA);

        localCA.a(this.cts);
      } else {
        localcsi.b(this, localSu);
        aeX();
      }
    }
  }

  protected void aeX() {
    throw new UnsupportedOperationException("Doit être un NPC");
  }

  public abstract byte JM();

  public byte Fx()
  {
    if (aeN() != null) {
      return aeN().hX(getId());
    }
    return super.Fx();
  }

  public int aeY() {
    if (aJp() == null) {
      return 30000;
    }
    return aJp().afI();
  }

  public void a(arl paramarl, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = e(eu.ayM);

    aq(paramArrayOfByte2);

    if (!cQK()) {
      JC();
    }

    Iterator localIterator = ayK().iterator();

    LinkedList localLinkedList = new LinkedList();
    while (localIterator.hasNext()) {
      aVc localaVc1 = (aVc)localIterator.next();
      if ((localaVc1 instanceof bPD))
        localLinkedList.addFirst(localaVc1);
      else {
        localLinkedList.addLast(localaVc1);
      }
    }
    for (int j = 0; j < localLinkedList.size(); j++) {
      aVc localaVc2 = (aVc)localLinkedList.get(j);

      if (((localaVc2 instanceof bPD)) && (((bPD)localaVc2).NT()))
        localaVc2.bks();
      else {
        localaVc2.bkr();
      }

      if ((localaVc2.aug()) || (localaVc2.bkL())) {
        ayK().G(localaVc2);
      }
      else {
        localaVc2.bkz();

        localaVc2.oT();
      }

    }

    aZx localaZx = cQZ();
    if (localaZx != null) {
      localaZx.reset();
    }

    f(paramarl.aIq());

    zV(i);

    aE(paramArrayOfByte1);
    cQM();
    JN();
  }

  public final void aeZ() {
    List localList = h(this.ldc);
    ayK().clear();
    M(localList);
    ayD();
  }

  protected void afa()
  {
    if (this.csX == null) {
      return;
    }
    UG localUG = this.csX.LB();
    if (localUG == null) {
      return;
    }
    cdO localcdO = localUG.au(cgE());
    if (localcdO == null)
      localUG.j(this);
    else if (localcdO != this)
      K.error("Obstacle de meme id " + localcdO + " different de nous " + this + " id = " + cgE());
  }

  public void afb()
  {
    dLE.doY().a(this, new String[] { "actorDescriptorLibrary" });
  }

  public int bP() {
    if (cJf() == null)
      return 0;
    return cJf().bP();
  }

  public int afc()
  {
    bva localbva = byJ.gma.cF(this.cGk.getX(), this.cGk.getY());
    if ((localbva == null) || (localbva.boT() == null)) {
      return 0;
    }

    return localbva.boT().avc();
  }

  public int afd()
  {
    bva localbva = byJ.gma.cF(this.cGk.getX(), this.cGk.getY());
    return localbva != null ? localbva.getId() : -1;
  }

  public boolean afe() {
    if (aeQ() == null) {
      return false;
    }
    return ayK().pz(977) != null;
  }

  public int aff()
  {
    int i = 0;
    Iterator localIterator;
    Object localObject;
    if (aeQ() != null) {
      localIterator = aeQ().bgG().iterator();
      while (localIterator.hasNext()) {
        localObject = (dHW)localIterator.next();
        if ((localObject instanceof byo)) {
          byo localbyo = (byo)localObject;
          if ((localbyo.aJr()) && (!localbyo.isDead()) && (localbyo.adL() == this))
            i += localbyo.bFD().alN();
        }
      }
    }
    else {
      localIterator = adH().iterator();
      while (localIterator.hasNext()) {
        localObject = (dhJ)localIterator.next();
        if ((((dhJ)localObject).aJr()) && (!((dhJ)localObject).isDead()) && 
          ((localObject instanceof byo))) {
          i += ((byo)localObject).bFD().alN();
        }
      }
    }

    return i;
  }

  public dzC afg()
  {
    return dzC.lGn;
  }

  public cjh afh()
  {
    return null;
  }

  public void afi()
  {
  }

  public void bs(boolean paramBoolean)
  {
    this.cto = paramBoolean;
  }

  public boolean afj() {
    return this.cto;
  }

  public void d(short paramShort, int paramInt) {
    this.cti.l(paramShort, paramInt);
  }

  public void e(short paramShort, int paramInt) {
    this.cti.k(paramShort, paramInt);
  }

  public boolean afk() {
    if (aef()) {
      return false;
    }

    return ((!c(cfY.hBg)) && (c(cfY.hBf))) || (c(cfY.hBq));
  }

  public String afl()
  {
    if (this.ctq < 0) {
      return null;
    }
    return agt.arQ().a(this.iIO.uO(), xK() == 0, this.ctq);
  }

  public String afm() {
    if (this.ctp < 0) {
      return null;
    }
    return agt.arQ().b(this.iIO.uO(), xK() == 0, this.ctp);
  }

  public byte afn() {
    return this.ctp;
  }

  public void e(byte paramByte, boolean paramBoolean) {
    this.ctp = paramByte;
    if (paramBoolean)
      aek();
  }

  public byte afo()
  {
    return this.ctq;
  }

  public void f(byte paramByte, boolean paramBoolean) {
    this.ctq = paramByte;
    if (paramBoolean)
      aek();
  }

  public boolean afp()
  {
    if (!aeL().isVisible()) {
      return false;
    }
    if (c(cfY.hCt)) {
      return false;
    }
    if (c(cfY.hCg)) {
      return false;
    }

    if (c(cfY.hCh))
    {
      arl localarl = aeQ();
      if (localarl != null)
        for (Su localSu : localarl.bgF())
        {
          if ((localSu.aJr()) && 
            (localSu.c(cfY.hCg)) && 
            (localSu.adM() == this))
          {
            return false;
          }
        }
    }
    return true;
  }

  public int afq()
  {
    return 900016;
  }

  public int afr() {
    return 900019;
  }

  public void a(eu[] paramArrayOfeu) {
    this.ctk.c(paramArrayOfeu);
  }

  public cdz afs() {
    return this.ctk;
  }
}