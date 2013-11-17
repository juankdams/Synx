import java.util.Iterator;
import org.apache.log4j.Logger;

public class bwq
  implements Iterable
{
  public static final Logger K = Logger.getLogger(bwq.class);
  private bFN ggO;

  public bwq(cDg paramcDg1, cDg paramcDg2)
  {
    this.ggO = new bFN(paramcDg1.ML(), paramcDg2.ML());
  }

  public bwq(cYk paramcYk1, cYk paramcYk2)
  {
    this.ggO = new bFN(paramcYk1, paramcYk2);
  }

  public cYk bEd()
  {
    return this.ggO.bNZ();
  }

  public cYk bEe() {
    return this.ggO.bOa();
  }

  public boolean bEf()
  {
    return this.ggO.bEf();
  }

  public boolean bEg()
  {
    return this.ggO.bEg();
  }

  boolean a(cDg paramcDg, int paramInt)
  {
    if (!a(paramcDg.ML(), paramInt)) {
      return false;
    }
    return this.ggO.F(paramcDg.ML());
  }

  public Iterator iterator() {
    return this.ggO.iterator();
  }

  public boolean a(cYk paramcYk, int paramInt)
  {
    switch (ix.aIi[this.ggO.C(paramcYk).ordinal()])
    {
    case 1:
      return this.ggO.bOa().ad(paramcYk) <= paramInt;
    case 2:
      return this.ggO.bNZ().ad(paramcYk) <= paramInt;
    }
    return false;
  }

  public static boolean a(cYk paramcYk1, cYk paramcYk2, int paramInt)
  {
    if (!paramcYk1.ag(paramcYk2))
      return false;
    return paramcYk1.ad(paramcYk2) <= paramInt;
  }

  public String toString() {
    return "{MicrobotCombination from segment " + this.ggO + '}';
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if ((paramObject == null) || (getClass() != paramObject.getClass())) {
      return false;
    }
    bwq localbwq = (bwq)paramObject;
    return this.ggO.equals(localbwq.ggO);
  }

  public int hashCode() {
    return this.ggO != null ? this.ggO.hashCode() : 0;
  }
}