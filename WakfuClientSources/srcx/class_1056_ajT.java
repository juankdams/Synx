import java.util.ArrayList;
import org.apache.log4j.Logger;

public class ajT
{
  private static final Logger K = Logger.getLogger(ajT.class);

  private static final ajT djD = new ajT();

  private ArrayList djE = new ArrayList();
  private ArrayList djF = new ArrayList();
  private ArrayList aBf = new ArrayList();
  private final ArrayList djG = new ArrayList();
  private dQZ djH;

  public static ajT axh()
  {
    return djD;
  }

  public void a(dQZ paramdQZ)
  {
    this.aBf.add(paramdQZ);
  }

  public void a(dQZ paramdQZ, boolean paramBoolean)
  {
    this.aBf.remove(paramdQZ);
    if ((paramBoolean) && (paramdQZ.ws()))
      for (int i = this.djG.size() - 1; i >= 0; i--)
        ((aeG)this.djG.get(i)).cancel();
  }

  public void a(aeG paramaeG)
  {
    this.djG.add(paramaeG);
  }

  public void b(aeG paramaeG) {
    this.djG.remove(paramaeG);
  }

  public void a(bDI parambDI) {
    this.djE.add(parambDI);
  }

  public void b(bDI parambDI) {
    this.djE.remove(parambDI);
  }

  public void b(dOc paramdOc, int paramInt1, int paramInt2)
  {
    for (dQZ localdQZ : this.aBf)
      if (localdQZ.a(paramdOc, paramInt1, paramInt2)) {
        this.djH = localdQZ;
        this.djH.select(paramInt1, paramInt2);
        this.djF.clear();
        for (bDI localbDI : this.djE)
          if (localbDI.am(this.djH.getValue()))
            this.djF.add(localbDI);
        return;
      }
  }

  public boolean c(dOc paramdOc, int paramInt1, int paramInt2)
  {
    if (this.djH != null) {
      this.djH.a(paramInt1, paramInt2, paramdOc);
      for (bDI localbDI : this.djF)
        localbDI.a(this.djH, paramInt1, paramInt2, paramdOc);
      return true;
    }

    return false;
  }

  public void d(dOc paramdOc, int paramInt1, int paramInt2)
  {
    if (this.djH != null) {
      this.djH.b(paramInt1, paramInt2, paramdOc);
      for (bDI localbDI : this.djF)
        localbDI.b(this.djH, paramInt1, paramInt2, paramdOc);
      this.djH = null;
    }
  }

  public void cancel() {
    if (this.djH != null) {
      this.djH.clean();
      this.djH = null;
    }
  }

  public void cleanUp() {
    this.djH = null;
  }
}