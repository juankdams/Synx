import java.util.ArrayList;

public final class dqf extends cIf
{
  public dqf(ArrayList paramArrayList)
  {
    int i = u(paramArrayList);
    switch (i) {
    case 0:
      this.aMu = false;
      break;
    case 1:
      String str = ((cic)paramArrayList.get(0)).getValue();
      if (str.equalsIgnoreCase("target"))
        this.aMu = true;
      break;
    }
  }

  protected boolean a(adr paramadr) {
    return (paramadr != null) && ((paramadr.aps() == 3) || (paramadr.aps() == 1));
  }

  public Enum gm()
  {
    return Bz.bCJ;
  }
}