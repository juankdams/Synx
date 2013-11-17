import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class bbH
  implements aqm
{
  private arh fkU;
  private short fkV = 0;

  public abstract void a(int[] paramArrayOfInt);

  public Iterable a(int paramInt1, int paramInt2, short paramShort1, int paramInt3, int paramInt4, short paramShort2, Iterator paramIterator) { return a(paramInt1, paramInt2, paramShort1, paramInt3, paramInt4, paramShort2, CG.bFM, paramIterator); }

  public Iterable a(int paramInt1, int paramInt2, short paramShort1, int paramInt3, int paramInt4, short paramShort2, CG paramCG, Iterator paramIterator)
  {
    ArrayList localArrayList = new ArrayList();
    while (paramIterator.hasNext()) {
      alr localalr = (alr)paramIterator.next();
      if (a(paramInt1, paramInt2, paramShort1, paramInt3, paramInt4, paramShort2, paramCG, localalr.fa(), localalr.fb(), localalr.fc()))
        localArrayList.add(localalr);
    }
    return localArrayList;
  }

  public short bqg() {
    return this.fkV;
  }

  public void bG(short paramShort) {
    this.fkV = paramShort;
  }

  public boolean a(int paramInt1, int paramInt2, short paramShort1, int paramInt3, int paramInt4, short paramShort2, CG paramCG, int paramInt5, int paramInt6, short paramShort3) {
    return bqh().a(paramInt1, paramInt2, paramShort1, paramInt3, paramInt4, paramShort2, paramCG, paramInt5, paramInt6, paramShort3);
  }

  public boolean b(int paramInt1, int paramInt2, short paramShort1, int paramInt3, int paramInt4, short paramShort2, CG paramCG, int paramInt5, int paramInt6, short paramShort3, byte paramByte)
  {
    return bqh().a(paramInt1, paramInt2, paramShort1, paramInt3, paramInt4, paramShort2, paramCG, paramInt5, paramInt6, paramShort3, paramByte);
  }

  public boolean a(int paramInt1, int paramInt2, short paramShort1, int paramInt3, int paramInt4, short paramShort2, int paramInt5, int paramInt6, short paramShort3) {
    return a(paramInt1, paramInt2, paramShort1, paramInt3, paramInt4, paramShort2, CG.bFM, paramInt5, paramInt6, paramShort3);
  }

  protected arh bqh() {
    if (this.fkU == null)
      this.fkU = new arh(eH(), eK());
    return this.fkU;
  }

  public Iterable b(int paramInt1, int paramInt2, short paramShort1, int paramInt3, int paramInt4, short paramShort2, CG paramCG)
  {
    return bqh().a(paramInt1, paramInt2, paramShort1, paramInt3, paramInt4, paramShort2, paramCG);
  }

  public Iterable a(int paramInt1, int paramInt2, short paramShort1, int paramInt3, int paramInt4, short paramShort2)
  {
    return b(paramInt1, paramInt2, paramShort1, paramInt3, paramInt4, paramShort2, CG.bFM);
  }

  protected abstract boolean eK();

  public abstract chY eL();

  public abstract List eH();

  public abstract String eI();

  public abstract int eJ();

  public abstract ArrayList eO();

  public abstract cgr eP();
}