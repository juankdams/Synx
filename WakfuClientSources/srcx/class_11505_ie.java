import org.apache.log4j.Logger;

public class ie extends dDO
{
  private static final Logger K = Logger.getLogger(ie.class);
  private final short aHE;

  public ie(bcQ parambcQ, short paramShort)
  {
    super(parambcQ);
    this.aHE = paramShort;
  }

  public dtv pI()
  {
    return dtv.lwh;
  }

  public void a(aIJ paramaIJ)
  {
    paramaIJ.j(((bcQ)this.bOP).bqO(), ((bcQ)this.bOP).bqP(), ((bcQ)this.bOP).bqQ());
  }

  public void a(aLD paramaLD) {
    cDs localcDs = ars.dzL.aP(this.aHE);
    if (localcDs != null) {
      paramaLD.b(localcDs, ((bcQ)this.bOP).bqO(), ((bcQ)this.bOP).bqP());
      paramaLD.refresh();
    }
  }

  public short pQ() {
    return this.aHE;
  }

  public void b(aLD paramaLD)
  {
  }
}