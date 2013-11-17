import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class dbW extends cMb
  implements AQ
{
  private static final Logger K = Logger.getLogger(dbW.class);
  public static final dfN kUB = new bLn();
  private dQd kUC;

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    switch (bMk.av[paramdJO.ordinal()]) {
    case 1:
      if (!a(parambhL)) {
        return true;
      }

      d(paramdJO);
      Su localSu = (Su)parambhL;
      cew localcew = localSu.aeL();
      if (this.kUC.LI() > 0) {
        FreeParticleSystem localFreeParticleSystem = cof.cop().vY(this.kUC.LI());
        if (localFreeParticleSystem != null) {
          localFreeParticleSystem.b(localcew);
          cWS.cKD().b(localFreeParticleSystem);
        }
      }

      if (localcew.dpz() != null) {
        localcew.b(new bLk(this, localcew, paramdJO));

        return true;
      }

      a(localcew, paramdJO);
      return true;
    }
    K.error("Action invalide sur un teleporter", new IllegalArgumentException(paramdJO.toString()));
    return false;
  }

  private void a(cew paramcew, dJO paramdJO)
  {
    aCH localaCH = clR.cni().vL(this.kUC.gC());
    if (localaCH != null) {
      dgM.a(paramcew, localaCH);
    }
    a(paramdJO, a(paramcew, localaCH));
  }

  private boolean a(bhL parambhL) {
    w localw = this.kUC.p(parambhL, parambhL, this, ((dhJ)parambhL).ayL());
    return localw != null;
  }

  private int a(cew paramcew, aCH paramaCH) {
    if ((paramaCH != null) && (this.kUC.coA() == 0)) {
      int i = paramcew.H(paramaCH.aOQ());
      if ((i != 0) && (i != 2147483647)) {
        return i;
      }
    }
    return this.kUC.coA();
  }

  private void a(dJO paramdJO, int paramInt) {
    dka.cSF().a(new bLl(this, paramdJO), paramInt, 1);
  }

  public dJO eR()
  {
    return dJO.lVv;
  }

  public dJO[] eS()
  {
    return new dJO[] { dJO.lVv };
  }

  public void aJ()
  {
    super.aJ();
    eu(true);
    ev(true);
    D(true);
    if ((!bB) && (this.kUC != null)) throw new AssertionError();
  }

  public void bc()
  {
    super.bc();
    this.kUC = null;
  }

  public void al()
  {
    try {
      this.kUC = ((dQd)aKY.epr.a(cdc.hvW, Integer.parseInt(this.fgH)));
    } catch (NumberFormatException localNumberFormatException) {
      K.error("Erreur de paramétrage d'IE " + this, localNumberFormatException);
    } finally {
      if (this.kUC == null)
        this.kUC = dQd.mkh;
    }
  }

  public csx[] am()
  {
    aCH localaCH = clR.cni().vL(this.kUC.gC());

    aXd localaXd = (aXd)aiI.dgo.avt();
    localaXd.iT(localaCH.aOR());
    localaXd.ma("desc.mru." + localaCH.aOS());
    localaXd.fn(aat());
    localaXd.cM(aas());
    localaXd.setLocked(cNE());
    localaXd.fo(cNG());
    localaXd.l(this.kUC.dri());

    return new csx[] { localaXd };
  }

  private boolean cNE() {
    return (isLocked()) || (cNF());
  }

  private boolean isLocked() {
    if (this.kUC == null) {
      return true;
    }

    if (this.kUC.coC() < 0) {
      return false;
    }

    return byv.bFN().bFO().bFZ().cF(this.kUC.coC());
  }

  private boolean cNF() {
    if (this.kUC == null) {
      return false;
    }

    ArrayList localArrayList = new ArrayList();
    this.kUC.ae(new bLh(this, localArrayList));

    if (localArrayList.size() != 1) {
      return false;
    }

    w localw = (w)localArrayList.get(0);
    byz localbyz = byv.bFN().bFO();
    return !localw.F().i(localbyz, null, null, localbyz.ayL());
  }

  private String cNG() {
    String str1 = cNH();
    String str2 = aKM();
    if ((str1 != null) && (str2 != null))
      return str1 + '\n' + str2;
    if (str1 != null)
      return str1;
    if (str2 != null) {
      return str2;
    }
    return null;
  }

  private String cNH()
  {
    if (this.kUC == null) {
      return null;
    }

    if (this.kUC.coC() < 0) {
      return null;
    }

    se localse = byv.bFN().bFO().bFZ();
    awq localawq = localse.cE(this.kUC.coC());
    boolean bool = localse.cF(localawq.getId());

    String str1 = bU.fH().b(137, localawq.ts(), new Object[0]);
    String str2 = bSq.c(byv.bFN().bFO(), this.kUC.coC());

    lZ locallZ = new lZ();
    locallZ.a(str1);
    if (str2.length() != 0) {
      locallZ.tH().tz().am(bNa.gRz.bUV()).a(str2).tA();
    }

    return locallZ.tP();
  }

  private String aKM() {
    if (this.kUC == null) {
      return null;
    }

    ArrayList localArrayList = new ArrayList();
    this.kUC.ae(new bLj(this, localArrayList));

    if (localArrayList.size() != 1)
    {
      return null;
    }

    w localw = (w)localArrayList.get(0);
    byz localbyz = byv.bFN().bFO();
    if (!localw.F().i(localbyz, null, null, localbyz.ayL())) {
      lZ locallZ = new lZ();
      locallZ.tI().b(bNa.gRz);
      locallZ.a(daj.a(localw.F()));
      return locallZ.tP();
    }
    return null;
  }

  private boolean aas()
  {
    if (this.kUC == null) {
      return false;
    }
    return Od.m(this.kUC.drf(), this.kUC.drg(), this.kUC.drh());
  }

  private String aat() {
    if (this.kUC == null) {
      return null;
    }
    return Od.n(this.kUC.drf(), this.kUC.drg(), this.kUC.drh());
  }

  public String getName()
  {
    return bU.fH().b(89, this.kUC.getId(), new Object[0]);
  }

  public void a(abc paramabc)
  {
  }

  public diP tj() {
    return this.kUC;
  }

  public boolean ta()
  {
    byz localbyz = byv.bFN().bFO();

    return bGP.gDx.a(new aGH[] { localbyz });
  }

  public String toString()
  {
    return "Teleporter{m_info=" + this.kUC + '}';
  }
}