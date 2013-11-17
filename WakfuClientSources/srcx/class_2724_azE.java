import java.util.Iterator;
import java.util.Set;
import org.apache.log4j.Logger;

public class azE
  implements cvW
{
  private static final Logger K = Logger.getLogger(azE.class);

  private static azE dRd = new azE();

  public static azE aLy()
  {
    return dRd;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
  }

  public boolean a(cWG paramcWG) {
    int i = paramcWG.getId();
    switch (i) {
    case 562:
      a((dTx)paramcWG);
      return false;
    case 564:
      a((dAe)paramcWG);
      return false;
    case 566:
      a((Bb)paramcWG);
      return false;
    case 568:
      a((cLK)paramcWG);
      return false;
    case 570:
      a((bxg)paramcWG);
      return false;
    case 574:
      a((bYQ)paramcWG);
      return false;
    case 576:
      a((cKK)paramcWG);
      return false;
    case 578:
      a((cLW)paramcWG);
      return false;
    case 580:
      a((dFX)paramcWG);
      return false;
    case 582:
      a((dPn)paramcWG);
      return false;
    case 584:
      a((cUW)paramcWG);
      return false;
    case 586:
      a((acJ)paramcWG);
      return false;
    case 594:
      a((cum)paramcWG);
      return false;
    case 588:
      a((Dl)paramcWG);
      return false;
    case 592:
      a((AC)paramcWG);
      return false;
    case 590:
      a((bwY)paramcWG);
      return false;
    case 596:
      a((biR)paramcWG);
      return false;
    case 563:
    case 565:
    case 567:
    case 569:
    case 571:
    case 572:
    case 573:
    case 575:
    case 577:
    case 579:
    case 581:
    case 583:
    case 585:
    case 587:
    case 589:
    case 591:
    case 593:
    case 595: } return true;
  }

  private void a(biR parambiR)
  {
    byte b = parambiR.Kh();
    K.warn(bQX.c("Erreur lors de la modification d'un evenement", b));
    vL localvL = parambiR.qI();
    CM.LV().f(bU.fH().getString("calendar.event.modification.error"), 3);
    a(b, localvL);
    aca.aoj().g(localvL);
    dpQ.cXg().cXj();
  }

  private void a(cum paramcum)
  {
    byte b = paramcum.Kh();
    K.warn(bQX.c("Impossible de changer la date de debut de l'évènement", b));
    CM.LV().f(bU.fH().getString("calendar.start.date.change.error"), 3);
    a(b, aca.aoj().cy(paramcum.JP()));
    aca.aoj().a(paramcum.JP(), paramcum.VN());
    dpQ.cXg().cXj();
  }

  private void a(bwY parambwY) {
    byte b = parambwY.Kh();
    K.warn(bQX.c("Impossible de changer le titre de l'évènement", b));

    vL localvL = aca.aoj().cy(parambwY.JP());
    if (localvL == null) {
      K.warn("[CALENDAR] Bizarre, on a reçu une reponse sur un changement de description d'un event mais nous ne connaissons pas cet event");
      return;
    }
    CM.LV().f(bU.fH().getString("calendar.event.title.change.error", new Object[] { abd.d(localvL) }), 4);
    localvL.aP(parambwY.Mz());
  }

  private void a(AC paramAC) {
    int i = paramAC.JS();
    vL localvL = aca.aoj().cy(paramAC.JP());
    if (localvL == null) {
      K.error("On est notifié d'une modification d'un évènement dont on n'a pas connaissance");
      return;
    }
    switch (i) {
    case 1:
      localvL.b(paramAC.JR(), paramAC.JQ());
      dSG.dsZ().dta();

      CM.LV().f(bU.fH().getString("calendar.event.inscription", new Object[] { paramAC.JQ(), abd.d(localvL) }), 4);
      return;
    case 2:
      localvL.aJ(paramAC.JR());
      dSG.dsZ().dta();
      dSG.dsZ().dtb();

      CM.LV().f(bU.fH().getString("calendar.event.other.leave.participants", new Object[] { paramAC.JQ(), abd.d(localvL) }), 4);
      return;
    case 3:
      localvL.aK(paramAC.JR());
      dSG.dsZ().dta();
      return;
    }

    K.error("[CALENDAR] Action de type inconnue : " + i);
  }

  private void a(Dl paramDl)
  {
    int i = paramDl.Kh();
    switch (i) {
    case 0:
      K.error("[CALENDAR] Le serveur ne devrait envoyer aucune reponse si le changement de desc s'est bien passe");
      return;
    case 11:
      K.warn("[CALENDAR] Impossible de changer la desc de l'évènement : évènement inconnu");
      break;
    case 14:
      K.warn("[CALENDAR] Impossible de changer la desc de l'évènement personnnage non connecté");
      break;
    case 13:
      K.warn("[CALENDAR] Impossible de changer la desc de l'évènement personnage non propriétaire de l'evenement");
      break;
    case 26:
      K.warn("[CALENDAR] Impossible de changer la desc de l'évènement car on ne dipose pas des droits nécessaires");
      break;
    default:
      K.error("[CALENDAR] Le serveur envoie un code d'erreur non traité dans le cas d'un message de reponse au changement de desc");
    }

    vL localvL = aca.aoj().cy(paramDl.JP());
    if (localvL == null) {
      K.warn("[EVENTS_CALENDAR] Bizarre, on a reçu une reponse sur un changement de description d'un event mais nous ne connaissons pas cet event");
      return;
    }
    CM.LV().f(bU.fH().getString("calendar.event.desc.change.error", new Object[] { abd.d(localvL) }), 4);
    localvL.aP(paramDl.Mz());
  }

  private void a(acJ paramacJ) {
    int i = paramacJ.Kh();
    switch (i) {
    case 0:
      K.error("[CALENDAR] Le serveur ne devrait envoyer aucune reponse si le changement de titre s'est bien passe");
      return;
    case 11:
      K.warn("[CALENDAR] Impossible de changer le titre de l'évènement : évènement inconnu");
      break;
    case 14:
      K.warn("[CALENDAR] Impossible de changer le titre de l'évènement personnnage non connecté");
      break;
    case 13:
      K.warn("[CLAENDAR] Impossible de changer le titre de l'évènement personnage non propriétaire de l'evenement");
      break;
    case 26:
      K.warn("[CLAENDAR] Impossible de changer le titre de l'évènement car on ne dispose pas des droits nécessaires");
      break;
    case 12:
      CM.LV().f(bU.fH().getString("calendar.event.end.date.preceding.start"), 4);
    default:
      K.error("[CALENDAR] Le serveur envoie un code d'erreur non traité dans le cas d'un message de reponse au changement de desc");
    }

    vL localvL = aca.aoj().cy(paramacJ.JP());
    if (localvL == null) {
      K.warn("[EVENTS_CALENDAR] Bizarre, on a reçu une reponse sur un changement de date de fin d'un event mais nous ne connaissons pas cet event");
      return;
    }
    localvL.f(paramacJ.VN());
  }

  private void a(Bb paramBb) {
    int i = paramBb.Kh();
    vL localvL = aca.aoj().cy(paramBb.Ki());
    if (i == 0) {
      CM.LV().f(bU.fH().getString("calendar.event.removed", new Object[] { abd.d(localvL) }), 4);
      aca.aoj().i(localvL);
      K.info(aca.aoj().toString());
      return;
    }
    if (i == 9) {
      K.info("[CALENDAR] Le serveur a rejeté la demande pour le retrait d'un evenement au calendrier");
      CM.LV().f(bU.fH().getString("calendar.event.removed.error", new Object[] { abd.d(localvL) }), 4);
      return;
    }
    K.error("[CALENDAR] Le serveur envoie un code d'erreur non traité dans le cas d'un message de reponse au retrait d'un evenement");
  }

  private void a(cUW paramcUW) {
    Set localSet = paramcUW.cEK();
    for (Iterator localIterator = localSet.iterator(); localIterator.hasNext(); )
      aca.aoj().f((vL)localIterator.next());
  }

  private void a(dPn paramdPn)
  {
    long l = paramdPn.JP();
    vL localvL = aca.aoj().cy(l);
    byte b = paramdPn.cva();
    switch (b) {
    case 8:
      localvL.a(paramdPn.dbk(), paramdPn.dqy());
      dSG.dsZ().dtb();
      CM.LV().f(bU.fH().getString("calendar.event.invitation.accepted", new Object[] { paramdPn.dqy(), abd.d(localvL) }), 4);
      break;
    case 7:
      CM.LV().f(bU.fH().getString("calendar.event.invitation.refused", new Object[] { paramdPn.dqy(), abd.d(localvL) }), 4);
      break;
    case 5:
      CM.LV().f(bU.fH().getString("calendar.event.invited.not.connected", new Object[] { paramdPn.dqy() }), 4);
      break;
    case 6:
      CM.LV().f(bU.fH().getString("calendar.event.invited.has.pending.invitation", new Object[] { paramdPn.dqy() }), 4);
      break;
    default:
      CM.LV().f(bU.fH().getString("calendar.event.invitation.error", new Object[] { paramdPn.dqy() }), 4);
      a(b, localvL);
    }
  }

  private void a(dFX paramdFX) {
    String str = bU.fH().getString("calendar.event.invitation.message", new Object[] { paramdFX.he(), paramdFX.bip() });
    cKX localcKX = cBQ.cxL().a(str, Cn.et(0), 2073L, 102, 1);

    localcKX.a(new daS(this, paramdFX));
  }

  private void a(cLW paramcLW)
  {
    Set localSet = paramcLW.cEK();

    for (Iterator localIterator = localSet.iterator(); localIterator.hasNext(); ) {
      vL localvL = (vL)localIterator.next();
      aca.aoj().f(localvL);
    }

    dpQ.cXg().cXj();
  }

  private void a(cKK paramcKK) {
    byte b = paramcKK.Kh();
    vL localvL = aca.aoj().cy(paramcKK.JP());
    if (localvL == null) {
      K.warn("On recoit du serveur une reponse d'invalidation de participation sur un event que le client ne connait pas");
      return;
    }

    if (b == 0) {
      String str = localvL.aJ(paramcKK.eq());
      localvL.b(paramcKK.eq(), str);
      dSG.dsZ().dta();
      dSG.dsZ().dtb();
      CM.LV().f(bU.fH().getString("calendar.event.participation.invalidation", new Object[] { str, abd.d(localvL) }), 4);
    } else {
      CM.LV().f(bU.fH().getString("calendar.event.participation.unvalidation.error", new Object[] { abd.d(localvL) }), 4);
      a(b, localvL);
    }
  }

  private void a(bYQ parambYQ) {
    byte b = parambYQ.Kh();
    vL localvL = aca.aoj().cy(parambYQ.JP());
    if (localvL == null) {
      K.warn("On recoit du serveur une reponse de validation de participation sur un event que le client ne connait pas");
      return;
    }

    if (b == 0) {
      String str = localvL.aK(parambYQ.eq());
      localvL.a(parambYQ.eq(), str);
      dSG.dsZ().dta();
      dSG.dsZ().dtb();
      CM.LV().f(bU.fH().getString("calendar.event.participation.validation.success", new Object[] { str, abd.d(localvL) }), 4);
    }
    else {
      CM.LV().f(bU.fH().getString("calendar.event.participation.validation.error", new Object[] { abd.d(localvL) }), 4);

      a(b, localvL);
    }
  }

  private void a(bxg parambxg) {
    byte b = parambxg.Kh();
    vL localvL = aca.aoj().cy(parambxg.JP());
    if (localvL == null) {
      K.warn("On recoit du serveur une reponse d'inscription sur un event que le client ne connait pas");
      return;
    }
    if (b == 0) {
      localvL.b(byv.bFN().bFO().getId(), byv.bFN().bFO().getName());
      dSG.dsZ().dta();
      CM.LV().f(bU.fH().getString("calendar.event.you.inscription.success", new Object[] { abd.d(localvL) }), 4);
      return;
    }
    CM.LV().f(bU.fH().getString("calendar.event.you.inscription.error", new Object[] { localvL.getTitle() }), 3);
    a(b, localvL);
    K.error("[CALENDAR] Le serveur envoie un code d'erreur non traité dans le cas d'un message de reponse a la demande d'inscription");
  }

  private void a(cLK paramcLK) {
    Set localSet = paramcLK.cEK();
    CM.LV().f(bU.fH().getString("calendar.todays.events"), 4);
    for (Iterator localIterator = localSet.iterator(); localIterator.hasNext(); ) {
      vL localvL = (vL)localIterator.next();
      if (localvL != null) {
        String str = bAL.a(bU.fH().getString("calendar.expectations", new Object[] { abd.d(localvL) }), localvL.EQ());
        CM.LV().f(str, 4);
      }
    }
  }

  private void a(dAe paramdAe) {
    byte b = paramdAe.Kh();
    vL localvL = aca.aoj().cA(paramdAe.ddi());
    if (localvL == null) {
      K.warn("Impossible de valider l'ajout de l'evenement chez le client, il ne connait pas l'evenement avec le hashcode specifie");
      CM.LV().f(bU.fH().getString("calendar.events.add.error", new Object[] { "" }), 4);
      dpQ.cXg().cXj();
      return;
    }
    if (b != 0) {
      a(b, localvL);
      K.info("[CALENDAR] Le serveur a rejeté la demande pour l'ajout d'un evenement au calendrier, on retire le dernier evt ajoute par le client");
      aca.aoj().i(localvL);
      dpQ.cXg().cXj();
      return;
    }

    CM.LV().f(bU.fH().getString("calendar.events.add.success", new Object[] { abd.d(localvL) }), 4);
    aca.aoj().n(localvL);

    aca.aoj().a(localvL, paramdAe.ddj());
    dpQ.cXg().cXj();
  }

  private void a(dTx paramdTx) {
    Set localSet = paramdTx.dty().aok();
    for (Iterator localIterator = localSet.iterator(); localIterator.hasNext(); ) {
      vL localvL = (vL)localIterator.next();
      aca.aoj().f(localvL);
    }

    aca.aoj().aom();

    dpQ.cXg().cXj();
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(byte paramByte, vL paramvL) {
    switch (paramByte) {
    case 1:
      CM.LV().f(bU.fH().getString("calendar.events.add.error", new Object[] { abd.d(paramvL) }), 3);

      break;
    case 22:
      CM.LV().f(bU.fH().getString("calendar.events.too.many.for.owner", new Object[] { Byte.valueOf(20) }), 3);

      break;
    case 19:
      CM.LV().f(bU.fH().getString("calendar.event.already.exists", new Object[] { abd.d(paramvL) }), 3);

      break;
    case 27:
      CM.LV().f(bU.fH().getString("calendar.event.start.date.before.today", new Object[] { abd.d(paramvL) }), 3);

      break;
    case 29:
      CM.LV().f(bU.fH().getString("calendar.event.expired", new Object[] { abd.d(paramvL) }), 3);

      break;
    case 28:
      CM.LV().f(bU.fH().getString("calendar.event.already.registered", new Object[] { abd.d(paramvL) }), 3);

      break;
    case 18:
      CM.LV().f(bU.fH().getString("calendar.event.too.much.registrations", new Object[] { abd.d(paramvL) }), 3);

      break;
    case 30:
      CM.LV().f(bU.fH().getString("calendar.event.not.registered", new Object[] { abd.d(paramvL) }), 3);

      break;
    case 17:
      CM.LV().f(bU.fH().getString("calendar.event.too.much.participants", new Object[] { abd.d(paramvL) }), 3);

      break;
    case 13:
      CM.LV().f(bU.fH().getString("calendar.event.you.not.owner", new Object[] { abd.d(paramvL) }), 3);

      break;
    case 32:
      CM.LV().f(bU.fH().getString("calendar.event.not.participant", new Object[] { abd.d(paramvL) }), 3);

      break;
    case 33:
      CM.LV().f(bU.fH().getString("calendar.event.too.much.in.calendar", new Object[] { abd.d(paramvL) }), 3);

      break;
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:
    case 14:
    case 15:
    case 16:
    case 20:
    case 21:
    case 23:
    case 24:
    case 25:
    case 26:
    case 31:
    default:
      CM.LV().f(bU.fH().getString("calendar.events.unknown.error", new Object[] { Byte.valueOf(paramByte) }), 3);
    }
  }
}