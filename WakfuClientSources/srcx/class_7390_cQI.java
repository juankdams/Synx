import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class cQI
  implements bpG
{
  public static final String eMS = "isEnabled";
  public static final String flp = "isActive";
  public static final String bsS = "quantity";
  public static final String RI = "description";
  public static final String ioT = "levelDescription";
  public static final String RH = "iconUrl";
  public static final String ipe = "iconBigUrl";
  public static final String kCf = "movable";
  public static final String kCg = "usableInFight";
  public static final String hFq = "backgroundStyle";
  public static final String kCh = "isEquiped";
  public static final String kCi = "isInInventory";
  public static final String kCj = "usedInCurrentRecipe";
  public static final String kCk = "deletable";
  public static final String dwW = "usable";
  public static final String kCl = "usableNow";
  public static final String kCm = "clickDescription";
  public static final String kCn = "isEmptySlot";
  public static final String flo = "hasPet";
  public static final String ipp = "hasXp";
  public static final String kCo = "currentXpPercentage";
  public static final String kCp = "currentXpDescription";
  public static final String kCq = "currentXpLevel";
  public static final String hFp = "isRefItem";
  public static final String kCr = "isItemSetMergeable";
  public static final String kCs = "canMergeItemSet";
  public static final String kCt = "hasInvalidActions";
  public static final String kCu = "invalidActionsDescription";
  public static final String kCv = "isRent";
  public static final String OG = "rentInfoDescription";
  public static final String[] bF = { "isActive", "quantity", "levelDescription", "movable", "usableInFight", "backgroundStyle", "isEquiped", "usedInCurrentRecipe", "deletable", "usable", "usableNow", "clickDescription", "isEmptySlot", "hasXp", "currentXpPercentage", "currentXpDescription", "currentXpLevel", "hasPet", "isRefItem", "canMergeItemSet" };

  protected static final Logger K = Logger.getLogger(cQI.class);

  private String[] kCw = { "itemPopupDetail" };

  private final aoL kCx = new aoL();
  private final aoL kCy = new aoL();
  private final aoL kCz = new aoL();
  private final aoL kCA = new aoL();

  public String[] getFields()
  {
    return bF;
  }

  public Object b(gA paramgA, String paramString) {
    if (paramString.equals("isRefItem"))
      return Boolean.valueOf(false);
    if (paramString.equals("quantity"))
      return Short.valueOf(paramgA.nP());
    if (paramString.equals("description")) {
      String str1 = paramgA.oi().getDescription();
      if ((str1 == null) || (str1.length() == 0)) {
        return null;
      }
      return "\"" + str1 + "\"";
    }
    if (paramString.equals("level"))
      return Short.valueOf(paramgA.nU());
    Object localObject2;
    if (paramString.equals("levelDescription")) {
      boolean bool1 = aK(paramgA);

      localObject2 = new lZ();
      if (!bool1) {
        ((lZ)localObject2).tI().am("ff4a4a");
      }
      ((lZ)localObject2).a(bU.fH().getString("levelShort.custom", new Object[] { Short.valueOf(paramgA.nU()) }));
      if (!bool1) {
        ((lZ)localObject2).tJ();
      }
      return ((lZ)localObject2).tP();
    }if (paramString.equals("isEnabled"))
      return Boolean.valueOf(true);
    if (paramString.equals("isActive"))
      return Boolean.valueOf(paramgA.isActive());
    if (paramString.equals("backgroundStyle"))
      return aH(paramgA);
    if (paramString.equals("iconUrl"))
      return T(paramgA);
    Object localObject1;
    if (paramString.equals("iconBigUrl")) {
      localObject1 = byv.bFN().bFO();
      return ay.bd().v(((byz)localObject1).xK() == 1 ? paramgA.od() : paramgA.oc());
    }if (paramString.equals("movable")) {
      return Boolean.valueOf((!aB(paramgA)) && (!aA(paramgA)) && (!((bVw)paramgA.oi()).cbi()));
    }

    if (paramString.equals("usableInFight"))
      return Boolean.valueOf(paramgA.om());
    if (paramString.equals("isInInventory")) {
      localObject1 = byv.bFN().bFO();
      return Boolean.valueOf(((byz)localObject1).bGP().iS(paramgA.oj()) != null);
    }if (paramString.equals("isEquiped")) {
      localObject1 = byv.bFN().bFO();
      return Boolean.valueOf((((byz)localObject1).ayJ().f(paramgA)) || (((byz)localObject1).bGP().iO(paramgA.oj()) != null));
    }if (paramString.equals("usedInCurrentRecipe")) {
      return Boolean.valueOf((dhC.cQm().cV(paramgA.oj())) || (((bVw)paramgA.oi()).cbi()));
    }
    if (paramString.equals("deletable")) {
      localObject1 = byv.bFN().bFO();
      localObject2 = paramgA.oi().a(Aq.bvV);
      return Boolean.valueOf((!aB(paramgA)) && (!aA(paramgA)) && (!((bVw)paramgA.oi()).cbi()) && ((localObject2 == null) || (((bZA)localObject2).i(localObject1, ((byz)localObject1).ML(), paramgA, ((byz)localObject1).bEY()))));
    }

    if (paramString.equals("usable"))
      return Boolean.valueOf((paramgA.oi().bKr() != null) || (paramgA.on()));
    if (paramString.equals("usableNow"))
      return Boolean.valueOf(aI(paramgA));
    if (paramString.equals("isEmptySlot"))
      return Boolean.valueOf(false);
    Object localObject3;
    if (paramString.equals("clickDescription")) {
      localObject1 = new lZ();

      if (byv.bFN().c(bLT.bTA())) {
        return bU.fH().getString("clickToSell");
      }

      localObject2 = (Boolean)b(paramgA, "usable");
      boolean bool2;
      if (((Boolean)localObject2).booleanValue()) {
        bool2 = aI(paramgA);
        if (!bool2) {
          ((lZ)localObject1).tI().am("ff0000");
        }
        ((lZ)localObject1).a(bU.fH().getString("leftClickToUse"));
        if (!bool2) {
          ((lZ)localObject1).tJ();
        }
      }

      if (paramgA.oi().bKw()) {
        if (((Boolean)localObject2).booleanValue()) {
          ((lZ)localObject1).tH();
        }
        bool2 = aJ(paramgA);
        if (!bool2) {
          ((lZ)localObject1).tI().am("ff0000");
        }
        ((lZ)localObject1).a(bU.fH().getString("leftClickToEquip"));
        if (!bool2) {
          ((lZ)localObject1).tJ();
        }
      }

      if (paramgA.nI()) {
        ((lZ)localObject1).tH();
        ((lZ)localObject1).a(bU.fH().getString("rightClickToManagePet"));
        if (paramgA.nJ().cJs()) {
          ((lZ)localObject1).tH();
          ((lZ)localObject1).tI().am("ff0000");
          ((lZ)localObject1).a(bU.fH().getString("pet.sleeping"));
          ((lZ)localObject1).tJ();
        }
      }

      localObject3 = ((lZ)localObject1).tP();
      return ((String)localObject3).length() > 0 ? localObject3 : null;
    }if ((paramString.equals("effect")) || (paramString.equals("shortEffectDetails")))
    {
      return aE(paramgA);
    }if (paramString.equals("criticalEffectDetails"))
      return aF(paramgA);
    if (paramString.equals("effectAndCaracteristic")) {
      localObject1 = new ArrayList();
      localObject2 = aE(paramgA);
      if ((localObject2 != null) && (((ArrayList)localObject2).size() > 0)) {
        ((ArrayList)localObject1).add(bU.fH().getString("effectOnUse"));
        for (localObject3 = ((ArrayList)localObject2).iterator(); ((Iterator)localObject3).hasNext(); ) { localObject4 = (String)((Iterator)localObject3).next();
          ((ArrayList)localObject1).add(localObject4);
        }
      }
      Object localObject4;
      localObject3 = aG(paramgA);
      if (((ArrayList)localObject3).size() > 0) {
        ((ArrayList)localObject1).add(bU.fH().getString("effectOnEquip"));
        for (localObject4 = ((ArrayList)localObject3).iterator(); ((Iterator)localObject4).hasNext(); ) { String str2 = (String)((Iterator)localObject4).next();
          ((ArrayList)localObject1).add(str2);
        }
      }
      return ((ArrayList)localObject1).size() > 0 ? localObject1 : null;
    }if (paramString.equals("hasCaracteristic")) {
      localObject1 = aG(paramgA);
      return Boolean.valueOf((localObject1 != null) && (((ArrayList)localObject1).size() != 0));
    }if (paramString.equals("caracteristic"))
      return aG(paramgA);
    if (paramString.equals("hasXp"))
      return Boolean.valueOf(paramgA.nK());
    if (paramString.equals("currentXpPercentage")) {
      if (!paramgA.nK()) {
        return Float.valueOf(0.0F);
      }
      return Float.valueOf(paramgA.nL().cuV());
    }if (paramString.equals("currentXpLevel")) {
      if (!paramgA.nK()) {
        return Short.valueOf((short)0);
      }
      return Short.valueOf(paramgA.nL().nU());
    }if (paramString.equals("currentXpDescription")) {
      if (!paramgA.nK()) {
        return null;
      }
      localObject1 = paramgA.nL();
      return bU.fH().getString("xpRatio", new Object[] { Long.valueOf(((dHJ)localObject1).ble().cH(((dHJ)localObject1).ayX())), Long.valueOf(((dHJ)localObject1).ble().aq(((dHJ)localObject1).nU())) });
    }if (paramString.equals("hasPet"))
      return Boolean.valueOf(paramgA.nI());
    if (paramString.equals("isRefItem"))
      return Boolean.valueOf(false);
    short s;
    if (paramString.equals("isItemSetMergeable")) {
      s = paramgA.oi().bKk();
      localObject2 = bCc.bKN().cm(s);
      return Boolean.valueOf((localObject2 != null) && (dTX.d((ctU)localObject2)));
    }if (paramString.equals("canMergeItemSet")) {
      s = paramgA.oi().bKk();
      localObject2 = bCc.bKN().cm(s);
      if (localObject2 == null) {
        return Boolean.valueOf(false);
      }

      if (!dTX.d((ctU)localObject2)) {
        return Boolean.valueOf(false);
      }
      return Boolean.valueOf(dTX.a(byv.bFN().bFO(), (ctU)localObject2));
    }if (paramString.equals("gems"))
      return aD(paramgA);
    if (paramString.equals("hasInvalidActions"))
      return Boolean.valueOf(az(paramgA));
    if (paramString.equals("invalidActionsDescription"))
      return aC(paramgA);
    if (paramString.equals("rentInfoDescription"))
      return ax(paramgA);
    if (paramString.equals("isRent")) {
      return Boolean.valueOf(ay(paramgA));
    }

    return ((chm)paramgA.oi()).getFieldValue(paramString);
  }

  private String ax(gA paramgA) {
    wz localwz = paramgA.oq();
    if (localwz == null) {
      return "";
    }
    lZ locallZ = new lZ();
    if (localwz.FC()) {
      locallZ.a(bU.fH().getString("rentInfo.description.finished"));
      return locallZ.tP();
    }

    int i = localwz.getType();
    switch (i) {
    case 1:
      cNr localcNr = (cNr)localwz;
      long l = localcNr.cFT();
      locallZ.a(bU.fH().getString("rentInfo.description." + i, new Object[] { Long.valueOf(l) }));
      break;
    case 2:
      abW localabW = (abW)localwz;
      String str = bXW.l(localabW.aoh());
      locallZ.a(bU.fH().getString("rentInfo.description." + i, new Object[] { str }));
    }

    return locallZ.tP();
  }

  private boolean ay(gA paramgA) {
    return paramgA.or();
  }

  private boolean az(gA paramgA) {
    byz localbyz = byv.bFN().bFO();
    Aq[] arrayOfAq1 = { Aq.bvV, Aq.bvR, Aq.bvS };
    if (paramgA.or()) {
      return true;
    }
    for (Aq localAq : arrayOfAq1) {
      bZA localbZA = paramgA.oi().a(localAq);
      if ((localbZA != null) && (!localbZA.i(localbyz, null, null, localbyz.bGq()))) {
        return true;
      }
    }

    return false;
  }

  public static boolean aA(gA paramgA) {
    return (byv.bFN().c(aOy.bfr())) && ((!paramgA.ol().c(X.aw().f(226))) || (aOy.bfr().dR(paramgA.oj())));
  }

  public static boolean aB(gA paramgA)
  {
    return (byv.bFN().c(aFx.aRI())) && ((!aFx.aRI().G(paramgA)) || (aFx.aRI().dR(paramgA.oj())));
  }

  private String aC(gA paramgA)
  {
    byz localbyz = byv.bFN().bFO();
    Aq[] arrayOfAq1 = { Aq.bvV, Aq.bvR, Aq.bvS };

    lZ locallZ = new lZ();
    int i = 1;

    for (Aq localAq : arrayOfAq1) {
      bZA localbZA = paramgA.oi().a(localAq);
      if ((localbZA != null) && (!localbZA.i(localbyz, null, null, localbyz.bGq()))) {
        if (i != 0)
          i = 0;
        else {
          locallZ.tH();
        }

        locallZ.a(bU.fH().getString("actionsOnItem.invalid." + localAq.name()));
      } else if ((paramgA.or()) && ((localAq == Aq.bvR) || (localAq == Aq.bvS))) {
        if (i != 0)
          i = 0;
        else {
          locallZ.tH();
        }
        locallZ.a(bU.fH().getString("actionsOnItem.invalid." + localAq.name()));
      }
    }

    return locallZ.tP();
  }

  private OW aD(gA paramgA) {
    OW localOW1 = (OW)this.kCx.get(paramgA.oj());
    if (localOW1 == null) {
      OW localOW2 = new OW(paramgA, paramgA.nM() ? paramgA.nO() : cdI.hxG);
      if (paramgA.oj() != 0L) {
        this.kCx.put(paramgA.oj(), localOW2);
      }
      return localOW2;
    }
    return localOW1;
  }

  private static ArrayList a(gA paramgA, aoL paramaoL, cMx paramcMx)
  {
    ArrayList localArrayList = (ArrayList)paramaoL.get(paramgA.oj());
    if (localArrayList == null) {
      localArrayList = czM.a(paramcMx, paramgA.oi(), paramgA);
      paramaoL.put(paramgA.oj(), localArrayList);
    }
    return localArrayList.isEmpty() ? null : localArrayList;
  }

  private ArrayList aE(gA paramgA) {
    return a(paramgA, this.kCz, cMx.krQ);
  }

  private ArrayList aF(gA paramgA) {
    return a(paramgA, this.kCA, cMx.krR);
  }

  private ArrayList aG(gA paramgA) {
    ArrayList localArrayList = (ArrayList)this.kCy.get(paramgA.oj());
    if (localArrayList == null) {
      localArrayList = czM.b(paramgA.oi(), paramgA);
      this.kCy.put(paramgA.oj(), localArrayList);
    }
    return localArrayList;
  }

  public String T(gA paramgA) {
    byz localbyz = byv.bFN().bFO();
    return ay.bd().u(localbyz.xK() == 1 ? paramgA.od() : paramgA.oc());
  }

  public static String aH(gA paramgA) {
    return c(paramgA, "equipmentDialog");
  }

  public static String c(gA paramgA, String paramString) {
    gA localgA = (gA)dLE.doY().br("itemDetail", paramString);
    if ((localgA != null) && (paramgA.oj() == 0L) && (localgA.oj() == 0L))
    {
      if (paramgA.ok() == localgA.ok())
        return clo.hNa.getStyle();
    }
    else if ((localgA != null) && (paramgA.oj() == localgA.oj())) {
      return clo.hNa.getStyle();
    }
    if ((paramgA.nI()) && (paramgA.nJ().cJs())) {
      return clo.hMZ.getStyle();
    }
    if (!v(paramgA)) {
      return clo.hNb.getStyle();
    }
    return clo.hNc.getStyle();
  }

  public static boolean v(gA paramgA) {
    if (paramgA.oi().bKn().nh().length > 0) {
      return aJ(paramgA);
    }
    return (!paramgA.isUsable()) || (aI(paramgA));
  }

  public static boolean aI(gA paramgA) {
    byz localbyz = byv.bFN().bFO();
    if (localbyz.isDead()) {
      return false;
    }

    bBn localbBn = paramgA.oi();
    dKf localdKf = (dKf)localbBn.bKr();

    if ((localdKf != null) && (!localdKf.Z(paramgA))) {
      return false;
    }

    if ((localbyz.bSe() != null) && (
      (localdKf == null) || (!localdKf.apy()))) {
      return false;
    }

    if ((paramgA.ol().nc() == 218) || (paramgA.ol().nc() == 399))
    {
      return true;
    }

    if (localbyz.bGP().o(paramgA) == null) {
      return false;
    }

    arl localarl = localbyz.aeQ();
    Object localObject1;
    Object localObject2;
    if (localarl != null) {
      localObject1 = localarl.aIq().LH();
      localObject2 = localbBn.a(Aq.bvP);
      if ((!((tl)localObject1).AP()) || (((tl)localObject1).AQ() != localbyz.getId()) || ((paramgA.oi().bKw()) && (localbyz.ayJ().ci(paramgA.oj()) == null)) || (!paramgA.om()) || ((localObject2 != null) && (!((bZA)localObject2).i(localbyz, localbyz.ML(), paramgA, localbyz.bEY()))))
      {
        return false;
      }
    } else {
      localObject1 = localbBn.a(Aq.bvO);
      if ((!paramgA.on()) || ((localObject1 != null) && (!((bZA)localObject1).i(localbyz, localbyz.ML(), paramgA, localbyz.bEY())))) {
        return false;
      }
    }

    if ((localdKf instanceof wD))
      return true;
    if ((localdKf instanceof alo)) {
      int i = ((alo)localdKf).alM();
      localObject2 = localbyz.aTn();
      int j = ((alo)localdKf).axX();
      return (((azP)localObject2).contains(j)) && (((azP)localObject2).getLevel(j) >= i);
    }if (paramgA.nU() > localbyz.nU()) {
      return false;
    }

    return true;
  }

  private static boolean aJ(gA paramgA)
  {
    if ((!bB) && (!paramgA.oi().bKw())) throw new AssertionError("On appelle isEquipmentEquipable avec un item qui n'est pas un equipment : " + paramgA.getName());

    byz localbyz = byv.bFN().bFO();
    return cVY.cKs().a(paramgA, localbyz, localbyz.ayL());
  }

  private static boolean aK(gA paramgA)
  {
    byz localbyz = byv.bFN().bFO();
    if (localbyz == null) {
      return true;
    }

    bBn localbBn = paramgA.oi();

    if (localbBn.bKn().nh().length > 0) {
      cVY localcVY = (cVY)localbyz.ayJ().ajz();
      if (localcVY != null)
        return cVY.a(paramgA, localbyz);
    } else {
      if ((localbBn.bKr() instanceof alo)) {
        int i = ((alo)localbBn.bKr()).alM();
        return localbyz.aTn().getLevel(((alo)localbBn.bKr()).axX()) >= i;
      }if (localbBn.nU() > localbyz.nU()) {
        return false;
      }
    }
    return true;
  }

  public String U(gA paramgA) {
    bBn localbBn = paramgA.oi();
    return localbBn != null ? localbBn.getName() : "<undefined name>";
  }

  public String V(gA paramgA) {
    bBn localbBn = paramgA.oi();
    return localbBn != null ? localbBn.getDescription() : "<undefined desc>";
  }

  public void X(gA paramgA)
  {
    ArrayList localArrayList = new ArrayList();

    for (String str : this.kCw) {
      bbo localbbo = dLE.doY().getProperty(str);
      if (localbbo != null)
      {
        if ((localbbo.getValue() == paramgA) && (!localbbo.bpI())) {
          localArrayList.add(localbbo);
        }
      }
    }
    int i = 0; for (??? = localArrayList.size(); i < ???; i++)
      dLE.doY().d((bbo)localArrayList.get(i));
  }

  public void W(gA paramgA)
  {
    this.kCx.remove(paramgA.oj());
    this.kCy.remove(paramgA.oj());
    this.kCz.remove(paramgA.oj());
    this.kCA.remove(paramgA.oj());
    chm localchm = (chm)paramgA.oi();
    if (localchm != null) {
      localchm.cbh().of();
    }

    dLE.doY().a(paramgA, new String[] { "isEquipable", "requirement", "effect", "caracteristic", "isEquiped", "isInInventory", "effectAndCaracteristic", "gems" });
  }

  public static String a(Iterator paramIterator, short paramShort, boolean paramBoolean)
  {
    StringBuilder localStringBuilder = new StringBuilder();

    while (paramIterator.hasNext()) {
      dpI localdpI = (dpI)paramIterator.next();

      String str1 = bU.fH().ec(10, localdpI.eo());
      if (localdpI.eo() != bsj.fTb.getId())
      {
        int i = localdpI.bep();
        Object[] arrayOfObject = new Object[i];

        for (int j = 0; j < i; j++) {
          arrayOfObject[j] = Integer.valueOf(localdpI.a(j, paramShort, dNF.meh));
        }
        bXU localbXU = null;
        apX localapX = null;

        if ((localdpI.eo() == bsj.fSd.getId()) || (localdpI.eo() == bsj.fSs.getId())) {
          localbXU = (bXU)cNO.cFX().yF(((Integer)arrayOfObject[0]).intValue());
          short s1 = 0;
          if (arrayOfObject.length > 1) {
            s1 = ((Integer)arrayOfObject[1]).shortValue();
          }
          arrayOfObject[0] = cxo.a(localbXU, s1, (short)localdpI.zC(), true);
        } else if (localdpI.eo() == bsj.fPn.getId())
        {
          int k = ((Integer)arrayOfObject[0]).intValue();
          localapX = (apX)byv.bFN().bFO().auK().hh(k);
          if (localapX == null) {
            localapX = new apX(Be.Kj().ea(k), (short)0, 0L);
          }
        }

        String str2 = bjv.format(str1, arrayOfObject);
        if ((localbXU != null) && (!paramBoolean))
        {
          String str3 = a(localbXU.iterator(), localbXU.nU(), true);
          str3 = str3 + ",";
          localStringBuilder.append(bjv.format(str1, arrayOfObject)).append(" (").append(str3).append(")");
        } else if (localapX != null) {
          short s2 = localapX.nU();
          localapX.d(paramShort, false);
          localStringBuilder.append(localapX.a(cMx.krQ));
          localapX.d(s2, false);
        } else {
          localStringBuilder.append(str2);
        }

        if (localdpI.aMG() == 2) {
          localObject = (aAU)localdpI;
          cuf localcuf = ((aAU)localObject).aV(paramShort);
          if (localcuf.csD() < 0)
            localStringBuilder.append(' ').append(bU.fH().getString("cast.infiniteDuration"));
          else if (localcuf.csD() > 0)
            localStringBuilder.append(' ').append(bU.fH().getString("remaining.duration.turn", new Object[] { Short.valueOf(localcuf.csD()) }));
        }
        else if (localdpI.aMG() == 1) {
          localObject = (aXT)localdpI;
          if (localbXU != null) {
            int m = ((aXT)localObject).bz(localbXU.nU());
            if (m <= 0) {
              m = localbXU.bQV();
            }
            if (m > 0) {
              localStringBuilder.append(' ').append(bXW.k(kb.I(m / 1000)));
            }
          }

        }

        Object localObject = ((doA)bsj.bAv().kD(localdpI.eo())).Cz();
        if (localObject != null) {
          try {
            String str4 = String.format(ay.bd().getString("elementsSmallIconsPath"), new Object[] { ((bTI)localObject).name() });
            localStringBuilder.append(" ").append(aPf.c(str4, -1, -1, null));
          } catch (bdh localbdh) {
            K.error(localbdh.toString());
          }
        }

        if (paramIterator.hasNext()) {
          localStringBuilder.append("\r\n");
        }
      }
    }
    return localStringBuilder.toString();
  }
}