import org.apache.log4j.Logger;

public class ID extends ws
{
  private static final Logger K = Logger.getLogger(ID.class);

  public ID(bKu parambKu) {
    super(parambKu);
  }

  public void aM(long paramLong) {
    bKu localbKu = Fz();
    if (localbKu == null) {
      K.error("Propriétaire d'un item à xp inconnu !");
      return;
    }
    dHJ localdHJ = localbKu.nL();
    long l1 = localdHJ.ayX();
    int i = localdHJ.nU();

    super.aM(paramLong);

    long l2 = localdHJ.ble().hR(localdHJ.nU() + 1) - paramLong;
    String str1 = ((gA)Fz()).oi().getName();
    int j = localdHJ.nU() - i;
    long l3 = paramLong - l1;

    String str2 = bU.fH().getString("infoPop.xpGain", new Object[] { str1, Long.valueOf(l3), Long.valueOf(l2), cPU.kAC, Integer.valueOf(j) });

    aEe localaEe = new aEe(str2.toString());
    localaEe.mm(4);
    CM.LV().a(localaEe);
  }
}