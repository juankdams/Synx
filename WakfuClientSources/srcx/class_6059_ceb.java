import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class ceb extends bvg
  implements cvW, doN
{
  private static final Logger K = Logger.getLogger(ceb.class);

  private static final ceb hxZ = new ceb();
  private String hya;
  private boolean hyb;
  private boolean hyc;
  private bpn hyd;
  private cSR hye;
  private static final int hyf = 2;
  private static final cSR hyg = new cSR();
  private static final cSR hyh = new cSR();
  public static final int hyi = 5000;
  private static final int hyj = 100;
  private LinkedList hyk;
  private cSR hyl;
  private LinkedList hym;
  private Pattern hyn;
  public static final String hyo = "item";

  public ceb()
  {
    this.hyb = true;
    this.hyc = false;

    this.hye = new cSR();

    this.hyk = new LinkedList();

    this.hyl = new cSR();
    this.hym = new LinkedList();
    this.hyn = Pattern.compile("(\\[[^\\[]+\\])");
  }

  public boolean cgF()
  {
    return this.hyd != null;
  }

  public static ceb cgG()
  {
    return hxZ;
  }

  public static String ag(gA paramgA) {
    return "<u id=\"item_" + paramgA.ou() + "\">" + paramgA.getName() + "</u>";
  }

  public String kS(String paramString)
  {
    Matcher localMatcher = this.hyn.matcher(paramString);
    while (localMatcher.find()) {
      String str1 = localMatcher.group();
      String str2 = str1.substring(1, str1.length() - 1);
      gA localgA = (gA)this.hyl.get(str2.hashCode());
      if (localgA == null) {
        K.error("Erreur lors de la tentative de récupération d'un item à décrire dans le chat : " + str2);
        return paramString;
      }

      if (!localgA.getName().equals(str2)) {
        K.error("Le nom de l'objet en tête de pile : " + localgA.getName() + " ne correspond pas à " + str2 + " , on le passe...");
      }
      else
      {
        paramString = cOg.replace(paramString, str1, ag(localgA));

        ah(localgA);
      }
    }
    return paramString;
  }

  public void ah(gA paramgA)
  {
    int i = paramgA.getName().hashCode();
    if (this.hym.contains(Integer.valueOf(i))) {
      return;
    }
    if (this.hym.size() > 100) {
      Integer localInteger = (Integer)this.hym.removeFirst();
      this.hyl.remove(localInteger.intValue());
    }

    this.hym.addLast(Integer.valueOf(i));
    this.hyl.put(i, paramgA);
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject1;
    if ((paramcWG instanceof dKQ)) {
      localObject1 = (dKQ)paramcWG;
      switch (((dKQ)localObject1).czj()) {
      case 2:
        if (!this.hyk.isEmpty())
        {
          long l1 = ((Long)this.hyk.removeFirst()).longValue();
          cCZ.cyZ().czb();
        }break;
      }
      return false;
    }
    Object localObject2;
    Object localObject3;
    Object localObject4;
    int j;
    Object localObject5;
    boolean bool;
    long l2;
    int k;
    switch (paramcWG.getId())
    {
    case 19000:
      localObject1 = (cQb)paramcWG;

      localObject2 = ((cQb)localObject1).car();

      if (localObject2 == null) {
        localObject3 = aAx.aMd().aMi();
        if (localObject3 != null) {
          localObject2 = ((ahB)localObject3).auy();
        }
      }

      if (localObject2 != null) {
        CM.LV().LW().mb(((cQb)localObject1).getMessage());
      }
      return false;
    case 19011:
      localObject1 = (bUt)paramcWG;

      localObject2 = ((bUt)localObject1).car();

      localObject3 = ((bUt)localObject1).caq();

      ((dnp)localObject2).a(abi.dW(((cgv)localObject3).getCommand()), true);

      return false;
    case 19002:
      if (cBQ.cxL().mZ("contactListDialog"))
        byv.bFN().b(aiV.avF());
      else {
        byv.bFN().a(aiV.avF());
      }

      return false;
    case 19013:
      localObject1 = (bzu)paramcWG;

      aAx.aMd().lv(((bzu)localObject1).getIntValue());

      return false;
    case 19014:
      aAx.aMd().aMi().aur();
      aAx.aMd().aMt();

      return false;
    case 19015:
      localObject1 = (cIA)paramcWG;

      aAx.aMd().aMi().a(((cIA)localObject1).cCv(), true);
      aAx.aMd().aMt();

      return false;
    case 19061:
      localObject1 = (bzu)paramcWG;
      localObject2 = ((bzu)localObject1).getStringValue();
      localObject3 = dju.pk((String)localObject2);
      if (aAx.aMd().fZ((String)localObject2)) {
        CM.LV().f(bU.fH().getString("error.chat.privateChatAlreadyExist"), 3);
        return false;
      }
      localObject4 = aAx.aMd().aMf();
      j = localObject4 == null ? 1 : 0;
      localObject4 = aQL.a((ahB)localObject4, (String)localObject2);

      localObject5 = ((ahB)localObject4).auy();
      ((dju)localObject5).pF((String)localObject3);
      int m = ((ahB)localObject4).auq();
      String str = drC.Bn(m);
      bpn localbpn;
      if (j != 0)
        localbpn = (bpn)b((ahB)localObject4, this.hya);
      else {
        localbpn = uX(((ahB)localObject4).auq());
      }
      cBQ.cxL().a(new MA(this, str, m));

      cwP localcwP = (cwP)localbpn.getLayoutData();
      localcwP.setAlign(ajb.dhZ);

      this.hya = str;
      this.hye.put(m, new cQS(localbpn, (ahB)localObject4));

      aAx.aMd().lv(((ahB)localObject4).auq());
      localbpn.a(new My(this, localbpn));

      dLE.doY().a("chat", localObject4, str);
      dLE.doY().a((dBv)localObject4, ahB.bF);
      dLE.doY().a("chat.channels.list.displayed", Boolean.valueOf(false), str);

      return false;
    case 19065:
      localObject1 = (bzu)paramcWG;
      localObject2 = ((bzu)localObject1).getStringValue();
      localObject3 = dju.pk((String)localObject2);
      localObject4 = aQL.a(null, (String)localObject2);
      j = ((ahB)localObject4).auq();
      localObject5 = ((ahB)localObject4).in(0);
      ((dju)localObject5).pF((String)localObject3);
      aAx.aMd().lx(j);

      dLE.doY().a("chat", localObject4, "exchangeDialog");

      return false;
    case 19066:
      drC.cYq();
      return false;
    case 19062:
      localObject1 = (bzu)paramcWG;
      int i = ((bzu)localObject1).getIntValue();
      uV(i);
      return false;
    case 19063:
      localObject1 = (bzu)paramcWG;

      Su localSu = CA.Lv().bt(((bzu)localObject1).getStringValue());
      if ((localSu == null) || (localSu.aeL() == null)) {
        CM.LV().f(bU.fH().getString("error.group.memberTooFar"), 3);
        return false;
      }

      localObject3 = localSu.ML();
      localObject4 = byv.bFN().bFO();
      long l3 = localSu.getId();
      if ((localSu.Lk() == ((byz)localObject4).Lk()) && (!this.hyk.contains(Long.valueOf(l3)))) {
        cCZ.cyZ().a(((cYk)localObject3).getX(), ((cYk)localObject3).getY(), ((cYk)localObject3).IB(), localSu);
        cAo.cxf().a(this, 5000L, 2, 1);
        this.hyk.add(Long.valueOf(l3));
      }

      return false;
    case 19025:
      localObject1 = (bzu)paramcWG;
      bool = ((bzu)localObject1).getBooleanValue();
      if ((!bool) && (this.hyb)) {
        return false;
      }

      l2 = ((bzu)localObject1).ah();
      k = ((bzu)localObject1).getIntValue();

      localObject5 = (bHW)hyh.get(k);
      if ((localObject5 != null) && (bool)) {
        dka.cSF().j((Runnable)localObject5);
      }
      localObject5 = (bHW)hyg.get(k);
      if (localObject5 != null) {
        dka.cSF().j((Runnable)localObject5);
      }

      if (l2 == -1L) {
        return false;
      }
      if (localObject5 == null)
        localObject5 = new bHW(this, k, true, null);
      hyg.put(k, localObject5);

      dka.cSF().a((Runnable)localObject5, l2, 1);

      return false;
    case 19026:
      localObject1 = (bzu)paramcWG;
      bool = ((bzu)localObject1).getBooleanValue();
      if ((!bool) && (this.hyb)) {
        return false;
      }
      l2 = ((bzu)localObject1).ah();
      k = ((bzu)localObject1).getIntValue();

      localObject5 = (bHW)hyg.get(k);
      if ((localObject5 != null) && (bool)) {
        dka.cSF().j((Runnable)localObject5);
      }
      localObject5 = (bHW)hyh.get(k);
      if (localObject5 != null) {
        dka.cSF().j((Runnable)localObject5);
      }
      if (localObject5 == null)
        localObject5 = new bHW(this, k, false, null);
      hyh.put(k, localObject5);

      dka.cSF().a((Runnable)localObject5, l2, 1);
      return false;
    case 19027:
      this.hyb = ((bzu)paramcWG).getBooleanValue();

      return false;
    }

    return true;
  }

  private void uV(int paramInt) {
    String str = drC.Bn(paramInt);

    aAx.aMd().by(paramInt, -1);
    uW(paramInt);

    if ((str != null) && (str.equals(this.hya)))
      this.hya = null;
  }

  public bpn cgH()
  {
    ahB localahB = aAx.aMd().aMi();
    return localahB != null ? ((cQS)this.hye.get(localahB.auq())).getWindow() : null;
  }

  public long getId() {
    return 10L;
  }

  public void a(long paramLong)
  {
  }

  private void g(boolean paramBoolean, int paramInt)
  {
    cQS localcQS = (cQS)this.hye.get(paramInt);
    if (localcQS == null)
      return;
    drC.a(paramInt, localcQS, paramBoolean);
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      this.hyb = (!WakfuClientInstance.awy().awB().a(bmz.fEA));

      dLE.doY().t("chat.isMaximize", Boolean.valueOf(false));
      dLE.doY().t("chatManager", aAx.aMd());
      dLE.doY().t("chat.editedView", null);

      dmn localdmn = aAx.aMd().aMk();
      int i = 1;
      String str = null;
      boolean bool = WakfuClientInstance.awy().awB().a(bmz.fEG);
      while (localdmn.hasNext()) {
        localdmn.fl();

        ahB localahB = (ahB)localdmn.value();
        aNL localaNL = b(localahB, (String)null);
        if (bool)
          str = localaNL.getElementMap().getId();
        if (!this.hyb) {
          bzu localbzu = new bzu();
          localbzu.d(19026);
          localbzu.c(5000L);
          localbzu.e(localdmn.zY());
          cjO.clE().j(localbzu);
        }

      }

      cBQ.cxL().j("wakfu.chat", adU.class);
      bsP.getInstance().a(CH.bGo, this, false);
      bsP.getInstance().a(CH.bGy, this, false);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      for (dmn localdmn = this.hye.yF(); localdmn.hasNext(); ) {
        localdmn.fl();
        ((cQS)localdmn.value()).removeListeners();
      }

      bsP.getInstance().b(CH.bGo, this, false);
      bsP.getInstance().b(CH.bGy, this, false);

      hyg.clear();
      hyh.clear();
      this.hye.clear();
      this.hyd = null;
      this.hyk.clear();
      this.hym.clear();
      this.hyl.clear();
      cAo.cxf().b(this);

      dLE.doY().removeProperty("chatManager");
      dLE.doY().removeProperty("chat.editedView");
      try
      {
        for (localdmn = aAx.aMd().aMk(); localdmn.hasNext(); ) {
          localdmn.fl();
          ahB localahB = (ahB)localdmn.value();
          localahB.auC();
          cBQ.cxL().mW(drC.Bn(localahB.auq()));
        }
      } catch (Exception localException) {
        K.error("Erreur à la fermeture des chats " + localException);
      }

      cBQ.cxL().mN("wakfu.chat");
    }
  }

  public aNL b(ahB paramahB, String paramString)
  {
    aNL localaNL = drC.b(paramahB, paramString);
    this.hye.put(paramahB.auq(), new cQS((bpn)localaNL, paramahB));
    return localaNL;
  }

  public ahB h(dMr paramdMr) {
    for (dmn localdmn = this.hye.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      bpn localbpn = ((cQS)localdmn.value()).getWindow();
      if (localbpn.getAppearance().bQ(paramdMr.y(localbpn), paramdMr.z(localbpn)))
        return aAx.aMd().lu(localdmn.zY());
    }
    return null;
  }

  public bpn i(dMr paramdMr) {
    for (dmn localdmn = this.hye.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      bpn localbpn = ((cQS)localdmn.value()).getWindow();
      if (localbpn.getAppearance().bQ(paramdMr.y(localbpn), paramdMr.z(localbpn)))
        return localbpn;
    }
    return null;
  }

  public dju j(dMr paramdMr) {
    for (dmn localdmn = this.hye.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      bpn localbpn = ((cQS)localdmn.value()).getWindow();
      if (localbpn.getAppearance().bQ(paramdMr.y(localbpn), paramdMr.z(localbpn))) {
        ccG localccG = (ccG)localbpn.getElementMap().fi("viewsList");
        dOc localdOc = localccG.getWidget(paramdMr.y(localccG), paramdMr.z(localccG));
        if (localdOc == null)
          return null;
        return (dju)localdOc.getRenderableParent().getItemValue();
      }
    }
    return null;
  }

  public boolean a(cSx paramcSx) {
    dMr localdMr = (dMr)paramcSx;
    Object localObject;
    switch (MZ.cab[paramcSx.mp().ordinal()]) {
    case 1:
      for (localObject = this.hye.yF(); ((dmn)localObject).hasNext(); ) {
        ((dmn)localObject).fl();
        bpn localbpn = ((cQS)((dmn)localObject).value()).getWindow();
        if (!localbpn.isUnloading())
        {
          cpa localcpa = localbpn.getElementMap();
          dOc localdOc = (dOc)localcpa.fi("chatWindow");
          boolean bool = localdOc.getAppearance().bQ(localdMr.y(localbpn), localdMr.z(localbpn));

          this.hyd = (bool ? localbpn : null);
          if (bool) break;
        }
      }
      break;
    case 2:
      if (this.hyd != null) {
        localObject = (bbp)this.hyd.getElementMap().fi("chatScrollContainer");
        if (localdMr.dpj() > 0)
          adU.goDownText(localdMr, (bbp)localObject, false);
        else {
          adU.goUpText(localdMr, (bbp)localObject, false);
        }
      }

      break;
    }

    return false;
  }

  public void uW(int paramInt) {
    cQS localcQS = (cQS)this.hye.remove(paramInt);
    if (localcQS == null)
      return;
    bpn localbpn = localcQS.getWindow();
    if (localbpn == null)
      return;
    String str1 = localbpn.getElementMap().getId();
    String str2 = localbpn.getId();
    bMw localbMw = (bMw)localbpn.getUserDefinedManager();
    cBQ.cxL().mW(drC.Bn(paramInt));
    localbMw.am(str1, str2);
  }

  public bpn uX(int paramInt) {
    cQS localcQS = (cQS)this.hye.get(paramInt);
    return localcQS == null ? null : localcQS.getWindow();
  }

  public void c(ahB paramahB) {
    dLE.doY().a(paramahB, paramahB.getFields());
  }

  public boolean h(int paramInt, long paramLong) {
    return b(paramInt, paramLong, -1);
  }

  public boolean b(int paramInt1, long paramLong, int paramInt2) {
    if (!WakfuClientInstance.awy().awB().a(bmz.fEM))
      return true;
    Su localSu = CA.Lv().bj(paramLong);
    if (localSu == null) {
      return dmS.c(paramInt1, paramLong, paramInt2);
    }

    bhh localbhh = localSu.aJp();
    if ((localbhh instanceof bdi)) {
      return dmS.a(paramInt1, paramLong, paramInt2, localSu);
    }

    return dmS.b(paramInt1, localSu);
  }

  public void gO(boolean paramBoolean) {
    if (this.hye == null)
      return;
    for (dmn localdmn = this.hye.yF(); localdmn.hasNext(); ) {
      localdmn.fl();

      cpa localcpa = ((cQS)localdmn.value()).getWindow().getElementMap();
      if (localcpa == null)
        return;
      aNL localaNL = localcpa.fi("chatOptionsButton");
      if (localaNL == null)
        return;
      ((br)localaNL).setSelected(paramBoolean);
    }
  }

  public void uY(int paramInt) {
    bpn localbpn = uX(paramInt);
    drC.i(localbpn);
  }
}