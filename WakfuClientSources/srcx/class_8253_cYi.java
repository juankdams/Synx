import org.apache.log4j.Logger;

public class cYi
  implements cvW
{
  protected static final Logger K = Logger.getLogger(cYi.class);

  private static final cYi kLH = new cYi();

  public static cYi cLH() {
    return kLH;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
      byv.bFN().b(arD.aDU());
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean)
      byv.bFN().a(arD.aDU());
  }

  public boolean a(cWG paramcWG)
  {
    byz localbyz = byv.bFN().bFO();
    Object localObject;
    aqa localaqa;
    gA localgA;
    switch (paramcWG.getId())
    {
    case 6010:
      localObject = (dkR)paramcWG;
      localaqa = aYP.feK.bnR();

      localgA = ((dkR)localObject).getItem();
      if (localaqa != null) {
        localaqa.bg(((dkR)localObject).bei());
        localaqa.a(((dkR)localObject).aFL(), localgA, ((dkR)localObject).bej());
        bQs.bXv().bXw();
      } else {
        K.error("Message d'ajout d'un item dans un echange reçu alors que le player ne possède pas d'échangeur actif");
      }
      return false;
    case 6012:
      localObject = (aNy)paramcWG;
      localaqa = aYP.feK.bnR();

      localgA = ((aNy)localObject).getItem();
      if (localaqa != null) {
        localaqa.bg(((aNy)localObject).bei());
        localaqa.b(((aNy)localObject).aFL(), localgA, ((aNy)localObject).bej());
        bQs.bXv().bXw();
      } else {
        K.error("Message de suppression d'un item dans un echange reçu alors que le player ne possède pas d'échangeur actif");
      }
      return false;
    case 6014:
      localObject = (cpf)paramcWG;
      localaqa = aYP.feK.bnR();
      if (localaqa != null) {
        localaqa.bg(((cpf)localObject).bei());
        localaqa.g(((cpf)localObject).aFL(), ((cpf)localObject).bDx());
        bQs.bXv().bXw();
      } else {
        K.error("Message de mise a jour de kamas dans un echange reçu alors que le player ne possède pas d'échangeur actif");
      }
      return false;
    case 6022:
      localObject = (cPL)paramcWG;
      localaqa = aYP.feK.bnR();

      if (localaqa != null)
        localaqa.o(((cPL)localObject).aFL(), ((cPL)localObject).gI());
      else {
        K.error("Message de validation d'un echange reçu alors que le player ne possède pas d'échangeur actif");
      }

      return false;
    case 6050:
      localObject = (SO)paramcWG;
      localaqa = aYP.feK.bnR();

      if (localaqa == null) {
        K.error("Message terminant un echange reçu alors que le player ne possède pas d'échangeur actif");
        return false;
      }

      switch (((SO)localObject).agd()) {
      case 0:
        localaqa.h(localaqa.aCk());
        break;
      case 1:
        localaqa.g(localaqa.aCk());
        break;
      case 2:
        localaqa.g(localaqa.aCl());
        break;
      case 3:
        localaqa.bPh();
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