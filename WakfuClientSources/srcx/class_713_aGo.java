import com.sun.opengl.impl.packrect.Rect;
import com.sun.opengl.impl.packrect.RectVisitor;
import java.util.List;

class aGo
  implements RectVisitor
{
  aGo(cLb paramcLb, List paramList)
  {
  }

  public void visit(Rect paramRect)
  {
    cwN localcwN = (cwN)paramRect.getUserData();

    if (localcwN.cue())
      localcwN.cug();
    else
      this.edr.add(paramRect);
  }
}