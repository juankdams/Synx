import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class ceo
  implements aYF, bcJ, cOE
{
  private bxA hyC;
  protected dle hyD;
  private adf hyE;
  private List hyF = new ArrayList(1);
  private long hyG = -1L;

  public ceo(dle paramdle) {
    this.hyD = paramdle;
    this.hyF.add(paramdle);
  }

  public aYF LD() {
    return this;
  }

  public bcJ LE() {
    return this;
  }

  public adf LG() {
    return this.hyE;
  }

  public void a(adf paramadf) {
    this.hyE = paramadf;
  }

  public void a(bxA parambxA) {
    this.hyC = parambxA;
  }

  public bxA LF() {
    return this.hyC;
  }

  public tl LH() {
    return null;
  }

  public aJD LC() {
    return null;
  }

  public dle bk(long paramLong) {
    if (paramLong == this.hyD.getId())
      return this.hyD;
    return null;
  }

  public long P(byte paramByte) {
    return this.hyG++;
  }

  public Iterator Lz() {
    return this.hyF.iterator();
  }

  public List k(cYk paramcYk) {
    return i(paramcYk.getX(), paramcYk.getY(), paramcYk.IB());
  }

  public List i(int paramInt1, int paramInt2, int paramInt3) {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = Lz();
    while (localIterator.hasNext()) {
      dle localdle = (dle)localIterator.next();
      if (cqJ.a(localdle, paramInt1, paramInt2) == 0)
        localArrayList.add(localdle);
    }
    return localArrayList;
  }

  public byte getType() {
    return 0;
  }
}