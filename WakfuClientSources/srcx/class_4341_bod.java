import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bod extends Ig
{
  public static final qM by = new cpQ(new ec[] { new dhX("", new dou[] { new dDZ("text", Pq.chu) }), new dhX("avec forçage", new dou[] { new dDZ("text", Pq.chu), new dDZ("forced", Pq.chw) }) });
  private String hi;
  private boolean dLG;
  private long ctZ;
  private brV dLF;

  public bod(int paramInt)
  {
    super(paramInt);
  }

  public void execute() {
    bCY.bLy().a(bU.fH().getString(this.hi), this.dLG, this.ctZ, this.dLF);
  }

  protected void j(ArrayList paramArrayList)
  {
    this.dLF = brV.fNZ;
    this.dLG = false;
    this.ctZ = 0L;

    int i = paramArrayList.size();
    if ((i < 1) || (i > 4)) {
      K.error("Nombre de paramètres invalide pour une action de type PetText id=" + getId() + " paramCount=" + i);
      return;
    }

    this.hi = ((cic)paramArrayList.get(0)).getValue();

    if (i > 1)
      this.dLG = (((bBB)paramArrayList.get(1)).a(null, null, null, null) == 0);
  }

  public qM aF() {
    return by;
  }
}