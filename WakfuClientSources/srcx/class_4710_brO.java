import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class brO extends cGj
  implements bBz, Comparable
{
  private static Logger K = Logger.getLogger(brO.class);

  private final ArrayList fNG = new ArrayList();
  private int fNH;
  private bvk fNI;
  private ArrayList fNJ = new ArrayList();
  private aee aOr;
  public static final String bC = "name";
  public static final String bHI = "nameAndLevel";
  public static final String RI = "description";
  public static final String fNK = "tableTurnDuration";
  public static final String fNL = "plainRemainingDuration";
  public static final String bsU = "remainingDuration";
  public static final String fNM = "remainingDurationText";
  public static final String fNN = "isInfiniteDuration";
  public static final String RH = "iconUrl";
  public static final String epS = "effects";
  public static final String fNO = "stackSize";
  public static final String[] bF = { "name", "tableTurnDuration", "remainingDuration", "remainingDurationText", "iconUrl", "effects", "stackSize" };

  private static final aee bx = new bOO(new cAw());

  public static brO d(Ce paramCe)
  {
    brO localbrO;
    try
    {
      localbrO = (brO)bx.Mm();
      localbrO.aOr = bx;
    } catch (Exception localException) {
      localbrO = new brO();
      localbrO.aOr = null;
      K.error("Erreur lors d'un checkOut sur un RunningEffectFieldProvider : " + localException.getMessage());
    }

    localbrO.fNJ.add(paramCe);
    localbrO.fNH = -1;
    return localbrO;
  }

  public Object getFieldValue(String paramString)
  {
    Object localObject;
    if (paramString.equalsIgnoreCase("nameAndLevel")) {
      localObject = getName();
      int i = bzV();
      if (i < 2) {
        return localObject;
      }
      return (String)localObject + " (" + bU.fH().getString("levelShort.custom", new Object[] { Integer.valueOf(i) }) + ")";
    }if (paramString.equalsIgnoreCase("name"))
      return getName();
    if (paramString.equalsIgnoreCase("description"))
      return getDescription();
    if (paramString.equalsIgnoreCase("plainRemainingDuration"))
      return o(false, true);
    if (paramString.equalsIgnoreCase("remainingDuration"))
      return o(true, true);
    if (paramString.equalsIgnoreCase("remainingDurationText"))
      return o(true, false);
    if (paramString.equals("isInfiniteDuration")) {
      localObject = byv.bFN().bFO().aeQ();
      if ((localObject != null) && (this.fNI != null)) {
        return Boolean.valueOf(this.fNI.isInfinite());
      }

      return Boolean.valueOf(this.fNH == -1);
    }

    if (paramString.equalsIgnoreCase("iconUrl")) {
      return fJ();
    }
    if (paramString.equalsIgnoreCase("stackSize"))
      return Integer.valueOf(bzV());
    if (paramString.equalsIgnoreCase("effects")) {
      localObject = bzU();
      return ((String)localObject).length() > 0 ? localObject : null;
    }

    return null;
  }

  private String getDescription() {
    Ce localCe = bzX();
    Object localObject1;
    Object localObject2;
    switch (localCe.nS()) {
    case 1:
      localObject1 = (bXU)localCe;
      localObject2 = ((bXU)localObject1).getDescription();
      if ((localObject2 != null) && (((String)localObject2).length() > 0)) {
        return localObject2;
      }

      break;
    case 34:
      if (this.fNG.isEmpty())
        return null;
      localObject1 = (aVc)this.fNG.get(0);
      localObject2 = vH.dk(((aVc)localObject1).bkc().yR());
      return bU.fH().getString("antiAddictionLevel.desc." + ((vH)localObject2).bJ());
    }

    return null;
  }

  private String o(boolean paramBoolean1, boolean paramBoolean2) {
    byz localbyz = byv.bFN().bFO();
    arl localarl = localbyz.aeQ();
    if ((localarl != null) && (this.fNI != null))
    {
      if (this.fNI.isInfinite()) {
        return null;
      }
      short s = localarl.aDp().a(this.fNI);
      if (s == 0) {
        localObject1 = paramBoolean2 ? bU.fH().getString("remaining.duration.turn.short", new Object[] { "&lt;1" }) : bU.fH().getString("duration.last.turn");
        return paramBoolean1 ? new lZ().tI().am(bNa.gRz.bUV()).a((CharSequence)localObject1).tP() : localObject1;
      }
      localObject1 = paramBoolean2 ? bU.fH().getString("remaining.duration.turn.short", new Object[] { Short.valueOf(s) }) : bU.fH().getString("remaining.turns", new Object[] { Short.valueOf(s) });

      if ((s <= 2) && (paramBoolean1)) {
        return new lZ().tI().am(bNa.gRz.bUV()).a((CharSequence)localObject1).tJ().tP();
      }
      return localObject1;
    }

    int i = this.fNH;
    Object localObject1 = bzX();
    Object localObject2;
    Object localObject3;
    if ((localObject1 != null) && (((Ce)localObject1).nS() == 34)) {
      localObject2 = localbyz.bGY();
      localObject3 = ((aOr)localObject2).bfc().V(dDE.dft().VN());
      ((kb)localObject3).e(((aOr)localObject2).bfb());
      i = (int)((kb)localObject3).rO();
    }

    if (i != -1) {
      localObject2 = kb.I(i);
      localObject3 = paramBoolean2 ? bXW.k((cds)localObject2) : bXW.l((cds)localObject2);
      if ((paramBoolean1) && (i <= 60)) {
        localObject3 = new lZ().tI().am(bNa.gRz.bUV()).a((CharSequence)localObject3).tJ().tP();
      }
      return localObject3;
    }
    return null;
  }

  public String bzU() {
    Ce localCe = bzX();
    int i = 1;
    lZ locallZ1 = new lZ();
    Object localObject1;
    if ((localCe instanceof apX)) {
      localObject1 = (apX)localCe;
      if (!((dSR)((apX)localObject1).bsL()).vs()) {
        i = 0;
        if (bU.fH().ed(5, ((dSR)((apX)localObject1).bsL()).getId())) {
          locallZ1.a(bU.fH().b(5, ((dSR)((apX)localObject1).bsL()).getId(), new Object[0]));
        }
      }
    }
    if ((i != 0) && (this.fNG != null))
    {
      localObject1 = new cYR();
      ArrayList localArrayList = new ArrayList();

      Object localObject2 = null;
      int j = 0;
      int k = 0; for (int m = this.fNG.size(); k < m; k++) {
        lZ locallZ2 = new lZ();
        aVc localaVc = (aVc)this.fNG.get(k);
        duF localduF = localaVc.bkc();
        Object localObject4 = "";
        if (localduF != null) {
          if ((localduF instanceof dpI)) {
            short s = 0;
            int i2 = 0;
            Object localObject5;
            if ((localaVc.wa() instanceof bXU)) {
              s = ((bXU)localaVc.wa()).nU();
              localObject5 = new bTl(localCe, 0, s);
            } else if ((localaVc.wa() instanceof apX)) {
              localObject6 = (apX)localaVc.wa();
              s = ((apX)localObject6).nU();
              i2 = ((apX)localObject6).getType();
              localObject5 = new bds((bfE)localObject6);
            } else if ((localaVc.wa() instanceof aAn)) {
              s = ((aAn)localaVc.wa()).nU();
              localObject5 = new bTl(localCe, 0, s);
            } else {
              localObject5 = new bTl(localCe, 0, s);
            }
            Object localObject6 = (dpI)localduF;
            float f = ((dpI)localObject6).bm(s);

            if (f <= 0.0F)
            {
              continue;
            }
            aNK localaNK = new aNK(localaVc);

            if (localaNK.eo() == -1)
            {
              continue;
            }
            aFA localaFA = cxo.xb(localaNK.eo());

            int i3 = localaFA.a(locallZ2, localaNK, (cFo)localObject5);
            if (i3 == -1)
            {
              continue;
            }
            String str2 = locallZ2.tP();
            str2 = ((dFz)localObject5).a(str2, (dpI)localObject6);
            str2 = dFz.qX(str2);

            if ((localaVc.wa() instanceof apX)) {
              str2 = bds.a((apX)localaVc.wa(), s, str2);
            }
            localObject4 = str2;
          }
        } else {
          if ((localObject2 != null) && 
            (localObject2.getId() != localaVc.getId())) {
            a(locallZ2, localObject2.bkc().yR(), localObject2.getId(), j, c(localObject2.bkc()));
            j = 0;
          }

          localObject2 = localaVc;
          j += localaVc.getValue();
          localObject4 = locallZ2.tP();
        }
        if (((String)localObject4).length() > 0) {
          if (((cYR)localObject1).contains(localObject4)) {
            int i1 = ((cYR)localObject1).get(localObject4) + 1;
            ((cYR)localObject1).i(localObject4, i1);
          } else {
            ((cYR)localObject1).i(localObject4, 1);
            localArrayList.add(localObject4);
          }
        }
      }
      for (Object localObject3 = localArrayList.iterator(); ((Iterator)localObject3).hasNext(); ) { String str1 = (String)((Iterator)localObject3).next();
        int n = ((cYR)localObject1).get(str1);
        if (n > 1) {
          str1 = str1 + " (x" + n + ")";
        }
        locallZ1.tH().a(str1);
      }
      if (localObject2 != null) {
        localObject3 = new lZ();
        a((lZ)localObject3, localObject2.bkc().yR(), localObject2.getId(), j, c((dpI)localObject2.bkc()));
        locallZ1.tH().a(((lZ)localObject3).tP());
      }
    }
    return locallZ1.tP();
  }

  private int bzV() {
    Ce localCe = bzX();
    Object localObject;
    if ((localCe instanceof bJC)) {
      localObject = (bJC)localCe;
      return ((bJC)localObject).nU();
    }if ((localCe instanceof aAn)) {
      localObject = (aAn)localCe;
      return ((aAn)localObject).nU();
    }
    int i = localCe.nS();
    if ((i == 28) || (i == 32)) {
      return 0;
    }

    if (this.fNJ.size() == 1) {
      int j = -1;
      int k = 1;
      int m = 0; for (int n = this.fNG.size(); m < n; m++) {
        aVc localaVc = (aVc)this.fNG.get(m);
        if ((localaVc.aug()) && (localaVc.bkc() != null)) {
          k = 0;
          break;
        }
        if ((j != -1) && (j != localaVc.getId())) {
          k = 0;
          break;
        }
        j = localaVc.getId();
      }

      if (k != 0) {
        return this.fNG.size();
      }
    }
    return 0;
  }

  public String fJ() {
    Ce localCe = bzX();
    try {
      if (localCe != null)
      {
        Object localObject;
        switch (localCe.nS())
        {
        case 12:
          if (!(localCe instanceof gA)) {
            int i = (int)localCe.nT();
            localObject = (bVw)Hh.QM().dh(i);
          } else {
            localObject = (bVw)((gA)localCe).oi();
          }
          return (String)((bVw)localObject).getFieldValue("iconUrl");
        case 11:
        case 25:
          return (String)((apX)localCe).getFieldValue("smallIconUrl");
        case 1:
          localObject = (bXU)localCe;
          return ((bXU)localObject).fJ();
        case 3:
          localObject = (cjK)localCe;
          return String.format(ay.bd().getString("effectAreasIconsPath"), new Object[] { Long.valueOf(((cjK)localObject).clt()) });
        case 19:
        case 33:
          return ay.bd().a("protectorBuffsIconsPath", "defaultIconPath", new Object[] { Integer.valueOf(-1) });
        case 32:
          return ay.bd().a("protectorBuffsIconsPath", "defaultIconPath", new Object[] { Integer.valueOf(-2) });
        case 28:
          return ay.bd().a("protectorBuffsIconsPath", "defaultIconPath", new Object[] { Integer.valueOf(-2) });
        case 21:
          return ay.bd().a("timePointBonusIconsPath", "defaultIconPath", new Object[] { Integer.valueOf(cMB.krT.yC((int)localCe.nT())) });
        case 34:
          if (this.fNG.isEmpty())
            return null;
          localObject = (aVc)this.fNG.get(0);
          vH localvH = vH.dk(((aVc)localObject).bkc().yR());
          return ay.bd().a("antiAddictionIconsPath", "defaultIconPath", new Object[] { Byte.valueOf(localvH.bJ()) });
        case 2:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
        case 13:
        case 14:
        case 15:
        case 16:
        case 17:
        case 18:
        case 20:
        case 22:
        case 23:
        case 24:
        case 26:
        case 27:
        case 29:
        case 30:
        case 31: }  }  } catch (bdh localbdh) { K.error("PropertyException pendant l'accès à l'url de l'icone du RunningEffect");
      return null;
    }
    return null;
  }

  private bTI c(duF paramduF)
  {
    return ((doA)bsj.bAv().kD(paramduF.eo())).Cz();
  }

  private void a(lZ paramlZ, int paramInt1, int paramInt2, int paramInt3, bTI parambTI) {
    String str1 = null;
    String str2;
    if (bU.fH().ed(33, paramInt1)) {
      str2 = bU.fH().b(33, paramInt1, new Object[0]);
      str1 = bjv.format(str2, new Object[] { Integer.valueOf(paramInt3) });
    }

    if ((str1 == null) || (str1.length() == 0)) {
      str2 = bU.fH().ec(10, paramInt2);
      str1 = bjv.format(str2, new Object[] { Integer.valueOf(paramInt3) });
    }

    if ((str1 != null) && (str1.length() != 0)) {
      paramlZ.a(str1);
      if (parambTI != null)
        try {
          str2 = String.format(ay.bd().getString("elementsSmallIconsPath"), new Object[] { parambTI.name() });
          paramlZ.a(" ").a(aPf.c(str2, -1, -1, null));
        } catch (bdh localbdh) {
          K.error(localbdh.toString());
        }
    }
  }

  public String[] getFields()
  {
    return bF;
  }

  public void e(Ce paramCe) {
    if (!this.fNJ.contains(paramCe))
      this.fNJ.add(paramCe);
  }

  public void f(Ce paramCe)
  {
    this.fNJ.remove(paramCe);
  }

  public boolean bzW() {
    return !this.fNJ.isEmpty();
  }

  public Ce bzX() {
    if (this.fNJ.size() > 0) {
      return (Ce)this.fNJ.get(0);
    }

    return null;
  }

  private void I(aVc paramaVc) {
    Ce localCe = bzX();
    if ((localCe == null) || (localCe.nS() == 1) || (!paramaVc.isInfinite())) {
      bvk localbvk = paramaVc.bkK();
      if ((localbvk != null) && (localbvk.b(this.fNI) > 0))
      {
        this.fNI = localbvk;
      }
    }
  }

  public String getName() {
    Ce localCe = bzX();
    if (localCe != null)
    {
      Object localObject1;
      Object localObject2;
      switch (localCe.nS()) {
      case 12:
        return ((gA)localCe).getName();
      case 11:
      case 25:
        return (String)((apX)localCe).getFieldValue("name");
      case 1:
        localObject1 = (bXU)localCe;
        localObject2 = ((bXU)localObject1).cdi();
        if ((((bXU)localObject1).Od()) && (this.fNG.size() > 0)) {
          aVc localaVc = (aVc)this.fNG.get(0);
          String str = ((Su)localaVc.bke()).getName();
          localObject2 = (String)localObject2 + " - " + str;
        }
        return localObject2;
      case 3:
        localObject1 = (cjK)localCe;
        return bU.fH().b(6, (int)((cjK)localObject1).clt(), new Object[0]);
      case 19:
      case 33:
        return bU.fH().getString("protector.buff.generic.name");
      case 28:
        return bU.fH().getString("haven.world.buff");
      case 32:
        return bU.fH().getString("guild.buff");
      case 21:
        return bU.fH().getString("timePoint.bonus");
      case 34:
        if (this.fNG.isEmpty())
          return null;
        localObject1 = (aVc)this.fNG.get(0);
        localObject2 = vH.dk(((aVc)localObject1).bkc().yR());
        return bU.fH().getString("antiAddictionLevel.name." + ((vH)localObject2).bJ());
      case 2:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
      case 18:
      case 20:
      case 22:
      case 23:
      case 24:
      case 26:
      case 27:
      case 29:
      case 30:
      case 31: }  } return "";
  }

  public void release() {
    if (this.aOr != null) {
      try {
        this.aOr.y(this);
      } catch (Exception localException) {
        K.error("Exception dans le release de " + getClass().toString() + " normalement impossible");
      }
      this.aOr = null;
    } else {
      bc();
    }
  }

  public void bc() {
    this.fNJ.clear();
    this.fNG.clear();
    this.aOr = null;
    this.fNH = -1;

    this.fNI = null;
  }

  public void aJ()
  {
  }

  public int a(brO parambrO) {
    arl localarl = byv.bFN().bFO().aeQ();
    int i;
    if ((localarl != null) && (this.fNI != null) && (parambrO.fNI != null)) {
      if ((this.fNI.isInfinite()) && (parambrO.fNI.isInfinite()))
        i = 0;
      else if (this.fNI.isInfinite())
        i = 1;
      else if (parambrO.fNI.isInfinite())
        i = -1;
      else {
        i = localarl.aDp().a(this.fNI) - localarl.aDp().a(parambrO.fNI);
      }
    }
    else if (this.fNH == parambrO.fNH)
      i = 0;
    else if (this.fNH == -1)
      i = 1;
    else if (parambrO.fNH == -1)
      i = -1;
    else {
      i = this.fNH - parambrO.fNH;
    }

    if (i == 0) {
      return (int)(bzX().nT() - parambrO.bzX().nT());
    }
    return i;
  }

  public void qC(int paramInt)
  {
    this.fNH = paramInt;
  }

  public void e(aVc paramaVc, boolean paramBoolean) {
    if ((paramBoolean) && (!this.fNG.contains(paramaVc))) {
      int i = 0;

      ArrayList localArrayList = new ArrayList();
      for (Iterator localIterator = ((Ce)this.fNJ.get(0)).iterator(); localIterator.hasNext(); ) {
        localObject = (dpI)localIterator.next();
        localArrayList.add(localObject);
      }
      Object localObject;
      for (int j = this.fNG.size() - 1; j >= 0; j--) {
        localObject = (aVc)this.fNG.get(j);
        if ((((aVc)localObject).aug()) && (((aVc)localObject).bkc() != null) && (paramaVc.aug()) && (paramaVc.bkc() != null) && (((aVc)localObject).bkc().eo() == paramaVc.bkc().eo()))
        {
          int k = this.fNG.indexOf(localObject);
          this.fNG.add(k, paramaVc);
          i = 1;
        }
      }
      if (i == 0) {
        j = localArrayList.indexOf(paramaVc.bkc());
        if ((j >= 0) && (j < this.fNG.size()))
          this.fNG.add(j, paramaVc);
        else {
          this.fNG.add(paramaVc);
        }
      }
    }
    I(paramaVc);
  }

  public int bdo() {
    return this.fNG.size();
  }

  public void AC() {
    dLE.doY().a(this, new String[] { "tableTurnDuration", "remainingDuration", "plainRemainingDuration", "remainingDurationText", "isInfiniteDuration" });
  }

  public brO bzY()
  {
    brO localbrO = new brO();

    int i = 0; for (int j = this.fNG.size(); i < j; i++) {
      localbrO.fNG.add(this.fNG.get(i));
    }

    localbrO.fNH = this.fNH;
    localbrO.fNI = this.fNI;

    i = 0; for (j = this.fNJ.size(); i < j; i++) {
      localbrO.fNJ.add(this.fNJ.get(i));
    }

    return localbrO;
  }
}