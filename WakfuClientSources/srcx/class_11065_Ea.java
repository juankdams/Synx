import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Ea
  implements ActionListener
{
  Ea(aJM paramaJM)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (aJM.a(this.bIH) != null)
      aJM.a(this.bIH).alw();
    else
      System.exit(0);
  }
}