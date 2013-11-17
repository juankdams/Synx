import com.ankamagames.wakfu.client.binaryStorage.BoatLinkBinaryData;

class bwg
  implements gd
{
  bwg(Lu paramLu)
  {
  }

  public void a(BoatLinkBinaryData paramBoatLinkBinaryData)
  {
    cPT localcPT = new cPT(paramBoatLinkBinaryData.getId(), paramBoatLinkBinaryData.getStart(), paramBoatLinkBinaryData.qV(), paramBoatLinkBinaryData.qW(), paramBoatLinkBinaryData.uL(), paramBoatLinkBinaryData.deL(), paramBoatLinkBinaryData.cGY());
    aot.dtv.a(localcPT);
    localcPT.b(Lu.b(paramBoatLinkBinaryData.bpi()));
  }
}