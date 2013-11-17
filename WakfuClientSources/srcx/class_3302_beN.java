import com.ankamagames.wakfu.client.binaryStorage.ChaosParamBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.ExchangeInteractiveElementParamBinaryData;
import org.apache.log4j.Logger;

final class beN
  implements gd
{
  public void a(ExchangeInteractiveElementParamBinaryData paramExchangeInteractiveElementParamBinaryData)
  {
    int i = paramExchangeInteractiveElementParamBinaryData.getId();
    int j = paramExchangeInteractiveElementParamBinaryData.cpJ();
    aHg[] arrayOfaHg = paramExchangeInteractiveElementParamBinaryData.cEq();
    ChaosParamBinaryData localChaosParamBinaryData = paramExchangeInteractiveElementParamBinaryData.gD();
    int k = TO.a(localChaosParamBinaryData);
    aPb localaPb = TO.b(localChaosParamBinaryData);
    byte b = paramExchangeInteractiveElementParamBinaryData.cEp();

    ql localql = new ql(i, j, localaPb, k, b, arrayOfaHg.length);
    int m = 0; for (int n = arrayOfaHg.length; m < n; m++) { aHg localaHg = arrayOfaHg[m];
      int i1 = localaHg.aTc();
      int i2 = localaHg.aTe();
      int i3 = localaHg.aTg();
      String str = localaHg.uL();
      bSe[] arrayOfbSe = localaHg.aTd();
      bYO[] arrayOfbYO = localaHg.aTf();
      bZA localbZA;
      try { localbZA = aVj.hn(str);
      } catch (Exception localException) {
        TO.ch().error("Impossible de compiler le critère de l'échange " + i1, localException);
        continue;
      }
      aYt localaYt = new aYt(i1, i2, i3, localbZA, m);
      int i4 = 0;
      Object localObject;
      int i6;
      short s;
      for (int i5 = arrayOfbSe.length; i4 < i5; i4++) {
        localObject = arrayOfbSe[i4];
        i6 = ((bSe)localObject).gw();
        s = ((bSe)localObject).nP();
        localaYt.q(i6, s);
      }
      i4 = 0; for (i5 = arrayOfbYO.length; i4 < i5; i4++) {
        localObject = arrayOfbYO[i4];
        i6 = ((bYO)localObject).gw();
        s = ((bYO)localObject).nP();
        localaYt.r(i6, s);
      }
      localql.b(localaYt);
    }
    aKY.epr.a(localql);
  }
}