import java.util.ArrayList;
import java.util.List;

public final class iU
{
  private boolean aJt = false;
  private final List aJu = new ArrayList();
  private int aJv = 0;
  private int aJw = 0;
  private cdO aJx = null;

  public void y(boolean paramBoolean) {
    this.aJt = paramBoolean;
  }

  public boolean qQ() {
    return this.aJt;
  }

  public cYk qR() {
    if (this.aJu.isEmpty())
      return null;
    return (cYk)this.aJu.get(this.aJu.size() - 1);
  }

  public List getPath() {
    return this.aJu;
  }

  public void g(int paramInt1, int paramInt2, short paramShort) {
    this.aJu.add(new cYk(paramInt1, paramInt2, paramShort));
  }

  public void aX(int paramInt) {
    this.aJv = paramInt;
  }

  public int qS() {
    return this.aJv;
  }

  public void aY(int paramInt) {
    this.aJw = paramInt;
  }

  public int qT() {
    return this.aJw;
  }

  public void a(cdO paramcdO) {
    this.aJx = paramcdO;
  }

  public cdO qU() {
    return this.aJx;
  }
}