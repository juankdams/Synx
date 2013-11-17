import java.util.ArrayList;
import java.util.Iterator;

public class aqW extends dlq
{
  public static final String dyD = "recipes";
  private ArrayList dyE;

  public aqW(int paramInt1, int paramInt2)
  {
    super(paramInt1);
  }

  public void jD(int paramInt) {
    byz localbyz = byv.bFN().bFO();
    this.dyE = new ArrayList();
    Iterator localIterator = DA.bIr.eD(this.buP).zQ(paramInt);
    if (localIterator == null) {
      return;
    }
    while (localIterator.hasNext()) {
      cGx localcGx = (cGx)localIterator.next();
      if ((!localcGx.c(yK.bso)) || (localbyz.aTn().bx(this.buP, localcGx.getId())))
      {
        cfm localcfm = new cfm(localcGx, this);
        this.dyE.add(localcfm);
      }
    }
  }

  public boolean aDd() { return (this.dyE != null) && (this.dyE.size() != 0); }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("recipes")) {
      return this.dyE;
    }
    return super.getFieldValue(paramString);
  }

  public short nU() {
    return 100;
  }
}