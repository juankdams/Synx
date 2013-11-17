import com.ankamagames.wakfu.client.binaryStorage.AvatarBreedBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.AvatarBreedColorsBinaryData;
import org.apache.log4j.Logger;

public class bDH
  implements asq
{
  private static final Logger K = Logger.getLogger(bDH.class);

  public void a(dnq paramdnq) {
    cze.cwb().a(new AvatarBreedBinaryData(), new axx(this));

    cze.cwb().a(new AvatarBreedColorsBinaryData(), new axu(this));

    paramdnq.c(this);
  }

  private void a(int paramInt, AvatarBreedColorsBinaryData paramAvatarBreedColorsBinaryData) {
    agt localagt = agt.arQ();

    for (aBR localaBR : paramAvatarBreedColorsBinaryData.yK()) {
      bXw localbXw = new bXw(localaBR.aNS(), localaBR.aNT(), localaBR.aNU(), localaBR.aNV(), localaBR.aNW(), a(localaBR.aNX()), a(localaBR.aNY()), a(localaBR.aNZ()));

      localagt.a(paramInt, localaBR.xK(), localbXw);
    }
  }

  private alz a(GH[] paramArrayOfGH) {
    alz localalz = new alz(paramArrayOfGH.length);
    for (int i = 0; i < paramArrayOfGH.length; i++) {
      GH localGH = paramArrayOfGH[i];
      localalz.a((byte)i, new aKG(i, localGH.QC(), localGH.QD(), localGH.QE()));
    }
    return localalz;
  }

  public String getName() {
    return bU.fH().getString("contentLoader.ground");
  }

  private static cen b(AvatarBreedBinaryData paramAvatarBreedBinaryData) {
    int i = paramAvatarBreedBinaryData.Nt();
    int j = paramAvatarBreedBinaryData.Nf();
    float[] arrayOfFloat = paramAvatarBreedBinaryData.Nv();
    byte[] arrayOfByte = paramAvatarBreedBinaryData.Nu();

    short s = arg.jE(paramAvatarBreedBinaryData.getId());

    cen localcen = new cen(i, j, arrayOfFloat, arrayOfByte, s);

    localcen.a(eu.ayM, paramAvatarBreedBinaryData.Nh());
    localcen.a(eu.ayN, paramAvatarBreedBinaryData.Ni());
    localcen.a(eu.ayO, paramAvatarBreedBinaryData.Nj());
    localcen.a(eu.azq, paramAvatarBreedBinaryData.Nl());
    localcen.a(eu.ayS, paramAvatarBreedBinaryData.Nm());
    localcen.a(eu.ayT, paramAvatarBreedBinaryData.Nn());
    localcen.a(eu.azr, paramAvatarBreedBinaryData.No());
    localcen.a(eu.ayQ, paramAvatarBreedBinaryData.Np());
    localcen.a(eu.ayR, paramAvatarBreedBinaryData.Nq());
    localcen.a(eu.azp, paramAvatarBreedBinaryData.Nr());
    localcen.a(eu.ayP, paramAvatarBreedBinaryData.Nk());
    localcen.a(eu.ayX, paramAvatarBreedBinaryData.Ns());

    return localcen;
  }
}