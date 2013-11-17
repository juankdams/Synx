import com.ankamagames.wakfu.client.chat.console.command.VicinityContentCommand;
import org.apache.log4j.Logger;

public class aQL
  implements asq
{
  private static aQL eNB = new aQL();
  private static final Logger K = Logger.getLogger(aQL.class);

  public static aQL bhm()
  {
    return eNB;
  }

  public String getName()
  {
    return bU.fH().getString("contentLoader.chat");
  }

  public void a(dnq paramdnq)
  {
    bfJ localbfJ1 = new bfJ(1, "vicinityPipe", cPU.kAf, bU.fH().getString("chat.pipeName.vicinity"), true);
    aLh localaLh = new aLh(2, "privatePipe", cPU.kAr, bU.fH().getString("chat.pipeName.private"), true);
    bii localbii1 = new bii(4, "gameInformationPipe", cPU.kAh, bU.fH().getString("chat.pipeName.gameInformation"), true);
    bfJ localbfJ2 = new bfJ(5, "groupPipe", cPU.kAl, bU.fH().getString("chat.pipeName.group"), true);
    bfJ localbfJ3 = new bfJ(6, "guildPipe", cPU.kAn, bU.fH().getString("chat.pipeName.guild"), true);
    bfJ localbfJ4 = new bfJ(7, "tradePipe", cPU.kAo, bU.fH().getString("chat.pipeName.trade"), true);
    bfJ localbfJ5 = new bfJ(8, "politicPipe", cPU.kAp, bU.fH().getString("chat.pipeName.politic"), true);
    bfJ localbfJ6 = new bfJ(9, "teamPipe", cPU.kAq, bU.fH().getString("chat.pipeName.team"), true);
    bfJ localbfJ7 = new bfJ(12, "lobbyPipe", cPU.kAm, bU.fH().getString("chat.pipeName.recrute"), true);

    bii localbii2 = new bii(3, "gameErrorPipe", cPU.kAe, bU.fH().getString("chat.pipeName.gameError"), false);
    bfJ localbfJ8 = new bfJ(10, "admin_channel", cPU.kAj, bU.fH().getString("chat.pipeName.admin"), false);
    bii localbii3 = new bii(11, "all_channel", cPU.kAk, bU.fH().getString("chat.pipeName.all"), false);

    CM localCM = CM.LV();
    localCM.a(1, localbfJ1);
    localCM.a(2, localaLh);
    localCM.a(3, localbii2);
    localCM.a(4, localbii1);
    localCM.a(5, localbfJ2);
    localCM.a(6, localbfJ3);
    localCM.a(7, localbfJ4);
    localCM.a(8, localbfJ5);
    localCM.a(9, localbfJ6);
    localCM.a(10, localbfJ8);
    localCM.a(11, localbii3);
    localCM.a(12, localbfJ7);

    localCM.a(new VicinityContentCommand(), clP.hOo, new bwG());

    paramdnq.c(this);
  }

  public static void bhn()
  {
    String str1 = arV.aEx();
    String str2 = ay.bd().getString("defaultChatFile");

    K.info("Loading chat file.");
    try
    {
      aAx.aMd().clean();
      if (dtb.pU(arV.aEy())) {
        arV.g(str1, true);
      }
      else
        arV.g(str2, false);
    }
    catch (Exception localException) {
      K.error("Exception à la lecture des paramètres de chat : ", localException);
      aAx.aMd().aMu();
      arV.g(str2, false);
    }

    for (dmn localdmn = aAx.aMd().aMk(); localdmn.hasNext(); ) {
      localdmn.fl();
      ahB localahB = (ahB)localdmn.value();
      if (localahB != null) {
        b(localahB);
      }
    }
    dLE.doY().t("chatManager", aAx.aMd());
    arV.cP(true);
  }

  public static void f(dju paramdju)
  {
    g(paramdju);
    CM localCM = CM.LV();

    paramdju.a(localCM.ez(1), afz.cYu, abi.cPs);
    paramdju.a(localCM.ez(2), afz.cYu, abi.cPt);
    paramdju.a(localCM.ez(5), afz.cYu, abi.cPu);
    paramdju.a(localCM.ez(6), afz.cYu, abi.cPv);
    paramdju.a(localCM.ez(7), afz.cYu, abi.cPw);
    paramdju.a(localCM.ez(9), afz.cYu, abi.cPx);
    paramdju.a(localCM.ez(12), afz.cYu, abi.cPy);
    if (byv.bFN().bFO().cJf().HK() != null) {
      paramdju.a(localCM.ez(8), afz.cYu, abi.cPz);
      paramdju.a(localCM.ez(8), afz.cYu, abi.cPA);
    }
    if (bBc.b(byv.bFN().bFQ().bOR(), bBc.gtk)) {
      paramdju.a(localCM.ez(10), afz.cYu, abi.cPB);
    }
    paramdju.a(paramdju.cSq(), false);
  }

  public static void g(dju paramdju) {
    CM localCM = CM.LV();
    for (int k : paramdju.cUU()) {
      dab localdab = localCM.ez(k);
      if (localdab == null) {
        K.error("on essai d'enregistrer le cannal courant inconnu au bataillon d'id=" + k);
        return;
      }
      paramdju.a(localdab, afz.cYt, null);
    }
  }

  public static void b(ahB paramahB) {
    paramahB.auD();
    for (dmn localdmn = paramahB.aut(); localdmn.hasNext(); ) {
      localdmn.fl();
      dju localdju = (dju)localdmn.value();

      if (localdju.cSr())
        h(localdju);
      else
        f(localdju);
    }
  }

  public static ahB a(ahB paramahB, String paramString)
  {
    return a(-1, paramahB, paramString);
  }

  public static ahB a(int paramInt, ahB paramahB, String paramString) {
    if (paramahB == null)
      paramahB = aAx.aMd().aMg();
    dju localdju = paramahB.b(paramInt, paramString);
    h(localdju);

    paramahB.a(localdju);
    return paramahB;
  }

  private static void h(dju paramdju) {
    Object localObject1 = CM.LV().ez(2);
    if (localObject1 == null) {
      localObject1 = new aLh(2, "privatePipe", cPU.kAr, bU.fH().getString("chat.pipeName.private"), true);

      localObject2 = CM.LV();
      ((CM)localObject2).a(2, (dab)localObject1);
    }

    Object localObject2 = paramdju.getName();
    bfJ localbfJ = (bfJ)((dab)localObject1).oF((String)localObject2);
    if (localbfJ == null) {
      localbfJ = new bfJ(-1, "subPipe".concat((String)localObject2), cPU.kAr, bU.fH().getString("chat.pipeName.private"), true);
    }
    abi localabi = abi.cPt;

    paramdju.a((dab)localObject1, afz.cYt, localabi);
    paramdju.a(localbfJ, afz.cYt, localabi);

    paramdju.a((dab)localObject1, afz.cYu, localabi);
    paramdju.a(localbfJ, afz.cYu, localabi);

    paramdju.a(CM.LV().ez(3), afz.cYt, null);

    ((dab)localObject1).a((String)localObject2, localbfJ);

    paramdju.a(localabi, false);
  }

  public static void a(int paramInt, abi paramabi) {
    CM localCM = CM.LV();
    for (dmn localdmn1 = aAx.aMd().aMk(); localdmn1.hasNext(); ) {
      localdmn1.fl();
      ahB localahB = (ahB)localdmn1.value();
      if (localahB != null)
        for (localdmn2 = localahB.aut(); localdmn2.hasNext(); ) {
          localdmn2.fl();
          dju localdju = (dju)localdmn2.value();
          localdju.a(localCM.ez(paramInt), afz.cYu, paramabi);
        }
    }
    dmn localdmn2;
  }

  public static void nz(int paramInt) {
    for (dmn localdmn1 = aAx.aMd().aMk(); localdmn1.hasNext(); ) {
      localdmn1.fl();
      ahB localahB = (ahB)localdmn1.value();
      if (localahB != null)
        for (localdmn2 = localahB.aut(); localdmn2.hasNext(); ) {
          localdmn2.fl();
          dju localdju = (dju)localdmn2.value();
          localdju.nz(paramInt);
          dLE.doY().a(localdju, new String[] { "channelsList" });
        }
    }
    dmn localdmn2;
  }
}