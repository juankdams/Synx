import java.util.List;
import org.apache.log4j.Logger;

public abstract class XJ extends aSt
  implements doN
{
  private static final Logger K = Logger.getLogger(XJ.class);
  private cSx cIi;

  public abstract CH mp();

  public Object e(cSx paramcSx)
  {
    this.cIi = paramcSx;
    aNL localaNL = paramcSx.cIk();
    if (localaNL != null) {
      super.setElementMap(localaNL.getElementMap());
    }
    return super.bif();
  }

  protected void a(String[] paramArrayOfString, List paramList1, List paramList2)
  {
    paramList1.add(this.cIi.getClass());
    paramList2.add(this.cIi);

    super.a(paramArrayOfString, paramList1, paramList2);
  }

  public boolean a(cSx paramcSx)
  {
    Object localObject = e(paramcSx);

    this.cIi = null;

    if ((localObject instanceof Boolean)) {
      return ((Boolean)localObject).booleanValue();
    }

    return false;
  }
}