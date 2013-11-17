import java.util.ArrayList;
import java.util.List;

public class bFd extends cJH
{
  public bFd(List paramList)
  {
    super(paramList, 0, (short)0);
  }

  public void J(ArrayList paramArrayList) {
    lZ locallZ = cxo.ill.cLY();
    if (!paramArrayList.isEmpty()) {
      int i = 1;
      int j = 0; for (int k = paramArrayList.size(); j < k; j++) {
        if (i == 0)
          locallZ.tH();
        else
          i = 0;
        locallZ.a((CharSequence)paramArrayList.get(j));
      }
    }
    paramArrayList.clear();
    paramArrayList.add(locallZ.tP());
  }

  public String a(String paramString, dpI paramdpI) {
    if (paramdpI.bev())
      return "";
    String str = super.a(paramString, paramdpI);

    lZ locallZ = cxo.ill.cLY();
    locallZ.a(str).tH();
    return locallZ.tP();
  }
}