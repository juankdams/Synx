import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JToggleButton;

class caJ
  implements ActionListener
{
  caJ(cif paramcif)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    boolean bool = this.hrs.hGO.isSelected();
    cif.a(this.hrs).a(bJl.gKh.getTitle(), bool);
  }
}