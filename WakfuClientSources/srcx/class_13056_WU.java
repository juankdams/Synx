import java.util.ArrayList;
import java.util.Iterator;

class WU
  implements Iterator
{
  private int cGI = -1;
  private dRq cGJ = null;
  private int cGK = -1;

  private WU(cOP paramcOP) {
    ajg();
  }

  private void ajg() {
    while (this.cGI < cOP.a(this.bvh).size()) {
      if ((this.cGJ != null) && 
        (++this.cGK < this.cGJ.getWidgetChildren().size()))
      {
        return;
      }

      this.cGI += 1;
      if (this.cGI >= cOP.a(this.bvh).size())
      {
        return;
      }

      this.cGJ = this.bvh.getContainerFromLayer(cOP.a(this.bvh).get(this.cGI));
      this.cGK = -1;
    }
  }

  public boolean hasNext() {
    return this.cGI < cOP.a(this.bvh).size();
  }

  public dOc ajh() {
    dOc localdOc = (dOc)this.cGJ.getWidgetChildren().get(this.cGK);
    ajg();
    return localdOc;
  }

  public void remove() {
    throw new UnsupportedOperationException();
  }
}