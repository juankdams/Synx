import com.ankamagames.wakfu.client.binaryStorage.AvatarBreedBinaryData;
import org.apache.log4j.Logger;

class axx
  implements gd
{
  axx(bDH parambDH)
  {
  }

  public void a(AvatarBreedBinaryData paramAvatarBreedBinaryData)
  {
    int i = paramAvatarBreedBinaryData.getId();
    SB localSB = SB.gG(i);
    if (localSB == null) {
      bDH.ch().error("Tentative d'initialiser une breed inconnue " + i);
      return;
    }
    localSB.a(bDH.c(paramAvatarBreedBinaryData));
    agt.arQ().aZ(localSB.uO(), paramAvatarBreedBinaryData.Ng());
  }
}