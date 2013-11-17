import java.util.ArrayList;

public class Gx extends bNs
{
  private ArrayList bOM;

  public Gx(cUQ paramcUQ)
  {
    super(paramcUQ);
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("content"))
      return Qu();
    if (paramString.equals("kama")) {
      if (this.gSo == null) {
        this.gSo = new kO(this);
      }
      return this.gSo;
    }
    return super.getFieldValue(paramString);
  }

  protected boolean isValid() {
    if (this.gSo.akG() > 0) {
      return true;
    }
    for (lK locallK : this.bOM) {
      if (locallK.akG() > 0) {
        return true;
      }
    }
    return false;
  }

  public void Qs() {
    dFu localdFu = new dFu();
    for (lK locallK : this.bOM) {
      localdFu.fg(locallK.tc(), locallK.akG());
    }
    ((dTW)byv.bFN().bFO().bSe()).a(localdFu, this.gSo.akG());
  }

  public int Qt() {
    return this.gSo.akG();
  }

  private ArrayList Qu()
  {
    aso localaso;
    if (this.bOM == null) {
      this.bOM = new ArrayList();
      for (localaso = bVc().bPi().abR(); localaso.hasNext(); ) {
        localaso.fl();
        int i = localaso.zY();
        this.bOM.add(new lK(this, i, null));
      }
    }
    return this.bOM;
  }
}