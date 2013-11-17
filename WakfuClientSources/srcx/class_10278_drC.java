import java.util.ArrayList;
import org.apache.log4j.Logger;

public class drC
{
  private static final Logger K = Logger.getLogger(drC.class);

  public static aNL b(ahB paramahB, String paramString)
  {
    String str = Bn(paramahB.auq());

    if (cBQ.cxL().mZ(str))
      cBQ.cxL().mW(str);
    aNL localaNL;
    if (paramString == null) {
      localaNL = cBQ.cxL().a(str, VV.dJ("chatDialog"), 9217L, (short)10000);
    }
    else {
      localaNL = cBQ.cxL().a(str, VV.dJ("chatDialog"), paramString, paramString, "chatDialog", 9217L, (short)10000);
    }

    dLE.doY().a("chat", paramahB, str);
    dLE.doY().a("chat.channels.list.displayed", Boolean.valueOf(false), str);
    dLE.doY().a("chat.scrollOffset", Float.valueOf(-1.0F), str);
    return localaNL;
  }

  public static String Bn(int paramInt) {
    return "chatDialog" + paramInt;
  }

  public static void a(int paramInt, cQS paramcQS, boolean paramBoolean) {
    bpn localbpn = paramcQS.getWindow();
    if ((!paramBoolean) && (localbpn != null)) {
      dLE.doY().a("chat.channels.list.displayed", Boolean.valueOf(false), localbpn.getElementMap());
    }
    cpa localcpa1 = cBQ.cxL().coO().nf(Bn(paramInt));
    if (localcpa1 == null) {
      return;
    }
    dOc localdOc1 = (dOc)localcpa1.fi("textEditorRenderableContainer.chatInput");

    dOc localdOc2 = zC.Ip().Iq();
    if ((localdOc2 != null) && ((localdOc2 == localdOc1) || ("viewNameEditor".equals(localdOc2.getId()))) && (!paramBoolean))
      return;
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();

    a(localcpa1, "chatMainContainer", localArrayList2);
    ahB localahB = aAx.aMd().lu(paramInt);
    if ((localahB == null) || (localahB.auy() == null)) {
      K.error("Erreur au fade de la fenetre de chat d'id=" + paramInt);
      return;
    }

    if (!localahB.auy().cSr()) {
      localccG = (ccG)localcpa1.fi("filterList");
      a(localccG, paramBoolean);
    }

    if (localdOc1 == null)
      K.warn("le textEditor n'existe pas");
    else {
      localArrayList3.add(localdOc1.getAppearance());
    }

    a(localcpa1, "alphaCorner", localArrayList2);

    a(localcpa1, "addButton", localArrayList1);
    a(localcpa1, "addLabel", localArrayList1);

    ccG localccG = (ccG)localcpa1.fi("viewsList");
    for (axU localaxU : localccG.getRenderables()) {
      cpa localcpa2 = localaxU.getInnerElementMap();
      if (localcpa2 != null)
      {
        Object localObject = localaxU.getItemValue();
        if ((localObject != null) && (localObject.equals(localahB.auy())))
          a(localcpa2, "viewLabel", localArrayList4);
        else {
          a(localcpa2, "viewLabel", localArrayList3);
        }
        a(localcpa2, "viewButton", localArrayList2);
        a(localcpa2, "viewDeleteButton", localArrayList2);
      }
    }
    a(paramBoolean, localbpn, localArrayList1, localArrayList2, localArrayList3, localArrayList4);

    a(localcpa1, !paramBoolean);
  }

  private static void a(cWq paramcWq, boolean paramBoolean) {
    ArrayList localArrayList = paramcWq.getRenderables();
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      axU localaxU = (axU)localArrayList.get(i);
      cpa localcpa = localaxU.getInnerElementMap();
      if (localcpa != null) {
        cPG localcPG = (cPG)localaxU.getItemValue();
        dOc localdOc1 = (dOc)localcpa.fi("filterBg");
        dOc localdOc2 = (dOc)localcpa.fi("filterBtn");
        localdOc1.J(gm.class);
        localdOc2.J(gm.class);
        if (paramBoolean) {
          localdOc1.a(new gm(bNa.gRu, bNa.gRx, localdOc1.getAppearance(), 0, 1000, 1, false, ddp.kWG));
          localdOc2.a(new gm(bNa.gRu, localcPG.getColor(), localdOc2.getAppearance(), 0, 1000, 1, false, ddp.kWG));
        } else {
          localdOc1.a(new gm(bNa.gRx, bNa.gRu, localdOc1.getAppearance(), 0, 1000, 1, false, ddp.kWG));
          localdOc2.a(new gm(localcPG.getColor(), bNa.gRu, localdOc2.getAppearance(), 0, 1000, 1, false, ddp.kWG));
        }
      }
    }
  }

  public static void i(bpn parambpn) {
    biy localbiy = (biy)parambpn.getElementMap().fi("downBundaryButton");
    bNa localbNa1 = bNa.gRw;

    bNa localbNa2 = new bNa(bNa.gRx.get());

    dFr localdFr = localbiy.getAppearance();
    gm localgm = new gm(localbNa1, localbNa2, localdFr, 0, 500, 3, ddp.kWG);

    localdFr.a(localgm);
  }

  public static void cYq() {
    int i = aAx.aMd().aMw();
    if (i == -1) {
      K.error("on tente de fermer la vue de chat d'échange alors qu'elle n'est pas initialisée");
      return;
    }
    aAx.aMd().by(i, -1);
    aAx.aMd().lx(-1);
  }

  public static void a(boolean paramBoolean, bpn parambpn, ArrayList paramArrayList1, ArrayList paramArrayList2, ArrayList paramArrayList3, ArrayList paramArrayList4) {
    parambpn.J(aga.class);
    a(paramArrayList1, paramBoolean, bNa.gRu, parambpn);
    a(paramArrayList2, paramBoolean, bNa.gRw, parambpn);
    a(paramArrayList3, paramBoolean, bNa.gRv, parambpn);
    a(paramArrayList4, paramBoolean, bNa.gRG, parambpn);
  }

  private static void a(ArrayList paramArrayList, boolean paramBoolean, bNa parambNa, bpn parambpn) {
    if (paramArrayList.isEmpty())
      return;
    dKW localdKW = (dKW)paramArrayList.get(0);
    int i;
    int j;
    if (paramBoolean) {
      if (localdKW.getModulationColor() == null)
      {
        return;
      }
      i = localdKW.getModulationColor().get();
      j = bNa.gRx.get();
    } else {
      i = bNa.gRx.get();
      j = parambNa.get();
    }

    if (i != j) {
      if (paramBoolean)
        aWc.blo().blC();
      else {
        aWc.blo().blD();
      }

      bNa localbNa1 = new bNa(i);
      bNa localbNa2 = new bNa(j);

      parambpn.a(new aga(localbNa1, localbNa2, paramArrayList, 0, 1000, 1, ddp.kWG));
    }
  }

  public static void a(cpa paramcpa, boolean paramBoolean) {
    b(paramcpa, "addButton", paramBoolean);
    b(paramcpa, "resizePoint0", paramBoolean);
    b(paramcpa, "resizePoint1", paramBoolean);
    b(paramcpa, "resizePoint2", paramBoolean);
    b(paramcpa, "resizePoint3", paramBoolean);
    b(paramcpa, "resizePoint4", paramBoolean);
    b(paramcpa, "resizePoint5", paramBoolean);
    b(paramcpa, "resizePoint6", paramBoolean);
    b(paramcpa, "resizePoint7", paramBoolean);
  }

  private static void b(cpa paramcpa, String paramString, boolean paramBoolean) {
    ((dOc)paramcpa.fi(paramString)).setNonBlocking(paramBoolean);
  }

  private static void a(cpa paramcpa, String paramString, ArrayList paramArrayList) {
    aNL localaNL = paramcpa.fi(paramString);
    if (localaNL == null) {
      K.warn("la propriété " + paramString + " n'existe pas.");
      return;
    }
    if ((!bB) && (!(localaNL instanceof dOc))) throw new AssertionError();
    Jg localJg = ((dOc)localaNL).getAppearance();
    localJg.J(gm.class);
    paramArrayList.add(localJg);
  }

  public static void j(dju paramdju) {
    ahB localahB = aAx.aMd().c(paramdju);
    if ((localahB == null) || (localahB.auy() == paramdju)) {
      return;
    }
    cpa localcpa = cBQ.cxL().coO().nf(Bn(localahB.auq()));
    if (localcpa == null) {
      return;
    }
    ccG localccG = (ccG)localcpa.fi("viewsList");
    axU localaxU = localccG.getRenderableByOffset(paramdju.cUQ());
    if (localaxU == null)
      return;
    biy localbiy = (biy)localaxU.getInnerElementMap().fi("viewButton");
    bNa localbNa1 = new bNa(bNa.gRw.get());

    bNa localbNa2 = new bNa(bNa.gRx.get());

    Jg localJg = localbiy.getAppearance();
    localJg.J(gm.class);
    gm localgm = new gm(localbNa1, localbNa2, localJg, 0, 500, 10, true, ddp.kWG);
    localJg.a(localgm);
  }
}