import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class cVe
{
  private static final String kHG = "ns1:";
  private static final Pattern kHH = Pattern.compile("ns1:([A-Za-z]+)");
  private final String m_name;
  private final ArrayList kHI = new ArrayList();

  private final Map kHJ = new HashMap();

  public cVe(String paramString) {
    this.m_name = paramString;
  }

  public void bd(String paramString1, String paramString2) {
    this.kHJ.put(paramString1, new Pi(paramString2));
  }

  public void U(String paramString, int paramInt) {
    this.kHJ.put(paramString, new cQg(paramInt));
  }

  public void P(String paramString, boolean paramBoolean) {
    this.kHJ.put(paramString, new CO(paramBoolean));
  }

  public void c(String paramString, bjf parambjf) {
    this.kHJ.put(paramString, parambjf);
  }

  public bjf cJW() {
    return this.kHI.isEmpty() ? null : (bjf)this.kHI.get(0);
  }

  public String getName() {
    return this.m_name;
  }

  public CC bqC() {
    CC localCC = new CC("ns1:" + this.m_name, "");
    for (Map.Entry localEntry : this.kHJ.entrySet()) {
      K localK = ((bjf)localEntry.getValue()).hn();
      localK.setName((String)localEntry.getKey());
      localCC.a(localK);
    }

    return localCC;
  }

  public static cVe I(K paramK) {
    String str = paramK.getName();
    Matcher localMatcher = kHH.matcher(str);

    if (!localMatcher.find()) {
      throw new IllegalArgumentException("Le nom de l'élément ne respecte pas la norme : " + str);
    }
    cVe localcVe = new cVe(localMatcher.group(1));
    for (K localK : paramK.getChildren()) {
      localcVe.kHI.add(ckx.D(localK));
    }

    return localcVe;
  }
}