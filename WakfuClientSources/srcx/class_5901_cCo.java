import java.util.ArrayList;
import java.util.Collections;

public class cCo extends aZT
{
  private final ArrayList iuL = new ArrayList();
  private dPT iuM = new dPT(34);

  public boolean cB(byte paramByte)
  {
    if (super.cB(paramByte)) {
      this.iuL.add(new dPT(paramByte));
      Collections.sort(this.iuL);
      return true;
    }

    return false;
  }

  public ArrayList cyq() {
    return this.iuL;
  }

  public dPT cyr() {
    return this.iuM;
  }

  public void clear() {
    super.clear();
    this.iuL.clear();
  }

  public void a(cXW paramcXW)
  {
    throw new UnsupportedOperationException("Pas de serialisation de landmarks dans le client");
  }
}