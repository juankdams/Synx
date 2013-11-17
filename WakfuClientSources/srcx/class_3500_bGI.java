import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bGI
{
  protected static Logger K = Logger.getLogger(bGI.class);
  private int aw;
  private aid deu;
  private final ArrayList gDg;
  private aLl gDh;

  protected bGI(int paramInt)
  {
    this.aw = paramInt;

    this.gDg = new ArrayList();
  }

  protected void d(int paramInt)
  {
    this.aw = paramInt;
  }

  public int getId()
  {
    return this.aw;
  }

  public aLl bOz() {
    return this.gDh;
  }

  public void a(aLl paramaLl) {
    this.gDh = paramaLl;
  }

  public aid boT()
  {
    return this.deu;
  }

  public void o(aid paramaid) {
    this.deu = paramaid;
  }

  public void a(dEG paramdEG) {
    if (!this.gDg.contains(paramdEG))
      this.gDg.add(paramdEG);
    else
      K.warn("on essaye d'ajouter 2 fois le listener=" + paramdEG + " sur le territoire d'id=" + this.aw);
  }

  public void b(dEG paramdEG)
  {
    this.gDg.remove(paramdEG);
  }

  public void aL(dhJ paramdhJ) {
    int i = 0; for (int j = this.gDg.size(); i < j; i++)
      try {
        ((dEG)this.gDg.get(i)).a(paramdhJ, this);
      } catch (Exception localException) {
        K.error("Exception levee", localException);
      }
  }

  public void aM(dhJ paramdhJ)
  {
    int i = 0; for (int j = this.gDg.size(); i < j; i++)
      try {
        ((dEG)this.gDg.get(i)).b(paramdhJ, this);
      } catch (Exception localException) {
        K.error("Exception levee", localException);
      }
  }

  public String toString()
  {
    return "AbstractTerritory {" + "id=" + this.aw + ", protector=" + (this.deu != null ? Integer.valueOf(this.deu.getId()) : null) + '}';
  }
}