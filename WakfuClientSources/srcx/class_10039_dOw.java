import org.apache.log4j.Logger;

public class dOw extends dKc
{
  private static final Logger K = Logger.getLogger(dOw.class);
  private cQj fNF;

  public void a(cQj paramcQj)
  {
    this.fNF = paramcQj;
    if (this.bSY == null)
      this.bSY = byv.bFN().bFO();
  }

  public short fU()
  {
    return 15;
  }

  public boolean fV() {
    return true;
  }

  public void begin() {
    K.info("Lancement de l'occupation READ_BOARD");

    this.bSY.q(false, true);

    this.fNF.cHe();

    this.bSY.a(this);
  }

  public boolean a(boolean paramBoolean1, boolean paramBoolean2)
  {
    return fW();
  }

  public boolean fW() {
    this.fNF.cHf();
    return true;
  }
}