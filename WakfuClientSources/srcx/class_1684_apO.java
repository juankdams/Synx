import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class apO extends MouseAdapter
{
  apO(jl paramjl, ib paramib)
  {
  }

  public void mousePressed(MouseEvent paramMouseEvent)
  {
    jl.a(this.dws, jl.a(this.dws).getId());
  }
}