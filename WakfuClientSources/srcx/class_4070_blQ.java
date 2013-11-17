import java.util.Enumeration;

public class blQ extends bAo
  implements cjq
{
  public boolean gh()
  {
    if (bIG() > 1) {
      throw new cJ("You must not nest more than one condition into <not>");
    }

    if (bIG() < 1) {
      throw new cJ("You must nest a condition into <not>");
    }
    return !((cjq)bIH().nextElement()).gh();
  }
}