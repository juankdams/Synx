import com.ankamagames.wakfu.client.core.script.ItemActionFunctionsLibrary.SelectPosition;

public class dCU
  implements bMh
{
  public dCU(ItemActionFunctionsLibrary.SelectPosition paramSelectPosition, bFB[] paramArrayOfbFB, bXf parambXf)
  {
  }

  public void J(cYk paramcYk)
  {
    ao(paramcYk);
  }

  private void ao(cYk paramcYk) {
    this.gOU[0] = new bFB(Integer.valueOf(paramcYk.getX()));
    this.gOU[1] = new bFB(Integer.valueOf(paramcYk.getY()));
    this.gOU[2] = new bFB(Short.valueOf(paramcYk.IB()));
    this.gOU[3] = new bFB(Integer.valueOf(0));
    this.Z.ccx();
  }

  public void q(cew paramcew) {
    K(null);
  }

  public void K(cYk paramcYk) {
    if (paramcYk != null)
      ao(paramcYk);
    else
      this.Z.ccy();
  }
}