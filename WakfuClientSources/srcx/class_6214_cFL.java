import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Pattern;

class cFL
{
  private static final Pattern iAH = Pattern.compile(",");
  public static final String iAI = "default";
  private final ArrayList iAJ = new ArrayList();
  private String SK;
  private int iAK;

  void setPath(String paramString)
  {
    this.SK = paramString;
  }

  void xI(int paramInt) {
    this.iAK = paramInt;
  }

  void e(CharSequence paramCharSequence) {
    ArrayList localArrayList = new ArrayList();

    if (paramCharSequence != null) {
      String[] arrayOfString = iAH.split(paramCharSequence);
      int i = 0; for (int j = arrayOfString.length; i < j; i++) {
        String str = arrayOfString[i];
        cFI localcFI = cFI.N(str, true);
        if (localcFI != null) {
          localArrayList.add(localcFI);
        }
      }
    }

    if (localArrayList.isEmpty()) {
      cBd();
    } else {
      this.iAJ.clear();
      this.iAJ.addAll(localArrayList);
    }
  }

  private void cBd() {
    this.iAJ.clear();
    this.iAJ.addAll(Arrays.asList(cFI.values()));
  }

  boolean e(cFI paramcFI) {
    return this.iAJ.contains(paramcFI);
  }

  String getPath() {
    return this.SK;
  }

  int UQ() {
    return this.iAK;
  }
}