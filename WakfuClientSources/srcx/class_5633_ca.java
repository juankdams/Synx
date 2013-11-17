import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

final class ca extends dcW
{
  private static final Logger K = Logger.getLogger(ca.class);

  public boolean a(Ia paramIa)
  {
    int i = 0;
    for (int j = 0; j < paramIa.Rl(); j++) {
      if (byv.bFN().bFO().getId() == paramIa.eW(j)) {
        i = 1;
        break;
      }
    }
    if (i != 0) {
      if (aUK.bjU().bjX() != null) {
        bnc.bxw().ql(aUK.bjU().bjX().getId());
      }

      dmn localdmn = cjS.clP().clQ();
      while (localdmn.hasNext()) {
        localdmn.fl();
        ckT localckT = (ckT)localdmn.value();
        if ((localckT instanceof czN)) {
          ((czN)localckT).cwH();
        }
      }

      cjS.clP().vA(paramIa.a());
      for (int k = 0; k < paramIa.Rl(); k++) {
        localObject = CA.Lv().bj(paramIa.eW(k));
        ((Su)localObject).gD(paramIa.a());
      }

      bWM localbWM = new bWM();
      new alf(localbWM).U(ByteBuffer.wrap(paramIa.Ro()));
      Object localObject = cjS.clP().a(paramIa.Rp(), paramIa.a(), localbWM, paramIa.Rv());
      ((arl)localObject).a(bEX.gzY);
      bEX.gzY.a(bpM.fKn, new aiz());
      aUK.bjU().f((arl)localObject);
      return aUK.bjU().a(paramIa);
    }
    return false;
  }
}