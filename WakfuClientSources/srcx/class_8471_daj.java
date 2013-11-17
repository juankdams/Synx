import java.util.ArrayList;
import java.util.LinkedList;

public class daj
{
  public static final String kPa = "or";
  public static final String kPb = "critere.true";
  public static final String kPc = "critere.false";
  public static final String kPd = "critere.hp";
  public static final String kPe = "critere.ap";
  public static final String kPf = "critere.mp";
  public static final String kPg = "critere.wp";
  public static final String kPh = "critere.chrage";
  public static final String kPi = "critere.control";
  public static final String kPj = "LEADERSHIPShort";
  public static final String kPk = "critere.casterbreed";
  public static final String kPl = "critere.targetbreed";
  public static final String kPm = "critere.casterbreedId";
  public static final String kPn = "critere.targetbreedId";
  public static final String kPo = "critere.nottargetbreedid";
  public static final String kPp = "critere.hassummon";
  public static final String kPq = "critere.nothassummon";
  public static final String kPr = "critere.hasequip";
  public static final String kPs = "critere.nothasequip";
  public static final String kPt = "critere.hasequipwithpos";
  public static final String kPu = "critere.nothasequipwithpos";
  public static final String kPv = "critere.targethour";
  public static final String kPw = "critere.nottargethour";
  public static final String kPx = "critere.isennemy";
  public static final String kPy = "critere.isnotennemy";
  public static final String kPz = "critere.petinrange";
  public static final String kPA = "critere.summoned";
  public static final String kPB = "critere.not.summoned";
  public static final String kPC = "critere.beaconamount";
  public static final String kPD = "critere.barrelamount";
  public static final String kPE = "critere.trapamount";
  public static final String kPF = "critere.nbsummons";
  public static final String kPG = "critere.nbroublabot";
  public static final String kPH = "critere.inf";
  public static final String kPI = "critere.sup";
  public static final String kPJ = "critere.infeq";
  public static final String kPK = "critere.supeq";
  public static final String kPL = "critere.isSex.";
  public static final String kPM = "critere.getSpellTreeLevel";
  public static final String kPN = "critere.kamaCount";
  public static final String kPO = "critere.hasState";
  public static final String kPP = "critere.notHasState";
  public static final String kPQ = "critere.hasStateFromLevel";
  public static final String kPR = "critere.notHasStateFromLevel";
  public static final String kPS = "critere.hasCraft";
  public static final String kPT = "critere.notHasCraft";
  public static final String kPU = "critere.symbiotSpace";
  public static final String kPV = "critere.craftLevel";
  public static final String kPW = "critere.getWakfuGaugeValue";
  public static final String kPX = "critere.getStasisGauge";
  public static final String kPY = "critere.getCrimeScore";
  public static final String kPZ = "critere.isDead";
  public static final String kQa = "critere.isNotDead";
  public static final String kQb = "critere.istargetonsameteam";
  public static final String kQc = "critere.notistargetonsameteam";
  public static final String kQd = "critere.getZoneWakfu";
  public static final String kQe = "critere.getZoneStasis";
  public static final String kQf = "critere.hasSummonWithBreed";
  public static final String kQg = "critere.nothasSummonWithBreed";
  public static final String kQh = "critere.getInstanceId";
  public static final String kQi = "critere.notGetInstanceId";
  public static final String kQj = "critere.getNationId";
  public static final String kQk = "critere.notGetNationId";
  public static final String kQl = "critere.getNationAlignment";
  public static final String kQm = "critere.getNoNationAlignment";
  public static final String kQn = "critere.target";
  public static final String kQo = "critere.isCarryingOwnBarrel";
  public static final String kQp = "critere.hasSurrondingCellWithOwnBarrel";
  public static final String kQq = "critere.distanceBetweenTargetAndNearestAllyBeacon";
  public static final String kQr = "critere.isTargetCellValidForNewObstacle";
  public static final String kQs = "critere.nbBombs";
  public static final String kQt = "critere.getTotalLeadership";
  public static final String kQu = "critere.hasAvailableCreature";
  public static final String kQv = "critere.isOnOwnDial";
  public static final String kQw = "critere.not.isCarried";
  public static final String kQx = "critere.isCarried";
  public static final String kQy = "critere.add";
  public static final String kQz = "critere.guildLevel";
  public static final String kQA = "critere.guildBonus";
  public static final String kQB = "critere.hasAnotherSameEquipment";
  public static final String kQC = "critere.isOnHour";
  public static final String kQD = "critere.notIsOnHour";
  public static final String kQE = "critere.hasEquipmentId";

  public static ArrayList ae(ArrayList paramArrayList)
  {
    bHu localbHu = null;
    cyE localcyE1 = null;
    cyE localcyE2 = null;
    il localil1 = null;
    il localil2 = null;
    il localil3 = null;
    il localil4 = null;
    Object localObject1 = null;
    Object localObject2;
    int i1;
    int i2;
    for (int i = 0; i < paramArrayList.size(); i++) {
      localObject2 = (bZA)paramArrayList.get(i);
      if (localObject2 != null)
      {
        LinkedList localLinkedList = b((bZA)localObject2);
        for (bZA localbZA : localLinkedList) {
          int n = 0;
          i1 = 0;
          i2 = 0;
          int i3 = 0;
          aOw localaOw1 = null;
          aOw localaOw2 = null;

          Enum localEnum = localbZA.gm();
          Object localObject4;
          int i4;
          if ((localEnum instanceof apd)) {
            switch (cmn.hRg[((apd)localEnum).ordinal()]) {
            case 1:
              localObject4 = (abo)localbZA;
              if (((abo)localObject4).Ma().sc()) {
                n = 1;
                localaOw1 = ((abo)localObject4).Ma();
                localaOw2 = ((abo)localObject4).Mb();
              } else {
                i1 = 1;
                localaOw2 = ((abo)localObject4).Ma();
                localaOw1 = ((abo)localObject4).Mb();
              }

              break;
            case 2:
              localObject4 = (blf)localbZA;
              if (((blf)localObject4).Ma().sc()) {
                i2 = 1;
                localaOw1 = ((blf)localObject4).Ma();
                localaOw2 = ((blf)localObject4).Mb();
              } else {
                i3 = 1;
                localaOw2 = ((blf)localObject4).Ma();
                localaOw1 = ((blf)localObject4).Mb();
              }

              break;
            case 3:
              localObject4 = (cMz)localbZA;
              i2 = 1;
              i3 = 1;
              if (((cMz)localObject4).Ma().sc()) {
                localaOw1 = ((cMz)localObject4).Ma();
                localaOw2 = ((cMz)localObject4).Mb();
              } else {
                localaOw2 = ((cMz)localObject4).Ma();
                localaOw1 = ((cMz)localObject4).Mb();
              }

              break;
            }

          }
          else if ((localEnum instanceof Bz)) {
            switch (cmn.hRh[((Bz)localEnum).ordinal()]) {
            case 1:
              localObject4 = (diB)localbZA;
              if (localbHu == null)
                localbHu = ((diB)localObject4).bKM();
              else {
                for (i4 = 0; i4 < localbHu.size(); i4++) {
                  if (!((diB)localObject4).bKM().contains(localbHu.get(i4))) {
                    localbHu.aP(i4);
                  }
                }
              }
              break;
            }
          }
          if ((localaOw1 != null) && ((localEnum instanceof Bz)));
          switch (cmn.hRh[((Bz)localEnum).ordinal()]) {
          case 2:
            localObject4 = (bIn)localaOw2;
            i4 = ((bIn)localObject4).Uq();
            if (i4 != -1) {
              if ((i2 != 0) || (n != 0)) {
                if (localil2 == null) {
                  localil2 = new il();
                }
                if (n != 0)
                  localil2.a(i4, (short)(int)Math.max(localil2.get(i4), localaOw1.c(null, null, null, null) + 1.0D));
                else
                  localil2.a(i4, (short)(int)Math.max(localil2.get(i4), localaOw1.c(null, null, null, null)));
              } else {
                if (localil4 == null) {
                  localil4 = new il();
                }
                if (i1 != 0) {
                  localil4.a(i4, (short)(int)Math.min(localil4.contains(i4) ? localil4.get(i4) : 32767, localaOw1.c(null, null, null, null) - 1.0D));
                }
                else
                  localil4.a(i4, (short)(int)Math.min(localil4.contains(i4) ? localil4.get(i4) : 32767, localaOw1.c(null, null, null, null)));
              }
            }
            else if (localObject1 != null) {
              localObject1.add(localbZA);
            }
            break;
          case 3:
            localObject4 = (cCJ)localaOw2;
            i4 = ((cCJ)localObject4).Fh();
            if (i4 != -1) {
              if ((i2 != 0) || (n != 0)) {
                if (localil1 == null) {
                  localil1 = new il();
                }
                if (n != 0)
                  localil1.a(i4, (short)(int)Math.max(localil1.get(i4), localaOw1.c(null, null, null, null) + 1.0D));
                else
                  localil1.a(i4, (short)(int)Math.max(localil2.get(i4), localaOw1.c(null, null, null, null)));
              } else {
                if (localil3 == null) {
                  localil3 = new il();
                }
                if (i1 != 0) {
                  localil3.a(i4, (short)(int)Math.min(localil3.contains(i4) ? localil3.get(i4) : 32767, localaOw1.c(null, null, null, null) - 1.0D));
                }
                else
                  localil4.a(i4, (short)(int)Math.min(localil3.contains(i4) ? localil3.get(i4) : 32767, localaOw1.c(null, null, null, null)));
              }
            }
            else if (localObject1 != null) {
              localObject1.add(localbZA);
            }
            break;
          case 4:
            localObject4 = (ZD)localaOw2;
            i4 = ((ZD)localObject4).akK().bJ();
            if ((i2 != 0) || (n != 0)) {
              if (localcyE1 == null) {
                localcyE1 = new cyE();
              }
              if (n != 0)
                localcyE1.c(i4, (short)(int)Math.max(localcyE1.ea(i4), localaOw1.c(null, null, null, null) + 1.0D));
              else
                localcyE1.c(i4, (short)(int)Math.max(localcyE1.ea(i4), localaOw1.c(null, null, null, null)));
            } else {
              if (localcyE2 == null) {
                localcyE2 = new cyE();
              }
              if (i1 != 0) {
                localcyE2.c(i4, (short)(int)Math.min(localcyE2.contains(i4) ? localcyE2.ea(i4) : 32767, localaOw1.c(null, null, null, null) - 1.0D));
              }
              else {
                localcyE2.c(i4, (short)(int)Math.min(localcyE2.contains(i4) ? localcyE2.ea(i4) : 32767, localaOw1.c(null, null, null, null)));
              }
            }
            break;
          default:
            if (localObject1 != null) {
              localObject1.add(localbZA); break;

              if ((localaOw1 != null) && ((localEnum instanceof apd))) {
                switch (cmn.hRg[((apd)localEnum).ordinal()]) {
                }
                if (localObject1 != null)
                  localObject1.add(localbZA); 
              }
            }
            break;
          }
        }
      }
    }
    ArrayList localArrayList = new ArrayList();

    if (localbHu != null) {
      localObject2 = cxo.feH.getString("critere.casterbreed");
      for (int j = 0; j < localbHu.size(); j++) {
        localObject2 = (String)localObject2 + " " + cxo.ilm.ol(localbHu.get(j));
      }
      localArrayList.add(localObject2);
    }
    for (eu localeu : eu.values()) {
      i1 = 0;
      i2 = 0;
      if ((localcyE1 != null) && 
        (localcyE1.ea(localeu.bJ()) > 0))
        i1 = localcyE1.ea(localeu.bJ());
      if ((localcyE2 != null) && 
        (localcyE2.ea(localeu.bJ()) > 0))
        i2 = localcyE2.ea(localeu.bJ());
      if ((i2 > 0) && (i1 > 0)) {
        if (i1 < i2)
          localArrayList.add(i1 + " < " + m(localeu) + " < " + i2);
        else
          localArrayList.add(m(localeu) + " = " + i1);
      } else if (i2 > 0)
        localArrayList.add(m(localeu) + " < " + i2);
      else if (i1 > 0)
        localArrayList.add(m(localeu) + " > " + i1);
    }
    if (localil1 != null)
      for (??? = localil1.qd(); ((BZ)???).hasNext(); ) {
        ((BZ)???).fl();
        locallZ = cxo.ill.cLY();
        localbfE = cxo.ilm.bu((short)((BZ)???).zY());
        cxo.ilm.a(locallZ, localbfE.bsL());
        locallZ.a(" > ").o(((BZ)???).Lb());
        localArrayList.add(locallZ.tP());
      }
    lZ locallZ;
    bfE localbfE;
    if (localil3 != null) {
      for (??? = localil3.qd(); ((BZ)???).hasNext(); ) {
        ((BZ)???).fl();
        locallZ = cxo.ill.cLY();
        localbfE = cxo.ilm.bu((short)((BZ)???).zY());
        cxo.ilm.a(locallZ, localbfE.bsL());
        locallZ.a(" < ").o(((BZ)???).Lb());
        localArrayList.add(locallZ.tP());
      }
    }
    if (localil2 != null) {
      for (??? = localil2.qd(); ((BZ)???).hasNext(); ) {
        ((BZ)???).fl();
        locallZ = cxo.ill.cLY();
        cxo.ilm.bv((short)((BZ)???).zY());
        locallZ.a(" > ").o(((BZ)???).Lb());
        localArrayList.add(locallZ.tP());
      }
    }
    if (localil4 != null)
      for (??? = localil4.qd(); ((BZ)???).hasNext(); ) {
        ((BZ)???).fl();
        locallZ = cxo.ill.cLY();
        cxo.ilm.bv((short)((BZ)???).zY());
        locallZ.a(" < ").o(((BZ)???).Lb());
        localArrayList.add(locallZ.tP());
      }
    return localArrayList;
  }

  public static LinkedList b(bZA parambZA) {
    if (parambZA == null) {
      return null;
    }
    if (parambZA.gm() == apd.duF) {
      localObject = (pP)parambZA;
      LinkedList localLinkedList = new LinkedList();
      localLinkedList.addAll(b(((pP)localObject).xd()));
      localLinkedList.addAll(b(((pP)localObject).xe()));
      return localLinkedList;
    }
    Object localObject = new LinkedList();
    ((LinkedList)localObject).add(parambZA);
    return localObject;
  }

  public static String m(eu parameu)
  {
    if (parameu == eu.ayM) {
      return cxo.feH.getString("critere.hp");
    }
    if (parameu == eu.ayN) {
      return cxo.feH.getString("critere.ap");
    }
    if (parameu == eu.ayP) {
      return cxo.feH.getString("critere.wp");
    }
    if (parameu == eu.ayO) {
      return cxo.feH.getString("critere.mp");
    }
    if (parameu == eu.ayW) {
      return cxo.feH.getString("LEADERSHIPShort");
    }
    if (parameu == eu.ayV) {
      return cxo.feH.getString("LEADERSHIPShort");
    }
    if (parameu == eu.azr) {
      return cxo.feH.getString(cxo.pO);
    }
    if (parameu == eu.azt) {
      return cxo.feH.getString(cxo.pM);
    }
    if (parameu == eu.azu) {
      return cxo.feH.getString(cxo.STRENGTH);
    }
    if (parameu == eu.azs) {
      return cxo.feH.getString(cxo.pN);
    }
    if (parameu == eu.azv) {
      return cxo.feH.getString(cxo.pP);
    }
    if (parameu == eu.azw) {
      return cxo.feH.getString(cxo.pL);
    }
    if (parameu == eu.azE) {
      return cxo.ilm.bmI();
    }
    return "";
  }

  public static String a(dKY paramdKY) {
    if (!paramdKY.isDisplayable())
      return "";
    Enum localEnum = paramdKY.gm();
    Object localObject1 = "";
    Object localObject8;
    Object localObject10;
    Object localObject3;
    if ((localEnum instanceof apd))
    {
      Object localObject2;
      Object localObject5;
      switch (cmn.hRg[((apd)localEnum).ordinal()]) {
      case 1:
        localObject2 = (abo)paramdKY;
        localObject5 = a(((abo)localObject2).Ma());
        localObject8 = a(((abo)localObject2).Mb());
        if ((((String)localObject5).length() == 0) || (((String)localObject8).length() == 0))
          return "";
        if (((abo)localObject2).Mb().sc())
          localObject1 = cxo.feH.getString("critere.inf", new Object[] { localObject5, localObject8 });
        else if (((abo)localObject2).Ma().sc())
          localObject1 = cxo.feH.getString("critere.sup", new Object[] { localObject8, localObject5 });
        else {
          localObject1 = cxo.feH.getString("critere.inf", new Object[] { localObject5, localObject8 });
        }
        break;
      case 2:
        localObject2 = (blf)paramdKY;
        localObject5 = a(((blf)localObject2).Ma());
        localObject8 = a(((blf)localObject2).Mb());
        if ((((String)localObject5).length() == 0) || (((String)localObject8).length() == 0))
          return "";
        if (((blf)localObject2).Mb().sc())
          localObject1 = cxo.feH.getString("critere.infeq", new Object[] { localObject5, a(((blf)localObject2).Mb()) });
        else if (((blf)localObject2).Ma().sc())
          localObject1 = cxo.feH.getString("critere.supeq", new Object[] { a(((blf)localObject2).Mb()), localObject5 });
        else {
          localObject1 = cxo.feH.getString("critere.infeq", new Object[] { localObject5, a(((blf)localObject2).Mb()) });
        }
        break;
      case 4:
        localObject2 = (pP)paramdKY;
        localObject5 = a(((pP)localObject2).xd());
        localObject8 = a(((pP)localObject2).xe());
        if ((((String)localObject5).length() == 0) && (((String)localObject8).length() == 0))
          return "";
        if (((String)localObject5).length() == 0)
          localObject1 = localObject8;
        else if (((String)localObject8).length() == 0)
          localObject1 = localObject5;
        else
          localObject1 = (String)localObject5 + (((String)localObject5).length() > 0 ? "\n" : "") + (String)localObject8;
        break;
      case 3:
        boolean bool1;
        if ((paramdKY instanceof cMz)) {
          localObject10 = (cMz)paramdKY;
          localObject5 = ((cMz)localObject10).Ma();
          localObject8 = ((cMz)localObject10).Mb();
          bool1 = true;
        } else {
          localObject10 = (cJf)paramdKY;
          localObject5 = ((cJf)localObject10).Ma();
          localObject8 = ((cJf)localObject10).Mb();
          bool1 = false;
        }

        if (((aOw)localObject5).sc())
          localObject1 = a((dKY)localObject8, (dKY)localObject5, bool1);
        else {
          localObject1 = a((dKY)localObject5, (dKY)localObject8, bool1);
        }
        break;
      case 5:
        localObject3 = (dJv)paramdKY;
        localObject5 = a(((dJv)localObject3).xe());
        localObject8 = a(((dJv)localObject3).xd());
        if ((((String)localObject8).length() == 0) && (((String)localObject5).length() == 0))
          return "";
        if (((String)localObject8).length() == 0)
          localObject1 = localObject5;
        else if (((String)localObject5).length() == 0)
          localObject1 = localObject8;
        else
          localObject1 = (String)localObject5 + '\n' + cxo.feH.getString("or") + " " + (String)localObject8;
        break;
      case 6:
        localObject3 = (cic)paramdKY;
        localObject1 = ((cic)localObject3).getValue();
        break;
      case 7:
        localObject3 = (ciM)paramdKY;
        localObject1 = String.valueOf(((ciM)localObject3).b(null, null, null, null));
        break;
      case 8:
        localObject3 = (CT)paramdKY;
        localObject5 = a(((CT)localObject3).Ma());
        localObject8 = a(((CT)localObject3).Mb());
        if ((((String)localObject5).length() == 0) && (((String)localObject8).length() == 0))
          return "";
        if (((String)localObject5).length() == 0)
          return localObject8;
        if (((String)localObject8).length() == 0) {
          return localObject5;
        }
        localObject1 = cxo.feH.getString("critere.add", new Object[] { localObject5, localObject8 });
        break;
      default:
        localObject1 = "";
        break;
      }
    }
    else if ((localEnum instanceof Bz))
    {
      int i;
      String str1;
      boolean bool3;
      int m;
      Object localObject11;
      int i1;
      Object localObject6;
      Object localObject9;
      Object localObject4;
      Object localObject7;
      switch (cmn.hRh[((Bz)localEnum).ordinal()]) {
      case 4:
        localObject3 = (ZD)paramdKY;
        localObject1 = m(((ZD)localObject3).akK());
        break;
      case 5:
        localObject3 = (dRN)paramdKY;
        localObject1 = m(((dRN)localObject3).akK()) + " " + cxo.feH.getString(cxo.oe);
        break;
      case 6:
        localObject3 = (dPk)paramdKY;
        localObject1 = m(((dPk)localObject3).akK()) + " %";
        break;
      case 7:
        localObject1 = cxo.feH.getString(cxo.GB);
        break;
      case 2:
        localObject3 = (bIn)paramdKY;
        i = ((bIn)localObject3).Uq();
        if (i != -1)
          localObject1 = cxo.ilm.bv((short)i);
        else
          localObject1 = "";
        break;
      case 3:
        localObject3 = (cCJ)paramdKY;
        i = ((cCJ)localObject3).Fh();
        if (i != -1) {
          localObject8 = cxo.ill.cLY();
          localObject10 = cxo.ilm.bu((short)i);
          bzj localbzj = ((bfE)localObject10).bsL();
          cxo.ilm.a((lZ)localObject8, localbzj);
          localObject1 = ((lZ)localObject8).tP();
        } else {
          localObject1 = "";
        }break;
      case 1:
        localObject3 = (diB)paramdKY;

        if (((diB)localObject3).akL())
          str1 = cxo.feH.getString("critere.targetbreed");
        else
          str1 = cxo.feH.getString("critere.casterbreed");
        for (int k = 0; k < ((diB)localObject3).bKM().size(); k++) {
          str1 = str1 + " ";
          str1 = str1 + cxo.ilm.ol(((diB)localObject3).bKM().get(k));
        }
        localObject1 = str1;
        break;
      case 8:
        localObject3 = (bBV)paramdKY;

        bool3 = ((bZA)paramdKY).ajF();
        if (((bBV)localObject3).akL())
          str1 = cxo.feH.getString(bool3 ? "critere.nottargetbreedid" : "critere.targetbreedId");
        else
          str1 = cxo.feH.getString("critere.casterbreedId");
        for (m = 0; m < ((bBV)localObject3).bKM().size(); m++) {
          str1 = str1 + " ";
          str1 = str1 + cxo.ilm.bx(((bBV)localObject3).bKM().get(m));
        }
        localObject1 = str1;
        break;
      case 9:
        localObject3 = (cxz)paramdKY;

        bool3 = ((bZA)paramdKY).ajF();
        if (((cxz)localObject3).akL())
          str1 = cxo.feH.getString(bool3 ? "critere.nottargetbreedid" : "critere.targetbreedId");
        else
          str1 = cxo.feH.getString("critere.casterbreedId");
        for (m = 0; m < ((cxz)localObject3).cuR().size(); m++) {
          str1 = str1 + " ";
          str1 = str1 + cxo.ilm.by((short)((cxz)localObject3).cuR().get(0));
        }
        localObject1 = str1;
        break;
      case 10:
        if (((bZA)paramdKY).ajF())
          localObject1 = cxo.feH.getString("critere.nothassummon");
        else
          localObject1 = cxo.feH.getString("critere.hassummon");
        break;
      case 11:
        localObject1 = cxo.feH.getString("critere.hasAnotherSameEquipment");
        break;
      case 12:
        localObject3 = (ael)paramdKY;
        str1 = "";
        bool3 = ((bZA)paramdKY).ajF();
        if (((ael)localObject3).aqe().size() > 0)
          str1 = cxo.feH.getString(((azO)((ael)localObject3).aqe().get(0)).dRV);
        for (m = 1; m < ((ael)localObject3).aqe().size(); m++) {
          str1 = str1 + " " + cxo.feH.getString("or") + " " + cxo.feH.getString(((azO)((ael)localObject3).aqe().get(m)).dRV);
        }
        localObject11 = "";
        if (((ael)localObject3).aqd().size() > 0)
          localObject11 = cxo.ilm.oj(((ael)localObject3).aqd().get(0));
        for (i1 = 1; i1 < ((ael)localObject3).aqd().size(); i1++) {
          int i2 = ((ael)localObject3).aqd().get(i1);
          localObject11 = (String)localObject11 + " " + cxo.feH.getString("or") + " " + cxo.ilm.oj(i2);
        }
        if (((ael)localObject3).aqe().size() > 0) {
          if (bool3)
            localObject1 = cxo.feH.getString("critere.nothasequipwithpos", new Object[] { localObject11, str1 });
          else
            localObject1 = cxo.feH.getString("critere.hasequipwithpos", new Object[] { localObject11, str1 });
        }
        else if (bool3)
          localObject1 = cxo.feH.getString("critere.nothasequip", new Object[] { localObject11 });
        else {
          localObject1 = cxo.feH.getString("critere.hasequip", new Object[] { localObject11 });
        }
        break;
      case 13:
        if (((bZA)paramdKY).ajF())
          localObject1 = cxo.feH.getString("critere.nottargethour");
        else {
          localObject1 = cxo.feH.getString("critere.targethour");
        }
        break;
      case 14:
        localObject3 = (avC)paramdKY;
        long l = ((avC)localObject3).aHy().b(null, null, null, null);
        localObject11 = bMF.bUo().fo(l);
        if ((localObject11 != null) && (((aAn)localObject11).getType() == xj.bpk.xj()))
          if (((bZA)paramdKY).ajF())
            localObject1 = cxo.feH.getString("critere.notIsOnHour");
          else
            localObject1 = cxo.feH.getString("critere.isOnHour"); 
        break;
      case 15:
        localObject1 = cxo.feH.getString("critere.kamaCount");
        break;
      case 16:
        if (((bZA)paramdKY).ajF())
          localObject1 = cxo.feH.getString("critere.isnotennemy");
        else
          localObject1 = cxo.feH.getString("critere.isennemy");
        break;
      case 17:
        localObject1 = cxo.feH.getString("critere.petinrange");
        break;
      case 18:
        if (((bZA)paramdKY).ajF())
          localObject1 = cxo.feH.getString("critere.not.summoned");
        else
          localObject1 = cxo.feH.getString("critere.summoned");
        break;
      case 19:
        localObject1 = cxo.feH.getString("critere.beaconamount");
        break;
      case 20:
        localObject1 = cxo.feH.getString("critere.barrelamount");
        break;
      case 21:
        localObject1 = cxo.feH.getString("critere.trapamount");
        break;
      case 22:
        localObject1 = cxo.feH.getString("critere.nbsummons");
        break;
      case 23:
        localObject1 = cxo.feH.getString("critere.nbroublabot");
        break;
      case 24:
        localObject1 = cxo.feH.getString("critere.symbiotSpace");
        break;
      case 25:
        localObject3 = (dOp)paramdKY;
        String str2 = cxo.ilm.bw((short)((dOp)localObject3).axX());
        localObject1 = cxo.feH.getString("critere.craftLevel", new Object[] { str2 });
        break;
      case 26:
        localObject3 = (cpH)paramdKY;
        localObject1 = cxo.feH.getString(String.format("%s%s", new Object[] { "critere.isSex.", Byte.valueOf(((cpH)localObject3).xK()) }));
        break;
      case 27:
        localObject3 = (iX)paramdKY;
        byte b = (byte)((iX)localObject3).qX();
        localObject1 = cxo.feH.getString("critere.getSpellTreeLevel", new Object[] { eP(b) });
        break;
      case 28:
        localObject3 = (djF)paramdKY;
        localObject6 = cNO.cFX().yF(((djF)localObject3).cSx());

        if (((bZA)paramdKY).ajF())
          localObject9 = "critere.notHasState";
        else {
          localObject9 = "critere.hasState";
        }
        localObject1 = cxo.feH.getString((String)localObject9, new Object[] { ((bJC)localObject6).getName(), Integer.valueOf(((djF)localObject3).cSy()) });
        break;
      case 29:
        localObject3 = (cGp)paramdKY;
        localObject6 = cNO.cFX().yF(((cGp)localObject3).cSx());

        if (((bZA)paramdKY).ajF())
          localObject9 = "critere.notHasStateFromLevel";
        else {
          localObject9 = "critere.hasStateFromLevel";
        }
        localObject1 = cxo.feH.getString((String)localObject9, new Object[] { ((bJC)localObject6).getName(), Integer.valueOf(((cGp)localObject3).cSy()) });

        break;
      case 30:
        localObject3 = (cIz)paramdKY;
        localObject6 = cxo.ilm.bw((short)((cIz)localObject3).axX());
        if (((bZA)paramdKY).ajF())
          localObject1 = cxo.feH.getString("critere.notHasCraft", new Object[] { localObject6 });
        else
          localObject1 = cxo.feH.getString("critere.hasCraft", new Object[] { localObject6 });
        break;
      case 31:
        localObject1 = cxo.feH.getString("critere.getWakfuGaugeValue");
        break;
      case 32:
        localObject1 = cxo.feH.getString("critere.getStasisGauge");
        break;
      case 33:
        localObject3 = (YK)paramdKY;
        int j = ((YK)localObject3).bP();
        if (j > 0) {
          localObject9 = cxo.ilm.om(j);
          localObject1 = cxo.feH.getString("critere.getCrimeScore", new Object[] { localObject9 });
        } else {
          localObject1 = cxo.ilm.bmJ();
        }
        break;
      case 34:
        localObject3 = (dmU)paramdKY;
        if (((dmU)localObject3).ajF())
          localObject1 = cxo.feH.getString("critere.isNotDead");
        else {
          localObject1 = cxo.feH.getString("critere.isDead");
        }
        break;
      case 35:
        localObject1 = cxo.feH.getString("critere.getTotalLeadership");
        break;
      case 36:
        localObject1 = cxo.feH.getString("critere.hasAvailableCreature");
        break;
      case 37:
        localObject1 = cxo.feH.getString("critere.isOnOwnDial");
        break;
      case 38:
        localObject1 = cxo.feH.getString("critere.getZoneWakfu");
        break;
      case 39:
        localObject1 = cxo.feH.getString("critere.getZoneStasis");
        break;
      case 40:
        localObject3 = cxo.ilm.bx(((ZM)paramdKY).uO());
        if (((bZA)paramdKY).ajF())
          localObject1 = cxo.feH.getString("critere.nothasSummonWithBreed", new Object[] { localObject3 });
        else {
          localObject1 = cxo.feH.getString("critere.hasSummonWithBreed", new Object[] { localObject3 });
        }
        break;
      case 41:
        localObject1 = cxo.feH.getString("critere.isCarryingOwnBarrel");
        break;
      case 42:
        boolean bool2 = ((bZA)paramdKY).ajF();
        if (bool2)
          localObject1 = cxo.feH.getString("critere.not.isCarried");
        else {
          localObject1 = cxo.feH.getString("critere.isCarried");
        }
        break;
      case 43:
        localObject1 = cxo.feH.getString("critere.hasSurrondingCellWithOwnBarrel");
        break;
      case 44:
        localObject1 = cxo.feH.getString("critere.isTargetCellValidForNewObstacle");
        break;
      case 45:
        localObject1 = cxo.feH.getString("critere.nbBombs");
        break;
      case 46:
        localObject1 = cxo.feH.getString("critere.distanceBetweenTargetAndNearestAllyBeacon");
        break;
      case 47:
        localObject1 = cxo.feH.getString("critere.guildLevel");
        break;
      case 48:
        localObject4 = (Ya)paramdKY;
        localObject7 = cxo.ilm.jB(((Ya)localObject4).ajL());
        localObject1 = cxo.feH.getString("critere.guildBonus", new Object[] { localObject7 });
        break;
      case 49:
        localObject4 = (aVC)paramdKY;
        localObject7 = ((aVC)localObject4).blc();
        localObject9 = new StringBuilder();
        int n = 0; for (i1 = ((cSi)localObject7).size(); n < i1; n++) {
          if (n != 0)
            ((StringBuilder)localObject9).append(", ");
          ((StringBuilder)localObject9).append(cxo.ilm.ok(((cSi)localObject7).get(n)));
        }

        localObject1 = cxo.feH.getString("critere.hasEquipmentId", new Object[] { ((StringBuilder)localObject9).toString() });
        break;
      case 50:
        localObject1 = String.valueOf(cxo.ilm.bP());
        break;
      default:
        localObject1 = "";
      }

    }

    if (((paramdKY instanceof azn)) && (((azn)paramdKY).akL())) {
      localObject1 = (String)localObject1 + cxo.feH.getString("critere.target");
    }
    return localObject1;
  }

  private static String eP(byte paramByte) {
    return cxo.feH.getString(bTI.dx(paramByte).bL());
  }

  public static ArrayList c(bZA parambZA) {
    ArrayList localArrayList = new ArrayList();
    LinkedList localLinkedList = b(parambZA);
    if (localLinkedList != null)
      for (bZA localbZA : localLinkedList) {
        String str = a(localbZA);
        if (str.length() > 0)
          localArrayList.add(new Cs(str, localbZA));
      }
    return localArrayList;
  }

  private static String a(dKY paramdKY1, dKY paramdKY2, boolean paramBoolean)
  {
    String str1 = a(paramdKY2);
    if (str1.length() == 0) {
      return "";
    }
    if ((paramdKY1.gm() instanceof Bz)) {
      localObject1 = (Bz)paramdKY1.gm();
      switch (cmn.hRh[localObject1.ordinal()]) {
      case 51:
        localObject2 = (cpk)paramdKY1;
        String str2 = cxo.ilm.om(bUD.aR(a(((cpk)localObject2).coT())));
        String str3 = cxo.ilm.om(bUD.aR(a(((cpk)localObject2).coU())));
        String str4 = cxo.ilm.cw(bUD.getByte(str1));
        if (paramBoolean)
          return cxo.feH.getString("critere.getNationAlignment", new Object[] { str2, str4, str3 });
        return cxo.feH.getString("critere.getNoNationAlignment", new Object[] { str2, str4, str3 });
      case 52:
        String str5 = cxo.ilm.on(bUD.aR(str1));
        if (paramBoolean)
          return cxo.feH.getString("critere.getInstanceId", new Object[] { str5 });
        return cxo.feH.getString("critere.notGetInstanceId", new Object[] { str5 });
      case 50:
        String str6 = cxo.ilm.om(bUD.aR(str1));
        if (paramBoolean)
          return cxo.feH.getString("critere.getNationId", new Object[] { str6 });
        return cxo.feH.getString("critere.notGetNationId", new Object[] { str6 });
      }

    }

    Object localObject1 = new StringBuilder();
    Object localObject2 = a(paramdKY1);
    if (((String)localObject2).length() == 0)
      return "";
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append(paramBoolean ? " = " : " != ");
    ((StringBuilder)localObject1).append(str1);

    return ((StringBuilder)localObject1).toString();
  }
}