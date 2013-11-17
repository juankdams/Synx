import java.util.ArrayList;
import org.apache.log4j.Logger;

public class gv
  implements bPr
{
  private static final Logger K = Logger.getLogger(gv.class);

  public static final gv aEB = new gv();
  static final int aEC = -1;
  static final int aED = -2;
  static final int aEE = -3;

  public int a(dno paramdno, gA paramgA)
  {
    if (!paramgA.isActive()) {
      return -3;
    }
    if (paramdno.isFull()) {
      if (!paramdno.cUK()) {
        return -1;
      }
      if ((paramgA.nR() > 1) && (paramgA.oq() == null)) {
        ArrayList localArrayList = paramdno.hi(paramgA.oi().getId());
        for (int i = localArrayList.size() - 1; i >= 0; i--) {
          if ((((gA)localArrayList.get(i)).b(paramgA)) && (((gA)localArrayList.get(i)).nP() + paramgA.nP() <= paramgA.nR())) {
            return 0;
          }
        }
      }
      return -1;
    }

    return 0;
  }

  public int a(dno paramdno, gA paramgA, short paramShort)
  {
    if (!paramgA.isActive()) {
      return -3;
    }

    if (!(paramdno instanceof dfy)) {
      K.warn("Utilisation du BagInventoryChecker sur un inventaire qui ne contient pas un ArrayInventory", new IllegalArgumentException());
      return a(paramdno, paramgA);
    }

    dsj localdsj = ((dfy)paramdno).dB(paramShort);
    if (localdsj == null) {
      return 0;
    }

    if (!paramdno.cUK())
      return -1;
    if (!localdsj.b(paramgA)) {
      return -1;
    }

    return 0;
  }

  public int a(dno paramdno, gA paramgA1, gA paramgA2)
  {
    if (!paramgA2.isActive()) {
      return -3;
    }
    return 0;
  }

  public int b(dno paramdno, gA paramgA)
  {
    return 0;
  }

  public boolean a(gA paramgA, dle paramdle, cOE paramcOE) {
    return true;
  }

  public boolean a(dno paramdno, dle paramdle, cOE paramcOE) {
    return true;
  }
}