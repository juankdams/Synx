import java.util.ArrayList;

public class cuw
{
  public static final cuw ifd = new cuw();

  private final cSR ife = new cSR();

  public void a(Bn paramBn) {
    this.ife.put(paramBn.getId(), paramBn);
  }

  public Bn wQ(int paramInt) {
    return (Bn)this.ife.get(paramInt);
  }

  public ArrayList a(bdD parambdD) {
    ArrayList localArrayList = new ArrayList();
    for (dmn localdmn = this.ife.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      Bn localBn = (Bn)localdmn.value();
      if (localBn.Kw() == parambdD) {
        localArrayList.add(localBn);
      }
    }
    return localArrayList;
  }
}