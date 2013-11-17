import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dn
  implements cle
{
  private static Dn bHH = new Dn();
  public static final String bHI = "nameAndLevel";
  public static final String bC = "name";
  public static final String bHJ = "id";
  public static final String RH = "iconUrl";
  public static final String RI = "description";
  public static final String bHK = "levelValue";
  public static final String bsP = "level";
  public static final String bHL = "levelWithColor";
  public static final String bHM = "levelColor";
  public static final String bHN = "canBeIncreased";
  public static final String bHO = "canBeDecreased";
  public static final String bHP = "characteristicValue";
  public static final String bHQ = "characteristicName";
  public static final String bHR = "characteristicDescription";
  public static final String bHS = "isMaxedOut";
  private dPx bHT = new dPx();
  private dFu bHU = new dFu();

  private Dn() {
    for (qE localqE : qE.values())
      this.bHT.c(localqE.bJ(), new agT());
  }

  public static Dn MA() {
    return bHH;
  }

  public Object a(bWG parambWG, String paramString) {
    if (paramString.equals("name"))
      return bU.fH().b(44, parambWG.ok(), new Object[0]);
    Object localObject1;
    Object localObject3;
    if (paramString.equals("nameAndLevel")) {
      localObject1 = c(parambWG) + (parambWG.nV() != 32767 ? "/" + parambWG.nV() : "");
      localObject3 = bU.fH().b(44, parambWG.ok(), new Object[0]);
      return (String)localObject3 + " - " + bU.fH().getString("levelShort.custom", new Object[] { localObject1 });
    }if (paramString.equals("id"))
      return Short.valueOf(parambWG.cbI().bQz());
    if (paramString.equals("iconUrl")) {
      localObject1 = parambWG.cbI();
      if (((bJw)localObject1).bQC() != 0) {
        return ay.bd().x(((bJw)localObject1).bQC());
      }
      return ay.bd().B(((bJw)localObject1).bQB());
    }
    Object localObject6;
    if (paramString.equals("description")) {
      localObject1 = new lZ();

      localObject3 = byv.bFN().bFO();
      int k = d(parambWG);

      if (k > 0) {
        ((lZ)localObject1).tz();
        if (((byz)localObject3).nU() < k)
          ((lZ)localObject1).am(bNa.gRz.bUV());
        ((lZ)localObject1).a(bU.fH().getString("required.level.custom", new Object[] { Integer.valueOf(k) }));
        ((lZ)localObject1).tA().tH();
      }

      int m = e(parambWG);
      ((lZ)localObject1).tz();
      if (m == -1) {
        ((lZ)localObject1).a(bU.fH().getString("aptitudes.maxLevelReached"));
      } else {
        if (!j(parambWG)) {
          ((lZ)localObject1).am("FF0000");
        }
        ((lZ)localObject1).a(bU.fH().getString("aptitudes.pointsToNextLevel", new Object[] { Integer.valueOf(m) }));
      }
      ((lZ)localObject1).tA();
      if (!k(parambWG)) {
        ((lZ)localObject1).a("\n").tz().am("FF0000");
        ((lZ)localObject1).a(bU.fH().getString("aptitudes.spellUnkown"));
        ((lZ)localObject1).tA();
      }
      localObject6 = bU.fH().b(45, parambWG.ok(), new Object[0]);
      if ((localObject6 != null) && (((String)localObject6).length() > 0)) {
        ((lZ)localObject1).am("fac400");
        ((lZ)localObject1).a("\n\n").a((CharSequence)localObject6).tJ();
      }

      short s = c(parambWG);

      ((lZ)localObject1).a("\n\n").tF().a(bU.fH().getString("aptitudes.currentLevelEffects")).tG().a("\n");
      int n = parambWG.cbI().atR();
      ArrayList localArrayList1;
      if (n == 0) {
        localArrayList1 = cxo.a(new cJH(parambWG.cQ(s), 0, s));
      } else {
        apX localapX = (apX)Be.Kj().h(n, s);
        if (localapX.bsL() == null)
          return null;
        localArrayList1 = cxo.a(new bds(localapX));
      }
      int i2 = 1;
      for (Object localObject7 = localArrayList1.iterator(); ((Iterator)localObject7).hasNext(); ) { localObject8 = (String)((Iterator)localObject7).next();
        if (i2 == 0)
          ((lZ)localObject1).a("\n");
        ((lZ)localObject1).a((CharSequence)localObject8);
        i2 = 0;
      }
      Object localObject8;
      int i3;
      if (!g(parambWG)) {
        ((lZ)localObject1).a("\n\n").tF().a(bU.fH().getString("aptitudes.nextLevelEffects")).tG().a("\n");
        n = (short)(s + 1);
        int i1 = parambWG.cbI().atR();
        ArrayList localArrayList2;
        if (i1 == 0) {
          localArrayList2 = cxo.a(new cJH(parambWG.cQ(n), 0, n));
        } else {
          localObject7 = (apX)Be.Kj().h(i1, n);
          if (((apX)localObject7).bsL() == null)
            return null;
          localArrayList2 = cxo.a(new bds((bfE)localObject7));
        }
        i3 = 1;
        for (localObject8 = localArrayList2.iterator(); ((Iterator)localObject8).hasNext(); ) { String str = (String)((Iterator)localObject8).next();
          if (i3 == 0)
            ((lZ)localObject1).a("\n");
          ((lZ)localObject1).a(str);
          i3 = 0;
        }
      }
      return ((lZ)localObject1).tP();
    }if (paramString.equals("levelValue"))
      return Short.valueOf(c(parambWG));
    if (paramString.equals("level"))
      return new StringBuilder(c(parambWG)).append("/").append(parambWG.nV());
    Object localObject5;
    if (paramString.equals("levelWithColor"))
    {
      int j = 1;
      localObject5 = byv.bFN().bFO();
      if (localObject5 != null) {
        dSr localdSr = ((byz)localObject5).bGQ();
        if ((localdSr != null) && (localdSr.d(parambWG.cbI().bQE()) == 0)) {
          j = 0;
        }
      }

      boolean bool2 = l(parambWG);

      if (g(parambWG))
        localObject1 = "FFD020";
      else if ((j != 0) && (bool2))
        localObject1 = "00FF00";
      else {
        localObject1 = "FFFFFF";
      }

      localObject6 = new lZ();
      ((lZ)localObject6).tI().am((String)localObject1);
      ((lZ)localObject6).o(c(parambWG));

      ((lZ)localObject6).tJ();
      return ((lZ)localObject6).tP();
    }
    Object localObject4;
    if (paramString.equals("levelColor")) {
      int i = 1;
      localObject4 = byv.bFN().bFO();
      if (localObject4 != null) {
        localObject5 = ((byz)localObject4).bGQ();
        if ((localObject5 != null) && (((dSr)localObject5).d(parambWG.cbI().bQE()) == 0)) {
          i = 0;
        }
      }

      boolean bool1 = l(parambWG);

      if (g(parambWG))
        return "1,.9,.1";
      if ((i != 0) && (bool1)) {
        return "0,1,0";
      }
      return "1,1,1";
    }
    if (paramString.equals("canBeIncreased"))
      return Boolean.valueOf(l(parambWG));
    if (paramString.equals("canBeDecreased"))
      return Boolean.valueOf(h(parambWG));
    if (paramString.equals("isMaxedOut"))
      return Boolean.valueOf(g(parambWG));
    Object localObject2;
    if (paramString.equals("characteristicValue")) {
      localObject2 = parambWG.cbI().qo();
      localObject4 = (dpI)((List)localObject2).get(0);
      return Integer.valueOf((int)((dpI)localObject4).o(0, c(parambWG)));
    }if (paramString.equals("characteristicName")) {
      localObject2 = parambWG.cbI().bQD();
      if (localObject2 != null) {
        return bU.fH().getString(((eu)localObject2).name() + "Short");
      }
      return null;
    }
    if (paramString.equals("characteristicDescription")) {
      localObject2 = parambWG.cbI().bQD();
      if (localObject2 != null) {
        return bU.fH().getString(((eu)localObject2).name() + "Description");
      }
      return null;
    }

    return null;
  }

  public void a(bWG parambWG) {
    dLE.doY().a(parambWG, new String[] { "levelWithColor", "canBeIncreased", "canBeDecreased" });
  }

  public void b(bWG parambWG)
  {
    dLE.doY().a(parambWG, new String[] { "nameAndLevel", "description", "characteristicValue", "level", "levelColor", "levelWithColor", "isMaxedOut", "canBeIncreased", "canBeDecreased" });
  }

  private short c(bWG parambWG)
  {
    agT localagT = (agT)this.bHT.bf(parambWG.cbI().bQE().bJ());
    return (short)(parambWG.nU() + localagT.au(parambWG.cbI().bQz()));
  }

  private int d(bWG parambWG) {
    agT localagT = (agT)this.bHT.bf(parambWG.cbI().bQE().bJ());
    int i = localagT.au(parambWG.cbI().bQz());

    return parambWG.cbI().cG((short)(parambWG.nU() + i + 1));
  }

  private int e(bWG parambWG) {
    agT localagT = (agT)this.bHT.bf(parambWG.cbI().bQE().bJ());
    int i = localagT.au(parambWG.cbI().bQz());
    if (i == 0) {
      return parambWG.aO(byv.bFN().bFO());
    }

    if (!g(parambWG)) {
      return parambWG.a((short)(parambWG.nU() + i + 1), byv.bFN().bFO());
    }
    return -1;
  }

  private int f(bWG parambWG)
  {
    agT localagT = (agT)this.bHT.bf(parambWG.cbI().bQE().bJ());
    int i = localagT.au(parambWG.cbI().bQz());
    if (i == 0) {
      return 0;
    }

    return parambWG.a((short)(parambWG.nU() + i), byv.bFN().bFO());
  }

  private boolean g(bWG parambWG) {
    agT localagT = (agT)this.bHT.bf(parambWG.cbI().bQE().bJ());
    int i = localagT.au(parambWG.cbI().bQz());
    if (i == 0) {
      return parambWG.cbJ();
    }

    return parambWG.cbI().nV() <= parambWG.nU() + i;
  }

  public boolean h(bWG parambWG) {
    return f(parambWG) != 0;
  }

  private boolean i(bWG parambWG) {
    int i = byv.bFN().bFO().nU();
    int j = d(parambWG);

    return i >= j;
  }

  private boolean j(bWG parambWG) {
    int i = e(parambWG);
    if (i == -1) {
      return false;
    }
    dSr localdSr = byv.bFN().bFO().bGQ();
    qE localqE = parambWG.cbI().bQE();
    int j = localdSr.d(localqE) - this.bHU.get(localqE.bJ());
    return i <= j;
  }

  private boolean k(bWG parambWG) {
    byz localbyz = byv.bFN().bFO();
    int i = parambWG.cbI().atR();
    if (i != 0) {
      ArrayList localArrayList = localbyz.auK().hi(i);
      return !localArrayList.isEmpty();
    }
    return true;
  }

  public boolean l(bWG parambWG) {
    return (j(parambWG)) && (k(parambWG)) && (i(parambWG)) && (m(parambWG));
  }

  private boolean m(bWG parambWG) {
    if (!aPE.eMt.contains(parambWG.ok()))
      return true;
    agT localagT = (agT)this.bHT.bf(parambWG.cbI().bQE().bJ());
    int[] arrayOfInt = aPE.eMt.toArray();
    for (int i = 0; i < arrayOfInt.length; i++) {
      int j = arrayOfInt[i];
      if (j != parambWG.ok())
      {
        if (localagT.N((short)j))
          return false;
      }
    }
    return true;
  }

  public void MB() {
    for (qE localqE : qE.values())
      a(localqE);
  }

  public void a(qE paramqE) {
    a(paramqE, true);
  }

  public void a(qE paramqE, boolean paramBoolean) {
    ((agT)this.bHT.bf(paramqE.bJ())).clear();
    this.bHU.wH(paramqE.bJ());

    if (!paramBoolean) {
      return;
    }
    switch (atE.dFj[paramqE.ordinal()]) {
    case 1:
      dLE.doY().a(byv.bFN().bFO(), new String[] { "availableCommonPoints", "aptitudeMenuText" });

      break;
    case 2:
      dLE.doY().a(byv.bFN().bFO(), new String[] { "availableAptitudePoints", "aptitudeMenuText" });
    }
  }

  public void n(bWG parambWG)
  {
    if (!l(parambWG)) {
      return;
    }

    agT localagT = (agT)this.bHT.bf(parambWG.cbI().bQE().bJ());
    int i = localagT.c(parambWG.cbI().bQz(), (short)1, (short)1);
    qE localqE = parambWG.cbI().bQE();

    int j = parambWG.a((short)(i + parambWG.nU()), byv.bFN().bFO());
    this.bHU.ah(localqE.bJ(), j, j);

    dLE.doY().a(parambWG, new String[] { "nameAndLevel", "levelValue", "levelColor", "level", "levelWithColor", "description", "characteristicValue", "canBeIncreased", "canBeDecreased", "isMaxedOut" });

    switch (atE.dFj[localqE.ordinal()]) {
    case 1:
      dLE.doY().a(byv.bFN().bFO(), new String[] { "availableCommonPoints", "aptitudeMenuText" });

      break;
    case 2:
      dLE.doY().a(byv.bFN().bFO(), new String[] { "availableAptitudePoints", "aptitudeMenuText" });
    }
  }

  public void o(bWG parambWG)
  {
    if (!h(parambWG)) {
      return;
    }
    agT localagT = (agT)this.bHT.bf(parambWG.cbI().bQE().bJ());
    int i = localagT.c(parambWG.cbI().bQz(), (short)-1, (short)0);
    if (i == 0) {
      localagT.av(parambWG.cbI().bQz());
    }
    int j = -parambWG.a((short)(i + 1 + parambWG.nU()), byv.bFN().bFO());
    qE localqE = parambWG.cbI().bQE();
    this.bHU.ah(localqE.bJ(), j, 0);

    dLE.doY().a(parambWG, new String[] { "nameAndLevel", "levelValue", "levelColor", "level", "levelWithColor", "description", "characteristicValue", "canBeIncreased", "canBeDecreased", "isMaxedOut" });

    switch (atE.dFj[localqE.ordinal()]) {
    case 1:
      dLE.doY().a(byv.bFN().bFO(), new String[] { "availableCommonPoints", "aptitudeMenuText" });

      break;
    case 2:
      dLE.doY().a(byv.bFN().bFO(), new String[] { "availableAptitudePoints", "aptitudeMenuText" });
    }
  }

  public int b(qE paramqE)
  {
    return this.bHU.get(paramqE.bJ());
  }

  public agT c(qE paramqE) {
    return (agT)this.bHT.bf(paramqE.bJ());
  }
}