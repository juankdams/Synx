import java.util.ListIterator;
import java.util.Stack;

public abstract class caL
{
  private static final int hru = 100;
  private Stack hrv;
  private ListIterator hrw;

  public caL()
  {
    this.hrv = new Stack();
  }

  public void clear()
  {
    this.hrv.clear();
  }

  public String ceN()
  {
    if ((this.hrw != null) && (this.hrw.hasPrevious())) {
      return (String)this.hrw.previous();
    }
    return "";
  }

  public String ceO()
  {
    if ((this.hrw != null) && (this.hrw.hasNext())) {
      return (String)this.hrw.next();
    }
    return "";
  }

  protected void kP(String paramString)
  {
    if (!this.hrv.isEmpty()) {
      String str = (String)this.hrv.lastElement();
      if ((str == null) || (!str.equals(paramString)))
      {
        if (this.hrv.size() >= 100)
          this.hrv.remove(this.hrv.lastElement());
        this.hrv.push(paramString);
      }
    } else {
      this.hrv.push(paramString);
    }
    this.hrw = this.hrv.listIterator(this.hrv.size());
  }
}