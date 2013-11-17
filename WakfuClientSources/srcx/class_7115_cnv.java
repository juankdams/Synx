import java.util.Comparator;

public abstract class cnv
{
  protected abstract void a(dbo paramdbo);

  protected abstract void c(dbo paramdbo);

  protected abstract void d(dbo paramdbo);

  protected abstract void a(dbo paramdbo, long paramLong);

  protected abstract void a(dbo paramdbo, long paramLong, int paramInt);

  protected abstract void b(dbo paramdbo, long paramLong);

  protected void a(cbQ paramcbQ, Comparator paramComparator)
  {
    long[] arrayOfLong1 = paramcbQ.cfv();
    paramcbQ.clear();
    for (long l : arrayOfLong1)
      a(paramcbQ, l, paramComparator);
  }

  protected void a(cbQ paramcbQ, long paramLong, Comparator paramComparator)
  {
    a(paramcbQ, paramLong, paramComparator, 0);
  }

  protected void a(cbQ paramcbQ, long paramLong, Comparator paramComparator, int paramInt) {
    while ((paramInt < paramcbQ.size()) && 
      (paramComparator.compare(Long.valueOf(paramLong), Long.valueOf(paramcbQ.get(paramInt))) >= 0)) {
      paramInt++;
    }

    paramcbQ.r(paramInt, paramLong);
  }
}