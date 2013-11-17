public class bXW
{
  public static String k(cds paramcds)
  {
    return cHO.cCa().getString("durationFormat.yearMonthDayHourMinuteSecond.veryShort", new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(paramcds.getDays()), Integer.valueOf(paramcds.getHours()), Integer.valueOf(paramcds.getMinutes()), Integer.valueOf(paramcds.getSeconds()) });
  }

  public static String l(cds paramcds) {
    return cHO.cCa().getString("durationFormat.yearMonthDayHourMinuteSecond.short", new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(paramcds.getDays()), Integer.valueOf(paramcds.getHours()), Integer.valueOf(paramcds.getMinutes()), Integer.valueOf(paramcds.getSeconds()) });
  }

  public static String m(cds paramcds) {
    return cHO.cCa().getString("dateFormat.yearMonthDayHourMinuteSecond", new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(paramcds.getDays()), Integer.valueOf(paramcds.getHours()), Integer.valueOf(paramcds.getMinutes()), Integer.valueOf(paramcds.getSeconds()) });
  }
}