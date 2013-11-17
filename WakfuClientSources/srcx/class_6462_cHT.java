import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class cHT
{
  private static final Logger K = Logger.getLogger(cHT.class);

  public static final cHT iDr = new cHT();
  private Uc iDs;
  private Ke iDt;
  private cSR gxE = new cSR();
  private cSR gxD = new cSR();
  private cSR iDu = new cSR();
  private int iDv;

  public void e(bCP parambCP)
  {
    this.iDs = new Uc(parambCP);
    this.iDt = new Ke(parambCP);
  }

  D a(aiJ paramaiJ) {
    D localD = new D(paramaiJ);
    this.gxE.put(paramaiJ.getId(), localD);
    return localD;
  }

  public D xP(int paramInt) {
    return (D)this.gxE.get(paramInt);
  }

  ckJ U(int paramInt1, int paramInt2, int paramInt3) {
    ckJ localckJ = new ckJ(paramInt1, paramInt2, paramInt3);
    this.gxD.put(paramInt1, localckJ);

    dEE localdEE = byv.bFN().bFO().bGa().sq(paramInt1);
    ArrayList localArrayList = localdEE.dgh();
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      a((aiJ)localArrayList.get(i));
    }

    return localckJ;
  }

  public ckJ xQ(int paramInt) {
    ckJ localckJ = (ckJ)this.gxD.get(paramInt);
    if (localckJ == null)
      K.warn("On essaye de récupérer un achievement qui n'existe pas : id=" + paramInt, new Exception());
    return localckJ;
  }

  blY cCf() {
    blY localblY = new blY();
    this.iDu.put(localblY.getId(), localblY);
    return localblY;
  }

  cPH a(bXs parambXs, cPH paramcPH) {
    int i = paramcPH == null ? parambXs.getId() : paramcPH.cmy();

    cPH localcPH1 = new cPH(parambXs, i);
    this.iDu.put(parambXs.getId(), localcPH1);

    ArrayList localArrayList = parambXs.ccI();
    if (localArrayList != null)
      for (localObject1 = localArrayList.iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (dEE)((Iterator)localObject1).next();
        localObject3 = U(((dEE)localObject2).getId(), localcPH1.cmy(), ((dEE)localObject2).oc());
        localcPH1.e((ckJ)localObject3);
        if (paramcPH != null)
          paramcPH.e((ckJ)localObject3);
      }
    Object localObject2;
    Object localObject3;
    Object localObject1 = parambXs.getChildren();
    if (localObject1 != null) {
      for (localObject2 = ((ArrayList)localObject1).iterator(); ((Iterator)localObject2).hasNext(); ) { localObject3 = (bXs)((Iterator)localObject2).next();
        cPH localcPH2 = a((bXs)localObject3, localcPH1);
        localcPH1.a(localcPH2);
      }
    }
    return localcPH1;
  }

  public aMT xR(int paramInt) {
    aMT localaMT = (aMT)this.iDu.get(paramInt);
    if (localaMT == null)
      K.warn("On essaye de récupérer une categorie qui n'existe pas : id=" + paramInt, new Exception());
    return localaMT;
  }

  public Ke cCg() {
    return this.iDt;
  }

  public Uc cCh() {
    return this.iDs;
  }

  public bvw xS(int paramInt) {
    return xT(paramInt) ? this.iDt : this.iDs;
  }

  public boolean xT(int paramInt) {
    ckJ localckJ = (ckJ)this.gxD.get(paramInt);
    return this.iDt.rl(localckJ.cmy()) != null;
  }

  public void xU(int paramInt) {
    if (xW(paramInt)) {
      return;
    }
    int i = this.iDv;
    this.iDv = paramInt;
    aiJ localaiJ = dHn.lSk.CI(this.iDv);
    if ((localaiJ == null) || (!localaiJ.avz())) {
      if (cCZ.cyZ().xt(7))
        cCZ.cyZ().czb();
      this.iDv = -1;
      xV(i);
      return;
    }
    cCZ.cyZ().a(7, localaiJ.nx(), localaiJ.ny(), localaiJ.IB(), localaiJ, bU.fH().b(64, paramInt, new Object[0]));

    xV(i);
    xV(this.iDv);
  }

  private void xV(int paramInt) {
    D localD = (D)this.gxE.get(paramInt);
    if (localD != null)
      dLE.doY().a(localD, new String[] { "isCompassed" });
  }

  public boolean xW(int paramInt)
  {
    return (cCZ.cyZ().xt(7)) && (this.iDv == paramInt);
  }

  public void cleanUp() {
    this.gxD.clear();
    this.iDu.clear();
    this.gxE.clear();
    this.iDv = -1;
    this.iDs = null;
    this.iDt = null;
  }

  public void cCi() {
    byz localbyz = byv.bFN().bFO();
    int i = localbyz.Lk();
    bCP localbCP = localbyz.bGa();
    for (dmn localdmn = localbCP.bLq(); localdmn.hasNext(); ) {
      localdmn.fl();
      dEE localdEE = (dEE)localdmn.value();
      int j = localdEE.getId();
      if ((xT(j)) && 
        (localbCP.mc(j)) && (localbCP.mg(j)))
        for (aiJ localaiJ : localdEE.dgh())
          if ((!localaiJ.Q()) && (localaiJ.avz()) && (i == localaiJ.D()))
            xU(localaiJ.getId());
    }
  }
}