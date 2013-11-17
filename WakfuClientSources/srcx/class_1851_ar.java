import java.util.ArrayList;

public class ar
  implements bPr
{
  public static final ar bW = new ar();

  public int a(dno paramdno, gA paramgA)
  {
    ArrayList localArrayList = paramdno.hi(paramgA.ok());
    int i = paramgA.nP();

    if (paramgA.or()) {
      return -1;
    }
    bZA localbZA = paramgA.oi().a(Aq.bvS);
    if ((localbZA != null) && (!localbZA.i(null, null, null, null))) {
      return -1;
    }
    for (int j = 0; (j < localArrayList.size()) && (i > 0); j++) {
      gA localgA = (gA)localArrayList.get(j);
      i = (short)(i - (localgA.b(paramgA) ? localgA.nQ() : 0));
    }

    return (i <= 0) || (!paramdno.isFull()) ? 0 : -1;
  }

  public int a(dno paramdno, gA paramgA, short paramShort) {
    if (paramShort < 0) {
      return -1;
    }
    if (paramgA.or()) {
      return -1;
    }
    bZA localbZA = paramgA.oi().a(Aq.bvS);
    if ((localbZA != null) && (!localbZA.i(null, null, null, null))) {
      return -1;
    }
    dfy localdfy = (dfy)paramdno;
    gA localgA = (gA)localdfy.dB(paramShort);

    if (localgA == null) {
      return 0;
    }
    if (!paramgA.b(localgA)) {
      return -1;
    }
    return paramgA.nP() <= localgA.nQ() ? 0 : -1;
  }

  public int a(dno paramdno, gA paramgA1, gA paramgA2) {
    throw new UnsupportedOperationException("Pas de remplacement");
  }

  public int b(dno paramdno, gA paramgA) {
    return paramdno.f(paramgA) ? 0 : -1;
  }

  public boolean a(gA paramgA, dle paramdle, cOE paramcOE) {
    throw new UnsupportedOperationException("Pas de vérification de critère");
  }

  public boolean a(dno paramdno, dle paramdle, cOE paramcOE) {
    throw new UnsupportedOperationException("Pas de vérification de critère");
  }
}