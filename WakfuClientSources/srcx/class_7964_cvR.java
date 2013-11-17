import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class cvR extends dKf
{
  private static final Logger K = Logger.getLogger(cvR.class);
  private long ihp;
  private cYk cGk;

  public cvR(int paramInt)
  {
    super(paramInt);
  }

  public void c(String[] paramArrayOfString)
  {
    this.ihp = Long.parseLong(paramArrayOfString[0]);
  }

  private static boolean Ju() {
    byz localbyz = byv.bFN().bFO();
    return localbyz.bHa() == localbyz.bHb();
  }

  private static boolean aDj() {
    byz localbyz = byv.bFN().bFO();
    int i = localbyz.Lk();
    bMG localbMG = localbyz.bSt();
    int j = localbMG.CF();
    brW localbrW = ars.dzL.jG(j);
    if (localbrW == null)
      return false;
    return localbrW.arI() == i;
  }

  private TM Jw() {
    if (Ju()) {
      return cHX.cCk();
    }

    return OX.aaQ();
  }

  public boolean f(gA paramgA)
  {
    boolean bool = aDj();
    if ((!Ju()) && (!bool))
    {
      localObject1 = bU.fH().getString("error.deploy.notInBag");
      CM.LV().f((String)localObject1, 3);
      return false;
    }

    Object localObject1 = Jw();
    if (byv.bFN().c((cvW)localObject1)) {
      byv.bFN().b((cvW)localObject1);
      return false;
    }

    cMb localcMb = acs.aoN().cB(this.ihp);
    if (localcMb == null) {
      K.error("TemplateId=" + this.ihp + " inconnu");
      return false;
    }

    if (((localcMb instanceof XQ)) && (bool)) {
      localObject2 = bU.fH().getString("error.cannotDeployMerchantDisplayInHavenWorld");
      CM.LV().f((String)localObject2, 3);
      localcMb.release();
      return false;
    }

    localcMb.D(false);
    localcMb.sM();
    for (Object localObject2 = localcMb.sL().iterator(); ((Iterator)localObject2).hasNext(); ) { abc localabc = (abc)((Iterator)localObject2).next();
      if ((localabc instanceof ob)) {
        ob localob = (ob)localabc;
        bVl.caZ().b(localob);
      }
    }
    localObject2 = localcMb.xN();
    ((TM)localObject1).a((EA)localObject2);
    ((TM)localObject1).b(new te(this, localcMb, paramgA, (EA)localObject2));

    ((TM)localObject1).a(new tc(this, (TM)localObject1, localcMb));

    byv.bFN().a((cvW)localObject1);
    return true;
  }

  public void a(long paramLong, cYk paramcYk) {
    this.cGk = paramcYk;
    bZ(paramLong);
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    super.g(paramByteBuffer);
    paramByteBuffer.putInt(this.cGk.getX());
    paramByteBuffer.putInt(this.cGk.getY());
    paramByteBuffer.putShort(this.cGk.IB());
    return true;
  }

  public int O() {
    return super.O() + 4 + 4 + 2;
  }

  public void clear() {
    this.cGk = null;
  }
}