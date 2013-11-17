import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

abstract class aMO
  implements ChangeListener
{
  aMO(alQ paramalQ)
  {
  }

  public void stateChanged(ChangeEvent paramChangeEvent)
  {
    JSlider localJSlider = (JSlider)paramChangeEvent.getSource();
    aP(alQ.b(localJSlider));
  }

  protected abstract void aP(float paramFloat);
}