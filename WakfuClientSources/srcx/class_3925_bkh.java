import java.util.ArrayList;

public class bkh
{
  public static final bkh fAz = new bkh();
  private final ArrayList fAA;

  private bkh()
  {
    this.fAA = new ArrayList();
  }

  public void c(int paramInt, String paramString) {
    this.fAA.add(new daw(paramInt, paramString));
  }

  public ArrayList bvk() {
    return this.fAA;
  }

  public void clear() {
    this.fAA.clear();
  }
}