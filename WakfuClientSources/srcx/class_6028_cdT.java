import java.util.ArrayList;

public class cdT
{
  private final String hxT;
  private final ArrayList hxU = new ArrayList();
  private boolean bur = true;

  public cdT(String paramString) {
    this.hxT = paramString;
  }

  public boolean isEnabled() {
    return this.bur;
  }

  public void setEnabled(boolean paramBoolean) {
    if (this.bur == paramBoolean) {
      return;
    }
    this.bur = paramBoolean;
    int i = 0; for (int j = this.hxU.size(); i < j; i++) {
      dOc localdOc = (dOc)this.hxU.get(i);
      localdOc.setNetEnabled(paramBoolean);
    }
  }

  public void i(dOc paramdOc) {
    this.hxU.add(paramdOc);
    paramdOc.setNetEnabled(this.bur);
  }

  public void j(dOc paramdOc) {
    this.hxU.remove(paramdOc);
  }
}