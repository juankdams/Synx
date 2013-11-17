import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class So
  implements ML
{
  public static final byte aDG = 4;
  public static final Pattern csc = Pattern.compile("[0-9]+\\s*(;\\s*([0-9]+)\\s*)*$");
  public static final Pattern csd = Pattern.compile("(([0-9]+)\\s*[;]\\s*)|(([0-9]+)$)");

  private adz cse = new adz();
  private static final int csf = 233811181;

  public So()
  {
  }

  public So(String paramString)
  {
    this.cse = dx(paramString);
  }

  public So(adz paramadz) {
    this.cse = paramadz;
  }

  public String adm() {
    kr localkr = this.cse.apz();
    int i = 1;
    StringBuilder localStringBuilder = new StringBuilder();

    while (localkr.hasNext()) {
      if (i == 0)
        localStringBuilder.append(";");
      else {
        i = 0;
      }
      localStringBuilder.append(localkr.next());
    }
    return localStringBuilder.toString();
  }

  public boolean a(rP paramrP) {
    if (paramrP.yo() != 4) {
      return false;
    }

    cpj localcpj = (cpj)paramrP;
    return this.cse.contains(localcpj.ccv());
  }

  public void d(aYQ paramaYQ) {
    int i = paramaYQ.readInt();
    if (i == 233811181) {
      int j = 0; for (int k = paramaYQ.readByte(); j < k; j++)
        this.cse.hL(paramaYQ.readInt());
    }
    else {
      this.cse.hL(i);
    }
  }

  public void b(dSw paramdSw) {
    paramdSw.writeInt(233811181);
    paramdSw.writeByte((byte)this.cse.size());
    kr localkr = this.cse.apz();
    while (localkr.hasNext())
      paramdSw.writeInt(localkr.next());
  }

  public byte nq() {
    return 4;
  }

  public ML nr() {
    return new So(this.cse);
  }

  public static boolean dw(String paramString) {
    if (paramString == null) {
      return false;
    }
    Matcher localMatcher = csc.matcher(paramString);
    return localMatcher.matches();
  }

  public static adz dx(String paramString) {
    adz localadz = new adz();
    if (paramString == null) {
      return localadz;
    }
    Matcher localMatcher1 = csc.matcher(paramString);
    if (!localMatcher1.matches()) {
      return localadz;
    }
    Matcher localMatcher2 = csd.matcher(paramString);
    localMatcher2.reset();

    while (localMatcher2.find()) {
      String str = localMatcher2.group(2);
      if (str == null)
        str = localMatcher2.group(3);
      int i = bUD.aR(str);
      localadz.hL(i);
    }

    return localadz;
  }
}