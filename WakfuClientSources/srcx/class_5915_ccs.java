import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;

class ccs
  implements ItemListener
{
  ccs(bEf parambEf)
  {
  }

  public void itemStateChanged(ItemEvent paramItemEvent)
  {
    int i = paramItemEvent.getStateChange() == 1 ? 1 : 0;
    anK.drx.a(i != 0 ? bEf.a(this.hub) : null);
    if (i != 0) {
      if (bEf.b(this.hub) == null) {
        bEf.a(this.hub, alQ.a(bEf.a(this.hub), false));
      }
      bEf.b(this.hub).addComponentListener(new YZ(this));

      bEf.b(this.hub).setVisible(true);
      bEf.b(this.hub).setLocation(bEf.c(this.hub).getLocationOnScreen());
    } else {
      bEf.b(this.hub).close();
    }
  }
}