import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.log4j.Logger;

public class bgJ extends dDN
  implements dUd
{
  private static boolean fux = true;

  private static final CE fuy = new nO();

  private long fuz = 10L;
  private final dle fuA;
  private final dxa fuB = new dxa();
  private final dxa fuC = new dxa();

  private final ArrayList fuD = new ArrayList();

  public bgJ(dle paramdle)
  {
    this.fuA = paramdle;
  }

  protected void btl() {
    this.lMb = new cMV(this);
  }

  public boolean a(cWG paramcWG) {
    if (!(paramcWG instanceof dKQ))
      return false;
    long l = this.fuB.gd(((dKQ)paramcWG).czk());
    if (l != 0L)
    {
      k(l, true);
    }
    return true;
  }

  public void clear() {
    this.fuB.clear();
    this.fuC.clear();
    super.clear();
  }

  public void bbk() {
    this.fuB.a(fuy);
    this.fuB.clear();

    this.fuC.clear();
    super.bbk();
  }

  public long getId() {
    return this.fuz;
  }

  public void a(long paramLong) {
    this.fuz = paramLong;
  }

  public dle axG() {
    return this.fuA;
  }

  public long E(aVc paramaVc) {
    doA localdoA = (doA)paramaVc;
    if (this.fuC.containsKey(localdoA.oj())) {
      return this.fuC.gd(localdoA.oj()) - System.currentTimeMillis();
    }
    if ((localdoA instanceof bPD)) {
      bJC localbJC = ((bPD)localdoA).bWk();
      if (!localbJC.bRc())
        K.error("Le temps de fin pour un etat non infini n'est pas contenu dans la map des effets en cours : effect.uid=" + localdoA.oj() + ", effect.id=" + localdoA.getId() + ", stateId=" + localbJC.bQW());
    }
    else {
      K.error("Le temps de fin n'est pas contenu dans la map des effets en cours : effect.uid=" + localdoA.oj() + ", effect.id=" + localdoA.getId());
    }
    return 0L;
  }

  public void F(aVc paramaVc) {
    if (paramaVc == null)
      return;
    doA localdoA = (doA)paramaVc;
    if ((localdoA.aIq() == null) || (!localdoA.bkM())) {
      return;
    }
    if ((!localdoA.isInfinite()) && (localdoA.bWn())) {
      int i = localdoA.bWm();
      long l = cAo.cxf().a(this, i, 0, 1);
      super.F(localdoA);
      this.fuB.J(l, localdoA.oj());
      this.fuC.J(localdoA.oj(), System.currentTimeMillis() + i);
    } else {
      super.F(localdoA);
    }
  }

  public void btm() {
    bbk();
  }

  public byte[] eE(boolean paramBoolean)
  {
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();

    int i = 2;
    short s = 0;
    Object[] arrayOfObject = this.kCz.getValues();
    bKR localbKR = new bKR();
    aVc localaVc;
    doA localdoA;
    int m;
    Object localObject2;
    for (localaVc : arrayOfObject) {
      localdoA = (doA)localaVc;
      m = localdoA.getId() == bsj.fSj.getId() ? 1 : 0;
      if (!a(paramBoolean, localdoA)) {
        if (m != 0) {
          localbKR.add(((bPD)localdoA).bWk().bQW());
        }
      }
      else if (m != 0)
      {
        localObject2 = localdoA.j();
        localHashMap2.put((bPD)localdoA, localObject2);
        s = (short)(s + 1);
        i += 6 + localObject2.length + 4;
      }
    }
    for (localaVc : arrayOfObject) {
      localdoA = (doA)localaVc;
      m = localdoA.getId() == bsj.fSj.getId() ? 1 : 0;
      if (m == 0)
      {
        if (a(paramBoolean, localdoA))
        {
          localObject2 = (bqk)localdoA.wa();
          if (!a(localbKR, (bqk)localObject2))
          {
            byte[] arrayOfByte2 = localdoA.j();
            localHashMap1.put(localdoA, arrayOfByte2);
            s = (short)(s + 1);
            i += 6 + arrayOfByte2.length + 4;
          }
        }
      }
    }
    if ((i < 0) || (i > 32767)) {
      K.error("Taille du REM serialise incoherente : " + i + " nombre d'effets dans le REM : " + this.kCz.size() + " serialise pour l'ia : " + paramBoolean);
      if (fux) {
        fux = false;
        for (localaVc : arrayOfObject) {
          localdoA = (doA)localaVc;
          if (a(paramBoolean, localdoA))
          {
            byte[] arrayOfByte1 = localdoA.j();
            K.error("Effet a serialiser : " + localdoA.bkC() + " Taille de l'effet " + arrayOfByte1.length);
          }
        }
      }
      ??? = ByteBuffer.allocate(2);
      ((ByteBuffer)???).putShort((short)0);
      return ((ByteBuffer)???).array();
    }

    ??? = ByteBuffer.allocate(i);

    ((ByteBuffer)???).putShort(s);

    for (Iterator localIterator = localHashMap2.entrySet().iterator(); localIterator.hasNext(); ) { localEntry = (Map.Entry)localIterator.next();
      ((ByteBuffer)???).putInt(((bPD)localEntry.getKey()).getId());
      ((ByteBuffer)???).putShort((short)((byte[])localEntry.getValue()).length);
      ((ByteBuffer)???).put((byte[])localEntry.getValue());
      if (this.fuC.containsKey(((bPD)localEntry.getKey()).oj()))
        ((ByteBuffer)???).putInt((int)Math.max(0L, this.fuC.gd(((bPD)localEntry.getKey()).oj()) - System.currentTimeMillis()));
      else
        ((ByteBuffer)???).putInt(0);
    }
    Map.Entry localEntry;
    for (localIterator = localHashMap1.entrySet().iterator(); localIterator.hasNext(); ) { localEntry = (Map.Entry)localIterator.next();
      localaVc = (aVc)localEntry.getKey();
      ((ByteBuffer)???).putInt(localaVc.getId());
      ((ByteBuffer)???).putShort((short)((byte[])localEntry.getValue()).length);
      ((ByteBuffer)???).put((byte[])localEntry.getValue());
      if (this.fuC.containsKey(localaVc.oj()))
        ((ByteBuffer)???).putInt((int)Math.max(0L, this.fuC.gd(localaVc.oj()) - System.currentTimeMillis()));
      else {
        ((ByteBuffer)???).putInt(0);
      }
    }
    return ((ByteBuffer)???).array();
  }

  private boolean a(bKR parambKR, bqk parambqk) {
    return (parambqk != null) && (parambqk.nS() == 1) && (parambKR.N(((bJC)parambqk).bQW()));
  }

  private boolean a(boolean paramBoolean, doA paramdoA)
  {
    if (paramBoolean) {
      return (!(paramdoA instanceof ccB)) && (!paramdoA.aug());
    }
    return (!paramdoA.cVP()) && (!paramdoA.cVS()) && (!paramdoA.cVR()) && (!paramdoA.cVW()) && (!paramdoA.cVT()) && (!paramdoA.yP()) && (!paramdoA.cVU()) && (!paramdoA.cVV());
  }

  public void a(byte[] paramArrayOfByte, cOE paramcOE)
  {
    clear();

    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    int i = localByteBuffer.getShort();
    for (int j = 0; j < i; j = (short)(j + 1)) {
      uY localuY = (uY)bsj.bAv().kD(localByteBuffer.getInt());
      if (localuY == null) {
        K.error("Impossible d'instancier un runningEffect ");
      }

      byte[] arrayOfByte = new byte[localByteBuffer.getShort()];
      localByteBuffer.get(arrayOfByte);
      if (localuY != null)
      {
        if (paramcOE == null)
          K.error("contexte null au moment de désérialiser un effet");
        doA localdoA = (doA)localuY.a(paramcOE, null);
        try {
          localdoA.q(arrayOfByte);
        } catch (Exception localException) {
          K.error("Exception levee a la deserialisation d'un effet " + localuY.getId(), localException);
          btn();
          break;
        }
        int k = localByteBuffer.getInt();
        if (k != 0) {
          localdoA.AU(k);
        }
        F(localdoA);
      }
    }
  }

  private void btn() { this.kCz.s(new nQ(this)); }


  public boolean a(csP paramcsP)
  {
    return a(paramcsP, true, false);
  }

  public boolean a(csP paramcsP, boolean paramBoolean1, boolean paramBoolean2) {
    paramcsP.icD.clear();
    for (cHu localcHu = this.kCz.aBa(); localcHu.hasNext(); ) {
      localcHu.fl();
      aVc localaVc = (aVc)localcHu.value();

      if ((localaVc instanceof bPD))
      {
        bJC localbJC = ((bPD)localaVc).bWk();
        if (((!paramBoolean1) || (localbJC.NY())) && (
          (!paramBoolean2) || (!localbJC.NY())))
        {
          int i = 1;
          int j = 0;

          if (this.fuC.containsKey(localaVc.oj())) {
            j = (int)(this.fuC.gd(localaVc.oj()) - System.currentTimeMillis());
            if (j < 0)
            {
              if ((localbJC.bQV() != -1) && (localbJC.bdm() != -1)) {
                i = 0;
              }
            }

          }
          else if ((localbJC.bQV() != -1) && (localbJC.bdm() != -1)) {
            i = 0;
          }

          if (i != 0) {
            Ut localUt = new Ut();
            localUt.cxL = localaVc.oj();
            localUt.cxM = localbJC.bQW();
            localUt.bUp = localbJC.nU();
            localUt.cxN = j;
            paramcsP.icD.add(localUt);
          }
        }
      }
    }
    return true;
  }

  public boolean a(csP paramcsP, cOE paramcOE, dle paramdle)
  {
    for (Ut localUt : paramcsP.icD) {
      uY localuY = (uY)bsj.bAv().kD(bsj.fSj.getId());
      if (localuY == null) {
        K.error("On desérialise un effet qui n'existe pas : RUNNING_STATE");
        return false;
      }

      bPD localbPD = bPD.a(paramcOE, paramdle, null, bJC.I(localUt.cxM, localUt.bUp));
      if (localbPD == null) {
        K.error("Effect not unserialized because of an unknown state : " + localUt.cxM);
      }
      else {
        bJC localbJC = localbPD.bWk();

        if ((localUt.cxN <= 0) && (localbJC.bQV() != -1) && (localbJC.bdm() != -1)) {
          localbPD.release();
        } else {
          localbPD.aH(localUt.cxL);
          localbPD.AU(localUt.cxN);
          localbPD.j(paramdle);
          bPD.bka();
          localbPD.bkz();
          paramdle.atO().F(localbPD);
          localbPD.oT();
        }
      }
    }
    return true;
  }

  public void a(dle paramdle, cOE paramcOE)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = iterator();
    while (localIterator.hasNext()) {
      localObject = (doA)localIterator.next();
      if (!((doA)localObject).cVL()) {
        ((doA)localObject).b(paramcOE);
        localArrayList.add(localObject);
      }
    }

    for (Object localObject = localArrayList.iterator(); ((Iterator)localObject).hasNext(); ) { doA localdoA = (doA)((Iterator)localObject).next();
      if (localdoA.bWm() != 0) {
        localdoA.j(paramdle);

        F(localdoA);
        doA.bka();
        localdoA.c(null, false);
      }
    }
  }

  public bmO b(dle paramdle, int paramInt)
  {
    return bmO.a(this, this.kCz.aBa(), paramdle, paramInt, true);
  }

  public boolean G(aVc paramaVc) {
    return k(paramaVc.oj(), true);
  }

  public boolean d(aVc paramaVc, boolean paramBoolean) {
    return k(paramaVc.oj(), paramBoolean);
  }

  public boolean k(long paramLong, boolean paramBoolean) {
    aVc localaVc = (aVc)this.kCz.get(paramLong);
    if ((localaVc != null) && (localaVc.getId() == bsj.fSj.getId()))
    {
      this.fuD.add((bPD)localaVc);
      eF(paramBoolean);
      return true;
    }

    return super.kx(paramLong);
  }

  private void eF(boolean paramBoolean) {
    int i = 0; for (int j = this.fuD.size(); i < j; i++) {
      b((bPD)this.fuD.get(i));
    }

    if (paramBoolean) {
      i = 0; for (j = this.fuD.size(); i < j; i++) {
        kx(((bPD)this.fuD.get(i)).oj());
      }
    }

    this.fuD.clear();
  }

  private void b(bPD parambPD) {
    bJC localbJC = parambPD.bWk();
    if (localbJC == null) {
      K.warn("On veut retirer les effets d'un état inconnu");
      return;
    }
    dgc localdgc = g(localbJC);
    ArrayList localArrayList = new ArrayList();
    while (localdgc.hasNext()) {
      localArrayList.add(localdgc.bxt());
    }
    localdgc.release();

    for (aVc localaVc : localArrayList)
      try {
        doA localdoA = (doA)localaVc;

        if (localdoA.getId() != bsj.fSj.getId()) {
          if (parambPD.cVE())
            localdoA.jI(true);
          this.kCz.remove(localdoA.oj());
          H(localdoA);
        }
      } catch (Exception localException) {
        K.error("Exception lors du retrait des effets lies a l'etat " + localbJC.bQW(), localException);
      }
  }

  public void o(dle paramdle)
  {
    a(paramdle, false);
  }

  public void a(dle paramdle, boolean paramBoolean)
  {
    a(paramdle, paramBoolean, false);
  }

  public void a(dle paramdle, boolean paramBoolean1, boolean paramBoolean2) {
    dAt localdAt = F(paramdle);
    while (localdAt.hasNext()) {
      doA localdoA = (doA)localdAt.bxt();
      if ((localdoA.getId() != bsj.fUT.getId()) && (
        (!paramBoolean2) || (!localdoA.a(PY.coE))))
      {
        if ((paramBoolean2) && ((localdoA instanceof bPD))) {
          bJC localbJC = ((bPD)localdoA).bWk();
          if ((localbJC != null) && (localbJC.bRd())) {
            localdoA.jI(true);
            this.fuD.add((bPD)localdoA);
          }

        }
        else if ((localdoA.getId() != bsj.fSj.getId()) && (d(localdoA)) && (
          (!paramBoolean1) || ((localdoA.bkc() != null) && (((dpI)localdoA.bkc()).aMG() == 2)))) {
          localdAt.remove();
        }
      }
    }
    localdAt.release();
    eF(true);
  }

  public void p(dle paramdle) {
    dAt localdAt = F(paramdle);
    a(localdAt, true);
    localdAt.release();
    eF(true);
  }

  public void c(Ce paramCe) {
    a(paramCe, false);
  }

  public void a(Ce paramCe, boolean paramBoolean) {
    dgc localdgc = g(paramCe);
    c(localdgc);
    localdgc.release();
    eF(paramBoolean);
  }

  public void a(gA paramgA, boolean paramBoolean)
  {
    cMm localcMm = cMm.a(this, this.kCz.aBa(), paramgA);
    c(localcMm);
    localcMm.release();
    eF(paramBoolean);
  }

  private void c(Iterator paramIterator) {
    a(paramIterator, false);
  }

  private void a(Iterator paramIterator, boolean paramBoolean) {
    ArrayList localArrayList = new ArrayList();
    while (paramIterator.hasNext()) {
      localArrayList.add(paramIterator.next());
    }
    a(localArrayList, paramBoolean);
  }

  private void a(Collection paramCollection, boolean paramBoolean) {
    for (aVc localaVc : paramCollection) {
      doA localdoA = (doA)localaVc;
      if (paramBoolean) {
        localdoA.jI(true);
      }

      if (localdoA.getId() == bsj.fSj.getId()) {
        this.fuD.add((bPD)localdoA);
      } else if (d(localdoA)) {
        this.kCz.remove(localdoA.oj());
        H(localdoA);
      }
    }
  }

  public void a(Ce paramCe, boolean paramBoolean1, boolean paramBoolean2) {
    dgc localdgc = g(paramCe);
    while (localdgc.hasNext()) {
      doA localdoA = (doA)localdgc.bxt();

      if (localdoA.getId() == bsj.fSj.getId()) {
        localdoA.jI(paramBoolean2);
        this.fuD.add((bPD)localdoA);
      } else if (d(localdoA)) {
        localdoA.jI(paramBoolean2);
        localdgc.remove();
      }
    }
    localdgc.release();
    eF(paramBoolean1);
  }

  private boolean d(doA paramdoA) {
    return (paramdoA.wa() == null) || (((bqk)paramdoA.wa()).nS() != 1);
  }

  public void a(dle paramdle, int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    bmO localbmO = bmO.a(this, this.kCz.aBa(), paramdle, paramInt, paramBoolean2);
    while (localbmO.hasNext()) {
      doA localdoA = (doA)localbmO.bxt();
      localdoA.jI(paramBoolean1);

      if ((paramBoolean2) && (localdoA.getId() == bsj.fSj.getId()))
        this.fuD.add((bPD)localdoA);
      else if (d(localdoA)) {
        localbmO.remove();
      }
    }
    localbmO.release();
    eF(paramBoolean2);
  }

  public void px(int paramInt) {
    a(paramInt, false, false);
  }

  public void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    ArrayList localArrayList = new ArrayList();
    for (Object localObject1 = this.kCz.aBa(); ((cHu)localObject1).hasNext(); ) {
      ((cHu)localObject1).fl();
      localObject2 = (aVc)((cHu)localObject1).value();
      if ((((aVc)localObject2).wa() != null) && (((aVc)localObject2).wa().nS() == paramInt) && 
        (!localArrayList.contains(((aVc)localObject2).wa())))
        localArrayList.add(((aVc)localObject2).wa());
    }
    Object localObject2;
    for (localObject1 = localArrayList.iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (Ce)((Iterator)localObject1).next();
      if (paramBoolean2)
        a((Ce)localObject2, paramBoolean1, paramBoolean2);
      else
        a((Ce)localObject2, paramBoolean1); }
  }

  public void a(cfY paramcfY)
  {
    ArrayList localArrayList = new ArrayList();
    for (Object localObject1 = this.kCz.aBa(); ((cHu)localObject1).hasNext(); ) {
      ((cHu)localObject1).fl();
      localObject2 = (aVc)((cHu)localObject1).value();
      if ((localObject2 instanceof cNp)) {
        cNp localcNp = (cNp)localObject2;
        if ((localcNp.cFO() == paramcfY) && 
          (!localArrayList.contains(localcNp.wa())))
          localArrayList.add(localcNp.wa());
      }
    }
    Object localObject2;
    for (localObject1 = localArrayList.iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (Ce)((Iterator)localObject1).next();
      a((Ce)localObject2, true);
    }
  }

  public int py(int paramInt)
  {
    int i = 0;
    for (cHu localcHu = this.kCz.aBa(); localcHu.hasNext(); ) {
      localcHu.fl();
      aVc localaVc = (aVc)localcHu.value();
      if ((localaVc instanceof bPD)) {
        bPD localbPD = (bPD)localaVc;
        bJC localbJC = localbPD.bWk();
        if ((localbJC != null) && (localbJC.bQW() == paramInt)) {
          this.fuD.add(localbPD);
          i++;
        }
      }
    }
    eF(true);
    return i;
  }

  public List bto()
  {
    ArrayList localArrayList = new ArrayList();
    for (cHu localcHu = this.kCz.aBa(); localcHu.hasNext(); ) {
      localcHu.fl();
      aVc localaVc = (aVc)localcHu.value();
      if (localaVc.getId() == bsj.fSj.getId()) {
        localArrayList.add((bPD)localaVc);
      }
    }
    return localArrayList;
  }

  public bPD pz(int paramInt) {
    for (cHu localcHu = this.kCz.aBa(); localcHu.hasNext(); ) {
      localcHu.fl();
      aVc localaVc = (aVc)localcHu.value();
      if ((localaVc.getId() == bsj.fSj.getId()) && (((bPD)localaVc).bWk().bQW() == paramInt)) {
        return (bPD)localaVc;
      }
    }
    return null;
  }

  public aVc b(PY paramPY)
  {
    for (aVc localaVc : this) {
      if (((doA)localaVc).a(paramPY)) {
        return localaVc;
      }
    }
    return null;
  }

  public void H(aVc paramaVc) {
    super.H(paramaVc);
    long l1 = paramaVc.oj();
    aSp localaSp = this.fuB.dco();
    while (localaSp.hasNext()) {
      localaSp.fl();
      long l2 = localaSp.bic();
      if (localaSp.bid() == l1) {
        cAo.cxf().ia(l2);
        localaSp.remove();
      }
    }
    this.fuC.gc(l1);
  }
}