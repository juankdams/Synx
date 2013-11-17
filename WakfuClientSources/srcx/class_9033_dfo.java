public class dfo
{
  public static final String PACKAGE = "wakfu.pet";
  private static final int ktc = 0;
  private static final int ktd = 7;
  private static Cs kZz = new Cs();

  public static void validColorPreview(cSx paramcSx, ckV paramckV) {
    bzu localbzu = new bzu();
    localbzu.c(paramckV.cmF().oj());
    localbzu.d(19157);
    cjO.clE().j(localbzu);
  }

  public static void cancelColorPreview(cSx paramcSx) {
    bzu.cf((short)19156);
  }

  public static void dropColor(Qa paramQa, ckV paramckV) {
    if ((paramQa.getValue() != null) && ((paramQa.getValue() instanceof gA))) {
      byA.onDropItem();
      gA localgA = (gA)paramQa.getValue();
      if (!paramckV.nJ().cJh().AB(localgA.ok())) {
        return;
      }
      czW localczW = new czW();
      localczW.d(19155);
      localczW.setItem(localgA);
      localczW.c(paramckV.cmF().oj());
      cjO.clE().j(localczW);
    }
  }

  public static void dragEquipment(bvN parambvN, ckV paramckV) {
    if ((parambvN.getValue() != null) && ((parambvN.getValue() instanceof gA))) {
      gA localgA = (gA)parambvN.getValue();
      kZz.w(Long.valueOf(paramckV.cmF().oj()));
      kZz.x(Long.valueOf(localgA.oj()));
    }
  }

  public static void dropEquipment(Qa paramQa, ckV paramckV)
  {
    if ((paramQa.getValue() != null) && ((paramQa.getValue() instanceof gA))) {
      byA.onDropItem();
      gA localgA = (gA)paramQa.getValue();
      if (!paramckV.nJ().cJh().AA(localgA.ok())) {
        return;
      }
      czW localczW = new czW();
      localczW.setItem(localgA);
      localczW.c(paramckV.cmF().oj());
      localczW.d(19158);
      cjO.clE().j(localczW);
    }
  }

  public static void doubleClickEquipment(cSx paramcSx, ckV paramckV) {
    czW localczW = new czW();
    localczW.c(paramckV.cmF().oj());
    localczW.d(19159);
    cjO.clE().j(localczW);
  }

  public static void setPetName(cSx paramcSx, ckV paramckV, aTp paramaTp)
  {
    if ((paramcSx.mp() == CH.bGw) || ((paramcSx.mp() == CH.bGh) && (((ctH)paramcSx).getKeyCode() == 10)))
    {
      boolean bool = aYD.avC().eA(paramaTp.getText());
      if (bool) {
        aZb localaZb = new aZb(paramckV, 19153);
        localaZb.a(paramaTp.getText());
        cjO.clE().j(localaZb);
      } else {
        FJ.d("error.connection.nicknameInvalidContent", new Object[0]);
      }
    }
  }

  public static void changeDirection(dMr paramdMr, auC paramauC)
  {
    int i = paramdMr.getButton();
    if ((i != 1) && (i != 3)) {
      return;
    }
    int j = i == 1 ? -1 : 1;
    int k = (paramauC.getDirection() + j) % 8;
    if (k < 0)
      k = 7;
    paramauC.setDirection(k);

    paramauC.setDirection(k);
  }

  public static void feedPet(Qa paramQa)
  {
    ckV localckV = (ckV)dLE.doY().rv("pet");
    feedPet(paramQa, localckV);
  }

  public static void feedPet(Qa paramQa, ckV paramckV) {
    byA.onDropItem();
    Object localObject = paramQa.getValue();
    if ((localObject == null) || (!(localObject instanceof gA)) || (paramckV == null))
      return;
    bGY localbGY = new bGY(paramckV, (gA)localObject);
    cjO.clE().j(localbGY);
  }

  public static long getDraggedPetId() {
    Long localLong = (Long)kZz.getFirst();
    return localLong == null ? -1L : localLong.longValue();
  }

  public static long getDraggedItemId() {
    Long localLong = (Long)kZz.Lp();
    return localLong == null ? -1L : localLong.longValue();
  }

  public static void resetDraggedItemAndPetId() {
    kZz = new Cs();
  }
}