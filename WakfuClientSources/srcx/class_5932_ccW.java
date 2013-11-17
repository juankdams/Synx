import java.util.ArrayList;
import java.util.Collection;

public class ccW extends lB
{
  private final int hvI;

  public ccW(aIV paramaIV, int paramInt)
  {
    super(paramaIV);
    this.hvI = paramInt;
  }

  public String sU() {
    return this.aPg + 1 + "/" + sV();
  }

  public int sV() {
    ArrayList localArrayList = this.aPf.aUV();
    return (int)Math.ceil(localArrayList.size() / this.hvI);
  }

  public int sW() {
    return this.hvI;
  }

  public Collection sX() {
    ArrayList localArrayList1 = this.aPf.aUV();
    int i = this.aPg * this.hvI;
    int j = Math.min(localArrayList1.size(), i + this.hvI);
    ArrayList localArrayList2 = new ArrayList();
    for (int k = i; k < j; k++) {
      localArrayList2.add(localArrayList1.get(k));
    }
    return localArrayList2;
  }
}