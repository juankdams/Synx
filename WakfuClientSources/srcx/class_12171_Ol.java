import java.util.ArrayList;

public class Ol extends bhX
  implements bPr
{
  public Ol(Qb paramQb)
  {
    super(paramQb);
  }

  public boolean a(dsl paramdsl, int paramInt) {
    return true;
  }

  public boolean b(dsl paramdsl, int paramInt) {
    return (!this.erV.isLocked()) && (paramdsl.bDx() >= paramInt);
  }

  public int a(dno paramdno, long paramLong, short paramShort) {
    gA localgA = (gA)paramdno.ci(paramLong);
    if (localgA == null) {
      return -1;
    }
    int i = localgA.nP();
    int j = Math.min(paramShort, i);
    int k = j < i ? 0 : j == i ? b(paramdno, localgA) : -1;
    if (k != 0) {
      return k;
    }
    return 0;
  }

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
    return -1;
  }

  public int a(dno paramdno, gA paramgA1, gA paramgA2) {
    throw new UnsupportedOperationException("Pas de remplacement");
  }

  public int b(dno paramdno, gA paramgA)
  {
    return (!this.erV.isLocked()) && (paramdno.f(paramgA)) ? 0 : -1;
  }

  public boolean a(gA paramgA, dle paramdle, cOE paramcOE) {
    throw new UnsupportedOperationException("Pas de vérification de critère");
  }

  public boolean a(dno paramdno, dle paramdle, cOE paramcOE) {
    throw new UnsupportedOperationException("Pas de vérification de critère");
  }
}