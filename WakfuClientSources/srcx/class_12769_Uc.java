import java.util.ArrayList;
import org.apache.log4j.Logger;

public class Uc extends bvw
{
  private static final Logger K = Logger.getLogger(Uc.class);

  public Uc(bCP parambCP) {
    this.gfI = parambCP;
    ArrayList localArrayList = dHn.lSk.dhT();

    for (bXs localbXs : localArrayList) {
      int i = localbXs.getId();
      if (i != 4)
      {
        cPH localcPH = cHT.iDr.a(localbXs, null);
        this.gfF.put(i, localcPH);
        this.gfG.add(localcPH);
      }
    }
    this.gfJ = cHT.iDr.cCf();
    this.gfF.put(this.gfJ.getId(), this.gfJ);
    this.gfH = ((aMT)this.gfG.get(0));
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("isQuestView")) {
      return Boolean.valueOf(UO());
    }
    return super.getFieldValue(paramString);
  }

  public boolean UO() {
    return false;
  }
}