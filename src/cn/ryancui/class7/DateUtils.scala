package cn.ryancui.class7

import java.text.SimpleDateFormat
import java.util.Calendar

/**
  * Created by Ryan on 2017/5/1.
  */
object DateUtils {

  // as "Thursday, November 29"
  def getCurrentDate: String = getCurrentDateTime("EEEE, MMMM d")

  // as "6:20 p.m."
  def getCurrentTime: String = getCurrentDateTime("K:m aa")

  // a common function used by other date/time functions
  private def getCurrentDateTime(dateTimeFormat: String): String = {
    val dateFormat = new SimpleDateFormat(dateTimeFormat)
    val cal = Calendar.getInstance()
    dateFormat.format(cal.getTime)
  }
}

object DateAndTime extends App{
  println(DateUtils.getCurrentDate)
  println(DateUtils.getCurrentTime)
}