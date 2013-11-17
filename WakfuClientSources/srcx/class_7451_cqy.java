public abstract class cqy
  implements cvW
{
  private final cSR iap;

  protected cqy(dFU[] paramArrayOfdFU)
  {
    int i = paramArrayOfdFU.length;
    this.iap = new cSR(i);

    for (int j = 0; j < i; j++) {
      dFU localdFU = paramArrayOfdFU[j];
      if (this.iap.put(localdFU.vN(), localdFU) != null)
        throw new IllegalArgumentException("Il existe déjà un traitement de message pour le message " + localdFU.vN());
    }
  }

  public final boolean a(cWG paramcWG)
  {
    dFU localdFU = (dFU)this.iap.get(paramcWG.getId());
    return (localdFU == null) || (localdFU.b(paramcWG));
  }

  protected final void T(dGy paramdGy) {
    this.iap.s(paramdGy);
  }
}