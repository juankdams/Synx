import java.util.ArrayList;
import org.apache.log4j.Logger;

public class aKi extends brP
{
  private static final Logger K = Logger.getLogger(aKi.class);

  public aKi(bBg parambBg) {
    super(parambBg);
  }

  public boolean validate()
  {
    bAa();
    ArrayList localArrayList = b((bBg)this.fNP);
    return localArrayList.isEmpty();
  }

  public boolean bbw()
  {
    bAa();
    bBg localbBg = new bBg((bBg)this.fNP);

    boolean bool = true;
    while (bool) {
      ArrayList localArrayList = b(localbBg);
      if (localArrayList.isEmpty()) {
        break;
      }
      bool = a(localbBg, localArrayList);

      int i = 0; for (int j = localArrayList.size(); i < j; i++) {
        b((Gz)localArrayList.get(i));
      }
    }
    return !bzZ();
  }

  private static ArrayList b(bBg parambBg) {
    ArrayList localArrayList = new ArrayList();
    parambBg.o(new es(parambBg, localArrayList));

    return localArrayList;
  }

  private boolean a(bBg parambBg, ArrayList paramArrayList) {
    boolean bool = false;
    for (Gz localGz : paramArrayList) {
      cbR localcbR = (cbR)localGz.Qw();
      bool |= parambBg.o(localcbR.cfy());
    }
    return bool;
  }
}