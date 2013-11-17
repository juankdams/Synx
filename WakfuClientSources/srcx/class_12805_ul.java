public abstract class ul extends bZA
{
  public static void a(dKY[] paramArrayOfdKY)
  {
    if (paramArrayOfdKY.length != 2)
      throw new ddQ("On essaie d'appliquer un opérateur booléen au mauvais nombre d'arguments ");
    for (dKY localdKY : paramArrayOfdKY)
      if (localdKY.aNE() != Pq.chw)
        throw new ddQ("On essaie d'appliquer un opérateur booléen à autre chose que des booléens...");
  }
}