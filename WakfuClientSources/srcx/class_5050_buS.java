import java.util.ArrayList;
import org.apache.log4j.Logger;

public abstract class buS
{
  protected static final Logger K = Logger.getLogger(buS.class);
  private final int aw;
  private bZA aB;
  private ArrayList fHL;
  private String gez;

  buS(int paramInt)
  {
    this.aw = paramInt;
  }

  public void execute() {
    yB();
  }

  public void b(cfc paramcfc) {
    d(paramcfc);
    ArrayList localArrayList = c(paramcfc);
    if (awA.a(paramcfc.cia(), localArrayList))
      this.fHL = localArrayList;
    else
      K.error("L'action " + paramcfc.chY() + " de l'ie generic id=" + getId() + " n'a pas des paramètres du bon type");
  }

  private ArrayList c(cfc paramcfc)
  {
    String[] arrayOfString = paramcfc.chZ();
    ArrayList localArrayList1 = new ArrayList(arrayOfString.length);
    int i = 0; for (int j = arrayOfString.length; i < j; i++) {
      try {
        ArrayList localArrayList2 = aVj.hl(arrayOfString[i]);
        if (localArrayList2 != null)
          localArrayList1.addAll(localArrayList2);
        else
          localArrayList1.add(null);
      }
      catch (Exception localException) {
        K.error("Erreur lors de la compilation du critère sur une action de l'ie generic id=" + getId() + " actionid = " + paramcfc.chY() + " params : " + arrayOfString[i], localException);
      }
    }

    return localArrayList1;
  }

  private void d(cfc paramcfc) {
    bZA localbZA = null;
    try {
      localbZA = aVj.hn(paramcfc.uL());
    } catch (Exception localException) {
      K.error("Erreur de compilation du critère sur l'action id=" + paramcfc.chY() + " de l'ie generic id=" + getId(), localException);
    }
    this.aB = localbZA;
  }

  public int getId() {
    return this.aw;
  }

  public bZA F() {
    return this.aB;
  }

  final dKY re(int paramInt) {
    return (dKY)this.fHL.get(paramInt);
  }

  public final int getParamCount() {
    return this.fHL.size();
  }

  public ArrayList bCI() {
    return this.fHL;
  }

  public String getErrorMessage() {
    return this.gez;
  }

  protected void iS(String paramString) {
    this.gez = paramString;
  }

  protected abstract void yB();

  public abstract boolean j(Su paramSu);

  public abstract boolean k(Su paramSu);
}