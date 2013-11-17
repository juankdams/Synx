import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class aOG
  implements Iterator
{
  private final cpa evB;
  private Iterator evC;
  private aNL evD;
  private boolean evE;
  private int evF;

  public aOG(cpa paramcpa)
  {
    this.evB = paramcpa;
    if (this.evB == null)
      throw new IllegalArgumentException("Impossible d'initialiser avec une map nulle");
    this.evC = this.evB.iterator();
    this.evF = -1;

    this.evD = bfF();
  }

  private aNL bfF()
  {
    this.evE = true;
    if (this.evC.hasNext()) {
      return (aNL)this.evC.next();
    }

    this.evC = bfG();

    if (this.evC == null) {
      return null;
    }
    return (aNL)this.evC.next();
  }

  private Iterator bfG()
  {
    this.evF += 1;

    ArrayList localArrayList = this.evB.coQ();
    if ((localArrayList == null) || (localArrayList.size() >= this.evF)) {
      return null;
    }
    cpa localcpa = (cpa)localArrayList.get(this.evF);
    aOG localaOG = new aOG(localcpa);

    return localaOG.hasNext() ? localaOG : bfG();
  }

  public boolean hasNext() {
    if (!this.evE)
      this.evD = bfF();
    return this.evD != null;
  }

  public aNL bfH() {
    if (this.evD == null) {
      throw new NoSuchElementException();
    }
    this.evE = false;
    return this.evD;
  }

  public void remove() {
    throw new UnsupportedOperationException();
  }
}