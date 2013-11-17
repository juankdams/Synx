import com.ankamagames.wakfu.client.binaryStorage.CannonBinaryData;

class bwf
  implements gd
{
  bwf(Lu paramLu)
  {
  }

  public void a(CannonBinaryData paramCannonBinaryData)
  {
    dlz localdlz = new dlz(paramCannonBinaryData.deE(), paramCannonBinaryData.gC(), paramCannonBinaryData.gw(), paramCannonBinaryData.cTq(), paramCannonBinaryData.Mc(), dFN.fI(paramCannonBinaryData.bjZ()));
    for (cwb localcwb : paramCannonBinaryData.deF()) {
      agv localagv = new agv(localcwb.getId(), (short)localcwb.anN(), localcwb.uL(), localcwb.arR(), localcwb.arS(), localcwb.arT());

      localdlz.a(localagv);
      localagv.b(Lu.b(localcwb.bpi()));
    }

    aot.dtv.a(localdlz);
  }
}