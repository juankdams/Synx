import java.util.ArrayList;

public class dLx extends ec
{
  public dLx(String paramString, dmb[] paramArrayOfdmb)
  {
    super(paramString, paramArrayOfdmb);
  }

  public dLx(dmb[] paramArrayOfdmb) {
    super(paramArrayOfdmb);
  }

  public final dou[] iu()
  {
    ArrayList localArrayList = new ArrayList();

    for (int i = 0; i < it(); i++) {
      dou localdou = aC(i);

      localArrayList.add(new dou(localdou.getName() + " (base)"));
      localArrayList.add(new dou(localdou.getName() + " (incr)"));
    }

    dou[] arrayOfdou = new dou[localArrayList.size()];
    return (dou[])localArrayList.toArray(arrayOfdou);
  }
}