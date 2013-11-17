import java.util.ArrayList;
import java.util.Collection;

public class bse extends lB
{
  private final int fOs;

  public bse(aIV paramaIV, int paramInt)
  {
    super(paramaIV);
    this.fOs = paramInt;
  }

  public String sU() {
    int i = this.aPg * this.fOs;
    int j = i + this.fOs - 1;
    String str = i + "-" + j;
    return bU.fH().getString("levelShort.custom", new Object[] { str });
  }

  public int sV() {
    int i = -2147483648;
    ArrayList localArrayList = this.aPf.aUV();
    if (localArrayList.isEmpty())
      return 0;
    int j = 0; for (int k = localArrayList.size(); j < k; j++) {
      cfm localcfm = (cfm)localArrayList.get(j);
      if (localcfm.cig() > i)
        i = localcfm.cig();
    }
    return (int)Math.ceil(i / this.fOs) + 1;
  }

  public int sW()
  {
    return sX().size();
  }

  public Collection sX()
  {
    return bAt();
  }

  private Collection bAt() {
    ArrayList localArrayList1 = this.aPf.aUV();
    int i = this.aPg * this.fOs;
    int j = i + this.fOs - 1;
    ArrayList localArrayList2 = new ArrayList();
    int k = 0; for (int m = localArrayList1.size(); k < m; k++) {
      cfm localcfm = (cfm)localArrayList1.get(k);
      int n = localcfm.cig();
      if ((n >= i) && (n <= j))
        localArrayList2.add(localcfm);
    }
    return localArrayList2;
  }
}