import java.util.Iterator;
import org.apache.log4j.Logger;

public class bFN
  implements Iterable
{
  public static final Logger K = Logger.getLogger(bFN.class);
  private final cYk gBN;
  private final cYk gBO;

  public bFN(cYk paramcYk1, cYk paramcYk2)
  {
    if (!paramcYk1.ag(paramcYk2)) {
      throw new IllegalArgumentException("Can't create a segment from unaligned points : " + paramcYk1 + ", " + paramcYk2);
    }
    if (paramcYk1.bg(paramcYk2)) {
      throw new IllegalArgumentException("Can't create a segment from a point : " + paramcYk1 + ", " + paramcYk2);
    }
    long l1 = G(paramcYk1);
    long l2 = G(paramcYk2);

    if (l1 < l2) {
      this.gBN = new cYk(paramcYk1);
      this.gBO = new cYk(paramcYk2);
    } else {
      this.gBN = new cYk(paramcYk2);
      this.gBO = new cYk(paramcYk1);
    }
  }

  public bFN(bFN parambFN) {
    this(parambFN.gBN, parambFN.gBO);
  }

  public Iterator iterator() {
    return new dkp(this);
  }

  public boolean bEf()
  {
    return this.gBN.getY() == this.gBO.getY();
  }

  public boolean bEg()
  {
    return this.gBN.getX() == this.gBO.getX();
  }

  public boolean B(cYk paramcYk) {
    return C(paramcYk) == coV.hXS;
  }

  public coV C(cYk paramcYk)
  {
    if (paramcYk == null)
      return coV.hXR;
    if (!D(paramcYk)) {
      return coV.hXR;
    }
    long l = G(paramcYk);
    if (l < G(this.gBN))
      return coV.hXT;
    if (l > G(this.gBO)) {
      return coV.hXU;
    }
    return coV.hXS;
  }

  public boolean D(cYk paramcYk) {
    if (paramcYk == null)
      return false;
    if (this.gBN.bg(paramcYk))
      return true;
    if (this.gBO.bg(paramcYk))
      return true;
    return this.gBN.c(this.gBO, paramcYk);
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if ((paramObject == null) || (getClass() != paramObject.getClass())) {
      return false;
    }
    bFN localbFN = (bFN)paramObject;

    if (this.gBO != null ? !this.gBO.bg(localbFN.gBO) : localbFN.gBO != null)
      return false;
    if (this.gBN != null ? !this.gBN.bg(localbFN.gBN) : localbFN.gBN != null) {
      return false;
    }
    return true;
  }

  public boolean E(cYk paramcYk) {
    coV localcoV = C(paramcYk);
    return (localcoV == coV.hXU) || (localcoV == coV.hXT);
  }

  public boolean F(cYk paramcYk)
  {
    coV localcoV = C(paramcYk);
    switch (Ep.aIi[localcoV.ordinal()]) {
    case 1:
      this.gBN.ae(paramcYk);
      return true;
    case 2:
      this.gBO.ae(paramcYk);
      return true;
    }

    return false;
  }

  public cYk bNZ()
  {
    return new cYk(this.gBN);
  }

  public cYk bOa() {
    return new cYk(this.gBO);
  }

  public int getSize() {
    return (int)(G(this.gBO) - G(this.gBN) + 1L);
  }

  public int hashCode()
  {
    int i = this.gBN != null ? this.gBN.cLJ() : 0;
    i = 31 * i + (this.gBO != null ? this.gBO.cLJ() : 0);
    return i;
  }

  public String toString()
  {
    return "{Segment (" + this.gBN + ")-(" + this.gBO + ")}";
  }

  private static long G(cYk paramcYk)
  {
    return paramcYk.getX() + paramcYk.getY();
  }
}