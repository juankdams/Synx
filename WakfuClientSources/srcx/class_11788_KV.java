import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KV extends atq
{
  public static final Pattern bXC = Pattern.compile("(<(\\p{Alpha}+?)( ([^<>]*))*>(.*?)</(\\2)>)|([^<>]+)", 32);

  public String Vt()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (ddB localddB : this) {
      localStringBuilder.append(localddB.cOK());
    }
    return localStringBuilder.toString();
  }

  public boolean cA(String paramString)
  {
    int i = paramString.length();
    if ((i > 0) && (isEmpty())) {
      return false;
    }

    int j = 0;
    for (ddB localddB : this) {
      String str = localddB.cOK();
      int k = j + str.length();
      if (k > i)
        return false;
      if (!str.equals(paramString.substring(j, k)))
        return false;
    }
    return j == i;
  }

  public void cB(String paramString)
  {
    aFj();
    aFB();
    cC(paramString);
  }

  public void cC(String paramString)
  {
    Matcher localMatcher = bXC.matcher(paramString);
    localMatcher.reset();
    ArrayList localArrayList = new ArrayList();
    while (localMatcher.find()) {
      ddB localddB = a(localMatcher, null, true);

      localddB.a(localMatcher, localArrayList);
    }

    int i = 0; for (int j = localArrayList.size(); i < j; i++)
      a((ddB)localArrayList.get(i));
  }

  public ddB a(Matcher paramMatcher, ddB paramddB, boolean paramBoolean)
  {
    bY localbY = ddB.oV(paramMatcher.group(2));

    if (localbY == bY.QQ) {
      return new cKf(this, paramddB);
    }
    return new ckA(this, paramddB, false);
  }

  public static String cD(String paramString) {
    Matcher localMatcher = bXC.matcher(paramString);
    localMatcher.reset();
    StringBuilder localStringBuilder = new StringBuilder();
    while (localMatcher.find()) {
      String str1 = localMatcher.group(0);
      if (!dzp.qF(str1))
      {
        String str2 = localMatcher.group(5);
        if (dzp.qF(str2))
          localStringBuilder.append(str1);
        else
          localStringBuilder.append(str2);
      }
    }
    return localStringBuilder.toString();
  }
}