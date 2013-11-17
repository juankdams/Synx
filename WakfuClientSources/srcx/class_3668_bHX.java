import java.util.ArrayList;
import java.util.Collections;

class bHX
{
  private ArrayList bcw = new ArrayList();
  private int TR;

  public void c(avP paramavP)
  {
    this.bcw.add(paramavP);
    this.TR = this.bcw.size();
  }

  public avP bPs() {
    if (this.bcw.size() == 0) {
      return null;
    }

    if (this.TR == this.bcw.size()) {
      bPt();
      this.TR = 0;
    }

    avP localavP = (avP)this.bcw.get(this.TR);
    this.TR += 1;
    return localavP;
  }

  private void bPt() {
    Collections.shuffle(this.bcw, bCO.bLm());
  }
}