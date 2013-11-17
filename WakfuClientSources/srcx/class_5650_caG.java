import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JToggleButton;

class caG
  implements ActionListener
{
  caG(cif paramcif)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    dmn localdmn = this.hrs.hGR.yF();
    boolean bool = this.hrs.hGN.isSelected();
    while (localdmn.hasNext()) {
      localdmn.fl();
      if (bool)
        ((cEz)localdmn.value()).mark();
      else {
        ((cEz)localdmn.value()).cAj();
      }
    }
    cif.a(this.hrs).a(bJl.gKd.getTitle(), bool);

    ov.L(bool);
  }
}