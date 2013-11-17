import java.util.ArrayList;

public class dhX extends ec
{
  public dhX(String paramString, dou[] paramArrayOfdou)
  {
    super(paramString, paramArrayOfdou);
  }

  public dhX(dou[] paramArrayOfdou) {
    super(paramArrayOfdou);
  }

  public final dou[] iu()
  {
    ArrayList localArrayList = new ArrayList();

    for (int i = 0; i < it(); i++) {
      dou localdou = aC(i);

      localArrayList.add(new dou(localdou.getName()));
    }

    return (dou[])localArrayList.toArray(new dou[0]);
  }
}