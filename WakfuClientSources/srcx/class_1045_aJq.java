import java.util.ArrayList;
import org.apache.log4j.Logger;

public class aJq extends Ig
{
  public static final qM by = new cpQ(new ec[] { new dhX("spécifie l'id du script à executer", new dou[] { new dDZ("id du script", Pq.chv) }) });
  private int aSf;

  public aJq(int paramInt)
  {
    super(paramInt);
  }

  public void execute()
  {
    dlD.cTt().ps("events/" + Integer.toString(this.aSf) + ".lua");
  }

  protected void j(ArrayList paramArrayList) {
    int i = paramArrayList.size();
    if (i != 1) {
      K.error("Nombre de paramètres invalides pour une action RunScript id=" + getId() + " paramCount=" + i);
      return;
    }

    this.aSf = ((int)((aOw)paramArrayList.get(0)).b(null, null, null, null));
  }

  public qM aF() {
    return by;
  }
}