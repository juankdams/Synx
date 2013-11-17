import java.util.Collections;

public class cCt
{
  public final String gTE;
  public String[] gCT;

  public cCt(String paramString, String[] paramArrayOfString)
  {
    this.gTE = paramString;
    G(paramArrayOfString);
  }

  void G(String[] paramArrayOfString) {
    bcm localbcm = new bcm();
    if (this.gCT != null) {
      Collections.addAll(localbcm, this.gCT);
    }
    Collections.addAll(localbcm, paramArrayOfString);
    this.gCT = new String[localbcm.size()];
    localbcm.toArray(this.gCT);
  }
}