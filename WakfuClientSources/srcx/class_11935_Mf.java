import com.ankamagames.wakfu.client.binaryStorage.ItemBinaryData;
import java.util.Map;

public class Mf
{
  private static aly a(ItemBinaryData paramItemBinaryData)
  {
    aly localaly = aly.bd(paramItemBinaryData.duV());
    return localaly == null ? aly.dmm : localaly;
  }

  private static aRQ b(ItemBinaryData paramItemBinaryData) {
    aRQ localaRQ = aRQ.cq(paramItemBinaryData.duY());
    return localaRQ == null ? aRQ.eOT : localaRQ;
  }

  private static cTq c(ItemBinaryData paramItemBinaryData) {
    byte[] arrayOfByte = paramItemBinaryData.dvc();
    int i = arrayOfByte.length;
    if (i == 0) {
      return cTq.kFS;
    }

    ccM[] arrayOfccM = new ccM[i];
    for (int j = 0; j < i; j++) {
      arrayOfccM[j] = new ccM(aly.bd(arrayOfByte[j]));
    }
    return new cTq(arrayOfccM);
  }

  private static akP d(ItemBinaryData paramItemBinaryData) {
    return akP.bb(paramItemBinaryData.duW());
  }

  private static bbG e(ItemBinaryData paramItemBinaryData) {
    return bbG.cD(paramItemBinaryData.duX());
  }

  private static void a(cLi paramcLi, ItemBinaryData paramItemBinaryData, Map paramMap)
  {
    paramcLi.yj(paramItemBinaryData.getId()).dH(paramItemBinaryData.FD()).yk(paramItemBinaryData.oc()).yl(paramItemBinaryData.od() == 0 ? paramItemBinaryData.oc() : paramItemBinaryData.od()).ym(paramItemBinaryData.oe()).dI(paramItemBinaryData.nU()).p(paramMap).n(f(paramItemBinaryData)).dJ(paramItemBinaryData.duK()).es(paramItemBinaryData.duL()).et(paramItemBinaryData.duM()).eu(paramItemBinaryData.duN()).yn(paramItemBinaryData.bKp()).yo(paramItemBinaryData.bKo()).ir(paramItemBinaryData.duO()).is(paramItemBinaryData.duP()).it(paramItemBinaryData.duQ()).iu(paramItemBinaryData.duR()).e(h(paramItemBinaryData)).c(g(paramItemBinaryData)).b(a(paramItemBinaryData)).c(b(paramItemBinaryData)).ev(paramItemBinaryData.duZ());
  }

  private static ge f(ItemBinaryData paramItemBinaryData)
  {
    return X.aw().f(paramItemBinaryData.duJ());
  }

  private static bXe g(ItemBinaryData paramItemBinaryData) {
    return bXe.valueOf(paramItemBinaryData.duT());
  }

  private static cxg h(ItemBinaryData paramItemBinaryData) {
    return cxg.dp(paramItemBinaryData.duS());
  }

  public static cIF a(ItemBinaryData paramItemBinaryData, Map paramMap) {
    nV localnV = new nV();

    a(localnV, paramItemBinaryData, paramMap);

    localnV.e(paramItemBinaryData.dvb()).a(d(paramItemBinaryData)).a(e(paramItemBinaryData));

    return (cIF)localnV.ajR();
  }

  public static bVw b(ItemBinaryData paramItemBinaryData, Map paramMap) {
    bZT localbZT = new bZT();

    a(localbZT, paramItemBinaryData, paramMap);

    localbZT.c(d(paramItemBinaryData)).c(e(paramItemBinaryData));

    return (bVw)localbZT.ajR();
  }

  public static QM a(cIF paramcIF, ItemBinaryData paramItemBinaryData, Map paramMap)
  {
    cvc localcvc = new cvc();

    a(localcvc, paramItemBinaryData, paramMap);

    ((cvc)((cvc)localcvc.b(paramcIF).c(d(paramItemBinaryData))).c(e(paramItemBinaryData))).wU(paramcIF.getId());

    return (QM)localcvc.ajR();
  }
}