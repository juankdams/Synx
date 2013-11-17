import org.apache.log4j.Logger;

public final class aUK
  implements cvW
{
  private static final Logger K = Logger.getLogger(aUK.class);

  private static aUK eVZ = new aUK();

  final bES dKb = new bES();
  private arl esq;

  public static aUK bjU()
  {
    return eVZ;
  }

  private aUK() {
    bjV();
    bjW();
  }

  private void bjV() {
    blJ.a(8200, this.dKb);
    blJ.a(8010, this.dKb);
    blJ.a(202, this.dKb);
    blJ.a(4300, this.dKb);
    blJ.a(8014, this.dKb);
    blJ.a(8002, this.dKb);
    blJ.a(8028, this.dKb);
    blJ.a(8304, this.dKb);
    blJ.a(8410, this.dKb);
    blJ.a(8106, this.dKb);
    blJ.a(4122, this.dKb);
    blJ.a(4123, this.dKb);
    blJ.a(8120, this.dKb);
    blJ.a(8124, this.dKb);
    blJ.a(8122, this.dKb);
    blJ.a(6200, this.dKb);
    blJ.a(8110, this.dKb);
    blJ.a(8116, this.dKb);
    blJ.a(8108, this.dKb);
    blJ.a(4506, this.dKb);
    blJ.a(4524, this.dKb);
    blJ.a(4528, this.dKb);
    blJ.a(4520, this.dKb);
    blJ.a(6204, this.dKb);
    blJ.a(4522, this.dKb);
    blJ.a(8302, this.dKb);
    blJ.a(8034, this.dKb);
    blJ.a(8033, this.dKb);
    blJ.a(8412, this.dKb);
  }

  private void bjW() {
    apA.a(8202, this.dKb);
    apA.a(8308, this.dKb);
    apA.a(4127, this.dKb);
    apA.a(8158, this.dKb);
    apA.a(8156, this.dKb);
    apA.a(4508, this.dKb);
    apA.a(8040, this.dKb);
    apA.a(8104, this.dKb);
    apA.a(8100, this.dKb);
    apA.a(4214, this.dKb);
    apA.a(8300, this.dKb);
    apA.a(8114, this.dKb);
    apA.a(8030, this.dKb);
    apA.a(8026, this.dKb);
    apA.a(8150, this.dKb);
    apA.a(8012, this.dKb);
    apA.a(8000, this.dKb);
    apA.a(4126, this.dKb);
    apA.a(4124, this.dKb);
    apA.a(4170, this.dKb);
    apA.a(5240, this.dKb);
    apA.a(8016, this.dKb);
    apA.a(8310, this.dKb);
  }

  public void f(arl paramarl) {
    this.esq = paramarl;
    this.dKb.e(paramarl);
  }

  public arl bjX() {
    return this.esq;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    f(null);
  }

  public boolean a(cWG paramcWG) {
    if (this.esq == null) {
      K.error("[FIGHT] La NetInFightManagementFrame reçoit un message a traiter alors qu'aucun combat ne lui est associé : " + paramcWG.getClass().getSimpleName());

      return true;
    }

    if (((paramcWG instanceof dWi)) && 
      (((dWi)paramcWG).a() != this.esq.getId())) {
      return true;
    }

    return this.dKb.a(paramcWG);
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }
}