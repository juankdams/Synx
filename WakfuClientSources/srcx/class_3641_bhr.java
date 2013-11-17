import java.io.IOException;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bhr
{
  private static final Logger K = Logger.getLogger(bhr.class);
  private static final long fwh = 5000L;
  private final cSR fwi = new cSR();
  private final ArrayList fwj = new ArrayList();

  private long fwk = 5000L;
  private long fwl;
  private final Object fwm = new Object();

  private final ArrayList aBf = new ArrayList();

  private BE fwn = new BE(this, null);

  public bhr() {
    this.fwn.setName("SoundAmbEngine");
    this.fwn.start();
  }

  public ArrayList btN() {
    return this.fwj;
  }

  public long btO() {
    return this.fwk;
  }

  public void fA(long paramLong) {
    this.fwk = paramLong;

    for (int i = this.fwj.size() - 1; i >= 0; i--)
      ((ckd)this.fwj.get(i)).fA(this.fwk);
  }

  public void c(pz parampz)
  {
    this.aBf.add(parampz);
  }

  public void d(pz parampz) {
    this.aBf.remove(parampz);
  }

  public void load(String paramString) {
    try {
      aYQ localaYQ = aYQ.V(dtb.readFile(paramString));
      aHH localaHH = new aHH();
      localaHH.d(localaYQ);

      a(localaHH);
    } catch (IOException localIOException) {
      K.error("Problème à la lecture du fichier " + paramString);
    }
  }

  public void a(aHH paramaHH) {
    stop();

    this.fwj.clear();
    this.fwi.clear();

    ArrayList localArrayList1 = paramaHH.aTH();
    int i = 0; for (int j = localArrayList1.size(); i < j; i++) {
      this.fwj.add(c((ded)localArrayList1.get(i)));
    }

    ArrayList localArrayList2 = paramaHH.aTI();

    cSR localcSR = new cSR();

    int k = 0;
    Object localObject1;
    Object localObject2;
    for (int m = localArrayList2.size(); k < m; k++) {
      localObject1 = (czg)localArrayList2.get(k);
      localObject2 = d((czg)localObject1);
      if (localObject2 != null)
      {
        this.fwi.put(((bCd)localObject2).getId(), localObject2);
        localcSR.put(((bCd)localObject2).getId(), localObject1);
      }
    }

    dmn localdmn = this.fwi.yF();
    while (localdmn.hasNext()) {
      localdmn.fl();
      m = localdmn.zY();
      localObject1 = (bCd)localdmn.value();
      localObject2 = (czg)localcSR.get(m);
      Object localObject3;
      int n;
      int i1;
      if ((localObject1 instanceof dyB)) {
        localObject3 = (dyB)localObject1;
        n = 0;
        Object localObject4;
        for (i1 = ((czg)localObject2).inY.size(); n < i1; n++) {
          localObject4 = (bCd)this.fwi.get((int)((czg)localObject2).inY.get(n));
          ((dyB)localObject3).a((aWg)localObject4);
        }

        if (((czg)localObject2).inU != -1) {
          n = 0; for (i1 = this.fwj.size(); n < i1; n++) {
            localObject4 = (ckd)this.fwj.get(n);
            if (((ckd)localObject4).getId() == ((czg)localObject2).inU) {
              ((ckd)localObject4).a((dyB)localObject3);
              break;
            }
          }
        }
      } else {
        localObject3 = (arK)localObject1;
        n = 0; for (i1 = ((czg)localObject2).inY.size(); n < i1; n++) {
          ((arK)localObject3).dj(((czg)localObject2).inY.get(n));
        }
      }
    }

    this.fwi.clear();
  }

  private ckd c(ded paramded) {
    ckd localckd = new ckd();
    localckd.d(paramded.aw);
    localckd.setName(paramded.m_name);
    localckd.fA(this.fwk);
    return localckd;
  }

  private bCd d(czg paramczg) {
    bCd localbCd = e(paramczg);
    if (localbCd == null) {
      return null;
    }

    localbCd.d(paramczg.aw);
    localbCd.setName(paramczg.m_name);

    ArrayList localArrayList = paramczg.eVC;
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      localbCd.a((XF)localArrayList.get(i));
    }

    localbCd.ae(paramczg.iod >= 0 ? paramczg.iod / 100.0F : -1.0F);
    localbCd.ag(paramczg.ioe >= 0 ? paramczg.ioe / 100.0F : -1.0F);

    return localbCd;
  }

  private bCd e(czg paramczg)
  {
    if (paramczg.inX) {
      localObject = new dEP();
      ((dEP)localObject).a(wK.dq(paramczg.bJf));
      return localObject;
    }if (paramczg.inW) {
      localObject = new bvu();
      ((bvu)localObject).a(Oo.ao(paramczg.inZ));
      ((bvu)localObject).a(paramczg.gfv);
      ((bvu)localObject).fu(paramczg.gfu);
      return localObject;
    }if (paramczg.inV) {
      return new dyB();
    }
    Object localObject = null;
    cpT localcpT = cpT.dR(paramczg.ioa);
    if ((paramczg.iob == 0) && (localcpT.cpd() != null)) {
      localObject = new bvX();
      ((arK)localObject).a(localcpT.cpd());
    }
    else
    {
      cDK localcDK;
      if ((paramczg.iob == 1) && (localcpT.cpe() != null)) {
        localcDK = new cDK();
        localcDK.a(localcpT.cpe());
        localcDK.hW(true);
        localcDK.hz(paramczg.gfh);
        localObject = localcDK;
      } else if ((paramczg.iob == 2) && (localcpT.cpe() != null)) {
        localcDK = new cDK();
        localcDK.a(localcpT.cpe());
        localcDK.hz(paramczg.gfh);
        localObject = localcDK;
      }
    }
    if (localObject == null) {
      return null;
    }

    ((arK)localObject).jO(paramczg.dAt);
    ((arK)localObject).jH(paramczg.ioc);
    ((arK)localObject).jI(paramczg.dAv);
    ((arK)localObject).jJ(paramczg.dAw);
    ((arK)localObject).jK(paramczg.dAx);
    ((arK)localObject).jL(paramczg.dAy);
    ((arK)localObject).jN(paramczg.dAD);
    ((arK)localObject).jM(paramczg.dAC);
    ((arK)localObject).setInitialDelay(paramczg.dAQ);

    return localObject;
  }

  public void play()
  {
    synchronized (this.fwm) {
      this.fwl = System.currentTimeMillis();
    }
    this.fwn.av(true);
  }

  public void stop() {
    long l = System.currentTimeMillis();

    this.fwn.av(false);

    for (int i = this.fwj.size() - 1; i >= 0; i--) {
      ckd localckd = (ckd)this.fwj.get(i);
      localckd.stop(l);
    }
  }

  public void b(rP paramrP) {
    long l = System.currentTimeMillis();

    for (int i = this.aBf.size() - 1; i >= 0; i--) {
      ((pz)this.aBf.get(i)).b(paramrP);
    }
    for (i = this.fwj.size() - 1; i >= 0; i--) {
      ckd localckd = (ckd)this.fwj.get(i);
      localckd.a(paramrP, l);
    }
  }

  public void a(long paramLong, cbI paramcbI, wK paramwK) {
    long l = System.currentTimeMillis();

    for (int i = this.fwj.size() - 1; i >= 0; i--) {
      ckd localckd = (ckd)this.fwj.get(i);
      localckd.a(paramLong, paramcbI, paramwK, l);
    }
  }

  public void eQ(long paramLong) {
    long l = System.currentTimeMillis();

    for (int i = this.fwj.size() - 1; i >= 0; i--) {
      ckd localckd = (ckd)this.fwj.get(i);
      localckd.E(paramLong, l);
    }
  }

  private void K(long paramLong)
  {
    synchronized (this.fwm) {
      if (paramLong < this.fwl) {
        return;
      }

      int i = 0; for (int j = this.aBf.size(); i < j; i++) {
        ((pz)this.aBf.get(i)).U(paramLong);
      }

      for (i = this.fwj.size() - 1; i >= 0; i--) {
        ckd localckd = (ckd)this.fwj.get(i);
        localckd.hw(this.fwl);
      }

      this.fwl += this.fwk;
    }
  }
}