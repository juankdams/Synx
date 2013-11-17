import org.apache.log4j.Logger;

public final class aMN
  implements cvW
{
  private static final Logger K = Logger.getLogger(aMN.class);

  private static aMN esp = new aMN();

  final bES dKb = new bES();
  private arl esq;

  private aMN()
  {
    bdP();
    aHu();
  }

  public static aMN bdO() {
    return esp;
  }

  private void bdP() {
    bIP.a(8104, this.dKb);
    bIP.a(8100, this.dKb);
    bIP.a(8300, this.dKb);
  }

  private void aHu() {
    blJ.a(202, this.dKb);
    blJ.a(8010, this.dKb);
    blJ.a(8304, this.dKb);
    blJ.a(8106, this.dKb);
    blJ.a(8108, this.dKb);
    blJ.a(8014, this.dKb);
    blJ.a(8302, this.dKb);
    blJ.a(4300, this.dKb);
    blJ.a(8028, this.dKb);
    blJ.a(8002, this.dKb);
    blJ.a(8110, this.dKb);
    blJ.a(8116, this.dKb);
    blJ.a(4122, this.dKb);
    blJ.a(8200, this.dKb);
  }

  public void f(arl paramarl) {
    this.esq = paramarl;
    this.dKb.e(paramarl);
  }

  public boolean a(cWG paramcWG) {
    if (this.esq == null) {
      K.error("[FIGHT] La NetSpectatorFightFrame reçoit un message a traiter alors qu'aucun combat ne lui est associé : " + paramcWG.getClass().getSimpleName());

      return true;
    }

    if (((paramcWG instanceof dWi)) && 
      (((dWi)paramcWG).a() != this.esq.getId())) {
      return true;
    }

    return this.dKb.a(paramcWG);
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }
}