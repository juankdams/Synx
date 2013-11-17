import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class czM
  implements dBv
{
  private static final Logger K = Logger.getLogger(czM.class);
  public static final String bC = "name";
  public static final String ioK = "nameWithRarity";
  public static final String RI = "description";
  public static final String aIE = "type";
  public static final String ioL = "itemTypeColor";
  public static final String ioM = "isRefItem";
  public static final String ioN = "set";
  public static final String ioO = "isEquiped";
  public static final String ioP = "isEquipableType";
  public static final String ioQ = "isEquipable";
  public static final String ioR = "isPreviewable";
  public static final String ioS = "isInInventory";
  public static final String bsP = "level";
  public static final String ioT = "levelDescription";
  public static final String fCg = "effect";
  public static final String ioU = "effectAndCaracteristic";
  public static final String ioV = "effectDetails";
  public static final String ioW = "criticalEffectDetails";
  public static final String ioX = "shortEffectDetails";
  public static final String ioY = "hasCaracteristic";
  public static final String ioZ = "caracteristic";
  public static final String ipa = "requirement";
  public static final String ipb = "useRequirement";
  public static final String ipc = "craftRequirement";
  public static final String ipd = "conditionDescription";
  public static final String RH = "iconUrl";
  public static final String ipe = "iconBigUrl";
  public static final String dwK = "ap";
  public static final String ipf = "apDesc";
  public static final String dwO = "range";
  public static final String dwP = "areaOfEffectIconURL";
  public static final String ipg = "isActionLinked";
  public static final String hAh = "ingredients";
  public static final String iph = "storingCapacity";
  public static final String ipi = "craftMovable";
  public static final String ipj = "isPerfect";
  public static final String ipk = "isRelic";
  public static final String ipl = "isCraftable";
  public static final String ipm = "isUsedInCraft";
  public static final String ipn = "craftsUsedIntoDescription";
  public static final String ipo = "hasCraftsUsingItem";
  public static final String ipp = "hasXp";
  public static final String ipq = "gems";
  public static final String ipr = "itemUseStyle";
  public static final String ips = "itemUseDescription";
  public static final String ipt = "hasHealEffect";
  public static final String ipu = "hasHealEffect";
  public static final String[] bF = { "name", "description", "type", "level", "effect", "effectAndCaracteristic", "criticalEffectDetails", "shortEffectDetails", "caracteristic", "requirement", "iconUrl", "iconBigUrl", "ap", "range", "areaOfEffectIconURL", "set", "isEquiped", "isInInventory", "isEquipable", "isPreviewable", "ingredients", "storingCapacity", "conditionDescription", "craftMovable", "isPerfect", "isRelic", "isCraftable", "gems", "itemUseStyle", "itemUseDescription" };
  private static final String ikj = "craft";
  private bBn aFd;
  private ArrayList ipv = null;
  private ArrayList ipw = null;
  private String ipx = null;
  private ArrayList ipy = null;
  private OW ipz;

  public String[] getFields()
  {
    return bF;
  }

  public czM(bBn parambBn)
  {
    this.aFd = parambBn;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("isRefItem"))
      return Boolean.valueOf(true);
    if (paramString.equals("name"))
      return this.aFd.getName();
    if (paramString.equals("nameWithRarity"))
      return new lZ().tI().am(this.aFd.bKs().getColor().bUV()).a(this.aFd.getName()).tJ().tP();
    if (paramString.equals("itemTypeColor"))
      return this.aFd.bKt().getColor().toString();
    Object localObject1;
    if (paramString.equals("description")) {
      localObject1 = this.aFd.getDescription();
      if ((localObject1 == null) || (((String)localObject1).length() == 0)) {
        return null;
      }
      return "\"" + (String)localObject1 + "\"";
    }
    Object localObject3;
    if (paramString.equals("type")) {
      localObject1 = X.aw().f(this.aFd.bKn().nc()).getName();

      int n = 0;

      localObject3 = localObject1;

      return "[" + (String)localObject3 + "]";
    }if (paramString.equals("level"))
      return Short.valueOf(this.aFd.nU());
    Object localObject5;
    if (paramString.equals("levelDescription")) {
      localObject1 = byv.bFN().bFO();
      if (localObject1 == null) {
        return bU.fH().getString("levelShort.custom", new Object[] { Short.valueOf(this.aFd.nU()) });
      }
      localObject3 = (cVY)((byz)localObject1).ayJ().ajz();
      if (localObject3 == null) {
        return bU.fH().getString("levelShort.custom", new Object[] { Short.valueOf(this.aFd.nU()) });
      }
      localObject5 = new lZ();
      boolean bool1 = true;
      if (this.aFd.bKn().nh().length == 0) {
        if ((this.aFd.bKr() instanceof alo)) {
          int i2 = ((alo)this.aFd.bKr()).alM();
          bool1 = ((byz)localObject1).aTn().getLevel(((alo)this.aFd.bKr()).axX()) >= i2;
        }
      }
      else bool1 = cVY.a(this.aFd, (dle)localObject1);

      if (!bool1) {
        ((lZ)localObject5).tI().am(bNa.gRz.bUV());
      }
      ((lZ)localObject5).a(bU.fH().getString("levelShort.custom", new Object[] { Short.valueOf(this.aFd.nU()) }));
      if (!bool1) {
        ((lZ)localObject5).tJ();
      }
      return ((lZ)localObject5).tP();
    }if (paramString.equals("isEquipableType"))
      return Boolean.valueOf(cwB());
    if (paramString.equals("isEquipable"))
      return Boolean.valueOf(cwA());
    if (paramString.equals("isPreviewable"))
    {
      return Boolean.valueOf(this.aFd.bKn().nh().length > 0);
    }
    Object localObject6;
    if (paramString.equals("isEquiped"))
    {
      localObject1 = byv.bFN().bFO().ayJ();
      int j = -1;
      if ((this.aFd instanceof QM)) {
        j = ((QM)this.aFd).acv().getId();
      }
      for (localObject5 = ((bZH)localObject1).iterator(); ((Iterator)localObject5).hasNext(); ) { localObject6 = (gA)((Iterator)localObject5).next();
        if ((((gA)localObject6).oi().getId() == this.aFd.getId()) || (((((gA)localObject6).oi() instanceof QM)) && (j == ((QM)((gA)localObject6).oi()).acv().getId())))
        {
          return Boolean.valueOf(true);
        }
      }

      return Boolean.valueOf(false);
    }if (paramString.equals("isInInventory"))
    {
      localObject1 = byv.bFN().bFO().bGP().cEg();

      while (((cHu)localObject1).hasNext()) {
        ((cHu)localObject1).fl();
        cRs localcRs = (cRs)((cHu)localObject1).value();

        if (localcRs.hg(this.aFd.getId())) {
          return Boolean.valueOf(true);
        }
      }

      return Boolean.valueOf(false);
    }
    short s;
    if (paramString.equals("set")) {
      s = this.aFd.bKk();
      if (s != 0) {
        return bCc.bKN().cm(s);
      }
      return null;
    }if (paramString.equals("apDesc")) {
      s = this.aFd.bKg();
      if (s > 0) {
        return "<b color=\"00afea\">" + this.aFd.bKg() + " " + bU.fH().getString("APShort") + "</b>";
      }
      return null;
    }
    if (paramString.equals("ap"))
      return Byte.valueOf(this.aFd.bKg());
    if (paramString.equals("range")) {
      int i = this.aFd.bKp();
      int k = this.aFd.bKo();
      if ((i == 0) && (k == 0)) {
        return null;
      }
      if (i == k) {
        return Integer.valueOf(i);
      }

      return i + "-" + k;
    }if (paramString.equalsIgnoreCase("areaOfEffectIconURL"))
      return cwC();
    if (paramString.equals("hasCaracteristic"))
      return Boolean.valueOf(!cwF().isEmpty());
    if (paramString.equals("caracteristic"))
      return cwF();
    if (paramString.equals("effect"))
      return !cwD().isEmpty() ? cwD() : null;
    if (paramString.equals("effectAndCaracteristic"))
      return an(null);
    if (paramString.equals("effectDetails"))
      return a(cMx.krQ, this.aFd, null);
    if (paramString.equals("shortEffectDetails"))
      return a(cMx.krQ, this.aFd, null);
    if (paramString.equals("criticalEffectDetails")) {
      if (this.ipw == null) {
        this.ipw = a(cMx.krR, this.aFd, null);
      }
      return !this.ipw.isEmpty() ? this.ipw : null;
    }
    Object localObject2;
    if (paramString.equals("requirement"))
    {
      localObject2 = new StringBuilder();
      bZA localbZA = this.aFd.a(Aq.bvQ);

      localObject5 = byv.bFN().bFO();
      if (localbZA != null) {
        localObject6 = daj.a(localbZA);
        if (((String)localObject6).length() > 0) {
          if (localbZA.i(localObject5, this, null, ((byz)localObject5).bEY()))
            ((StringBuilder)localObject2).append((String)localObject6);
          else {
            ((StringBuilder)localObject2).append("<text color=\"cc4444\">").append((String)localObject6).append("</text>");
          }
        }
      }
      return ((StringBuilder)localObject2).toString();
    }
    Object localObject7;
    int i8;
    String str3;
    String str4;
    if (paramString.equals("useRequirement"))
    {
      int m = 1;
      localObject5 = byv.bFN().bFO();
      localObject6 = new lZ();

      if (((byz)localObject5).aeQ() == null)
        localObject2 = this.aFd.a(Aq.bvO);
      else {
        localObject2 = this.aFd.a(Aq.bvP);
      }

      if (localObject2 != null) {
        localObject7 = daj.a((dKY)localObject2);
        if (((bZA)localObject2).i(byv.bFN().bFO(), this, null, null))
          ((lZ)localObject6).a((CharSequence)localObject7);
        else {
          ((lZ)localObject6).tI().am("cc4444").a((CharSequence)localObject7).tJ();
        }

        m = 0;
      }

      localObject2 = null;

      localObject7 = this.aFd.bKr();
      if (localObject7 != null) {
        localObject2 = ((adx)localObject7).F();
      }

      if (localObject2 != null) {
        if (m == 0) {
          ((lZ)localObject6).tH();
        }

        localObject8 = daj.a((dKY)localObject2);
        if (((bZA)localObject2).i(byv.bFN().bFO(), this, null, null))
          ((lZ)localObject6).a((CharSequence)localObject8);
        else {
          ((lZ)localObject6).tI().am("cc4444").a((CharSequence)localObject8).tJ();
        }

        m = 0;
      }

      Object localObject8 = (dKf)this.aFd.bKr();
      if ((localObject8 != null) && ((localObject8 instanceof alo))) {
        if (m == 0) {
          ((lZ)localObject6).tH();
        }
        int i6 = ((alo)localObject8).alM();
        i8 = ((alo)localObject8).axX();
        str3 = bU.fH().b(43, i8, new Object[0]);
        str4 = bU.fH().getString("craft.neededAtLevel", new Object[] { str3, Integer.valueOf(i6) });
        ((lZ)localObject6).a(str4);

        m = 0;
      }

      if (localObject8 != null) {
        String str2 = ((dKf)localObject8).bAu();
        if (str2 != null) {
          ((lZ)localObject6).tI().am("cc4444").a(str2).tJ();
        }
      }

      return ((lZ)localObject6).tP();
    }
    Object localObject4;
    if (paramString.equals("conditionDescription"))
    {
      localObject2 = byv.bFN().bFO();
      localObject4 = new ArrayList();
      localObject5 = this.aFd.a(Aq.bvQ);
      if (localObject5 != null) {
        a((bZA)localObject5, (ArrayList)localObject4, byv.bFN().bFO().bEY());
      }

      if (((byz)localObject2).aeQ() == null)
        localObject5 = this.aFd.a(Aq.bvO);
      else {
        localObject5 = this.aFd.a(Aq.bvP);
      }

      if (localObject5 != null) {
        a((bZA)localObject5, (ArrayList)localObject4, null);
      }

      localObject5 = null;

      localObject6 = this.aFd.bKr();
      if (localObject6 != null) {
        localObject5 = ((adx)localObject6).F();
      }

      if (localObject5 != null) {
        a((bZA)localObject5, (ArrayList)localObject4, null);
      }

      localObject7 = (dKf)this.aFd.bKr();
      if ((localObject7 != null) && ((localObject7 instanceof alo))) {
        int i4 = ((alo)localObject7).alM();
        int i7 = ((alo)localObject7).axX();
        i8 = (((byz)localObject2).aTn().contains(i7)) && (((byz)localObject2).aTn().getLevel(i7) >= i4) ? 1 : 0;
        str3 = bU.fH().b(43, i7, new Object[0]);
        str4 = bU.fH().getString("craft.neededAtLevel", new Object[] { str3, Integer.valueOf(i4) });
        if (i8 == 0) {
          str4 = "<text color=\"cc4444\">" + str4 + "</text>";
        }
        ((ArrayList)localObject4).add(str4);
      }

      if (localObject7 != null) {
        String str1 = ((dKf)localObject7).bAu();
        if (str1 != null) {
          ((ArrayList)localObject4).add("<text color=\"cc4444\">" + str1 + "</text>");
        }
      }

      return localObject4;
    }if (paramString.equals("iconUrl")) {
      localObject2 = byv.bFN().bFO();
      return ay.bd().u(((byz)localObject2).xK() == 1 ? this.aFd.od() : this.aFd.oc());
    }if (paramString.equals("iconBigUrl")) {
      localObject2 = byv.bFN().bFO();
      return ay.bd().v(((byz)localObject2).xK() == 1 ? this.aFd.od() : this.aFd.oc());
    }if (paramString.equals("isActionLinked"))
      return Boolean.valueOf(this.aFd.bKr() != null);
    if (paramString.equals("storingCapacity"))
      return Short.valueOf(cqa.hZQ.we(this.aFd.getId()));
    if (paramString.equals("craftRequirement")) {
      localObject2 = new lZ();
      localObject4 = this.aFd.a(Aq.bvT);

      if (localObject4 != null) {
        localObject5 = daj.a((dKY)localObject4);
        if (((bZA)localObject4).i(byv.bFN().bFO(), this, null, byv.bFN().bFO().bEY()))
          ((lZ)localObject2).a((CharSequence)localObject5);
        else {
          ((lZ)localObject2).tI().am("cc4444").a((CharSequence)localObject5).tJ();
        }
      }
      return ((lZ)localObject2).tP();
    }if (!paramString.equals("ingredients"))
    {
      if (paramString.equals("craftMovable"))
        return Boolean.valueOf(this.aFd.bKx());
      if (paramString.equals("isPerfect"))
        return Boolean.valueOf(cwz());
      if (paramString.equals("isRelic"))
        return Boolean.valueOf(this.aFd.bKs() == cxg.ijW);
      if (paramString.equals("isCraftable"))
        return Boolean.valueOf(cwy());
      if (paramString.equals("isUsedInCraft"))
        return Boolean.valueOf(bcF.fmQ.oR(this.aFd.getId()) != null);
      if (paramString.equals("hasCraftsUsingItem")) {
        localObject2 = bcF.fmQ.oR(this.aFd.getId());
        if (localObject2 == null) {
          return null;
        }

        localObject4 = ((adz)localObject2).toArray();
        Arrays.sort((int[])localObject4);

        localObject5 = byv.bFN().bFO().aTn();

        for (int i1 = 0; i1 < localObject4.length; i1++) {
          if (((azP)localObject5).contains(localObject4[i1])) {
            return Boolean.valueOf(true);
          }
        }
        return Boolean.valueOf(false);
      }if (paramString.equals("craftsUsedIntoDescription")) {
        localObject2 = bcF.fmQ.oR(this.aFd.getId());
        if (localObject2 == null) {
          return null;
        }

        localObject4 = ((adz)localObject2).toArray();
        Arrays.sort((int[])localObject4);

        localObject5 = byv.bFN().bFO().aTn();

        lZ locallZ = new lZ();
        locallZ.a(bU.fH().getString("crafts.item.isUsedIn")).tH();
        int i3 = 0; for (int i5 = localObject4.length; i3 < i5; i3++) {
          if (i3 != 0) {
            locallZ.a(", ");
          }
          boolean bool2 = ((azP)localObject5).contains(localObject4[i3]);
          if (!bool2) {
            locallZ.tI().am(bNa.gRz.bUV());
          }
          locallZ.a(bU.fH().b(43, localObject4[i3], new Object[0]));
          if (!bool2) {
            locallZ.tJ();
          }
        }
        return locallZ.toString();
      }if (paramString.equals("hasXp"))
        return Boolean.valueOf(false);
      if (paramString.equals("gems"))
        return Hw();
      if (paramString.equals("itemUseStyle")) {
        localObject2 = (bVw)this.aFd;
        return ((bVw)localObject2).cbg().getStyle();
      }if (paramString.equals("itemUseDescription")) {
        localObject2 = (bVw)this.aFd;
        return bU.fH().getString(((bVw)localObject2).cbg().agf());
      }if (paramString.equals("hasHealEffect"))
        return Boolean.valueOf(this.aFd.bKF());
    }
    return null;
  }

  private void a(bZA parambZA, ArrayList paramArrayList, Object paramObject) {
    String str1 = daj.a(parambZA);
    if (str1.length() <= 0) {
      return;
    }
    String[] arrayOfString1 = dzp.c(str1, '\n');
    for (String str2 : arrayOfString1) {
      if (!parambZA.i(byv.bFN().bFO(), this, null, paramObject)) {
        str2 = "<text color=\"cc4444\">" + str2 + "</text>";
      }
      paramArrayList.add(str2);
    }
  }

  private OW Hw() {
    if (this.ipz == null) {
      this.ipz = new OW(null, this.aFd.bKA() ? new cdI(this.aFd) : cdI.hxG);
    }

    return this.ipz;
  }

  public ArrayList an(gA paramgA) {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = a(cMx.krQ, this.aFd, paramgA);
    if (!localArrayList2.isEmpty()) {
      localArrayList1.add(bU.fH().getString("effectOnUse"));
      for (localObject1 = localArrayList2.iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (String)((Iterator)localObject1).next();
        localArrayList1.add(localObject2);
      }
    }
    Object localObject2;
    Object localObject1 = b(this.aFd, paramgA);
    if (!((ArrayList)localObject1).isEmpty()) {
      localArrayList1.add(bU.fH().getString("effectOnEquip"));
      for (localObject2 = ((ArrayList)localObject1).iterator(); ((Iterator)localObject2).hasNext(); ) { String str = (String)((Iterator)localObject2).next();
        localArrayList1.add(str);
      }
    }
    return !localArrayList1.isEmpty() ? localArrayList1 : null;
  }

  private boolean cwy() {
    return ((vd)Hh.QM()).df(this.aFd.getId());
  }

  public boolean cwz() {
    if (this.aFd.acu() != cqG.iau) {
      return false;
    }
    QM localQM = (QM)this.aFd;
    return localQM.acw();
  }

  public void a(String paramString, Object paramObject)
  {
  }

  public void b(String paramString, Object paramObject)
  {
  }

  public void c(String paramString, Object paramObject)
  {
  }

  public boolean l(String paramString) {
    return false;
  }

  public boolean cwA()
  {
    if (this.aFd.bKn().nh().length > 0)
    {
      cHu localcHu = byv.bFN().bFO().bGP().cEg();
      while (localcHu.hasNext()) {
        localcHu.fl();
        cRs localcRs = (cRs)localcHu.value();
        if (localcRs.hg(this.aFd.getId()))
        {
          bZA localbZA = this.aFd.a(Aq.bvQ);
          if ((localbZA != null) && (!localbZA.i(byv.bFN().bFO(), this, null, byv.bFN().bFO().bEY()))) {
            break;
          }
          return true;
        }
      }

    }

    return false;
  }

  public boolean cwB() {
    return this.aFd.bKn().nh().length > 0;
  }

  public String cwC() {
    if (this.ipx == null)
    {
      Iterator localIterator = this.aFd.bKh();
      ArrayList localArrayList = new ArrayList();

      this.ipx = "";
      Object localObject;
      while (localIterator.hasNext()) {
        localObject = (dpI)localIterator.next();

        if (((dpI)localObject).bev()) {
          localArrayList.add(((dpI)localObject).aui());
        }
      }

      if (!localArrayList.isEmpty())
      {
        localObject = chY.R(localArrayList);
        String str = ((bbH)localObject).eP().toString();
        if (str.equals("SPECIAL")) {
          return "";
        }
        try
        {
          str = String.format(ay.bd().getString("areasIconsPath"), new Object[] { str });
          this.ipx = aPf.c(str, -1, -1, null);
        } catch (bdh localbdh) {
          K.error(localbdh);
        }
      }
    }

    return this.ipx;
  }

  public ArrayList cwD()
  {
    if (this.ipv == null) {
      this.ipv = a(cMx.krQ, this.aFd, null);
    }

    return this.ipv;
  }

  public ArrayList cwE()
  {
    if (this.ipw == null) {
      this.ipw = a(cMx.krR, this.aFd, null);
    }

    return this.ipw;
  }

  public static ArrayList a(cMx paramcMx, bBn parambBn, gA paramgA)
  {
    switch (dIz.lTp[paramcMx.ordinal()]) {
    case 1:
      return a(XG.cIc, parambBn, paramgA);
    }
    return a(XG.cIb, parambBn, paramgA);
  }

  private static ArrayList a(XG paramXG, bBn parambBn, gA paramgA)
  {
    byz localbyz = byv.bFN().bFO();
    ks localks = new ks(parambBn, paramgA, localbyz.cQY(), localbyz.ayJ(), paramXG);
    return localks.cAK();
  }

  public ArrayList cwF()
  {
    if (this.ipy == null) {
      this.ipy = b(this.aFd, null);
    }

    return this.ipy;
  }

  public static ArrayList b(bBn parambBn, gA paramgA) {
    byz localbyz = byv.bFN().bFO();
    ks localks = new ks(parambBn, paramgA, localbyz.cQY(), localbyz.ayJ(), XG.cIa);
    return localks.cAK();
  }

  public void of()
  {
    this.ipy = null;
    this.ipv = null;
    this.ipw = null;
    if (this.aFd.bKk() != 0) {
      dLB localdLB = bCc.bKN().cm(this.aFd.bKk());
      if (localdLB != null)
        localdLB.of();
    }
  }
}