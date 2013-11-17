import com.ankamagames.wakfu.client.binaryStorage.ChallengeLootListBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.ProtectorBinaryData;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class cBP extends JO
{
  public static final cBP isO = new cBP();
  protected static final Logger K = Logger.getLogger(cBP.class);

  public void a(ayn paramayn, bDs parambDs)
  {
  }

  public void b(ayn paramayn, bDs parambDs)
  {
  }

  public void a(ayn paramayn, cil paramcil)
  {
  }

  public void b(ayn paramayn, cil paramcil)
  {
  }

  public void a(ayn paramayn, bPH parambPH)
  {
  }

  public void b(ayn paramayn, bPH parambPH)
  {
    paramayn.dz(parambPH.gXU);
  }

  public void a(ayn paramayn, ij paramij)
  {
  }

  public void b(ayn paramayn, ij paramij) {
    cSi localcSi1 = paramayn.aKn();
    localcSi1.clear();

    ArrayList localArrayList1 = paramij.aHK.aZC;

    for (int i = 0; i < localArrayList1.size(); i++) {
      localaRR = (aRR)localArrayList1.get(i);
      if (localaRR.eOX != 2147483647) {
        localcSi1.add(localaRR.bPw);
      }
    }
    dQK localdQK = paramij.aHK.bNV;
    aRR localaRR = localdQK != null ? localdQK.gJF : null;

    paramayn.aKp().clear();
    int j;
    int k;
    if (localaRR == null) {
      paramayn.aKp().ensureCapacity(localcSi1.size());
      j = 0; for (k = localcSi1.size(); j < k; j++)
        paramayn.aKp().add(localcSi1.get(j));
    }
    else {
      j = 0; for (k = localaRR.size(); j < k; j++) {
        paramayn.aKp().add(((abF)localaRR.get(j)).bPw);
      }
    }
    ArrayList localArrayList2 = paramij.aHM.aZC;
    cSi localcSi2 = paramayn.aKq();
    localcSi2.clear();
    int m = 0; for (int n = localArrayList2.size(); m < n; m++) {
      localcSi2.add(((aRR)localArrayList2.get(m)).bPw);
    }

    dLE.doY().a(bWW.ccf(), new String[] { "boughtChallenges" });
  }

  public void a(ayn paramayn, aTM paramaTM)
  {
  }

  public void b(ayn paramayn, aTM paramaTM) {
    bFg localbFg1 = paramayn.aKe();
    if (localbFg1 == null) {
      localbFg1 = new bFg(paramaTM.dur.cxL, boy.fHY, ccq.htU, (short)99, (byte)1, false, bmt.fDU);

      paramayn.b(localbFg1);
    }
    localbFg1.a(paramaTM.dur);
    paramayn.aKf();

    bFg localbFg2 = paramayn.aKj();
    if (localbFg2 == null) {
      localbFg2 = new bFg(paramaTM.dut.cxL, boy.fHY, ccq.htV, (short)99, (byte)1, false, bmt.fDX);

      paramayn.c(localbFg2);
    }
    localbFg2.a(paramaTM.dut);

    bFg localbFg3 = paramayn.aKl();
    if (localbFg3 == null) {
      localbFg3 = new bFg(paramaTM.dus.cxL, boy.fHY, ccq.htW, (short)99, (byte)1, true, bmt.fDV);

      paramayn.d(localbFg3);
    }
    localbFg3.a(paramaTM.dus);

    K.info("#### MerchantInventory (challenges) du protecteur id=" + paramayn.getId());
    Iterator localIterator = localbFg1.iterator();
    ld localld;
    while (localIterator.hasNext()) {
      localld = (ld)localIterator.next();
      K.info("####   refId=" + localld.ok() + " price=" + localld.Hv() + " type=" + localld.sC().name() + " featureReferenceId=" + localld.sD());
    }

    K.info("#### MerchantInventory (buffs) du protecteur id=" + paramayn.getId());
    localIterator = localbFg2.iterator();
    while (localIterator.hasNext()) {
      localld = (ld)localIterator.next();
      K.info("####   refId=" + localld.ok() + " price=" + localld.Hv() + " type=" + localld.sC().name() + " featureReferenceId=" + localld.sD());
    }

    K.info("#### MerchantInventory (buffs de climat) du protecteur id=" + paramayn.getId());
    localIterator = localbFg3.iterator();
    while (localIterator.hasNext()) {
      localld = (ld)localIterator.next();
      K.info("####   refId=" + localld.ok() + " price=" + localld.Hv() + " type=" + localld.sC().name() + " featureReferenceId=" + localld.sD());
    }
  }

  public void a(ayn paramayn, cvs paramcvs)
  {
  }

  public void b(ayn paramayn, cvs paramcvs) {
    Gi localGi = (Gi)paramayn.aKi();
    if (localGi == null)
      paramayn.a(localGi = new Gi(paramayn, cS.Sd));
    localGi.b(paramcvs);

    K.info("#### Wallet du protecteur id=" + paramayn.getId() + " : cashAmount=" + localGi.bDx());
  }

  public void a(ayn paramayn, ara paramara) {
  }

  public void b(ayn paramayn, ara paramara) {
  }

  public void a(ayn paramayn, baA parambaA) {
  }

  public void b(ayn paramayn, baA parambaA) {
    EnumMap localEnumMap = paramayn.aKr();
    ArrayList localArrayList = parambaA.bOu;
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      cUp localcUp = ((djL)localArrayList.get(i)).htZ;
      cVE localcVE = cVE.eH(localcUp.kGX);
      localEnumMap.put(localcVE, new baR(localcVE, localcUp.kGY));
    }
  }

  public void a(ayn paramayn, dvI paramdvI) {
  }

  public void b(ayn paramayn, dvI paramdvI) {
    ArrayList localArrayList = paramdvI.lAW;
    paramayn.aKm().clear();

    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      auF localauF = (auF)localArrayList.get(i);

      cYq localcYq = cYq.jq(localauF.dHz);
      bnn localbnn = but.gdO.qW(localauF.dHA);
      if (localbnn != null) {
        aDJ localaDJ = new aDJ(localbnn, localcYq);
        paramayn.aKm().add(localaDJ);
      } else {
        K.error("Modificateur météo ignoré -- pas/plus de bonus de climat d'ID=" + localauF.dHA + ", pour le protecteur ID=" + paramayn.getId());
      }
    }
  }

  protected void a(ayn paramayn, aKR paramaKR)
  {
  }

  protected void b(ayn paramayn, aKR paramaKR)
  {
    asX localasX = paramayn.aKs();
    ArrayList localArrayList = paramaKR.VR;
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      cII localcII = (cII)localArrayList.get(i);
      localasX.d(localcII.iGB.bPw, new aCc(localcII.iGB.min, localcII.iGB.max));
    }
  }

  protected void a(ayn paramayn, ed paramed) {
  }

  protected void b(ayn paramayn, ed paramed) {
    asX localasX = paramayn.aKs();
    ArrayList localArrayList = paramed.VR;
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      dsF localdsF = (dsF)localArrayList.get(i);
      localasX.c(localdsF.iGB.bPw, new aCc(localdsF.iGB.min, localdsF.iGB.max));
    }
  }

  protected void a(ayn paramayn, bSk parambSk) {
    cIZ localcIZ = cIZ.em(parambSk.hcR);
    if (localcIZ != null)
      paramayn.aKs().a(localcIZ);
    else
      K.error("Erreur à la déserialisation de la satisfaction du protecteur id=" + paramayn.getId() + " niveau de satisfaction id=" + parambSk.hcR + " inexistant");
  }

  protected void b(ayn paramayn, bSk parambSk)
  {
  }

  protected void a(ayn paramayn, cZY paramcZY)
  {
    aur localaur = paramayn.aKu();

    ArrayList localArrayList1 = paramcZY.kNP;
    int i = 0; for (int j = localArrayList1.size(); i < j; i++) {
      localaur.iC(((cHt)localArrayList1.get(i)).iCv);
    }
    ArrayList localArrayList2 = paramcZY.kNQ;
    j = 0; for (int k = localArrayList2.size(); j < k; j++)
      localaur.iD(((cKE)localArrayList2.get(j)).iCv);
  }

  protected void b(ayn paramayn, cZY paramcZY)
  {
  }

  protected void g(ayn paramayn) {
    try {
      ProtectorBinaryData localProtectorBinaryData = new ProtectorBinaryData();
      if (!cze.cwb().a(paramayn.getId(), localProtectorBinaryData)) {
        K.error("le protector " + paramayn.getId() + " non trouvé");
        return;
      }
      cSi localcSi = paramayn.aKo();
      localcSi.clear();

      ChallengeLootListBinaryData localChallengeLootListBinaryData = new ChallengeLootListBinaryData();

      if (!cze.cwb().a(localProtectorBinaryData.avM(), localChallengeLootListBinaryData)) {
        return;
      }

      chC localchC = new chC();
      for (bPt localbPt : localChallengeLootListBinaryData.bUG()) {
        cWt localcWt = new cWt(localbPt.yC(), (short)1, aVj.hn(localbPt.uL()));
        localchC.a(localcWt);
        localcSi.add(localbPt.yC());
      }

      paramayn.a(localchC);
    } catch (Exception localException) {
      K.error("", localException);
    }
  }
}