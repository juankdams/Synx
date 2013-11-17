import com.ankamagames.wakfu.client.binaryStorage.HavenBagModelViewBinaryData;

class gV
  implements gd
{
  gV(aRF paramaRF)
  {
  }

  public void a(HavenBagModelViewBinaryData paramHavenBagModelViewBinaryData)
  {
    int i = paramHavenBagModelViewBinaryData.getId();
    boolean bool = paramHavenBagModelViewBinaryData.awu();
    if (i == 408) {
      bool = false;
    }
    cym localcym = new cym(i, paramHavenBagModelViewBinaryData.awt(), bool, (short)paramHavenBagModelViewBinaryData.awv(), paramHavenBagModelViewBinaryData.Wk());

    cbp.hsN.a(localcym);
  }
}