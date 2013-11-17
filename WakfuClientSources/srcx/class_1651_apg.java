import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import java.util.ArrayList;
import org.apache.log4j.Logger;

class apg
{
  private static final Logger K = Logger.getLogger(apg.class);
  private static final float[] duY = bNa.gRx.bUT();
  private static final int duZ = 93606;

  static void a(aIJ paramaIJ, ArrayList paramArrayList)
  {
    paramaIJ.e(new dAF(paramArrayList));
  }

  private static String a(dde paramdde)
  {
    String str1 = bU.fH().b(126, paramdde.nc(), new Object[0]);
    lZ locallZ = new lZ();
    locallZ.a(str1);

    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = aDF.h(aDF.e(paramdde));
    if (localArrayList2 != null) {
      localArrayList1.addAll(localArrayList2);
    }
    paramdde.k(new dAH(localArrayList1));
    int i;
    if (!localArrayList1.isEmpty()) {
      i = aDF.g(paramdde) == aAb.dSs ? 1 : 0;
      for (String str2 : localArrayList1) {
        if (i == 0) {
          locallZ.a("\n").tI().am(auI.dHG.bUV());
        }
        locallZ.a(str2);
        if (i == 0) {
          locallZ.tJ();
        }
      }
    }

    return locallZ.toString();
  }

  private static avz b(dde paramdde) {
    aAb localaAb = aDF.g(paramdde);
    switch (dAG.lIk[localaAb.ordinal()]) {
    case 1:
      return dSP.mpg;
    case 2:
      return dSP.mph;
    case 3:
      return dSP.mpi;
    }
    K.error("etat du batiement incorrect " + localaAb);
    return null;
  }

  static void a(aIJ paramaIJ, aka paramaka)
  {
    Ah localAh = new Ah();
    paramaka.setMapDisplayer(localAh);
    a(paramaIJ, localAh.Jp());

    a(localAh);

    b(paramaIJ, paramaka);
  }

  private static void a(aIJ paramaIJ, EntityGroup paramEntityGroup) {
    aRa localaRa = aRa.eNR;

    aLD localaLD = new aLD();
    localaLD.aJ();
    localaLD.a(paramaIJ, localaRa);
    localaLD.setCurrentLayer(dmh.ljV);
    localaLD.getEntities(paramEntityGroup);
    a(paramEntityGroup, localaLD);

    localaLD.release();
  }

  private static void a(Ah paramAh) {
    uz localuz = bfH.bsR().jP(93606);
    dDq localdDq = new dDq(localuz, 0, 0, localuz.wn(0).getWidth(), localuz.wn(0).getHeight());
    bNa localbNa = new bNa(0, 0, 1, 1);
    paramAh.a(localdDq, localbNa);
  }

  private static void a(EntityGroup paramEntityGroup, aLD paramaLD) {
    cEl localcEl = paramaLD.getScreenCenter();
    cxn localcxn = new cxn();
    localcxn.b(localcEl.getX(), localcEl.getY(), 0.0F);
    paramEntityGroup.dsE().a(0, localcxn);
  }

  private static void b(aIJ paramaIJ, aka paramaka)
  {
    int i = paramaIJ.getWidth() * 9;
    int j = paramaIJ.getHeight() * 9;

    int k = i / 2 + paramaIJ.KU() * 9;
    int m = j / 2 + (paramaIJ.KV() - 3) * 9;
    paramaka.setForceDisplayEntity(true);

    int n = -(int)adG.aT(k, m);
    int i1 = -(int)adG.aU(k, m);

    int i2 = Math.max(i, j);
    int i3 = (int)(i2 * 86.0F);

    paramaka.setMapRect(n, i1, i3, i3 / 2);
  }
}