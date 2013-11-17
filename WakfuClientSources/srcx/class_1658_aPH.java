import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.log4j.Logger;

public abstract class aPH extends cGF
  implements aYF, arO, ayT, bcJ
{
  private static final String eMv = "mainLog.fightLog";
  protected static final Logger K = Logger.getLogger("mainLog.fightLog");
  public static final int eMw = 300;
  public static final int eMx = 301;
  public static final int eMy = 305;
  public static final int eMz = 306;
  public static final int eMA = 307;
  public static final int eMB = 308;
  private ArrayList eMC = new ArrayList();
  private Set eMD = new HashSet();
  private boolean eME;
  protected final aDC eMF = new aDC();
  private final cbQ eMG = new cbQ();
  protected bIC eMH;
  protected final UG iM;
  protected cOE ejP;
  protected aJD eMI;
  private ckR eMJ = null;
  private final int aw;
  protected final dTw eMK;
  protected boolean dzD = false;
  protected final azw eML = new yw();

  private final cCH eMM = new dtK(this);

  private final cCH eMN = new dtJ(this);

  public abstract long P(byte paramByte);

  protected aPH(int paramInt, dTw paramdTw, UG paramUG)
  {
    if (paramdTw == null) {
      throw new IllegalArgumentException("On construit un fight avec un modèle null");
    }

    this.eMK = paramdTw;
    this.aw = paramInt;

    this.iM = paramUG;
    this.eMI = cRk.a(this, aIq());
  }

  public cCH[] tn()
  {
    return new cCH[] { bgy(), bgz() };
  }

  public cCH bgy()
  {
    return this.eMN;
  }

  public cCH bgz() {
    return this.eMM;
  }

  public final void L(byte[] paramArrayOfByte)
  {
    LH().a(aIq(), paramArrayOfByte);
  }

  public StringBuilder ha(String paramString)
  {
    return new StringBuilder().append("[_FL_] fightId=").append(getId()).append(' ').append(paramString);
  }

  public StringBuilder b(String paramString, Throwable paramThrowable)
  {
    return ha(paramString).append(' ').append(bBd.g(paramThrowable));
  }

  public int getId()
  {
    return this.aw;
  }

  public boolean a(eG parameG) {
    return this.eMC.add(parameG);
  }

  public UG LB() {
    return this.iM;
  }

  public byte xH() {
    return this.eMK.xH();
  }

  public tl LH() {
    return this.eMH;
  }

  public aJD LC() {
    return this.eMI;
  }

  protected abstract void a(ckR paramckR);

  protected final ckR bgA() {
    if (this.eMJ == null) {
      this.eMJ = new dSd();
      this.eMJ.e(LB());
      a(this.eMJ);
    }
    return this.eMJ;
  }

  public bCs ag(dhJ paramdhJ)
  {
    if (this.eMJ == null)
      return null;
    if (paramdhJ == null)
      return null;
    return this.eMJ.hz(paramdhJ.getId());
  }

  public List bZ(byte paramByte) {
    if (this.eMJ == null) {
      return Collections.emptyList();
    }
    ArrayList localArrayList = new ArrayList();
    for (dhJ localdhJ : ch(paramByte)) {
      bCs localbCs = this.eMJ.hz(localdhJ.getId());
      if ((localbCs != null) && (!localbCs.isEmpty()))
        localArrayList.add(localbCs);
    }
    return localArrayList;
  }

  public byte bgB()
  {
    return aEt().bgB();
  }

  public byte bgC() {
    return aEt().bgC();
  }

  public byte bgD() {
    return aEt().bgD();
  }

  public byte bgE() {
    return aEt().bgE();
  }

  public Collection ca(byte paramByte)
  {
    return this.eMF.b(new cGB[] { cGB.a(cGB.ei(paramByte)) });
  }

  public Collection cb(byte paramByte) {
    return this.eMF.b(new cGB[] { cGB.d(new cGB[] { cGB.a(cGB.ei(paramByte)), cGB.cBA() }) });
  }

  public Collection cc(byte paramByte) {
    return this.eMF.b(new cGB[] { cGB.d(new cGB[] { cGB.ei(paramByte), cGB.cBA() }) });
  }

  public Collection cd(byte paramByte) {
    return this.eMF.b(new cGB[] { cGB.d(new cGB[] { cGB.a(cGB.ei(paramByte)), cGB.c(new cGB[] { cGB.cBC(), cGB.cBA() }) }) });
  }

  public Collection ce(byte paramByte) {
    return this.eMF.b(new cGB[] { cGB.a(cGB.ei(paramByte)), cGB.eh(0) });
  }

  public Collection cf(byte paramByte) {
    return this.eMF.b(new cGB[] { cGB.ei(paramByte), cGB.eh(0) });
  }

  public Collection cg(byte paramByte) {
    return this.eMF.b(new cGB[] { cGB.a(cGB.ei(paramByte)), cGB.cBA(), cGB.eh(0) });
  }

  public Collection ch(byte paramByte) {
    return this.eMF.b(new cGB[] { cGB.ei(paramByte) });
  }

  public Collection ci(byte paramByte) {
    return this.eMF.b(new cGB[] { cGB.d(new cGB[] { cGB.cBA(), cGB.cBG(), cGB.a(cGB.ei(paramByte)) }) });
  }

  public Collection ah(dhJ paramdhJ) {
    return this.eMF.b(new cGB[] { cGB.cBA(), cGB.a(cGB.ek(paramdhJ.cRi())), cGB.a(cGB.cBD()), cGB.a(cGB.l(cfY.hBn)) });
  }

  public dhJ eu(long paramLong)
  {
    return this.eMF.dP(paramLong);
  }

  public Collection bgF() {
    return this.eMF.b(new cGB[] { cGB.cBA() });
  }

  public Collection bgG() {
    return this.eMF.b(new cGB[] { cGB.c(new cGB[] { cGB.cBA(), cGB.cBC() }) });
  }

  public Collection Z(dhJ paramdhJ) {
    return this.eMF.b(new cGB[] { cGB.aT(paramdhJ) });
  }

  public boolean ai(dhJ paramdhJ) {
    return (this.eMF.R(paramdhJ)) || (this.eMF.S(paramdhJ));
  }

  public cOE aIq() {
    return this.ejP;
  }

  public boolean b(dhJ paramdhJ, byte paramByte)
  {
    if ((paramdhJ.afv() != null) && (paramdhJ.afv().eu(paramdhJ.getId()) != null)) {
      K.error("Le personnage est deja ajouté au combat !");
      return false;
    }

    if (ch(paramByte).contains(paramdhJ)) {
      return false;
    }
    if ((paramByte == 0) && (this.eMK.bbQ())) {
      return true;
    }
    int i = this.eMF.b(new cGB[] { cGB.ei(paramByte) }).size() + 1;
    if ((i < bgD()) || (i > bgE())) {
      return false;
    }
    return true;
  }

  public boolean a(byte paramByte, Collection paramCollection)
  {
    if (!b(paramByte, paramCollection)) {
      return false;
    }
    for (dhJ localdhJ : paramCollection) {
      a(localdhJ, paramByte, false);
      a(localdhJ);
      if (aEu() == dzm.lFM)
      {
        return false;
      }
    }
    return true;
  }

  private boolean b(byte paramByte, Collection paramCollection) {
    if ((paramByte == 0) && (this.eMK.bbQ())) {
      return true;
    }
    int i = paramCollection.size();
    return (paramByte >= 0) && (paramByte < bgC()) && (i >= bgD()) && (i <= bgE());
  }

  public boolean c(dhJ paramdhJ, byte paramByte)
  {
    if (b(paramdhJ, paramByte)) {
      a(paramdhJ, paramByte, false);
      a(paramdhJ);
    }
    return true;
  }

  public void a(dhJ paramdhJ, byte paramByte, boolean paramBoolean) {
    a(paramdhJ, paramByte, paramBoolean, paramdhJ);
  }

  public void a(dhJ paramdhJ1, byte paramByte, boolean paramBoolean, dhJ paramdhJ2) {
    this.eMF.a(paramdhJ1, paramByte, paramBoolean, paramdhJ2);
    g(paramdhJ1);
  }

  public boolean ev(long paramLong)
  {
    dhJ localdhJ = this.eMF.a(new cGB[] { cGB.iw(paramLong) });
    if (this.eMI != null) {
      this.eMI.g(localdhJ);
    }
    if (!aj(localdhJ)) {
      return false;
    }

    if (!aDz())
    {
      if (localdhJ.cRh())
        av(localdhJ);
      else {
        au(localdhJ);
      }
      return true;
    }
    return false;
  }

  private boolean aj(dhJ paramdhJ) {
    if (paramdhJ == null) {
      return false;
    }

    for (Iterator localIterator = this.eMF.Z(paramdhJ).iterator(); localIterator.hasNext(); ) { localdhJ = (dhJ)localIterator.next();
      if (localdhJ != null)
        localdhJ.aeb();
      else
        K.error("On un fighter non présent en combat sous le contrôle d'un fighter en combat ");
    }
    dhJ localdhJ;
    for (localIterator = this.eMF.b(new cGB[] { cGB.cBA(), cGB.aT(paramdhJ) }).iterator(); localIterator.hasNext(); ) { localdhJ = (dhJ)localIterator.next();
      localdhJ.he(true);
      ak(localdhJ);
      localdhJ.he(false);
    }

    for (localIterator = this.eMF.b(new cGB[] { cGB.cBC(), cGB.aT(paramdhJ) }).iterator(); localIterator.hasNext(); ) { localdhJ = (dhJ)localIterator.next();
      localdhJ.he(true);
      am(localdhJ);
      localdhJ.he(false);
    }
    return true;
  }

  public dTw aEt()
  {
    return this.eMK;
  }

  public Collection bgH() {
    return this.eMF.b(new cGB[] { cGB.eh(0) });
  }

  public Collection bgI() {
    return this.eMF.b(new cGB[] { cGB.eh(1) });
  }

  public Collection bgJ() {
    return this.eMF.b(new cGB[] { cGB.cBA() });
  }

  public Collection bgK() {
    return this.eMF.b(new cGB[] { cGB.c(new cGB[] { cGB.cBA(), cGB.l(cfY.hCF) }) });
  }

  public int bgL() {
    return bgJ().size();
  }

  public boolean ak(dhJ paramdhJ)
  {
    if (paramdhJ == null) {
      throw new IllegalArgumentException("appel de putFighterOffPlay avec fighter = null");
    }
    boolean bool = true;

    if ((!aEt().bbP()) && (bgL() <= 1)) {
      bool = false;
    } else if (al(paramdhJ))
    {
      az(paramdhJ);
    } else {
      bool = false;
      K.error(ha("Échec de la transition IN PLAY -> OFF PLAY pour " + paramdhJ.getId()));
    }

    paramdhJ.ps();
    return bool;
  }

  public boolean al(dhJ paramdhJ) {
    return this.eMF.O(paramdhJ);
  }

  public Collection cj(byte paramByte) {
    return this.eMF.b(new cGB[] { cGB.cBA(), cGB.ei(paramByte), cGB.a(cGB.l(dKm.lXl)) });
  }

  public Collection b(cGB[] paramArrayOfcGB) {
    return this.eMF.b(paramArrayOfcGB);
  }

  public Collection ck(byte paramByte) {
    return this.eMF.b(new cGB[] { cGB.c(new cGB[] { cGB.cBA(), cGB.l(cfY.hCF) }), cGB.ei(paramByte), cGB.a(cGB.l(dKm.lXl)) });
  }

  public Collection cl(byte paramByte) {
    return this.eMF.b(new cGB[] { cGB.ek(paramByte) });
  }

  public Collection cm(byte paramByte) {
    Collection localCollection = this.eMF.b(new cGB[] { cGB.c(new cGB[] { cGB.cBA(), cGB.l(cfY.hCF) }), cGB.ei(paramByte) });
    Iterator localIterator = localCollection.iterator();
    while (localIterator.hasNext()) {
      dhJ localdhJ = (dhJ)localIterator.next();
      if (localdhJ.i(cfY.hCu))
        localIterator.remove();
    }
    return localCollection;
  }

  public void x(dhJ paramdhJ)
  {
    if (paramdhJ == null) {
      throw new IllegalArgumentException("appel de putFighterBackInPlay avec fighter = null");
    }
    if (this.eMF.N(paramdhJ))
      paramdhJ.aeb();
    else {
      K.error(ha("Échec de la transition OFF PLAY -> IN PLAY pour " + paramdhJ.getId()));
    }

    paramdhJ.adY();
  }

  public boolean am(dhJ paramdhJ)
  {
    if (paramdhJ == null) {
      throw new IllegalArgumentException("appel de putFighterOutOfPlay avec fighter = null");
    }
    boolean bool = true;
    try {
      if (!an(paramdhJ)) {
        K.error(ha("Échec de la transition OFF PLAY -> OUT OF PLAY pour " + paramdhJ.getId()));
        bool = false;
      } else {
        paramdhJ.aeb();
      }

      paramdhJ.adZ();

      byte b = paramdhJ.Fx();
      if ((paramdhJ.aft().Fx() == b) && (cj(b).isEmpty()))
        cp(b);
    } catch (IllegalArgumentException localIllegalArgumentException) {
      K.error("Exception levee", localIllegalArgumentException);
    }

    h(paramdhJ);

    return bool;
  }

  public boolean an(dhJ paramdhJ) {
    return this.eMF.P(paramdhJ);
  }

  private boolean bgM()
  {
    return aEt().bbR().c(this);
  }

  public boolean aDz()
  {
    try
    {
      if (!this.eME) {
        return false;
      }
      if (this.dzD) {
        return false;
      }
      if (bgM()) {
        return false;
      }
      byte b = bgN();
      if (b != -1) {
        co(b);
      }

      aDE();
    }
    catch (Exception localException) {
      K.error(ha("CHECK DE FIN DE COMBAT : On termine de force"));
      K.error(ha("CHECK DE FIN DE COMBAT : on loggue, mais on ne fait rien, sinon on pète un combat " + bBd.b(localException, 4)));
    }

    return true;
  }

  private byte bgN() {
    cpy localcpy = bgO();
    if (localcpy.size() == 1) {
      return localcpy.toArray()[0];
    }
    K.error(ha("On n'a pas une seule equipe vainqueur à la fin du combat, on ne déclare pas de vainqueur"));
    return -1;
  }

  private cpy bgO() {
    cpy localcpy = new cpy();
    for (dhJ localdhJ : bgJ()) {
      if (localdhJ.Fx() == -1) {
        K.error(ha("[FIGHT_REFACTOR] On a un fighter inPlay avec un teamId à -1 " + localdhJ + " - " + bBd.rV(8)));
      }
      else if (!localdhJ.i(cfY.hCu))
        localcpy.dP(localdhJ.Fx());
    }
    return localcpy;
  }

  public boolean bgP() {
    return this.eME;
  }

  public void aDE()
  {
    this.dzD = true;
    try
    {
      LH().stop();
      LH().AZ();
    } catch (Exception localException1) {
      K.error(b("FIN DE COMBAT : Arret de la timeline ", localException1));
    }
    Object localObject;
    try
    {
      for (localIterator1 = bgJ().iterator(); localIterator1.hasNext(); ) { localObject = (dhJ)localIterator1.next();
        az((dhJ)localObject);
        h((dhJ)localObject);
      }
    }
    catch (Exception localException2)
    {
      Iterator localIterator1;
      K.error(b("FIN DE COMBAT : Retrait des personnages inplay", localException2));
    }
    try
    {
      for (localIterator2 = this.eMF.b(new cGB[] { cGB.cBC() }).iterator(); localIterator2.hasNext(); ) { localObject = (dhJ)localIterator2.next();
        h((dhJ)localObject);
      }
    }
    catch (Exception localException3)
    {
      Iterator localIterator2;
      K.error(b("FIN DE COMBAT : Retrait des personnages offplay", localException3));
    }
    try
    {
      for (localIterator3 = this.eMI.bbg().iterator(); localIterator3.hasNext(); ) { localObject = (cjK)localIterator3.next();
        b((cjK)localObject);
      }
    }
    catch (Exception localException4)
    {
      Iterator localIterator3;
      K.error(b("FIN DE COMBAT : Retrait des zones d'effets", localException4));
    }
    try
    {
      for (localIterator4 = this.eMF.b(new cGB[] { cGB.cBB() }).iterator(); localIterator4.hasNext(); ) { localObject = (dhJ)localIterator4.next();
        if (((dhJ)localObject).aft() == localObject)
          ((dhJ)localObject).aea();
      }
    }
    catch (Exception localException5)
    {
      Iterator localIterator4;
      K.error(b("FIN DE COMBAT : Notification de fin de combat", localException5));
    }
    try
    {
      for (localIterator5 = this.eMF.b(new cGB[] { cGB.cBB() }).iterator(); localIterator5.hasNext(); ) { localObject = (dhJ)localIterator5.next();
        if (((dhJ)localObject).aft() == localObject)
          X((dhJ)localObject);
      }
    }
    catch (Exception localException6)
    {
      Iterator localIterator5;
      K.error(b("FIN DE COMBAT : Retrait des fighters liés aux combats de leur controlleur", localException6));
    }

    for (Iterator localIterator6 = bgU().iterator(); localIterator6.hasNext(); ) { localObject = (dhJ)localIterator6.next();
      try {
        if (ac((dhJ)localObject) == localObject)
          y((dhJ)localObject);
      } catch (Exception localException9) {
        K.error(b("FIN DE COMBAT : Retrait des controlleurs", localException9));
      }
    }
    try
    {
      aDu();
    } catch (Exception localException7) {
      K.error(b("FIN DE COMBAT : Dispatch de l'évenement de fin de combat", localException7));
    }
    try
    {
      bgQ();
    } catch (Exception localException8) {
      K.error(b("FIN DE COMBAT : Destruction des aires d'effet", localException8));
    }

    aDv();
  }

  protected void bgQ() {
    this.eMI.bbk();
  }

  public void aDv()
  {
    if (this.eMI != null) {
      this.eMI.release();
      this.eMI = null;
    }

    if (this.ejP != null)
      this.ejP = null;
  }

  public abstract cVn aDr();

  protected void h(dhJ paramdhJ)
  {
    ao(paramdhJ);
  }

  public void ao(dhJ paramdhJ) {
    this.iM.h(paramdhJ);
  }

  private Iterator bgR()
  {
    Collection localCollection = bgS();
    return new anZ(localCollection);
  }

  private Collection bgS() {
    ArrayList localArrayList1 = new ArrayList();

    localArrayList1.add(bgG().iterator());
    if (this.eMI != null) {
      ArrayList localArrayList2 = new ArrayList(this.eMI.bbh());
      if (!localArrayList2.isEmpty())
        localArrayList1.add(localArrayList2.iterator());
    }
    return localArrayList1;
  }

  public dle bk(long paramLong)
  {
    Object localObject = this.eMI.eb(paramLong);
    if (localObject != null) {
      return localObject;
    }
    localObject = this.eMF.dP(paramLong);
    if (localObject != null) {
      return localObject;
    }

    return ew(paramLong);
  }

  public int bgT()
  {
    return this.eMF.b(new cGB[0]).size();
  }

  public Collection bgU() {
    return this.eMF.b(new cGB[0]);
  }

  public dle ew(long paramLong) {
    return null;
  }

  public Iterator bgV()
  {
    return new btA();
  }

  public boolean ex(long paramLong) {
    return false;
  }

  private Iterator bgW() {
    Collection localCollection = bgS();
    Iterator localIterator = bgV();
    if (localIterator != null)
      localCollection.add(localIterator);
    return new anZ(localCollection);
  }

  public Iterator Lz()
  {
    return new Po(this);
  }

  public List k(cYk paramcYk)
  {
    return i(paramcYk.getX(), paramcYk.getY(), paramcYk.IB());
  }

  public List i(int paramInt1, int paramInt2, int paramInt3)
  {
    Iterator localIterator = Lz();
    ArrayList localArrayList = new ArrayList();
    while (localIterator.hasNext()) {
      dle localdle = (dle)localIterator.next();
      if (cqJ.a(localdle, paramInt1, paramInt2) == 0)
        localArrayList.add(localdle);
    }
    return localArrayList;
  }

  public dhJ x(cYk paramcYk) {
    if (paramcYk == null)
      return null;
    return bo(paramcYk.getX(), paramcYk.getY());
  }

  public dhJ bo(int paramInt1, int paramInt2) {
    if (this.iM == null)
      return null;
    cdO localcdO = this.iM.au(paramInt1, paramInt2);
    if (localcdO == null)
      return null;
    if ((localcdO instanceof dhJ)) {
      return (dhJ)localcdO;
    }
    return null;
  }

  public byte ad(dhJ paramdhJ) {
    return this.eMF.ad(paramdhJ);
  }

  public void a(dhJ paramdhJ, byte paramByte) {
    this.eMF.a(paramdhJ, paramByte);
  }

  public dhJ cn(byte paramByte) {
    return this.eMF.a(new cGB[] { cGB.ej(paramByte), cGB.cBE() });
  }

  public boolean ap(dhJ paramdhJ) {
    return this.eMF.ae(paramdhJ);
  }

  public dhJ ab(dhJ paramdhJ) {
    return this.eMF.ab(paramdhJ);
  }

  public dhJ ac(dhJ paramdhJ) {
    return this.eMF.ac(paramdhJ);
  }

  public void h(long paramLong1, long paramLong2) {
    dhJ localdhJ1 = eu(paramLong1);
    dhJ localdhJ2 = eu(paramLong2);

    if (localdhJ1 == null) {
      K.error(String.format("[FIGHT_CONTROLLERS] Fighter introuvable pour un changement de controlleur : %d", new Object[] { Long.valueOf(paramLong1) }));
    }
    if (localdhJ2 == null) {
      K.error(String.format("[FIGHT_CONTROLLERS] Fighter introuvable pour un changement de controlleur : %d", new Object[] { Long.valueOf(paramLong2) }));
    }

    this.eMF.c(localdhJ1, localdhJ2);
  }

  public void X(dhJ paramdhJ) {
    this.eMF.X(paramdhJ);
  }

  public void Y(dhJ paramdhJ) {
    this.eMF.Y(paramdhJ);
  }

  public Collection bbj() {
    if (this.eMI != null) {
      return this.eMI.bbj();
    }
    return Collections.emptyList();
  }

  public boolean aq(dhJ paramdhJ) {
    return this.eMF.V(paramdhJ);
  }

  public boolean R(dhJ paramdhJ) {
    return this.eMF.R(paramdhJ);
  }

  public boolean S(dhJ paramdhJ) {
    return this.eMF.S(paramdhJ);
  }

  public boolean T(dhJ paramdhJ) {
    return this.eMF.T(paramdhJ);
  }

  public void ar(dhJ paramdhJ) {
    if (!paramdhJ.c(dKm.lXl))
      LH().ac(paramdhJ.getId());
  }

  public void as(dhJ paramdhJ) {
    if (!paramdhJ.c(dKm.lXl))
      LH().av(paramdhJ.getId());
  }

  public void at(dhJ paramdhJ) {
    this.eMG.add(paramdhJ.getId());
  }

  public boolean ey(long paramLong) {
    return this.eMG.N(paramLong);
  }

  public void a(dhJ paramdhJ)
  {
    paramdhJ.a(300, this);
    for (int i = 0; i < this.eMC.size(); i++)
      ((eG)this.eMC.get(i)).a(paramdhJ);
  }

  public void c(dhJ paramdhJ) {
    paramdhJ.a(305, this);
    for (int i = 0; i < this.eMC.size(); i++)
      ((eG)this.eMC.get(i)).c(paramdhJ);
  }

  public void b(dhJ paramdhJ) {
    paramdhJ.a(306, this);
    for (int i = 0; i < this.eMC.size(); i++)
      ((eG)this.eMC.get(i)).b(paramdhJ);
  }

  public void au(dhJ paramdhJ) {
    paramdhJ.a(308, this);
  }

  public void av(dhJ paramdhJ) {
    paramdhJ.a(307, this);
  }

  public void y(dhJ paramdhJ) {
    if (paramdhJ == null) {
      return;
    }

    try
    {
      aw(paramdhJ);
      this.eMF.W(paramdhJ);
    } catch (Exception localException1) {
      K.error("Exception levee", localException1);
    }
    try
    {
      paramdhJ.a(301, this);
    } catch (Exception localException2) {
      K.error("Exception levee", localException2);
    }
  }

  private void aw(dhJ paramdhJ) {
    if (!this.eMD.contains(paramdhJ)) {
      this.eMD.add(paramdhJ);
      for (dhJ localdhJ : this.eMF.aa(paramdhJ)) {
        if (localdhJ != paramdhJ) {
          aw(localdhJ);
        }
      }
    }
    ax(paramdhJ);
  }

  protected void ax(dhJ paramdhJ) {
    if (!this.eMF.U(paramdhJ))
      return;
    paramdhJ.aea();
    this.eMF.Q(paramdhJ);
  }

  public void g(dhJ paramdhJ)
  {
    v(paramdhJ);
    paramdhJ.a(this);
    K.info(ha(paramdhJ.cQF() + " breed = " + paramdhJ.uO() + " [" + paramdhJ.getId() + ']' + " isControlledByAI=" + paramdhJ.cQJ() + " Id d'obstacle " + paramdhJ.cgE() + " a rejoint le combat"));
  }

  public void ay(dhJ paramdhJ)
  {
    if (paramdhJ == null)
      return;
    if (paramdhJ.c(cfY.hCj))
      return;
    ArrayList localArrayList = new ArrayList();
    for (Iterator localIterator = this.eMI.bbj().iterator(); localIterator.hasNext(); ) { localcjK = (cjK)localIterator.next();
      if (localcjK.a(paramdhJ, paramdhJ.fa(), paramdhJ.fb(), paramdhJ.fc()))
        localArrayList.add(localcjK);
    }
    cjK localcjK;
    if (!localArrayList.isEmpty())
      for (localIterator = localArrayList.iterator(); localIterator.hasNext(); ) { localcjK = (cjK)localIterator.next();
        localcjK.a(10012, null, paramdhJ);

        if (aDz())
          return;
      }
  }

  protected void v(dhJ paramdhJ)
  {
    this.iM.g(paramdhJ);
  }

  public void az(dhJ paramdhJ)
  {
    if (LC() != null)
      LC().g(paramdhJ);
  }

  public abstract void a(dhJ paramdhJ, List paramList, dNZ paramdNZ);

  public abstract void aA(dhJ paramdhJ);

  public void bgX() {
    this.eME = true;
  }

  public abstract void aDu();

  public void co(byte paramByte) {
    for (dhJ localdhJ : this.eMF.bA(paramByte))
      c(localdhJ);
  }

  public void cp(byte paramByte)
  {
    for (dhJ localdhJ : this.eMF.bA(paramByte))
      try {
        if (localdhJ.cRh())
          av(localdhJ);
        else
          b(localdhJ);
      } catch (Exception localException) {
        K.error("Exception levee", localException);
      }
  }

  public void a(cjK paramcjK)
  {
    this.iM.g(paramcjK);

    if (paramcjK.getType() == xj.bps.xj()) {
      ((awr)paramcjK).a(this.eML);
      this.eML.h((awr)paramcjK);
    } else if (paramcjK.getType() == xj.bpy.xj()) {
      cDg localcDg = (cDg)paramcjK;
      switch (localcDg.czh()) {
      case 4:
        bgA().b(localcDg);
        break;
      }
    }
  }

  public void b(cjK paramcjK)
  {
    this.iM.h(paramcjK);

    if (paramcjK.getType() == xj.bps.xj()) {
      this.eML.i((awr)paramcjK);
      ((awr)paramcjK).a(null);
    } else if (paramcjK.getType() == xj.bpy.xj()) {
      cDg localcDg = (cDg)paramcjK;
      switch (localcDg.czh()) {
      case 4:
        bgA().c(localcDg);
        break;
      }
    }
  }

  protected void l(cjK paramcjK)
  {
    if (!(paramcjK instanceof aTa)) {
      return;
    }
    aTa localaTa = (aTa)paramcjK;
    boolean bool = localaTa.Vj();
    if (!bool)
      return;
    if (localaTa.Vl() != null)
      localaTa.Vl().adK();
  }

  public void f(cjK paramcjK)
  {
    if ((paramcjK.atL()) && (paramcjK.adX())) {
      paramcjK.he(true);
      paramcjK.b(null);
      paramcjK.he(false);
    }
  }

  public void c(cjK paramcjK, alr paramalr)
  {
  }
}