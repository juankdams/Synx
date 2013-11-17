import java.util.SortedSet;
import java.util.TreeSet;

public final class dwC
{
  private static dwC lCd = new dwC();
  public static final dkI lCe = new Tb();

  private SortedSet lCf = new TreeSet(new dhE(this));
  private dkI[] lCg;
  private int gfQ;
  private int gfR;

  public static dwC dbQ()
  {
    return lCd;
  }

  public dkI BQ(int paramInt)
  {
    if ((this.lCg == null) || (this.lCg.length == 0))
      return lCe;
    for (int i = 0; i < this.lCg.length; i++) {
      dkI localdkI = this.lCg[i];
      if (paramInt <= localdkI.agg())
        return localdkI;
    }
    return this.lCg[(this.lCg.length - 1)];
  }

  public dkI a(dkI paramdkI) {
    if ((this.lCg == null) || (this.lCg.length == 0))
      return lCe;
    for (int i = this.lCg.length - 1; i >= 0; i--) {
      dkI localdkI = this.lCg[i];
      if (localdkI.agg() < paramdkI.agg())
        return localdkI;
    }
    return null;
  }

  public dkI b(dkI paramdkI) {
    if ((this.lCg == null) || (this.lCg.length == 0))
      return lCe;
    for (int i = 0; i < this.lCg.length; i++) {
      dkI localdkI = this.lCg[i];
      if (paramdkI.agg() < localdkI.agg())
        return localdkI;
    }
    return null;
  }

  public int getMinBound() {
    return this.gfQ;
  }

  public int getMaxBound() {
    return this.gfR;
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2, aRk[] paramArrayOfaRk)
  {
    ahn localahn = new ahn(paramInt1, paramInt2, paramInt3, paramString1, paramString2, paramArrayOfaRk);
    this.lCf.add(localahn);
  }

  public void dbR() {
    this.lCg = new dkI[this.lCf.size()];
    this.lCf.toArray(this.lCg);
    this.gfQ = ((dkI)this.lCf.first()).agg();
    this.gfR = ((dkI)this.lCf.last()).agg();
    this.lCf = null;
  }

  void a(SortedSet paramSortedSet) {
    if (this.lCf == null) {
      this.lCf = paramSortedSet;
    } else {
      this.lCf.clear();
      this.lCf.addAll(paramSortedSet);
    }
  }

  public dkI BR(int paramInt) {
    for (int i = 0; i < this.lCg.length; i++) {
      dkI localdkI = this.lCg[i];
      if (localdkI.getId() == paramInt)
        return localdkI;
    }
    return null;
  }
}