import java.util.ArrayList;

public class wn
{
  public static final wn bmg = new wn();

  private final cSR bmh = new cSR();
  private final cSR bmi = new cSR();

  public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ArrayList localArrayList = (ArrayList)this.bmi.get(paramInt4);
    if (localArrayList == null) {
      localArrayList = new ArrayList();
      this.bmi.put(paramInt4, localArrayList);
    }

    int i = localArrayList.size();

    dED localdED = new dED(paramInt1, paramInt2, paramInt3, paramInt4, i);
    this.bmh.put(paramInt1, localdED);
    localArrayList.add(localdED);
  }

  public dED dn(int paramInt)
  {
    return (dED)this.bmh.get(paramInt);
  }

  public ArrayList jdMethod_do(int paramInt) {
    return (ArrayList)this.bmi.get(paramInt);
  }

  public int Fu() {
    return this.bmi.size();
  }

  public int dp(int paramInt) {
    ArrayList localArrayList = (ArrayList)this.bmi.get(paramInt);
    return localArrayList != null ? localArrayList.size() : 0;
  }
}