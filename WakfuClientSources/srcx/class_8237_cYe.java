import java.awt.Rectangle;
import java.util.Arrays;
import java.util.List;

public class cYe extends bik
{
  public int left;
  public int top;
  public int right;
  public int bottom;

  protected List aR()
  {
    return Arrays.asList(new String[] { "left", "top", "right", "bottom" });
  }

  public Rectangle cLC()
  {
    return new Rectangle(this.left, this.top, this.right - this.left, this.bottom - this.top);
  }

  public String toString()
  {
    return "[(" + this.left + "," + this.top + ")(" + this.right + "," + this.bottom + ")]";
  }
}