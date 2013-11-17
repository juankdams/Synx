import org.apache.log4j.Logger;

public class ckt extends dDO
{
  private static final Logger K = Logger.getLogger(ckt.class);
  private final short hLA;
  private final short hLB;

  public ckt(cbR paramcbR, short paramShort1, short paramShort2)
  {
    super(paramcbR);
    this.hLA = paramShort1;
    this.hLB = paramShort2;
  }

  public dtv pI() {
    return dtv.lwj;
  }

  public void a(aIJ paramaIJ) {
    paramaIJ.b(((cbR)this.bOP).cfy());
  }

  public void a(aLD paramaLD) {
    paramaLD.b(this.bOP);
    aXL localaXL = ((cbR)this.bOP).cfy();
    paramaLD.a(new bFA(localaXL.gv(), localaXL.bmU(), localaXL.gw(), this.hLA, this.hLB));
  }

  public void b(aLD paramaLD)
  {
    aXL localaXL = ((cbR)this.bOP).cfy();
    paramaLD.a(new bFA(localaXL.gv(), localaXL.bmU(), localaXL.gw(), localaXL.bmV(), localaXL.bmW()));
  }
}