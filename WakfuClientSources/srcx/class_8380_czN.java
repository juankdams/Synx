import com.ankamagames.framework.graphics.engine.material.Material;
import com.ankamagames.framework.graphics.engine.material.Material.ObjectFactory;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class czN
  implements aYF, ayT, bcJ, buF, bxA, ckT, dEB
{
  protected static final Logger K = Logger.getLogger(czN.class);

  private int aw = -1;
  private dzm ipA;
  private final cOE ejP;
  private final List ipB = new ArrayList();
  private final List ipC = new ArrayList();
  private final aOA ipD;
  private final aPF ipE = new aPF();

  private int ipF = 0;
  private ArrayList ipG = new ArrayList();

  private azj ipH = new apy();
  private UG iM;
  private Su ipI;
  private Su ipJ;
  private long ipK;
  private long ipL;
  private final dTw bJh;
  private cKX ipM;

  public void k(byte paramByte, long paramLong)
  {
    Su localSu = CA.Lv().bj(paramLong);
    if (localSu == null) {
      this.ipE.c(paramLong, paramByte);
      return;
    }
    a(localSu, paramByte);
  }

  public void a(Su paramSu, byte paramByte) {
    if (!this.ipB.contains(paramSu)) {
      this.ipB.add(paramSu);
      this.ipE.c(paramSu.getId(), paramByte);

      paramSu.aeO();
      paramSu.cQL();

      dmM.cUe().b(paramSu, this.aw);

      if (paramSu.cQK()) {
        this.ipC.add(paramSu);
      }
      paramSu.a(this);

      paramSu.aeL().a(this);
    } else {
      K.error("Ajout multiple du fighter " + paramSu + " au combat externe ID=" + getId());
    }
  }

  public void aU(Su paramSu) {
    if (!this.ipE.containsKey(paramSu.getId())) {
      K.error(String.format("[FIGHT_REFACTOR]Tentative de spawn du fighter %d sans connaitre sa team", new Object[] { Long.valueOf(paramSu.getId()) }));
      return;
    }
    byte b = this.ipE.er(paramSu.getId());
    a(paramSu, b);

    int i = 0;
    if ((this.ipJ == null) && (this.ipL == paramSu.getId())) {
      this.ipJ = paramSu;
      i = 1;
    }
    if ((this.ipI == null) && (this.ipK == paramSu.getId())) {
      this.ipI = paramSu;
      i = 1;
    }
    if ((i != 0) && (this.ipI != null) && (this.ipJ != null))
      dmM.cUe().d(this);
  }

  public dTw aEt()
  {
    return this.bJh;
  }

  public czN(dTw paramdTw) {
    this.bJh = paramdTw;
    this.ejP = new bfj(this);
    this.ipD = new aOA(this, this.ejP);
  }

  protected static Material ec(byte paramByte) {
    Material localMaterial = (Material)Material.mwD.bQy();

    switch (paramByte) {
    case 0:
      localMaterial.F(0.5F, 0.0F, 0.0F);
      break;
    case 1:
      localMaterial.F(0.0F, 0.0F, 0.5F);
      break;
    default:
      if (paramByte > 7) {
        localMaterial.F(1.0F, 1.0F, 1.0F);
        K.error("team id : " + paramByte + " > 7");
      } else {
        localMaterial.F(paramByte, paramByte, paramByte);
      }break;
    }
    return localMaterial;
  }

  public dzm aEu() {
    return this.ipA;
  }

  public void a(dzm paramdzm) {
    this.ipA = paramdzm;
    if (paramdzm == dzm.lFK)
      cwL();
  }

  public int getId() {
    return this.aw;
  }

  public void d(int paramInt) {
    this.aw = paramInt;
  }

  public Collection bgG() {
    return Collections.unmodifiableCollection(this.ipB);
  }

  public Collection ch(byte paramByte) {
    ArrayList localArrayList = new ArrayList();
    for (Su localSu : this.ipB) {
      if (this.ipE.er(localSu.getId()) == paramByte)
        localArrayList.add(localSu);
    }
    return localArrayList;
  }

  public Collection cj(byte paramByte) {
    ArrayList localArrayList = new ArrayList();
    for (Su localSu : this.ipB) {
      if ((this.ipE.er(localSu.getId()) == paramByte) && (localSu.byc()) && (!localSu.c(dKm.lXl)))
        localArrayList.add(localSu);
    }
    return localArrayList;
  }

  public Collection ca(byte paramByte) {
    ArrayList localArrayList = new ArrayList();
    for (Su localSu : this.ipB) {
      if (this.ipE.er(localSu.getId()) != paramByte)
        localArrayList.add(localSu);
    }
    return localArrayList;
  }

  public Su dg(long paramLong) {
    for (Su localSu : this.ipB) {
      if (localSu.getId() == paramLong)
        return localSu;
    }
    return null;
  }

  public void c(Su paramSu) {
    if (!this.ipB.remove(paramSu)) {
      return;
    }
    dmM.cUe().c(paramSu, this.aw);
    aW(paramSu);
    paramSu.ayK().clear();
  }

  public boolean b(Su paramSu, byte paramByte)
  {
    if (paramSu.adF()) {
      return false;
    }
    if ((paramByte < 0) || (paramByte >= aEt().bgC())) {
      return false;
    }
    Collection localCollection = ch(paramByte);

    return localCollection.size() < this.bJh.bgE();
  }

  public void a(dCb paramdCb, boolean paramBoolean)
  {
    Iterator localIterator = bgG().iterator();
    if (paramBoolean) {
      int i;
      try {
        i = ay.bd().getString("magicKey").toCharArray()[0];
      } catch (Exception localException) {
        K.error("pas d'entrer pour magicKey");
        i = 0;
      }
      if (((aTL)WakfuClientInstance.awy().Dg()).isKeyDown(i))
        while (localIterator.hasNext()) {
          Su localSu = (Su)localIterator.next();
          Material localMaterial = ec(localSu.Fx());
          localSu.aeL().a(localMaterial);
          localMaterial.axl();
        }
    }
    else {
      while (localIterator.hasNext()) {
        cew localcew = ((Su)localIterator.next()).aeL();
        localcew.atq();
      }
    }
  }

  public boolean cwG() {
    for (Su localSu : bgG()) {
      aV(localSu);
    }

    return true;
  }

  private boolean aV(Su paramSu) {
    cew localcew = paramSu.aeL();
    localcew.b(this);
    return true;
  }

  public void cwH() {
    for (Su localSu : bgG())
      aW(localSu);
  }

  public void aW(Su paramSu)
  {
    aV(paramSu);
    paramSu.aeL().atC();
  }

  public void m(aVc paramaVc) {
    if (!paramaVc.bkM())
      return;
    if (paramaVc.bkf() != null) {
      if ((paramaVc.bkf() instanceof Su)) {
        ((Su)paramaVc.bkf()).aeL().b((doA)paramaVc, false);
      }
    }
    else if ((paramaVc.bke() != null) && ((paramaVc.bke() instanceof Su)))
      ((Su)paramaVc.bke()).aeL().b((doA)paramaVc, true);
  }

  public void k(aVc paramaVc)
  {
    if (paramaVc.bkf() != null) {
      if ((paramaVc.bkf() instanceof Su)) {
        ((Su)paramaVc.bkf()).aeL().d((doA)paramaVc, false);
      }
    }
    else if ((paramaVc.bke() != null) && ((paramaVc.bke() instanceof Su)))
      ((Su)paramaVc.bke()).aeL().d((doA)paramaVc, true);
  }

  public void l(aVc paramaVc)
  {
    k(paramaVc);
  }

  public void n(aVc paramaVc) {
    if (!paramaVc.bkM())
      return;
    if (paramaVc.bkf() != null) {
      if ((paramaVc.bkf() instanceof Su)) {
        ((Su)paramaVc.bkf()).aeL().c((doA)paramaVc, false);
      }
    }
    else if ((paramaVc.bke() != null) && ((paramaVc.bke() instanceof Su)))
      ((Su)paramaVc.bke()).aeL().c((doA)paramaVc, true);
  }

  public void a(cjK paramcjK)
  {
    dmM.cUe().a(this, paramcjK);
  }

  public void a(cjK paramcjK, alr paramalr) {
  }

  public void f(cjK paramcjK) {
  }

  public void c(cjK paramcjK, alr paramalr) {
  }

  public void b(cjK paramcjK) {
    dmM.cUe().c(this, paramcjK);
  }

  public void a(aAn paramaAn) {
    if (paramaAn == null)
      return;
    if (!(paramaAn instanceof aTa)) {
      return;
    }
    aTa localaTa = (aTa)paramaAn;
    boolean bool = localaTa.Vj();
    if (!bool)
      return;
    if (localaTa.Vl() != null)
      localaTa.Vl().adK();
  }

  public void b(cjK paramcjK, alr paramalr) {
  }

  public cOE aIq() {
    return this.ejP;
  }

  public aJD LC() {
    return this.ipD;
  }

  public dle bk(long paramLong) {
    cjK localcjK = null;
    if (this.ipD != null)
      localcjK = this.ipD.eb(paramLong);
    if (localcjK != null)
      return localcjK;
    for (Su localSu : this.ipB) {
      if (localSu.getId() == paramLong)
        return localSu;
    }
    return null;
  }

  public Iterator bgR() {
    return new anZ(this.ipB.iterator(), this.ipD.bbg().iterator());
  }

  public int cwI() {
    return this.ipB.size() + this.ipD.bbi();
  }

  public long P(byte paramByte) {
    throw new UnsupportedOperationException("On ne doit pas créer de nouvelles ID ici");
  }

  public void cwJ()
  {
    while (!this.ipB.isEmpty()) {
      aX((Su)this.ipB.get(0));
    }

    cwL();

    if (this.ipH != null) {
      btL.gcv.b((agk)this.ipH);
      this.ipH = null;
    }
  }

  private void aX(Su paramSu)
  {
    try {
      c(paramSu);
    } catch (Exception localException) {
      K.error("Erreur au retrait d'un personnage depuis une ExternalFightInfo " + bBd.b(localException, 10));
    } finally {
      paramSu.a(null);
    }
  }

  public Iterator Lz() {
    return bgR();
  }

  public List k(cYk paramcYk) {
    return i(paramcYk.getX(), paramcYk.getY(), paramcYk.IB());
  }

  public List i(int paramInt1, int paramInt2, int paramInt3) {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = Lz();
    while (localIterator.hasNext()) {
      dle localdle = (dle)localIterator.next();
      if (cqJ.a(localdle, paramInt1, paramInt2) == 0)
        localArrayList.add(localdle);
    }
    return localArrayList;
  }

  public void aDE() {
    cwH();

    ArrayList localArrayList = new ArrayList(bgG());
    for (Iterator localIterator = localArrayList.iterator(); localIterator.hasNext(); ) { localObject = (Su)localIterator.next();
      try {
        aY((Su)localObject);
      } catch (Exception localException) {
        K.error("Exception levee", localException);
      }
    }
    Object localObject;
    for (localIterator = LC().bbj().iterator(); localIterator.hasNext(); ) { localObject = (cjK)localIterator.next();
      b((cjK)localObject);
    }

    if (this.ipH != null) {
      btL.gcv.b((agk)this.ipH);
    }

    for (localIterator = this.ipC.iterator(); localIterator.hasNext(); ) { localObject = (Su)localIterator.next();
      CA.Lv().r((Su)localObject);
    }

    this.ipE.clear();
    this.ipB.clear();
    this.ipC.clear();

    dmM.cUe(); dmM.j(this);
  }

  public void aY(Su paramSu)
  {
    c(paramSu);
    paramSu.a(null);
    paramSu.aeZ();
    paramSu.aeP();
    dmM.cUe().c(paramSu, getId());
  }

  public void Z(ArrayList paramArrayList) {
    this.ipG = paramArrayList;
  }

  public ArrayList cwK() {
    return this.ipG;
  }

  public void gQ() {
    this.ipF += 1;
  }

  public void axl() {
    this.ipF -= 1;
    if (this.ipF == 0) {
      ckT localckT = cjS.clP().vz(getId());
      if ((localckT instanceof czN)) {
        aDE();
        cjS.clP().h(this);
      }
    }
  }

  public azj aDH() {
    return this.ipH;
  }

  public void e(UG paramUG) {
    this.iM = paramUG;
  }

  public UG LB() {
    return this.iM;
  }

  public byte hX(long paramLong) {
    if (this.ipE.N(paramLong))
      return this.ipE.er(paramLong);
    return -1;
  }

  public void d(cKX paramcKX)
  {
    cwL();
    this.ipM = paramcKX;
  }

  private void cwL() {
    if (this.ipM != null)
      this.ipM.a(16, null);
    this.ipM = null;
  }

  public void e(cKX paramcKX) {
    if (paramcKX == this.ipM)
      this.ipM = null;
  }

  public void hY(long paramLong) {
    this.ipK = paramLong;
  }

  public void hZ(long paramLong) {
    this.ipL = paramLong;
  }

  public void aZ(Su paramSu) {
    this.ipI = paramSu;
  }

  public void ba(Su paramSu) {
    this.ipJ = paramSu;
  }

  public Su cwM() {
    return this.ipI;
  }

  public Su cwN() {
    return this.ipJ;
  }

  public boolean e(cjK paramcjK) {
    if (paramcjK.getType() == xj.bpm.xj())
      return false;
    if (paramcjK.getType() == xj.bpv.xj())
      return false;
    if (paramcjK.getType() == xj.bpk.xj())
      return false;
    return true;
  }
}