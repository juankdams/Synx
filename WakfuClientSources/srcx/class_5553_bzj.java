import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.log4j.Logger;

public abstract class bzj
{
  protected static final Logger K = Logger.getLogger(bzj.class);
  private final int aw;
  private final short aSh;
  private final int eMm;
  private final byte gmV;
  private final byte gmW;
  private final float aSl;
  private final byte gmX;
  private final boolean gmY;
  private final boolean aSp;
  private final boolean aSq;
  private final boolean aSs;
  private final boolean aSr;
  private final byte gmZ;
  private final byte gna;
  private final short aSH;
  private final BitSet gaA = new BitSet();
  private final byte gnb;
  private final bZA gnc;
  private final int aSt;
  private final bZA gnd;
  private final aql gne;
  private final Map gnf;
  private cjT eqL = new cjT();
  private boolean gng;
  private byte aSL;
  private boolean aSW;
  private boolean aSO;
  private boolean gnh;
  private final boolean aSS;
  private boolean aST;
  private boolean aSU;
  private boolean aSV;
  private bZb gni;
  protected final short aSJ;

  protected bzj(doH paramdoH)
  {
    this.aw = paramdoH.getId();
    this.aSh = paramdoH.nV();
    this.eMm = paramdoH.Os();
    this.gmV = paramdoH.bHN();
    this.gmW = paramdoH.bsQ();
    this.aSl = paramdoH.uR();
    this.gmX = paramdoH.bHO();
    this.gmY = paramdoH.bHP();
    this.aSp = paramdoH.uV();
    this.aSs = paramdoH.uY();
    this.aSq = paramdoH.uW();
    this.aSr = paramdoH.uX();
    this.aSt = paramdoH.uZ();
    this.gnd = paramdoH.bHT();

    this.gne = new aql();
    Map localMap = paramdoH.cWi();
    if (localMap != null) {
      for (Map.Entry localEntry : localMap.entrySet()) {
        this.gne.a((eu)localEntry.getKey(), ((Li)localEntry.getValue()).VI(), ((Li)localEntry.getValue()).VJ());
      }
    }

    this.gnf = paramdoH.cWh();

    this.gne.A(paramdoH.vj(), paramdoH.vk());
    this.gne.B(paramdoH.vh(), paramdoH.cWe());
    this.gne.cI(paramdoH.uT());
    this.gna = paramdoH.bHV();
    this.gmZ = paramdoH.bHU();
    this.aSH = paramdoH.vn();
    this.gnc = paramdoH.bHW();
    this.gnb = paramdoH.bHX();

    this.aSL = paramdoH.vr();
    this.aSW = paramdoH.vC();

    this.aSO = paramdoH.vu();
    this.aSS = paramdoH.vy();

    this.gng = false;
    this.gaA.clear();
    this.gnh = paramdoH.bIc();
    this.aST = paramdoH.vz();
    this.aSU = paramdoH.vA();
    this.aSV = paramdoH.vB();
    this.gni = paramdoH.bId();
    this.aSJ = paramdoH.vp();
  }

  public void rH(int paramInt) {
    this.gaA.set(paramInt);
  }

  public boolean aI(int paramInt) {
    return this.gaA.get(paramInt);
  }

  public BitSet ob() {
    return this.gaA;
  }

  public int getId() {
    return this.aw;
  }

  public void a(dpI paramdpI) {
    this.eqL.add(paramdpI);
    if (paramdpI.cL(1L))
      this.gng = true;
  }

  public Iterator cc(short paramShort)
  {
    return cd(paramShort).iterator();
  }

  public ArrayList cd(short paramShort) {
    int i = this.eqL.size();
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++) {
      dpI localdpI = (dpI)this.eqL.get(j);
      if ((paramShort >= localdpI.zB()) && (paramShort <= localdpI.zC())) {
        localArrayList.add(localdpI);
      }
    }
    return localArrayList;
  }

  public boolean bHM() {
    return this.gng;
  }

  public int PY() {
    return this.aSh;
  }

  public int Os() {
    return this.eMm;
  }

  public byte bHN() {
    return this.gmV;
  }

  public byte bsQ() {
    return this.gmW;
  }

  public float uR() {
    return this.aSl;
  }

  public byte bHO() {
    return this.gmX;
  }

  public boolean a(bfE parambfE, Object paramObject1, Object paramObject2, Object paramObject3) {
    if (parambfE == null) {
      throw new IllegalArgumentException("SpellLevel null");
    }

    int i = parambfE.nU();
    if ((i < 0) || (i > this.aSh)) {
      throw new IllegalArgumentException("Level invalide : " + i + " demandé, max=" + this.aSh);
    }

    aql localaql = h(paramObject1, paramObject2, parambfE, paramObject3);
    return localaql.aCt();
  }

  public boolean bHP()
  {
    return this.gmY;
  }

  public boolean bHQ()
  {
    return this.aSs;
  }

  public boolean bHR() {
    return this.aSq;
  }

  public boolean bHS() {
    return this.aSr;
  }

  public int uZ() {
    return this.aSt;
  }

  public bZA bHT() {
    return this.gnd;
  }

  public byte bHU() {
    return this.gmZ;
  }

  public byte bHV() {
    return this.gna;
  }

  public bPk b(bfE parambfE, Object paramObject1, Object paramObject2, Object paramObject3) {
    if (parambfE == null) {
      throw new IllegalArgumentException("SpellLevel null");
    }

    int i = parambfE.nU();
    if ((i < 0) || (i > this.aSh)) {
      throw new IllegalArgumentException("Level invalide : " + parambfE + " demandé, max=" + this.aSh);
    }

    aql localaql = h(paramObject1, paramObject2, parambfE, paramObject3);
    bPk localbPk = new bPk();

    Map localMap = localaql.aCq();
    Set localSet = localMap.keySet();
    Iterator localIterator = localSet.iterator();
    while (localIterator.hasNext()) {
      eu localeu = (eu)localIterator.next();
      Li localLi = (Li)localMap.get(localeu);
      byte b = localLi.fJ(i);
      localbPk.m(localeu.bJ(), b);
    }

    return localbPk;
  }

  public byte rI(int paramInt) {
    if ((paramInt < 0) || (paramInt > this.aSh)) {
      throw new IllegalArgumentException("Level invalide : " + paramInt + " demandé, max=" + this.aSh);
    }
    aql localaql = this.gne;

    return localaql.b(eu.ayN, paramInt);
  }

  public byte c(bfE parambfE, Object paramObject1, Object paramObject2, Object paramObject3) {
    if (parambfE == null) {
      throw new IllegalArgumentException("SpellLevel null");
    }

    int i = parambfE.nU();
    if ((i < 0) || (i > this.aSh)) {
      throw new IllegalArgumentException("Level invalide : " + parambfE + " demandé, max=" + this.aSh);
    }

    aql localaql = h(paramObject1, paramObject2, parambfE, paramObject3);
    return localaql.b(eu.ayN, i);
  }

  private aql h(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    aql localaql = this.gne;
    if ((this.gnf != null) && (!this.gnf.isEmpty())) {
      Set localSet = this.gnf.keySet();
      for (bZA localbZA : localSet) {
        if (localbZA.i(paramObject1, paramObject2, paramObject3, paramObject4)) {
          localaql = (aql)this.gnf.get(localbZA);
        }
      }
    }
    return localaql;
  }

  public byte rJ(int paramInt) {
    if ((paramInt < 0) || (paramInt > this.aSh)) {
      throw new IllegalArgumentException("Level invalide : " + paramInt + " demandé, max=" + this.aSh);
    }
    return this.gne.b(eu.ayP, paramInt);
  }

  public byte d(bfE parambfE, Object paramObject1, Object paramObject2, Object paramObject3) {
    if (parambfE == null) {
      throw new IllegalArgumentException("SpellLevel null");
    }

    int i = parambfE.nU();
    if ((i < 0) || (i > this.aSh)) {
      throw new IllegalArgumentException("Level invalide : " + i + " demandé, max=" + this.aSh);
    }

    aql localaql = h(paramObject1, paramObject2, parambfE, paramObject3);
    return localaql.b(eu.ayP, i);
  }

  public byte rK(int paramInt) {
    if ((paramInt < 0) || (paramInt > this.aSh)) {
      throw new IllegalArgumentException("Level invalide : " + paramInt + " demandé, max=" + this.aSh);
    }
    return this.gne.b(eu.ayO, paramInt);
  }

  public byte e(bfE parambfE, Object paramObject1, Object paramObject2, Object paramObject3) {
    if (parambfE == null) {
      throw new IllegalArgumentException("SpellLevel null");
    }

    int i = parambfE.nU();
    if ((i < 0) || (i > this.aSh)) {
      throw new IllegalArgumentException("Level invalide : " + i + " demandé, max=" + this.aSh);
    }

    aql localaql = h(paramObject1, paramObject2, parambfE, paramObject3);
    return localaql.b(eu.ayO, i);
  }

  public int rL(int paramInt) {
    if ((paramInt < 0) || (paramInt > this.aSh)) {
      throw new IllegalArgumentException("Level invalide : " + paramInt + " demandé, max=" + this.aSh);
    }
    return this.gne.aCr().fJ(paramInt);
  }

  public int rM(int paramInt) {
    if ((paramInt < 0) || (paramInt > this.aSh)) {
      throw new IllegalArgumentException("Level invalide : " + paramInt + " demandé, max=" + this.aSh);
    }
    return this.gne.aCs().fJ(paramInt);
  }

  public int f(bfE parambfE, Object paramObject1, Object paramObject2, Object paramObject3) {
    if (parambfE == null) {
      throw new IllegalArgumentException("SpellLevel null");
    }

    int i = parambfE.nU();
    if ((i < 0) || (i > this.aSh)) {
      throw new IllegalArgumentException("Level invalide : " + i + " demandé, max=" + this.aSh);
    }

    aql localaql = h(paramObject1, paramObject2, parambfE, paramObject3);
    return localaql.aCs().fJ(i);
  }

  public short vn() {
    return this.aSH;
  }

  public bZA bHW() {
    return this.gnc;
  }

  public byte bHX() {
    return this.gnb;
  }

  public boolean bHY() {
    return this.aSL != dLh.lZH.bJ();
  }

  public boolean bHZ()
  {
    return this.aSL == dLh.lZJ.bJ();
  }

  public boolean vC() {
    return this.aSW;
  }

  public byte bIa() {
    return azO.dRM.bJ();
  }

  public boolean bIb() {
    return this.aSO;
  }

  public boolean bIc() {
    return this.gnh;
  }

  public boolean vy() {
    return this.aSS;
  }

  public boolean uV() {
    return this.aSp;
  }

  public boolean vz() {
    return this.aST;
  }

  public boolean vA() {
    return this.aSU;
  }

  public boolean vB() {
    return this.aSV;
  }

  public bZb bId() {
    return this.gni;
  }

  public short vp() {
    return this.aSJ;
  }
}