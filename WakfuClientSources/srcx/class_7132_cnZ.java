import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import org.apache.log4j.Logger;

final class cnZ extends dcW
{
  private static final Logger K = Logger.getLogger(cnZ.class);
  private static final boolean DEBUG = false;

  public boolean a(cSL paramcSL)
  {
    dTw localdTw = dTw.DY(paramcSL.Rp());

    if (localdTw == null) {
      K.error(String.format("FightModel (typeId=%d) inconnu dans la création de l'external fight id=%d", new Object[] { Byte.valueOf(paramcSL.Rp()), Integer.valueOf(paramcSL.a()) }));
      return false;
    }

    czN localczN = new czN(localdTw);
    bWM localbWM = new bWM();
    new alf(localbWM).U(ByteBuffer.wrap(paramcSL.cIC()));

    localczN.d(paramcSL.a());
    localczN.a(paramcSL.cID());
    localczN.Z(paramcSL.cIF());
    localczN.e(localbWM);

    localbWM.j(true, false);

    int i = byv.bFN().bFO().aeQ() == null ? 1 : 0;

    for (int j = 0; j < paramcSL.Rl(); j++) {
      byte b = paramcSL.eY(j);
      long l = paramcSL.eW(j);
      localczN.k(b, l);
    }

    dcu.kVl.kVm.add(paramcSL.a());

    localczN.hY(((Long)paramcSL.cIE().get(0)).longValue());
    localczN.hZ(((Long)paramcSL.cIE().get(1)).longValue());

    Su localSu1 = localczN.dg(((Long)paramcSL.cIE().get(0)).longValue());
    Su localSu2 = localczN.dg(((Long)paramcSL.cIE().get(1)).longValue());
    Object localObject;
    if ((localSu1 != null) && (localSu2 != null)) {
      dcu.kVl.kVn.put(paramcSL.a(), ctt.a(1, dPD.mhK.bJ(), 0, localSu1, localSu2));
      dcu.kVl.kVo.put(paramcSL.a(), ctt.a(2, dPD.mhK.bJ(), 0, localSu2, localSu1));
      dcu.kVl.kVp.put(paramcSL.a(), ctt.a(3, dPD.mhK.bJ(), 0, localczN.ch(localSu1.Fx()), localSu2));
      dcu.kVl.kVq.put(paramcSL.a(), ctt.a(4, dPD.mhK.bJ(), 0, localczN.ch(localSu2.Fx()), localSu1));

      dcu.kVl.kVs.put(paramcSL.a(), dGw.a(6, dPD.mhL.bJ(), 0, localSu2, "AnimHit", 250));

      if (i != 0) {
        dcu.kVl.kVt.put(paramcSL.a(), apH.a(10, dPD.mhO.bJ(), 0, localSu2));

        localObject = new HashSet(localczN.ch(localSu2.Fx()));
        ((Collection)localObject).remove(localSu2);
        dcu.kVl.kVu.put(paramcSL.a(), apH.a(10, dPD.mhO.bJ(), 0, (Collection)localObject));
      }
      localczN.aZ(localSu1);
      localczN.ba(localSu2);
    }

    if (i != 0) {
      localObject = bMF.bUo().fk(paramcSL.Rq());
      if (localObject != null) {
        aYV localaYV = (aYV)((aYV)localObject).a(new agg(paramcSL.Rr(), localbWM.getMinX(), localbWM.getMinY(), localbWM.ahP(), localczN.aIq(), null, (short)0, CG.bFP));
        localaYV.g(localbWM);
        localczN.LC().g(localaYV);
      } else {
        K.error("Impossible de créer la bulle de combat : la zone d'effet d'index " + paramcSL.Rq() + " n'existe pas");
      }

      ((apy)localczN.aDH()).e(localbWM);
    }

    cjS.clP().g(localczN);
    ayg.aJQ().b(localczN);

    if ((localSu1 != null) && (localSu2 != null)) {
      dmM.cUe().d(localczN);
    }
    return false;
  }
}