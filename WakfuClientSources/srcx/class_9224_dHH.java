import java.util.Collection;
import java.util.HashSet;

final class dHH extends dcW
{
  public boolean a(oD paramoD)
  {
    int i = paramoD.a();
    long[] arrayOfLong = paramoD.vY().aBb();
    HashSet localHashSet1 = new HashSet();
    ahl localahl = ahl.a(dqt.cXz(), dPD.mhL.bJ(), 0, null, "AnimHit", 250);

    HashSet localHashSet2 = new HashSet();
    for (int j = 0; j < arrayOfLong.length; j++) {
      long l = arrayOfLong[j];
      Su localSu = CA.Lv().bj(l);
      if (localSu != null)
      {
        localHashSet1.add(localSu);
        if (!localSu.adF())
          localHashSet2.add(localSu);
        if ((localSu instanceof byo))
          localahl.F(localSu);
      }
    }
    c(i, localHashSet2);
    a(paramoD, i);

    bnc.bxw().a(i, localahl);

    bnc.bxw().qj(i);
    return false;
  }

  private void a(oD paramoD, int paramInt) {
    aoL localaoL = paramoD.vY();

    dAo localdAo = new dAo(dqt.cXz(), dPD.mhC.bJ(), 0, localaoL);
    bnc.bxw().a(paramInt, localdAo);
    localdAo.gP(paramoD.vX());

    fw.aCz.a(localaoL);
  }

  private void c(int paramInt, Collection paramCollection) {
    if (!paramCollection.isEmpty()) {
      apH localapH = apH.a(dqt.cXz(), dPD.mhO.bJ(), 0, paramCollection);
      bnc.bxw().a(paramInt, localapH);
    }
  }
}