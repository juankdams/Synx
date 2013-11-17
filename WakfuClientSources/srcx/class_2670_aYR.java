import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class aYR extends dKc
{
  private static final Logger K = Logger.getLogger(aYR.class);
  private static final boolean DEBUG = false;
  private static final int[] feS = { byn.jq("Stool") };
  private final Su feT;
  private cTf feU;
  private aNA feV;
  private aNA feW;
  private aNA feX;

  public aYR(Su paramSu, cTf paramcTf)
  {
    this.feT = paramSu;
    this.feU = paramcTf;
  }

  public aYR(Su paramSu) {
    this.feT = paramSu;
    this.feU = null;
  }

  public short fU() {
    return 16;
  }

  public boolean fV() {
    return true;
  }

  public void a(cTf paramcTf)
  {
    if (this.feU != null) {
      return;
    }
    this.feU = paramcTf;
    cew localcew = this.feT.aeL();
    d(localcew);
    e(localcew);
  }

  public void begin()
  {
    if (this.feT == this.bSY) {
      cqu.cpE().alK();
    }
    cew localcew = this.feT.aeL();
    this.feT.a(this);
    localcew.bIS();
    d(localcew);

    this.feW = new dnx(this, localcew);

    localcew.a(this.feW);
  }

  public boolean a(boolean paramBoolean1, boolean paramBoolean2)
  {
    cew localcew = this.feT.aeL();
    if (this.feW != null) {
      if (!paramBoolean1) {
        return false;
      }
      this.feW.a(localcew);
      fW();
    }
    if (this.feX != null) {
      if (!paramBoolean1) {
        return false;
      }
      this.feX.a(localcew);
    }
    a(this.feT.aeL(), bnU());

    if (this.feT == this.bSY) {
      cy((byte)3);
    }
    return true;
  }

  public final void c(aNA paramaNA)
  {
    if (this.feT == this.bSY) {
      this.feV = paramaNA;
      cy((byte)2);
    }
  }

  public boolean fW()
  {
    cew localcew = this.feT.aeL();

    if (localcew.caw() == dFc.dgE()) {
      return true;
    }

    djm localdjm = bnU();
    if (localdjm != null)
      localdjm.setVisible(false);
    CG localCG;
    if (this.feU != null) {
      localcew.eq(this.feU.bTI() + "-Fin");
      localCG = this.feU.cIU() ? this.feU.E() : this.feU.E().LS();
    } else {
      localCG = CG.bFG;
    }

    cYk localcYk = this.feU.ML();
    localcew.k(localcYk.getX() + localCG.hY, localcYk.getY() + localCG.hZ, localcYk.IB());

    this.feX = new dnz(this, localdjm, localcew, localCG);

    localcew.a(new dny(this, localcew));

    localcew.a(this.feX);
    return false;
  }

  private void cy(byte paramByte) {
    ayC localayC = new ayC();
    localayC.bt(paramByte);
    localayC.aS((short)16);
    byv.bFN().aJK().d(localayC);
  }

  private static void a(cew paramcew, CG paramCG, String paramString)
  {
    paramcew.c(paramCG);
    paramcew.er("-Assis");
    paramcew.eq(paramString + "-Debut");
    paramcew.es(paramString);
  }

  public void a(cew paramcew, djm paramdjm)
  {
    this.feT.b(null);

    CG localCG = CG.bFG;
    if (paramdjm != null) {
      localObject = paramdjm.atx();
      if (localObject != null) {
        paramcew.c((Anm)localObject, feS);
      }
      paramdjm.setVisible(true);
      localCG = this.feU.cIU() ? paramdjm.E() : paramdjm.E().LS();
    }

    paramcew.es("AnimStatique");
    paramcew.er(null);
    paramcew.a(dFc.dgE());
    this.feU.cIR();

    Object localObject = this.feU.ML();
    int i = ((cYk)localObject).getX() + localCG.hY;
    int j = ((cYk)localObject).getY() + localCG.hZ;
    short s = ((cYk)localObject).IB();
    int k = cwO.U(i, j, s);
    paramcew.k(i, j, k);
  }

  private djm bnU() {
    if (this.feU == null) {
      K.error("pas de banc pour le player: " + this.feT.toString());
      return null;
    }
    Collection localCollection = this.feU.sL();
    if (localCollection.isEmpty()) {
      return null;
    }
    return (djm)localCollection.iterator().next();
  }

  public boolean h(bKm parambKm) {
    String str1 = parambKm.aeL().ata();
    String str2 = this.feU.bTI();
    return (str1.equals(str2 + "-Debut")) || (str1.equals(str2 + "-Fin"));
  }

  private void d(cew paramcew)
  {
    djm localdjm = bnU();
    this.feT.b(localdjm);

    CG localCG1 = localdjm.E();

    String str = this.feU.bTI();
    CG localCG2 = this.feU.cIU() ? localCG1.LS() : localCG1;
    a(paramcew, localCG2, str);
    paramcew.a(dsG.cYZ());

    cYk localcYk = this.feU.ML();
    int i = localCG2.hY;
    int j = localCG2.hZ;
    paramcew.k(localcYk.getX() - i, localcYk.getY() - j, localcYk.IB());

    bnV();
    localdjm.setVisible(false);
  }

  public final void bnV() {
    djm localdjm = bnU();
    if (localdjm == null) {
      K.error("pas de vue pour le banc pour assoir " + this.feT.toString());
      return;
    }
    cew localcew = this.feT.aeL();
    localcew.a(localdjm.atx(), feS);
  }

  private void e(cew paramcew) {
    paramcew.c(this.feU.E());
    paramcew.k(this.feU.ML().getX(), this.feU.ML().getY(), this.feU.ML().IB());
    paramcew.eq(paramcew.atp());
  }

  public boolean ga()
  {
    return (this.feW == null) && (this.feX == null);
  }

  public void b(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    long l = localByteBuffer.getLong();

    if ((this.feU != null) && (this.feU.getId() != l)) {
      K.error("stoolId différent ");
      this.feU = null;
    }

    if (this.feU != null) {
      return;
    }
    try
    {
      cTf localcTf = (cTf)ayg.aJQ().dw(l);
      if (localcTf != null)
        a(localcTf);
    }
    catch (Exception localException) {
      K.error("", localException);
    }
  }
}