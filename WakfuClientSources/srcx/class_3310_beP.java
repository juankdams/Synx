import com.ankamagames.wakfu.client.binaryStorage.ChaosParamBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.GenericActivableInteractiveElementParamBinaryData;

final class beP
  implements gd
{
  public void a(GenericActivableInteractiveElementParamBinaryData paramGenericActivableInteractiveElementParamBinaryData)
  {
    ChaosParamBinaryData localChaosParamBinaryData = paramGenericActivableInteractiveElementParamBinaryData.gD();
    int i = TO.a(localChaosParamBinaryData);
    aPb localaPb = TO.b(localChaosParamBinaryData);

    bZI localbZI = new bZI(paramGenericActivableInteractiveElementParamBinaryData.getId(), localaPb, i, a(paramGenericActivableInteractiveElementParamBinaryData.aiR()));

    aKY.epr.a(localbZI);
  }

  private bpU[] a(alZ[] paramArrayOfalZ) {
    bpU[] arrayOfbpU = new bpU[paramArrayOfalZ.length];

    int i = 0;
    int j = 0; for (int k = paramArrayOfalZ.length; j < k; j++) {
      alZ localalZ = paramArrayOfalZ[j];
      arrayOfbpU[j] = new bpU(localalZ.getId(), localalZ.gC(), localalZ.ayN(), localalZ.ayO(), localalZ.ayP(), localalZ.ahA(), a(localalZ.ayQ(), i));

      i += arrayOfbpU[j].byT().length;
    }
    return arrayOfbpU;
  }

  private bzS[] a(xf[] paramArrayOfxf, int paramInt) {
    bzS[] arrayOfbzS = new bzS[paramArrayOfxf.length];

    int i = 0; for (int j = paramArrayOfxf.length; i < j; i++) {
      xf localxf = paramArrayOfxf[i];
      arrayOfbzS[i] = new bzS(localxf.getId(), paramInt + i, localxf.getWeight(), localxf.uL(), a(localxf.Gj()));
    }

    return arrayOfbzS;
  }

  private cfc[] a(cta[] paramArrayOfcta) {
    cfc[] arrayOfcfc = new cfc[paramArrayOfcta.length];

    int i = 0; for (int j = paramArrayOfcta.length; i < j; i++) {
      cta localcta = paramArrayOfcta[i];
      arrayOfcfc[i] = new cfc(localcta.eo(), localcta.chY(), localcta.uL(), localcta.chZ());
    }

    return arrayOfcfc;
  }
}