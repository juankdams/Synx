import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.apache.log4j.Logger;

public class arh
{
  private final Set dzh = new LinkedHashSet();
  private final boolean dzi;
  private static final Logger K = Logger.getLogger(arh.class);
  private final cYk dzj = new cYk();
  private final cYk dzk = new cYk();

  public arh(Iterable paramIterable, boolean paramBoolean)
  {
    for (int[] arrayOfInt : paramIterable)
      this.dzh.add(new cYk(arrayOfInt[0], arrayOfInt[1]));
    this.dzi = paramBoolean;
  }

  public Iterable a(int paramInt1, int paramInt2, short paramShort1, int paramInt3, int paramInt4, short paramShort2, CG paramCG)
  {
    cDn localcDn = a(paramInt1, paramInt2, paramInt3, paramInt4, paramCG);

    ArrayList localArrayList = new ArrayList(this.dzh.size());

    for (cYk localcYk : this.dzh) {
      localArrayList.add(localcDn.R(new int[] { localcYk.getX(), localcYk.getY() }));
    }
    return localArrayList;
  }

  public boolean a(int paramInt1, int paramInt2, short paramShort1, int paramInt3, int paramInt4, short paramShort2, CG paramCG, int paramInt5, int paramInt6, short paramShort3)
  {
    cDn localcDn = a(paramInt1, paramInt2, paramInt3, paramInt4, paramCG);

    this.dzj.j(localcDn.S(new int[] { paramInt5, paramInt6 }));
    return this.dzh.contains(this.dzj);
  }

  public boolean a(int paramInt1, int paramInt2, short paramShort1, int paramInt3, int paramInt4, short paramShort2, CG paramCG, int paramInt5, int paramInt6, short paramShort3, byte paramByte) {
    cDn localcDn = a(paramInt1, paramInt2, paramInt3, paramInt4, paramCG);
    this.dzj.j(localcDn.S(new int[] { paramInt5, paramInt6 }));

    if (paramByte <= 0) {
      return this.dzh.contains(this.dzj);
    }
    for (byte b1 = -paramByte; b1 <= paramByte; b1++) {
      for (byte b2 = -paramByte; b2 <= paramByte; b2++) {
        this.dzk.ac(this.dzj.getX() + b1, this.dzj.getY() + b2, (short)0);
        if (this.dzh.contains(this.dzk))
          return true;
      }
    }
    return false;
  }

  private cDn a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, CG paramCG) {
    CG localCG = new La(paramInt1 - paramInt3, paramInt2 - paramInt4, 0).e(paramCG);

    return cDn.a(paramInt1, paramInt2, localCG, this.dzi);
  }
}