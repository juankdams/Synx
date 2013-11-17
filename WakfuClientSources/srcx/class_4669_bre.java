import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class bre extends cGj
  implements bbk
{
  protected static final Logger K = Logger.getLogger(bre.class);
  public static final String bwu = "animName";
  public static final String fdZ = "actorDescriptorLibrary";
  public static final String fMp = "equipmentBonuses";
  public static final String fMq = "headEquipment";
  public static final String fMr = "hairEquipment";
  public static final String fMs = "faceEquipment";
  public static final String fMt = "shoulderEquipment";
  public static final String fMu = "neckEquipment";
  public static final String fMv = "chestEquipment";
  public static final String fMw = "armsEquipment";
  public static final String fMx = "leftHandEquipment";
  public static final String fMy = "rightHandEquipment";
  public static final String fMz = "beltEquipment";
  public static final String fMA = "skirtEquipment";
  public static final String fMB = "trousersEquipment";
  public static final String fMC = "legsEquipment";
  public static final String fMD = "petEquipment";
  public static final String fME = "costumeEquipment";
  public static final String fMF = "backEquipment";
  public static final String fMG = "wingEquipment";
  public static final String fMH = "firstWeaponEquipment";
  public static final String fMI = "secondWeaponEquipment";
  public static final String fMJ = "accessoryEquipment";
  private final dPx fMK = new dPx();
  private final cew fML;
  private final bPu fMM = new bPu(ckh.values().length);

  private static final String[] bF = { "headEquipment", "hairEquipment", "faceEquipment", "shoulderEquipment", "neckEquipment", "chestEquipment", "armsEquipment", "leftHandEquipment", "rightHandEquipment", "beltEquipment", "skirtEquipment", "trousersEquipment", "legsEquipment", "petEquipment", "backEquipment", "wingEquipment", "firstWeaponEquipment", "secondWeaponEquipment", "accessoryEquipment", "costumeEquipment", "actorDescriptorLibrary", "equipmentBonuses" };

  public bre()
  {
    byz localbyz = byv.bFN().bFO();
    this.fML = new cew(new bKm());
    this.fML.e(localbyz.aeL());
    bZH localbZH = localbyz.ayJ();
    for (Iterator localIterator = localbZH.iterator(); localIterator.hasNext(); ) {
      gA localgA = (gA)localIterator.next();
      Y(localgA);
    }
    localbZH.d(this);
  }

  public String[] getFields()
  {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("animName"))
      return null;
    if (paramString.equals("actorDescriptorLibrary")) {
      return this.fML;
    }

    if (paramString.equals("headEquipment")) {
      return this.fMK.bf(azO.dRx.hV);
    }
    if (paramString.equals("hairEquipment")) {
      return this.fMK.bf(azO.dRy.hV);
    }
    if (paramString.equals("faceEquipment")) {
      return this.fMK.bf(azO.dRz.hV);
    }
    if (paramString.equals("shoulderEquipment")) {
      return this.fMK.bf(azO.dRA.hV);
    }
    if (paramString.equals("neckEquipment")) {
      return this.fMK.bf(azO.dRB.hV);
    }
    if (paramString.equals("chestEquipment")) {
      return this.fMK.bf(azO.dRC.hV);
    }
    if (paramString.equals("armsEquipment")) {
      return this.fMK.bf(azO.dRD.hV);
    }
    if (paramString.equals("leftHandEquipment")) {
      return this.fMK.bf(azO.dRE.hV);
    }
    if (paramString.equals("rightHandEquipment")) {
      return this.fMK.bf(azO.dRF.hV);
    }
    if (paramString.equals("beltEquipment")) {
      return this.fMK.bf(azO.dRH.hV);
    }
    if (paramString.equals("skirtEquipment")) {
      return this.fMK.bf(azO.dRG.hV);
    }
    if (paramString.equals("trousersEquipment")) {
      return this.fMK.bf(azO.dRI.hV);
    }
    if (paramString.equals("legsEquipment")) {
      return this.fMK.bf(azO.dRJ.hV);
    }
    if (paramString.equals("backEquipment")) {
      return this.fMK.bf(azO.dRK.hV);
    }
    if (paramString.equals("wingEquipment")) {
      return this.fMK.bf(azO.dRL.hV);
    }
    if (paramString.equals("firstWeaponEquipment")) {
      return this.fMK.bf(azO.dRM.hV);
    }
    if (paramString.equals("secondWeaponEquipment")) {
      return this.fMK.bf(azO.dRN.hV);
    }
    if (paramString.equals("accessoryEquipment")) {
      return this.fMK.bf(azO.dRO.hV);
    }
    if (paramString.equals("petEquipment")) {
      return this.fMK.bf(azO.dRT.hV);
    }
    if (paramString.equals("costumeEquipment")) {
      return this.fMK.bf(azO.dRU.hV);
    }

    if (paramString.equals("equipmentBonuses")) {
      byz localbyz = byv.bFN().bFO();
      ArrayList localArrayList = new ArrayList();
      for (aJp localaJp = this.fMK.dqF(); localaJp.hasNext(); ) {
        localaJp.fl();
        localArrayList.add(localaJp.value());
      }
      return localbyz.a(localbyz, localArrayList);
    }

    return null;
  }

  public void Y(gA paramgA) {
    ge localge = paramgA.oi().bKn();
    azO localazO1 = localge.nh()[0];
    this.fMK.c(localazO1.bJ(), paramgA);
    b(paramgA, localazO1.bJ());
    for (azO localazO2 : localge.nj()) {
      this.fMK.c(localazO2.bJ(), paramgA.nG());
    }
    refresh();
  }

  private void b(gA paramgA, byte paramByte) {
    ge localge = paramgA.oi().bKn();

    bT((short)paramByte);

    if (!localge.nm())
      return;
    int i = byv.bFN().bFO().xK() == 0 ? paramgA.oc() : paramgA.od();

    ckh localckh = ckh.de((short)paramByte);
    if (localckh == null)
      return;
    try
    {
      String str = ay.bd().getString("ANMEquipmentPath");
      Anm localAnm = cew.eo(String.format(str, new Object[] { Integer.valueOf(i) }));
      this.fML.a(localAnm, localckh.hLl);
      this.fMM.c((short)paramByte, localAnm);
    } catch (Exception localException) {
      K.error("Erreur au chargement de l'équipment : " + i, localException);
    }
  }

  private void bT(short paramShort) {
    Anm localAnm = (Anm)this.fMM.cw(paramShort);
    if (localAnm != null) {
      ckh localckh = ckh.de(paramShort);
      if (localckh != null)
        this.fML.c(localAnm, localckh.hLl);
    }
  }

  public void da(byte paramByte)
  {
    azO localazO1 = azO.bu(paramByte);
    gA localgA = (gA)this.fMK.bf(paramByte);

    if ((localazO1 == azO.dRU) || (localazO1 == azO.dRO))
      a(localgA.oi(), false);
    this.fMK.be(paramByte);
    for (azO localazO2 : localgA.oi().bKn().nj()) {
      this.fMK.be(localazO2.bJ());
    }
    refresh();
  }

  public void refresh() {
    this.fML.bIW();
    this.fML.aty().im();

    this.fML.jz(Integer.toString(byv.bFN().bFO().oc()));
    aep();

    for (aJp localaJp = this.fMK.dqF(); localaJp.hasNext(); ) {
      localaJp.fl();

      this.fML.a(((gA)localaJp.value()).oi(), (short)localaJp.rC());
    }
    bzO();
    dLE.doY().a(this, bF);
  }

  private void aep()
  {
    byz localbyz = byv.bFN().bFO();
    String str1 = localbyz.afm();
    String str2 = localbyz.afl();

    if ((str1 != null) || (str2 != null))
    {
      String str3;
      try {
        str3 = ay.bd().getString("ANMEquipmentPath");
      } catch (bdh localbdh) {
        K.error("Erreur au chargement d'une propriété", localbdh);
        return;
      }
      String str4;
      if (str1 != null) {
        str4 = String.format(str3, new Object[] { str1 });
        this.fML.b(str4, diq.ph("VETEMENTCUSTOM"));
      }
      if (str2 != null) {
        str4 = String.format(str3, new Object[] { str2 });

        this.fML.b(str4, diq.ph("CHEVEUXCUSTOM"));
      }
    }
  }

  public gA aO(byte paramByte) {
    return (gA)this.fMK.bf(paramByte);
  }

  public void c(gA paramgA, byte paramByte) {
    ge localge = paramgA.oi().bKn();
    if (!localge.a(azO.bu(paramByte))) {
      return;
    }
    this.fMK.c(paramByte, paramgA);
    b(paramgA, paramByte);

    for (azO localazO : localge.nj())
      this.fMK.c(localazO.bJ(), paramgA.nG());
    refresh();
  }

  private void bzO() {
    byte b = azO.dRU.bJ();
    gA localgA1 = aO(b);
    if (localgA1 != null)
      a(localgA1.oi(), true);
    b = azO.dRO.bJ();
    gA localgA2 = aO(b);
    if (localgA2 != null)
      a(localgA2.oi(), true);
  }

  private boolean a(bBn parambBn, boolean paramBoolean) {
    cjT localcjT = parambBn.bKe();
    for (dpI localdpI : localcjT)
      if (localdpI.eo() == bsj.fSd.getId())
      {
        int i = localdpI.a(0, (short)0, dNF.meh);
        bJC localbJC = cNO.cFX().yF(i);
        if (localbJC != null)
        {
          a(localbJC, paramBoolean);
        }
      }
    return false;
  }

  private void a(bJC parambJC, boolean paramBoolean) {
    ArrayList localArrayList = parambJC.cd((short)0);
    for (dpI localdpI : localArrayList) {
      int i = byv.bFN().bFO().xK();
      bZA localbZA = localdpI.bew();
      if (localbZA == null)
        b(localdpI, paramBoolean);
      else if (((localbZA instanceof cpH)) && 
        (((cpH)localbZA).xK() == i))
        b(localdpI, paramBoolean);
    }
  }

  private void b(dpI paramdpI, boolean paramBoolean)
  {
    List localList = paramdpI.beB();
    for (cHP localcHP : localList)
      if (paramBoolean)
        a(paramdpI, localcHP);
      else
        b(paramdpI, localcHP);
  }

  private boolean a(dpI paramdpI, cHP paramcHP)
  {
    Object localObject1;
    Object localObject2;
    if (paramcHP.Ds() == cVZ.kIP) {
      localObject1 = (bZf)paramcHP;
      localObject2 = new dCf(paramdpI, ((bZf)localObject1).cdK(), ((bZf)localObject1).ayf(), ((bZf)localObject1).cdL());
      ((dCf)localObject2).b(this.fML, false);
      return true;
    }
    if (paramcHP.Ds() == cVZ.kIT) {
      localObject1 = (bGs)paramcHP;
      localObject2 = new cdj(paramdpI, ((bGs)localObject1).getVisibility(), ((bGs)localObject1).bEZ());
      ((cdj)localObject2).a(this.fML);
      return true;
    }
    return false;
  }

  private boolean b(dpI paramdpI, cHP paramcHP)
  {
    if (paramcHP.Ds() == cVZ.kIT) {
      bGs localbGs = (bGs)paramcHP;
      cdj localcdj = new cdj(paramdpI, !localbGs.getVisibility(), localbGs.bEZ());
      localcdj.a(this.fML);
      return true;
    }
    return false;
  }

  public void a(bNz parambNz) {
    dLE.doY().a(this, new String[] { "equipmentBonuses" });
  }
}