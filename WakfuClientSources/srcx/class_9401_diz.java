import java.util.ArrayList;
import org.apache.log4j.Logger;

final class diz extends Ig
{
  public static final qM by = new cpQ(new ec[] { new dhX("event à modifier", new dou[] { new dDZ("id", Pq.chv), new dDZ("activé/désactivé (true/false)", Pq.chw) }) });
  private int aVF;
  private boolean hiC;

  diz(int paramInt)
  {
    super(paramInt);
  }

  public void execute()
  {
    ayJ localayJ = bOU.gUc.tG(this.aVF);
    if (localayJ == null) {
      K.error("Evenement d'id inconnnu " + this.aVF);
      return;
    }

    localayJ.setActive(this.hiC);
    bOZ.c(localayJ);
  }

  protected void j(ArrayList paramArrayList)
  {
    this.aVF = 0;
    int i = paramArrayList.size();
    if (i != 2) {
      K.error("Nombre de paramètres invalide pour une action de type PetText id=" + getId() + " paramCount=" + i);
      return;
    }

    this.aVF = ((int)((aOw)paramArrayList.get(0)).b(null, null, null, null));
    this.hiC = (((bBB)paramArrayList.get(1)).a(null, null, null, null) == 0);
  }

  public qM aF() {
    return by;
  }
}