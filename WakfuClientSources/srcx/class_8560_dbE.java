import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class dbE extends boB
  implements caT
{
  private static final dms kTD = new dms();
  public static final boolean kTE = false;
  protected bxA kTF = kTD;
  public static final byte kTG = 0;
  public static final byte kTH = 1;
  public static final byte kTI = 2;
  public static final byte kTJ = 3;
  protected dzm ipA;
  private final aoL kTK = new aoL();
  private final pw kTL = new pw(this);
  private final cXG fGz = new cXG(this);
  private final bnF kTM = new bnF(this);
  protected byte kTN;
  protected aYV kTO;

  private boolean e(dhJ paramdhJ1, dhJ paramdhJ2)
  {
    return ad(paramdhJ1) != ad(paramdhJ2);
  }

  public boolean aDy() {
    return this.ipA == dzm.lFM;
  }

  public bxA LF() {
    return this.kTF;
  }

  public void ah(cYk paramcYk) {
  }

  public cYk cNk() {
    return null;
  }

  public dkv agb() {
    return null;
  }

  public int a(bqi parambqi) {
    return 0;
  }

  public int a(aDW paramaDW, bqi parambqi, boolean paramBoolean1, boolean paramBoolean2) {
    return 0;
  }

  public void z(dle paramdle) {
  }

  public void a(aAn paramaAn) {
    if (!(paramaAn instanceof aTa)) {
      return;
    }

    aTa localaTa = (aTa)paramaAn;
    boolean bool = localaTa.Vj();
    if (!bool) {
      return;
    }
    if (localaTa.Vl() != null)
      localaTa.Vl().adK();
  }

  public bxO agc()
  {
    return null;
  }

  public void a(bqi parambqi, int paramInt, byte paramByte)
  {
  }

  public boolean ex(long paramLong)
  {
    return this.kTK.N(paramLong);
  }

  public void jv(long paramLong) {
    this.kTK.remove(paramLong);
  }

  public dle ew(long paramLong)
  {
    return (dle)this.kTK.get(paramLong);
  }

  public Iterator bgV()
  {
    dle[] arrayOfdle = new dle[this.kTK.size()];
    this.kTK.d(arrayOfdle);
    return new tK(arrayOfdle, false);
  }

  public void A(dle paramdle) {
    this.kTK.put(paramdle.getId(), paramdle);
  }

  public int cNl() {
    return this.kTK.size();
  }

  public boolean cNm() {
    return this.eMK.dtp();
  }

  public boolean cNn() {
    return this.eMK.dtq();
  }

  protected dbE(int paramInt, dTw paramdTw, UG paramUG)
  {
    super(paramInt, paramdTw, paramUG);

    this.ipA = dzm.lFL;
  }

  public void a(dhJ paramdhJ, CG paramCG)
  {
    paramdhJ.c(paramCG);
  }

  public bIC aDG()
  {
    return this.eMH;
  }

  public dzm aEu()
  {
    return this.ipA;
  }

  public void start()
  {
    aDG().start();
    cNq();
  }

  private void cNo() {
    Collection localCollection = bgG();
    ArrayList localArrayList = new ArrayList();
    for (dhJ localdhJ : localCollection) {
      bhh localbhh = localdhJ.aJp();
      if (localbhh != null)
      {
        dpI localdpI = cMB.krT.yD(localbhh.afJ());
        if (localdpI != null)
        {
          localArrayList.add(localdpI);
        }
      }
    }
    aDG().bPN().a(localArrayList);
  }

  public boolean zB(int paramInt) {
    this.ipA = dzm.lFJ;
    jF(paramInt);
    return true;
  }

  public boolean cNp()
  {
    this.ipA = dzm.lFK;
    cNo();

    aDs();

    aDG().AT();

    aDG().Ic();

    return true;
  }

  public boolean ev(long paramLong)
  {
    dhJ localdhJ = eu(paramLong);
    if (localdhJ != null) {
      localdhJ.aeb();
    }

    return super.ev(paramLong);
  }

  public boolean ak(dhJ paramdhJ)
  {
    boolean bool = super.ak(paramdhJ);

    if (bool) {
      as(paramdhJ);
    }

    return bool;
  }

  public void x(dhJ paramdhJ)
  {
    if (!paramdhJ.c(dKm.lXl)) {
      aDG().gM(paramdhJ.getId());
    }

    super.x(paramdhJ);
  }

  public boolean am(dhJ paramdhJ)
  {
    boolean bool = super.am(paramdhJ);
    if (bool) {
      ar(paramdhJ);
    }
    return bool;
  }

  public baf a(dhJ paramdhJ, gA paramgA, bfE parambfE, cYk paramcYk) {
    return this.kTM.a(paramdhJ, paramgA, parambfE, paramcYk);
  }

  public baf a(dhJ paramdhJ, gA paramgA, cYk paramcYk, boolean paramBoolean) {
    return this.fGz.a(paramdhJ, paramgA, paramcYk, paramBoolean);
  }

  public baf a(dhJ paramdhJ, bfE parambfE, cYk paramcYk, boolean paramBoolean) {
    return this.kTL.a(paramdhJ, parambfE, paramcYk, paramBoolean);
  }

  public abstract adf LG();

  public void bgX()
  {
    super.bgX();

    this.ejP = new dMC(this, LG());
  }

  public void aA(dhJ paramdhJ)
  {
    ArrayList localArrayList = new ArrayList();
    for (Iterator localIterator = this.eMI.bbj().iterator(); localIterator.hasNext(); ) { localcjK = (cjK)localIterator.next();
      if ((localcjK.getType() == xj.bpj.xj()) && (localcjK.axG() == paramdhJ) && 
        (!((bmS)localcjK).bxu()))
        localArrayList.add(localcjK);
    }
    cjK localcjK;
    for (localIterator = localArrayList.iterator(); localIterator.hasNext(); ) { localcjK = (cjK)localIterator.next();
      this.eMI.h(localcjK); }
  }

  public void cNq()
  {
    aDG().AS();
    this.iM.j(true, true);
  }

  protected abstract void jF(int paramInt);

  public abstract void Mh();

  public void aDs() {
    aDG().AS();
    this.eMI.g(this.kTO);
  }

  public void aDE()
  {
    this.ipA = dzm.lFM;

    super.aDE();
  }

  public void aDx()
  {
    super.aDx();
    cNr();
  }

  public void g(dhJ paramdhJ)
  {
    paramdhJ.cQL();

    switch (arU.dBk[this.ipA.ordinal()]) {
    case 1:
    case 2:
      if (!paramdhJ.c(dKm.lXl)) {
        aDG().b(paramdhJ.getId(), false);
      }
      if (this.ipA == dzm.lFJ)
        aDG().AS(); break;
    case 3:
      if (!paramdhJ.c(dKm.lXl))
      {
        aDG().b(paramdhJ.getId(), true);
      }
      break;
    }

    super.g(paramdhJ);
  }

  public void az(dhJ paramdhJ)
  {
    bgJ localbgJ = paramdhJ.ayK();
    for (dhJ localdhJ : bgJ()) {
      if (localdhJ.ayK() != null) {
        localdhJ.ayK().a(paramdhJ, true, true);
      }
      if (localbgJ != null) {
        localbgJ.a(localdhJ, true, true);
      }

    }

    if (paramdhJ.cLK()) {
      paramdhJ.adK();
    }

    if (LC() != null)
      LC().h(paramdhJ);
  }

  public void e(dhJ paramdhJ)
  {
    if (paramdhJ.c(cfY.hBD)) {
      paramdhJ.d(eu.ayN).cpy();
    }

    if (paramdhJ.c(cfY.hBG)) {
      paramdhJ.d(eu.ayO).cpy();
    }

    paramdhJ.cQH().aTu();

    super.e(paramdhJ);
  }

  public void f(dhJ paramdhJ)
  {
    if (paramdhJ.c(cfY.hBD))
      paramdhJ.d(eu.ayN).cpy();
    else {
      paramdhJ.d(eu.ayN).cpx();
    }

    paramdhJ.d(eu.ayO).cpx();

    if (paramdhJ.c(cfY.hBG)) {
      paramdhJ.d(eu.ayO).cpy();
    }

    super.f(paramdhJ);
  }

  public void aDu()
  {
    this.iM.j(false, true);
  }

  public void a(dCP paramdCP)
  {
    Mh();
  }

  public void a(abw paramabw)
  {
    aDx();
  }

  public void a(aUF paramaUF)
  {
    Ml();
  }

  public void a(bfX parambfX)
  {
    fQ(parambfX.AD());
  }

  public void a(ciz paramciz)
  {
    fR(paramciz.AD());
  }

  public void hh(long paramLong)
  {
  }

  public void a(clw paramclw)
  {
    aVc localaVc = paramclw.cbs();
    paramclw.cbt();
    if (localaVc != null)
      localaVc.bkz();
  }

  public void a(oo paramoo)
  {
    aVc localaVc = paramoo.cbs();
    if (localaVc != null)
      localaVc.bkD();
  }

  public void a(blt paramblt)
  {
    paramblt.bww().h(eu(paramblt.bwx()));
  }

  public abstract Iterator aDw();

  public abstract void dc(long paramLong);

  public void cNr()
  {
    Iterator localIterator = aDw();
    ArrayList localArrayList = new ArrayList();
    while (localIterator.hasNext()) {
      localObject = (agY)localIterator.next();
      if (((agY)localObject).cql() == -1) {
        if (((agY)localObject).asD() <= 0L)
          localArrayList.add(Long.valueOf(((agY)localObject).getId()));
        else {
          ((agY)localObject).cK(((agY)localObject).asD() - 1L);
        }
      }
      else if (((agY)localObject).asD() <= 0L) {
        ((agY)localObject).cqp();
        ((agY)localObject).cK(((agY)localObject).cql() == -1 ? 3L : aMM.esg[localObject.cql()]);
      }
      else {
        ((agY)localObject).cK(((agY)localObject).asD() - 1L);
      }
    }

    for (Object localObject = localArrayList.iterator(); ((Iterator)localObject).hasNext(); ) { Long localLong = (Long)((Iterator)localObject).next();
      dc(localLong.longValue());
    }
  }

  public short g(short paramShort, byte paramByte)
  {
    Collection localCollection;
    if (paramByte != -1)
      localCollection = this.eMF.b(new cGB[] { cGB.cBA(), cGB.c(new cGB[] { cGB.eh(1), cGB.eh(2) }), cGB.ei(paramByte) });
    else {
      localCollection = this.eMF.b(new cGB[] { cGB.cBA(), cGB.c(new cGB[] { cGB.eh(1), cGB.eh(2) }) });
    }
    short s = 0;
    if (paramShort == -1) {
      return (short)localCollection.size();
    }
    for (dhJ localdhJ : localCollection) {
      if (localdhJ.uO() == paramShort) {
        s = (short)(s + 1);
      }
    }
    return s;
  }

  public aYV afA() {
    return this.kTO;
  }

  public void a(aYV paramaYV) {
    this.kTO = paramaYV;
  }

  public abstract void w(dhJ paramdhJ);

  public void a(int paramInt1, int paramInt2, dhJ paramdhJ, boolean paramBoolean) {
  }

  public void a(bqk parambqk, dhJ paramdhJ) {
    if (parambqk != null)
      b(parambqk.nY(), paramdhJ);
  }

  public void b(short paramShort, dhJ paramdhJ)
  {
    if (paramdhJ == null) {
      return;
    }

    byte b = paramdhJ.Fx();
    for (dhJ localdhJ : this.eMF.b(new cGB[] { cGB.cBA(), cGB.a(cGB.ei(b)) }))
      localdhJ.a(paramdhJ, paramShort);
  }

  public void f(doA paramdoA)
  {
    if ((paramdoA.bkc() != null) && (((dpI)paramdoA.bkc()).aMG() != 2))
      return;
    short s;
    dhJ localdhJ1;
    cBT localcBT2;
    if (paramdoA.wa() != null)
    {
      s = ((bqk)paramdoA.wa()).nY();
      int i = ((bqk)paramdoA.wa()).nZ();
      int j = ((bqk)paramdoA.wa()).oa();

      dle localdle1 = paramdoA.bke();
      if (((bqk)paramdoA.wa()).nS() == 3) {
        localdle1 = ((cjK)paramdoA.wa()).axG();
      }
      dle localdle2 = paramdoA.bkf();

      if ((localdle1 != null) && (localdle2 != null) && ((localdle1 instanceof dhJ)) && ((localdle2 instanceof dhJ)))
      {
        localdhJ1 = (dhJ)localdle1;
        int k = 0;
        if (e(localdhJ1, (dhJ)localdle2)) {
          if (j == 0) {
            k = 1;
          }
        }
        else if (i == 0) {
          k = 1;
        }

        cBT localcBT1 = (cBT)localdle2;
        localcBT2 = (cBT)localdle1;

        if (k == 0) {
          if (localcBT1 != localcBT2) {
            localcBT1.a(localcBT2, s);
          }
        }
        else
        {
          for (dhJ localdhJ2 : bgJ())
            if (e(localdhJ1, localdhJ2))
              localdhJ2.b(localcBT2, (short)(s * 10));
        }
      }
    }
  }

  protected abstract void l(cdO paramcdO);

  protected void bgQ()
  {
    if (this.kTO != null) {
      this.eMI.h(this.kTO);
      this.eMI.i(this.kTO);
      this.kTO.release();
      this.kTO = null;
    }
    super.bgQ();
  }
}