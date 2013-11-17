import com.ankamagames.wakfu.client.binaryStorage.DungeonBinaryData;

class dCR
  implements gd
{
  dCR(rl paramrl)
  {
  }

  public void a(DungeonBinaryData paramDungeonBinaryData)
  {
    int i = paramDungeonBinaryData.getId();
    short s1 = paramDungeonBinaryData.Qb();
    short s2 = paramDungeonBinaryData.nV();
    short s3 = paramDungeonBinaryData.Lk();

    PD localPD = new PD(i, s1, s2, s3, paramDungeonBinaryData.ctD());
    bGh.gCn.b(localPD);
  }
}