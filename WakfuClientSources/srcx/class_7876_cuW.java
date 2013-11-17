import java.util.ArrayList;

class cuW
  implements bPA
{
  cuW(bCP parambCP)
  {
  }

  public boolean a(int paramInt, dEE paramdEE)
  {
    dEE localdEE = new dEE(paramdEE);
    bCP.b(this.ifF).put(paramInt, localdEE);

    ArrayList localArrayList1 = paramdEE.dgh();
    int i = 0;
    Object localObject;
    for (int j = localArrayList1.size(); i < j; i++) {
      aiJ localaiJ1 = (aiJ)localArrayList1.get(i);

      localObject = localaiJ1.avx();
      dpg[] arrayOfdpg = new dpg[localObject != null ? localObject.length : 0];
      if (localObject != null) {
        for (int m = 0; m < localObject.length; m++) {
          dpg localdpg = localObject[m];
          arrayOfdpg[m] = new dpg(localdpg);

          cSi localcSi = (cSi)bCP.c(this.ifF).get(localdpg.getId());
          if (localcSi == null) {
            localcSi = new cSi();
            bCP.c(this.ifF).put(localdpg.getId(), localcSi);
          }
          localcSi.add(localaiJ1.getId());
        }
      }

      aiJ localaiJ2 = new aiJ(localaiJ1, localdEE, localObject != null ? arrayOfdpg : null);
      localdEE.c(localaiJ2);
      bCP.d(this.ifF).put(localaiJ2.getId(), localaiJ2);
    }

    ArrayList localArrayList2 = paramdEE.cfd();
    if ((localArrayList2 != null) && (!localArrayList2.isEmpty())) {
      j = 0; for (int k = localArrayList2.size(); j < k; j++) {
        localObject = (acg)localArrayList2.get(j);
        localdEE.a((acg)localObject);
      }
    }

    return true;
  }
}