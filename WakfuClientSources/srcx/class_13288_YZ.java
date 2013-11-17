import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JCheckBox;

class YZ extends ComponentAdapter
{
  YZ(ccs paramccs)
  {
  }

  public void componentHidden(ComponentEvent paramComponentEvent)
  {
    bEf.c(this.cKh.hub).setSelected(false);
  }
}