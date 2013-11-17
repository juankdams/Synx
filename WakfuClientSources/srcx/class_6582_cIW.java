import org.apache.log4j.Logger;

public class cIW
  implements cvW
{
  protected static final Logger K = Logger.getLogger(cIW.class);

  private static cIW iGZ = new cIW();

  public boolean a(cWG paramcWG)
  {
    byz localbyz = byv.bFN().bFO();
    Object localObject1;
    int i;
    aCH localaCH;
    Object localObject7;
    Object localObject5;
    Object localObject6;
    Object localObject4;
    Object localObject3;
    Object localObject9;
    Object localObject8;
    Object localObject2;
    switch (paramcWG.getId())
    {
    case 4170:
      localObject1 = (aCZ)paramcWG;
      Su localSu1 = CA.Lv().bj(((aCZ)localObject1).cKc());
      if ((((aCZ)localObject1).cKb() == 4) && (((aCZ)localObject1).cdC() == 1) && (localSu1.adF())) {
        return true;
      }
      a(((aCZ)localObject1).cKb(), ((aCZ)localObject1).getData(), ((aCZ)localObject1).cKc(), (short)((aCZ)localObject1).cdC());

      return false;
    case 4172:
      localObject1 = (cnV)paramcWG;
      if ((((cnV)localObject1).cdC() != 1) && (((cnV)localObject1).cKb() != 2)) {
        K.error("Erreur : on recoit un PLANT START MESSAGE pour une occupation ne débutant pas / une occupation autre que PLANT");
        return false;
      }
      i = ((cnV)localObject1).gC();
      localaCH = clR.cni().vL(i);

      if (((cnV)localObject1).cKc() == localbyz.getId()) {
        long l1 = ((cnV)localObject1).getDuration();
        int k = ((cnV)localObject1).axX();

        localObject7 = new adh(((cnV)localObject1).bxE(), ((cnV)localObject1).bxF());
        ((adh)localObject7).cE(l1);
        ((adh)localObject7).hJ(k);
        ((adh)localObject7).a(localaCH);
        if (((adh)localObject7).fV()) {
          ((adh)localObject7).begin();
        }
        return false;
      }

      Su localSu2 = CA.Lv().bj(((cnV)localObject1).cKc());
      if (localSu2 == null) {
        K.error("[PLANT OCCUPATION] Uknown Mobile");
        return false;
      }
      localObject5 = localSu2.aeL();

      if (((cew)localObject5).dpz() != null) {
        localObject6 = new Gc(localSu2, i, ((cnV)localObject1).bxE(), ((cnV)localObject1).bxF());
        localSu2.a((Gc)localObject6);
        return false;
      }

      localObject6 = clR.cni().vL(i);
      if (localObject6 != null)
      {
        localObject7 = acL.apd().aP(((cnV)localObject1).bxE(), ((cnV)localObject1).bxF());
        if (localObject7 != null) {
          K.error("On a recu un début de plantation sur une place non libre ! ");
        }
        dgM.a((dMM)localObject5, (aCH)localObject6);
        return false;
      }

      return false;
    case 4218:
      localObject1 = (aXv)paramcWG;
      if ((((aXv)localObject1).cdC() != 1) && (((aXv)localObject1).cKb() != 26)) {
        K.error("Erreur : on recoit un SEARCH TREASURE START MESSAGE pour une occupation ne débutant pas / une occupation autre que SEARCH_TREASURE");
        return false;
      }
      i = ((aXv)localObject1).gC();
      localaCH = clR.cni().vL(i);

      if (((aXv)localObject1).cKc() == localbyz.getId()) {
        long l2 = ((aXv)localObject1).getDuration();

        localObject6 = new bNP(((aXv)localObject1).getX(), ((aXv)localObject1).getY(), ((aXv)localObject1).IB());
        ((bNP)localObject6).cE(l2);
        ((bNP)localObject6).a(localaCH);
        if (((bNP)localObject6).fV()) {
          ((bNP)localObject6).begin();
        }
        return false;
      }

      localObject4 = CA.Lv().bj(((aXv)localObject1).cKc());
      if (localObject4 == null) {
        K.error("[SEARCH TREASURE OCCUPATION] Uknown Mobile");
        return false;
      }
      localObject5 = ((Su)localObject4).aeL();

      if (((cew)localObject5).dpz() != null) {
        localObject6 = new Gc((Su)localObject4, i, ((aXv)localObject1).getX(), ((aXv)localObject1).getY());
        ((Su)localObject4).a((Gc)localObject6);
        return false;
      }

      localObject6 = clR.cni().vL(i);
      if (localObject6 != null)
      {
        localObject7 = acL.apd().aP(((aXv)localObject1).getX(), ((aXv)localObject1).getY());
        if (localObject7 != null) {
          K.error("On a recu un début de recherche de trésor sur une place non libre ! ");
        }
        dgM.a((dMM)localObject5, (aCH)localObject6);
        return false;
      }

      return false;
    case 4174:
      localObject1 = (aMf)paramcWG;
      if (((aMf)localObject1).cKb() != 3) {
        K.error("Message COLLECT START reçu avec de mauvais paramètres");
        return false;
      }

      i = ((aMf)localObject1).acH();
      if (((aMf)localObject1).cKc() == localbyz.getId()) {
        int j = ((aMf)localObject1).acF();
        if (j == 7) {
          return false;
        }

        if (j == 4) {
          CM.LV().f(bU.fH().getString("collect.error.resourceOccupied"), 3);
          return false;
        }

        if (!localbyz.aTn().contains(i)) {
          K.error("le joueur ne possède pas ce skill " + i);
          return false;
        }

        if (j == 5) {
          K.error("COLLECT START : erreur, on obtient un message success.");
        } else {
          localObject4 = acL.apd().aP(((aMf)localObject1).getX(), ((aMf)localObject1).getY());
          localObject5 = ((azX)localObject4).lq(((aMf)localObject1).eo());

          if (localObject4 == null) {
            return false;
          }

          boolean bool1 = j == 1;

          localObject7 = new bqo((bKi)localObject5, (azX)localObject4);
          ((bqo)localObject7).fT(((aMf)localObject1).acG());
          ((bqo)localObject7).cX(((aMf)localObject1).acK());
          ((bqo)localObject7).fb(bool1);
          if (((bqo)localObject7).fV()) {
            ((bqo)localObject7).s(((aMf)localObject1).bdv());
          }
        }
      }
      else
      {
        localObject3 = CA.Lv().bj(((aMf)localObject1).cKc());

        if (localObject3 == null) {
          K.error("[COLLECT MODIF] Pas de character retrouvé");
        }
        else {
          localObject4 = ((Su)localObject3).aeL();

          localObject5 = acL.apd().aP(((aMf)localObject1).getX(), ((aMf)localObject1).getY());
          if (localObject5 == null) {
            K.error("Collect Start : aucune ressource à la position indiquée");
            return false;
          }

          bKi localbKi = ((azX)localObject5).lq(((aMf)localObject1).eo());
          if (localbKi == null) {
            K.error("pas d'action avec l'id " + ((aMf)localObject1).eo());
          }

          if (localObject5 == localbyz.aeS()) {
            boolean bool2 = ((aMf)localObject1).acF() == 1;
            if (localbyz.bSe().fU() == 3) {
              localObject9 = (bqo)localbyz.bSe();
              ((bqo)localObject9).fT(((aMf)localObject1).acG());
              ((bqo)localObject9).cX(((aMf)localObject1).acK());
              ((bqo)localObject9).fb(bool2);
              if (((bqo)localObject9).fV()) {
                ((bqo)localObject9).t(((aMf)localObject1).bdv());
              }

            }

          }

          localObject8 = (bVw)Hh.QM().dh(((aMf)localObject1).aFY());
          if (((cew)localObject4).dpz() != null) {
            ((cew)localObject4).b(new dyp(this, (bVw)localObject8, (cew)localObject4, localbKi, (Su)localObject3, (azX)localObject5, i));
          }
          else
          {
            if (localObject8 != null) {
              ((cew)localObject4).a((bBn)localObject8, (short)azO.dRO.hV);
            }
            a(localbKi, (Su)localObject3, (azX)localObject5, (cew)localObject4, i);
          }
        }
      }

      return false;
    case 4168:
      localObject1 = (er)paramcWG;

      if (((er)localObject1).cKb() != 6) {
        K.error("Message COLLECT MONSTER START reçu avec de mauvais paramètres");
        return false;
      }

      localObject2 = (byo)CA.Lv().bj(((er)localObject1).lm());
      if (localObject2 == null) {
        K.error("Message COLLECT MONSTER START reçu avec une cible invalide");
        return false;
      }

      localObject3 = (bKi)((byo)localObject2).bFD().vV(((er)localObject1).lk());
      if (localObject3 == null) {
        K.error("skillAction inconnu id= " + ((er)localObject1).lk());
        return false;
      }

      if (((er)localObject1).cKc() == localbyz.getId()) {
        if ((((bKi)localObject3).axX() != 0) && (!localbyz.aTn().contains(((bKi)localObject3).axX()))) {
          K.error("le joueur ne possède pas ce craft " + ((bKi)localObject3).axX());
          return false;
        }

        localObject4 = new bps((bKi)localObject3, (byo)localObject2);
        ((bps)localObject4).fT(((er)localObject1).ll());
        if (((bps)localObject4).fV()) {
          ((bps)localObject4).begin();
        }
      }
      else
      {
        localObject4 = CA.Lv().bj(((er)localObject1).cKc());

        if (localObject4 == null) {
          K.error("[COLLECT MODIF] Pas de character retrouvé");
        }
        else {
          localObject5 = ((Su)localObject4).aeL();

          int m = ((bKi)localObject3).gC();

          if (((cew)localObject5).dpz() != null) {
            localObject8 = new Gc((Su)localObject4, m, ((byo)localObject2).ML().getX(), ((byo)localObject2).ML().getY());
            ((Su)localObject4).a((Gc)localObject8);
          }
          else {
            localObject8 = clR.cni().vL(m);
            if (localObject8 != null) {
              ((Su)localObject4).b(((byo)localObject2).aeL());
              localObject9 = ((cew)localObject5).ata().split("-");
              String str = localObject2 == null ? "" : dgM.d((aCH)localObject8);
              if (!localObject9[0].equals(str))
                dgM.a((dMM)localObject5, (aCH)localObject8);
            }
            else {
              K.error("Action Description non trouvée pour le monstre " + ((byo)localObject2).getId() + " et le skill " + ((bKi)localObject3).axX());
            }
          }
        }
      }

      return false;
    case 4206:
      localObject1 = (dav)paramcWG;

      if (((dav)localObject1).cKb() != 13) {
        K.error("Message DISTRIBUTION reçu avec de mauvais paramètres");
        return false;
      }

      localObject2 = (Od)ayg.aJQ().dw(((dav)localObject1).cwa());
      if (localObject2 == null) {
        K.error("Message COLLECT MONSTER START reçu avec une cible invalide");
        return false;
      }

      localObject3 = CA.Lv().bj(((dav)localObject1).cKc());
      if (localObject3 == null) {
        K.error("Message SIT_OCCUPATION_START_MESSAGE reçu avec un character player invalide");
        return false;
      }

      localObject4 = new ccK((Od)localObject2);
      ((ccK)localObject4).fT(((dav)localObject1).ll());
      if (((ccK)localObject4).fV()) {
        ((ccK)localObject4).begin();
      }

      return false;
    case 15724:
      localObject1 = (cdn)paramcWG;

      localObject2 = (cTf)ayg.aJQ().dw(((cdn)localObject1).apb());
      if (localObject2 == null) {
        K.error("Message SIT_OCCUPATION_START_MESSAGE reçu avec un stool invalide");
        return false;
      }

      localObject3 = CA.Lv().bj(((cdn)localObject1).aFL());
      if (localObject3 == null) {
        K.error("Message SIT_OCCUPATION_START_MESSAGE reçu avec un character player invalide");
        return false;
      }
      localObject4 = new aYR((Su)localObject3, (cTf)localObject2);
      if (((aYR)localObject4).fV()) {
        ((aYR)localObject4).begin();
        if (localObject3 == localbyz) {
          byv.bFN().a(cFZ.cBs());
        }
      }

      return false;
    }
    return true;
  }

  private void a(bKi parambKi, Su paramSu, azX paramazX, cew paramcew, byte paramByte) {
    aCH localaCH = clR.cni().vL(parambKi.gC());
    if (localaCH == null) {
      K.error("Action Description non trouvée pour ressource " + paramazX.getId() + " et  la skill " + paramByte);
      return;
    }
    paramSu.b(paramazX);
    String[] arrayOfString = paramcew.ata().split("-");
    String str = dgM.d(localaCH);
    if (!arrayOfString[0].equals(str))
      dgM.a(paramcew, localaCH);
  }

  public void a(short paramShort1, byte[] paramArrayOfByte, long paramLong, short paramShort2)
  {
    byz localbyz = byv.bFN().bFO();
    Object localObject2;
    switch (paramShort1)
    {
    case 20:
      localObject1 = CA.Lv().bj(paramLong);
      if (localObject1 == null) {
        K.error("[EMOTE] Personnage inexistant : " + paramLong);
        return;
      }

      if (paramShort2 == 1) {
        localObject2 = new cg((Su)localObject1);
        ((cg)localObject2).b(paramArrayOfByte);
        if (((cg)localObject2).fV())
          ((cg)localObject2).begin();
      }
      else if (paramShort2 == 2) {
        if ((((Su)localObject1).bSB() != null) && (((Su)localObject1).bSB().fU() == 20))
          ((Su)localObject1).bSf();
        else {
          K.error("[EMOTE] Demande d'arrêt d'occupation alors que le personnage est en " + ((Su)localObject1).bSB());
        }
      }
      return;
    case 1:
      localObject1 = CA.Lv().bj(paramLong);
      if (localObject1 != null) {
        if (paramShort2 == 1) {
          localObject2 = new ddk((Su)localObject1);
          if (((ddk)localObject2).fV())
            ((ddk)localObject2).begin();
        }
        else if (paramShort2 == 2) {
          if ((((Su)localObject1).bSB() != null) && (((Su)localObject1).bSB().fU() == 1))
            ((Su)localObject1).bSf();
          else
            K.error("[REST_OCCUPATION] Demande d'annulation alors que le personnage est en " + ((Su)localObject1).bSB());
        }
      }
      else {
        K.error("[REST_OCCUPATION] Personnage inexistant : " + paramLong);
      }
      return;
    case 3:
      if (paramShort2 == 3)
      {
        if (paramLong == localbyz.getId()) {
          if (localbyz.bSe() != null) {
            if (localbyz.bSe().fU() == 3) {
              localbyz.q(true, false);
            }
          }
          else {
            K.info("Pas d'occupation en cours, occupation déja terminée");
          }
        }
        else
        {
          localObject1 = CA.Lv().bj(paramLong);

          if (localObject1 == null) {
            K.error("[COLLECT ANNULATION] Pas de character retrouvé");
            return;
          }
          localObject2 = ((Su)localObject1).aeL();
          if (((cew)localObject2).bHi() != null) {
            ((cew)localObject2).bHi().cvS();
            return;
          }

        }

      }

    case 4:
      localObject1 = paramLong == localbyz.getId() ? localbyz : (bKm)CA.Lv().bj(paramLong);

      if (localObject1 == null) {
        K.info("Demande de début ou de fin d'occupation (death) pour un joueur non connu");
        return;
      }

      switch (paramShort2) {
      case 1:
        localObject2 = new aMb((bKm)localObject1);
        if (((aMb)localObject2).fV()) {
          ((aMb)localObject2).begin();
        }
        return;
      case 2:
        localObject2 = ((bKm)localObject1).bSe();
        if (!(localObject2 instanceof aMb)) {
          return;
        }
        ((bKm)localObject1).bSf();
        return;
      }

      return;
    case 5:
      if ((paramLong == localbyz.getId()) && (paramShort2 == 3))
      {
        K.info("Recu demande d'annulation du browsing du local player");
        localObject1 = localbyz.bSe();
        if ((localObject1 != null) && ((localObject1 instanceof dvD))) {
          localbyz.q(true, false);
        }
      }

      return;
    case 7:
      if ((paramLong == localbyz.getId()) && (paramShort2 == 3))
      {
        K.info("Recu demande d'annulation du managing du local player");
        localObject1 = localbyz.bSe();
        if ((localObject1 != null) && ((localObject1 instanceof Du))) {
          localbyz.q(true, false);
        }
      }

      return;
    case 16:
      localObject1 = CA.Lv().bj(paramLong);
      if (localObject1 != null) {
        if (paramShort2 == 3)
          ((Su)localObject1).q(true, false);
        else if (paramShort2 == 2)
          ((Su)localObject1).bSf();
      }
      else {
        K.error("[REST_OCCUPATION] Personnage inexistant : " + paramLong);
      }
      return;
    case 25:
      if ((paramShort2 != 1) || 
        (paramShort2 == 3)) {
        K.info("Recu demande d'annulation du managing du local player");
        localObject1 = localbyz.bSe();
        if ((localObject1 != null) && ((localObject1 instanceof Du))) {
          localbyz.q(true, false);
        }
      }
      return;
    case 2:
    case 6:
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    case 14:
    case 15:
    case 17:
    case 18:
    case 19:
    case 21:
    case 22:
    case 23:
    case 24: } Object localObject1 = CA.Lv().bj(paramLong);
    if (localObject1 != null) {
      if (paramShort2 == 3)
        ((Su)localObject1).q(true, false);
      else if (paramShort2 == 2)
        ((Su)localObject1).bSf();
    }
    else {
      K.error("[OCCUPATION] Personnage inexistant : " + paramLong);
    }

    if (paramShort2 == 3) {
      if (paramLong != localbyz.getId()) {
        K.error("Message d'annulation reçu pour un autre client que le localplayer");
        return;
      }
      if (localbyz.bSe() == null) {
        K.info("Occupation déja terminée");
        return;
      }
      if (localbyz.bSe().fU() == paramShort1)
        localbyz.q(true, false);
      else
        K.error("Message d'annulation recu pour une occupation différente de celle en cours");
    }
  }

  public void a(aqv paramaqv, boolean paramBoolean)
  {
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public static cIW cDt()
  {
    return iGZ;
  }
}