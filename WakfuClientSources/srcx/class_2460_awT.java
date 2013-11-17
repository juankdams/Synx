import java.util.ArrayList;
import java.util.EnumMap;
import org.apache.log4j.Logger;

public class awT
{
  protected static final Logger K = Logger.getLogger(awT.class);

  private final EnumMap dMi = new EnumMap(dFN.class);

  private final adz dMj = new adz();
  private final adz dMk = new adz();
  private final adz dMl = new adz();
  private final adz dMm = new adz();

  public awT() {
    this.dMi.put(dFN.lQe, this.dMj);
    this.dMi.put(dFN.lQf, this.dMk);
    this.dMi.put(dFN.lQh, this.dMl);
    this.dMi.put(dFN.lQg, this.dMm);
  }

  public void kL(int paramInt) {
    this.dMk.hL(paramInt);
  }

  public void kM(int paramInt) {
    this.dMj.hL(paramInt);
  }

  public void kN(int paramInt) {
    this.dMm.hL(paramInt);
  }

  public void kO(int paramInt) {
    this.dMl.hL(paramInt);
  }

  public boolean kP(int paramInt) {
    return this.dMk.contains(paramInt);
  }

  public boolean kQ(int paramInt) {
    return this.dMj.contains(paramInt);
  }

  public boolean kR(int paramInt) {
    return this.dMl.contains(paramInt);
  }

  public boolean kS(int paramInt) {
    return this.dMm.contains(paramInt);
  }

  public kr aIz() {
    return this.dMl.apz();
  }

  public kr aIA() {
    return this.dMj.apz();
  }

  public kr aIB() {
    return this.dMk.apz();
  }

  public boolean a(dFN paramdFN, int paramInt) {
    adz localadz = (adz)this.dMi.get(paramdFN);
    return (localadz == null) || (localadz.contains(paramInt));
  }

  public boolean kT(int paramInt) {
    return true;
  }

  public void clear()
  {
    this.dMj.clear();
    this.dMk.clear();
    this.dMl.clear();
    this.dMm.clear();

    this.dMj.n(aot.dtv.aAL());
  }

  public void a(vz paramvz)
  {
    for (kr localkr = this.dMj.apz(); localkr.hasNext(); ) {
      localObject = new bnO();
      ((bnO)localObject).fGY = localkr.next();
      paramvz.bjP.add(localObject);
    }
    Object localObject;
    for (localkr = this.dMk.apz(); localkr.hasNext(); ) {
      localObject = new cZq();
      ((cZq)localObject).kMV = localkr.next();
      paramvz.bjQ.add(localObject);
    }
    for (localkr = this.dMl.apz(); localkr.hasNext(); ) {
      localObject = new ciS();
      ((ciS)localObject).hIk = localkr.next();
      paramvz.bjR.add(localObject);
    }
    for (localkr = this.dMm.apz(); localkr.hasNext(); ) {
      localObject = new aAE();
      ((aAE)localObject).dTz = localkr.next();
      paramvz.bjS.add(localObject);
    }
  }

  public final void b(vz paramvz) {
    for (int i = 0; i < paramvz.bjP.size(); i++)
      this.dMj.hL(((bnO)paramvz.bjP.get(i)).fGY);
    for (i = 0; i < paramvz.bjQ.size(); i++)
      this.dMk.hL(((cZq)paramvz.bjQ.get(i)).kMV);
    for (i = 0; i < paramvz.bjS.size(); i++)
      this.dMm.hL(((aAE)paramvz.bjS.get(i)).dTz);
    for (i = 0; i < paramvz.bjR.size(); i++)
      this.dMl.hL(((ciS)paramvz.bjR.get(i)).hIk);
  }
}