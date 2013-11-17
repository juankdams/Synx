import java.util.ArrayList;
import java.util.List;

public class btc
{
  private List gbc = new ArrayList();

  public btc()
  {
  }

  public btc(Jt paramJt)
  {
    c(paramJt);
  }

  public void c(Jt paramJt)
  {
    this.gbc.add(paramJt);
  }

  public String cw(String paramString)
  {
    String str = paramString;
    for (Jt localJt : this.gbc) {
      str = localJt.cw(str);
    }
    return str;
  }

  public boolean TI()
  {
    for (Jt localJt : this.gbc) {
      if (localJt.TI()) {
        return true;
      }
    }
    return false;
  }
}