import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class dnW
  implements cvW
{
  protected static final Logger K = Logger.getLogger(dnW.class);

  public static dnW loj = new dnW();

  public void a(aqv paramaqv, boolean paramBoolean)
  {
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    switch (paramcWG.getId()) {
    case 15300:
      a((cVj)paramcWG);
      return false;
    case 15304:
      a((aUq)paramcWG);
      return false;
    case 15302:
      a((bPd)paramcWG);
      return false;
    case 15306:
      localObject1 = (dBP)paramcWG;
      ayn localayn1 = (ayn)cSE.kEZ.xz(((dBP)localObject1).CB());
      if (localayn1 == null) {
        localayn1 = cSE.kEZ.yY(((dBP)localObject1).CB());
      }

      localObject2 = bU.fH().b(66, localayn1.avb().getId(), new Object[0]);
      localObject3 = bU.fH().getString("notification.protectorAcquiredTitle");

      localObject4 = cda.createLink(bU.fH().getString("notification.protectorAcquiredText", new Object[] { localObject2 }), ana.dqi, "1");

      az localaz = new az((String)localObject3, (String)localObject4, ana.dqi, 600132);
      cjO.clE().j(localaz);
      return false;
    case 15308:
      localObject1 = (ceM)paramcWG;
      a((ceM)localObject1);
      return false;
    case 15320:
      localObject1 = (dlm)paramcWG;
      a((dlm)localObject1);
      return false;
    case 15334:
      localObject1 = (agc)paramcWG;
      a((agc)localObject1);
      return false;
    case 15328:
      localObject1 = (asQ)paramcWG;
      a((asQ)localObject1);
      return false;
    case 15317:
      localObject1 = (bbe)paramcWG;
      int i = ((bbe)localObject1).avS();
      localObject2 = (ayn)cSE.kEZ.xz(((bbe)localObject1).CB());
      if (localObject2 == null) {
        K.error("Reponse pour la mise d'un protecteur inconnu de notre manager " + ((bbe)localObject1).CB());
        return false;
      }

      a((ayn)localObject2, i);
      return false;
    case 15326:
      localObject1 = (cOh)paramcWG;
      ArrayList localArrayList = ((cOh)localObject1).bVE();
      for (localObject2 = localArrayList.iterator(); ((Iterator)localObject2).hasNext(); ) { localObject3 = (byte[])((Iterator)localObject2).next();
        localObject4 = ByteBuffer.wrap((byte[])localObject3);
        int j = cBP.isO.O((ByteBuffer)localObject4);
        ayn localayn2 = (ayn)cSE.kEZ.xz(j);

        if (localayn2 != null) {
          ((ByteBuffer)localObject4).rewind();
          cBP.isO.a((ByteBuffer)localObject4, localayn2);
        } else {
          K.error("Le protecteur ID (" + j + ") n'existe pas. Pas de mise à jour, et pas de création.");
        }
      }
      cCZ.cyZ().bLL();
      cCZ.cyZ().bMv();
      return false;
    case 15330:
      localObject1 = (boM)paramcWG;
      a((boM)localObject1);
      return false;
    case 15301:
    case 15303:
    case 15305:
    case 15307:
    case 15309:
    case 15310:
    case 15311:
    case 15312:
    case 15313:
    case 15314:
    case 15315:
    case 15316:
    case 15318:
    case 15319:
    case 15321:
    case 15322:
    case 15323:
    case 15324:
    case 15325:
    case 15327:
    case 15329:
    case 15331:
    case 15332:
    case 15333: } return true;
  }

  private void a(boM paramboM) {
    byz localbyz = byv.bFN().bFO();
    ayn localayn = (ayn)cSE.kEZ.xz(paramboM.CB());
    aur localaur = localayn.aKu();
    dEw localdEw = localaur.aGA();
    int i = paramboM.nn();

    if (paramboM.byt())
    {
      btY localbtY;
      Object localObject;
      Gi localGi;
      switch (aob.dsA[paramboM.byu().ordinal()]) {
      case 1:
        localbtY = localdEw.I(i, true);
        localaur.iC(i);
        localayn.aKi().c(bmt.fDW, localbtY.bCf());

        localObject = (Gi)bWW.ccf().FB().aKi();
        ((Gi)localObject).a(localayn).As();
        localbtY.bCh();
        break;
      case 2:
        localbtY = localdEw.I(i, false);
        localaur.iD(i);
        localayn.aKi().c(bmt.fDW, localbtY.bCf());

        localObject = (Gi)bWW.ccf().FB().aKi();
        ((Gi)localObject).a(localayn).As();
        localbtY.bCh();
        break;
      case 3:
        localbtY = localdEw.I(i, true);
        localaur.iE(i);

        localbtY.bCh();
        break;
      case 4:
        localbtY = localdEw.I(i, false);
        localaur.iF(i);

        localbtY.bCh();
        break;
      case 5:
        localbtY = localdEw.I(i, true);
        localaur.a(localbyz, i);
        localayn.aKi().c(bmt.fDW, localbtY.bCg());

        localObject = blo.bws().qc(i);
        if (localObject != null) {
          ((acy)localObject).bN(true);
        }
        localbtY.bCi();

        localGi = (Gi)bWW.ccf().FB().aKi();
        localGi.a(localayn).As();
        break;
      case 6:
        localbtY = localdEw.I(i, false);
        localaur.b(localbyz, i);
        localayn.aKi().c(bmt.fDW, localbtY.bCg());

        localObject = dcK.cOf().zJ(i);
        if (localObject != null) {
          ((acy)localObject).bN(true);
        }
        localbtY.bCi();

        localGi = (Gi)bWW.ccf().FB().aKi();
        localGi.a(localayn).As();
        break;
      }
    }
    else {
      K.warn("Le serveur a renvoyé une erreur pour l'action " + paramboM.byu().name() + " pour le protecteur " + paramboM.CB() + " et la famille " + paramboM.nn());
    }

    aig.dej.o("protectorEcosystemLock", true);
  }

  private void a(asQ paramasQ) {
    int i = paramasQ.CB();
    byte b = paramasQ.aEV();
    cIZ localcIZ = cIZ.em(b);
    ayn localayn = (ayn)cSE.kEZ.xz(i);
    localayn.aKs().a(localcIZ);
    dQJ localdQJ = (dQJ)aAA.dTp.aMA();
    localdQJ.f(localcIZ);
    localdQJ.o(localayn);
    biI.fzg.b(localdQJ);
  }

  private void a(agc paramagc) {
    int i = paramagc.CB();

    byz localbyz = byv.bFN().bFO();
    int j = (localbyz != null) && (localbyz.bHa() == localbyz.bHb()) ? 1 : 0;
    ayn localayn;
    if (j == 0)
      localayn = (ayn)cSE.kEZ.xz(i);
    else {
      localayn = bWW.ccf().cch();
    }
    if (localayn == null) {
      K.error("Réception de données de taxe de protecteur pour un protecteur inconnu protectorId=" + i);
      return;
    }

    byte[] arrayOfByte = paramagc.art();
    cBP.isO.a(ByteBuffer.wrap(arrayOfByte), localayn);

    dLE.doY().a(bWW.ccf(), new String[] { "tax" });
  }

  private void a(dlm paramdlm) {
    int i = paramdlm.CB();
    ayn localayn = (ayn)cSE.kEZ.xz(i);
    if (localayn == null) {
      K.error("Réception de données de gestion de protecteur pour un protecteur inconnu protectorId=" + i);
      return;
    }

    byte[] arrayOfByte1 = paramdlm.cTe();
    cBP.isO.a(ByteBuffer.wrap(arrayOfByte1), localayn);

    byte[] arrayOfByte2 = paramdlm.cTf();
    if ((arrayOfByte2 != null) && (arrayOfByte2.length > 0)) {
      bbi localbbi = new bbi();
      localbbi.aq(ByteBuffer.wrap(arrayOfByte2));
      sS.Al().b(localbbi);
    }

    dLE.doY().a(bWW.ccf(), bWW.bF);
  }

  private void a(ayn paramayn, int paramInt)
  {
    String str = bU.fH().getString("protector.question.askMoneyToFight", new Object[] { Integer.valueOf(paramInt), paramayn.getName() });

    cKX localcKX = cBQ.cxL().a(str, Cn.et(0), 24L, 102, 0);

    localcKX.a(new amn(this, paramayn, paramInt));
  }

  void b(ayn paramayn, int paramInt)
  {
    byz localbyz = byv.bFN().bFO();

    int i = localbyz.JE();
    if (i < paramInt) {
      CM.LV().f(bU.fH().getString("protector.error.notEnoughMoneyToFight"), 3);
      return;
    }

    byo localbyo = paramayn.aKk();
    if (localbyo.adF()) {
      fe localfe = bSh.e(paramayn);
      localfe.mc();
      int j = localfe.ma();
      if (j == 0)
        return;
      avW.aIb().a(j, 3, new Object[0]);
    } else {
      localbyz.aA(localbyo);
    }
  }

  private void a(ceM paramceM) {
    int i = paramceM.CB();
    ayn localayn = (ayn)cSE.kEZ.xz(i);
    aYr localaYr = dsh.luB.BA(paramceM.bP());
    if (localayn != null)
      localayn.g(localaYr);
    else
      K.error("Réception d'un événement pour un protecteur inconnu id=" + paramceM.CB());
  }

  private void a(bPd parambPd)
  {
    ayn localayn = (ayn)cSE.kEZ.xz(parambPd.CB());

    if (localayn != null) {
      dVF localdVF = (dVF)aAA.dTk.aMA();
      localdVF.o(localayn);
      localdVF.d(null);
      biI.fzg.b(localdVF);
    } else {
      K.error("Réception d'un événement pour un protecteur inconnu id=" + parambPd.CB());
    }
  }

  private void a(aUq paramaUq) {
    ayn localayn = (ayn)cSE.kEZ.xz(paramaUq.CB());
    if (localayn != null) {
      drx localdrx = (drx)aAA.dTl.aMA();
      localdrx.o(localayn);
      localdrx.d(dsh.luB.BA(paramaUq.bP()));
      biI.fzg.b(localdrx);

      String str1 = bU.fH().b(66, localayn.avb().getId(), new Object[0]);
      String str2 = bU.fH().getString("notification.protectorLostTitle");

      String str3 = cda.createLink(bU.fH().getString("notification.protectorLostText", new Object[] { str1 }), ana.dqi, "1");

      az localaz = new az(str2, str3, ana.dqi, 600132);
      cjO.clE().j(localaz);
    } else {
      K.error("Réception d'un événement pour un protecteur inconnu id=" + paramaUq.CB());
    }
  }

  private void a(cVj paramcVj) {
    ayn localayn = (ayn)cSE.kEZ.xz(paramcVj.CB());

    if (localayn != null) {
      LH localLH = (LH)aAA.dTj.aMA();
      localLH.o(localayn);
      localLH.d(null);
      biI.fzg.b(localLH);
    } else {
      K.error("Réception d'un événement pour un protecteur inconnu id=" + paramcVj.CB());
    }
  }

  private void a(dBP paramdBP) {
    ayn localayn = (ayn)cSE.kEZ.xz(paramdBP.CB());

    if (localayn != null) {
      LH localLH = (LH)aAA.dTj.aMA();
      localLH.o(localayn);
      localLH.d(null);
      biI.fzg.b(localLH);
    } else {
      K.error("Réception d'un événement pour un protecteur inconnu id=" + paramdBP.CB());
    }
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }
}