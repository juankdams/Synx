import java.util.Arrays;
import java.util.List;

public class oS extends bik
{
  public int aUu;
  public int aUv;
  public int aUw;
  public char[] aUx = new char[1];

  protected List aR() {
    return Arrays.asList(new String[] { "NextEntryOffset", "Action", "FileNameLength", "FileName" });
  }

  private oS() {
  }

  public oS(int paramInt) {
    if (paramInt < size()) {
      throw new IllegalArgumentException("Size must greater than " + size() + ", requested " + paramInt);
    }

    pQ(paramInt);
  }

  public String getFilename()
  {
    return new String(this.aUx, 0, this.aUw / 2);
  }

  public void hb()
  {
    this.aUx = new char[0];
    super.hb();
    this.aUx = sF().j(12L, this.aUw / 2);
  }

  public oS wo() {
    if (this.aUu == 0) {
      return null;
    }
    oS localoS = new oS();
    localoS.a(sF(), this.aUu);
    localoS.hb();
    return localoS;
  }
}