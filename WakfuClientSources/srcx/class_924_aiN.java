import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class aiN
{
  public static final String dgM = ")([^\\p{L}]|\\z))";
  public static final String dgN = "(([^\\p{L}]|\\A)(";
  public static final String dgO = ")[\\p{L}]*)";
  public static final String dgP = "([\\p{L}]*(";
  public static boolean dgQ = true;
  public static final int dgR = 10000;
  private static final Logger K = Logger.getLogger(aiN.class);

  private static final aiN dgS = new aiN();
  private short dgT;
  private final cSR dgU = new cSR();
  private aQR dgV;
  private final ArrayList dgW = new ArrayList();

  private final ArrayList dgX = new ArrayList();

  private final ArrayList dgY = new ArrayList();

  private final ArrayList dgZ = new ArrayList();

  private final ArrayList dha = new ArrayList();

  private static final char[] dhb = { '&', '~', '#', '@', '£', '¤', 'µ', '%', '!' };

  public static aiN avC()
  {
    return dgS;
  }

  public void a(auT paramauT) {
    int i = paramauT.aGX();
    Cu.a(this.dgU, i, paramauT);
  }

  public void aA(short paramShort) {
    int i = paramShort != this.dgT ? 1 : 0;
    this.dgT = paramShort;

    if ((this.dgV != null) && (i != 0))
      init();
  }

  public void a(aQR paramaQR) {
    paramaQR.a(this);
    if (this.dgV == null)
      this.dgV = paramaQR;
  }

  public void init()
  {
    a(this.dgV);
  }

  private static ArrayList a(List paramList, String paramString1, String paramString2, int paramInt) {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < paramList.size()) {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString1);
      int j = 1;
      for (; i < paramList.size(); i++) {
        if (j != 0)
          j = 0;
        else {
          localStringBuilder.append('|');
        }
        localStringBuilder.append(Pattern.quote((String)paramList.get(i)));
        if (localStringBuilder.length() > 10000)
          break;
      }
      localStringBuilder.append(paramString2);
      localArrayList.add(Pattern.compile(localStringBuilder.toString(), paramInt));
    }

    return localArrayList;
  }

  public void i(List paramList) {
    this.dgY.addAll(a(paramList, "(([^\\p{L}]|\\A)(", ")([^\\p{L}]|\\z))", 2));
  }

  public void j(List paramList) {
    this.dgY.addAll(a(paramList, "([\\p{L}]*(", ")[\\p{L}]*)", 2));
  }

  public void k(List paramList) {
    this.dgW.addAll(a(paramList, "(([^\\p{L}]|\\A)(", ")([^\\p{L}]|\\z))", 2));
  }

  public void l(List paramList) {
    this.dgW.addAll(a(paramList, "([\\p{L}]*(", ")[\\p{L}]*)", 2));
  }

  public void m(List paramList) {
    ArrayList localArrayList = a(paramList, "(([^\\p{L}]|\\A)(", ")([^\\p{L}]|\\z))", 2);
    this.dgZ.addAll(localArrayList);
    this.dgX.addAll(localArrayList);
  }

  public void n(List paramList) {
    ArrayList localArrayList = a(paramList, "([\\p{L}]*(", ")[\\p{L}]*)", 2);
    this.dha.addAll(localArrayList);
    this.dgX.addAll(localArrayList);
  }

  public boolean eA(String paramString) {
    if (!dgQ)
      return true;
    if ((paramString == null) || (paramString.length() == 0)) {
      return true;
    }
    String str = dzp.ib(paramString);
    return (!a(str, this.dgW)) && (!a(str, this.dgX)) && (!a(str, this.dgY));
  }

  private boolean a(String paramString, ArrayList paramArrayList) {
    return b(paramString, paramArrayList) != null;
  }

  private Matcher b(String paramString, ArrayList paramArrayList) {
    int i = 0; for (int j = paramArrayList.size(); i < j; i++) {
      Pattern localPattern = (Pattern)paramArrayList.get(i);
      Matcher localMatcher = localPattern.matcher(paramString);
      if (localMatcher.find()) {
        localMatcher.reset();
        return localMatcher;
      }
    }
    return null;
  }

  public String p(String paramString, boolean paramBoolean) {
    if ((paramString == null) || (paramString.trim().length() == 0)) {
      return "";
    }
    if (!dgQ) {
      return paramString;
    }
    if (a(paramString, this.dgY)) {
      return "";
    }

    if (!paramBoolean) {
      return paramString;
    }
    if (!this.dgX.isEmpty())
      return c(paramString, this.dgX);
    if ((!this.dgZ.isEmpty()) && (!this.dha.isEmpty())) {
      String str = d(paramString, this.dgZ);
      return d(str, this.dha);
    }
    K.error("[TRANSLATION] No censor pattern matched for language " + ajD.aD(this.dgT).name());
    return paramString;
  }

  private static String c(String paramString, ArrayList paramArrayList)
  {
    for (int i = 0; i < paramArrayList.size(); i++) {
      Pattern localPattern = (Pattern)paramArrayList.get(i);
      paramString = a(paramString, localPattern);
    }
    return paramString;
  }

  private static String d(String paramString, ArrayList paramArrayList) {
    for (int i = 0; i < paramArrayList.size(); i++) {
      Pattern localPattern = (Pattern)paramArrayList.get(i);
      paramString = b(paramString, localPattern);
    }
    return paramString;
  }

  private static String a(String paramString, Pattern paramPattern) {
    StringBuilder localStringBuilder = new StringBuilder();
    String str1 = paramString.trim();
    String str2 = dzp.ib(str1);

    Matcher localMatcher = paramPattern.matcher(str2);
    int i = 0;

    while (localMatcher.find()) {
      localStringBuilder.append(str1, i, localMatcher.start());
      i = localMatcher.end();

      int j = localMatcher.end() - localMatcher.start();
      a(localStringBuilder, j);
    }

    localStringBuilder.append(str1, i, str1.length());

    return localStringBuilder.toString();
  }

  private static String b(String paramString, Pattern paramPattern) {
    StringBuilder localStringBuilder = new StringBuilder();
    String str1 = paramString.trim();
    String str2 = dzp.ib(str1);

    Matcher localMatcher = paramPattern.matcher(str2);
    int i = 0;

    while (localMatcher.find()) {
      localStringBuilder.append(str1, i, localMatcher.start(2));
      i = localMatcher.end(2);

      int j = localMatcher.end(2) - localMatcher.start(2);
      a(localStringBuilder, j);
    }

    localStringBuilder.append(str1, i, str1.length());

    return localStringBuilder.toString();
  }

  public static void a(StringBuilder paramStringBuilder, int paramInt) {
    for (int i = 0; i < paramInt; i++)
      paramStringBuilder.append(dhb[bCO.sf(dhb.length)]);
  }

  public short avD() {
    return this.dgT;
  }

  public cSR avE() {
    return this.dgU;
  }

  public static void main(String[] paramArrayOfString) {
    String str = "Perdu Consalope ou un con, et une salope d'administratrice";

    avC().i(Arrays.asList(new String[] { "tralala", "pouet" }));
    avC().n(Arrays.asList(new String[] { "www", "admin" }));
    avC().m(Arrays.asList(new String[] { "con", "salope" }));

    avC().p("Perdu Consalope ou un con, et une salope d'administratrice", true);
  }
}