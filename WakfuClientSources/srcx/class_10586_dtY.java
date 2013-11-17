import java.util.ArrayList;

public class dtY
{
  public static void aR(gA paramgA)
  {
    aEe localaEe = new aEe(bU.fH().getString("item.unDroppable", new Object[] { Short.valueOf(paramgA.nP()), ceb.ag(paramgA) }));
    localaEe.mm(3);
    CM.LV().a(localaEe);
  }

  public static void aS(gA paramgA)
  {
    aEe localaEe = new aEe(bU.fH().getString("item.unDeletable"));
    localaEe.mm(3);
    CM.LV().a(localaEe);
  }

  public static void ah(ArrayList paramArrayList) {
    d(paramArrayList, 4);
  }

  public static void d(ArrayList paramArrayList, int paramInt) {
    aEe localaEe = new aEe(bU.fH().getString("item.selfLoot", new Object[] { ai(paramArrayList) }));
    localaEe.mm(paramInt);
    CM.LV().a(localaEe);
  }

  private static String ai(ArrayList paramArrayList) {
    String str = "";
    int i = 1;
    for (gA localgA : paramArrayList) {
      if (i == 0) {
        str = str + ", ";
      }
      str = str + bU.fH().getString("item.quantity", new Object[] { Short.valueOf(localgA.nP()), ceb.ag(localgA) });
      i = 0;
    }
    return str;
  }

  public static void aT(gA paramgA) {
    a(paramgA, 4);
  }

  public static void a(gA paramgA, int paramInt) {
    a(paramgA, paramgA.nP(), paramInt);
  }

  public static void k(gA paramgA, short paramShort) {
    a(paramgA, paramShort, 4);
  }

  public static void a(gA paramgA, short paramShort, int paramInt) {
    aEe localaEe = new aEe(bU.fH().getString("item.selfLoot", new Object[] { bU.fH().getString("item.quantity", new Object[] { Short.valueOf(paramShort), ceb.ag(paramgA) }) }));
    localaEe.mm(paramInt);
    CM.LV().a(localaEe);

    aU(paramgA);
  }

  public static void aj(ArrayList paramArrayList) {
    e(paramArrayList, 4);
  }

  public static void e(ArrayList paramArrayList, int paramInt) {
    aEe localaEe = new aEe(bU.fH().getString("item.selfDrop", new Object[] { ai(paramArrayList) }));
    localaEe.mm(paramInt);
    CM.LV().a(localaEe);
  }

  public static void b(gA paramgA, int paramInt) {
    b(paramgA, paramgA.nP(), paramInt);
  }

  public static void H(int paramInt, short paramShort) {
    gA localgA = Hh.QM().eO(paramInt);
    b(localgA, paramShort, 4);
  }

  public static void l(gA paramgA, short paramShort) {
    b(paramgA, paramShort, 4);
  }

  public static void b(gA paramgA, short paramShort, int paramInt)
  {
    aEe localaEe = new aEe(bU.fH().getString("item.selfDrop", new Object[] { bU.fH().getString("item.quantity", new Object[] { Short.valueOf(paramShort), ceb.ag(paramgA) }) }));
    localaEe.mm(paramInt);
    CM.LV().a(localaEe);
  }

  public static void aU(gA paramgA) {
    if (paramgA != null)
      k(paramgA.oi());
  }

  public static void a(int paramInt, cqz paramcqz, byte paramByte)
  {
    bBn localbBn = Hh.QM().dh(paramInt);
    if ((localbBn != null) && (paramcqz != null))
      a(localbBn, paramcqz, paramByte);
  }

  public static void k(bBn parambBn)
  {
    byz localbyz = byv.bFN().bFO();
    cew localcew = localbyz.aeL();
    if (!localcew.isVisible()) {
      return;
    }

    a(parambBn, localcew, localbyz.xK());
  }

  private static void a(bBn parambBn, cqz paramcqz, byte paramByte) {
    dVG localdVG = new dVG();

    int i = paramByte == 0 ? parambBn.oc() : parambBn.od();
    doc localdoc = new doc(ay.bd().u(i), 32, 32, localdVG, 3000);
    localdoc.a(paramcqz);

    int j = dbI.cNt().b(paramcqz, 4);
    localdoc.pu(j * 500);

    dbI.cNt().a(localdoc);
  }
}