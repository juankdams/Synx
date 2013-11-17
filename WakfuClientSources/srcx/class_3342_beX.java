import com.ankamagames.wakfu.client.binaryStorage.CollectInteractiveElementParamBinaryData;

final class beX
  implements gd
{
  public void a(CollectInteractiveElementParamBinaryData paramCollectInteractiveElementParamBinaryData)
  {
    int i = paramCollectInteractiveElementParamBinaryData.getId();
    int j = paramCollectInteractiveElementParamBinaryData.gC();
    short s = paramCollectInteractiveElementParamBinaryData.abQ();
    boolean bool = paramCollectInteractiveElementParamBinaryData.isLocked();
    int k = paramCollectInteractiveElementParamBinaryData.abT();
    Qb localQb = new Qb(i, j, s, bool, k);
    aKY.epr.a(localQb);
    for (dac localdac : paramCollectInteractiveElementParamBinaryData.cPq())
      localQb.al(localdac.gw(), localdac.cMD());
  }
}