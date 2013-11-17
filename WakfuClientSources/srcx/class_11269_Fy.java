import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Fy extends Thread
{
  private HttpURLConnection bMQ;
  private kL aJL;

  public void a(HttpURLConnection paramHttpURLConnection, kL paramkL)
  {
    this.bMQ = paramHttpURLConnection;
    this.aJL = paramkL;
    setName("SOAP-AnswerListener");
  }

  public void run()
  {
    ccy localccy = null;
    String str = null;
    try {
      Map localMap = Pm();

      bpA localbpA = bpA.byM();
      localbpA.i(this.bMQ.getInputStream());

      bwZ localbwZ = new bwZ();
      localbpA.a(localbwZ, new cdJ[0]);

      this.bMQ.disconnect();

      localccy = ccy.f(localbwZ);
      localccy.n(localMap);
    } catch (Exception localException) {
      str = localException.getMessage();
    }

    if (localccy != null)
      this.aJL.a(localccy);
    else
      this.aJL.ah("Problème à la réception du message SOAP : " + str);
  }

  private Map Pm()
  {
    HashMap localHashMap = new HashMap();
    Map localMap = this.bMQ.getHeaderFields();
    List localList = (List)localMap.get("Set-Cookie");
    String str1 = null;

    int i = 0; for (int j = localList.size(); i < j; i++) {
      Matcher localMatcher = iY.qZ().matcher((CharSequence)localList.get(i));
      while (localMatcher.find()) {
        if ("SID".equals(localMatcher.group(1))) {
          str1 = localMatcher.group(2);
          break label107;
        }
      }
    }
    label107: String str2 = "SID=" + str1;
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(str2);
    localHashMap.put("Cookie", localArrayList);
    return localHashMap;
  }
}