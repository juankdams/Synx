import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class bmD
{
  private static final Logger K = Logger.getLogger(bmD.class);
  private static final boolean fFc = false;
  private final cew aEM;
  private dRp fFd = null;
  private dVo fFe;
  private dud fFf;
  private dlR fFg;
  private dQv fFh;
  private asg fFi;
  private zG fFj;
  private dwv fFk;
  private To fFl;
  private diN fFm;
  private bQA fFn;
  private bKS fFo;
  private final List fFp = new ArrayList();
  private String fFq;

  public bmD(cew paramcew)
  {
    if ((!bB) && (paramcew == null)) throw new AssertionError();
    this.aEM = paramcew;
  }

  public dCf bxl() {
    return this.fFf == null ? null : (dCf)this.fFf.ayx();
  }

  public cew aeL() {
    return this.aEM;
  }

  public void b(doA paramdoA, boolean paramBoolean)
  {
    Iterator localIterator;
    if ((paramdoA instanceof bPD)) {
      localIterator = ((bPD)paramdoA).bWk().bQZ();
    } else {
      if (paramdoA.bkc() == null) {
        return;
      }
      localIterator = ((dpI)paramdoA.bkc()).bey();
    }
    a(paramdoA, paramBoolean, localIterator);
  }

  public void c(doA paramdoA, boolean paramBoolean)
  {
    dpI localdpI = (dpI)paramdoA.bkc();

    if (paramdoA.getId() == bsj.fSj.getId()) {
      localObject = ((bPD)paramdoA).bWk().bQZ();
      b(paramdoA, paramBoolean, (Iterator)localObject);
      return;
    }
    if (localdpI == null) {
      return;
    }

    Object localObject = localdpI.beB();
    if (localObject == null) {
      return;
    }

    int i = 0; for (int j = ((List)localObject).size(); i < j; i++) {
      cHP localcHP = (cHP)((List)localObject).get(i);
      if (localdpI.f(localcHP)) {
        a(paramdoA, paramBoolean, localcHP);
      }
      if (localdpI.g(localcHP))
        b(paramdoA, paramBoolean, localcHP);
    }
  }

  public void d(doA paramdoA, boolean paramBoolean)
  {
    if ((paramdoA instanceof bPD)) {
      return;
    }

    dpI localdpI = (dpI)paramdoA.bkc();
    if (localdpI == null) {
      return;
    }

    List localList = localdpI.beB();
    if (localList == null) {
      return;
    }

    int i = 0; for (int j = localList.size(); i < j; i++) {
      cHP localcHP = (cHP)localList.get(i);
      if (localdpI.i(localcHP)) {
        a(paramdoA, paramBoolean, localcHP);
      }
      if (localdpI.j(localcHP))
        b(paramdoA, paramBoolean, localcHP);
    }
  }

  private void a(bxY parambxY)
  {
    cZf localcZf = new cZf();
    localcZf.am(parambxY.bFq(), parambxY.bFp());
    localcZf.e(new bKZ(parambxY.bFm(), parambxY.bFn(), parambxY.bFo()));
    localcZf.setDirection(parambxY.getDirection());
    dSz localdSz = WakfuClientInstance.awy().Dg();
    localcZf.a(localdSz.cKV());

    Pb.aaU().a(localcZf);
  }

  private void a(aAu paramaAu)
  {
    aWc.blo().eP(paramaAu.alu());
  }

  private void a(doA paramdoA, cqF paramcqF)
  {
    if (this.fFl == null) {
      this.fFl = new To();
    }
    this.fFl.b(this.aEM, new bIx(paramdoA, paramcqF.cpI(), paramcqF.aBd(), paramcqF.cCe()));
  }

  private void b(doA paramdoA, cqF paramcqF) {
    if (this.fFl == null) {
      return;
    }
    this.fFl.c(this.aEM, new bIx(paramdoA, paramcqF.cpI(), paramcqF.aBd(), paramcqF.cCe()));
    if (this.fFl.isEmpty())
      this.fFl = null;
  }

  private void a(String paramString, doA paramdoA)
  {
    if (this.fFd == null) {
      this.fFd = new dRp();
    }
    this.fFd.b(this.aEM, new bcn(paramdoA, paramString));
    this.aEM.cgZ().f(this.aEM);
    this.fFq = this.aEM.atp();
    this.aEM.es("AnimStatique");
    this.aEM.c(new cDa(this));
  }

  private void b(String paramString, doA paramdoA)
  {
    if (this.fFd == null) {
      return;
    }
    bcn localbcn1 = (bcn)this.fFd.ayx();
    bcn localbcn2 = (bcn)this.fFd.b(new bcn(paramdoA, paramString));
    this.aEM.es(this.fFq);

    if (this.aEM.J("AnimTransEffect-Fin")) {
      this.aEM.eq("AnimTransEffect-Fin");
      this.aEM.a(new cDc(this, localbcn1, localbcn2));
    }
    else
    {
      this.aEM.eq(this.fFq);
      this.fFd.a(localbcn1, localbcn2, this.aEM);

      if (this.fFd.isEmpty())
        this.fFd = null;
    }
  }

  public void bxm()
  {
    this.fFq = null;
  }

  private void a(float[] paramArrayOfFloat, String paramString, doA paramdoA)
  {
    int i = Anm.B(paramString);
    if (this.fFe == null) {
      this.fFe = new dVo();
    }
    this.fFe.b(this.aEM, new bYg(paramdoA, paramArrayOfFloat, i));
  }

  private void b(float[] paramArrayOfFloat, String paramString, doA paramdoA) {
    if (this.fFe == null) {
      return;
    }
    int i = Anm.B(paramString);
    this.fFe.c(this.aEM, new bYg(paramdoA, paramArrayOfFloat, i));
    if (this.fFe.isEmpty())
      this.fFe = null;
  }

  private void a(String paramString1, String paramString2, doA paramdoA)
  {
  }

  private void e(doA paramdoA)
  {
  }

  private void a(String paramString, int paramInt, String[] paramArrayOfString, doA paramdoA)
  {
    if (this.fFf == null) {
      this.fFf = new dud();
    }
    this.fFf.b(this.aEM, new dCf(paramdoA, paramString, paramInt, paramArrayOfString));
  }

  private void b(String paramString, int paramInt, String[] paramArrayOfString, doA paramdoA) {
    if (this.fFf == null) {
      return;
    }
    this.fFf.c(this.aEM, new dCf(paramdoA, paramString, paramInt, paramArrayOfString));
    if (this.fFf.isEmpty())
      this.fFf = null;
  }

  private void a(boolean paramBoolean, String[] paramArrayOfString, doA paramdoA)
  {
    if (this.fFg == null) {
      this.fFg = new dlR();
    }
    this.fFg.b(this.aEM, new cdj((dpI)paramdoA.bkc(), paramBoolean, paramArrayOfString));
  }

  private void b(boolean paramBoolean, String[] paramArrayOfString, doA paramdoA) {
    if (this.fFg == null) {
      return;
    }
    this.fFg.c(this.aEM, new cdj((dpI)paramdoA.bkc(), paramBoolean, paramArrayOfString));
    if (this.fFg.isEmpty())
      this.fFg = null;
  }

  private void c(String paramString, doA paramdoA)
  {
    if (this.fFh == null) {
      this.fFh = new dQv();
    }
    this.fFh.b(this.aEM, new acd(paramdoA, paramString));
  }

  private void d(String paramString, doA paramdoA) {
    if (this.fFh == null) {
      return;
    }
    this.fFh.c(this.aEM, new acd(paramdoA, paramString));
    if (this.fFh.isEmpty())
      this.fFh = null;
  }

  private void e(String paramString, doA paramdoA)
  {
    if (this.fFi == null) {
      this.fFi = new asg();
    }
    this.fFi.b(this.aEM, new ccd(paramdoA, paramString));
  }

  private void f(String paramString, doA paramdoA) {
    if (this.fFi == null) {
      return;
    }
    this.fFi.c(this.aEM, new ccd(paramdoA, paramString));
    if (this.fFi.isEmpty())
      this.fFi = null;
  }

  private void g(String paramString, doA paramdoA)
  {
    if (this.fFm == null) {
      this.fFm = new diN();
    }
    this.fFm.b(this.aEM, new dQm(paramdoA, paramString));
  }

  private void h(String paramString, doA paramdoA) {
    if (this.fFm == null) {
      return;
    }
    this.fFm.c(this.aEM, new dQm(paramdoA, paramString));
    if (this.fFm.isEmpty())
      this.fFm = null;
  }

  private void a(int paramInt, boolean paramBoolean1, bBr parambBr, boolean paramBoolean2, cYk paramcYk, doA paramdoA)
  {
    if (this.fFk == null) {
      this.fFk = new dwv();
    }
    this.fFk.a(this.aEM, (dpI)paramdoA.bkc(), paramInt, parambBr, paramcYk, paramBoolean1, paramBoolean2);
  }

  private void b(int paramInt, boolean paramBoolean1, bBr parambBr, boolean paramBoolean2, cYk paramcYk, doA paramdoA) {
    if (this.fFk == null) {
      return;
    }
    this.fFk.b(this.aEM, (dpI)paramdoA.bkc(), paramInt, parambBr, paramcYk, paramBoolean1, paramBoolean2);
    if (this.fFk.isEmpty())
      this.fFk = null;
  }

  private void eT(boolean paramBoolean)
  {
    if (this.fFk == null) {
      return;
    }
    this.fFk.eT(paramBoolean);
  }

  public void bxn() {
    eT(true);
  }

  public void bxo() {
    eT(false);
  }

  private void a(doA paramdoA, String paramString1, String paramString2, String paramString3)
  {
    dkA.b(paramdoA, paramString1, paramString2, paramString3);
  }

  private void e(String paramString1, String paramString2, String paramString3) {
    dkA.m(paramString1, paramString2, paramString3);
  }

  private void a(doA paramdoA, float paramFloat)
  {
    this.aEM.bZ(paramFloat);
  }

  private void b(doA paramdoA, float paramFloat) {
    this.aEM.ca(paramFloat);
  }

  private void b(String paramString1, String paramString2, doA paramdoA)
  {
    if (this.fFj == null) {
      this.fFj = new zG();
    }
    this.fFj.b(this.aEM, new bp(paramdoA, paramString1, paramString2));
  }

  private void c(String paramString1, String paramString2, doA paramdoA)
  {
    if (this.fFj == null) {
      return;
    }
    this.fFj.c(this.aEM, new bp(paramdoA, paramString1, paramString2));
    if (this.fFj.isEmpty())
      this.fFj = null;
  }

  private void a(doA paramdoA, String paramString1, String paramString2)
  {
    if (this.fFn != null) {
      this.fFn.c(this.aEM);
    }

    this.fFn = new bQA(this.aEM.caw(), ZV.alJ().dV(paramString1), ZV.alJ().dV(paramString2));

    this.aEM.a(this.fFn);
  }

  private void b(doA paramdoA, String paramString1, String paramString2) {
    if ((this.fFn != null) && 
      (this.aEM.caw() == this.fFn)) {
      this.fFn.c(this.aEM);
    }

    this.fFn = null;
  }

  private void a(doA paramdoA, String paramString, boolean paramBoolean)
  {
    if (this.fFo == null) {
      this.fFo = new bKS();
    }
    this.fFo.b(this.aEM, new cvL(paramdoA, paramString, paramBoolean));
  }

  private void b(doA paramdoA, String paramString, boolean paramBoolean) {
    if (this.fFo == null) {
      return;
    }
    this.fFo.c(this.aEM, new cvL(paramdoA, paramString, paramBoolean));
    if (this.fFo.isEmpty())
      this.fFo = null;
  }

  private void a(doA paramdoA, boolean paramBoolean, Iterator paramIterator)
  {
    while (paramIterator.hasNext()) {
      cHP localcHP = (cHP)paramIterator.next();
      a(paramdoA, paramBoolean, localcHP);
    }
  }

  private void a(doA paramdoA, boolean paramBoolean, cHP paramcHP) {
    if (!a(paramdoA, paramcHP)) {
      return;
    }
    this.fFp.add(paramdoA.bkc());
    Object localObject;
    switch (cDf.iwb[paramcHP.Ds().ordinal()]) {
    case 1:
      localObject = (aNk)paramcHP;
      cYk localcYk = paramBoolean ? paramdoA.bkg() : null;
      a(((aNk)localObject).bec(), ((aNk)localObject).bed(), ((aNk)localObject).bee(), ((aNk)localObject).cCe(), localcYk, paramdoA);

      break;
    case 2:
      localObject = (cqF)paramcHP;
      a(paramdoA, (cqF)localObject);

      break;
    case 3:
      localObject = (dQy)paramcHP;
      a(((dQy)localObject).cdK(), paramdoA);

      break;
    case 4:
      localObject = (bxY)paramcHP;
      a((bxY)localObject);

      break;
    case 5:
      localObject = (aAu)paramcHP;
      a((aAu)localObject);

      break;
    case 6:
      localObject = (ckk)paramcHP;
      a(((ckk)localObject).ckE(), ((ckk)localObject).getPartName(), paramdoA);

      break;
    case 7:
      localObject = (bZf)paramcHP;
      a(((bZf)localObject).cdK(), ((bZf)localObject).ayf(), ((bZf)localObject).cdL(), paramdoA);

      break;
    case 8:
      localObject = (bOk)paramcHP;
      c(((bOk)localObject).bVt(), paramdoA);

      break;
    case 9:
      localObject = (bFh)paramcHP;
      e(((bFh)localObject).bMW(), paramdoA);

      break;
    case 10:
      localObject = (cnw)paramcHP;
      g(((cnw)localObject).getAnimName(), paramdoA);

      break;
    case 11:
      localObject = (bGs)paramcHP;
      a(((bGs)localObject).getVisibility(), ((bGs)localObject).bEZ(), paramdoA);

      break;
    case 12:
      localObject = (bAm)paramcHP;
      a(paramdoA, ((bAm)localObject).bIE(), ((bAm)localObject).getPropertyName(), ((bAm)localObject).bIF());

      break;
    case 13:
      localObject = (bCz)paramcHP;
      b(((bCz)localObject).asS(), ((bCz)localObject).bKX(), paramdoA);

      break;
    case 14:
      localObject = (aPp)paramcHP;
      a(paramdoA, ((aPp)localObject).bgi());

      break;
    case 15:
      localObject = (ux)paramcHP;
      a(paramdoA, ((ux)localObject).Dq(), ((ux)localObject).Dr());

      break;
    case 16:
      localObject = (djY)paramcHP;
      a(paramdoA, ((djY)localObject).cSE(), ((djY)localObject).cSD());
    }
  }

  private void b(doA paramdoA, boolean paramBoolean, Iterator paramIterator)
  {
    if ((!paramIterator.hasNext()) || (!this.fFp.contains(paramdoA.bkc()))) {
      return;
    }
    while (paramIterator.hasNext()) {
      cHP localcHP = (cHP)paramIterator.next();
      b(paramdoA, paramBoolean, localcHP);
    }
    this.fFp.remove(paramdoA.bkc());
  }

  private void b(doA paramdoA, boolean paramBoolean, cHP paramcHP) {
    if (!this.fFp.contains(paramdoA.bkc())) {
      return;
    }
    if (!a(paramdoA, paramcHP))
      return;
    Object localObject;
    switch (cDf.iwb[paramcHP.Ds().ordinal()]) {
    case 1:
      localObject = (aNk)paramcHP;
      cYk localcYk = paramBoolean ? paramdoA.bkg() : null;
      b(((aNk)localObject).bec(), ((aNk)localObject).bed(), ((aNk)localObject).bee(), ((aNk)localObject).cCe(), localcYk, paramdoA);
      break;
    case 2:
      localObject = (cqF)paramcHP;
      b(paramdoA, (cqF)localObject);
      break;
    case 4:
      break;
    case 5:
      break;
    case 3:
      localObject = (dQy)paramcHP;
      b(((dQy)localObject).cdK(), paramdoA);
      break;
    case 6:
      localObject = (ckk)paramcHP;
      b(((ckk)localObject).ckE(), ((ckk)localObject).getPartName(), paramdoA);
      break;
    case 7:
      localObject = (bZf)paramcHP;
      b(((bZf)localObject).cdK(), ((bZf)localObject).ayf(), ((bZf)localObject).cdL(), paramdoA);
      break;
    case 8:
      localObject = (bOk)paramcHP;
      d(((bOk)localObject).bVt(), paramdoA);
      break;
    case 9:
      localObject = (bFh)paramcHP;
      f(((bFh)localObject).bMW(), paramdoA);
      break;
    case 10:
      localObject = (cnw)paramcHP;
      h(((cnw)localObject).getAnimName(), paramdoA);
      break;
    case 11:
      localObject = (bGs)paramcHP;
      b(((bGs)localObject).getVisibility(), ((bGs)localObject).bEZ(), paramdoA);
      break;
    case 12:
      localObject = (bAm)paramcHP;
      e(((bAm)localObject).bIE(), ((bAm)localObject).getPropertyName(), ((bAm)localObject).bIF());
      break;
    case 13:
      localObject = (bCz)paramcHP;
      c(((bCz)localObject).asS(), ((bCz)localObject).bKX(), paramdoA);
      break;
    case 14:
      localObject = (aPp)paramcHP;
      b(paramdoA, ((aPp)localObject).bgi());
      break;
    case 15:
      localObject = (ux)paramcHP;
      b(paramdoA, ((ux)localObject).Dq(), ((ux)localObject).Dr());
      break;
    case 16:
      localObject = (djY)paramcHP;
      b(paramdoA, ((djY)localObject).cSE(), ((djY)localObject).cSD());
      break;
    }
  }

  private static boolean a(doA paramdoA, cHP paramcHP)
  {
    return (!paramcHP.cCd()) || (paramdoA.bkf().getId() == WakfuClientInstance.awy().awz().bFO().getId());
  }

  public void b(cew paramcew) {
    this.fFp.clear();

    if (this.fFd != null) {
      this.fFd.b(paramcew);
      this.fFd = null;
    }
    if (this.fFe != null) {
      this.fFe.b(paramcew);
      this.fFe = null;
    }
    if (this.fFf != null) {
      this.fFf.b(paramcew);
      this.fFf = null;
    }
    if (this.fFg != null) {
      this.fFg.b(paramcew);
      this.fFg = null;
    }
    if (this.fFh != null) {
      this.fFh.b(paramcew);
      this.fFh = null;
    }
    if (this.fFi != null) {
      this.fFi.b(paramcew);
      this.fFi = null;
    }
    if (this.fFm != null) {
      this.fFm.b(paramcew);
      this.fFm = null;
    }
    if (this.fFj != null) {
      this.fFj.b(paramcew);
      this.fFj = null;
    }
    if (this.fFk != null) {
      this.fFk.b(paramcew);
      this.fFk = null;
    }
    if (this.fFl != null) {
      this.fFl.b(paramcew);
      this.fFl = null;
    }
  }

  public void i(cew paramcew)
  {
    Object localObject1;
    if ((this.fFd != null) && (!this.fFd.isEmpty())) {
      localObject1 = (bcn)this.fFd.ayx();
      ((bcn)localObject1).a(paramcew, false);
    }
    if ((this.fFf != null) && (!this.fFf.isEmpty())) {
      for (Object localObject2 : this.fFf.dac()) {
        localObject2.b(paramcew, false);
      }
    }
    if ((this.fFg != null) && (!this.fFg.isEmpty()))
      for (localObject1 = this.fFg.iterator(); ((Iterator)localObject1).hasNext(); ) { cdj localcdj = (cdj)((Iterator)localObject1).next();
        localcdj.a(paramcew);
      }
  }

  public void j(cew paramcew)
  {
    if ((this.fFe != null) && (!this.fFe.isEmpty())) {
      Iterator localIterator = this.fFe.iterator();
      while (localIterator.hasNext())
        ((bYg)localIterator.next()).a(paramcew, false);
    }
  }

  public void reload()
  {
    a(this.fFk);
    a(this.fFl);
  }

  private void a(alO paramalO) {
    if (paramalO == null) {
      return;
    }

    int i = paramalO.size();
    while (i-- > 0) {
      bXI localbXI = paramalO.ayy();
      paramalO.a(localbXI, localbXI, this.aEM);
      paramalO.b(this.aEM, localbXI);
    }
  }

  public void k(cew paramcew) {
    if (paramcew == null) {
      return;
    }

    p(paramcew);

    o(paramcew);

    n(paramcew);

    m(paramcew);

    l(paramcew);
  }

  public void l(cew paramcew) {
    bmD localbmD = paramcew.chq();
    if (localbmD == null) {
      return;
    }
    if (this.fFg != null) {
      if (localbmD.fFg == null) {
        localbmD.fFg = new dlR();
      }
      this.fFg.a(paramcew, localbmD.fFg);
    }
  }

  public void m(cew paramcew) {
    bmD localbmD = paramcew.chq();
    if (localbmD == null) {
      return;
    }
    if (this.fFe != null) {
      if (localbmD.fFe == null) {
        localbmD.fFe = new dVo();
      }
      this.fFe.a(paramcew, localbmD.fFe);
    }
  }

  public void n(cew paramcew) {
    bmD localbmD = paramcew.chq();
    if (localbmD == null) {
      return;
    }
    if (this.fFl != null) {
      if (localbmD.fFl == null) {
        localbmD.fFl = new To();
      }
      this.fFl.a(paramcew, localbmD.fFl);
    }
  }

  public void o(cew paramcew) {
    bmD localbmD = paramcew.chq();
    if (localbmD == null) {
      return;
    }
    if (this.fFf != null) {
      if (localbmD.fFf == null) {
        localbmD.fFf = new dud();
      }
      this.fFf.a(paramcew, localbmD.fFf);
    }
  }

  public void p(cew paramcew) {
    bmD localbmD = paramcew.chq();
    if (localbmD == null) {
      return;
    }
    if (this.fFk != null) {
      if (localbmD.fFk == null) {
        localbmD.fFk = new dwv();
      }
      this.fFk.a(paramcew, localbmD.fFk, new cDe(this));
    }
  }

  public boolean bxp()
  {
    return (this.fFi != null) && (!this.fFi.isEmpty());
  }
}