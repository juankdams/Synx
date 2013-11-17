import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Pattern;

public class iY
{
  private static final String aJC = "Content-Type";
  private static final String aJD = "application/soap+xml; charset=UTF-8";
  private static final String aJE = "Content-Length";
  private static final String aJF = "Set-Cookie";
  private static final String aJG = "Cookie";
  private static final String aJH = "SID";
  private static final Pattern aJI = Pattern.compile("([^=;]+)=([^=;]+)[;$]");
  private final ccy aJJ;
  private final URL aJK;
  private final kL aJL;
  private final Map aJM = new HashMap();

  public iY(ccy paramccy, URL paramURL, kL paramkL, Map paramMap) {
    this.aJJ = paramccy;
    this.aJK = paramURL;
    this.aJL = paramkL;
    if (paramMap != null)
      this.aJM.putAll(paramMap);
  }

  public void qY()
  {
    bwZ localbwZ = new bwZ();
    localbwZ.b(this.aJJ.bqC());

    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    bpA localbpA = new bpA();
    localbpA.e(localByteArrayOutputStream);
    localbpA.b(localbwZ);

    byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();

    HttpURLConnection localHttpURLConnection = (HttpURLConnection)this.aJK.openConnection();
    localHttpURLConnection.setRequestMethod("POST");
    localHttpURLConnection.setRequestProperty("Content-Type", "application/soap+xml; charset=UTF-8");
    localHttpURLConnection.setRequestProperty("Content-Length", String.valueOf(arrayOfByte.length));
    for (Object localObject = this.aJM.entrySet().iterator(); ((Iterator)localObject).hasNext(); ) { Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
      String str = (String)localEntry.getKey();
      List localList = (List)localEntry.getValue();
      int i = 0; for (int j = localList.size(); i < j; i++) {
        localHttpURLConnection.addRequestProperty(str, (String)localList.get(i));
      }
    }

    localHttpURLConnection.setDoOutput(true);
    localHttpURLConnection.connect();

    localHttpURLConnection.getOutputStream().write(arrayOfByte);
    localHttpURLConnection.getOutputStream().flush();

    localObject = new Fy();
    ((Fy)localObject).a(localHttpURLConnection, this.aJL);
    ((Fy)localObject).start();
  }
}