import java.nio.ByteBuffer;

public abstract class PU extends cMb
  implements EA
{
  private long bkK;
  private aRX cit;
  private final cCH kC = new dnR(this);

  protected abstract void R(ByteBuffer paramByteBuffer);

  public final long sN()
  {
    return this.bkK;
  }

  public boolean sI()
  {
    return true;
  }

  public void bc()
  {
    super.bc();
    this.cit = null;
    sR().bOw();
  }

  public void aJ()
  {
    super.aJ();
    a(XV.cIz);
    this.bkK = 0L;
    sR().clear();
    this.cGk.reset();
    if ((!bB) && (this.cit != null)) throw new AssertionError(); 
  }

  public boolean sQ()
  {
    throw new UnsupportedOperationException();
  }

  public void sP() {
    throw new UnsupportedOperationException();
  }

  protected final cCH ak()
  {
    return this.kC;
  }

  protected cCH abF() {
    return cCH.ivi;
  }

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    if ((paramdJO == dJO.lVS) || (paramdJO == dJO.lVW) || (paramdJO == dJO.lVY)) {
      a(paramdJO);
      return true;
    }
    return false;
  }

  public final dJO[] eS()
  {
    dJO[] arrayOfdJO1 = abG();
    dJO[] arrayOfdJO2 = new dJO[3 + arrayOfdJO1.length];
    arrayOfdJO2[0] = dJO.lVW;
    arrayOfdJO2[1] = dJO.lVS;
    arrayOfdJO2[2] = dJO.lVY;
    System.arraycopy(arrayOfdJO1, 0, arrayOfdJO2, 3, arrayOfdJO1.length);
    return arrayOfdJO2;
  }

  protected abstract dJO[] abG();

  public final csx[] am() {
    csx[] arrayOfcsx1 = abH();
    byz localbyz = byv.bFN().bFO();
    if ((sN() != localbyz.getId()) && (!deV.jF(this.bkK)))
      return arrayOfcsx1;
    csx[] arrayOfcsx2 = new csx[3 + arrayOfcsx1.length];
    arrayOfcsx2[0] = aiI.dfS.avt();
    arrayOfcsx2[1] = aiI.dfU.avt();
    arrayOfcsx2[2] = aiI.dfV.avt();
    System.arraycopy(arrayOfcsx1, 0, arrayOfcsx2, 3, arrayOfcsx1.length);
    return arrayOfcsx2;
  }

  protected abstract csx[] abH();

  public final void a(btq parambtq) {
    throw new UnsupportedOperationException("Pas de persistance des données des RoomContent dans le client");
  }

  public final boolean b(btq parambtq) {
    n(new cYk(parambtq.boH, parambtq.boI, parambtq.boJ));
    c(CG.eu(parambtq.boK));

    a(parambtq.gbX);
    return true;
  }

  public boolean a(aqA paramaqA) {
    return true;
  }

  protected abstract void a(Dy paramDy);

  public void a(aRX paramaRX) {
    this.cit = paramaRX;
  }

  public EA xN() {
    return this;
  }

  public EA abI() {
    return this;
  }

  public void a(wW paramwW)
  {
  }
}