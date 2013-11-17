import java.util.ArrayList;
import java.util.Arrays;

public abstract class dCO extends tM
{
  protected final ArrayList lLi = new ArrayList();

  public dCO(Rx paramRx, cdz paramcdz, Rx[] paramArrayOfRx) {
    this(paramRx, paramcdz, (byte)-1, paramArrayOfRx);
  }

  public dCO(Rx paramRx, cdz paramcdz, byte paramByte, Rx[] paramArrayOfRx) {
    super(paramRx, paramByte, paramcdz);

    this.lLi.addAll(Arrays.asList(paramArrayOfRx));
    int i = 0; for (int j = this.lLi.size(); i < j; i++)
      ((Rx)this.lLi.get(i)).a(this);
  }

  protected int Cc()
  {
    int i = 0;
    int j = 0; for (int k = this.lLi.size(); j < k; j++) {
      i += ((Rx)this.lLi.get(j)).value();
    }
    return i;
  }

  protected int Cd()
  {
    int i = 0;
    int j = 0; for (int k = this.lLi.size(); j < k; j++) {
      i += ((Rx)this.lLi.get(j)).max();
    }
    return i;
  }
}