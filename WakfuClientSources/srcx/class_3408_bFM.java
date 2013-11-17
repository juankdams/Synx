import java.util.ArrayList;

public class bFM extends cIf
{
  public bFM(ArrayList paramArrayList)
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
    return (paramadr != null) && (paramadr.aps() == 2);
  }

  public Enum gm() {
    return Bz.bxX;
  }
}