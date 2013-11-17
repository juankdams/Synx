import java.util.ArrayList;
import org.apache.log4j.Logger;

public class cEC extends Ig
{
  public static final qM by = new cpQ(new ec[] { new dhX("spécifie l'id de la quête à activer", new dou[] { new dDZ("id de la quête", Pq.chv) }) });
  private int iyx;

  public cEC(int paramInt)
  {
    super(paramInt);
  }

  public void execute() {
    bCP localbCP = byv.bFN().bFO().bGa();
    if (localbCP.mk(this.iyx))
      localbCP.sr(this.iyx);
  }

  protected void j(ArrayList paramArrayList) {
    int i = paramArrayList.size();
    if (i != 1) {
      K.error("Nombre de paramètres invalides pour une action ClientEventActionRequestQuestActivation id=" + getId() + " paramCount=" + i);
      return;
    }

    this.iyx = ((int)((aOw)paramArrayList.get(0)).b(null, null, null, null));
  }

  public qM aF() {
    return by;
  }
}