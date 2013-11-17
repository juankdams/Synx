import java.util.Collection;

abstract class aZQ
  implements EA
{
  protected final cMb fgT;
  private long bkK;

  aZQ(cMb paramcMb)
  {
    this.fgT = paramcMb;
  }

  public duc sR() {
    return this.fgT.sR();
  }

  public final void a(wW paramwW) {
    this.bkK = paramwW.ayt;
    this.fgT.ML().ac(paramwW.boH, paramwW.boI, paramwW.boJ);
    this.fgT.c(CG.eu(paramwW.boK));
  }

  public void a(btq parambtq) {
    throw new UnsupportedOperationException("Pas de persistance des données des RoomContent dans le client");
  }

  public final boolean b(btq parambtq) {
    this.fgT.n(new cYk(parambtq.boH, parambtq.boI, parambtq.boJ));
    this.fgT.c(CG.eu(parambtq.boK));

    a(parambtq.gbX);
    return true;
  }

  protected abstract void a(Dy paramDy);

  public int fa() {
    return this.fgT.fa();
  }

  public int fb() {
    return this.fgT.fb();
  }

  public short fc() {
    return this.fgT.fc();
  }

  public boolean sQ() {
    throw new UnsupportedOperationException();
  }

  public void sP() {
    throw new UnsupportedOperationException();
  }

  public boolean sO() {
    return this.fgT.sO();
  }

  public long sN() {
    return this.bkK;
  }

  public void sM() {
    this.fgT.sM();
  }

  public void a(aRX paramaRX) {
  }

  public Collection sL() {
    return this.fgT.sL();
  }

  public void D(boolean paramBoolean) {
    this.fgT.D(paramBoolean);
  }

  public final dJO[] eS() {
    dJO[] arrayOfdJO1 = this.fgT.eS();
    dJO[] arrayOfdJO2 = new dJO[3 + arrayOfdJO1.length];
    arrayOfdJO2[0] = dJO.lVW;
    arrayOfdJO2[1] = dJO.lVS;
    arrayOfdJO2[2] = dJO.lVY;
    System.arraycopy(arrayOfdJO1, 0, arrayOfdJO2, 3, arrayOfdJO1.length);
    return arrayOfdJO2;
  }

  public final csx[] am() {
    csx[] arrayOfcsx1 = this.fgT.am();
    byz localbyz = byv.bFN().bFO();
    if ((this.bkK != localbyz.getId()) && (!deV.jF(this.bkK)))
      return arrayOfcsx1;
    csx[] arrayOfcsx2 = new csx[3 + arrayOfcsx1.length];
    arrayOfcsx2[0] = aiI.dfS.avt();
    arrayOfcsx2[1] = aiI.dfU.avt();
    arrayOfcsx2[2] = aiI.dfV.avt();
    System.arraycopy(arrayOfcsx1, 0, arrayOfcsx2, 3, arrayOfcsx1.length);
    return arrayOfcsx2;
  }

  public boolean a(dJO paramdJO, bhL parambhL) {
    if ((paramdJO == dJO.lVS) || (paramdJO == dJO.lVW) || (paramdJO == dJO.lVY)) {
      this.fgT.a(paramdJO);
      return true;
    }
    return false;
  }

  public void release() {
    this.fgT.release();
  }

  public boolean a(aqA paramaqA) {
    return true;
  }
}