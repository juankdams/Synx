import java.util.ArrayList;

public class rA
  implements czc
{
  public dKY ax(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    String str1 = paramString.substring(1, paramString.length() - 1);
    String[] arrayOfString1 = dzp.c(str1, ',');
    for (String str2 : arrayOfString1) {
      localArrayList.add(new ciM(Integer.parseInt(str2)));
    }
    return new ctp(localArrayList);
  }
}