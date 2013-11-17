import java.util.ArrayList;
import java.util.Arrays;

public class cdj extends bXI
{
  private boolean aYZ;
  private String[] gCT;

  public cdj(dpI paramdpI, boolean paramBoolean, String[] paramArrayOfString)
  {
    super(paramdpI);
    this.aYZ = paramBoolean;
    ArrayList localArrayList = new ArrayList(paramArrayOfString.length);
    for (int i = 0; i < paramArrayOfString.length; i++) {
      String[] arrayOfString1 = diq.ph(paramArrayOfString[i]);
      for (String str : arrayOfString1) {
        if (!localArrayList.contains(str))
          localArrayList.add(str);
      }
    }
    this.gCT = ((String[])localArrayList.toArray(new String[localArrayList.size()]));
  }

  private cdj(cdj paramcdj) {
    super(paramcdj.cwt);
    this.aYZ = paramcdj.aYZ;
    this.gCT = paramcdj.gCT;
  }

  public cdj cgi() {
    return new cdj(this);
  }

  public void a(cew paramcew) {
    paramcew.a(this.gCT, this.aYZ);
    paramcew.cgQ();
  }

  public boolean a(bXI parambXI) {
    if (!super.a(parambXI))
      return false;
    if ((!bB) && (!(parambXI instanceof cdj))) throw new AssertionError();
    cdj localcdj = (cdj)parambXI;
    return (localcdj.aYZ == this.aYZ) && (Arrays.equals(this.gCT, localcdj.gCT));
  }
}