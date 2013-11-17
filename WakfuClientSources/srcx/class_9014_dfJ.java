import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class dfJ
  implements cvW
{
  protected static final Logger K = Logger.getLogger(dfJ.class);

  private static dfJ lab = new dfJ();

  public static dfJ cPu()
  {
    return lab;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
  }

  public boolean a(cWG paramcWG) {
    bva localbva = byv.bFN().bFO().bHn();
    Object localObject1;
    Object localObject3;
    Object localObject2;
    switch (paramcWG.getId())
    {
    case 12600:
      localObject1 = (bID)paramcWG;

      int i = ((bID)localObject1).bPQ();

      localObject3 = ((bID)localObject1).bPO();
      byte[] arrayOfByte = ((bID)localObject1).bPP();

      acn localacn = acn.aoA();
      dcK localdcK = dcK.cOf();
      blo localblo = blo.bws();
      localacn.hE(i);
      localdcK.C(arrayOfByte);
      localblo.C((byte[])localObject3);
      localacn.aoC();

      ayn localayn = (ayn)localbva.boT();
      if (localayn != null) {
        aur localaur = localayn.aKu();
        dEw localdEw = localaur.aGA();
        ArrayList localArrayList = localblo.bwr();
        int j = 0; for (int k = localArrayList.size(); j < k; j++) {
          int m = ((acy)localArrayList.get(j)).nn();
          btY localbtY = localdEw.I(m, true);
          if (localdEw == null) {
            K.error("On tente d'update le famille d'id=" + m + " alors qu'elle n'existe pas dans l'écosystème !!!");
          }
          else {
            localbtY.bCi();
          }
        }
      }
      aWc.blo().blH();

      boolean bool = (localdcK.cOe().size() > 0) && (localblo.bwr().size() > 0);

      dLE.doY().t("wakfuEcosystemEnabled", Boolean.valueOf(bool));

      dLE.doY().t("wakfuGlobalZoneManager", acn.aoA());
      dLE.doY().a(acn.aoA(), new String[] { "protectorSatisfaction", "protectorSatisfactionColor" });

      return false;
    case 9504:
      localObject1 = (bsH)paramcWG;

      localObject2 = new cIB();

      ((cIB)localObject2).a(((bsH)localObject1).bAK(), ((bsH)localObject1).bAL(), ((bsH)localObject1).bAM(), ((bsH)localObject1).bAN(), ((bsH)localObject1).bAO(), ((bsH)localObject1).bAP(), ((bsH)localObject1).bAQ());

      ((cIB)localObject2).a(((bsH)localObject1).bAH() + ((bsH)localObject1).bAM(), 0.0F, 0.0F, 0.0F, null, ((bsH)localObject1).bAJ(), ((bsH)localObject1).bAI(), 0.0F, ((bsH)localObject1).bxz(), 0.0F);

      if (localbva != null) {
        localObject3 = (ayn)localbva.boT();
        ((cIB)localObject2).h((ayn)localObject3);
      }
      else {
        K.error("Réception d'informations de meteo wakfu hors d'un territoire : étrange");
      }

      return false;
    case 9602:
      localObject1 = (aNC)paramcWG;

      localObject2 = ((aNC)localObject1).bem();

      if ((localObject2 != null) && (localObject2.length > 0)) {
        localObject3 = new bbi();
        ((bbi)localObject3).aq(ByteBuffer.wrap((byte[])localObject2));
        sS.Al().b((bbi)localObject3);
      }
      return false;
    }

    return true;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }
}