import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import org.apache.log4j.Logger;

public class dud extends alO
{
  private static final Logger K = Logger.getLogger(dud.class);

  private static final Comparator bEa = new bEN();

  public dCf[] dac()
  {
    dCf[] arrayOfdCf = new dCf[this.dmN.size()];
    this.dmN.toArray(arrayOfdCf);
    Arrays.sort(arrayOfdCf, bEa);
    return arrayOfdCf;
  }

  protected void a(cew paramcew, dCf paramdCf)
  {
  }

  public void a(dCf paramdCf1, dCf paramdCf2, cew paramcew)
  {
    paramcew.cbD().aek();
  }
}