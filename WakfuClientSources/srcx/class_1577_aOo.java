import org.apache.log4j.Logger;

public class aOo
  implements cvW
{
  private static final Logger K = Logger.getLogger(aOo.class);

  public static final aOo euG = new aOo();
  private bXu euH;

  public boolean a(cWG paramcWG)
  {
    Object localObject1;
    Object localObject2;
    Object localObject3;
    switch (paramcWG.getId()) {
    case 15650:
      localObject1 = (brX)paramcWG;
      a((brX)localObject1);
      return false;
    case 5510:
      localObject1 = (djc)paramcWG;
      a((djc)localObject1);
      return false;
    case 5512:
      localObject1 = (aLe)paramcWG;
      a((aLe)localObject1);
      return false;
    case 5514:
      a((bjS)paramcWG);
      return false;
    case 5524:
      a((oJ)paramcWG);
      return false;
    case 5516:
      localObject1 = (dIs)paramcWG;
      localObject2 = ((dIs)localObject1).tZ();

      if (((dIs)localObject1).aRB() != je.aJO) {
        localObject3 = bU.fH().getString("havenWorldForbidden");
        cBQ.cxL().a((String)localObject3, Cn.et(8), 1027L, 102, 1);

        return false;
      }

      if (this.euH == null) {
        return false;
      }

      this.euH.ccK().a((cKg)localObject2);
      if (this.euH.fV())
        this.euH.begin();
      else {
        this.euH.a(false, true);
      }
      return false;
    case 15652:
      localObject1 = (cXy)paramcWG;
      localObject2 = ((cXy)localObject1).aRB();
      if (localObject2 == je.aJO) {
        localObject3 = ((cXy)localObject1).cLl();
        if (byv.bFN().c(bZv.cdR())) {
          bZv.cdR().c((bH)localObject3);
        }
        bZv.cdR().cdZ();
      } else {
        if (byv.bFN().c(bZv.cdR())) {
          localObject3 = ((cXy)localObject1).cLl();
          bZv.cdR().b((bH)localObject3, (je)localObject2);
        }
        a((je)localObject2);
        return false;
      }
      return false;
    case 5522:
      localObject1 = (caO)paramcWG;
      if ((this.euH == null) || (this.euH.ccK() == null)) {
        return false;
      }

      localObject2 = this.euH.ccK().tZ();
      if (((cKg)localObject2).arI() != ((caO)localObject1).D()) {
        return false;
      }

      localObject3 = new avU((cKg)localObject2);
      ((avU)localObject3).hZ(((caO)localObject1).arM());

      return false;
    case 20080:
      localObject1 = (vR)paramcWG;
      int i = ((vR)localObject1).Fd();
      bZv.cdR().uq(i);
      if (byv.bFN().c(bZv.cdR())) {
        bZv.cdR().cdU();
      }

      return false;
    case 15655:
      a((VN)paramcWG);
      return false;
    }
    return true;
  }

  private void a(VN paramVN) {
    bij localbij = cDj.iwy.dv(paramVN.D());
    localbij.pK(paramVN.aiO());
  }

  private static void a(je paramje) {
    String str = null;
    switch (cQR.buK[paramje.ordinal()]) {
    case 1:
      if (byv.bFN().c(bZv.cdR()))
        str = "havenWorldErrorWait";
      else {
        str = "havenWorldMoneyNeeded";
      }
      break;
    case 2:
    case 3:
      str = "havenWorldErrorWait";
      break;
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
      K.error("L'action dans l'éditeur de havre monde a échoué !");
      str = "havenWorldErrorWait";
      byv.bFN().b(bZv.cdR());
      break;
    case 11:
      K.error("L'action dans l'éditeur de havre monde a échoué !");
      str = "havenWorld.error.iePresent";
      break;
    case 12:
    case 13:
      K.error("L'action dans l'éditeur de havre monde a échoué ! hack?");
      str = "havenWorldErrorWait";
      byv.bFN().b(bZv.cdR());
      break;
    default:
      K.error("Code d'erreur d'havre monde non géré " + paramje);
    }

    if (str != null)
      cBQ.cxL().a(bU.fH().getString(str), Cn.et(8), 1027L, 7, 1);
  }

  private void a(oJ paramoJ)
  {
    aIJ localaIJ = Vr.cAl.aiG();
    localaIJ.u(paramoJ.gv(), paramoJ.gw());
    beZ();
  }

  private void a(aLe paramaLe) {
    aIJ localaIJ = Vr.cAl.aiG();
    localaIJ.c(paramaLe.bcK());
    beZ();
  }

  private void a(bjS parambjS) {
    aIJ localaIJ = Vr.cAl.aiG();
    localaIJ.dW(parambjS.gv());
    beZ();
  }

  private void a(djc paramdjc) {
    short s1 = paramdjc.Ky();
    short s2 = paramdjc.Kz();
    short s3 = paramdjc.vQ();
    short s4 = paramdjc.vR();
    short s5 = paramdjc.vS();
    short s6 = paramdjc.vT();

    aIJ localaIJ = Vr.cAl.aiG();
    localaIJ.d(s1, s2, s3, s4, s5, s6);

    beZ();

    if ((this.euH == null) || (this.euH.ccK() == null)) {
      return;
    }

    cKg localcKg = this.euH.ccK().tZ();
    avU localavU = new avU(localcKg);
    if (localcKg.l(s1, s2) == null) {
      localavU.r(s1, s2);
    }
    localavU.c(s1, s2, s3, s4, s5, s6);
    if (byv.bFN().c(bZv.cdR()))
      bZv.cdR().cdU();
  }

  private static void a(brX parambrX)
  {
    byte[] arrayOfByte1 = parambrX.bAq();
    byte[] arrayOfByte2 = parambrX.bAr();

    Vr.cAl.t(arrayOfByte1);
    Vr.cAl.u(arrayOfByte2);
    Vr.cAl.b(parambrX.aiJ());
  }

  private static void beZ() {
    bSH.bZs().bZt();
  }

  public long getId() {
    return 1L;
  }

  public void a(long paramLong)
  {
  }

  public void a(aqv paramaqv, boolean paramBoolean)
  {
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
  }

  public void a(bXu parambXu) {
    this.euH = parambXu;
  }
}